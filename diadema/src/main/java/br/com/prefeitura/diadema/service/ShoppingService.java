package br.com.prefeitura.diadema.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.shopping.DtoJsonDados;
import br.com.prefeitura.diadema.dto.shopping.DtoShopping;
import br.com.prefeitura.diadema.enumerador.EnumShoppingSituacao;
import br.com.prefeitura.diadema.enumerador.EnumSimNao;
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

	public static void main(String args[]){
		
	}

	public Boolean verificarInscricaoEstaAberta() {
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();
		int mesAtual = dataAtual.getMonthValue() + 1;
		
		PmdShoppingPopularConfiguracao configuracao = daoShoppingConfiguracao.findById(anoAtual).get();
		
		if(mesAtual == configuracao.getMesAbertura()){
			return true;
		}
		return false;
	}

	public String verificarSeExisteUmProcessoAberto(String cpf) {
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();

		// Verficar se o usuario ja tem cadastro no sistema
		List<PmdShoppingPopular> retShopping = daoShopping
				.consultarSeExisteProcessoEmAndamento(cpf, anoAtual);

		if (retShopping.size() > 0) {
			if (retShopping.get(0).getIcSituacao() == EnumShoppingSituacao.EXECUTANDO) {
				return "O Usuário ja possui um processo aguardando a analise do processo sobre o número "
						+ retShopping.get(0).getProcesso();
			}

			if (retShopping.get(0).getIcSituacao() == EnumShoppingSituacao.CONCLUIDO) {
				return "O Usuário já possui um processo concluido sobre o número "
						+ retShopping.get(0).getProcesso();
			}
			return "Algo errado aconteceu, não foi possivel cadastrar - "
					+ retShopping.get(0).getIcSituacao();
		}
		return null;
	}

	public String enviarDadosShoppingPopular(DtoShopping shooping) {
		//veriricar se é permitido
		
		if(!verificarInscricaoEstaAberta()){
			return "Não é possivel realizar o cadastro no momento, solicitação não foi aberta";
		}
		
		//Verifficar se o usuario nao esta utilizando o sistmea
		String retonro = verificarSeExisteUmProcessoAberto(shooping.getCpf());
		if(retonro != null){
			return retonro;
		}
		
		// Realizar o parse
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();
		
		PmdShoppingPopular shoppingPopular = new PmdShoppingPopular();
		shoppingPopular.setAno(anoAtual); // dados Fixo
		shoppingPopular.setCpf(shooping.getCpf());
		shoppingPopular.setIcSituacao(EnumShoppingSituacao.EXECUTANDO); // dados Fixo
		shoppingPopular.setNome(shooping.getNome());
		shoppingPopular.setJsonDosDados(shooping.getJsonDados());
		//shoppingPopular.setCriterioDeDesempate(0L);
		//shoppingPopular.setCriterioDePontuacao(0);
		//Salvar
		daoShopping.save(shoppingPopular);
		return null;
	}
	
	
	public String avaliacaoDoUsuario(DtoShopping dto) {
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();
		
		
		PmdShoppingPopular dado = daoShopping.consultaUsuario(dto.getCpf(), anoAtual);
		dado.setIcSituacao(dto.getIcSituacao());
		
		
		if(dto.getAprovado() == EnumSimNao.NAO){
			dado.setCriterioDeDesempate(-1L);
			dado.setCriterioDePontuacao(-1);
			dado.setIcSituacao(EnumShoppingSituacao.CANCELADO);
			
			return "";
		}else{
			CalcularRanking c = new CalcularRanking(dado.getJsonDosDados());
			int pontuacao = c.calcularPontuacao();
			Long pontuacaoDesempate = c.calcularPontuacaoCriterioParaDesempate();

			
			dado.setCriterioDeDesempate(pontuacaoDesempate);
			dado.setCriterioDePontuacao(pontuacao);
			dado.setIcSituacao(EnumShoppingSituacao.CONCLUIDO);
		}
		
		daoShopping.save(dado);
		
		return "sucesso";
	}
}
