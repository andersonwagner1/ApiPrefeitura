package br.com.prefeitura.diadema.controller;

import oracle.jdbc.proxy.annotation.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.dto.RetornoDto;
import br.com.prefeitura.diadema.dto.shopping.DtoJsonDados;
import br.com.prefeitura.diadema.dto.shopping.DtoShopping;
import br.com.prefeitura.diadema.model.PmdLogs;
import br.com.prefeitura.diadema.service.LogsService;
import br.com.prefeitura.diadema.service.ShoppingService;
import br.com.prefeitura.diadema.util.CalcularRanking;


@RestController
@RequestMapping("/api/diadema/shopping")
public class ShoppingController {
	
	//AVISO: desenvolver a tabela de pontuação para fazer alterar os valores (proncipalmente o salario minimo)
	// criar a tabela de classifação do usuario, não mostrar a posiçao

		
	private LogsService logsService;
	
	private ShoppingService shoppingService;


	@GetMapping("/hello")
	public String sayHello() {
		return "Gerador shopping";
	}
	
	@Autowired
    public ShoppingController(ShoppingService shoppingService, LogsService logsService) {
		this.shoppingService = shoppingService;
		this.logsService = logsService;
    }
	
	
	/**
	 * Verifique se esta no periodo de inscrição retorna true caso positivo e false caso negativo
	 * @return
	 */
	@GetMapping(value = "/processo-habilidado")
	public ResponseEntity<String> verificarSeeEstaNoPeriodoInscricao() {
		
		
		try{
			String aberto = shoppingService.verificarInscricaoEstaAberta();
			
			return new ResponseEntity<String>(aberto, HttpStatus.OK);
		}catch(Exception e){
			//logsService.falha(log, e.getMessage());
			return new ResponseEntity<String>("false", HttpStatus.OK);
		}		
	}
	
	
	
	
	/**
	 * Verifica se o usuario ja tem cadastro aberto no sistema antes de abrir um outro se existir um cadastro aberto o sistema deve informar o numero do processo.
	 * @param cpf
	 * @return retorna null, para informar ao usuario esta pronto para inicar o cadastro, ou outro texto caso ocorrar alguma duplicidade
	 */ 
	@GetMapping(value = "/consultar-processo/{cpf}")
	public ResponseEntity<String> consultarProcessoAbertoNesteAno(
			@PathVariable("cpf") String cpf) {
		
		//PmdLogs log = logsService.infoJson("consultarProcessoAbertoNesteAno", cpf);
		try{
			String mensagem = shoppingService.verificarSeExisteUmProcessoAberto(cpf);
			return new ResponseEntity<String>(mensagem, HttpStatus.OK);
		}catch(Exception e){
		//	logsService.falha(log, e.getMessage());
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}		
	}
	
	
	/**
	 * Envia dados para a tabela auxiliar para garantir que o usuario não esteja duplicado os dados, 
	 * as informação que sera cadatrada serão apenas dados que o usuario enviou (sem anexos)
	 * EM_ANDAMENTO - ESTA EM ANDAMENTO						- NÃO ODE ABRIR OUTRO (SE QUISER ABRIRU OUTRO TEM QUE CANCELAR ESTE)
	 * REPROVADO|CANCELADO - O PROCESSO TERÁ QUE SER REFEITO			- PODE ABRIR OUTRO
	 * APROVADO - FINALIZADO, O USUARIO NÃO PODE REFAZER	- NÃO PODE ABRIR OUTRO
	 * @param inscricao
	 * @return
	 */
	@PostMapping("/enviar-dados")
	public ResponseEntity<RetornoDto<String>> enviarDadosParaEvitarDuplicadao(@RequestBody DtoShopping shopping) {
		PmdLogs log = logsService.infoJson("enviarDadosParaEvitarDuplicadao", shopping);
		try{
			String dt = shoppingService.enviarDadosShoppingPopular(shopping);
			
			RetornoDto<String> ret = new RetornoDto<String>();
			
			if(dt == null){
				ret.setRetorno(1);
				ret.setDescricao("Sucesso");
				
			}else{
				ret.setRetorno(0);
				ret.setDescricao(dt);
				
			}
			return new ResponseEntity<RetornoDto<String>>(ret, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			RetornoDto<String> ret = new RetornoDto<String>();
			ret.setDescricao(ex.getMessage());
			ret.setRetorno(0);
			//ret.setObjeto(-1L);
			return new ResponseEntity<RetornoDto<String>>(ret, HttpStatus.OK);
		}
	}
	
	
	
	
	/**
	 * Esse parecer serve para atualizar os dados da avaliação, ira atualizar assim que o o processo for cancelado ou quando o processo for aprovado
	 * @param shopping
	 * @return
	 */	
	@PostMapping(value = "/parecer")
	public ResponseEntity<String> avaliacaoDoUsuario(@RequestBody DtoShopping parecer)  {
		
		PmdLogs log = logsService.infoJson("avaliacaoDoUsuario", parecer);
		try{
			String mensagem = shoppingService.avaliacaoDoUsuario(parecer);
			return new ResponseEntity<String>(mensagem, HttpStatus.OK);
		}catch(Exception e){
			logsService.falha(log, e.getMessage());
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}		
	}
	
	@PostMapping(value = "/calcular")
	public ResponseEntity<String> avaliacaoDoUsuario(@RequestBody DtoJsonDados parecer)  {
		CalcularRanking c = new CalcularRanking(parecer, 1412.0);
		int pontuacao = c.calcularPontuacao();
		Long pontuacaoDesempate = c.calcularPontuacaoCriterioParaDesempate();
		
		
		
		
		return null;
		
	}
	
	
	
	/**
	 * Realiza o calculo da pontuação do usuarios, em seguinda o sistema ira realizar um update da ordem da tabela
	 * @param ano
	 * @return
	 */
/*	@GetMapping(value = "/calcular/{ano}")
	public ResponseEntity<Boolean> calcular(@PathVariable("ano") Integer ano) {
		PmdLogs log = logsService.infoJson("calcular", ano);
		try{
			
			shoppingService.realizarCalculoEAtualizarLista(ano);
			
			return new ResponseEntity<Boolean>(true, HttpStatus.OK);
		}catch(Exception e){
			logsService.falha(log, e.getMessage());
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}
		
	}*/
	
	
	/**
	 * Lista de classificação dos usuarios (fazer por ultimo), para gerar o relatorio
	 * @param ano
	 * @return
	 */
	/*@GetMapping(value = "/classificacao/{ano}")
	public ResponseEntity<List<String[]>> classficaoca(@PathVariable("ano") Integer ano) {
		List<String[]> classificacao = null;
		try{
			 classificacao = shoppingService.classificacao(ano);
			return new ResponseEntity<List<String[]>>(classificacao, HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<List<String[]>>(classificacao, HttpStatus.OK);
		}
	}
	*/
	
	
	
}
