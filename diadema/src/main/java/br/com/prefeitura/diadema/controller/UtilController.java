package br.com.prefeitura.diadema.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.boleto.RetBoleto;
import br.com.prefeitura.diadema.model.PmdBoleto;
import br.com.prefeitura.diadema.service.BoletoService;

@Deprecated
@RestController
@RequestMapping("/api/diadema/utilEXCLUIDO")
public class UtilController {
	
	
	
	
	private final BoletoService boletoService;
	
	
	
	
	
	@Autowired
    public UtilController(BoletoService boletoService) {
        this.boletoService = boletoService;      
    }
	
	
	
	
	
	 @GetMapping("/hello")
	    public String sayHello() {
	        return "gerar boelto Teste 207";
	    }
	 
	 
	 @Deprecated
	@GetMapping(value = "/gerarBoletoHomologacao/{numeroRegistro}")
	public ResponseEntity<RetBoleto> gerarBoletoHomologacao(@PathVariable("numeroRegistro") Long numeroRegistro) throws SQLException{
		RetBoleto fileBoelto = boletoService.executarHmg(numeroRegistro);
		return new ResponseEntity<RetBoleto>(fileBoelto, HttpStatus.OK);
	}
	
	
	@Deprecated
	@GetMapping(value = "/gerarBoleto/{numeroRegistro}")
	public ResponseEntity<RetBoleto> gerarBoleto(@PathVariable("numeroRegistro") Long numeroRegistro){
		RetBoleto fileBoelto = boletoService.executar(numeroRegistro);
		
		return new ResponseEntity<RetBoleto>(fileBoelto, HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/consultarBoleto/{tipo}/{numeroProcesso}/{anoProcesso}")
	public ResponseEntity<PmdBoleto> consultarBoleto(
			@PathVariable("tipo") String tipo,
			@PathVariable("numeroProcesso") Long numeroProcesso,
			@PathVariable("anoProcesso") Integer ano){
		
		//Localizar o boleto na tabela auxiliar
		//verificar a situação do boleto
		//	- pago, vencido, em aberto
		
		//retorna o numero o boleto
		PmdBoleto boleot = boletoService.consultaBoletoPorNumeroProcessoEletronico(numeroProcesso, tipo, ano);
		
		
		
		if(boleot.getNrProcessoBoleto() == null){			
			return new ResponseEntity<PmdBoleto>(boleot, HttpStatus.OK);
		}
		
		 PmdBoleto fileBoelto = boletoService.consultarBoletoHomologacao(boleot.getNrProcessoBoleto());
		 boleot.setCdSituacao(fileBoelto.getCdSituacao());
		 boleot.setDsSituacao(fileBoelto.getDsSituacao());
		 boleot.setDsBoleto(fileBoelto.getDsBoleto());
		 boletoService.salvarRegistro(boleot);
		 
		return new ResponseEntity<PmdBoleto>(boleot, HttpStatus.OK);
	}
	
	
	@Deprecated
	@GetMapping(value = "/consultarBoletoHmg/{tipo}/{numeroProcesso}/{anoProcesso}")
	public ResponseEntity<PmdBoleto> consultarBoletoHmg(
			@PathVariable("tipo") String tipo,
			@PathVariable("numeroProcesso") Long numeroProcesso,
			@PathVariable("anoProcesso") Integer ano){
		
		//Localizar o boleto na tabela auxiliar
		//verificar a situação do boleto
		//	- pago, vencido, em aberto
		
		//retorna o numero o boleto
		PmdBoleto boleot = boletoService.consultaBoletoPorNumeroProcessoEletronico(numeroProcesso, tipo, ano);
		
		
		
		if(boleot.getNrProcessoBoleto() == null){			
			return new ResponseEntity<PmdBoleto>(boleot, HttpStatus.OK);
		}
		
		 PmdBoleto fileBoelto = boletoService.consultarBoletoHomologacao(boleot.getNrProcessoBoleto());
		 boleot.setCdSituacao(fileBoelto.getCdSituacao());
		 boleot.setDsSituacao(fileBoelto.getDsSituacao());
		 boleot.setDsBoleto(fileBoelto.getDsBoleto());
		 boletoService.salvarRegistro(boleot);
		 
		return new ResponseEntity<PmdBoleto>(boleot, HttpStatus.OK);
	}
	
	@Deprecated
	@GetMapping(value = "/lancarNotaHmg/{orgao}/{numeroProcesso}/{ano}/{codigoTaxa}/{valorTaxa}/{quantidadeTaxa}/{tipoContribuinte}/{inscricao}/{observacao}")
	public ResponseEntity<RetBoleto> lancarTaxaDiversars(
			@PathVariable("codigoTaxa") String orgao,
			@PathVariable("numeroProcesso") Integer numeroProcesso,
			@PathVariable("ano") Integer ano,
			@PathVariable("codigoTaxa") Integer codigoTaxa,
			@PathVariable("valorTaxa")Double valorTaxa,
			@PathVariable("quantidadeTaxa")Integer quantidadeTaxa, 
			@PathVariable("tipoContribuinte")Integer tipoContribuinte, 
			@PathVariable("inscricao")Long inscricao, 
			@PathVariable("observacao")String observacao)
			{
		RetBoleto fileBoelto = boletoService.executarLancamentoNotaHmg(codigoTaxa,valorTaxa, quantidadeTaxa ,tipoContribuinte,inscricao,observacao);
		
		boletoService.salvarRegistro(fileBoelto.getNumeroProcesso(), orgao, ano, numeroProcesso);
		
		
		return new ResponseEntity<RetBoleto>(fileBoelto, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
}
