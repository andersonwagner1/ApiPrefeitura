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
@RequestMapping("/api/arquivos")
public class ArquivosController {
	
	
}
