package br.com.prefeitura.diadema.repository.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.prefeitura.diadema.dto.UsuarioDto;

public class UsuarioDao {
	
	private  OracleMobile connection = new OracleMobile();
	private RhDao rhDao = new RhDao();
	
	/**
	 * Realiza a busca de usuario por nome e realiza a consulta no sistema de RH
	 * @param string
	 * @returnidDocumentoBase
	 * @throws SQLException
	 */
    public List<UsuarioDto> findUserWithRhSystemByNameOrProntuarioOrEmail(String nameOrProntuarioOrEmail) throws SQLException {
    	StringBuffer sql = new StringBuffer();
    	sql.append("SELECT * FROM PROT_USUARIO_INTERNO UI");
    	sql.append(" WHERE UPPER(UI.NOME) LIKE '%" + nameOrProntuarioOrEmail.toUpperCase() + "%'");
    	ResultSet rs = connection.executeQuery(sql.toString());
    	List<UsuarioDto> listUsuarioInterno = new ArrayList<UsuarioDto>();
    	while(rs.next()){
    		UsuarioDto usuarioInterno = parseView(rs);
    		usuarioInterno = rhDao.findUserRhByCpf(usuarioInterno.getCpf(), usuarioInterno);
    		listUsuarioInterno.add(usuarioInterno);
    	}    	
    	return listUsuarioInterno;
    }
    
    public UsuarioDto findUserInternById(Long id) throws SQLException {
    	StringBuffer sql = new StringBuffer();
    	sql.append("SELECT * FROM PROT_USUARIO_INTERNO UI");
    	sql.append(" WHERE ID = " + id);
    	ResultSet rs = connection.executeQuery(sql.toString());    	
    	if(rs.next()){
    		UsuarioDto usuarioInterno = parseView(rs);
    		usuarioInterno = rhDao.findUserRhByCpf(usuarioInterno.getCpf(), usuarioInterno);  
    		return usuarioInterno;
    	}    	
    	return null;
	}
    
    public int desactiaveteUser(UsuarioDto user) throws SQLException {
    	StringBuffer sql = new StringBuffer();
    	sql.append("UPDATE PROT_USUARIO_INTERNO SET ACTIVE = 0");
    	sql.append(" WHERE ID = " + user.getId());
    	
    	return connection.execute(sql.toString());
	}
    
    
    public Integer update(UsuarioDto usuario) throws SQLException {
    	StringBuffer sql = new StringBuffer();
    	sql.append("UPDATE PROT_USUARIO_INTERNO SET ");
    	sql.append("nome = '" + usuario.getNome() + "'");
    	sql.append(", email = '" + usuario.getEmail().toLowerCase() + "'");
    	sql.append(",cpf = '" + usuario.getCpf() + "'");
    	sql.append(",prontuario = '" + usuario.getProntuario() + "'");
    	sql.append(" WHERE ID = " + usuario.getId());
    	
    	return connection.execute(sql.toString());
		
	}


    
    /**
     * 
     * @param rs
     * @return
     * @throws SQLException
     */
	private UsuarioDto parseView(ResultSet rs) throws SQLException {
		UsuarioDto dto = new UsuarioDto();		
		dto.setSituacao(rs.getString("ACTIVE"));
		dto.setEmail(rs.getString("EMAIL"));
		dto.setId(rs.getLong("ID"));
		dto.setCertificado(rs.getString("IDCHAVEKMS"));
		dto.setNome(rs.getString("NOME"));
		dto.setPkUsuarioAgiles(rs.getString("PKUSUARIOAGILES"));
		dto.setProntuario(rs.getString("PRONTUARIO"));
		dto.setCpf( String.format("%011d", rs.getLong("CPF")));		
		//dto.setProntuarioRh(rs.getString(""));
		//dto.setSituacaoRh(rs.getString(""));
				
		return dto;
	}

	

	

	
    
    
    
    
    
	
}
  