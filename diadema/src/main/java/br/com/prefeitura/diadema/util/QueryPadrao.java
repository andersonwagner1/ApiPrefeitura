package br.com.prefeitura.diadema.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QueryPadrao {
	public String selectPadraoProcesso() {
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT ORGAO1.SGORGAOSETOR,");
		sql.append("                PROC.NUPROCESSO,");
		sql.append("                PROC.NUANO,");
		sql.append("                CASE PROC.Flsituacao");
		sql.append("                  WHEN 'E' THEN");
		sql.append("                   'Em andamento'");
		sql.append("                  WHEN 'C' THEN");
		sql.append("                   'Cancelado'");
		sql.append("                  WHEN 'Q' THEN");
		sql.append("                   'Reaquivado'");
		sql.append("                  WHEN 'R' THEN");
		sql.append("                   'Desarquivado'");                  
		sql.append("                  WHEN 'A' THEN");
		sql.append("                   'Arquivado'");
		sql.append("                end AS situacao,");
		sql.append("                PROC.FLSITUACAO,");
		sql.append("                ORGAO.CDORGAOSETOR,");
		sql.append("                ORGAO.NMORGAOSETOR,");
		sql.append("                orgao.sgorgaosetor,");
		sql.append("                PROC.DTENTRADA,");
		sql.append("                PROC.DTRECEBTO,");
		sql.append("                PROC.DTCONCLUSAO,");
		sql.append("                CLASSE.CDCLASSE,");
		sql.append("                CLASSE.NMCLASSE,");
		sql.append("                id_secretaria,");
		sql.append("                NOME_SECRETARIA,");
		sql.append("                USUARIO.CDUSUARIO,");
		sql.append("                USUARIO.NMUSUARIO");
		sql.append("           from ECPAPROCESSO proc");
		sql.append("          inner join ECPATRAMITACAO tram on tram.nuano = proc.nuano");
		sql.append("                                        and tram.nuprocesso = proc.nuprocesso");
		sql.append("                                        AND PROC.CDORGAOSETOR =");
		sql.append("                                            TRAM.CDORGAOSETOR");
		sql.append("          inner join ECPAORGAOSETOR orgao on orgao.cdorgaosetor =");
		sql.append("                                             tram.cdorgaotrami");
		sql.append("          INNER JOIN ECPAORGAOSETOR ORGAO1 ON ORGAO1.CDORGAOSETOR =");
		sql.append("                                              PROC.CDORGAOSETOR");
		sql.append("          INNER JOIN ECPAPROCASSUNTO ASSUNTO ON ASSUNTO.NUANO = PROC.NUANO");
		sql.append("                                            AND ASSUNTO.NUPROCESSO =");
		sql.append("                                                PROC.NUPROCESSO");
		sql.append("          INNER JOIN EPCLCLASSE CLASSE ON CLASSE.CDCLASSE = ASSUNTO.CDASSUNTO");
		sql.append("          INNER JOIN ESEGUSUARIO USUARIO ON USUARIO.CDUSUARIO =");
		sql.append("                                            TRAM.CDUSUARIORECEB");
		sql.append("           LEFT JOIN (SELECT S6.CDORGAOSETOR AS ID,");
		sql.append("                            S6.NMORGAOSETOR AS NOME_DEPARTAMENTO,");
		sql.append("                            S1.CDORGAOSETOR AS ID_SECRETARIA,");
		sql.append("                            S1.NMORGAOSETOR AS NOME_SECRETARIA");
		sql.append("                       FROM ECPAORGAOSETOR S1");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S2 ON S2.CDSETORPAI =");
		sql.append("                                                      S1.CDORGAOSETOR");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S3 ON S3.CDSETORPAI =");
		sql.append("                                                      S2.CDORGAOSETOR");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S4 ON S4.CDSETORPAI =");
		sql.append("                                                      S3.CDORGAOSETOR");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S5 ON S5.CDSETORPAI =");
		sql.append("                                                      S4.CDORGAOSETOR");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S6 ON S6.CDSETORPAI =");
		sql.append("                                                      S5.CDORGAOSETOR");
		sql.append("                      WHERE S1.CDSETORPAI  IN(1,2,4,3)");
		sql.append("                     UNION");
		sql.append("                     SELECT S5.CDORGAOSETOR,");
		sql.append("                            S5.NMORGAOSETOR,");
		sql.append("                            S1.CDORGAOSETOR,");
		sql.append("                            S1.NMORGAOSETOR");
		sql.append("                       FROM ECPAORGAOSETOR S1");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S2 ON S2.CDSETORPAI =");
		sql.append("                                                      S1.CDORGAOSETOR");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S3 ON S3.CDSETORPAI =");
		sql.append("                                                      S2.CDORGAOSETOR");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S4 ON S4.CDSETORPAI =");
		sql.append("                                                      S3.CDORGAOSETOR");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S5 ON S5.CDSETORPAI =");
		sql.append("                                                      S4.CDORGAOSETOR");
		sql.append("                      WHERE S1.CDSETORPAI  IN(1,2,4,3)");
		sql.append("                     UNION");
		sql.append("                     SELECT S4.CDORGAOSETOR,");
		sql.append("                            S4.NMORGAOSETOR,");
		sql.append("                            S1.CDORGAOSETOR,");
		sql.append("                            S1.NMORGAOSETOR");
		sql.append("                       FROM ECPAORGAOSETOR S1");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S2 ON S2.CDSETORPAI =");
		sql.append("                                                      S1.CDORGAOSETOR");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S3 ON S3.CDSETORPAI =");
		sql.append("                                                      S2.CDORGAOSETOR");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S4 ON S4.CDSETORPAI =");
		sql.append("                                                      S3.CDORGAOSETOR");
		sql.append("                      WHERE S1.CDSETORPAI  IN(1,2,4,3)");
		sql.append("                     UNION");
		sql.append("                     SELECT S3.CDORGAOSETOR,");
		sql.append("                            S3.NMORGAOSETOR,");
		sql.append("                            S1.CDORGAOSETOR,");
		sql.append("                            S1.NMORGAOSETOR");
		sql.append("                       FROM ECPAORGAOSETOR S1");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S2 ON S2.CDSETORPAI =");
		sql.append("                                                      S1.CDORGAOSETOR");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S3 ON S3.CDSETORPAI =");
		sql.append("                                                      S2.CDORGAOSETOR");
		sql.append("                      WHERE S1.CDSETORPAI  IN(1,2,4,3)");
		sql.append("                     UNION");
		sql.append("                     SELECT S2.CDORGAOSETOR,");
		sql.append("                            S2.NMORGAOSETOR,");
		sql.append("                            S1.CDORGAOSETOR,");
		sql.append("                            S1.NMORGAOSETOR");
		sql.append("                       FROM ECPAORGAOSETOR S1");
		sql.append("                      INNER JOIN ECPAORGAOSETOR S2 ON S2.CDSETORPAI =");
		sql.append("                                                      S1.CDORGAOSETOR");
		sql.append("                      WHERE S1.CDSETORPAI  IN(1,2,4,3)) SECRETARIA ON ORGAO.CDORGAOSETOR =");
		sql.append("                                                             SECRETARIA.ID");
		sql.append("          WHERE TRAM.NUANO || LPAD(TRAM.NUPROCESSO, 9, 0) ||");
		sql.append("                LPAD(TRAM.NUTRAMITE, 9, 0) IN");
		sql.append("                (SELECT NUANO || LPAD(NUPROCESSO, 9, 0) ||");
		sql.append("                        LPAD(Max(NUTRAMITE), 9, 0)");
		sql.append("                   FROM ECPATRAMITACAO");
		sql.append("                  GROUP BY NUANO, NUPROCESSO)");
		//sql.append("         AND DTENTRADA BETWEEN '01-11-2022' AND '13-03-2023'");
		//sql.append("         AND ORGAO1.SGORGAOSETOR = 'PMD'");
		return sql.toString();
	}
	
	
	public String tabelaAuxiliarParaSecretarias(){
		StringBuffer bl = new StringBuffer();
		bl.append(" SELECT ");
		bl.append(" S6.CDORGAOSETOR,      "); 
		bl.append(" S6.NMORGAOSETOR,"); 
		bl.append(" S1.CDORGAOSETOR,"); 
		bl.append(" S1.NMORGAOSETOR     ");   
		bl.append(" FROM ECPAORGAOSETOR S1"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S2 ON S2.CDSETORPAI = S1.CDORGAOSETOR"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S3 ON S3.CDSETORPAI = S2.CDORGAOSETOR"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S4 ON S4.CDSETORPAI = S3.CDORGAOSETOR"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S5 ON S5.CDSETORPAI = S4.CDORGAOSETOR"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S6 ON S6.CDSETORPAI = S5.CDORGAOSETOR"); 
		bl.append(" WHERE S1.CDSETORPAI = 1"); 
		bl.append(" UNION"); 
		bl.append(" SELECT "); 
		bl.append(" S5.CDORGAOSETOR,");        
		bl.append(" S5.NMORGAOSETOR,"); 
		bl.append(" S1.CDORGAOSETOR,"); 
		bl.append(" S1.NMORGAOSETOR     ");   
		bl.append(" FROM ECPAORGAOSETOR S1"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S2 ON S2.CDSETORPAI = S1.CDORGAOSETOR"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S3 ON S3.CDSETORPAI = S2.CDORGAOSETOR"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S4 ON S4.CDSETORPAI = S3.CDORGAOSETOR"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S5 ON S5.CDSETORPAI = S4.CDORGAOSETOR"); 
		bl.append(" WHERE S1.CDSETORPAI = 1"); 
		bl.append(" UNION"); 
		bl.append(" SELECT "); 
		bl.append(" S4.CDORGAOSETOR,");        
		bl.append(" S4.NMORGAOSETOR,"); 
		bl.append(" S1.CDORGAOSETOR,"); 
		bl.append(" S1.NMORGAOSETOR     ");   
		bl.append(" FROM ECPAORGAOSETOR S1"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S2 ON S2.CDSETORPAI = S1.CDORGAOSETOR"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S3 ON S3.CDSETORPAI = S2.CDORGAOSETOR"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S4 ON S4.CDSETORPAI = S3.CDORGAOSETOR  "); 
		bl.append(" WHERE S1.CDSETORPAI = 1"); 
		bl.append(" UNION"); 
		bl.append(" SELECT "); 
		bl.append(" S3.CDORGAOSETOR,");        
		bl.append(" S3.NMORGAOSETOR,"); 
		bl.append(" S1.CDORGAOSETOR,"); 
		bl.append(" S1.NMORGAOSETOR     ");   
		bl.append(" FROM ECPAORGAOSETOR S1"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S2 ON S2.CDSETORPAI = S1.CDORGAOSETOR"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S3 ON S3.CDSETORPAI = S2.CDORGAOSETOR"); 
		bl.append(" WHERE S1.CDSETORPAI = 1"); 
		bl.append(" UNION"); 
		bl.append(" SELECT "); 
		bl.append(" S2.CDORGAOSETOR,");        
		bl.append(" S2.NMORGAOSETOR,"); 
		bl.append(" S1.CDORGAOSETOR,"); 
		bl.append(" S1.NMORGAOSETOR     ");   
		bl.append(" FROM ECPAORGAOSETOR S1"); 
		bl.append(" INNER JOIN ECPAORGAOSETOR S2 ON S2.CDSETORPAI = S1.CDORGAOSETOR"); 
		bl.append(" WHERE S1.CDSETORPAI = 1"); 
		return bl.toString();
	}

	public String selectListarTramitacaoUsuarios() {
		StringBuffer bl = new StringBuffer();
		bl.append(" SELECT TRAMITACAO.DTRECEBTO, ");
		bl.append("       TRAMITACAO.DTENCAMINHA, ");
		bl.append("               TRAMITACAO.CDUSUARIORECEB, ");
		bl.append("               CLASSE.CDCLASSE, ");
		bl.append("               CLASSE.NMCLASSE ");
        
		bl.append("          from ECPAPROCESSO proc ");
		bl.append(" inner join ECPAULTTRAMIVOL tram on tram.nuano = proc.nuano ");
		bl.append("                                and tram.nuprocesso = proc.nuprocesso ");
		bl.append("                                AND PROC.CDORGAOSETOR =TRAM.CDORGAOSETOR ");
		bl.append("  inner join ECPAORGAOSETOR orgao on orgao.cdorgaosetor = tram.cdorgaotrami ");
		bl.append(" INNER JOIN ECPAORGAOSETOR ORGAO1 ON ORGAO1.CDORGAOSETOR =  PROC.CDORGAOSETOR ");
		bl.append(" INNER JOIN ECPAPROCASSUNTO ASSUNTO ON ASSUNTO.NUANO = PROC.NUANO ");
		bl.append("                                   AND ASSUNTO.NUPROCESSO = PROC.NUPROCESSO ");
		bl.append(" INNER JOIN EPCLCLASSE CLASSE ON CLASSE.CDCLASSE = ASSUNTO.CDASSUNTO ");
		bl.append(" INNER join ECPATRAMITACAO TRAMITACAO ON TRAMITACAO.NUANO = PROC.NUANO ");
		bl.append("                                     AND TRAMITACAO.NUPROCESSO = PROC.NUPROCESSO ");
		bl.append("                                     AND PROC.CDORGAOSETOR = TRAMITACAO.CDORGAOSETOR");
		
		return bl.toString();
		
		// TODO Auto-generated method stub
		
	}

	public String filtroSecretaria(Date dataInicial, Date dataFinal,Long secretaria) {
		SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");
		StringBuffer sql = new StringBuffer();
		sql.append(" AND ID_SECRETARIA = " + secretaria);
		sql.append(" AND DTENTRADA BETWEEN '" + dt1.format(dataInicial) + "' AND  '" + dt1.format(dataFinal) + "'");
		return sql.toString();
	}
	
	public String filtroPeriodo(Date dataInicial, Date dataFinal) {
		SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");
		StringBuffer sql = new StringBuffer();
		sql.append(" AND DTENTRADA BETWEEN '" + dt1.format(dataInicial) + "' AND  '" + dt1.format(dataFinal) + "'");
		//sql.append(" AND ORGAO1.SGORGAOSETOR = 'PMD'");
		return sql.toString();
	}
	
	
	public String filtroAssunto(Date dataInicial, Date dataFinal,Long assunto) {
		SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");
		StringBuffer sql = new StringBuffer();
		sql.append(" WHERE CLASSE.CDCLASSE = " + assunto);
		sql.append(" AND DTENTRADA BETWEEN '" + dt1.format(dataInicial) + "' AND  '" + dt1.format(dataFinal) + "'");
		return sql.toString();
	}
}
