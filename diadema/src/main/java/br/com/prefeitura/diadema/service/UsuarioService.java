package br.com.prefeitura.diadema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.model.Usuario;
import br.com.prefeitura.diadema.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	
	
	private UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository){
		this.usuarioRepository = usuarioRepository;
	}

	public Usuario login(Usuario usuario) {
		usuario = usuarioRepository.findByLogin(usuario.getLogin());
		usuario.setListaPerfil(null);
		usuario.setListaPermissao(null);
		return usuario;
	}

	
}
