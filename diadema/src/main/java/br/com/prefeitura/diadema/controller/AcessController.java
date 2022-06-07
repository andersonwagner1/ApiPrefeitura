package br.com.prefeitura.diadema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.dto.UsuarioDto;
import br.com.prefeitura.diadema.service.UsuarioService;
import br.com.prefeitura.diadema.ws.AgilesWs;
import br.com.prefeitura.diadema.ws.agiles.AgilesUser;

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
	private final AgilesWs agilesWs;
	 
	
	@Autowired
    public AcessController(UsuarioService usuarioService, AgilesWs agilesWs) {
        this.usuarioService = usuarioService;
        this.agilesWs = agilesWs;
    }
	
	@PostMapping("/login")
	public ResponseEntity<UsuarioDto>  login(@RequestBody UsuarioDto user){

		AgilesUser usuarioAgiles = agilesWs.loginAgiles(user.getLogin(), user.getSenha());
		if(usuarioAgiles == null){
			return new ResponseEntity<UsuarioDto>(new UsuarioDto(), HttpStatus.NOT_FOUND);
		}
		UsuarioDto usuario = usuarioService.getByUserToken(usuarioAgiles);
		
		return new ResponseEntity<UsuarioDto>(usuario, HttpStatus.OK);
        //return new ResponseEntity<>(UsuarioRespostaDto.transformaEmDTO(usuario), HttpStatus.CREATED);
	}
}
