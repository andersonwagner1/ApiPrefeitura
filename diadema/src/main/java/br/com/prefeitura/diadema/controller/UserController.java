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
import br.com.prefeitura.diadema.service.DepartamentService;
import br.com.prefeitura.diadema.service.ProcessoService;
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
	private final DepartamentService departamentService;
	private final ProcessoService processoService;
	
	
	@Autowired
    public UserController(UsuarioService usuarioService, DepartamentService departamentService, ProcessoService processoService) {
        this.usuarioService = usuarioService;
        this.processoService = processoService;
        this.departamentService = departamentService;
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
	
	
	@GetMapping(value ="/detalhe/{id}")
	public ResponseEntity<Object> findUserById(@PathVariable(value="id") Long id) throws SQLException{
		UsuarioDto user = usuarioService.findUserById(id);
		if(user == null){
			return new ResponseEntity<Object>("Id do usuario não encontrado", HttpStatus.NOT_FOUND);
		}
		user.setProcessos(processoService.findProcessoByUser(user.getId()));
		user.setUnidades(departamentService.findDepartamentByUser(user.getId()));
		
		return new ResponseEntity<Object>(user, HttpStatus.OK);
	}
	
	@PutMapping(value = "/update")
	public ResponseEntity<UsuarioDto> update(@RequestBody UsuarioDto usuario){
		UsuarioDto user = usuarioService.save(usuario);		
		return new ResponseEntity<UsuarioDto>(user, HttpStatus.OK);
	}
	
	@PostMapping(value ="/desativar")
	public ResponseEntity<Object> desativarUsuario(@RequestBody Long id) throws SQLException{
		UsuarioDto user = usuarioService.findUserById(id);
		
		user.setUnidades(departamentService.findDepartamentByUser(user.getId()));
		if(user.getUnidades() != null && user.getUnidades().size() > 0) {
			//return new ResponseEntity<Object>("Usuario tem unidade cadastrado, por favor excluia as unidade primeiro", HttpStatus.CONFLICT);
			throw new SQLException("Usuario tem unidade cadastrado, por favor excluia as unidade primeiro");
		}
				
		user.setProcessos(processoService.findProcessoByUser(user.getId()));
		if(user.getProcessos() != null && user.getProcessos().size() > 0) {
			throw new SQLException("Usuario tem processos cadastrado, por favor excluia as unidade primeiro");
		}
		return new ResponseEntity<Object>(user, HttpStatus.OK);
	}
}
