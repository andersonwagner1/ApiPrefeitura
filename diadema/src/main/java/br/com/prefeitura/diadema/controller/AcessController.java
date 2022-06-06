package br.com.prefeitura.diadema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.model.Usuario;
import br.com.prefeitura.diadema.service.UsuarioService;

/**
 * Controle de acesso do usuario
 * @author anderson.oliveira
 *
 */
@RestController
@RequestMapping("/api/prefeitura")
public class AcessController {
	
	
	//public AcessController(){
		
//	}
	private final UsuarioService usuarioService;
	
	@Autowired
    public AcessController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
	
	@PostMapping("/login")
	public ResponseEntity<Usuario>  login(@RequestBody Usuario login){

		Usuario usuario = usuarioService.login(login);
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
        //return new ResponseEntity<>(UsuarioRespostaDto.transformaEmDTO(usuario), HttpStatus.CREATED);
	}
}
