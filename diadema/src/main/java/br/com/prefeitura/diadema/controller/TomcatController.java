package br.com.prefeitura.diadema.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.service.CargaService;
import br.com.prefeitura.diadema.util.UrlEndereco;

@RestController
public class TomcatController {
	
	private CargaService cargaService;


	@Autowired
	public TomcatController(CargaService cargaService){
		this.cargaService = cargaService;
		
	}
	
    @GetMapping("/hello")
    public String sayHello() {
    	if(UrlEndereco.WSDL_URL.equals("http://10.1.2.38:8080/")){
    		return "homologação";
    	}
    	if(UrlEndereco.WSDL_URL.equals("http://webservice.diadema.sp.gov.br:8888/")){
    		return "PRODUÇÃO";
    	}
    	return "enderçeo não encontrado";
    	
    }
    
    
    @GetMapping("/carga")
    public String carga() throws SQLException {    	
    	cargaService.executar();
    	return "finalizado";
      
    } 
    
    
}