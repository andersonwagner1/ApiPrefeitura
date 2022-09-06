package br.com.prefeitura.diadema.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.ProcessoEletronicoDto;
import br.com.prefeitura.diadema.model.AGLHistoricoProcesso;
import br.com.prefeitura.diadema.repository.RelatorioAGLRepository;
import br.com.prefeitura.diadema.repository.dao.ProcessoDao;

@Service
public class ProcessoService {
	
	private ProcessoDao processoDao;
	
	private RelatorioAGLRepository relatorioRepository;
	
	
	@Autowired
	public ProcessoService(RelatorioAGLRepository relatorioRepository
			){
		this.relatorioRepository = relatorioRepository;
		//this.processoDao = processoDao;
	}
	
	

	public List<ProcessoEletronicoDto> findProcessByNumberProcess(String numberProcess) throws SQLException{
		return processoDao.findProcessByNumberProcess(numberProcess);
	}
	
	public ProcessoEletronicoDto findProcessByIdBaseDocumento(Long idDocBase) throws SQLException{
		return processoDao.findProcessByIdDocumentoBase(idDocBase);
	}
	
	public List<ProcessoEletronicoDto> findProcessoByUser(Long idUser) throws SQLException{
		return processoDao.findProcessByUser(idUser);
	}
	
	
	public List<ProcessoEletronicoDto> listSubjectAndPeridStartAndEndDate(String idAssunto) throws SQLException {
		processoDao = new ProcessoDao();
		return processoDao.listSubjectAndPeridStartAndEndDate(idAssunto);		
	}


	public void corrigir() throws SQLException {
		processoDao = new ProcessoDao();
		ResultSet rs = processoDao.findPRocessoByHistorico();
		
		
		int passo = 0;
		Long auxDoc = 0L;
		
		while (rs.next()) {
			AGLHistoricoProcesso r = new AGLHistoricoProcesso();
			
			if(auxDoc != rs.getLong("ID_DOCUMENTO_BASE")){
				passo = 1;
				auxDoc = rs.getLong("ID_DOCUMENTO_BASE");
			}else{
				passo ++;
			}
			
			r.setIdAssunto(rs.getLong("id_tipo_solicitacao"));
			r.setIdUnidade(rs.getLong("ID_UNIDADE_DESTINO"));
			r.setIdUsuario(rs.getLong("ID_USUARIO_DESTINO"));
			r.setIdEvento(rs.getLong("ID_EVENTO"));
			r.setIdBase(auxDoc);
			r.setPosicao(passo);
			
			relatorioRepository.save(r);
			
		}
		
		
		
		
		/*while (rs.next()) {
			
			if(auxDoc != rs.getLong("ID_DOCUMENTO_BASE")){
				passo = 1;
				auxDoc = rs.getLong("ID_DOCUMENTO_BASE");
			}else{
				passo ++;
			}
			
			
			
			AGLHistoricoProcesso r = relatorioRepository.findExist(passo,
					rs.getLong("id_tipo_solicitacao"),
					rs.getLong("ID_UNIDADE_DESTINO"),
					rs.getLong("ID_USUARIO_DESTINO"));
			
			if (r == null) {
				r = new AGLHistoricoProcesso();
				r.setQtd(1);
				r.setIdAssunto(rs.getLong("id_tipo_solicitacao"));
				r.setIdUnidade(rs.getLong("ID_UNIDADE_DESTINO"));
				r.setIdUsuario(rs.getLong("ID_USUARIO_DESTINO"));
			} else {
				r.setQtd(r.getQtd() + 1);
			}
			r.setPosicao(passo);

			relatorioRepository.save(r);
		}*/
		
	}



	
}