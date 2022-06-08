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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.dto.PerfilDto;
import br.com.prefeitura.diadema.model.Perfil;
import br.com.prefeitura.diadema.service.PerfilService;

/**
 * Controle de acesso do usuario
 * @author anderson.oliveira
 *
 */
@RestController
@CrossOrigin(origins = "*" , maxAge =3600)
@RequestMapping("/api/prefeitura/perfil")
public class PerfilController {
	
	private final PerfilService perfilService;
	
	
	@Autowired
    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }
	
	@PostMapping(value = "/add")
	public ResponseEntity<Object> add(@RequestBody PerfilDto perfilDto){
		if(perfilService.existsPerfilByName(perfilDto.getNome())){
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Registro ja existe");
		}
		
		Perfil perfil = new Perfil();
		BeanUtils.copyProperties(perfilDto,perfil);
		//adicionar algum outro valor necessasrio
		//na tabela
		 perfil = perfilService.save(perfil);	
		return ResponseEntity.status(HttpStatus.CREATED).body(perfil);
	}
	
	

	@PutMapping(value = "/update")
	public ResponseEntity<Object> update(@PathParam(value="id") Long id, @RequestBody PerfilDto perfilDto){
		Optional<Perfil> perfilOptinal = perfilService.getPerfilById(id);
		
		if(!perfilOptinal.isPresent()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Registro não encotnrado");
		}
		Perfil perfil = perfilOptinal.get();
		perfil.setNome(perfilDto.getNome());
		
		//adicionar algum outro valor necessasrio
		//na tabela
		 perfil = perfilService.save(perfil);	
		return ResponseEntity.status(HttpStatus.OK).body(perfil);
	}
	
	
	@GetMapping(value ="/listAll")
	public ResponseEntity<List<Perfil>> getAll(){
		List<Perfil> perfil = perfilService.getAllPerfil();
		return ResponseEntity.status(HttpStatus.OK).body(perfil);
	}
	
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Object> getById(@PathParam(value="id") Long id){
		Optional<Perfil> perfilMModelOpetinal = perfilService.getPerfilById(id);
		if(!perfilMModelOpetinal.isPresent()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Registro não encontrado");
			
			
		}
		return ResponseEntity.status(HttpStatus.OK).body(perfilMModelOpetinal.get());
	}
	
	@GetMapping(value="/page")
	public ResponseEntity<Page<Perfil>> getAllPerfil(@PageableDefault(page = 0, size = 10, sort = "nome", direction = Sort.Direction.ASC) Pageable pageable){
		Page<Perfil> perfilPage = perfilService.getAllPerfil(pageable);
		return ResponseEntity.status(HttpStatus.OK).body(perfilPage);
	}
	
}
