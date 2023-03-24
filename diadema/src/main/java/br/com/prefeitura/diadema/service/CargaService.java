package br.com.prefeitura.diadema.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.repository.dao.SofPlanDao;

@Service
public class CargaService {
	
	private SofPlanDao dao;

	@Autowired
	public CargaService(SofPlanDao dao){
		this.dao = dao;
	}
	
	
	

	public void executar() throws SQLException {
		dao.montagemDosDados();
		
	}
	

	

	
	/*public Object[][]  listarPorAssunto(){
		
		
		
	}*/
}
