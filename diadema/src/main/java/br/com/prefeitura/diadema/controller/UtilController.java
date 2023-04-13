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
import br.com.prefeitura.diadema.service.BoletoService;


@RestController
@RequestMapping("/api/diadema/util")
public class UtilController {
	
	private final BoletoService boletoService;
	
	@Autowired
    public UtilController(BoletoService boletoService) {
        this.boletoService = boletoService;      
    }
	
	
	 @GetMapping("/hello")
	    public String sayHello() {
	        return "gerar boelto Teste";
	    }
	 @GetMapping(value = "/gerarBoletoHomologacao/{numeroRegistro}")
		public ResponseEntity<RetBoleto> gerarBoletoHomologacao(@PathVariable("numeroRegistro") Long numeroRegistro) throws SQLException{
			RetBoleto fileBoelto = boletoService.executarHmg(numeroRegistro);
			
			return new ResponseEntity<RetBoleto>(fileBoelto, HttpStatus.OK);
		}
	
	@GetMapping(value = "/gerarBoleto/{numeroRegistro}")
	public ResponseEntity<RetBoleto> gerarBoleto(@PathVariable("numeroRegistro") Long numeroRegistro){
		RetBoleto fileBoelto = boletoService.executar(numeroRegistro);
		
		return new ResponseEntity<RetBoleto>(fileBoelto, HttpStatus.OK);
	}
	
	@GetMapping(value = "/lancarNotaHmg/{codigoTaxa}/{valorTaxa}/{quantidadeTaxa}/{tipoContribuinte}/{inscricao}/{observacao}")
	public ResponseEntity<RetBoleto> lancarTaxaDiversars(
			@PathVariable("codigoTaxa") Integer codigoTaxa,
			@PathVariable("valorTaxa")Double valorTaxa,
			@PathVariable("quantidadeTaxa")Integer quantidadeTaxa, 
			@PathVariable("tipoContribuinte")Integer tipoContribuinte, 
			@PathVariable("inscricao")Long inscricao, 
			@PathVariable("observacao")String observacao)
			{
		RetBoleto fileBoelto = boletoService.executarLancamentoNotaHmg(codigoTaxa,valorTaxa, quantidadeTaxa ,tipoContribuinte,inscricao,observacao);
		
		return new ResponseEntity<RetBoleto>(fileBoelto, HttpStatus.OK);
	}
	
	
			//@PathVariable() String nomeRelatorio,			
			//@RequestParam(value = "dataInicial") Long dataInicial,
			//@RequestParam(value = "dataFinal") Long dataFinal,
			//@RequestParam(value = "secretaria") Long secretaria
	//		){
			//throws SQLException {
		//boletoService.executarBoleto();
			
			
			
		
//		return null;
		//return new ResponseEntity<RelatorioDto>(null, HttpStatus.OK);

	//}

}
