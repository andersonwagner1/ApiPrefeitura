package br.com.prefeitura.diadema.repository.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.prefeitura.diadema.dto.HistoricoDto;
import br.com.prefeitura.diadema.dto.ProcessoEletronicoDto;
import br.com.prefeitura.diadema.dto.SolicitanteDto;
import br.com.prefeitura.diadema.dto.UnidadeDto;
import br.com.prefeitura.diadema.dto.UsuarioInternoDto;

public class ProcessoDao {
	
	private  OracleMobile connection = new OracleMobile();
	
	/**
	 * 
	 * @param string
	 * @returnidDocumentoBase
	 * @throws SQLException
	 */
    public List<ProcessoEletronicoDto> findProcessByNumberProcess(String string) throws SQLException {
    	ResultSet rs = connection.executeQuery(consultaView() + " WHERE IDENTIFICACAOLABEL LIKE '%"+string+"%'");
    	List<ProcessoEletronicoDto> listProcessoEletronico = new ArrayList<ProcessoEletronicoDto>();
    	while(rs.next()){
    		ProcessoEletronicoDto processoEletronico = parseView(rs);
    		listProcessoEletronico.add(processoEletronico);
    	}    	
    	return listProcessoEletronico;
    }
    
    public List<ProcessoEletronicoDto> findProcessByUser(Long idUser) throws SQLException {
    	ResultSet rs = connection.executeQuery(consultaView() + " WHERE USUARIODESTINO_ID = " + idUser);
    	List<ProcessoEletronicoDto> listProcessoEletronico = new ArrayList<ProcessoEletronicoDto>();
    	while(rs.next()){
    		ProcessoEletronicoDto processoEletronico = parseView(rs);
    		listProcessoEletronico.add(processoEletronico);
    	}    	
    	return listProcessoEletronico;
    }
    	
    
    /**
     * 
     * @param idDocBase
     * @return
     * @throws SQLException
     */
    public ProcessoEletronicoDto findProcessByIdDocumentoBase(Long idDocBase) throws SQLException {
    	ResultSet rs = connection.executeQuery(consultaView() + " WHERE ID_DOCUMENTO_BASE = " + idDocBase);
    	//List<ProcessoEletronicoDto> listProcessoEletronico = new ArrayList<ProcessoEletronicoDto>();
    	while(rs.next()){
    		ProcessoEletronicoDto processoEletronico = parseView(rs);
    		return processoEletronico;
    	}    	
    	return null;
    }
    
    /**
     * 
     * @param rs
     * @return
     * @throws SQLException
     */
    private ProcessoEletronicoDto parseView(ResultSet rs) throws SQLException {
		ProcessoEletronicoDto processoEletronico = new ProcessoEletronicoDto();
		processoEletronico.setIdProcesso(rs.getLong("ID_PROCESSO"));
		processoEletronico.setDataCriacao(rs.getDate("DATA_CRIACAO"));
		processoEletronico.setAssunto(rs.getString("ASSUNTO"));
		processoEletronico.setIdentificacaoLabel(rs.getString("IDENTIFICACAOLABEL"));
		processoEletronico.setSituacaoLabel(rs.getString("SITUACAOLABEL"));
		processoEletronico.setAnoProcesso(rs.getInt("ANO_PROCESSO"));
		processoEletronico.setNumeroProcesso(rs.getString("NUMERO_PROCESSO"));
		processoEletronico.setSiglaProcesso(rs.getString("SIGLA_PROCESSO"));
		processoEletronico.setNumeroRequisicao(rs.getInt("NUM_REQUISICAO"));
		processoEletronico.setAnoRequisicao(rs.getInt("ANO_REQUISICAO"));
		processoEletronico.setIdDocumentoBase(rs.getLong("ID_DOCUMENTO_BASE"));
			
		SolicitanteDto interessante = new SolicitanteDto();
		interessante.setBairro(rs.getString("BAIRRO_INTERESSADO"));
		interessante.setCep(rs.getString("CEP_INTERESSADO"));
		interessante.setCidade(rs.getString("CIDADE_INTERESSADO"));
		interessante.setComplemente(rs.getString("COMPL_INTERESSADO"));
		interessante.setCpf(rs.getString("CPF_INTERESSADO"));
		interessante.setEmail(rs.getString("EMAIL_INTERESSADO"));
		interessante.setEstado(rs.getString("ESTADO_INTERESSADO"));
		interessante.setLogradouro(rs.getString("LOGRADOURO_INTERESSADO"));
		interessante.setNome(rs.getString("NOME_INTERESSADO"));
		interessante.setNumero(rs.getString("NUM_INTERESSADO"));
		interessante.setProntuario(rs.getString("PRONTUARIO_INTERESSADO"));
		interessante.setTelefone(rs.getString("TELEFONE_INTERESSADO"));
		
		SolicitanteDto solicitante = new SolicitanteDto();
		solicitante.setBairro(rs.getString("BAIRRO_SOLICITANTE"));
		solicitante.setCep(rs.getString("CEP_SOLICITANTE"));
		solicitante.setCidade(rs.getString("CIDADE_SOLICITANTE"));
		solicitante.setComplemente(rs.getString("COMPL_SOLICITANTE"));
		solicitante.setCpf(rs.getString("CPF_SOLICITANTE"));
		solicitante.setEmail(rs.getString("EMAIL_SOLICITANTE"));
		solicitante.setEstado(rs.getString("ESTADO_SOLICITANTE"));
		solicitante.setLogradouro(rs.getString("LOGRADOURO_SOLICITANTE"));
		solicitante.setNome(rs.getString("NOME_SOLICITANTE"));
		solicitante.setNumero(rs.getString("NUM_SOLICITANTE"));
		solicitante.setProntuario(rs.getString("PRONTUARIO_SOLICITANTE"));
		solicitante.setTelefone(rs.getString("TELEFONE_SOLICITANTE"));
		
		UsuarioInternoDto usuarioDto = new UsuarioInternoDto();
		usuarioDto.setNome(rs.getString("USUARIO_NOME"));
		
		UnidadeDto unidadeDto = new UnidadeDto();
		unidadeDto.setNome(rs.getString("NOME_UNIDADE"));
		unidadeDto.setArea(rs.getString("AREA_UNIDADE"));
		
		
		HistoricoDto historico = new HistoricoDto();
		historico.setUnidadeDestino(unidadeDto);
		historico.setUsuarioDestino(usuarioDto);
		
		processoEletronico.setSolicitante(solicitante);
		processoEletronico.setInteressado(interessante);
		processoEletronico.setUltimoEvento(historico);
		
		return processoEletronico;
	}
    
    
/**
 * 
 * @return
 */
	private String consultaView(){
		StringBuffer sql = new StringBuffer("SELECT * FROM VIEW_PROCESSO_ELETRONICO PE ");		
		return sql.toString();
	}


	
}
  