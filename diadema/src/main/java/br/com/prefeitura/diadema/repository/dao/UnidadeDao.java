package br.com.prefeitura.diadema.repository.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.prefeitura.diadema.dto.UnidadeDto;
import br.com.prefeitura.diadema.dto.UsuarioDto;

public class UnidadeDao {
	
	private  OracleMobile connection = new OracleMobile();
	
	/**
	 * Realiza a busca de usuario por nome e realiza a consulta no sistema de RH
	 * @param string
	 * @returnidDocumentoBase
	 * @throws SQLException
	 */
    public List<UnidadeDto> findDepartByUser(Long id) throws SQLException {
    	StringBuffer sql = new StringBuffer();
    	sql.append("SELECT * FROM VIEW_PROT_USUARIOUNIDADE");
    	sql.append(" where usuario_id = " + id);
    	ResultSet rs = connection.executeQuery(sql.toString());
    	List<UnidadeDto> listUsuarioInterno = new ArrayList<UnidadeDto>();
    	while(rs.next()){
    		UnidadeDto unidadeDto = new UnidadeDto();
    		unidadeDto.setArea(rs.getString("area"));
    		unidadeDto.setAtivo(rs.getInt("ativo"));
    		unidadeDto.setId(rs.getLong("id"));
    		unidadeDto.setNome(rs.getString("nome"));
    		unidadeDto.setSistema(rs.getString("sistema"));
    		unidadeDto.setTipo(rs.getString("tipo"));
    		
    		listUsuarioInterno.add(unidadeDto);
    	}    	
    	return listUsuarioInterno;
    }
}
  