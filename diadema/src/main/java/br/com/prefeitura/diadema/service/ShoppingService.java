package br.com.prefeitura.diadema.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.shopping.DtoJsonDados;
import br.com.prefeitura.diadema.dto.shopping.DtoShopping;
import br.com.prefeitura.diadema.enumerador.EnumShoppingSituacao;
import br.com.prefeitura.diadema.model.PmdShoppingPopular;
import br.com.prefeitura.diadema.model.PmdShoppingPopularConfiguracao;
import br.com.prefeitura.diadema.repository.ShoppingPopularConfiguracaoRepository;
import br.com.prefeitura.diadema.repository.ShoppingPopularRepository;
import br.com.prefeitura.diadema.util.CalcularRanking;
import br.com.prefeitura.diadema.util.ConverterDtoJson;

/**
 * Desenvolvimento do shopping popular
 * @author anderson.oliveira
 *
 */
@Service
public class ShoppingService {
	
	ShoppingPopularRepository daoShopping;
	ShoppingPopularConfiguracaoRepository daoShoppingConfiguracao;

	@Autowired
	public ShoppingService(ShoppingPopularRepository daoShopping, ShoppingPopularConfiguracaoRepository daoShoppingConfiguracao){; 
		this.daoShopping = daoShopping;
		this.daoShoppingConfiguracao = daoShoppingConfiguracao;
	}

	
	public String verificarInscricaoEstaAberta() {
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();
		int mesAtual = dataAtual.getMonthValue();
		
		PmdShoppingPopularConfiguracao configuracao = daoShoppingConfiguracao.findById(anoAtual).get();
		
		if(mesAtual == configuracao.getMesAbertura()){
			return "true";
		}
		return "false";
	}

	public String verificarSeExisteUmProcessoAberto(String cpf) {
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();

		// Verficar se o usuario ja tem cadastro no sistema
		List<PmdShoppingPopular> retShopping = daoShopping.consultarSeExisteProcessoEmAndamento(cpf, anoAtual);

		if (retShopping.size() > 0) {
			if (retShopping.get(0).getIcSituacao() == EnumShoppingSituacao.EXECUTANDO) {
				return "O Usuário ja possui um processo aguardando a analise do processo sobre o número "
						+ retShopping.get(0).getNuProcessoFormatado();
			}

			if (retShopping.get(0).getIcSituacao() == EnumShoppingSituacao.APROVADO) {
				return "O Usuário já possui um processo aprovado sobre o número "
						+ retShopping.get(0).getProcesso();
			}
			return "Algo errado aconteceu, não foi possivel cadastrar - "
					+ retShopping.get(0).getIcSituacao();
		}
		//Não alterar essa mensagem para não atrabalhar o formulario do solar
		return "não foi encontrado duplicidade";
	}
	
	 public int calcularIdade(String dataNascimento) {
	        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate dataNascimentoLocalDate = LocalDate.parse(dataNascimento, formato);
	        LocalDate dataAtual = LocalDate.now();
	        
	        return Period.between(dataNascimentoLocalDate, dataAtual).getYears();
	    }

	public String enviarDadosShoppingPopular(DtoShopping shooping) {
		
		//Verifficar se o usuario nao esta utilizando o sistmea
		String retonro = verificarSeExisteUmProcessoAberto(shooping.getCpf());
		if(!retonro.contains("não foi encontrado duplicidade")){
			return retonro;
		}
		
		// Realizar o parse
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();
		
		//Calcular os dados
		DtoJsonDados dt = shooping.getJsonDados();
		dt.setDataInclusao(new Date());
		dt.setIdade(calcularIdade(dt.getDtNascimento()));
		
		
		
		PmdShoppingPopular shoppingPopular = new PmdShoppingPopular();
		shoppingPopular.setAno(anoAtual); // dados Fixo
		shoppingPopular.setCpf(shooping.getCpf());
		shoppingPopular.setIcSituacao(EnumShoppingSituacao.EXECUTANDO); // dados Fixo
		shoppingPopular.setNome(shooping.getNome());
		//shoppingPopular.setProcesso(shoppingPopular.getNuProcessoFormatado());
		
		
		String texto = ConverterDtoJson.json(shooping.getJsonDados());
	//	texto = texto.replaceAll("\\r|\\n", "");
		shoppingPopular.setJsonDosDados(texto);
		System.out.println(texto);
		shoppingPopular.setProcesso(shooping.getProcesso());
		shoppingPopular.setNuProcessoFormatado(shooping.getNuProcessoFormatado());
		
		//shoppingPopular.setCriterioDeDesempate(0L);
		//shoppingPopular.setCriterioDePontuacao(0);
		//Salvar
		daoShopping.save(shoppingPopular);
		return null;
	}
	
	
	
	
	
	public String avaliacaoDoUsuario(DtoShopping dto) {
		
		PmdShoppingPopular dado = daoShopping.findById(dto.getProcesso()).get();
		dado.setIcSituacao(dto.getIcSituacao());
		
		if(dto.getParecer().equals("A")){
			LocalDate dataAtual = LocalDate.now();
			int anoAtual = dataAtual.getYear();
			
			PmdShoppingPopularConfiguracao configuracao = daoShoppingConfiguracao.findById(anoAtual).get();
			
			CalcularRanking c = new CalcularRanking(dado.getJsonDosDados(), configuracao.getSalarioMinimo());
			int pontuacao = c.calcularPontuacao();
			Long pontuacaoDesempate = c.calcularPontuacaoCriterioParaDesempate();
			
			dado.setCriterioDeDesempate(pontuacaoDesempate);
			dado.setCriterioDePontuacao(pontuacao);
			dado.setIcSituacao(EnumShoppingSituacao.APROVADO);
			daoShopping.save(dado);
			
			List<PmdShoppingPopular> listar = daoShopping.listarRankingPelPontuacaoPorAno(anoAtual);
			
			int pos = 1;
			for(PmdShoppingPopular t : listar){
				t.setPosicao(pos);
				daoShopping.save(t);
				pos ++;
			}
		}
		
		if(dto.getParecer().equals("R")){
			dado.setCriterioDeDesempate(-1L);
			dado.setCriterioDePontuacao(-1);
			dado.setIcSituacao(EnumShoppingSituacao.REPROVADO);		
			daoShopping.save(dado);
		}
		
		if(dto.getParecer().equals("C")){
			dado.setCriterioDeDesempate(-1L);
			dado.setCriterioDePontuacao(-1);
			dado.setIcSituacao(EnumShoppingSituacao.CANCELADO);	
			daoShopping.save(dado);
		}
		return "sucesso";
	}	
}
