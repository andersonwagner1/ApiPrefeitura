package br.com.prefeitura.diadema.repository.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.prefeitura.diadema.dto.UsuarioDto;

public class RhDao {
	
	private  OracleAbaco connection = new OracleAbaco();
	
	/**
	 * 
	 * @param string
	 * @returnidDocumentoBase
	 * @throws SQLException
	 */
    public UsuarioDto findUserRhByCpf(String cpf, UsuarioDto usuarioDto) throws SQLException {
    	StringBuffer sql = new StringBuffer();
    	sql.append("SELECT CTR.CONTRATOMATRICULANUMERICO, ");
    	sql.append(" PEQ.PESNOME, ");
    	sql.append(" PEF.PFCPF, ");
    	sql.append(" (CASE WHEN CTR.CONTRATOSTATUS = 1 THEN 'Em Exercício' ");
    	sql.append(" WHEN CTR.CONTRATOSTATUS = 2 THEN 'Afastado ou Licenciado' ");
    	sql.append(" WHEN CTR.CONTRATOSTATUS = 3 THEN 'Férias' ");
    	sql.append(" WHEN CTR.CONTRATOSTATUS = 4 THEN 'Á disposição da Prefeitura' ");
    	sql.append(" WHEN CTR.CONTRATOSTATUS = 5 THEN ");
    	sql.append(" 'Exonerado' ");
    	sql.append(" END), ");
    	sql.append(" CTR.CONTRATOSTATUS ");
    	sql.append(" FROM ETURMALINA.TBCONTRATO  CTR, ");
    	sql.append(" ETURMALINA.TBPESSOA    PES, ");
    	sql.append(" SISBASE.TBPESSOA_Q     PEQ, ");
    	sql.append(" SISBASE.TBPESSOAFISICA PEF ");
    	sql.append(" WHERE CTR.SERVIDORID = PES.SERVIDORID ");
    	sql.append(" AND PES.PESSERVIDORID = PEQ.PESID ");
    	sql.append(" AND PEF.PFID = PES.PESSERVIDORID ");
    	sql.append(" AND PEF.PFCPF = '" + cpf + "' ");
    	sql.append(" ORDER BY CONTRATOMATRICULANUMERICO DESC");
    	ResultSet rs = connection.executeQuery(sql.toString());
    	
    	if(rs.next()){
    		usuarioDto.setCodigoRh(rs.getInt("CONTRATOSTATUS"));
    		usuarioDto.setProntuarioRh(rs.getString("CONTRATOMATRICULANUMERICO"));    		
    		usuarioDto.setNome(rs.getString("PESNOME"));
    		usuarioDto.setSituacaoRh(rs.getString(4));
    		
    		return usuarioDto;
    	}else{
    		usuarioDto.setSituacaoRh("Usuário não encontrado no sistema RH");
    	}
    	return usuarioDto;
    }
}
  