package br.com.prefeitura.diadema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.PmdShoppingPopular;
import br.com.prefeitura.diadema.model.PmdShoppingPopularConfiguracao;

@Repository
public abstract interface ShoppingPopularConfiguracaoRepository extends JpaRepository<PmdShoppingPopularConfiguracao, Integer>{
	
	
	/**
	 * Verifique antes de cadastrar um novo processo se o usuario ja não tem um cadastro aguardando a ser finalizado
	 * @param cpf
	 * @param ano
	 * @return
	 */
	//@Query(value = "SELECT x from PmdShoppingPopularConfiguracao x WHERE x.ano = : id")
	//public PmdShoppingPopularConfiguracao consultarConfiguracao();

	
	
	
	/*
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
	public PmdBoleto consultarBoletoPorNumeroBoleto(@Param("nrProcesso") Long nrProcesso);*/
}
