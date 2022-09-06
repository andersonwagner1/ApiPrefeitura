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
    public UnidadeDto findDepartById(Long id) throws SQLException {
    	
    	StringBuffer sql = new StringBuffer();
    	sql.append("SELECT * FROM PROT_UNIDADE");
    	sql.append(" where id = " + id);
    	ResultSet rs = connection.executeQuery(sql.toString());
    	if(rs.next()){
    		UnidadeDto unidadeDto = new UnidadeDto();
    		unidadeDto.setArea(rs.getString("area"));
    		unidadeDto.setAtivo(rs.getInt("ativo"));
    		unidadeDto.setId(rs.getLong("id"));
    		unidadeDto.setNome(rs.getString("nome"));
    		//unidadeDto.setSistema(rs.getString("sistema"));
    		//unidadeDto.setTipo(rs.getString("tipo"));
    		return unidadeDto;

    	}    	
    	return null;
    }
    
    public void addUserInDepartament(UnidadeDto unidade, UsuarioDto dto) throws SQLException{
    	StringBuffer sql = new StringBuffer();
    	
    	if(unidade.getTipo().equals("Analista")){
    		sql.append("insert into prot_uni_usu_fun ");
    		sql.append("(usu_func_id,unidade_id) ");
    	}else{
    		sql.append("insert into PROT_UNI_USU_LID ");
    		sql.append("(USU_LID_ID,unidade_id) ");
    	}
    	sql.append("values (" + dto.getId() + "," +  unidade.getId() + ")");
    	System.out.println(sql.toString());
    	connection.execute(sql.toString());
    	
    	
    }
    
	public void removeUserInDepartament(UnidadeDto unidade, UsuarioDto dto)	throws SQLException {
		StringBuffer sql = new StringBuffer();

		sql.append("DELETE FROM prot_uni_usu_fun ");
		sql.append(" WHERE usu_func_id = " + dto.getId());
		sql.append(" AND unidade_id = " + unidade.getId());
	
		System.out.print(sql.toString());
		connection.execute(sql.toString());

		StringBuffer sql2 = new StringBuffer();
		sql2.append("DELETE FROM PROT_UNI_USU_LID ");
		sql2.append(" WHERE USU_LID_ID = " + dto.getId());
		sql2.append(" AND unidade_id = " + unidade.getId());		
		System.out.print(sql2.toString());
		connection.execute(sql2.toString());

	}
    
    public List<UnidadeDto> findDepartmentByUser(Long id) throws SQLException {
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
    
    
    public List<UnidadeDto> findDepartmentByName(String name) throws SQLException {
    	StringBuffer sql = new StringBuffer();
    	sql.append("SELECT * FROM PROT_UNIDADE");
    	sql.append(" where UPPER(nome) like '%" + name.toUpperCase() + "%'");
    	ResultSet rs = connection.executeQuery(sql.toString());
    	List<UnidadeDto> listUsuarioInterno = new ArrayList<UnidadeDto>();
    	while(rs.next()){
    		UnidadeDto unidadeDto = new UnidadeDto();
    		unidadeDto.setArea(rs.getString("area"));
    		unidadeDto.setAtivo(rs.getInt("ativo"));
    		unidadeDto.setId(rs.getLong("id"));
    		unidadeDto.setNome(rs.getString("nome"));
    		//unidadeDto.setSistema(rs.getString("sistema"));
    		//unidadeDto.setTipo(rs.getString("tipo"));
    		
    		listUsuarioInterno.add(unidadeDto);
    	}    	
    	return listUsuarioInterno;
    }
}
  