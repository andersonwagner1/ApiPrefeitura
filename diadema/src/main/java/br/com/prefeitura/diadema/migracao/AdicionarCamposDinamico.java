package br.com.prefeitura.diadema.migracao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

import br.com.prefeitura.diadema.repository.dao.OracleMobile;
import br.com.prefeitura.diadema.repository.dao.OracleSoftplan;


/**
 * Adiciona o campos dimanimoco nos processo eletronico
 * @author anderson.oliveira
 *
 */
public class AdicionarCamposDinamico {

	
	public static void main(String[] args) {
		AdicionarCamposDinamico acd = new AdicionarCamposDinamico();
		acd.iniciarConexao();
    }

	/**
	 * Iniciar a conexaão com o sistma do processo eletronico pegando os formulario dinamico
	 */
	public void iniciarConexao(){		
		String sql = "SELECT ID_PROCESSO, FORMULARIO, ANO_PROCESSO, NUMERO_PROCESSO \r\n"
        		+ "  FROM VIEW_PROCESSO_ELETRONICO PE\r\n"
        		+ " INNER JOIN ADM_CARGA_FORMULARIO CF ON CF.ID_DOC_BASE =\r\n"
        		+ "                                       PE.ID_DOCUMENTO_BASE\r\n"
        		+ " WHERE PE.ANO_PROCESSO = '2022'\r\n"
        		+ " AND CF.FORMULARIO IS NOT NULL"
        		+ " AND ROWNUM <= 5\r\n"
        		+ "ORDER BY PE.ID_PROCESSO ASC";
				
		OracleMobile stmt = new OracleMobile();
		try {
			
			ResultSet res = stmt.executeQuery(sql);
            
           // int idProcesso;
            String texto;
            java.sql.Clob formulario;
			
            while (res.next()) {
				String campo;
				String valor;
				formulario = res.getClob("FORMULARIO");
				
				String orgamProcessp = "PE";
				String numeroProcesso = res.getString("NUMERO_PROCESSO");
				Integer anoProcesso = res.getInt("ANO_PROCESSO");
				texto = formulario.getSubString(1, (int) formulario.length());
				String[] registros = texto.split("}");
							
				for (String registro : registros) {
					//pos = registro.indexOf("VALOR");
					String[] textoDesmotado = desmontarTexto(registro);
					
					campo = textoDesmotado[0];
					valor = textoDesmotado[1];					
					procurarCodigoSolar(campo, valor, orgamProcessp, numeroProcesso, anoProcesso);					
				}
			}

			res.close();
			stmt.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	/**
	 * Desmontar o registro para pegar o valor e o campo
	 * @param registro
	 * @return
	 */
	private String[] desmontarTexto(String registro){
		int pos = registro.indexOf("VALOR");
		String campo = registro.substring(1, (int) pos).replace("CAMPO=[", "").replace("]", "");
		String valor = registro.substring(pos).replace("VALOR=[", "").replace("]", "");
		
		
		String[] retorno = new String[2];
		retorno[0] = campo;
		retorno[1] = valor;
		return retorno;
	}
	
	
	/**
	 * Pesquisa o codigo do processo eletronico do solar
	 * @param campo
	 * @param valor
	 * @throws SQLException
	 */
	private void procurarCodigoSolar(String campo, String valor, String orgao, String numeroPorcesso, Integer anoProcesso) throws SQLException {
		
		OracleSoftplan cnn = new OracleSoftplan();
		
		//String sql = "SELECT NUPROCFORMATADO, CDPROCESSO FROM ECPAFILATRABALHO WHERE ROWNUM <= 5";
		String sql = "SELECT NUFORMATADO,CDPROCESSO FROM ECPASERVPROCESSO WHERE NUFORMATADO = '" + orgao + " " + converteDecimalParaBinario(numeroPorcesso) + "/" + anoProcesso + "'";
        ResultSet rs = cnn.executeQuery(sql);
        while(rs.next()) {
        	String nuprocesso = rs.getString("NUFORMATADO");
        	String codigo = rs.getString("CDPROCESSO");
        	System.out.println("PROCESSO: " + nuprocesso + "  CODIGO DO PROCESSO: " + codigo);
        	inserirCampoDinamico(codigo, campo, valor);
        }    
        rs.close();
        cnn.close();
	}
	
	
	private String converteDecimalParaBinario(String valor) {
        int qtd = 6;
        StringBuilder pattern = new StringBuilder();
        for(int i=0; i<qtd; i++) {
            pattern.append("0");
        }
        DecimalFormat df = new DecimalFormat(pattern.toString());
        return df.format(Integer.parseInt(valor));
    } 
	
	/**
	 * 
	 * @param codigo
	 * @param campo
	 * @param valor
	 * @throws SQLException
	 */
	private void inserirCampoDinamico(String codigo, String campo, String valor) throws SQLException	{
		OracleSoftplan cnn = new OracleSoftplan();
		
		String sqlInsertMetadaDao = "INSERT INTO ECPAMETADADO (NMMETADADO, CDTIPOMETADADO) VALUES ('"+campo+"', 1)";
		String sql_last_id_metadado = "SELECT scpametadado.currval as id FROM dual";
		cnn.execute(sqlInsertMetadaDao);
		ResultSet rs = cnn.executeQuery(sql_last_id_metadado);
		if(rs.next()) {
			int id = rs.getInt("id");
			System.out.println("MAX ID = " + id);
			inserirValorDinamico(id, codigo, valor);
		}	
		rs.close();
		cnn.close();
	}
	
	private void inserirValorDinamico(int id, String codigo, String valor) throws SQLException {
		OracleSoftplan cnn = new OracleSoftplan();
		
		String sql_insert_campo = "INSERT INTO ECPAMETADADOVALOR (CDMETADADO, DEMETADADO) VALUES ("+id+", '"+valor+"')";
		String sql_last_id_metadado = "SELECT SCPAMETADADOVALOR.currval as id FROM dual";
		cnn.execute(sql_insert_campo);
		ResultSet rs = cnn.executeQuery(sql_last_id_metadado);
		if (rs.next()) {
			int id2 = rs.getInt("id");
			System.out.println("MAX ID = " + id2);
			vincularProcessoComCampo(id2,codigo);			
		}
		rs.close();
		cnn.close();
	}
	private void vincularProcessoComCampo(int id2, String codigo) throws SQLException {
		OracleSoftplan cnn = new OracleSoftplan();
		String sql_insert_campo = "INSERT INTO ECPAMETADADOVALORPROCESSO (CDMETADADOVALORPROCESSO, CDMETADADOVALOR, CDPROCESSO) VALUES ("+id2+","+id2+",'"+codigo+"')";
		cnn.execute(sql_insert_campo);
		System.out.println("ID DO VALOR = " + id2 + "CODIGO DO PROCESSO = " + codigo);
		cnn.close();
	}
}
