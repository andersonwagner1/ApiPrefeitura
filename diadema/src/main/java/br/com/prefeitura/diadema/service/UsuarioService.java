package br.com.prefeitura.diadema.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.UsuarioDto;
import br.com.prefeitura.diadema.model.Usuario;
import br.com.prefeitura.diadema.repository.UsuarioRepository;
import br.com.prefeitura.diadema.security.Token;
import br.com.prefeitura.diadema.security.TokenUtils;
import br.com.prefeitura.diadema.ws.agiles.AgilesUser;

@Service
public class UsuarioService {
	
	
	
	private UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository){
		this.usuarioRepository = usuarioRepository;
	}

	private UsuarioDto login(UsuarioDto usuario) {
		Usuario user = usuarioRepository.findByLogin(usuario.getLogin());
		
		Token token = new Token(TokenUtils.createToken(usuario.getNome()));
		
		BeanUtils.copyProperties(user,usuario );
		usuario.setToken(token);	
		return usuario;
	}
	
	public UsuarioDto getByUserToken(AgilesUser agilesUser){
		Usuario user = usuarioRepository.findByPk(agilesUser.getPrimaryKey());
	
		if(user == null){
			user = new Usuario();
			user.setEmail(agilesUser.getEmail());
			user.setLogin(agilesUser.getEmail().split("@")[0]);
			user.setNome(agilesUser.getDisplayName());
			user.setPk(agilesUser.getPrimaryKey());	
			user = usuarioRepository.save(user);
		}
		
		Token token = new Token(TokenUtils.createToken(user.getNome()));
		
		UsuarioDto usuario = new UsuarioDto();
		usuario.setToken(token);
		
		BeanUtils.copyProperties(user, usuario);
		return usuario;
	}
	
	
	
	public UsuarioDto save(UsuarioDto usuario){
		Usuario user = new Usuario();
		BeanUtils.copyProperties(usuario, user);
		user = this.usuarioRepository.save(user);
		BeanUtils.copyProperties(user,usuario );
		return usuario;
	}

	public List<UsuarioDto> list(UsuarioDto usuario) {		
		List<Usuario> user = usuarioRepository.findAll();	
		
		List<UsuarioDto> usuarios = new ArrayList<UsuarioDto>();
		BeanUtils.copyProperties(user,usuarios);		
		return usuarios;
	}

	public UsuarioDto getById(UsuarioDto usuario) {
		Optional<Usuario> user = usuarioRepository.findById(usuario.getId());		
		BeanUtils.copyProperties(user,usuario);		
		return usuario;
	}
	
	

	
}
