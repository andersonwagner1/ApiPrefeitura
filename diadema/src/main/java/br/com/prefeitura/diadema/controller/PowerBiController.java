package br.com.prefeitura.diadema.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.service.PowerBiService;

@Deprecated
@RestController
@RequestMapping("/api/relatorioBI")
public class PowerBiController {

	
	private PowerBiService powerBiService;

	@GetMapping("/hello")
	public String sayHello() {
		return "{Gerador boleot}{";
	}
	
	@Autowired
    public PowerBiController(PowerBiService powerBiService) {
        this.powerBiService = powerBiService;      
    }
	
	/*@GetMapping("/{relatorio}")
	public ResponseEntity<Object[][]>  lista(@PathVariable("relatorio") String relatorio){
		Object[][] rel = powerBiService.lsitarView(relatorio);		
		return new ResponseEntity<Object[][]>(rel, HttpStatus.OK);
	}
	*/
	

	@GetMapping("/r/processos")
	public ResponseEntity<List<Object[]>>  listarProcessoPowerBi() throws SQLException{
		List<Object[]> rel = powerBiService.listarProcessos();
		return new ResponseEntity<List<Object[]>>(rel, HttpStatus.OK);
	}
	
	@GetMapping("/r/municipios")
	public ResponseEntity<List<Object[]>> listaMunicipio()throws SQLException{
		List<Object[]> rel = powerBiService.listarMunicipios();
		return new ResponseEntity<List<Object[]>>(rel, HttpStatus.OK);
	}
		
	
	
	
	/*
	@GetMapping("/r/processo")
	public ResponseEntity<Object[][]>  listaLista(){
		Object[][] rel = powerBiService.lsitarView();		
		return new ResponseEntity<Object[][]>(rel, HttpStatus.OK);
	}*/
}
