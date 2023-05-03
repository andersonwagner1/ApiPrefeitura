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
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomica;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomicaComplemento;
import br.com.prefeitura.diadema.dto.EnquadramentoISS;
import br.com.prefeitura.diadema.dto.InscricaoMunicipal;
import br.com.prefeitura.diadema.service.InscricaoService;
import br.com.prefeitura.diadema.ws.abaco.hmg.inscricao.SdtDadosCadastraisEmpresa;

@RestController
@RequestMapping("/api/diadema/inscricao")
public class InscricaoController {

	

	private InscricaoService mobiliarioService;


	@GetMapping("/hello")
	public String sayHello() {
		return "Gerador inscricao";
	}
	
	@Autowired
    public InscricaoController(InscricaoService mobiliarioService) {
        this.mobiliarioService = mobiliarioService;      
    }
	
	
	public static void main(String args[]){
		/*InscricaoService mobiliarioService = new InscricaoService();
		InscricaoController c = new InscricaoController(mobiliarioService);
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
		inscricaoMunicipal.setCnaes(cnae );
		
		
		c.postBody(inscricaoMunicipal);*/
	}
	
	
	@GetMapping(value = "/existeInscricao/{tipo}/{numero}")
	public ResponseEntity<Boolean> existeInscricao(
			@PathVariable("tipo") String tipo,
			@PathVariable("numero") Long numero) throws Exception{
		
		boolean existe = mobiliarioService.existeInscricaoMobiliario(tipo, numero);
		return new ResponseEntity<Boolean>(existe, HttpStatus.OK);
	}
	
	
	@PostMapping("/enviarDadosEmpresaAgata")
	public ResponseEntity<String> enviarDadosEmpresaAgata(@RequestBody InscricaoMunicipal inscricaoMunicipal) {
		System.out.println(inscricaoMunicipal.toString());
		
		try{
			Integer resultado = mobiliarioService.enviarDadosAgata(inscricaoMunicipal);
			
			if(resultado == 1){
				return new ResponseEntity<String>("Sucesso", HttpStatus.OK);
			}
			return new ResponseEntity<String>("Sucesso " + resultado, HttpStatus.OK);
		}catch(Exception ex){
			System.out.println("Ocorreu um erro ao tentar envias os dados");
			ex.printStackTrace();
			return new ResponseEntity<String>("ocorreu um erro ao tentar cadastrar " + ex.getMessage(), HttpStatus.OK);
		}
	}
	
	//@PostMapping(value = "/enviarDados", method = RequestMethod.POST,consumes =MediaType.APPLICATION_JSON_VALUE ,
    //        headers = MediaType.APPLICATION_JSON_VALUE )
/*	public ResponseEntity<InscricaoMunicipal> save(@RequestBody InscricaoMunicipal inscricaoMunicipal){
		InscricaoMunicipal i  = null;
		try{
			i= mobiliarioService.enviarDadosAgata(inscricaoMunicipal);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return new ResponseEntity<InscricaoMunicipal>(i, HttpStatus.OK);
	}*/
	
	
	
	

	

}
