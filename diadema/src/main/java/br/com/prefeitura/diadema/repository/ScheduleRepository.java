package br.com.prefeitura.diadema.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.AgendaProcesso;
import br.com.prefeitura.diadema.model.Perfil;

@Repository
public abstract interface ScheduleRepository extends JpaRepository<AgendaProcesso, Long>{


	@Query(value="SELECT * FROM VIEW_PROCESSO_ELETRONICO", nativeQuery = true)
	List<Object[]> findProcessoByNumberProcess();
	
	
	List<AgendaProcesso> findByDtAvisarBetween(Date dtStart, Date dtEnd);

	@Query(value = "FROM AgendaProcesso Where dtAvisar >= sysdate")
	List<AgendaProcesso> findTaskActivate();
	

	@Query(value="FROM AgendaProcesso WHERE dtAviso = ?1")
	List<AgendaProcesso> findScheduleNoticeNow(Date dtNow);
	
	
	@Query(value="FROM AgendaProcesso WHERE dtAviso = ?1")
	List<AgendaProcesso> findScheduleNoticeYesterney(Date dtNow);
	
	
	@Query(value="FROM AgendaProcesso WHERE dtAviso = ?1")
	List<AgendaProcesso> findScheduleNoticeFiveDaysAgo(Date dtNow);
	
	@Query("from Perfil where nome like concat(?1, '%')")
	List<Perfil> findPerfilByName(String nome);
	
	
}