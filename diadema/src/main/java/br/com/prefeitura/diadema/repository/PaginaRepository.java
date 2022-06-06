package br.com.prefeitura.diadema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.Pagina;

@Repository
public abstract interface PaginaRepository extends JpaRepository<Pagina, Long>{
	
}
