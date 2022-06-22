package br.com.prefeitura.diadema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.prefeitura.diadema.model.Permissao;
import br.com.prefeitura.diadema.repository.PermissaoRepository;

@Service
public class PermissionService {
	

	private PermissaoRepository permissaoRepository;

	@Autowired
	public PermissionService(PermissaoRepository permissaoRepository){
		this.permissaoRepository = permissaoRepository;
	}

	@Transactional
	public Permissao save(Permissao Permissao) {
		return permissaoRepository.save(Permissao);
	}

	public List<Permissao> findByName(String nome) {
		return  permissaoRepository.findByNome(nome);
		
	}

	public List<Permissao> getAllPermissao() {
		return permissaoRepository.findAll();
	}
	
	public boolean existsPerfilByName(String nome){
		return permissaoRepository.findByNome(nome).size()>0;
	}

	public Optional<Permissao> getPermissionById(Long id) {
		// TODO Auto-generated method stub

		return permissaoRepository.findById(id);
	}

	public Page<Permissao> getAllPermissao(Pageable pageable) {
	
		return permissaoRepository.findAll(pageable);
		
	}

	

	
}
