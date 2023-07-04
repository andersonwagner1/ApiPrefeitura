package br.com.prefeitura.diadema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.PmdCnae;

@Repository
public abstract interface CnaeRepository extends JpaRepository<PmdCnae, Long>{
	
	@Query(value = "select x from PmdCnae x where x.cdCnae =:numero")
	public PmdCnae consultarCnaePorNumero(@Param("numero") String numero);	
	
	@Query(value = "select x from PmdCnae x where x.dsCnae =:descricao" )
	public List<PmdCnae> listarCnaePorDescricao(@Param("descricao") String descricao);	
}
