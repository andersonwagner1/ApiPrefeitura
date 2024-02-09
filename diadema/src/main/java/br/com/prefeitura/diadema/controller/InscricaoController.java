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

import br.com.prefeitura.diadema.dto.DtoInscricao;
import br.com.prefeitura.diadema.dto.InscricaoMunicipal;
import br.com.prefeitura.diadema.dto.Logradouro;
import br.com.prefeitura.diadema.dto.Municipio;
import br.com.prefeitura.diadema.dto.RetornoDto;
import br.com.prefeitura.diadema.model.PmdLogs;
import br.com.prefeitura.diadema.service.InscricaoService;
import br.com.prefeitura.diadema.service.LogsService;
import br.com.prefeitura.diadema.util.ConverterDtoJson;
import br.com.prefeitura.diadema.ws.EgataInscricaoWS;

@RestController
@RequestMapping("/api/diadema/inscricaoExcluido")
public class InscricaoController {

	

	private InscricaoService mobiliarioService;
	private EgataInscricaoWS egataWs;
	
	
	
	private LogsService logsService;


	@GetMapping("/hello")
	public String sayHello() {
		return "Gerador inscricao";
	}
	
	@Autowired
    public InscricaoController(InscricaoService mobiliarioService,LogsService logsService,  EgataInscricaoWS egataWs) {
        this.mobiliarioService = mobiliarioService;  
        this.logsService = logsService;
        this.egataWs = egataWs;
    }
	
	
	@GetMapping(value = "/consultarInscricao/{cnpj}")
	public ResponseEntity<Long> consultarInscricaoPorCnpj(
			@PathVariable("cnpj") Long cnpj) {
		
		PmdLogs log = logsService.info("consultarInscricao", cnpj);
		try{
			Long existe = mobiliarioService.consultarCmcPorCnpj(cnpj);
			return new ResponseEntity<Long>(existe, HttpStatus.OK);
		}catch(Exception e){
			logsService.falha(log, e.getMessage());
			return new ResponseEntity<Long>(0L, HttpStatus.OK);
		}		
	}
	
	
	@GetMapping(value = "/existeInscricao/{tipo}/{numero}")
	public ResponseEntity<Boolean> existeInscricao(
			@PathVariable("tipo") String tipo,
			@PathVariable("numero") Long numero) {
		
		PmdLogs log = logsService.info("existeInscricao", tipo, numero);
		try{
			boolean existe = mobiliarioService.existeInscricaoMobiliario(tipo, numero);
			return new ResponseEntity<Boolean>(existe, HttpStatus.OK);
		}catch(Exception e){
			logsService.falha(log, e.getMessage());
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}
		
	}
	
	
	@PostMapping("/enviarDadosEmpresaAgata")
	public ResponseEntity<RetornoDto<Long>> enviarDadosEmpresaAgata(@RequestBody DtoInscricao inscricao /*@RequestBody InscricaoMunicipal inscricaoMunicipal, 
			@RequestBody EnquadramentoAtividadeEconomica enquadramentoAtividadeEconomica,
			@RequestBody EnquadramentoISS enquadramentoISS*/) {
		
		//return new ResponseEntity<String>("chamada realizada com sucesso" , HttpStatus.OK);
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
			
			Long resultado = mobiliarioService.enviarDadosAgata(i);
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
	
	
	
	//APARTIR DESTE PONTO ESTA CHAMANDO O METODO NOVO
	@PostMapping("/localizarEndereco")
	public ResponseEntity<RetornoDto<List<Logradouro>>> localizarEndereco(@RequestBody String endereco) {
		PmdLogs log = logsService.infoJson("localizarEndereco", endereco);
		
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
}
