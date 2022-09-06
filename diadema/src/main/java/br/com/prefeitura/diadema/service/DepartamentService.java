package br.com.prefeitura.diadema.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.UnidadeDto;
import br.com.prefeitura.diadema.dto.UsuarioDto;
import br.com.prefeitura.diadema.repository.dao.UnidadeDao;

@Service
public class DepartamentService {
	
	
	
	private UnidadeDao unidadeDao = new UnidadeDao();

	
	public List<UnidadeDto> findDepartmentByName(String name) throws SQLException{
		List<UnidadeDto> departamentosDto = unidadeDao.findDepartmentByName(name);
		return departamentosDto;
	}
	
	public void addUserInDepartamento(UsuarioDto usuario, UnidadeDto unidade) throws SQLException{
		unidadeDao.addUserInDepartament(unidade, usuario);
	}
	
	public void removeUserInDepartamento(UsuarioDto usuario, UnidadeDto unidade) throws SQLException{
		unidadeDao.removeUserInDepartament(unidade, usuario);
	}
	
	public UnidadeDto findDepartamentById (Long id) throws SQLException {
		UnidadeDto departamentDto = unidadeDao.findDepartById(id);		
		return departamentDto;
	}

	public List<UnidadeDto> findDepartamentByUser (Long id) throws SQLException {
		List<UnidadeDto> departamentDto = unidadeDao.findDepartmentByUser(id);		
		return departamentDto;
	}
	
}
