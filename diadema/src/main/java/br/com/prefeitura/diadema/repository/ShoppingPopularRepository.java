package br.com.prefeitura.diadema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.PmdBoleto;
import br.com.prefeitura.diadema.model.PmdShoppingPopular;

@Repository
public abstract interface ShoppingPopularRepository extends JpaRepository<PmdShoppingPopular, String>{
	
	
	/**
	 * Verifique antes de cadastrar um novo processo se o usuario ja não tem um cadastro aguardando a ser finalizado
	 * @param cpf
	 * @param ano
	 * @return
	 */
	@Query(value = "SELECT x from PmdShoppingPopular x where x.cpf =:cpf AND x.ano = :ano AND x.icSituacao IN('APROVADO','EXECUTANDO')")
	public List<PmdShoppingPopular> consultarSeExisteProcessoEmAndamento(@Param("cpf") String cpf, @Param("ano") Integer ano);
	
	
	@Query(value = "SELECT x FROM PmdShoppingPopular x WHERE x.ano = :ano AND x.icSituacao IN('APROVADO') ORDER BY x.criterioDePontuacao desc, x.criterioDeDesempate desc")
	public List<PmdShoppingPopular> listarRankingPelPontuacaoPorAno(@Param("ano") Integer ano);
	
	
	/**
	 * consulta retorna o usuario que esta com o processo
	 * @param cpf
	 * @param ano
	 * @return
	 */
	//@Query(value = "SELECT x from PmdShoppingPopular x where x.cpf =:cpf AND x.ano = :ano  AND x.icSituacao = 'EXECUCAO' ")
	//public PmdShoppingPopular consultaUsuario(@Param("cpf") String cpf, @Param("ano") Integer ano);
	
	
	/**
	 * verifica calculcar o processo
	 * @param ano
	 * @return
	 */
	//@Query(value = "SELECT x from PmdShoppingPopular x where x.ano = :ano  AND x.icSituacao = 'CONCLUIDO' ")
	//public List<PmdShoppingPopular> consultarProcessosConcluidos(@Param("ano") Integer ano);

	
	
	
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
