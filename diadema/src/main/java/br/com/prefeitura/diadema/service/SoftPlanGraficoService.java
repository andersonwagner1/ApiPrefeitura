package br.com.prefeitura.diadema.service;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.util.ExecutarQuery;
import br.com.prefeitura.diadema.util.QueryPadrao;

@Service
public class SoftPlanGraficoService {
	
	private QueryPadrao q;
	
	public SoftPlanGraficoService(){
		q = new QueryPadrao();
	}
	
	public static void main(String main[]) throws SQLException {
		SoftPlanGraficoService s = new SoftPlanGraficoService();
		
		
		//s.listarQuantidadeProcessoPorAssuntoFiltradoPorDataInicialFinal(new Date(),new Date(),21L);
		s.listarTempoMedioQueUsuarioLevaParaTramitarOProcesso(new Date(),new Date(),21L);
		System.out.println("executado");
	}
	
	/**
	 * calcular quantidade de processos agrupado por Assuntos
	 * @param dtInicial data inicial
	 * @param dtFinal data final
	 * @param idAssunto assunto
	 * @return
	 */
	public Object[][] listarQuantidadeProcessoPorAssuntoFiltradoPorDataInicialFinal(Date dtInicial, Date dtFinal, Long idAssunto){
		ExecutarQuery e = new ExecutarQuery();
		
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT NMCLASSE, COUNT(*) AS QTD FROM (");
		sql.append(q.selectPadraoProcesso());
		sql.append(q.filtroSecretaria(dtInicial, dtFinal, idAssunto));
		sql.append(") GROUP BY NMCLASSE ");
		return e.executarQueryMatriz(sql.toString());
	}
	
	
	public Object[][] listarQuantidadeProcessoAgrupadoPorSituacaoFiltradoPorDataInicialFinal(Date dtInicial, Date dtFinal){
		ExecutarQuery e = new ExecutarQuery();
		
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT situacao, COUNT(*) AS QTD FROM (");
		sql.append(q.selectPadraoProcesso());
		sql.append(q.filtroPeriodo(dtInicial, dtFinal));
		sql.append(") GROUP BY situacao ");
		
		//System.out.println(sql.toString());
		return e.executarQueryMatriz(sql.toString());
	}
	
	
	
	/**
	 * Calcular o tempo médio do usuario leva para realizar uma tramitação uma ação por assunto
	 * @return
	 * @throws SQLException
	 */
	public Object[][] listarTempoMedioQueUsuarioLevaParaTramitarOProcesso(Date dtInicial, Date dtFinal, Long idAssunto)throws SQLException {
		ExecutarQuery e = new ExecutarQuery();
		
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT CDUSUARIORECEB, NMCLASSE, avg(CAST(DTENCAMINHA AS DATE) - CAST(DTRECEBTO AS DATE)) * 24 AS MEDIA FROM (");
		sql.append(q.selectListarTramitacaoUsuarios());		
		sql.append(q.filtroAssunto(dtInicial, dtFinal, idAssunto));
		sql.append(") WHERE DTRECEBTO IS NOT NULL ");
		sql.append(" AND CDUSUARIORECEB IS NOT NULL");
		sql.append(" AND DTENCAMINHA IS NOT NULL");
		sql.append(" GROUP BY CDUSUARIORECEB, NMCLASSE");
		return e.executarQueryMatriz(sql.toString());
	}
}
