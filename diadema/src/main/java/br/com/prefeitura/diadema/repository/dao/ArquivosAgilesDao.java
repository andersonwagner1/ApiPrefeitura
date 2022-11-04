package br.com.prefeitura.diadema.repository.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ArquivosAgilesDao {
	
	private  OracleMobile connectionMobile = new OracleMobile();
	private  OracleBpm connectioBpms = new OracleBpm();
	private  OracleAgiles connectioAgiles = new OracleAgiles();
	
	
	
	
	
	
	public static void main(String main[]) throws SQLException{
		ArquivosAgilesDao p = new ArquivosAgilesDao();
		//p.listarTabelasQueTemArquivosMobile();
		p.insertAtualizacoesProcessos();
		
		System.out.println("finalizado ");
	}
	
	

	
	private ResultSet executarQuery(Long posicaoInicial, Long posicaoFinal) throws SQLException{
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT F.FILEVERSIONBLOBID AS CAMINHO,A.VERSIONABLETYPE || '-' ||A.VERSIONABLEID  AS PK_ARQUIVO,IT.NAME AS NOME_ARQUIVO, IT.ACTIVE AS ATIVO FROM  agiles.fileversiontable F" );
		sql.append(" INNER JOIN  versionabletable A ON A.versionablecurrentversionid = F.fileversionid" );
		sql.append(" INNER JOIN agiles.ITEM IT ON F.FILEVERSIONID = IT.ID AND F.FILEVERSIONTYPE = IT.ITEMTYPE" );
		sql.append(" WHERE FILEVERSIONBLOBID BETWEEN " +posicaoInicial + " AND " + posicaoFinal);
		
		ResultSet rs = connectioAgiles.executeQuery(sql.toString());
		
		
		return rs;
	}
	
	private void insertAtualizacoesProcessos(){
		
		Long posInicial = 0L;
		Long posFinal = 0L;
		boolean p = true;
		Long id = 0L;
		while(p){
			posFinal = posInicial + 6000L;
			try {
				//ResultSet rs = executarQuery(posInicial, posFinal);
				
				StringBuffer sql = new StringBuffer();
				sql.append(" SELECT F.FILEVERSIONBLOBID AS CAMINHO,A.VERSIONABLETYPE || '-' ||A.VERSIONABLEID  AS PK_ARQUIVO,IT.NAME AS NOME_ARQUIVO, IT.ACTIVE AS ATIVO FROM  agiles.fileversiontable F" );
				sql.append(" INNER JOIN  versionabletable A ON A.versionablecurrentversionid = F.fileversionid" );
				sql.append(" INNER JOIN agiles.ITEM IT ON F.FILEVERSIONID = IT.ID AND F.FILEVERSIONTYPE = IT.ITEMTYPE" );
				sql.append(" WHERE FILEVERSIONBLOBID BETWEEN " +posInicial + " AND " + posFinal);
				
				Connection conn = connectioAgiles.conexao3();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString());
				//ResultSet rs = connectioAgiles.executeQuery(sql.toString());
				
				
				System.out.println("Lendo " + posInicial + " " + posFinal);
				p = false;
				while(rs.next()){
					id++;
					connectioBpms.execute("INSERT INTO com_versao (DS_ALTERACOES_VERSAO, DS_PROJETO, NR_VERSAO, ID_VERSAO) VALUES ('"+ rs.getString(1) +"','"+ rs.getString(2) + "',0,"+id+")");
					//System.out.println(id);
					p = true;
				}
				
				connectioBpms.close();
				
				rs.close();				
				conn.close();
				posInicial = posFinal + 1;
			} catch (SQLException e) {
			// 	TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
		
		
		
	}





	private ResultSet executarQueryBpms(String tabela){		
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM ");
		sql.append(tabela);
				
		ResultSet rs;
		try {
			rs = connectioBpms.executeQuery(sql.toString());			
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	private ResultSet executarQueryAgiles(String tabela){		
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM ");
		sql.append(tabela);
				
		ResultSet rs;
		try {
			rs = connectioAgiles.executeQuery(sql.toString());			
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	private ResultSet executarQueryMobile(String tabela){		
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM ");
		sql.append(tabela);
				
		ResultSet rs;
		try {
			rs = connectionMobile.executeQuery(sql.toString());			
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public void listarTabelasQueTemArquivosMobile() throws SQLException{
		String tabelasMobile = "adm_consulta, adm_metodo, adm_modulo, adm_pagina, adm_sistema, adm_solicitacao_acesso, adm_solicitacaounidade, adm_solicitacaousuario, adm_usuario, adm_usuario_metodo, adm_usuario_modulo, adm_usuario_pagina, agl_agenda_processo, agl_historico, agl_pagina, agl_perfil, agl_perfil_permissao, agl_permissao, agl_usuario, agl_usuario_perfil, agl_usuario_permissao, bkpprot_doc_base_evnt_dgtl, bkpprot_documentos_juntados, bkpprot_evento_digital, bkpprot_protocolo_pe, bkpprot_requisicao_processo, bpkprot_documento_base, b1709241101_documento_base, b1709241101_evento_digital, b1709241102_documento_base, b1709241103_documento_base, com_agilesanexo, com_cnae, iass_ambulante, iass_ambulante_aluguel, iass_ambulante_aposentadoria, iass_ambulante_atestado, iass_ambulante_ce, iass_ambulante_ct, iass_ambulante_tempo_diadema, iass_comprovante, iass_dependentes, iass_parecersesa, iass_processoambulante, iass_ranking, log_alt_usu, md_alt_atividade_visa_v1, md_alt_atividade_visa_v1_an, md_alt_endereco_visa_v1, md_alt_endereço_visa_v1_an, md_alt_equipamento_visa_v1_an, md_alt_equip_exclusão_visa1_an, md_alt_equip_inclusão_visa1_an, md_alteracao_cmc, md_alteracao_cmc_sem_vre, md_alt_polo_passivo_pf, md_alt_polo_passivo_pf_an, md_alt_polo_passivo_pj, md_alt_polo_passivo_pj_an, md_alt_razao_social_visa_v1, md_alt_razão_social_visa_v1_an, md_alt_resp_legal_visa_v1, md_alt_resp_legal_visa_v1_an, md_alv_alin_cop_plan_lot_v1, md_alv_alin_cop_plan_lot_v1_an, md_alv_ampliacao_v1, md_alv_ampliacao_v1_an, md_alv_ampliacao_v2, md_alv_aut_mob_v1, md_alv_aut_mob_v1_an, md_alv_condo_v1, md_alv_condo_v1_an, md_alv_condo_v2, md_alv_constr_mov_terra_v1, md_alv_constr_mov_terra_v1_an, md_alv_constr_mov_terra_v2, md_alv_demo_arrim_v1, md_alv_demo_arrim_v1_an, md_alv_demo_arrim_v2, md_alv_demo_arrim_v2_an, md_alv_demolicao_v1, md_alv_desd_desm_v1, md_alv_desd_desm_v1_an, md_alv_desm_gleba_v1, md_alv_func_alt_risco_v1, md_alv_func_alt_risco_v1_an, md_alv_func_alt_ris_post_v1, md_alv_func_alt_ris_post_v1_an, md_alv_func_apos_23h_v1, md_alv_func_apos_23h_v1_an, md_alv_func_radio_base_v1, md_alv_func_radio_base_v1_an, md_alv_inst_radio_base_v1, md_alv_inst_radio_base_v1_an, md_alv_loc_func_v1, md_alv_loc_func_v1_an, md_alv_loteamento_v1, md_alv_loteamento_v1_an, md_alv_muro_arrimo_v1, md_alv_muro_arrimo_v2, md_alv_proj_modif_v1, md_alv_proj_modif_v1_an, md_alv_proj_modif_v2, md_alv_recon_refor_v1, md_alv_recon_refor_v1_an, md_alv_recon_refor_v2, md_alv_recon_refor_v2_an, md_alv_trasl_ossos_v1, md_alv_trasl_ossos_v1_an, md_alv_unif_v1, md_alv_unif_v1_an, md_anuencia_previa_v1, md_anuencia_previa_v1_an, md_art_assuncao_resp_tec_v1, md_art_assuncao_resp_tec_v1_an, md_ass_resp_tec_visa_v1_an, md_atend_licitacao_v1, md_atend_oficio_v1, md_atestado_cap_tecnica, md_atestado_cap_tecnica_an, md_atest_cap_hab_obras_v1, md_atest_cap_tec_v1, md_atualizacao_cadastral, md_atualizacao_cadastral_an, md_atualizacao_cadastral_pj, md_atualizacao_cadastral_v2, md_aut_arv_publico_v1, md_aut_cacamba_v1, md_autentic_planta_v1, md_aut_sup_poda_arv_ac10_v1, md_aut_sup_poda_arv_ac10_v1_an, md_aut_sup_poda_arv_v1, md_aut_sup_poda_arv_v1_an, md_auxiliar_de_taxi_v1, md_averigu_mult_trans_v1, md_averigu_mult_trans_v1_an, md_aver_taxa_lixo_v1, md_baixa_cmc, md_baixa_cmc_v1, md_baixa_cmc_v2, md_baixa_debitos_an, md_baixadebitos_pf_av2, md_baixadebitos_pf_av2_an, md_baixa_debitos_pf_v3, md_baixadebitos_pj_av2, md_baixadebitos_pj_av2_an, md_baixadebitov1_an, md_baixa_deb_multa_trans_v1, md_baixa_deb_multa_trans_v1_an, md_baixa_funcionarios, md_baixa_geral_v1, md_baixa_jogos_eletronicos, md_baixa_luminoso, md_baixa_mei, md_baixa_resp_tecn_visa_v1, md_baixa_resp_tecn_visa_v1_an, md_balanco_de_med_con_visa1, md_balanco_de_med_con_visa1_an, md_basico_v1, md_beneficio_ampliacao, md_beneficio_aumento_issqn, md_beneficio_aumento_issqn_v2, md_beneficio_certificado_cid, md_beneficio_cooperativas, md_beneficio_emancip_v1, md_beneficio_fomento, md_beneficio_fomento_v2, md_beneficio_melhoramento_v1, md_beneficio_valor_adicionado, md_beneficio_valor_v2, md_brt_baixa_resp_tecn_v1, md_brt_baixa_resp_tecn_v1_an, md_cadastro_caminhao_v1, md_cadastro_fornecedor, md_cadastro_fornecedor_an, md_cadastro_fornecedor_m1, md_cadastro_fornecedor_m1v4, md_cadastro_fornecedor_v2_an, md_cadastro_fornecedor_v3, md_cadastro_fornecedor_v6, md_cad_cabeleireiro_visa_v1_an, md_cad_clin_estetica_visa_1_an, md_cad_col_residuos_v1, md_cad_de_poco_visa_v1_an, md_cad_dis_água_camin_visa__an, md_cad_forn_obras_v1, md_cad_ger_residuos_v1, md_cad_massag_tatuag_v1_an, md_cad_motorista_aut_visa_1_an, md_cad_tran_de_alim_fis_v1_an, md_canc_amb_feir_v1, md_canc_cmc, md_canc_cmc_an, md_canc_cmc_pf, md_canc_cmc_pf_an, md_canc_cmc_pf_v2, md_canc_cmc_pf_v3, md_canc_cmc_pj_v2, md_canc_cmc_v1, md_canc_deb_arrematacao_v1, md_canc_deb_cgeral, md_canc_deb_funeraria, md_canc_deb_funeraria_an, md_canc_debito_iptu, md_canc_deb_leilao_arremat, md_canc_deb_leilao_arremat_an, md_cancelamento_deb_cmc, md_cancelamento_de_licenca_an, md_cancelamento_lic_visa_v1, md_cancelamento_lic_visa_v1_an, md_cancel_debitos_geral_v1, md_canc_funeraria_v1, md_canc_issqn_simples_nac, md_canc_issqn_simples_nac_an, md_canc_lic_seg_alim_v1, md_canc_multa_trans_v1, md_canc_multa_trans_v1_an, md_canc_nf, md_canc_nota_fiscal_v2, md_canc_ou_recurso_autoinfr, md_canc_ou_recurso_autoinfr_an, md_canc_simples_nacional_v2, md_ccmom_dtm_v2, md_cee_horiz_v1, md_cee_vert_v1, md_cert_banco_dados_v1, md_cert_banco_dados_v1_an, md_cert_dados_alv_func_v1, md_cert_dados_alv_func_v1_an, md_cert_existencia, md_certidao_de_ambulante_an, md_certidao_dti, md_certidao_negativa, md_certid_diretrizes_v1, md_certid_diretrizes_v1_an, md_certid_numap_pot_guia_v1, md_certid_numap_pot_guia_v1_an, md_certid_num_proc_pot_v1, md_certid_num_sem_aprov_v1, md_certid_num_sem_aprov_v1_an, md_certif_conc_obra_lic_v1, md_certif_conc_obra_lic_v1_an, md_certif_mud_uso_v1, md_certif_mud_uso_v1_an, md_certif_obra_nao_lic_v1, md_certif_obra_nao_lic_v1_an, md_cert_inexistencia, md_cert_infra_v1, md_cert_inicio, md_cert_obra_demo_inicio_v1, md_cert_obra_demo_inicio_v1_an, md_cert_uso_do_solo_v1, md_cert_uso_solo_v1, md_cert_uso_solo_v1_an, md_cert_veg_amb_v1, md_cert_veg_amb_v1_an, md_cmc_mei_v1, md_cmc_provisorio, md_coleta_lixo_hosp_v1, md_coleta_lixo_hosp_v1_an, md_com_assuncao_rt_v1, md_com_assuncao_rt_v1_an, md_com_baixa_rt_v1, md_com_baixa_rt_v1_an, md_compensacao_debito_pf_v2, md_compensacao_debito_pj_v2, md_compensacao_debitos_pf, md_compensacao_debitos_pf_an, md_compensacao_debitos_pj, md_compensacao_debitos_pj_an, md_compensacao_geral_vi, md_com_peq_obra_serv_v1_an, md_com_peq_obra_v1, md_comum_proc_super_v1, md_comum_proc_v1, md_comum_proc_v1_an, md_comum_super_v1, md_comum_v1, md_comum_v1_an, md_comunicado_ause_visa, md_convers_advertencia_v1, md_copia_imag_cam_v1, md_copia_imag_cam_v1_an, md_dec_manif_amb_v1_, md_dec_manif_amb_v1__an, md_defesa_previa, md_delib_perm_transp_v1, md_desc_iptu_area_verde, md_desc_iptu_area_verde_an, md_desc_iptu_cooperativa, md_desc_iptu_cooperativa_an, md_desc_iptu_cooperativa_v2, md_desc_iptu_icms_an, md_desc_iptu_rua_de_feira, md_desc_iptu_rua_de_feira_an, md_desconto_area_verde_v1, md_desconto_cooperativa_v3, md_desconto_iptu_icms_v2, md_desconto_iptu_lei_283, md_desc_rua_de_feira_v2, md_desm_apartamentos_v2, md_desm_comercio_residencia, md_desm_comercio_residencia_an, md_desmembramento_iptu_v4, md_desm_iptu_aeis, md_desm_iptu_aeis_an, md_desm_iptu_aptos, md_desm_iptu_aptos_an, md_desm_iptu_area_manancial, md_desm_iptu_area_manancial_an, md_desm_iptu_exceto_mananc, md_desm_iptu_exceto_mananc_an, md_desm_res_e_com_v3, md_dev_cau_out_oner_v1, md_dev_cau_out_oner_v1_an, md_dev_itbi_pj_v2, md_devolucao_geral_v1, md_devolucao_importancia_pf, md_devolucao_importancia_pf_an, md_devolucao_importancia_pf_v1, md_devolucao_importancia_pj, md_devolucao_importancia_pj_an, md_devolucao_importancia_pj_v1, md_devolucao_itbi_pf_v3, md_devolucao_itbi_pj_an, md_devolucao_itb_pf, md_devolucao_itb_pf_an, md_devolucao_v1_pf, md_devolucao_v1_pj, md_dispensa_da_visa_v1, md_dispensa_da_visa_v1_an, md_edital_sesa_feira_div_v1, md_edital_sesa_feira_not_v1, md_edital_sesa_finados_v1, md_edital_sesa_mar_cult_v1, md_edital_sesa_pescado_v1, md_empr_albergada_visa_v1, md_empr_albergada_visa_v1_an, md_enchente_v1, md_est_defis_cond_v1_an, md_est_defis_cond_v2, md_est_defis_cond_v2_an, md_est_defis_nocond_v1, md_est_defis_nocond_v1_an, md_est_idoso_cond_v1_an, md_est_idoso_cond_v2, md_est_idoso_cond_v2_an, md_est_idoso_nocond_v1, md_est_idoso_nocond_v1_an, md_est_idoso_v3_an, md_est_of_justica_cond_v1, md_est_of_justiça_cond_v1_an, md_est_of_justica_nocond_v1, md_est_of_justiça_nocond_v1_an, md_estudo_viabilidade_cid, md_exclusao_ativ_cmc, md_exclusao_ativ_cmc_an, md_ficha_tecnica_v1, md_ficha_tec_v1_an, md_honorarios, md_if_ampliacao_v1, md_if_issqn_v1, md_if_optante_simples_v1, md_if_valor_adicionado_v1, md_inc_fisc_atual_proj_v2, md_inc_fisc_atual_proj_v3, md_inc_fisc_ben_amp_com_v1, md_inc_fisc_ben_aum_iss_v1, md_inc_fisc_ben_aum_val_ad_v1, md_inc_fisc_ben_coop_v1, md_inc_fisc_ben_mel_imovel_v1, md_inc_fisc_ben_simples_nac_v1, md_inc_fisc_cert_inc_des_v1, md_inc_fisc_conc_cid_v2, md_inc_fisc_conc_cid_v3, md_inc_fisc_conc__desc_cid, md_incorporacao_visa_v1_an, md_ind_danos_diversos_v1, md_ind_danos_diversos_v1_an, md_ind_danos_veiculos_v1, md_ind_danos_veiculos_v1_an, md_ind_danos_veiculo_v1, md_indicacao_de_condutor_v1, md_instalacao_banca_jornal, md_instalacao_banca_jornal_an, md_inut_medic_visa_v1, md_ipred_3, md_ipred_31, md_ipred_32, md_ipva_desconto_iptu, md_ipva_desconto_iptu_an, md_ipva_desconto_iptu_v1, md_ipva_pecunia, md_ipva_pecunia_an, md_ipva_pecunia_v1, md_ipva_pecunia_v2, md_isencao_aposentado_v2, md_isencao_aposentado_v4, md_isencao_aposent_def, md_isencao_aposent_def_an, md_isencao_emancipador, md_isencao_emancipador_an, md_isencao_emancipador_v2, md_isencao_emancipador_v3, md_isencao_enchente, md_isencao_entidade_social, md_isencao_entidade_social_an, md_isencao_idoso_v1, md_isencao_issqn, md_isencao_issqn_an, md_isencao_itbi_pf, md_isencao_itbi_pf_an, md_isencao_itbi_pj, md_isencao_itbi_pj_an, md_isencao_pensionista, md_isencao_pensionista_an, md_isencao_pensionista_v4, md_isencao_resp_idoso_defis_v1, md_isencao_templo_alugado_an, md_isencao_temploalugado_v3, md_isencao_temploalug_v2_an, md_isencao_templo_proprio, md_isencao_templo_proprio_an, md_isencao_temploproprio_v2, md_isencao_temploproprio_v2_an, md_isencao_temploproprio_v3, md_isencao_tlf, md_itbi_devolucao_v1, md_itbi_isencao_pf_v1, md_itbi_isencao_pj_v1, md_liberacao_vre_ddu_v1, md_liberacao_vre_ddu_v1_an, md_liberacao_vre_visa_v1, md_lib_vre_ddu_v1_an, md_lic_amb_ativ_son_v1, md_lic_ambulante_edital_v1_an, md_lic_ambulante_v1, md_lic_ambulante_v1_an, md_lic_att_v1, md_lic_emp_popular_v1, md_lic_emp_popular_v1_an, md_lic_empr_pop_edital_v1_an, md_lic_feirante_edital_v1, md_lic_feirante_edital_v1_an, md_lic_feirante_v1, md_lic_feirante_v1_an, md_lic_func_equip_v1, md_lic_func_equip_v1_an, md_licitacao, md_licitacao_novo_v1, md_licitacao_v1, md_licitacao_v2, md_licitacao_v3, md_licitacao_v4, md_lic_visa_alto_risco_v1, md_lic_visa_alto_risco_v1_an, md_lta_visa_v1, md_lta_visa_v1_an, md_memorando_pai_v1, md_microfil_indicacao_v1, md_modelo_teste, md_motofrete_pes_fisica_v1_an, md_motofrete_pes_fisica_v2_an, md_motofrete_pes_fisica_v3_an, md_motofrete_pes_fisica_v4, md_motofrete_pes_fisica_v4_an, md_motofrete_pes_juridic_v1_an, md_motofrete_pes_juridic_v2_an, md_motofrete_pes_juridic_v3, md_motofrete_pes_juridic_v3_an, md_multa_paga_trans_v1, md_notifica_visa_v1, md_notifica_visa_v1_an, md_pai_adiantamento_v1, md_pai_adiantamento_v1_an, md_pai_adiantamento_v3, md_pai_an, md_paipadraov1, md_pai_padrao_v2, md_par_amb_ativ_son_v1, md_par_amb_ativ_son_v1_an, md_parecer_res_cons_civil_v1, md_pec_compras_obras_v1_an, md_pec_compras_obras_v2, md_pec_compras_v1, md_pec_compras_v1_an, md_pec_compras_v2, md_placa_vermelha_pf_v1, md_placa_vermelha_pj_v1, md_polo_passivo_geral_v1, md_possuidor, md_possuidor_an, md_possuidor_v1, md_possuidor_v2, md_posta_notif_de_trans_v1, md_ppp_v1, md_ppp_v1_an, md_prest_inf_finan_v1, md_pror_prazo_v1, md_pror_prazo_v1_an, md_prorr_prazo_finan, md_prorr_prazo_finan_an, md_protocolo_incentivo_fiscal, md_pta_analise_prev_v1, md_pta_analise_prev_v1_an, md_public_trans_ag_veic_v1, md_public_trans_ag_veic_v1_an, md_public_trans_social_v1, md_public_trans_social_v1_an, md_reativacao_cmc, md_reativacao_cmc_an, md_reativacao_cmc_v1, md_reb_lev_guia_v1, md_rec_aip_aif_visa1, md_rec_aip_aif_visa1_an, md_rec_cartao_elet_transp_v1, md_reconsideracao_sn, md_reconsideracao_sn_v1, md_recurso_ai_v1, md_recurso_ai_v1_an, md_recurso_multa__e_levant, md_recurso_multa__e_levant_an, md_recurso_nt_v1, md_recurso_nt_v1_an, md_recurso_1_ins_jari_v1, md_recurso_2_ins_cetran_v1, md_reg_oner_4392017_v1, md_reg_parc_solo_v1, md_reg_prof_v1, md_reg_prof_v1_an, md_relat_mens_visa1, md_relat_mens_visa1_an, md_ren_ata_de_au_insp_visa1, md_ren_ata_de_au_insp_visa1_an, md_ren_lic_visa_v1, md_ren_lic_visa_v1_an, md_ressar_mul_em_dupl_v1, md_ressar_mul_pg_ind_v1, md_ressar_rec_def_v1, md_ret_doc_v1_an, md_retific_doc_v1, md_rev_alv_alt_risc_v1, md_rev_alv_desd_lote_v1, md_rev_alv_func_alt_risco_v_an, md_rev_alv_func_alt_risc_v1, md_rev_alv_func_alt_risc_v1_an, md_rev_alv_func_apos_23h_v1, md_rev_alv_func_apos_23h_v1_an, md_rev_alv_sem_vre_v1, md_rev_amv_v1, md_rev_amv_v1_an, md_rev_aut_mob_v1, md_rev_aut_mob_v1_an, md_rev_constr_refor_v1, md_rev_constr_refor_v1_an, md_rev_desd_lote_v1, md_rev_desd_lote_v1_an, md_rev_func_alt_ris_post_v1, md_rev_func_alt_ris_post_v1_an, md_rev_func_radio_base_v1, md_rev_func_radio_base_v1_an, md_revisao_enq, md_revisao_enquadramento_v1, md_revisao_iptu, md_revisão_iptu_an, md_revisao_iptu_v2, md_revisao_iptu_v3, md_rev_lic_equip_v1, md_rev_lic_equip_v1_an, md_rev_loc_func_v1, md_rev_loc_func_v1_an, md_rev_unif_lote_v1, md_rev_unif_lote_v1_an, md_rmv_visa_v1_an, md_servicos_de_cargas_v1, md_solic_ait_manual_foto_v1, md_solic_cnes_visa_v1, md_solic_cnes_visa_v1_an, md_solic_2_via_notificacao, md_tac_t_adeq_cond_visa1, md_tac_t_adeq_cond_visa1_an, md_t_c_a__ter_coleta_visa1_an, md_termo_inutiliz_med_visa1_an, md_termo_rec_prov_ou_def_an, md_transf_banca_jornal, md_transf_banca_jornal_an, md_transf_lic_feirante_v1, md_transf_lic_feirante_v1_an, md_transf_permis_escolar_v1_an, md_transf_permis_escolar_v2, md_transf_permis_escolar_v2_an, md_transf_permis_táxi_v1_an, md_transf_permis_taxi_v2, md_transf_permis_táxi_v2_an, md_transp_alim_p_jur_visa1_an, md_unif_garagem_apto_v2_an, md_unif_gar_apto_an, md_unificacao_garagem_apto, md_unific_res_com_v2, md_unif_res_com, md_unif_res_com_an, md_uso_do_solo_v1, md_uso__estac_caçambas_v1_an, md_uso__estac_cacambas_v2, md_uso__estac_caçambas_v2_an, md_visa1_alt_endereco_pf, md_visa1_alt_endereco_pj, md_visa1_atend_aif_aip, md_visa1_atendimentos, md_visa1_atend_tn, md_visa1_balancos_drog_farm, md_visa1_canc_lic, md_visa1_com_fab_disp_prod, md_visa1_com_imp_disp_reg, md_visa1_dec_pmd, md_visa1_emp_alb, md_visa1_formularios, md_visa1_inc_exc_veiculo, md_visa1_lic_emp_alb, md_visa1_lic_equip, md_visa1_lic_ret, md_visa1_lic_san_pf, md_visa1_lic_san_pj, md_visa1_livro_info, md_visa1_misoprostol, md_visa1_ren_san_pf, md_visa1_ren_san_pj, md_visa1_requerimento, md_visa1_saude_ambiental, md_visa1_tac, md_visa1_talidomida, md_vistas_ou_copia_de_dcto, md_vistas_ou_copia_de_dcto_an, md_vistas_ou_copia_v1, md_2_via_resul_defesa_v1, md_2_via_resul_recurso_v1, pe_assinatura_digital, pe_boletos, pmd_ce_mensagem, pmd_ce_mensagem_at290818, pmd_ce_mensagem_x_at290818, pmd_ce_msg_arquivo, pmd_ce_msg_arquivo_at290818, pmd_ce_msg_erro, pmd_ce_msg_erro_at290818, pmdce_msgerro_at290818, pmd_ce_msg_log, pmd_ce_msg_log_at290818, prot_alteracao_historico, prot_alteracao_processo, prot_alteracao_situacao, prot_anexo, prot_arquivo, prot_atributo_to, prot_avalia_reposta, prot_aviso_processo, prot_aviso_usuario, prot_categoria, prot_doc_base_evnt_dgtl, prot_documento_base, prot_documentos_juntados, prot_evento_digital, prot_exception_log, prot_excessao, prot_historico_pagamento, prot_mb_arquivo_documento, prot_mb_atributo, prot_mb_documento, prot_mb_modelo_arquivo, prot_meta_info_mat_atr, prot_modelo_documental, prot_nivel1, prot_nivel2, prot_prefeitura, prot_processo, prot_protocolo, prot_protocolo_historico, prot_protocolo_pe, prot_registro_arquivo_anexo, prot_requisicao_processo, prot_resp_tipo_solicitacao, prot_role, prot_role_usu, prot_sessao, prot_solicitacao, prot_substituicao_usuario, prot_sub_tipo_taxa, prot_taxa_publica, prot_termo, prot_tipo_solicitacao, prot_tipo_solicitacao_bkp, prot_tipo_taxa, prot_unidade, prot_unidade_usu_funcionario, prot_unidade_usu_lider, prot_uni_usu_fun, prot_uni_usu_lid, prot_usuario, prot_usuario_interno, prot_usuario_protocolo, rel_consulta, se_aceite_orientacao, se_atividade_auxiliar, se_cidade, se_cnae, se_declaracao, se_declaracao_bombeiro, se_empresa, se_empresa_atividade_auxiliar, se_empresa_cnae, se_estado, se_irregularidade, se_licenca, se_licenca_declaracao, se_licenca_irregularidade, se_licenca_motivo_cassacao, se_licenca_motivo_indeferiment, se_licenca_restricao_operacao, se_licenca_restricao_viabilid, se_licenc_motivo_cancel_cassac, sema_arquivo_anexado, sema_nao_duplicado, sema_osa_semelhante, sema_protocolo, sema_protocolo_arquivo, sema_protocolo_hist, sema_protocolo_hist_adv, sema_protocolo_hist_multa, sema_situacao, sema_solicitacao, sema_solicitacao_arquivo, sema_tipoassunto, sema_tipofinalizado, sema_usuario_camara, se_motivo_cancelament_cassacao, se_motivo_cassacao, se_motivo_indeferimento, se_natureza_juridica, se_orgao, se_orientacao, se_pergunta, se_pergunta_resposta, se_porte, se_publicidades, se_restricao_operacao, se_restricao_viabilidade, se_socio, seso_engenheiro, se_solicitacao, seso_protocolo, seso_protocolo_hist, seso_solicitacao, seso_tipoassunto, se_status_informar_licenca, se_status_solicitacao_licenca, se_telefone, se_tipo_logradouro, se_tipo_natureza_juridica, se_vre_enq_iss_vre_servic_iss, se_vre_inscric_municip_public, se_vre_inscr_municip_vre_socio, se_vre_inscr_munic_vre_public, se_vre__munic_vre_inscr_cnae, sgn_certificates, sgn_files, sgn_p7s, sgn_signatures, sgn_virtual_file, unidade_usu_funcionario, via_carga, via_cartografia, via_cartografia_historico, via_carto_zoneamento, via_cnae, via_empresa, via_empresa_cnae, via_restricao, via_sub_categoria, via_tipo_insc_imovel, via_tipo_logradouro, via_zoneamento, vre_analise_informacao, vre_anexo, vre_atividade_enconomica, vre_enquadramentoiss, vre_inscricao_cnae, vre_inscricaomunicipal, vre_protocolo, vre_publicidade, vre_servico, vre_servicos_iss, vre_socio, vre_taxa";
		String tabelasBpms = "adm_campo, adm_cha_usuario, adm_chefe_unidade, adm_consulta, adm_consultausuario, adm_menu, adm_pagina, adm_solicitacao, adm_solicitacaounidade, adm_solicitacaousuario, admtbl_campo, admtbl_tabela, admtbl_tipocampo, adm_tipo_campo, com_agilesanexo, com_cnae, com_consulta, com_email, com_email_anexo, com_erro, com_imagem, com_mensagem, com_sla, com_tipo_documento, com_tramitacao, com_tramitacaohistorico, com_versao, employees, iass_ambulante, iass_ambulante_aluguel, iass_ambulante_aposentadoria, iass_ambulante_atestado, iass_ambulante_ce, iass_ambulante_ct, iass_ambulante_documento, iass_ambulante_tempo_diadema, iass_comprovante, iass_dependentes, iass_parecersesa, iass_processoambulante, iass_ranking, idcertidaousosolo, jaa_baselegal, jaa_empreendedorpopular, jaa_faltas, jaa_infracao, jaa_justificativa, jaa_motivosrecusa, jaa_parecerjustificativa, jaa_parecermotivorecusa, jaa_registronotificacoes, pmd_alt_cnae, pmd_alt_inscricao_municipal, pmd_alt_inscr_munic_alt_public, pmd_alt_inscr_munic_alt_socio, pmd_alt_inscr_municip_alt_cnae, pmd_alt_publicidades, pmd_alt_socio, pmd_analise_informac_adicion, pmd_analise_regularizac_anexo, pmd_analise_regularizacao, pmd_analise_viabilidade, pmd_analise_viabilidad_parecer, pmd_analis_viabil_empres_exist, pmd_anexo, pmd_arq_cli_vre_arq_cli_vr_tem, pmd_arquivo_cli_vre, pmd_arquivo_cli_vrei_tem, pmd_atendimento_presencial, pmd_atividade, pmd_cartografia, pmd_cnae, pmd_codigo_servico, pmd_complemento_atividade, pmd_email, pmd_email_pk_anexos, pmd_empresa_existente, pmd_enq_at_ec_enq_ativ_econ_c, pmd_enq_ativid_econom_complem, pmd_enq_iss_enq_issc_odig_serv, pmd_enquadramento_iss, pmd_enquadr_atividad_economica, pmd_enquadr_issc_odigo_servico, pmd_falha_de_integracao, pmd_inscricao_municipal, pmd_inscricao_municipal_anexo, pmd_inscricao_municipal_cnae, pmd_inscricao_municipal_socio, pmd_inscric_municipal_arquivos, pmd_inscric_municipal_publicid, pmd_irregularidade, pmd_licenca, pmd_licenca_irregularidade, pmd_motivo, pmd_parecer, pmd_pdfa_tendimento, pmd_pesq_numero_inscric_anexo, pmd_pesquisa_numero_inscricao, pmd_processo, pmd_protocolo, pmd_protocolo_licenca, pmd_protocolo_status, pmd_publicidades, pmd_regiao, pmd_restricao_licenca, pmd_restricao_viabilidade, pmd_sla, pmd_socio, pmd_taxas_ddu, pmd_taxas_ddu_anexo, pmd_taxas_vigilancia, pmd_taxas_vigilancia_anexo, pmd_tipo_inscricao_municipal, pmd_usuario, pmd_zona, pmd_zoneamento, rcus_analisenaopermitido, rcus_analisepermitido, rcus_analisesaa, rcus_boleto, rcus_ceritificadousosolo, rcus_cetesp, rcus_cnaes, rcus_cnae_secundario, rcus_comuniquese, rcus_fic, rcus_imovel, rcus_mensagem, rcus_mensagem_anexo, rcus_naopermitido, rcus_permitido, rcus_regiao, rcus_solicitante, rcus_sub_categoria_industria, rcus_zona, rcus_zoneamento, rcus_zoneamentos, rla_ambulante, rla_atividade, rla_comprovante, rla_decamanexo, rla_decamenviar, rla_documento, rla_parecerfiscal, rla_parecersesa, rla_renovacaolicenca, se_iass_ambulant_iass_depend, sema_arquivo_anexado, sema_protocolo, sema_protocolo_arquivo, sema_protocolo_hist, sema_solicitacao, sema_tipofinalizado, se_vlra_empreend_vlar_document, se_vre_enq_iss_vre_servic_iss, svsp_abre_vaga, svsp_parecer_assistente, svsp_parecer_central, svsp_parecer_sesa, svsp_processo_selecao, via_arquivo_anexado, via_carga, via_cartografia, via_cartografia_arquivo, via_cartografia_historico, via_carto_zoneamento, via_cnae, via_empresa, via_empresa_cnae, via_restricao, via_sub_categoria, via_tipo_insc_imovel, via_tipo_logradouro, via_zoneamento, vlar_documento, vlar_empresaaltorisco, vlar_publicacaodou, vlra_empreendimento, vlra_parecer, vre_aceite_orientacao, vre_aguardar_carga, vre_analise_informacao, vre_anexo, vre_atividade_auxiliar, vre_atividade_enconomica, vre_carga, vre_cidade, vre_cnae, vre_declaracao, vre_declaracao_bombeiro, vre_empresa, vre_empresa_atividade_auxiliar, vre_empresa_cnae, vre_enquadramentoiss, vre_estado, vre_inscricao_cnae, vre_inscricaomunicipal, vre_irregularidade, vre_licenca, vre_licenca_declaracao, vre_licenca_irregularidade, vre_licenca_motivo_cassacao, vre_licenca_motivo_indeferim, vre_licenca_restricao_operacao, vre_licenca_restricao_viabilid, vre_lic_motivo_cancel_cassac, vre_motivo_cancelam_cassacao, vre_motivo_cassacao, vre_motivo_indeferimento, vre_natureza_juridica, vre_orgao, vre_orientacao, vre_pergunta, vre_pergunta_resposta, vre_porte, vre_protocolo, vre_publicidade, vre_restricao_operacao, vre_restricao_viabilidade, vre_servico, vre_servicos_iss, vre_socio, vre_solicitacao, vre_status_informar_licenca, vre_status_solicitacao_licenca, vre_taxa, vre_telefone, vre_tipo_logradouro, vre_tipo_natureza_juridica";
		String tabelasAgiles = "acl_permissions, acl_permission_types, acl_relationship, agiles_parameters, agiles_setup_tasks, agl_db_changelog, agl_db_changelog_lock, at_attribute_type, at_custom, at_date, at_item, at_script, at_select, audittrail, blobdata, calendar, calendardayxrefs, calendarweekdayxrefs, checkoutfileversion, checkoutversion, choosequery, choosequeryparams, classlibrary, connection_pools, containermembers, day, dayperiodxrefs, dbmap, documentserver, documentserverusers, document_type, dtproperties, event_handling, event_handling_published, externalmodules, filefulltext, fileversiontable, fixedinformation, form, formattribute, formattributexref, formautonumber, formmodifiers, form_option_values, formtemplate, form_value_boolean, form_value_date, form_value_float, form_value_int, form_value_item, form_value_option, form_value_text, formview, functionlibrary, htmlforminstance, htmlformtemplate, item, itemmetadatatable, item_type_values, loginhistory, md_instance, md_instance_values, md_template, mimetypetable, module, nm_channel, nm_channelaudience, nm_channelnewsxref, nm_channelowners, nm_news, note, organizationaldimension, organizationallevel, oti_instance, oti_instance_stage, ott_action, ott_screen, ott_stage, ott_stage_type, ott_template, ott_temporal_event, pdfforminstance, pdfformtemplate, period, permissions, persistentcommand, portletdefinition, portlets, pr_activityassignees, pr_activityassignees_hist, pr_activityinstance, pr_activityinstance_events, pr_activityinstancelog, pr_activitytemplate, pr_activitytemplate_events, pr_automatic_activation, pr_automaticactivity, pr_automaticactivitytemplate, pr_eventactivityinstance, pr_eventactivitytemplate, pr_formtasktemplatetable, pr_gatewaytemplate, pr_notactivitytemplate, pr_notificationactivity, pr_notification_recipients, pr_pooltemplate_lanes, pr_prev_activities, pr_processinstance, pr_processinstancecontext, pr_processinstanceforms, pr_processinstancenotes, pr_processinstanceresp, pr_processtemplate_activities, pr_processtemplate_form, pr_processtemplate_responsible, pr_processtemplate_start, pr_processtemplate_transitions, pr_processtemplateversiontable, pr_signalactivation, pr_signalevent, pr_signaleventlistener, pr_signaleventlistenerprops, pr_signaleventprops, pr_signalizedactivities, pr_subprocessactivity, pr_subprocessactivitytemplate, pr_taskinstance, pr_tasktemplatetable, pr_useractivity, pr_useractivity_index, pr_useractivity_index_hist, pr_useractivity_myactivities, pr_useractivitytemplatetable, pr_webformtasktemplatetable, publisheditems, queries, relateditems, schedulertask, schedulertask_activity, schedulertask_duedate, schedulertask_temporalevent, schedulertask_timedinvocation, screen, sequencial, submodule, taskmessages, taskmessagesnodes, userfoldertable, userpasswords, userreplacement, usertable, uservisitorfilters, versionabletable, versiontable, weekday, weekdayperiodsxrefs, agata.atr00, apex_030200.wwv_flow_dual100, apex_030200.wwv_flow_lov_temp, apex_030200.wwv_flow_temp_table, ctxsys.dr$number_sequence, ctxsys.dr$object_attribute, ctxsys.dr$policy_tab, ctxsys.dr$ths, ctxsys.dr$ths_phrase, exfsys.rlm$parsedcond, itmon.auditlogon$__$ittech, juridico.cadandexfis_042007";
		
		String listaTablesMobile[] = tabelasMobile.split(",");
		String listaTablesBpms[] = tabelasBpms.split(",");
		String listaTablesAgiles[] = tabelasAgiles.split(",");
		
		
		ResultSet rs;
		for(String t : listaTablesMobile){
			rs = executarQueryMobile(t);
			Boolean[] localizacaoArquivo = pecorrerListaColunasParaSaberSeAColunaEhUmPonteiroArquivo(rs);	
			gerarSqlParaListarArquivo(localizacaoArquivo, t, rs);
		}
		
		
		
		for(String t : listaTablesBpms){
			rs = executarQueryBpms(t);
			Boolean[] localizacaoArquivo = pecorrerListaColunasParaSaberSeAColunaEhUmPonteiroArquivo(rs);	
			gerarSqlParaListarArquivo(localizacaoArquivo, t, rs);
		}
		
				
		for(String t : listaTablesAgiles){
			rs = executarQueryAgiles(t);
			Boolean[] localizacaoArquivo = pecorrerListaColunasParaSaberSeAColunaEhUmPonteiroArquivo(rs);	
			gerarSqlParaListarArquivo(localizacaoArquivo, t, rs);
		}
		
		
		
		
		
		
	}
	
	final String LOCALIZAR_PREVIXO = "9-";
	
	
	
	
	
	private void gerarSqlParaListarArquivo(Boolean[] localizacaoArquivo,String t, ResultSet rs) throws SQLException {
		int i = 0;
		for(Boolean b : localizacaoArquivo){
			if(b != null && b){
				System.out.println("SELECT " + rs.getMetaData().getColumnLabel(i+1).trim() + " FROM " + t + ";");
			}
			i++;
		}		
	}


	private Boolean[] pecorrerListaColunasParaSaberSeAColunaEhUmPonteiroArquivo(
			ResultSet rs) throws SQLException {
		int colunas = rs.getMetaData().getColumnCount();
		
		Boolean colunasValida[]= new Boolean[colunas] ;
		int todosCamposPreenchidos = 0;
		
		while (rs.next()) {
			for (int i = 0; i < colunas; i++) {
				
				//se a coluna ainda não foi validada
				if(colunasValida[i] == null || !colunasValida[i]) {
					Object valor = rs.getObject(i+1);
					if(valor != null){
						
						//System.out.println(valor);
						if(valor.toString().startsWith(LOCALIZAR_PREVIXO)){
							colunasValida[i] = true;
						}else{
							colunasValida[i] = false;
						}
						todosCamposPreenchidos++;
					}
				}
				
				//finaliza
				if(todosCamposPreenchidos == colunas){
					return colunasValida;
				}				
			}
		}
		return colunasValida;

	}

}
  