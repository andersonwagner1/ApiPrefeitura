package br.com.prefeitura.diadema.repository.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LocalizarValores {
	
	public static void main(String arg[]) throws SQLException{
		LocalizarValores l = new LocalizarValores();
		//l.localizarValor("");
		//l.localizarValor(11970L);
		l.localizarValor("FERNANDA.SOUZA", false);//Cota-Despacho - PMDI 8111.24 assinado
		//32527218806
		//l.localizarValor(11970L, true);
		System.out.println("Fim");
	}
	/*
	SELECT * FROM ECPATIPOTAREFA WHERE upper(DETIPOTAREFA) like upper('%Analisar resposta do comunique-se%');
	SELECT * FROM ECPATIPOTAREFAESPECIALIZADA WHERE upper(DETIPOTAREFAESPECIALIZADA) like upper('%Analisar resposta do comunique-se%');
	SELECT * FROM ECPAFILATRABALHOTAREFA WHERE upper(DETIPOTAREFA) like upper('%Analisar resposta do comunique-se%');
	SELECT * FROM ECPAFILATRABALHOTAREFA WHERE upper(NMTAREFA) like upper('%Analisar resposta do comunique-se%');
	SELECT * FROM ECPATAREFA WHERE upper(NMTAREFA) like upper('%Analisar resposta do comunique-se%');*/
	
	
	String views[] = {};
	String views5[] = {"ecpaassunto", 
			"ecpaassuntowflaux", 
			"ecpacalculoassunto", 
			"ecpagrupoassunto", 
			"ecpaprocedeassunto", 
			"ecpatipotaxaproc", 
			"eswfautorizusuario", 
			"pmdvprocessoativos", 
			"pmdvsetores", 
			"vbpmatividadeinst", 
			"vbpmgrupo", 
			"vbpmgrupoemail", 
			"vbpmservicoassinc", 
			"vbpmusuario", 
			"vbpmusuariogrupo", 
			"vcdtenderecotipo", 
			"vcdtestadomunicipio", 
			"vcdtpessoa", 
			"vcdtpessoafisica", 
			"vcdtpessoajuridica", 
			"vcpaclasseorgaousuario", 
			"vcpaclasseperfilusuario", 
			"vcpaconsassunto", 
			"vcpaconsmenorass", 
			"vcpaconstramic", 
			"vcpaconstramiproc", 
			"vcpaconsultaproc", 
			"vcpaconsultaproc2", 
			"vcpaconsultatrami", 
			"vcpainteremail", 
			"vcpainteressado", 
			"vcpaintermatricula", 
			"vcpamenorassunto", 
			"vcpaorgaosetor", 
			"vcpapowerbi_munhoz", 
			"vcpaprocesso", 
			"vcpaprocessopendente", 
			"vcpaprocsetor", 
			"vcpaprontapenso", 
			"vcpatarefaspowerbi_munhoz", 
			"vcpatramiteusuario", 
			"vcpaultimafase", 
			"vcpaultimotramite", 
			"vcpaultimotramitec", 
			"vcpaulttramitecirc", 
			"vcpaulttramiteproc", 
			"vcpaulttramitevol", 
			"vcpaulttratinter", 
			"vcpausuarioorgao", 
			"vcpavaasclasse", 
			"vcpavaasinteressadoprocesso", 
			"vcpavaasprocesso", 
			"vecmautpasta", 
			"vecmmodeloversao", 
			"vecmmodelultversao", 
			"vecmsegmentacao", 
			"vjbpmtarefausuario", 
			"vmigtempclassesecundaria", 
			"vpclutilizacaoclasseusuario", 
			"vsamcandiinter", 
			"vsamcargointer", 
			"vsammunicinter", 
			"vsrhcadsimpfunc", 
			"vsrhfuncionario"};
			
	
			
			
			
			
			/*,
		/*	"ACL_PERMISSIONS",
			"ACL_PERMISSION_TYPES",
			"ACL_RELATIONSHIP",
		
			"AGILES_PARAMETERS",
		//	"AGILES_SETUP_TASKS",
		//	"AGL_DB_CHANGELOG",
		//	"AGL_DB_CHANGELOG_LOCK",
			"AT_ATTRIBUTE_TYPE",
			"AT_CUSTOM",
						"DATE",
			"AT_ITEM",
						"SCRIPT",
			"AT_SELECT",
						"ITTRAIL",
			//"BLOBDATA",
						"ENDAR",
			"CALENDARDAYXREFS",
			"CALENDARWEEKDAYXREFS",
			"CHECKOUTFILEVERSION",
			"CHECKOUTVERSION",
			"CHOOSEQUERY",
			"CHOOSEQUERYPARAMS",
			"CLASSLIBRARY",
			"CONNECTION_POOLS",
			"CONTAINERMEMBERS",
			/*"DAY",
			"DAYPERIODXREFS",
			"DBMAP",
			"DOCUMENTSERVER",
			"DOCUMENTSERVERUSERS",
			"DOCUMENT_TYPE",*/
	/*		"DTPROPERTIES",
			"EVENT_HANDLING",
			"EVENT_HANDLING_PUBLISHED",
			"EXTERNALMODULES",*/
		/*	"FILEFULLTEXT",
			"FILEVERSIONTABLE",
			"FIXEDINFORMATION",*/
		//	"FORM",
		/*	"FORMATTRIBUTE",
			"FORMATTRIBUTEXREF",
			"FORMAUTONUMBER",
			"FORMMODIFIERS",
			"FORMTEMPLATE",
			"FORMVIEW",
						"M_OPTION_VALUES",
			"FORM_VALUE_BOOLEAN",
			"FORM_VALUE_DATE",
			"FORM_VALUE_FLOAT",
			"FORM_VALUE_INT",
			"FORM_VALUE_ITEM",
			"FORM_VALUE_OPTION",
			"FORM_VALUE_TEXT",*/
		/*	"FUNCTIONLIBRARY",
			"HTMLFORMINSTANCE",
			"HTMLFORMTEMPLATE",*/
	//		"ITEM",
	/*		"ITEMMETADATATABLE",
			"ITEM_TYPE_VALUES",
			//"LOGINHISTORY",
			"MD_INSTANCE",
			"MD_INSTANCE_VALUES",
			"MD_TEMPLATE",
			"MIMETYPETABLE",
			"MODULE",
			"NM_CHANNEL",
			"NM_CHANNELAUDIENCE",
			"NM_CHANNELNEWSXREF",
			"NM_CHANNELOWNERS",
			"NM_NEWS",
						"E",
			"ORGANIZATIONALDIMENSION",
			"ORGANIZATIONALLEVEL",
			"OTI_INSTANCE",
			"OTI_INSTANCE_STAGE",
			"OTT_ACTION",
			"OTT_SCREEN",
			"OTT_STAGE",
						"_STAGE_TYPE",
			"OTT_TEMPLATE",
			"OTT_TEMPORAL_EVENT",
			"PDFFORMINSTANCE",
			"PDFFORMTEMPLATE",
			"PERIOD",
		//	"PERMISSIONS",
			"PERSISTENTCOMMAND",
			"PORTLETDEFINITION",
			"PORTLETS",
						"ACTIVITYASSIGNEES",
			"PR_ACTIVITYASSIGNEES_HIST",
			"PR_ACTIVITYINSTANCE",
			"PR_ACTIVITYINSTANCELOG",
			"PR_ACTIVITYINSTANCE_EVENTS",
			"PR_ACTIVITYTEMPLATE",
			"PR_ACTIVITYTEMPLATE_EVENTS",
			"PR_AUTOMATICACTIVITY",
			"PR_AUTOMATICACTIVITYTEMPLATE",
		//	"PR_AUTOMATIC_ACTIVATION",
			"PR_EVENTACTIVITYINSTANCE",
			"PR_EVENTACTIVITYTEMPLATE",
			"PR_FORMTASKTEMPLATETABLE",
			"PR_GATEWAYTEMPLATE",
			"PR_NOTACTIVITYTEMPLATE",
			"PR_NOTIFICATIONACTIVITY",
			"PR_NOTIFICATION_RECIPIENTS",
			"PR_POOLTEMPLATE_LANES",
			"PR_PREV_ACTIVITIES",
			"PR_PROCESSINSTANCE",
			"PR_PROCESSINSTANCECONTEXT",
			"PR_PROCESSINSTANCEFORMS",
			"PR_PROCESSINSTANCENOTES",
			"PR_PROCESSINSTANCERESP",
			"PR_PROCESSTEMPLATEVERSIONTABLE",
			"PR_PROCESSTEMPLATE_ACTIVITIES",
			"PR_PROCESSTEMPLATE_FORM",
			"PR_PROCESSTEMPLATE_RESPONSIBLE",
			"PR_PROCESSTEMPLATE_START",
			"PR_PROCESSTEMPLATE_TRANSITIONS",*/
		//	"PR_SIGNALACTIVATION",
		//	"PR_SIGNALEVENT",
		//	"PR_SIGNALEVENTLISTENER",
		//	"PR_SIGNALEVENTLISTENERPROPS",
	//		"PR_SIGNALEVENTPROPS",
	//		"PR_SIGNALIZEDACTIVITIES",
	//		"PR_SUBPROCESSACTIVITY",
	//		"PR_SUBPROCESSACTIVITYTEMPLATE",
		/*	"PR_TASKINSTANCE",
			"PR_TASKTEMPLATETABLE",
			"PR_USERACTIVITY",
			"PR_USERACTIVITYTEMPLATETABLE",*/
		//	"PR_USERACTIVITY_INDEX",
		//	"PR_USERACTIVITY_INDEX_HIST",
		//	"PR_USERACTIVITY_MYACTIVITIES",
	//		"PR_WEBFORMTASKTEMPLATETABLE",
		/*	"PUBLISHEDITEMS",
			"QUERIES",
			"ATEDITEMS",
			"SCHEDULERTASK",
			"SCHEDULERTASK_ACTIVITY",
			"SCHEDULERTASK_DUEDATE",
			"SCHEDULERTASK_TEMPORALEVENT",
			"SCHEDULERTASK_TIMEDINVOCATION",
			"SCREEN",
			"SEQUENCIAL",*/
	/*		"SUBMODULE",
			"KMESSAGES",
			"TASKMESSAGESNODES",
			"USERFOLDERTABLE",
			"USERPASSWORDS",
			"USERREPLACEMENT",
			"USERTABLE",
			"RVISITORFILTERS",
			"VERSIONABLETABLE",
			"VERSIONTABLE",
			"WEEKDAY",
			"KDAYPERIODSXREFS"
	
	
	};*/
	
	//private OracleAbaco coneection = new OracleAbaco();
	private OracleSoftplanProd coneection = new OracleSoftplanProd();
	//private OracleBpm coneection = new OracleBpm();
	//private OracleSoftplanHomolog coneection = new OracleSoftplanHomolog();
	//private OracleMobile coneection = new OracleMobile();
	//private OracleAgiles coneection = new OracleAgiles();
	
	 
	
	

	/**
	 * 
	 * @return
	 */
	private ResultSet listarTabelas(){
		System.out.println("----------------------- Iniciando ---------------------------");
		StringBuffer sqltabela = new StringBuffer();
		sqltabela.append("SELECT table_name FROM user_tables");
		sqltabela.append(" WHERE table_name NOT LIKE 'EMIG%'");
		
		System.out.println("- Buscando tabelas");
		
		
		ResultSet rs;
		
		try {
			rs = coneection.executeQuery(sqltabela.toString());
			
			return rs;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	private ResultSet listarColunas(String tabela, String tipo) throws SQLException{		
		StringBuffer sqlcoluna = new StringBuffer();
		sqlcoluna.append(" SELECT column_name, '1' ");
		sqlcoluna.append(" FROM   all_tab_cols ");
		sqlcoluna.append(" WHERE  table_name = '"+tabela+"' ");
		sqlcoluna.append(" and data_type = '"+tipo+"'");
		sqlcoluna.append(" and UPPER(column_name) <> 'VERSION'");
		sqlcoluna.append(" and UPPER(table_name) <> 'EMIGFLYWAYSCHEMAVERSION'");
		sqlcoluna.append(" and UPPER(column_name) not like 'SYS%'");
		
		
		
		ResultSet rsColunas = coneection.executeQuery(sqlcoluna.toString());
		//System.out.print(rsColunas.getRow());
		return rsColunas;
		
		
	}
	
	
	private void localizarValores(String tabela, String coluna, Long valor) throws SQLException{	
		StringBuffer sqlcoluna = new StringBuffer();
		sqlcoluna.append(" SELECT  count(*) ");
		sqlcoluna.append(" FROM  " + tabela);
		sqlcoluna.append(" WHERE " + coluna + " = " + valor);
		//sqlcoluna.append(" and UPPER(column_name) <> 'VERSION'");
		ResultSet rsColunas = coneection.executeQuery(sqlcoluna.toString());
		
		if(rsColunas.next()){
			
			if(rsColunas.getInt(1) > 0){
				System.out.println("SELECT * FROM " + tabela + " WHERE " + coluna + " = " + valor + ";");
			}
			
		}
		rsColunas.close();		
	}
	
	
	private void localizarValores(String tabela, String coluna, String valor, boolean exato) throws SQLException{	
		StringBuffer sqlcoluna = new StringBuffer();
		sqlcoluna.append(" SELECT  count(*) ");
		//sqlcoluna.append(" FROM  ECPAFORMULARIO" );
		sqlcoluna.append(" FROM  " + tabela);
		//sqlcoluna.append(" WHERE NMFORMULARIO LIKE upper('%" + valor +"%')");
		
		if(!exato){
			sqlcoluna.append(" WHERE upper(" + coluna + ") LIKE upper('%" + valor +"%')");
		}else{
			sqlcoluna.append(" WHERE upper(" + coluna + ") = upper('" + valor +"')");
		}
		ResultSet rsColunas = coneection.executeQuery(sqlcoluna.toString());
		//System.out.println(sqlcoluna.toString());
		if(rsColunas.next()){
			if(rsColunas.getInt(1) > 0){
				System.out.println("SELECT * FROM " + tabela + " WHERE upper(" + coluna + ") like upper('%" + valor + "%');");
			}
			
		}
		rsColunas.close();		
	}
	
	private void localizarValor(String valor, boolean exato) throws SQLException {
		
		ResultSet rs = listarTabelas();				
		int tabelas = 0;
		while(rs.next()){
			tabelas ++;
			String tabela = rs.getString(1);
			ResultSet rsColunas = listarColunas(tabela,"VARCHAR2");
			while(rsColunas.next()){
			//	System.out.println(rs.getString(1));
				localizarValores(rs.getString(1), rsColunas.getString(1), valor, exato);
			}
			rsColunas.close();
			
			ResultSet rsColunas2 = listarColunas(tabela,"NVARCHAR2");
			while(rsColunas2.next()){
				//System.out.println(rs.getString(1));
				localizarValores(rs.getString(1), rsColunas2.getString(1), valor, exato);
			}
			rsColunas2.close();
			
			
			/*ResultSet rsColunas3 = listarColunas(tabela,"CLOB");
			while(rsColunas3.next()){
				
				localizarValores(rs.getString(1), rsColunas3.getString(1), valor, exato);
			}
			rsColunas3.close();
			 */
		}
		
		
		for(String view : views){
			tabelas ++;
			ResultSet rsColunas = listarColunas(view,"VARCHAR2");
			//System.out.println(view);
		/*	
			if("PR_USERACTIVITY_MYACTIVITIES".equals(view)){
				System.out.println("estou aqui");
			}
		*/	
			while(rsColunas.next()){
				localizarValores(rs.getString(1), rsColunas.getString(1), valor, exato);
			}
			rsColunas.close();
		}
		
		
		
		
		rs.close();
		System.out.println("--- total de tabelas " + tabelas);
		
		
		
	}
	
	

	private void localizarValor(Long valor) throws SQLException {
		
		ResultSet rs = listarTabelas();				
		int tabelas = 0;
		while(rs.next()){
			tabelas ++;
			ResultSet rsColunas = listarColunas(rs.getString(1),"NUMBER");
			while(rsColunas.next()){
				localizarValores(rs.getString(1), rsColunas.getString(1), valor);
			}
			rsColunas.close();
		}	
		rs.close();
		
		
		for(String view : views){
			tabelas ++;
			ResultSet rsColunas = listarColunas(view,"VARCHAR2");
			while(rsColunas.next()){
				localizarValores(rs.getString(1), rsColunas.getString(1), valor);
			}
			rsColunas.close();
		}
		
		System.out.println("--- total de tabelas " + tabelas);
		
		
		
	}
	
	
}
