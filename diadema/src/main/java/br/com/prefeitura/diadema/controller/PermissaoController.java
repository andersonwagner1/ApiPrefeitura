package br.com.prefeitura.diadema.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.dto.PerfilDto;
import br.com.prefeitura.diadema.dto.PermissaoDto;
import br.com.prefeitura.diadema.model.Perfil;
import br.com.prefeitura.diadema.model.Permissao;
import br.com.prefeitura.diadema.service.PerfilService;
import br.com.prefeitura.diadema.service.PermissionService;

/**
 * Controle de acesso do usuario
 * @author anderson.oliveira
 *
 */
@RestController
@CrossOrigin(origins = "*" , maxAge =3600)
@RequestMapping("/api/prefeitura/permissao")
public class PermissaoController {
		
	private final PermissionService permissionService;
	
	
	@Autowired
    public PermissaoController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }
	
	@GetMapping(value ="/name/{name}")
	public ResponseEntity<Object> getByName(@PathVariable(value="name") String name){
		List<Permissao> permissionList = permissionService.findByName(name);		
		return ResponseEntity.status(HttpStatus.OK).body(permissionList);
	}
	
	
	
	
	@PostMapping(value = "/add")
	public ResponseEntity<Object> add(@RequestBody PermissaoDto permissionDto){
		if(permissionService.existsPerfilByName(permissionDto.getNome())){
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Registro ja existe");
		}
		
		Permissao permission = new Permissao();
		
		BeanUtils.copyProperties(permission, permissionDto);
		//adicionar algum outro valor necessasrio
		//na tabela
		permission = permissionService.save(permission);	
		return ResponseEntity.status(HttpStatus.CREATED).body(permission);
	}
	
	@PostMapping(value = "/update")
	public ResponseEntity<Object> update(@RequestBody PermissaoDto permissionDto){
		Optional<Permissao> perfilOptinal = permissionService.getPermissionById(permissionDto.getId());
		
		if(!perfilOptinal.isPresent()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Registro não encotnrado");
		}
		Permissao permission = perfilOptinal.get();
		permission.setNome(permissionDto.getNome());
		permission.setObservacao(permissionDto.getObservacao());
		permission.setSituacao(permissionDto.getSituacao());
		
		//adicionar algum outro valor necessasrio
		//na tabela
		permission = permissionService.save(permission);	
		return ResponseEntity.status(HttpStatus.OK).body(permission);
	}
	
	
	/*@GetMapping(value ="/listAll")
	public ResponseEntity<List<Perfil>> getAll(){
		List<Perfil> perfil = perfilService.getAllPerfil();
		return ResponseEntity.status(HttpStatus.OK).body(perfil);
	}
	*/
	
	/*@GetMapping(value ="/{id}")
	public ResponseEntity<Object> getById(@PathVariable(value="id") Long id){
		Optional<Perfil> perfilMModelOpetinal = perfilService.getPerfilById(id);
		if(!perfilMModelOpetinal.isPresent()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Registro não encontrado");
		}
		return ResponseEntity.status(HttpStatus.OK).body(perfilMModelOpetinal.get());
	}*/
	
	/*@GetMapping(value="/page")
	public ResponseEntity<Page<Perfil>> getAllPerfil(@PageableDefault(page = 0, size = 10, sort = "nome", direction = Sort.Direction.ASC) Pageable pageable){
		Page<Perfil> perfilPage = perfilService.getAllPerfil(pageable);
		return ResponseEntity.status(HttpStatus.OK).body(perfilPage);
	}*/
	
}
