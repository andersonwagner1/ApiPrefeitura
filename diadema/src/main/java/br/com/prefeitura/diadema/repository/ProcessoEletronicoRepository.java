package br.com.prefeitura.diadema.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.AgendaProcesso;

@Repository
public abstract interface ProcessoEletronicoRepository extends JpaRepository<AgendaProcesso, Long>{


	@Query(value="SELECT * FROM VIEW_PROCESSO_ELETRONICO", nativeQuery = true)
	List<Object[]> findProcessoByNumberProcess();
	
	
}