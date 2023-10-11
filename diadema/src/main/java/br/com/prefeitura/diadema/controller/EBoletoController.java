package br.com.prefeitura.diadema.controller;

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
import br.com.prefeitura.diadema.dto.DtoInscricao;
import br.com.prefeitura.diadema.dto.InscricaoMunicipal;
import br.com.prefeitura.diadema.dto.Logradouro;
import br.com.prefeitura.diadema.dto.RetornoDto;
import br.com.prefeitura.diadema.model.PmdBoleto;
import br.com.prefeitura.diadema.model.PmdLogs;
import br.com.prefeitura.diadema.service.LogsService;
import br.com.prefeitura.diadema.ws.EgataBoletoWS;
import br.com.prefeitura.diadema.ws.EgataInscricaoWS;

@RestController
@RequestMapping("/api/diadema/eboleto")
public class EBoletoController {

	private EgataBoletoWS egataWs;
	
	
	private LogsService logsService;


	@GetMapping("/hello")
	public String sayHello() {
		return "Gerador E_BOLETO";
	}
	
	@Autowired
    public EBoletoController(EgataBoletoWS egataWs,LogsService logsService) {
        this.egataWs = egataWs;  
        this.logsService = logsService;
    }
	
	@GetMapping(value = "/consultarBoleto/{tipo}/{numeroProcesso}/{anoProcesso}")
	public ResponseEntity<?> consultarBoleto(
			@PathVariable("tipo") String tipo,
			@PathVariable("numeroProcesso") Long numeroProcesso,
			@PathVariable("anoProcesso") Integer ano){
		PmdLogs log = logsService.info("consultarBoleto", tipo,numeroProcesso,ano );
		
		try{
			PmdBoleto boleot = egataWs.consultarSituacaoBoletoPorNumeroProtocolo(numeroProcesso, tipo, ano);
			return new ResponseEntity<PmdBoleto>(boleot, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			
			return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
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
		PmdLogs log = logsService.info("lancarTaxaDiversars", orgao,numeroProcesso,ano,tipoContribuinte,inscricao );
		RetBoleto fileBoelto;
		try{
			fileBoelto = egataWs.lancarTaxaHomologacao(orgao, numeroProcesso, ano, codigoTaxa,0d, quantidadeTaxa ,tipoContribuinte,inscricao,observacao);
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
