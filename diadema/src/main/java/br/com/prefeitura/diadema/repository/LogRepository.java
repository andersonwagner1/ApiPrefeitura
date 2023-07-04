package br.com.prefeitura.diadema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.PmdLogs;

@Repository
public abstract interface LogRepository extends JpaRepository<PmdLogs, Long>{
		
}
