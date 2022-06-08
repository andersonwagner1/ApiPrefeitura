package br.com.prefeitura.diadema.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.Perfil;

@Repository
public abstract interface PerfilRepository extends JpaRepository<Perfil, Long>{

	Perfil findByNome(String nome);
	
	
}