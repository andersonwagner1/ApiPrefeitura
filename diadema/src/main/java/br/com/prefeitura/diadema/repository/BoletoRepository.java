package br.com.prefeitura.diadema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.PmdBoleto;

@Repository
public abstract interface BoletoRepository extends JpaRepository<PmdBoleto, Long>{
	
	@Query(value = "select x from PmdBoleto x where x.dsOrgao =:orgao AND x.nrAno= :nrAno  and x.nrProcesso = :nrProcesso order by x.nrProcessoBoleto DESC"  )
	public List<PmdBoleto> consultarBoletoPorNumeroProcesso(
			@Param("orgao") String orgao, 
			@Param("nrAno") Integer nrAno, 
			@Param("nrProcesso") Long nrProcesso);	
	
	
	
	@Query(value = "select x from PmdBoleto x where x.dsOrgao =:orgao AND x.nrAno= :nrAno  and x.nrProcesso = :nrProcesso and x.dsBoleto = 'BOLETO_EM_ANDAMENTO'"  )
	public PmdBoleto verificarSeExisteBoletoCadastradoPorNumeroProtocolo(
			@Param("orgao") String orgao, 
			@Param("nrAno") Integer nrAno, 
			@Param("nrProcesso") Long nrProcesso);


	@Query(value = "select x from PmdBoleto x where x.nrProcessoBoleto = :nrProcesso")
	public PmdBoleto consultarBoletoPorNumeroBoleto(@Param("nrProcesso") Long nrProcesso);
}
