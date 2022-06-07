package br.com.prefeitura.diadema.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.security.Token;

@RestController
public class TesteAcesso  {
	
	private UsuarioService usuarioService = new UsuarioService();

	@GetMapping("/teste")
	public String teste(){
		return "permissão sem senha";
	}
	
	@PostMapping("/login")
	public ResponseEntity<Token> logar(String usuario){
		usuario = "anderson";
		Token token = usuarioService.gerarToken(usuario);
		if(token != null){
			return ResponseEntity.ok(token);
		}
		return ResponseEntity.status(200).build();
	}
	
	@GetMapping("/senha")
	public String senha(){
		return "permissão de senha";
	}


}
