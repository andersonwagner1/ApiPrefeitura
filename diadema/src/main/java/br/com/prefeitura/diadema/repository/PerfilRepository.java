package br.com.prefeitura.diadema.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.Perfil;

@Repository
public abstract interface PerfilRepository extends JpaRepository<Perfil, Long>{

	
	List<Perfil> findByNome(String nome);
	
	
	@Query("from Perfil where nome like concat(?1, '%')")
	List<Perfil> findPerfilByName(String nome);
	
	
	
}