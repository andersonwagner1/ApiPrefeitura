package br.com.prefeitura.diadema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.prefeitura.diadema.model.Perfil;
import br.com.prefeitura.diadema.repository.PerfilRepository;

@Service
public class PerfilService {
	

	private PerfilRepository perfilRepository;

	@Autowired
	public PerfilService(PerfilRepository perfilRepository){
		this.perfilRepository = perfilRepository;
	}

	@Transactional
	public Perfil save(Perfil perfil) {
		return perfilRepository.save(perfil);
	}
	
	public List<Perfil> findByNome(String nome) {
		return perfilRepository.findPerfilByName(nome);
	}


	public boolean existsPerfilByName(String nome) {
		List<Perfil> perfil = perfilRepository.findByNome(nome);
		return perfil.size() > 0;
	}

	public List<Perfil> getAllPerfil() {
		return perfilRepository.findAll();
	}

	public Optional<Perfil> getPerfilById(Long id) {
		// TODO Auto-generated method stub
		return perfilRepository.findById(id);
	}

	public Page<Perfil> getAllPerfil(Pageable pageable) {
	
		return perfilRepository.findAll(pageable);
		
	}

	
	
}
