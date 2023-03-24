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
public class SoftPlanFiltroService {
	
	public static void main(String main[]) {
		SoftPlanFiltroService s = new SoftPlanFiltroService();
		//s.listarQuantidadeProcessoPorAssuntoFiltradoPorDataInicialFinal(null,null,null);
	}

	
	/*--------------------------------------------------------------------------------------------*/
	/* TABELAS AUXILIARES PARA FILTRO
	/*--------------------------------------------------------------------------------------------*/
	 
	public List<ComboDto> listarSecretariaPreitura() throws SQLException {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT S1.CDORGAOSETOR, S1.NMORGAOSETOR, S1.FLSETORATIVO FROM ");
		sql.append(" ECPAORGAOSETOR S1");
		sql.append(" WHERE S1.CDSETORPAI = 1");
		sql.append(" ORDER BY S1.NMORGAOSETOR");
		
		List<ComboDto> listaCombo = new ArrayList<ComboDto>();
		OracleSoftplan dao = new OracleSoftplan();
		ResultSet rs = dao.executeQuery(sql.toString());
		while (rs.next()) {
			ComboDto combo = new ComboDto();
			combo.setId(rs.getLong(1));
			combo.setDescricao(rs.getString(2));
			listaCombo.add(combo);
		}
		return listaCombo;
		
	}
}
