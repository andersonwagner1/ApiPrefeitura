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
@RequestMapping("/api/prefeitura/usuario")
public class UserController {
	
	
	//public AcessController(){
		
//	}
	private final UsuarioService usuarioService;
	private final DepartamentService departamentService;
	private final ProcessoService processoService;
	private final AgilesWs agilesWs;
	
	
	@Autowired
    public UserController(UsuarioService usuarioService, DepartamentService departamentService, ProcessoService processoService, AgilesWs agilesWs) {
        this.usuarioService = usuarioService;
        this.processoService = processoService;
        this.departamentService = departamentService;
        this.agilesWs = agilesWs;
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
	
	@GetMapping(value ="/unidade/pesquisa/{name}")
	public ResponseEntity<Object> findDepartamentoByName(@PathVariable(value="name") String name) throws SQLException{
		List<UnidadeDto> departament = departamentService.findDepartmentByName(name);
		return new ResponseEntity<Object>(departament, HttpStatus.OK);
	}
	
	@PutMapping(value ="/unidade/add/{idUnidade}/{modo}")
	public ResponseEntity<Object> addUserInDepartament(@PathVariable(value="idUnidade") Long idUnidade, @PathVariable(value="modo")Integer modo, @RequestBody UsuarioDto user) throws SQLException{
		
		//UsuarioDto user = usuarioService.findUserById(user.getId());
		UnidadeDto unidade = departamentService.findDepartamentById(idUnidade);
		
		if(modo == 1){
			unidade.setTipo("Analista");
		}else{
			unidade.setTipo("Lider");
		}
		
		departamentService.addUserInDepartamento(user, unidade);
		if(user == null){
			return new ResponseEntity<Object>("Houve algum erro", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(user, HttpStatus.OK);
	}
	
	
	@PutMapping(value ="/unidade/remove/{idUnidade}")
	public ResponseEntity<Object> removeUserIndDepartamento(@PathVariable(value="idUnidade") Long idUnidade, @RequestBody UsuarioDto user) throws SQLException{		
		UnidadeDto unidade = departamentService.findDepartamentById(idUnidade);
		
		departamentService.removeUserInDepartamento(user, unidade);
		
		if(user == null){
			return new ResponseEntity<Object>("Id do usuario não encontrado", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(user, HttpStatus.OK);
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
	
	@PostMapping(value = "/update")
	public ResponseEntity<Object> update(@RequestBody UsuarioDto usuario) throws SQLException{
		usuarioService.updateUser(usuario);
		agilesWs.updateUser(usuario);
		
		//UsuarioDto user = usuarioService.save(usuario);		
		return new ResponseEntity<Object>(usuario, HttpStatus.OK);
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
		
		usuarioService.desactivatedUser(user);
		agilesWs.desactiveUserAgiles(user.getPkUsuarioAgiles());
		return new ResponseEntity<Object>(user, HttpStatus.OK);
	}
	
	
}
