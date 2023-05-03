package br.com.prefeitura.diadema.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.repository.dao.SofPlanRelatorioDao;

@Service
public class PowerBiService {
		
	private SofPlanRelatorioDao dao;

	@Autowired
	public PowerBiService(SofPlanRelatorioDao dao){
		this.dao = dao;
	}
	
	public List<Object[]> listarProcessos() throws SQLException{
		List<Object[]> a = new ArrayList<Object[]>();
		
		for(int i = 1955; i < 2024; i++){
			a.addAll(dao.powerBiProcesso(i));
		}
		return a;
	}
	
	
	
	public Object[][] lsitarView(String tabela){
		return dao.listarView(tabela);
	}
	

	

	public List<Object[]> listarMunicipios() {
		return dao.listarCidades();
	}
	
	
	
}
