package br.com.prefeitura.diadema.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.boleto.RetBoleto;
import br.com.prefeitura.diadema.dto.Taxa;
import br.com.prefeitura.diadema.dto.TaxaDiversas;
import br.com.prefeitura.diadema.model.PmdBoleto;
import br.com.prefeitura.diadema.model.PmdLogs;
import br.com.prefeitura.diadema.service.BoletoHmgService;
import br.com.prefeitura.diadema.service.LogsService;
import br.com.prefeitura.diadema.util.ConverterDtoJson;


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
@RequestMapping("/api/diadema/excluidoBoleto")
public class BoletoPrdController {

	private BoletoHmgService boletoService;
	private LogsService logsService;

	/**
	 * Sistema de teste para chamada de metodo
	 * @return
	 */
	@GetMapping("/helloPrd")
	public String sayHello() {
		return "Gerador boleot";
	}
	
	@Autowired
    public BoletoPrdController(BoletoHmgService boletoService, LogsService logsService) {
        this.boletoService = boletoService;  
        this.logsService = logsService;
    }
	
	
	
	/*@GetMapping(value = "/consultarNumeroBoleto/{tipo}/{numeroProcesso}/{anoProcesso}/{numeroBoleto}")
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
	}*/
	//não realizar consuta na webservice
	@GetMapping(value = "/consultarBoleto/{tipo}/{numeroProcesso}/{anoProcesso}")
	public ResponseEntity<?> consultarBoletoHmg(
			@PathVariable("tipo") String tipo,
			@PathVariable("numeroProcesso") Long numeroProcesso,
			@PathVariable("anoProcesso") Integer ano){
		PmdLogs log = logsService.info("consultarBoleto", tipo,numeroProcesso,ano );
		
		try{
			PmdBoleto boleot = boletoService.consultarSituacaoBoletoPorNumeroProtocolo(numeroProcesso, tipo, ano);
			return new ResponseEntity<PmdBoleto>(boleot, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}		
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
	/*@GetMapping(value = "/lancarNota/{orgao}/{numeroProcesso}/{ano}/{codigoTaxa}/{tipoContribuinte}/{inscricao}")
	public ResponseEntity<RetBoleto> lancarTaxaDiversars(
			@PathVariable("orgao") String orgao,
			@PathVariable("numeroProcesso") Long numeroProcesso,
			@PathVariable("ano") Integer ano,
			@PathVariable("codigoTaxa") Integer codigoTaxa,
			@PathVariable("tipoContribuinte")Integer tipoContribuinte, 
			@PathVariable("inscricao")Long inscricao) throws Exception
			{
		
		
		
		PmdLogs log = logsService.info("lancarNota", orgao,numeroProcesso,ano,tipoContribuinte,inscricao );
		RetBoleto fileBoelto;
		try{
			fileBoelto = boletoService.lancarTaxaHomologacao(orgao, numeroProcesso, ano, codigoTaxa,0.0, 1 ,tipoContribuinte,inscricao,"Prefeitura de diadema");
			return new ResponseEntity<RetBoleto>(fileBoelto, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			fileBoelto = new RetBoleto();
			fileBoelto.setSucesso(false);
			fileBoelto.setResultado(ex.getMessage());
			logsService.falha(log, ex.getMessage());
			return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		
		
	}*/
	
	@PostMapping(value = "/lancarNota")
	public ResponseEntity<RetBoleto> lancarTaxasDiversasParametrizado(@RequestBody TaxaDiversas taxaDiversas)throws Exception{
		
		//a classe TaxasDiversas tem valores padrões, verifique a classe

		PmdLogs log = logsService.infoJson("lancarTaxasDiversasParametrizado", taxaDiversas);
		RetBoleto fileBoelto;
		try{
			fileBoelto = boletoService.lancarTaxa(taxaDiversas);
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
	
	
	

	@GetMapping(value = "/lancarNota/{orgao}/{numeroProcesso}/{ano}/{codigoTaxa}/{valorTaxa}/{quantidadeTaxa}/{tipoContribuinte}/{inscricao}/{observacao}")
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
		
		
		observacao = "BOLETO REFERENTE TAXA DE PROCESSOS ADMINISTRATIVO - PAGAR A PARTIR DO DIA SEGUINTE A DA DE EMISSAO.";
		
		StringBuffer s = new StringBuffer();
		s.append("Processo: " + orgao + " " + numeroProcesso + "/" + ano);
		s.append(" Taxa: [" + codigoTaxa + "]");
		s.append(" Valor: [" + valorTaxa + "] ");
		s.append(" quantidadeTaxa: [" + quantidadeTaxa + "] ");
		s.append(" Contribuinte: [" + tipoContribuinte + "] " + inscricao);
		s.append(" observacao: [" + observacao + "] ");
		
		PmdLogs log = logsService.info("LancarTaxaDiversas", s.toString());
		RetBoleto fileBoelto;
		try{
			fileBoelto = boletoService.lancarTaxaHomologacao(orgao, numeroProcesso, ano, codigoTaxa,0d, quantidadeTaxa ,tipoContribuinte,inscricao,observacao);
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
