package br.com.prefeitura.diadema.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.prefeitura.diadema.repository.dao.OracleSoftplan;


public class ExecutarQuery {
	
	
	public List<Object[]> executarQuery(String sql) {
		OracleSoftplan dao = new OracleSoftplan();

		try {
			ResultSet rs = dao.executeQuery(sql);
			int quantidadeColuna = rs.getMetaData().getColumnCount();

			List<Object[]> listaO = new ArrayList<Object[]>();
			while (rs.next()) {
				Object[] o = new Object[quantidadeColuna];

				for (int col = 0; col < quantidadeColuna; col++) {
					o[col] = rs.getObject(col + 1);
				}
				listaO.add(o);
			}			
			return listaO;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Object[][] executarQueryMatriz(String sql) {
		OracleSoftplan dao = new OracleSoftplan();

		try {
			ResultSet rs = dao.executeQuery(sql);
			int quantidadeColuna = rs.getMetaData().getColumnCount();

			List<Object[]> listaO = new ArrayList<Object[]>();
			while (rs.next()) {
				Object[] o = new Object[quantidadeColuna];

				for (int col = 0; col < quantidadeColuna; col++) {
					o[col] = rs.getObject(col + 1);
				}
				listaO.add(o);
			}

			// Trocar por matriz
			Object[][] resultado = new Object[listaO.size()][quantidadeColuna];
			for (int linha = 0; linha < listaO.size(); linha++) {
				for (int coluna = 0; coluna < quantidadeColuna; coluna++) {
					resultado[linha][coluna] = listaO.get(linha)[coluna];
				}
			}
			return resultado;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	

	/*
	 SELECT NMCLASSE, COUNT(*) AS QTD
  FROM (SELECT ORGAO1.SGORGAOSETOR,
               PROC.NUPROCESSO,
               PROC.NUANO,
               PROC.FLSITUACAO,
               ORGAO.NMORGAOSETOR,
               orgao.sgorgaosetor,
               PROC.DTENTRADA,
               PROC.DTRECEBTO,
               PROC.DTCONCLUSAO,
               CLASSE.CDCLASSE,
               CLASSE.NMCLASSE
          from ECPAPROCESSO proc
         inner join ECPAULTTRAMIVOL tram on tram.nuano = proc.nuano
                                        and tram.nuprocesso =
                                            proc.nuprocesso
                                        AND PROC.CDORGAOSETOR =
                                            TRAM.CDORGAOSETOR
         inner join ECPAORGAOSETOR orgao on orgao.cdorgaosetor =
                                            tram.cdorgaotrami
         INNER JOIN ECPAORGAOSETOR ORGAO1 ON ORGAO1.CDORGAOSETOR =
                                             PROC.CDORGAOSETOR -- SUFIXO
         INNER JOIN ECPAPROCASSUNTO ASSUNTO ON ASSUNTO.NUANO = PROC.NUANO
                                           AND ASSUNTO.NUPROCESSO =
                                               PROC.NUPROCESSO
         INNER JOIN EPCLCLASSE CLASSE ON CLASSE.CDCLASSE = ASSUNTO.CDASSUNTO)
 GROUP BY NMCLASSE
	 */

}
