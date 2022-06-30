package br.com.prefeitura.diadema.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.ProcessoEletronicoDto;
import br.com.prefeitura.diadema.repository.dao.ProcessoDao;

@Service
public class ProcessoService {
	
	private ProcessoDao processoDao;
	
	
	public ProcessoService(){
		processoDao = new ProcessoDao(); 
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
}