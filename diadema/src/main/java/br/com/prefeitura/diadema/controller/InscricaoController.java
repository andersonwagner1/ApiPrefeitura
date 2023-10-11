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

import br.com.prefeitura.diadema.dto.Cnae;
import br.com.prefeitura.diadema.dto.DtoInscricao;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomica;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomicaComplemento;
import br.com.prefeitura.diadema.dto.EnquadramentoISS;
import br.com.prefeitura.diadema.dto.InscricaoMunicipal;
import br.com.prefeitura.diadema.dto.RetornoDto;
import br.com.prefeitura.diadema.dto.Socio;
import br.com.prefeitura.diadema.model.PmdLogs;
import br.com.prefeitura.diadema.service.InscricaoService;
import br.com.prefeitura.diadema.service.LogsService;
import br.com.prefeitura.diadema.ws.AbacoWs;
import br.com.prefeitura.diadema.ws.egata.WSCadastroInscricaoMobiliarioExecuteResponse;

@RestController
@RequestMapping("/api/diadema/inscricao")
public class InscricaoController {

	

	private InscricaoService mobiliarioService;
	
	private LogsService logsService;


	@GetMapping("/hello")
	public String sayHello() {
		return "Gerador inscricao";
	}
	
	@Autowired
    public InscricaoController(InscricaoService mobiliarioService,LogsService logsService) {
        this.mobiliarioService = mobiliarioService;  
        this.logsService = logsService;
    }
	
	
	public static void main(String args[]){
		
		InscricaoMunicipal inscricaoMunicipal = new InscricaoMunicipal();
		inscricaoMunicipal.setBancaDeJornal(40f);
		inscricaoMunicipal.setCodigoNaturezaJuridica(1);
		inscricaoMunicipal.setNumeroFuncionario(1);
		inscricaoMunicipal.setNumeroProfissionais(1);
		inscricaoMunicipal.setStatusEmpresa("nova");
		inscricaoMunicipal.setDadosContadorTelefone("12389");
		inscricaoMunicipal.setEmpresacodigoLogradouroAgata(1);
		inscricaoMunicipal.setEmpresaCodigoBairro(5);
		inscricaoMunicipal.setQuantidadePublicidadeLuminoso(0);
 		inscricaoMunicipal.setQuantidadePublicidadeNaoLuminioso(0);
 		inscricaoMunicipal.setQuantidadePublicidadeTerceiro(0);
 		inscricaoMunicipal.setNumeroDeJogos(0);
 		inscricaoMunicipal.setNumeroDeEletronicos(0);
 		inscricaoMunicipal.setNumeroInstrumentosMusicais(0);
 		
 		EnquadramentoAtividadeEconomica enquadramentoAtividadeEconomica = new EnquadramentoAtividadeEconomica();
 		enquadramentoAtividadeEconomica.setClassificacaoAtividade("insductria");
 		
 		List<EnquadramentoAtividadeEconomicaComplemento> enquadramentoAtividadeEconomicaComplementos = new ArrayList<EnquadramentoAtividadeEconomicaComplemento>();
		enquadramentoAtividadeEconomica.setEnquadramentoAtividadeEconomicaComplementos(enquadramentoAtividadeEconomicaComplementos );
 		
 		inscricaoMunicipal.setEnquadramentoAtividadeEconomica(enquadramentoAtividadeEconomica);
 		
 		
 		EnquadramentoISS enquadramentoISS = new EnquadramentoISS();
 		
		inscricaoMunicipal.setEnquadramentoISS(enquadramentoISS );
		
		List<Cnae> cnae = new ArrayList<Cnae>();
		inscricaoMunicipal.setCnaes(cnae);
		
		
		List<Socio> socios = new ArrayList<Socio>();
		Socio socio1 = new Socio();
		socio1.setBairro("Bairro");
		socio1.setCep("09921250");
		socio1.setCidade("Diadema");
		socio1.setComplementoEndereco("Teste");
		socio1.setCpf("32379324859");
		socio1.setEmail("andersonwo@gmail.com");
		socio1.setEndereco("Endereço");
		socio1.setNome("NOme Teste");
		socio1.setNumeroEndereco("800");
		socio1.setRg("433333");
		socio1.setTelefone("09999212");
		socio1.setUf("SP");
		
		socios.add(socio1 );
		
		Socio socio2 = new Socio();
		socio2.setBairro("Bairro");
		socio2.setCep("09921250");
		socio2.setCidade("Diadema");
		socio2.setComplementoEndereco("Teste");
		socio2.setCpf("32379324859");
		socio2.setEmail("andersonwo@gmail.com");
		socio2.setEndereco("Endereço");
		socio2.setNome("NOme Teste");
		socio2.setNumeroEndereco("800");
		socio2.setRg("433333");
		socio2.setTelefone("09999212");
		socio2.setUf("SP");
		
		socios.add(socio2);
		inscricaoMunicipal.setSocios(socios );
		
		InscricaoService s = new InscricaoService();
		try {
			s.enviarDadosAgata(inscricaoMunicipal);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//AbacoWs ws = new AbacoWs();
		//WSCadastroInscricaoMobiliarioExecuteResponse inscricao = ws.enviarDadosEmpresaAgata(inscricaoMunicipal);
		//System.out.println(inscricao.getSdterros());
		
		//AbacoHomologacaoWs ws = new AbacoHomologacaoWs();
		//WsCadastroInscricaoMobiliarioExecuteResponse t = ws.enviarDadosParaAgata(inscricaoMunicipal);
		//System.out.println("Ttests") ;
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
		PmdLogs log = logsService.info("enviarDadosEmpresaAgata", inscricao.getInscricaoMunicipal());
		
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
			
			//return new ResponseEntity<String>("0", HttpStatus.OK);
			
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
}
