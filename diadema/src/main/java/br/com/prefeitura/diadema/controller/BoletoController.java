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
import br.com.prefeitura.diadema.model.PmdLogs;
import br.com.prefeitura.diadema.service.BoletoHmgService;
import br.com.prefeitura.diadema.service.LogsService;


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
@RequestMapping("/api/diadema/boletoExcluido")
public class BoletoController {

	private BoletoHmgService boletoService;
	private LogsService logsService;

	/**
	 * Sistema de teste para chamada de metodo
	 * @return
	 */
	@GetMapping("/hello")
	public String sayHello() {
		return "Gerador boleot";
	}
	
	@Autowired
    public BoletoController(BoletoHmgService boletoService, LogsService logsService) {
        this.boletoService = boletoService;  
        this.logsService = logsService;
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
	public ResponseEntity<?> consultarBoletoHmg(
			@PathVariable("tipo") String tipo,
			@PathVariable("numeroProcesso") Long numeroProcesso,
			@PathVariable("anoProcesso") Integer ano){
		PmdLogs log = logsService.info("consultarBoletoHmg", tipo,numeroProcesso,ano );
		
		try{
			PmdBoleto boleot = boletoService.consultarSituacaoBoletoPorNumeroProtocolo(numeroProcesso, tipo, ano);
			return new ResponseEntity<PmdBoleto>(boleot, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}		
	}
	
	
	
	
/*	@GetMapping(value = "/consultarNumeroBoleto/{tipo}/{numeroProcesso}/{anoProcesso}/{numeroBoleto}")
	public ResponseEntity<?> consultarNumeroBoleto(
			@PathVariable("tipo") String tipo,
			@PathVariable("numeroProcesso") Long numeroProcesso,
			@PathVariable("anoProcesso") Integer ano,
			@PathVariable("numeroBoleto") Integer numeroBoleto){
		PmdLogs log = logsService.info("consultarNumeroBoleto", tipo,numeroBoleto,ano,numeroBoleto);
		
		try{
			PmdBoleto boleot = boletoService.consultarSituacaoBoletoPorNumeroProtocolo(numeroProcesso, tipo, ano);
			return new ResponseEntity<PmdBoleto>(boleot, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}		
	}
	*/
	
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
	@GetMapping(value = "/lancarNota/{orgao}/{numeroProcesso}/{ano}/{codigoTaxa}/{tipoContribuinte}/{inscricao}")
	public ResponseEntity<RetBoleto> lancarTaxaDiversars(
			@PathVariable("orgao") String orgao,
			@PathVariable("numeroProcesso") Long numeroProcesso,
			@PathVariable("ano") Integer ano,
			@PathVariable("codigoTaxa") Integer codigoTaxa,
			@PathVariable("tipoContribuinte")Integer tipoContribuinte, 
			@PathVariable("inscricao")Long inscricao) throws Exception
			{
		
		StringBuffer s = new StringBuffer();
		s.append("Processo: " + orgao + " " + numeroProcesso + "/" + ano);
		s.append(" Taxa: " + codigoTaxa);
		s.append(" Contribuinte: [" + tipoContribuinte + "] " + inscricao);
		
		PmdLogs log = logsService.info("lancarNota", s.toString());
		RetBoleto fileBoelto;
	try{																															
			fileBoelto = boletoService.lancarTaxaHomologacao(orgao, numeroProcesso, ano, codigoTaxa,0.0, 1 ,tipoContribuinte,inscricao,"BOLETO REFERENTE A TAXA DE PROCESSO ADMINISTRATIVO - PAGAR A PARTIR DO DIA SEGUINTE A DATA DA EMISSÃO. NÃO PAGAR APÓS A DATA DE VENCIMENTO.");
			return new ResponseEntity<RetBoleto>(fileBoelto, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			fileBoelto = new RetBoleto();
			fileBoelto.setSucesso(false);
			fileBoelto.setResultado(ex.getMessage());
			logsService.falha(log, ex.getMessage());
			return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		
		
	}
										///PMD	/1/				2028/		122/		0/1/2/1206600102/observcao
	
	@Deprecated
	@GetMapping(value = "/lancarNotaHmg/{orgao}/{numeroProcesso}/{ano}/{codigoTaxa}/{valorTaxa}/{quantidadeTaxa}/{tipoContribuinte}/{inscricao}/{observacao}")
	public ResponseEntity<RetBoleto> lancarTaxaDiversarsHMG(
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
		
		
		PmdLogs log = logsService.info("lancarTaxaDiversars Hmg", orgao,numeroProcesso,ano,tipoContribuinte,inscricao );
		RetBoleto fileBoelto;
		try{
			fileBoelto = boletoService.lancarTaxaHomologacao(orgao, numeroProcesso, ano, codigoTaxa,0d, quantidadeTaxa ,tipoContribuinte,inscricao,"BOLETO REFERENTE A TAXA DE PROCESSO ADMINISTRATIVO - PAGAR A PARTIR DO DIA SEGUINTE A DATA EMISSÃO. NÃO PAGAR APÓS A DATA DE VENCIMENTO.");
			//fileBoelto = boletoService.lancarTaxaHomologacao(orgao, numeroProcesso, ano, codigoTaxa,0d, quantidadeTaxa ,tipoContribuinte,inscricao,observacao);
			return new ResponseEntity<RetBoleto>(fileBoelto, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			fileBoelto = new RetBoleto();
			fileBoelto.setSucesso(false);
			
			fileBoelto.setResultado(ex.getMessage());
			return new ResponseEntity(fileBoelto, HttpStatus.BAD_REQUEST);
		}
		
		
	}
}
