package br.com.prefeitura.diadema.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.dto.UsuarioDto;
import br.com.prefeitura.diadema.service.UsuarioService;

/**
 * Controle de acesso do usuario
 * @author anderson.oliveira
 *
 */
@RestController
@RequestMapping("/api/prefeitura/usuario")
public class UserController {
	
	
	//public AcessController(){
		
//	}
	private final UsuarioService usuarioService;
	
	
	@Autowired
    public UserController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
       
    }
	
	@PostMapping(value = "/add")
	public ResponseEntity<UsuarioDto> add(@RequestBody UsuarioDto usuario){
		UsuarioDto user = usuarioService.save(usuario);		
		return new ResponseEntity<UsuarioDto>(user, HttpStatus.OK);
	}
	
	@GetMapping(value ="/find/{find}")
	public ResponseEntity<List<UsuarioDto>> listAll(@PathVariable(value="find") String find) throws SQLException{
		List<UsuarioDto> user = usuarioService.findUserByNameOrEmailOrProntuario(find);
		
		
		
		return new ResponseEntity<List<UsuarioDto>>(user, HttpStatus.OK);
	}
	
	
	@GetMapping(value ="/get")
	public ResponseEntity<UsuarioDto> getById(@RequestBody UsuarioDto usuario){
		UsuarioDto user = usuarioService.getById(usuario);
		return new ResponseEntity<UsuarioDto>(user, HttpStatus.OK);
	}
	
	@PutMapping(value = "/update")
	public ResponseEntity<UsuarioDto> update(@RequestBody UsuarioDto usuario){
		UsuarioDto user = usuarioService.save(usuario);		
		return new ResponseEntity<UsuarioDto>(user, HttpStatus.OK);
	}
	
}
