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

import br.com.prefeitura.diadema.dto.UnidadeDto;
import br.com.prefeitura.diadema.dto.UsuarioDto;
import br.com.prefeitura.diadema.service.DepartamentService;
import br.com.prefeitura.diadema.service.ProcessoService;
import br.com.prefeitura.diadema.service.UsuarioService;
import br.com.prefeitura.diadema.ws.AgilesWs;

/**
 * Controle de acesso do usuario
 * @author anderson.oliveira
 *
 */
@RestController
@RequestMapping("/api/prefeitura/unidade")
public class DepartamentController {
	
	private final UsuarioService usuarioService;
	private final DepartamentService departamentService;
	
	
	@Autowired
    public DepartamentController(UsuarioService usuarioService, DepartamentService departamentService, ProcessoService processoService, AgilesWs agilesWs) {
        this.usuarioService = usuarioService;
        this.departamentService = departamentService;
    }
	
	@PutMapping(value = "/usuario/remove/{id}")
	public ResponseEntity<UsuarioDto> remove(@PathVariable(value="id") Long idUsuario,  @RequestBody UnidadeDto departamentDto) throws SQLException{
		UsuarioDto user = usuarioService.findUserById(idUsuario);		
		departamentService.removeUserInDepartamento(user, departamentDto);
				
		return new ResponseEntity<UsuarioDto>(user, HttpStatus.OK);
	}
	
	@PutMapping(value = "/usuario/add/{id}")
	public ResponseEntity<UsuarioDto> add(@PathVariable(value="id") Long idUsuario,  @RequestBody UnidadeDto departamentDto) throws SQLException{
		UsuarioDto user = usuarioService.findUserById(idUsuario);
		departamentService.addUserInDepartamento(user, departamentDto);
				
		return new ResponseEntity<UsuarioDto>(user, HttpStatus.OK);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<UnidadeDto> getDepartamentById(@PathVariable(value="id") Long id) throws SQLException{
		 UnidadeDto departament = departamentService.findDepartamentById(id);
		return new ResponseEntity<UnidadeDto>(departament, HttpStatus.OK);
	}
	
	
	
	
}
