package br.com.prefeitura.diadema.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teste")
public class TesteAcesso {
	
	@GetMapping("/novoTeste")
	public String teste(){
		return "isso é um teste funcionamento de pagina";
	}

}
