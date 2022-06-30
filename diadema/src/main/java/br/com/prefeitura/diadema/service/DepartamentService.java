package br.com.prefeitura.diadema.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.UnidadeDto;
import br.com.prefeitura.diadema.repository.dao.UnidadeDao;

@Service
public class DepartamentService {
	
	
	
	private UnidadeDao unidadeDao = new UnidadeDao();

	
	

	public List<UnidadeDto> findDepartamentByUser (Long id) throws SQLException {
		List<UnidadeDto> departamentDto = unidadeDao.findDepartByUser(id);		
		return departamentDto;
	}
	
}
