package br.com.prefeitura.diadema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.PmdVreSolicitacao;

@Repository
public abstract interface VreSolicitacaoRespository extends JpaRepository<PmdVreSolicitacao, String>{
	
	@Query(value = "select x from PmdVreSolicitacao x where x.nrProcessoBoleto =:protocolo"  )
	public PmdVreSolicitacao consultarSolicitacao(@Param("protocolo") String orgao);

	//verifica todos os protocolos que foram carregados no sistema
	@Query(value = "SELECT x from PmdVreSolicitacao x where x.dtCarga >= trunc(sysdate) - 7"  )
	public List<PmdVreSolicitacao> listarProtocolosDeUmPeriodoCarga();	
}
