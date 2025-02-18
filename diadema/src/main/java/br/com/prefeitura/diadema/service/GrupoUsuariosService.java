package br.com.prefeitura.diadema.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.repository.dao.OracleSoftplanProd;

@Service
public class GrupoUsuariosService {

	@Autowired
	public GrupoUsuariosService(){; 
	}

	
	public List<String[]> listarUsuariosPorGrupo(String grupo) throws SQLException {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT CDUSUARIO, NMUSUARIO FROM ESEGUSUARIO O ");
		sql.append(" INNER JOIN PMD_GRUPO_USUARIO GU ON GU.CD_USUARIO = O.CDUSUARIO");
		sql.append(" WHERE FLHABILITADO = 'S' AND IC_ATIVO = 'SIM'");
		sql.append(" AND (DTDESATIVACAO <= sysdate"); 
		sql.append(" OR DTDESATIVACAO is null)");
		
		List<String[]> listarValores = new ArrayList<String[]>();
		OracleSoftplanProd dao = new OracleSoftplanProd();
		ResultSet rs = dao.executeQuery(sql.toString());
		while (rs.next()) {
			String[] valor = new String[2];
			valor[0] = rs.getString(1);
			valor[1] = rs.getString(2);
			listarValores.add(valor);
		}
		return listarValores;
		
	}
	
	
	public List<String[]> listarApenasCodigoUsuariosPorGrupo(String grupo) throws SQLException {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT CDUSUARIO FROM ESEGUSUARIO O ");
		sql.append(" INNER JOIN PMD_GRUPO_USUARIO GU ON GU.CDUSUARIO = O.CDUSUARIO");
		sql.append(" WHERE FLHABILITADO = 'S' AND IC_ATIVO = 'SIM'");
		sql.append(" AND (DTDESATIVACAO <= sysdate"); 
		sql.append(" OR DTDESATIVACAO is null)");
		
		List<String[]> listarValores = new ArrayList<String[]>();
		OracleSoftplanProd dao = new OracleSoftplanProd();
		ResultSet rs = dao.executeQuery(sql.toString());
		while (rs.next()) {
			String[] valor = new String[1];
			valor[0] = rs.getString(1);
			listarValores.add(valor);
		}
		return listarValores;
		
	}
	
	
	
}
