package br.com.prefeitura.diadema.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import br.com.prefeitura.diadema.dto.UsuarioDto;

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
/*	private final UsuarioService usuarioService;
	private final AgilesWs agilesWs;
	 
	
	@Autowired
    public AcessController(UsuarioService usuarioService, AgilesWs agilesWs) {
        this.usuarioService = usuarioService;
        this.agilesWs = agilesWs;
    }
	
	@PostMapping("/token")
	public ResponseEntity<Object> token(@RequestBody String token){
		AgilesUser usuarioAgilesUser = agilesWs.loginAgilesByToken(token);
		if(usuarioAgilesUser == null){
			return new ResponseEntity<Object>("Token invalido", HttpStatus.FORBIDDEN);
		}
		UsuarioDto usuario = usuarioService.getByUserToken(usuarioAgilesUser);
		return new ResponseEntity<Object>(usuario, HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Object>  login(@RequestBody UsuarioDto user){

		AgilesUser usuarioAgiles = agilesWs.loginAgiles(user.getLogin(), user.getSenha());
		if(usuarioAgiles == null){
			return new ResponseEntity<Object>("Usuario ou senha invalido", HttpStatus.FORBIDDEN);
		}
		UsuarioDto usuario = usuarioService.getByUserToken(usuarioAgiles);
		
		return new ResponseEntity<Object>(usuario, HttpStatus.OK);
        //return new ResponseEntity<>(UsuarioRespostaDto.transformaEmDTO(usuario), HttpStatus.CREATED);
	}*/
}
