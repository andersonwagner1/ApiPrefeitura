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
import br.com.prefeitura.diadema.dto.Municipio;
import br.com.prefeitura.diadema.dto.RetornoDto;
import br.com.prefeitura.diadema.model.PmdBoleto;
import br.com.prefeitura.diadema.model.PmdLogs;
import br.com.prefeitura.diadema.service.LogsService;
import br.com.prefeitura.diadema.util.ConverterDtoJson;
import br.com.prefeitura.diadema.util.ParseInscricaoEgata;
import br.com.prefeitura.diadema.ws.EgataInscricaoWS;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresa;
import br.com.prefeitura.diadema.ws.egata.SdtEmpresasporCnpjSdtEmpresasporCnpjItem;
import br.com.prefeitura.diadema.ws.egata.WsConsultarExistenciaDaEmpresaExecuteResponse;

@RestController
@RequestMapping("/api/diadema/inscricao")
public class EInscricaoController {

	private EgataInscricaoWS egataWs;
	
	
	private LogsService logsService;


	@GetMapping("/hello")
	public String sayHello() {
		return "Gerador E_Inscricao";
	}
	
	@Autowired
    public EInscricaoController(EgataInscricaoWS egataWs,LogsService logsService) {
        this.egataWs = egataWs;  
        this.logsService = logsService;
    }
	
	
	/**
	 * Esse metodo não é utilzado remover
	 * @param cnpj
	 * @return
	 */
	@Deprecated
	@GetMapping(value = "/observacao/{cnpj}")
	public String pegarInformacaoDaEmpresa(@PathVariable("cnpj") Long cnpj){
		
		//buscar as informação do campo observação da abaco
		 try {
			SdtEmpresasporCnpjSdtEmpresasporCnpjItem dadosEmpresaAbaco = egataWs.consultarExistemEmpresaPorCnpj(cnpj);
			WsConsultarExistenciaDaEmpresaExecuteResponse restornoInforamcaoEmpresa = egataWs.consultaInformacaoDaInscricaoMobiliario(dadosEmpresaAbaco.getInscricaoMunicipal());
			return restornoInforamcaoEmpresa.getSdtDadoscadastraisempresas().getObservacaoEmpresa();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	
	@GetMapping(value = "/consultarInscricao/{cnpj}")
	public ResponseEntity<Long> consultarInscricaoPorCnpj(
			@PathVariable("cnpj") Long cnpj) {
		
		PmdLogs log = logsService.infoJson("consultarInscricao", cnpj);
		try{
			Long existe = egataWs.consultarCmcPorCnpj(cnpj);
			return new ResponseEntity<Long>(existe, HttpStatus.OK);
		}catch(Exception e){
			logsService.falha(log, e.getMessage());
			return new ResponseEntity<Long>(0L, HttpStatus.BAD_GATEWAY);
		}		
	}
	
	/**
	 * Verifica a situação da empresa, utilizado para verificar se teve abrir processo ou não caso a empresa esta ATIVA
	 * @param cnpj
	 * @return
	 */
	@GetMapping(value = "/consultar-situacao/{cnpj}")
	public ResponseEntity<SdtEmpresasporCnpjSdtEmpresasporCnpjItem> consultaSituacaoEmpresaPorCnj(@PathVariable("cnpj") Long cnpj) {
		
		PmdLogs log = logsService.infoJson("consultaSituacaoEmpresaPorCnj", cnpj);
		SdtEmpresasporCnpjSdtEmpresasporCnpjItem existe = null;
		try{
		 
			
			 existe = egataWs.consultarExistemEmpresaPorCnpj(cnpj);
			return new ResponseEntity<SdtEmpresasporCnpjSdtEmpresasporCnpjItem>(existe, HttpStatus.OK);
		}catch(Exception e){
			existe = new SdtEmpresasporCnpjSdtEmpresasporCnpjItem();
			existe.setDesRetorno(e.getMessage());
			logsService.falha(log, e.getMessage());
			return new ResponseEntity<SdtEmpresasporCnpjSdtEmpresasporCnpjItem>(existe, HttpStatus.BAD_GATEWAY);
		}		
	}
	
	
	
	
	@GetMapping(value = "/existeInscricao/{tipo}/{numero}")
	public ResponseEntity<Boolean> existeInscricao(
			@PathVariable("tipo") String tipo,
			@PathVariable("numero") Long numero) {
		
		PmdLogs log = logsService.infoJson("existeInscricao", numero);
		try{
			boolean existe = egataWs.existeInscricaoMobiliario(tipo, numero);
			return new ResponseEntity<Boolean>(existe, HttpStatus.OK);
		}catch(Exception e){
			logsService.falha(log, e.getMessage());
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}
		
	}
	
	@GetMapping("/localizarEndereco/lista")
	public ResponseEntity<RetornoDto<List<Logradouro>>> localizarEndereco() {
		PmdLogs log = logsService.infoJson("localizarEndereco", "vazio");
		
		try{
			// = new ArrayList<Logradouro>();
			//for(String endereco : enderecos){
				
			List<Logradouro> resultado= egataWs.listarTodosEnderecos("");
			//}
			RetornoDto<List<Logradouro>> ret = new RetornoDto<List<Logradouro>>();
			ret.setDescricao("Sucesso");
			ret.setRetorno(1);
			ret.setObjeto(resultado);
			return new ResponseEntity<RetornoDto<List<Logradouro>>>(ret, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			RetornoDto<List<Logradouro>> ret = new RetornoDto<List<Logradouro>>();
			ret.setDescricao(ex.getMessage());
			ret.setRetorno(0);
			ret.setObjeto(null);
			return new ResponseEntity<RetornoDto<List<Logradouro>>>(ret, HttpStatus.OK);
		}
	}
	
	
	
	
	@GetMapping("/localizarEndereco/{endereco}")
	public ResponseEntity<RetornoDto<List<Logradouro>>> localizarEnderecoGEt(@PathVariable("endereco") String endereco) {
		PmdLogs log = logsService.infoJson("localizarEndereco GET", endereco);
		if(endereco != null){
			endereco = endereco.toUpperCase();
			endereco = endereco.replace("+", " ");
		}
		try{
			List<Logradouro> resultado = egataWs.listarEnderecoPorNomeLogradouro(endereco);
			RetornoDto<List<Logradouro>> ret = new RetornoDto<List<Logradouro>>();
			ret.setDescricao("Sucesso");
			ret.setRetorno(1);
			ret.setObjeto(resultado);
			return new ResponseEntity<RetornoDto<List<Logradouro>>>(ret, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			RetornoDto<List<Logradouro>> ret = new RetornoDto<List<Logradouro>>();
			ret.setDescricao(ex.getMessage());
			ret.setRetorno(0);
			ret.setObjeto(null);
			return new ResponseEntity<RetornoDto<List<Logradouro>>>(ret, HttpStatus.OK);
		}
	}
	
	
	
	@PostMapping("/localizarEndereco")
	public ResponseEntity<RetornoDto<List<Logradouro>>> localizarEndereco(@RequestBody String endereco) {
		PmdLogs log = logsService.infoJson("localizarEndereco", endereco);
		if(endereco != null){
			endereco = endereco.toUpperCase();
			endereco = endereco.replace("+", " ");
		}
		try{
			List<Logradouro> resultado = egataWs.listarEnderecoPorNomeLogradouro(endereco);
			RetornoDto<List<Logradouro>> ret = new RetornoDto<List<Logradouro>>();
			ret.setDescricao("Sucesso");
			ret.setRetorno(1);
			ret.setObjeto(resultado);
			return new ResponseEntity<RetornoDto<List<Logradouro>>>(ret, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			RetornoDto<List<Logradouro>> ret = new RetornoDto<List<Logradouro>>();
			ret.setDescricao(ex.getMessage());
			ret.setRetorno(0);
			ret.setObjeto(null);
			return new ResponseEntity<RetornoDto<List<Logradouro>>>(ret, HttpStatus.OK);
		}
	}
	
	
	@PostMapping("/localizarEndereco/lista")
	public ResponseEntity<RetornoDto<List<Logradouro>>> localizarEndereco2(@RequestBody List<String> enderecos) {
		PmdLogs log = logsService.infoJson("localizarEndereco", enderecos.get(0));
		
		String endereco = enderecos.get(0);
		
		
		if(endereco != null){
			endereco = endereco.toUpperCase();
			endereco = endereco.replace("+", " ");
		}
		try{
			List<Logradouro> resultado = egataWs.listarEnderecoPorNomeLogradouro(endereco);
			RetornoDto<List<Logradouro>> ret = new RetornoDto<List<Logradouro>>();
			ret.setDescricao("Sucesso");
			ret.setRetorno(1);
			ret.setObjeto(resultado);
			return new ResponseEntity<RetornoDto<List<Logradouro>>>(ret, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			RetornoDto<List<Logradouro>> ret = new RetornoDto<List<Logradouro>>();
			ret.setDescricao(ex.getMessage());
			ret.setRetorno(0);
			ret.setObjeto(null);
			return new ResponseEntity<RetornoDto<List<Logradouro>>>(ret, HttpStatus.OK);
		}
	}
	
	@PostMapping("/localizarMunicipio")
	public ResponseEntity<RetornoDto<List<Municipio>>> localizarMuncipioPorUfouCidade(@RequestBody Municipio municipio) {
		PmdLogs log = logsService.infoJson("localizarMuncipioPorUfouCidade", municipio);
		
		try{
			List<Municipio> resultado = egataWs.listarMunicipioPorUfOuCidade(municipio);
			RetornoDto<List<Municipio>> ret = new RetornoDto<List<Municipio>>();
			ret.setDescricao("Sucesso");
			ret.setRetorno(1);
			ret.setObjeto(resultado);
			return new ResponseEntity<RetornoDto<List<Municipio>>>(ret, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			RetornoDto<List<Municipio>> ret = new RetornoDto<List<Municipio>>();
			ret.setDescricao(ex.getMessage());
			ret.setRetorno(0);
			ret.setObjeto(null);
			return new ResponseEntity<RetornoDto<List<Municipio>>>(ret, HttpStatus.OK);
		}
	}
	
	
	@PostMapping("/enviarDadosEmpresaAgata")
	public ResponseEntity<RetornoDto<Long>> enviarDadosEmpresaAgata(@RequestBody DtoInscricao inscricao) {
		
		//return new ResponseEntity<String>("chamada realizada com sucesso" , HttpStatus.OK);
		PmdLogs log = logsService.infoJson("enviarDadosEmpresaAgata", inscricao);
		PmdLogs logAgata = null;
		
		
		  
		try{
			//|-----------------------------------------------------------------------------------------|
			//| NO SOLAR BPM ELE NÃO CONSEGUE entender este metodo OBJECT => OBJECTO => ARRY<objeto>	|
			//|foi colocado como parametros para listar o array 										|
			//|-----------------------------------------------------------------------------------------|
			InscricaoMunicipal i = inscricao.getInscricaoMunicipal();
			i.setEnquadramentoAtividadeEconomica(inscricao.getEnquadramentoAtividadeEconomica());
			i.setEnquadramentoISS(inscricao.getEnquadramentoISS());
		//	inscricao.getInscricaoMunicipal().setCnpj("12373198000138");
	//		inscricao.getInscricaoMunicipal().setStatusEmpresa("ALTERACAO");

			//primeiro teste
			ParseInscricaoEgata parse = new ParseInscricaoEgata();
			SdtDadosCadastraisEmpresa oi = parse.parseAgata(i);
			
	        logAgata = logsService.infoJson("enviarDadosEmpresa(modelo XML)",  oi);
	        //segundo teste
			//-------------------------------------------------------------------------------------
			
			Long resultado = egataWs.enviarDadosAgata(i);
			RetornoDto<Long> ret = new RetornoDto<Long>();
			ret.setDescricao("Sucesso");
			ret.setRetorno(1);
			ret.setObjeto(resultado);
			
			 //ConverterDtoJson.mostarJson(inscricao);
					
			return new ResponseEntity<RetornoDto<Long>>(ret, HttpStatus.OK);
			
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			if(logAgata !=null){
				logsService.falha(logAgata, ex.getMessage());
			}
			RetornoDto<Long> ret = new RetornoDto<Long>();
			ret.setDescricao(ex.getMessage());
			ret.setRetorno(0);
			ret.setObjeto(-1L);
			return new ResponseEntity<RetornoDto<Long>>(ret, HttpStatus.OK);
		}
	}
	
	
	/*
	
	@PostMapping("/enviarDadosEmpresaAgata")
	public ResponseEntity<RetornoDto<Long>> enviarDadosEmpresaAgata(@RequestBody DtoInscricao inscricao){ 	
		PmdLogs log = logsService.infoJson("enviarDadosEmpresaAgata", inscricao.getInscricaoMunicipal());
		
		try{
			//|-----------------------------------------------------------------------------------------|
			//| NO SOLAR BPM ELE NÃO CONSEGUE entender este metodo OBJECT => OBJECTO => ARRY<objeto>	|
			//|foi colocado como parametros para listar o array 										|
			//|-----------------------------------------------------------------------------------------|
			InscricaoMunicipal i = inscricao.getInscricaoMunicipal();
			i.setEnquadramentoAtividadeEconomica(inscricao.getEnquadramentoAtividadeEconomica());
			i.setEnquadramentoISS(inscricao.getEnquadramentoISS());
			//-------------------------------------------------------------------------------------
			
			Long resultado = egataWs.enviarDadosAgata(i);
			RetornoDto<Long> ret = new RetornoDto<Long>();
			ret.setDescricao("Sucesso");
			ret.setRetorno(1);
			ret.setObjeto(resultado);
					
			return new ResponseEntity<RetornoDto<Long>>(ret, HttpStatus.OK);
		}catch(Exception ex){
			ex.printStackTrace();
			logsService.falha(log, ex.getMessage());
			RetornoDto<Long> ret = new RetornoDto<Long>();
			ret.setDescricao(ex.getMessage());
			ret.setRetorno(0);
			ret.setObjeto(-1L);
			return new ResponseEntity<RetornoDto<Long>>(ret, HttpStatus.OK);
		}
	}
	*/
	
	
	//--------------------------------------------------------------------------------------------------------------
	//	BOLETO
	//--------------------------------------------------------------------------------------------------------------
	@GetMapping(value = "/consultarBoleto/{tipo}/{numeroProcesso}/{anoProcesso}")
	public ResponseEntity<?> consultarBoletoHmg(
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
