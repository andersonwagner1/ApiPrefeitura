package br.com.prefeitura.diadema.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.service.CargaService;

@RestController
public class TomcatController {
	
	private CargaService cargaService;


	@Autowired
	public TomcatController(CargaService cargaService){
		this.cargaService = cargaService;
		
	}
	
    @GetMapping("/hello")
    public String sayHello() {
        return "funcionou";
    }
    
    
    @GetMapping("/carga")
    public String carga() throws SQLException {    	
    	cargaService.executar();
    	return "finalizado";
      
    } 
    
    
}