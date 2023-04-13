package br.com.prefeitura.diadema.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.ComboDto;
import br.com.prefeitura.diadema.dto.TreeDto;
import br.com.prefeitura.diadema.repository.dao.OracleSoftplan;

@Service
public class SoftPlanFiltroService {
	
	public static void main(String main[]) throws SQLException {
		SoftPlanFiltroService s = new SoftPlanFiltroService();
		//s.listarQuantidadeProcessoPorAssuntoFiltradoPorDataInicialFinal(null,null,null);
		List<TreeDto> list = s.listarArvoreArquivo(null, 0);
		System.out.println(list);
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

	
	
	public List<TreeDto> listarArvoreArquivo(Long cdCodigoSecretaria, int nivel) throws SQLException {
		if(nivel >= 2){
			return null;
		}
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT "); 
		sql.append(" S1.CDORGAOSETOR AS ID_SETOR, S1.NMORGAOSETOR AS NOME_SETOR, S1.SGORGAOSETOR AS SIGLA_SETOR , S1.CDSETORPAI AS PAI");
		sql.append(" FROM ECPAORGAOSETOR S1 ");
		
		if(cdCodigoSecretaria == null){
			sql.append(" WHERE S1.CDSETORPAI IS NULL");
		}else{
			sql.append(" WHERE S1.CDSETORPAI = " +cdCodigoSecretaria);
		}
		
		
		List<TreeDto> listaCombo = new ArrayList<TreeDto>();
		OracleSoftplan dao = new OracleSoftplan();
		ResultSet rs = dao.executeQuery(sql.toString());
		
		while (rs.next()) {
			TreeDto combo = new TreeDto();
			combo.setKey(rs.getLong(1));
			combo.setLabel(rs.getString(2));
			combo.setData(rs.getString(3));
			combo.setChildren(listarArvoreArquivo(rs.getLong(1), nivel + 1));
			listaCombo.add(combo);
		}
		rs.close();
		dao.close();
		return listaCombo;
	}
}
