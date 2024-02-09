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
import br.com.prefeitura.diadema.dto.DtoInscricao;
import br.com.prefeitura.diadema.dto.InscricaoMunicipal;
import br.com.prefeitura.diadema.dto.Logradouro;
import br.com.prefeitura.diadema.dto.RetornoDto;
import br.com.prefeitura.diadema.dto.Taxa;
import br.com.prefeitura.diadema.dto.TaxaDiversas;
import br.com.prefeitura.diadema.model.PmdBoleto;
import br.com.prefeitura.diadema.model.PmdLogs;
import br.com.prefeitura.diadema.service.LogsService;
import br.com.prefeitura.diadema.util.ConverterDtoJson;
import br.com.prefeitura.diadema.ws.EgataBoletoTesteWS;
import br.com.prefeitura.diadema.ws.EgataBoletoWS;
import br.com.prefeitura.diadema.ws.EgataInscricaoWS;

@RestController
@RequestMapping("/api/diadema/boleto")
public class EBoletoController {

	private EgataBoletoWS egataWs;
	private EgataBoletoTesteWS egataNovaWs;
	
	
	private LogsService logsService;

//OK
	@GetMapping("/hello")
	public String sayHello() {
		return "Gerador E_BOLETO";
	}
	
	@Autowired
    public EBoletoController(EgataBoletoTesteWS egataNovaWs, EgataBoletoWS egataWs,LogsService logsService) {
        this.egataWs = egataWs;  
        this.logsService = logsService;
        this.egataNovaWs = egataNovaWs;
    }
	
	//Testar
	@GetMapping(value = "/consultarBoleto/{tipo}/{numeroProcesso}/{anoProcesso}") // FUNCIONAL
	public ResponseEntity<?> consultarBoleto(
			@PathVariable("tipo") String tipo,
			@PathVariable("numeroProcesso") Long numeroProcesso,
			@PathVariable("anoProcesso") Integer ano){
		PmdLogs log = logsService.info("consultarBoleto", tipo,numeroProcesso,ano );
		
		try{
			//PmdBoleto boleot = egataWs.consultarSituacaoBoletoPorNumeroProtocolo(numeroProcesso, tipo, ano);
			PmdBoleto boleot = egataNovaWs.consultarBoletoPorNumeroProcesso(numeroProcesso, tipo, ano);
			return new ResponseEntity<PmdBoleto>(boleot, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			
			return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}		
	}
	
	
	@GetMapping(value = "/gerarBoletoNumeroProcesso/{numeroProcessoBoleto}") // FUNCIONAL
	public ResponseEntity<RetBoleto> gerarBoletoNumeroProcesso(@PathVariable("numeroProcessoBoleto") Long numeroProcesso){
		PmdLogs log = logsService.info("gerarBoletoNumeroProcesso", numeroProcesso);
		
		//Long t =  Long.parseLong(numeroProcesso);
		try{				
			RetBoleto fileBoelto = egataNovaWs.gerarBoletoNumeroProcesso(numeroProcesso);
			return new ResponseEntity<RetBoleto>(fileBoelto, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			
			return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}		
	}
	
	
		@GetMapping(value = "/consultarNumeroProcessoBoleto/{numeroProcessoBoleto}") // FUNCIONAL
		public ResponseEntity<?> consultarBoleto(@PathVariable("numeroProcessoBoleto") Long numeroProcesso){
			PmdLogs log = logsService.info("consultarBoletoProcesso", numeroProcesso);
			
			//Long t =  Long.parseLong(numeroProcesso);
			try{				
				PmdBoleto boleot = egataNovaWs.consultarBoletoPorNumeroProcesso(numeroProcesso);
				return new ResponseEntity<PmdBoleto>(boleot, HttpStatus.OK);
			}catch(Exception ex){
				ex.printStackTrace();
				logsService.falha(log, ex.getMessage());
				
				return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
			}		
		}
	
	//Testar
	//inscricao 1003704200
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
		
		PmdLogs log = logsService.info("lancarTaxasDiversasParametrizado GET", s.toString());
		RetBoleto fileBoelto;
		try{
			
			//--------------------------------------------------------------------------------
			//CONVERTE PARA A CLASSE PARA GERAR PAREMTROS
			//--------------------------------------------------------------------------------
			TaxaDiversas taxaDiversas = new TaxaDiversas();
			taxaDiversas.setAno(ano);
			taxaDiversas.setCodigoLote("0");
			taxaDiversas.setCodigoQuadra("0");
			taxaDiversas.setCodigoSetor(0);
			taxaDiversas.setInscricao(inscricao);
			taxaDiversas.setNumeroProcesso(numeroProcesso);
			//taxaDiversas.setObservacao(observacao);
			taxaDiversas.setOrgao(orgao);
			taxaDiversas.setTipoContibuinte(tipoContribuinte);
			taxaDiversas.setValorTaxaAdministrativa(valorTaxa);
			taxaDiversas.setObservacao("BOLETO REFERENTE TAXA DE PROCESSOS ADMINISTRATIVO - PAGAR A PARTIR DO DIA SEGUINTE A DA DE EMISSAO.");
			
			List<Taxa> taxas = new ArrayList<Taxa>();
			Taxa taxa = new Taxa();
			taxa.setCodigoTaxa(codigoTaxa);
			taxa.setQuantidadeTaxa(quantidadeTaxa);
			taxa.setValorTaxa(valorTaxa);
			taxas.add(taxa );
			taxaDiversas.setTaxas(taxas );
			//--------------------------------------------------------------------------------
			
			//fileBoelto = egataWs.lancarTaxaParametrizada(taxaDiversas);
			fileBoelto = egataNovaWs.lancarTaxasDiversasParaAgata(taxaDiversas);
			//fileBoelto = egataWs.lancarTaxaHomologacao(orgao, numeroProcesso, ano, codigoTaxa,0d, quantidadeTaxa ,tipoContribuinte,inscricao,observacao);
			
			try{
				egataWs.registrarBoleto(ano.longValue(), fileBoelto.getNumeroProcesso());
			}catch(Exception ex){
				logsService.falha(log, "lancamento da nota gerado com sucesso, mas não foi registrado " + ex.getMessage());				
				fileBoelto.setSucesso(true);
			}
			
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
	
	//Testar
	@PostMapping(value = "/lancarNota")
	public ResponseEntity<RetBoleto> lancarTaxasDiversasParametrizado(@RequestBody TaxaDiversas taxaDiversas)throws Exception{
		
		//a classe TaxasDiversas tem valores padrões, verifique a classe
		taxaDiversas.setObservacao("BOLETO REFERENTE TAXA DE PROCESSOS ADMINISTRATIVO - PAGAR A PARTIR DO DIA SEGUINTE A DA DE EMISSAO.");
		
		PmdLogs log = logsService.infoJson("lancarTaxasDiversasParametrizado POST", taxaDiversas);
		RetBoleto fileBoelto;
		try{
			fileBoelto = egataNovaWs.lancarTaxasDiversasParaAgata(taxaDiversas);
			//fileBoelto = egataWs.lancarTaxaParametrizada(taxaDiversas);
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
