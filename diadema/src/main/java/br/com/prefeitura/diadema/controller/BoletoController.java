package br.com.prefeitura.diadema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.boleto.RetBoleto;
import br.com.prefeitura.diadema.model.PmdBoleto;
import br.com.prefeitura.diadema.service.BoletoHmgService;


/**
 * Controle para realizar chamada de taxa e gerar boletos
 * 
 * Serviço(s) chamado(s): boleto
 * Classe util: Stella = sistema que gera boleto
 * webservices :
 * 
 * @author anderson.oliveira
 *
 */
@RestController
@RequestMapping("/api/diadema/boleto")
public class BoletoController {

	private BoletoHmgService boletoService;

	/**
	 * Sistema de teste para chamada de metodo
	 * @return
	 */
	@GetMapping("/hello")
	public String sayHello() {
		return "Gerador boleot";
	}
	
	@Autowired
    public BoletoController(BoletoHmgService boletoService) {
        this.boletoService = boletoService;      
    }
	
	
	/**
	 * Metodo para realizar a chamada de consulta boleto pelo numero do processo do eprocesso, o sistema ira realizar a busca pelo nunero do processo
	 * em seguinda ira consultar na tabela auxiliar pmd_boleto se este boleto esta cadastrado
	 * depois ira pegar o numero do processo (numero do boleto), para consultar na webservice 
	 * @param tipo tipo da inscrição 1 = cmc, 2 = inscrição e 3 = outros
	 * @param numeroProcesso numero do processo para realizar a busca
	 * @param ano = ano do processo
	 * @return 
	 * BOLETO_INVALIDO = a busca do protocolo não foi encontrado, ou numero invalido
	 * BOLETO_VENCIDO = boleto com data vencida
	 * BOLETO_PAGO = situação do boleto foi paga
	 * BOLETO_EM_ANDAMENTO = aguardando pagamento
	 * 
	 */
	@GetMapping(value = "/consultarBoletoHmg/{tipo}/{numeroProcesso}/{anoProcesso}")
	public ResponseEntity<PmdBoleto> consultarBoletoHmg(
			@PathVariable("tipo") String tipo,
			@PathVariable("numeroProcesso") Long numeroProcesso,
			@PathVariable("anoProcesso") Integer ano){
		
		PmdBoleto boleot = boletoService.consultarSituacaoBoletoPorNumeroProtocolo(numeroProcesso, tipo, ano);
		return new ResponseEntity<PmdBoleto>(boleot, HttpStatus.OK);
	}
	
	
	/**
	 * Realizar o lancamento do boleto, o sistema realizar o cadastro do registro do boleto pegando a informação do numero do protocolo do eprocesso e salva na tabela
	 * pmd_boleto, em seguinda as informações do boleto e enviado para a webservice lancamento da nota
	 * @param orgao
	 * @param numeroProcesso
	 * @param ano
	 * @param codigoTaxa
	 * @param tipoContribuinte
	 * @param inscricao
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value = "/lancarNotaHmg2/{orgao}/{numeroProcesso}/{ano}/{codigoTaxa}/{tipoContribuinte}/{inscricao}")
	public ResponseEntity<RetBoleto> lancarTaxaDiversars(
			@PathVariable("orgao") String orgao,
			@PathVariable("numeroProcesso") Long numeroProcesso,
			@PathVariable("ano") Integer ano,
			@PathVariable("codigoTaxa") Integer codigoTaxa,
			@PathVariable("tipoContribuinte")Integer tipoContribuinte, 
			@PathVariable("inscricao")Long inscricao) throws Exception
			{
		RetBoleto fileBoelto = boletoService.lancarTaxaHomologacao(orgao, numeroProcesso, ano, codigoTaxa,0.0, 1 ,tipoContribuinte,inscricao,"Prefeitura de diadema");
		
		return new ResponseEntity<RetBoleto>(fileBoelto, HttpStatus.OK);
	}
	
	
	@Deprecated
	@GetMapping(value = "/lancarNotaHmg/{orgao}/{numeroProcesso}/{ano}/{codigoTaxa}/{valorTaxa}/{quantidadeTaxa}/{tipoContribuinte}/{inscricao}/{observacao}")
	public ResponseEntity<RetBoleto> lancarTaxaDiversars(
			@PathVariable("orgao") String orgao,
			@PathVariable("numeroProcesso") Long numeroProcesso,
			@PathVariable("ano") Integer ano,
			@PathVariable("codigoTaxa") Integer codigoTaxa,
			@PathVariable("valorTaxa")Double valorTaxa,
			@PathVariable("quantidadeTaxa")Integer quantidadeTaxa, 
			@PathVariable("tipoContribuinte")Integer tipoContribuinte, 
			@PathVariable("inscricao")Long inscricao, 
			@PathVariable("observacao")String observacao) throws Exception
			{
		RetBoleto fileBoelto = boletoService.lancarTaxaHomologacao(orgao, numeroProcesso, ano, codigoTaxa,valorTaxa, quantidadeTaxa ,tipoContribuinte,inscricao,observacao);
		
		return new ResponseEntity<RetBoleto>(fileBoelto, HttpStatus.OK);
	}
	

}
