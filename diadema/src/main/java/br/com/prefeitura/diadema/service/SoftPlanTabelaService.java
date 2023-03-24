package br.com.prefeitura.diadema.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.ComboDto;
import br.com.prefeitura.diadema.repository.dao.OracleSoftplan;
import br.com.prefeitura.diadema.util.ExecutarQuery;

@Service
public class SoftPlanTabelaService {
	
	public static void main(String main[]) {
		SoftPlanTabelaService s = new SoftPlanTabelaService();
	//	s.listarQuantidadeProcessoPorAssuntoFiltradoPorDataInicialFinal(null,null,null);
	}
	

	
	public Object[][]  listarUsuariosMuitoTempoSemAcessar(){
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT U.CDUSUARIO, U.NMUSUARIO, U.DTATIVACAO, U.DTULTLOGINOK FROM ESEGUSUARIO U");
		sql.append(" WHERE U.FLHABILITADO = 'S'");
		sql.append(" AND U.DTULTLOGINOK < (SYSDATE -30)");	
		
		ExecutarQuery e = new ExecutarQuery();
		return e.executarQueryMatriz(sql.toString());
		
		
	}
}
