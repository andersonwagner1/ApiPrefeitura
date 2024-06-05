package br.com.prefeitura.diadema.repository.dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SofPlanRelatorioDao{
	
	private  OracleSoftplanHomolog connectioAgiles = new OracleSoftplanHomolog();
	
	
	
	public List<Object[]> powerBiProcesso(int ano) throws SQLException{
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT SP.CDPROCESSO, SP.NUFORMATADO, SP.NUANO, P.CDUSUARIO, P.DTCADASTRO, P.FLSITUACAO, P.FLCANCELADO, S.CDSUJEITO, S.NUIDENTSUJEITO, ");
		sql.append(" S.NMSUJEITO, A.CDASSUNTO, A.DEASSUNTO, p.CDSETORORIGEM,SS.SGORGAOSETOR AS SETORORIGEM, P.CDSETORGESTAO,S1.SGORGAOSETOR AS SETORGESTAO, ");
		sql.append(" P.CDSETORABERTURA, S2.SGORGAOSETOR AS SETORABERTURA, END.NUCEP, END.NMRUA, END.NUNUMERO, END.NMBAIRRO, END.CDMUNICIPIO");
		sql.append(" FROM ECPAPROCESSO P");
		sql.append(" INNER JOIN ECPASERVPROCESSO SP ON SP.CDORGAOSETOR = P.CDORGAOSETOR AND SP.NUANO = P.NUANO AND SP.NUPROCESSO = P.NUPROCESSO");
		sql.append(" INNER JOIN ESEGUSUARIO USC ON USC.CDUSUARIO = P.CDUSUARIO");
		sql.append(" INNER JOIN ECPAPROCINTER PCI ON PCI.CDORGAOSETOR = P.CDORGAOSETOR AND PCI.NUANO = P.NUANO AND PCI.NUPROCESSO = P.NUPROCESSO AND PCI.FLPRINCIPAL = 'S'");
		sql.append(" INNER JOIN ECPAINTERESSADO I ON PCI.CDINTERESSADO = I.CDINTERESSADO");
		sql.append(" INNER JOIN ECPAINTERSUJEITO INTS ON INTS.CDINTERESSADO = I.CDINTERESSADO");
		sql.append(" INNER JOIN ECDTSUJEITO S ON S.CDSUJEITO = INTS.CDSUJEITO");
		sql.append(" INNER JOIN ECPAPROCASSUNTO PA ON PA.CDORGAOSETOR = P.CDORGAOSETOR AND PA.NUANO = P.NUANO AND PA.NUPROCESSO = P.NUPROCESSO");
		sql.append(" INNER JOIN ECPAASSUNTO A ON A.CDASSUNTO = PA.CDASSUNTO");
		sql.append(" INNER JOIN ECPAORGAOSETOR SS ON  SS.CDORGAOSETOR = p.CDSETORORIGEM");
		sql.append(" INNER JOIN ECPAORGAOSETOR S1  ON  S1.CDORGAOSETOR = p.CDSETORGESTAO");
		sql.append(" INNER JOIN ECPAORGAOSETOR S2  ON  S2.CDORGAOSETOR = p.CDSETORABERTURA");
		sql.append(" INNER JOIN ECDTENDERECO END ON END.CDSUJEITO = S.CDSUJEITO");
		sql.append(" WHERE P.FLCADASTRADO = 'S'");
		sql.append(" and SP.NUANO = " +ano);
		
		ResultSet resultSet = connectioAgiles.executeQuery(sql.toString());
		
		List<Object[]> lista = new ArrayList<Object[]>();
		SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
		while(resultSet.next()){
			Object[] dada = new Object[19];
			dada[0] = resultSet.getString("NUFORMATADO");
			dada[1] = resultSet.getString("NUANO");
			dada[2] = resultSet.getString("CDUSUARIO");
			dada[3] = resultSet.getString("FLSITUACAO");
			dada[4] = out.format(resultSet.getDate("DTCADASTRO"));
			dada[5] = resultSet.getString("FLCANCELADO");
			dada[6] = resultSet.getString("CDSUJEITO");
			dada[7] = resultSet.getString("NUIDENTSUJEITO");
			dada[8] = resultSet.getString("NMSUJEITO");
			dada[9] = resultSet.getString("CDASSUNTO");
			dada[10] = resultSet.getString("DEASSUNTO");
			dada[11] = resultSet.getString("CDSETORORIGEM");
			dada[12] = resultSet.getString("SETORORIGEM");
			
			dada[13] = resultSet.getString("CDSETORABERTURA");
			dada[14] = resultSet.getString("SETORABERTURA");
			
			dada[15] = resultSet.getString("NUCEP");
			dada[16] = resultSet.getString("NMRUA");
			dada[17] = resultSet.getString("NMBAIRRO");
			dada[18] = resultSet.getString("CDMUNICIPIO");
			
			lista.add(dada);
		
		}
		resultSet.close();
		//connectioAgiles.close();
		
		
		return lista;
		
		
		
	}
	
	
	public List<Object[]> listarProcesso() throws SQLException{
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT ep.NUANO, ");
		sql.append("        ep.Nuprocesso,");
		sql.append("        ep.cdorgaosetor,");
		sql.append("        CASE ep.cdorgaosetor");
		sql.append("          WHEN ep.cdorgaosetor THEN");
		sql.append("           (SELECT CONCAT(CONCAT(SGORGAOSETOR, ' - '), NMORGAOSETOR)");
		             sql.append(" FROM ECPAORGAOSETOR");
		sql.append("             WHERE CDORGAOSETOR = ep.cdorgaosetor)");
		sql.append("        END orgao,");
		sql.append("        ep.dtentrada as data_entrada,");
		sql.append("        ep.cdsetorgestao,");
		sql.append("        CASE ep.cdsetorgestao");
		sql.append("          WHEN ep.cdsetorgestao THEN");
		sql.append("           (SELECT CONCAT(CONCAT(SGORGAOSETOR, ' - '), NMORGAOSETOR)");
		             sql.append(" FROM ECPAORGAOSETOR");
		sql.append("             WHERE CDORGAOSETOR = ep.cdsetorgestao)");
		sql.append("        END as unidade_responsavel,");
		sql.append("        ep.cdsetororigem,");
		sql.append("        CASE ep.cdsetororigem");
		sql.append("          WHEN ep.cdsetororigem THEN");
		sql.append("           (SELECT CONCAT(CONCAT(SGORGAOSETOR, ' - '), NMORGAOSETOR)");
		             sql.append(" FROM ECPAORGAOSETOR");
		sql.append("             WHERE CDORGAOSETOR = ep.cdsetororigem)");
		sql.append("        END unidade_origem,");
		sql.append("        ep.dtrecebto as recebido,          ");
		sql.append("        CASE ep.FLTIPOPROCESSO");
		sql.append("          WHEN 'G' THEN");
		sql.append("           'Documento Digital'");
		sql.append("          WHEN 'A' THEN");
		sql.append("           'Arquivado'");
		sql.append("          WHEN 'L' THEN");
		sql.append("           'Documento Físico'");
		sql.append("          WHEN 'F' THEN");
		sql.append("           'Processo Físico'");
		sql.append("          WHEN 'D' THEN");
		sql.append("           'Processo Digital'");
		sql.append("          ELSE NULL");
		sql.append("        END tipo,");
		sql.append("        etp.detipoprocesso as tipo_processo,");
		sql.append("        CASE ep.FLSITUACAO");
		sql.append("          WHEN 'E' THEN");
		sql.append("           'Em andamento'");
		sql.append("          WHEN 'A' THEN");
		sql.append("           'Arquivado'");
		sql.append("          WHEN 'C' THEN");
		sql.append("           'Cancelado'");
		sql.append("          WHEN 'R' THEN");
		sql.append("           'Desarquivado'");
		sql.append("          WHEN 'Q' THEN");
		sql.append("           'Rearquivado'");
		sql.append("          ELSE NULL");
		sql.append("        END situacao,");
		sql.append("        CASE ep.vlurgencia");
		sql.append("          WHEN 1 THEN");
		sql.append("           'SIM'");
		sql.append("          ELSE");
		sql.append("           'NÃO'");
		sql.append("        END as prioritario");
		sql.append("   FROM ECPAPROCESSO ep");
		sql.append("   LEFT JOIN ECPAORGAOSETOR eos ON ep.cdsetorgestao = eos.cdorgaosetor");
		sql.append("   LEFT JOIN ECPATIPOPROCESSO etp ON etp.cdtipoprocesso = ep.cdtipoprocesso");
		sql.append("   LEFT JOIN ESEGUSUARIO esu ON esu.cdusuario = ep.cdusuario");
		sql.append("   LEFT JOIN ECDTSUJEITO ecs ON ecs.nuidentsujeito = esu.nucpfcnpj");
		sql.append("   where NUANO = 2023");

		ResultSet resultSet = connectioAgiles.executeQuery(sql.toString());
		
		List<Object[]> lista = new ArrayList<Object[]>();
		SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
		while(resultSet.next()){
			Object[] dada = new Object[13];
			dada[0] = resultSet.getString("NUANO");
			dada[1] = resultSet.getString("Nuprocesso");
			dada[2] = resultSet.getString("cdorgaosetor");
			dada[3] = resultSet.getString("orgao");
			dada[4] = out.format(resultSet.getDate("data_entrada"));
			dada[5] = resultSet.getString("cdsetorgestao");
			dada[6] = resultSet.getString("unidade_responsavel");
			dada[7] = resultSet.getString("cdsetororigem");
			dada[8] = resultSet.getString("unidade_origem");
			dada[9] = out.format(resultSet.getDate("recebido"));
			dada[10] = resultSet.getString("tipo");
			dada[11] = resultSet.getString("prioritario");
			dada[12] = resultSet.getString("situacao");
			lista.add(dada);
		
		}
		
		return lista;
		
		
	}
	
	

	public  Object[][] listarView2(){
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT CDPROCESSO,NUFORMATADO,DTENTRADA,CDCLASSE,DETIPO,DESITUACAO,DEDESCRICAO FROM vcpavaasprocesso where nuformatado like 'PE %2023'");
	
		try {
			ResultSet resultSet = connectioAgiles.executeQuery(sql.toString());
			
			int rowCount = 0;
			if (resultSet.last()) {
				rowCount = resultSet.getRow();
			}
			
			SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
			 			
			Object[][] dada = new Object[rowCount][7];
			int lin = 0;
			resultSet.first();
			while(resultSet.next()){
				dada[lin][0] = resultSet.getString("CDPROCESSO");
				dada[lin][1] = resultSet.getString("NUFORMATADO");
				dada[lin][2] = out.format(resultSet.getDate("DTENTRADA"));
				dada[lin][3] = resultSet.getString("CDCLASSE");
				dada[lin][4] = resultSet.getString("DETIPO");
				dada[lin][5] = resultSet.getString("DESITUACAO");
				dada[lin][6] = resultSet.getString("DEDESCRICAO");
				lin++;
			}
			
			return dada;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	public Object[][] listarView(String tabela){
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT * FROM "  + tabela);
	
		try {
			ResultSet resultSet = connectioAgiles.executeQuery(sql.toString());
			int rowCount = 0;
			if (resultSet.last()) {
				rowCount = resultSet.getRow();
			}
			
			
			
			
			
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnCount = rsmd.getColumnCount();
			
			Object[][] dada = new Object[rowCount][columnCount];
			int lin = 0;
			resultSet.first();
			while(resultSet.next()){
				for(int col = 0 ; col < columnCount ; col++){
					dada[lin][col] = resultSet.getObject(col+1);
				}
				lin++;
			}
			
			return dada;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}


	public List<Object[]> listarCidades() {
		
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT M.CDMUNICIPIO, M.SGUNIDADEFEDERAL, M.NMMUNICIPIO, M.CDMUNICIPIOIBGE, UF.NMUNIDADEFEDERAL FROM ECDTMUNICIPIO M ");
		sql.append(" INNER JOIN ECDTUNIDADEFEDERAL UF ON UF.SGUNIDADEFEDERAL = M.SGUNIDADEFEDERAL");
	
		try {
			ResultSet resultSet = connectioAgiles.executeQuery(sql.toString());
			
			SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
			 			
			List<Object[]> lista = new ArrayList<Object[]>();

			while(resultSet.next()){
				Object[] o = new Object[5];
				o[0] = resultSet.getString("CDMUNICIPIO");
				o[1] = resultSet.getString("SGUNIDADEFEDERAL");
				o[2] = resultSet.getString("NMMUNICIPIO");
				o[3] = resultSet.getString("CDMUNICIPIOIBGE");
				o[4] = resultSet.getString("NMUNIDADEFEDERAL");
				lista.add(o);
			}
			
			return lista;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		
	}

}
