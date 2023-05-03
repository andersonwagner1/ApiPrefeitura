package br.com.prefeitura.diadema.migracao;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.prefeitura.diadema.repository.dao.OracleMobile;

public class CorrigirRequisicao {

	//private OracleSoftplan coneection = new OracleSoftplan();
	private OracleMobile coneection = new OracleMobile();


	public static void main(String arg[]) throws SQLException{
		CorrigirRequisicao l = new CorrigirRequisicao();
		System.out.println("Inicinando");
		//l.localizarValor(39115894843l);
		//l.localizarValor("[EXTERNO][FINANÇAS] UNIFICAÇÃO DE IPTU");
		l.localizarValor("INUTILIZADO");
		System.out.println("Fim");
	}
	
	private void localizarAtualizarRequisicao(String numero, Integer ano){
		System.out.println("----------------------- Iniciando ---------------------------");
		StringBuffer sqltabela = new StringBuffer();
		sqltabela.append("SELECT RP.ID, RP.CPF_INTERESSADO, RP.CPF_SOLICITANTE FROM PROT_REQUISICAO_PROCESSO RP");
		sqltabela.append(" WHERE RP.ID IN(SELECT PE.id_requisicao FROM VIEW_PROCESSO_ELETRONICO PE");
		sqltabela.append(" WHERE PE.NUMERO_PROCESSO = '" +numero+ "'");
		sqltabela.append(" AND PE.ANO_PROCESSO = " +ano + ")");
		
		ResultSet rs;
		
		try {
			rs = coneection.executeQuery(sqltabela.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private ResultSet listarTabelas(){
		System.out.println("----------------------- Iniciando ---------------------------");
		StringBuffer sqltabela = new StringBuffer();
		sqltabela.append("SELECT table_name FROM user_tables");
		//sqltabela.append(" WHERE table_name LIKE 'ECPAPROCESSODOC%'");
		
		System.out.println("- Buscando tabelas");
		ResultSet rs;
		try {
			rs = coneection.executeQuery(sqltabela.toString());
			return rs;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private ResultSet listarColunas(String tabela, String tipo) throws SQLException{		
		StringBuffer sqlcoluna = new StringBuffer();
		sqlcoluna.append(" SELECT column_name, '1' ");
		sqlcoluna.append(" FROM   all_tab_cols ");
		sqlcoluna.append(" WHERE  table_name = '"+tabela+"' ");
		sqlcoluna.append(" and data_type = '"+tipo+"'");
		sqlcoluna.append(" and UPPER(column_name) <> 'VERSION'");
		sqlcoluna.append(" and UPPER(table_name) <> 'EMIGFLYWAYSCHEMAVERSION'");
		sqlcoluna.append(" and UPPER(column_name) not like 'SYS%'");
		ResultSet rsColunas = coneection.executeQuery(sqlcoluna.toString());
		//System.out.print(rsColunas.getRow());
		return rsColunas;
	}
	
	private void localizarValores(String tabela, String coluna, Long valor) throws SQLException{	
		StringBuffer sqlcoluna = new StringBuffer();
		sqlcoluna.append(" SELECT  count(*) ");
		sqlcoluna.append(" FROM  " + tabela);
		sqlcoluna.append(" WHERE " + coluna + " = " + valor);
		//sqlcoluna.append(" and UPPER(column_name) <> 'VERSION'");
		ResultSet rsColunas = coneection.executeQuery(sqlcoluna.toString());
		
		if(rsColunas.next()){
			if(rsColunas.getInt(1) > 0){
				System.out.println("SELECT * FROM " + tabela + " WHERE " + coluna + " = " + valor + ";");
			}
			
		}
		rsColunas.close();		
	}
	
	
	private void localizarValores(String tabela, String coluna, String valor) throws SQLException{	
		StringBuffer sqlcoluna = new StringBuffer();
		sqlcoluna.append(" SELECT  count(*) ");
		//sqlcoluna.append(" FROM  ECPAFORMULARIO" );
		sqlcoluna.append(" FROM  " + tabela);
		//sqlcoluna.append(" WHERE NMFORMULARIO LIKE upper('%" + valor +"%')");
		
		sqlcoluna.append(" WHERE upper(" + coluna + ") LIKE upper('%" + valor +"%')");
		ResultSet rsColunas = coneection.executeQuery(sqlcoluna.toString());
		
		if(rsColunas.next()){
			if(rsColunas.getInt(1) > 0){
				System.out.println("SELECT * FROM " + tabela + " WHERE upper(" + coluna + ") like upper('%" + valor + "%');");
			}			
		}
		rsColunas.close();		
	}
	
	private void localizarValor(String valor) throws SQLException {		
		ResultSet rs = listarTabelas();				
		int tabelas = 0;
		while(rs.next()){
			tabelas ++;
			ResultSet rsColunas = listarColunas(rs.getString(1),"VARCHAR2");
			while(rsColunas.next()){
				localizarValores(rs.getString(1), rsColunas.getString(1), valor);
			}
			rsColunas.close();
		}	
		rs.close();
		System.out.println("--- total de tabelas " + tabelas);
	}

	private void localizarValor(Long valor) throws SQLException {		
		ResultSet rs = listarTabelas();				
		int tabelas = 0;
		while(rs.next()){
			tabelas ++;
			ResultSet rsColunas = listarColunas(rs.getString(1),"NUMBER");
			while(rsColunas.next()){
				localizarValores(rs.getString(1), rsColunas.getString(1), valor);
			}
			rsColunas.close();
		}	
		rs.close();
		System.out.println("--- total de tabelas " + tabelas);
	}
}
