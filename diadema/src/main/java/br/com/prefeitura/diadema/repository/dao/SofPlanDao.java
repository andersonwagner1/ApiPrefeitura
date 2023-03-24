package br.com.prefeitura.diadema.repository.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.model.AdmCargaFormulario;
import br.com.prefeitura.diadema.repository.CargaAuxiliarRepository;

@Service
public class SofPlanDao{
	
	private  OracleMobile connectioAgiles = new OracleMobile();
	private  OracleMobile conultaAuxilires = new OracleMobile();
	
	private final String  ESTRUTURA = "{CAMPO=[$campo] VALOR=[$valor]}";

	private CargaAuxiliarRepository bargaAuxiliarRepository;
	
	public  static void main(String arg []) throws SQLException{
		SofPlanDao d = new SofPlanDao();
		d.montagemDosDados();
	}
	
	public SofPlanDao(){
	}
	
	
	@Autowired
	public SofPlanDao(CargaAuxiliarRepository bargaAuxiliarRepository){			
		this.bargaAuxiliarRepository = bargaAuxiliarRepository;
	
		
	}
	
	public void montagemDosDadosV2() throws SQLException{
		System.out.println(new Date());
		ResultSet resultSet = localizarTodosProcessos();
		
		
		String nomeTabela = "aux";
		//Long idAux = 0L;
		while(resultSet.next()){
			//System.out.println("Lendo " + resultSet.getLong("ID_DOCUMENTO_BASE"));
			Map<String, String> listaCampos = null;
			Long idModeloTabela = resultSet.getLong("modelo_id");
			Long idDocumentoBase = resultSet.getLong("ID_DOCUMENTO_BASE");
			//if(idModeloTabela != idAux){
				nomeTabela = localizarNomeTabela(idModeloTabela);
			//	idAux = idModeloTabela;
				
				listaCampos = localizarNomeCampos(nomeTabela);
			//}
			
			 String resultadoFormulario = localizarValoresCampos(idDocumentoBase,  nomeTabela, listaCampos);
			 
			AdmCargaFormulario formulario = new AdmCargaFormulario();
			
			
			formulario.setIdDocBase(idDocumentoBase);
			formulario.setFormulario(resultadoFormulario);
			formulario.setIdModelo(idModeloTabela);
			
			System.out.println("sucesso " + formulario.getIdDocBase() + " " + formulario.getFormulario());
			
			bargaAuxiliarRepository.save(formulario);
		//	System.out.println(formulario.getIdDocBase() +  " - " +  formulario.getFormulario());
			 
		}
		System.out.println("Finalizado");
		System.out.println(new Date());
		
		
		
		
		
	}
	
	
	public void montagemDosDados() throws SQLException{
		System.out.println(new Date());
		ResultSet resultSet = localizarTodosProcessos();
		
		
		String nomeTabela = "aux";
		//Long idAux = 0L;
		while(resultSet.next()){
			//System.out.println("Lendo " + resultSet.getLong("ID_DOCUMENTO_BASE"));
			Map<String, String> listaCampos = null;
			Long idModeloTabela = resultSet.getLong("modelo_id");
			Long idDocumentoBase = resultSet.getLong("ID_DOCUMENTO_BASE");
			//if(idModeloTabela != idAux){
				nomeTabela = localizarNomeTabela(idModeloTabela);
			//	idAux = idModeloTabela;
				
				listaCampos = localizarNomeCampos(nomeTabela);
			//}
			
			 String resultadoFormulario = localizarValoresCampos(idDocumentoBase,  nomeTabela, listaCampos);
			 
			AdmCargaFormulario formulario = new AdmCargaFormulario();
			
			
			formulario.setIdDocBase(idDocumentoBase);
			formulario.setFormulario(resultadoFormulario);
			formulario.setIdModelo(idModeloTabela);
			
			System.out.println("sucesso " + formulario.getIdDocBase() + " " + formulario.getFormulario());
			
			bargaAuxiliarRepository.save(formulario);
		//	System.out.println(formulario.getIdDocBase() +  " - " +  formulario.getFormulario());
			 
		}
		System.out.println("Finalizado");
		System.out.println(new Date());
		
		
		
		
		
	}
	
	private Map<String, String> localizarNomeCampos(String nomeTabela) throws SQLException{
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT  column_name FROM   all_tab_cols");
		sql.append(" WHERE  table_name = '" + nomeTabela + "'");
		sql.append(" and  column_name <> 'IDDOCBASE' ");
		sql.append(" ORDER by column_name");
		
		ResultSet resultSet = conultaAuxilires.executeQuery(sql.toString());

		Map<String, String> listaCampos = new HashMap<String, String>();
		while(resultSet.next()){
			listaCampos.put(resultSet.getString("column_name"), retonarNomeCampos(resultSet.getString("column_name")));
		}
		resultSet.close();
		conultaAuxilires.close();
		return listaCampos;
		
	}
	
	
	private String retonarNomeCampos(String id) throws SQLException{
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT COLUNAS.NM_ATT_MATERIALIZADO, COLUNAS.NOMEDEEXIBICAO");
		sql.append(" FROM PROT_META_INFO_MAT_ATR COLUNAS ");
		//sql.append(" WHERE NM_ATT_MATERIALIZADO IN('" + id + "')");
		sql.append("WHERE ID = " + id.replace("ATT", ""));
		
		ResultSet resultSet = connectioAgiles.executeQuery(sql.toString());
		
		if(resultSet.next()){
			String nomeExibido = resultSet.getString("NOMEDEEXIBICAO");
			resultSet.close();
		
			return nomeExibido;
		}
		resultSet.close();
		
		return "Falha me localizar o nome do campo " + id + " ";
		
		
	}
	
	
	private String localizarValoresCampos(Long idDocumentoBase, String tabela, Map<String, String> campos) throws SQLException{
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT * FROM  " + tabela);
		sql.append(" WHERE IDDOCBASE =  " + idDocumentoBase);
		//System.out.println(sql.toString());
		ResultSet resultSet = conultaAuxilires.executeQuery(sql.toString());
		
		StringBuffer formatacao = new StringBuffer();
		//System.out.println(campos);
		if(resultSet.next()){
			if(campos == null){
				
			}else{
				for (String key : campos.keySet()) {
					String nomeCampo = campos.get(key);
					String valorCampo = resultSet.getString(key);
					String linha = ESTRUTURA;
					linha = linha.replace("$campo", nomeCampo);
				
					linha = linha.replace("$valor", valorCampo == null? "" : valorCampo);
					formatacao.append(linha);
				}
				
			}
		}
		resultSet.close();
		conultaAuxilires.close();
//		System.out.println(formatacao);
	
		return formatacao.toString();
		
		
	}
	
	private String localizarNomeTabela(long id){
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT nome, nometabela FROM PROT_MODELO_DOCUMENTAL MD");
		sql.append(" WHERE MD.ID = " + id);
		
		try {
			ResultSet resultSet = conultaAuxilires.executeQuery(sql.toString());		
			
			if(resultSet.next()){
				String nomeTabela = resultSet.getString("nometabela");
				resultSet.close();
				conultaAuxilires.close();
				return nomeTabela;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	private ResultSet localizarTodosProcessos(){
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT MODELO_ID, E.ID_DOCUMENTO_BASE, E.IDENTIFICACAOLABEL, E.ASSUNTO" );
		sql.append(" FROM VIEW_PROCESSO_ELETRONICO E");
		sql.append(" WHERE E.ID_DOCUMENTO_BASE not in(SELECT F.ID_DOC_BASE FROM ADM_CARGA_FORMULARIO F) ");
		sql.append(" AND E.MODELO_ID NOT IN (1902, 3781, 3621, 4901, 5041, 1088, 1089, 1093, 1097, 1098, 2323, 2325, 2326, 2327, 2331, 2329, 2330, 2332, 2336, 3041, 3021, 3145, 3101, 3301, 1781, 2481, 3561, 3562, 5241, 5722, 21, 2423, 1428, 2967, 4361, 5602, 1421, 1422, 1561, 2337, 5182, 5705, 5706, 5707, 2027, 2028, 2661, 5462, 5463, 46, 5721, 5723, 62, 81, 83, 88, 89, 102, 103, 104, 2404, 3201, 3563, 3624, 3625, 4523, 2622, 3302, 3622, 3641, 3741, 5704, 3481, 4281, 5162, 1003, 3861, 2322, 2324, 2334, 4301, 4701, 5701, 5703, 4841, 4421, 5801, 1482, 3903, 5183, 5521, 504, 661, 2001, 2002, 2901, 2902, 2923, 3803, 4283, 2361, 3690, 2421, 3862, 5942, 5963, 3702, 1182, 3601, 3721, 3904, 3905, 5222, 3261, 3281, 5181, 5601, 2601, 1141, 2201, 3055, 3056, 3058, 3082, 3083, 5221, 5702, 222, 223, 231, 233, 234, 235, 241, 242, 243, 982, 2243, 5084, 921, 922, 923, 924, 925, 5001, 2321, 2333, 2335, 2338, 4141, 5083, 5441, 1382, 1942, 3421, 4582, 5502, 5541, 5561, 821, 843, 841, 842, 844, 845, 846, 847, 848, 850, 851, 852, 881, 885, 855, 856, 857, 858, 859, 860, 861, 862, 863, 864, 865, 866, 867, 868, 869, 870, 871, 872, 883, 874, 875, 876, 877, 878, 879, 880, 2022, 2023, 2024, 2025, 2026, 2029, 2030, 2581, 2582, 3141, 3143, 3144, 3147, 3149, 4203, 1424, 1425, 1543, 2362, 2363, 2405, 2583, 3686, 4102, 4284, 4821, 4842, 5082, 2741, 3623, 4702, 5081, 5261, 5281, 5401, 5402, 4042, 1662, 3342, 3343, 3362, 3366, 3802, 3662, 5461, 942, 943, 3541, 4266, 5085, 1081, 1082, 1083, 1084, 1085, 1086, 1087, 1090, 1091, 1092, 1094, 1095, 1096, 1099, 2021, 2381, 3761, 5141, 1383, 1701, 3582, 3681, 3687, 4641, 1302, 1681, 4181, 4801, 2061, 126, 132, 134, 153, 3382, 176, 182, 185, 194, 202, 3902, 2041, 3682, 3683, 3684, 3685, 3688, 3689, 5122, 5201, 2402, 2403, 4161, 244, 245, 246, 272, 282, 283, 1430, 1423, 2081, 2881, 2241, 3043, 3047, 3048, 3051, 3052, 3053, 3057, 3059, 3122, 4521, 3726, 4063, 4522, 1501, 3724, 3722, 3725, 4862, 5421, 5962, 3361, 3363, 3364, 4341, 1523, 2181, 4001, 267, 271, 421, 3462, 2242, 3501, 4302, 3727, 2422, 2424, 2621, 2681, 2966, 3822, 964, 962, 963, 965, 981, 1001, 1022, 1021, 1023, 1024, 1025, 1026, 1027, 1028, 1029, 1030, 1031, 1032, 1033, 1034, 1035, 1036, 1037, 1038, 1039, 1040, 1041, 1042, 1043, 1044, 1045, 1046, 1047, 1048, 1049, 1050, 1051, 1052, 1053, 1054, 1055, 1056, 1057, 1058, 1059, 1060, 1061, 1062, 1063, 1064, 1065, 1066, 1067, 1068, 1069, 1070, 2123, 2643, 3441, 2441, 3461, 3463, 3723, 3921, 886, 887, 901, 902, 903, 904, 905, 906, 3042, 908, 909, 3060, 3146, 3221, 3222, 3661, 2941, 2963, 2965, 3044, 3045, 3046, 3049, 3050, 3054, 3142, 3148, 5961, 462, 481, 581, 702, 1, 2, 3, 4, 1604, 2942, 2943, 2944, 2945, 2946, 2948, 2949, 3626, 4282, 4422, 5442, 5681, 2641, 2702, 2947, 2962, 2964, 3801, 4201, 4202, 4861)");
		sql.append(" OR E.DATA > SYSDATE-2");
		sql.append(" ORDER BY IDMODELODOCUMENTAL DESC");
		
		try {
			ResultSet resultSet = connectioAgiles.executeQuery(sql.toString());
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
