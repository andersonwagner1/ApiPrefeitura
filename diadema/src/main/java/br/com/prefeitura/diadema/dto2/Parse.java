package br.com.prefeitura.diadema.dto2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.prefeitura.diadema.ws.abaco.inscricao.ArrayOfSdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens;
import br.com.prefeitura.diadema.ws.abaco.inscricao.ArrayOfSdtDadosCadastraisEmpresaCnaeItens;
import br.com.prefeitura.diadema.ws.abaco.inscricao.ArrayOfSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens;
import br.com.prefeitura.diadema.ws.abaco.inscricao.ArrayOfSdtDadosCadastraisEmpresaProcuradorItens;
import br.com.prefeitura.diadema.ws.abaco.inscricao.ArrayOfSdtDadosCadastraisEmpresaRepresentanteLegalItens;
import br.com.prefeitura.diadema.ws.abaco.inscricao.ArrayOfSdtDadosCadastraisEmpresaServicoItens;
import br.com.prefeitura.diadema.ws.abaco.inscricao.ArrayOfSdtDadosCadastraisEmpresaSocioItens;
import br.com.prefeitura.diadema.ws.abaco.inscricao.SdtDadosCadastraisEmpresa;
import br.com.prefeitura.diadema.ws.abaco.inscricao.SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens;
import br.com.prefeitura.diadema.ws.abaco.inscricao.SdtDadosCadastraisEmpresaCnaeItens;
import br.com.prefeitura.diadema.ws.abaco.inscricao.SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens;
import br.com.prefeitura.diadema.ws.abaco.inscricao.SdtDadosCadastraisEmpresaProcuradorItens;
import br.com.prefeitura.diadema.ws.abaco.inscricao.SdtDadosCadastraisEmpresaRepresentanteLegalItens;
import br.com.prefeitura.diadema.ws.abaco.inscricao.SdtDadosCadastraisEmpresaServicoItens;
import br.com.prefeitura.diadema.ws.abaco.inscricao.SdtDadosCadastraisEmpresaSocioItens;

public class Parse {
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	 private String parseStringDate(Date date) {
	        if (date != null) {
	            return sdf.format(date);
	        } else {
	            return "0000-00-00";
	        }

	    }
	
	public SdtDadosCadastraisEmpresa converter(InscricaoDto dto){
		SdtDadosCadastraisEmpresa e = new SdtDadosCadastraisEmpresa();
		e.setFLGACAO(dto.getFlgacao());
		e.setDesRetorno(dto.getDesRetorno());
		e.setInscricaoMunicipal(dto.getInscricaoMunicipal());
		e.setSituacaoCadastral(dto.getSituacaoCadastral());
		e.setDescSituacaoCadastral(dto.getDescSituacaoCadastral());
		e.setRazaoSocial(dto.getRazaoSocial());
		e.setNomeFantasia(dto.getNomeFantasia());
		e.setCodigoNaturezaJuridica(dto.getCodigoNaturezaJuridica());
		e.setDescricaoNaturezaJuridica(dto.getDescricaoNaturezaJuridica());
		e.setValidadeCertificadoLicenciamentoIntegrado(parseStringDate(dto.getValidadeCertificadoLicenciamentoIntegrado()));
		e.setNumeroCertificadoLicenciamentoIntegrado(dto.getNumeroCertificadoLicenciamentoIntegrado());
		e.setInscricaoEstadual(dto.getInscricaoEstadual());
		e.setDataInicalMEI(dto.getDataInicalMEI());
		e.setNumeroCNPJ(dto.getNumeroCNPJ());
		e.setCodigoTipoISSQN(dto.getCodigoTipoISSQN());
		e.setDescricaoTipoISSQN(dto.getDescricaoTipoISSQN());
		e.setSituacaoTLFInicial(dto.getSituacaoTLFInicial());
		e.setDataAberturaEmpresa(dto.getDataAberturaEmpresa());
		e.setDataCadastroPrefeitura(dto.getDataCadastroPrefeitura());
		e.setNumeroCRCContador(dto.getNumeroCRCContador());
		e.setUFCRCContador(dto.getUfcrcContador());
		e.setNomeEscritorioContador(dto.getNomeEscritorioContador());
		e.setLogradouroNomeEscritorioContador(dto.getLogradouroNomeEscritorioContador());
		e.setNumeroEscritorioContador(dto.getNumeroEscritorioContador());
		e.setBairroNomeEscritorioContador(dto.getBairroNomeEscritorioContador());
		e.setMunicipioCodigoEscritorioContador(dto.getMunicipioCodigoEscritorioContador());
		e.setMunicipioNomeEscritorioContador(dto.getMunicipioNomeEscritorioContador());
		e.setMunicipioUFEscritorioContador(dto.getMunicipioUFEscritorioContador());
		e.setTelefoneEscritorioContador(dto.getTelefoneEscritorioContador());
		e.setCEPEscritorioContador(dto.getCepEscritorioContador());
		e.setNomeContador(dto.getNomeContador());
		e.setNumeroCPFContador(dto.getNumeroCPFContador());
		e.setNumeroRGContador(dto.getNumeroRGContador());
		e.setOrgaoExpedidorContador(dto.getOrgaoExpedidorContador());
		e.setLogradouroCodigoContador(dto.getLogradouroCodigoContador());
		e.setLogradouroTipoContador(dto.getLogradouroTipoContador());
		e.setLogradouroNomeContador(dto.getLogradouroNomeContador());
		e.setBairroCodigoContador(dto.getBairroCodigoContador());
		e.setBairroNomeContador(dto.getBairroNomeContador());
		e.setTelefoneContador(dto.getTelefoneContador());
		e.setNumeroLogradouroContador(dto.getNumeroLogradouroContador());
		e.setComplementoLogradouroContador(dto.getComplementoLogradouroContador());
		e.setCEPContador(dto.getCepContador());
		e.setMunicipioCodigoContador(dto.getMunicipioCodigoContador());
		e.setMunicipioNomeContador(dto.getMunicipioNomeContador());
		e.setMunicipioUFContador(dto.getMunicipioUFContador());
		e.setFAXContador(dto.getFaxContador());
		e.setEmailContador(dto.getEmailContador());
		e.setCNPJContador(dto.getCnpjContador());
		e.setQtdeFuncionarios(dto.getQtdeFuncionarios());
		e.setQtdeProfissionais(dto.getQtdeProfissionais());
		e.setValorCapitalSocial(dto.getValorCapitalSocial());
		e.setNumeroRegistroJunta(dto.getNumeroRegistroJunta());
		e.setNmrregjun(dto.getNmrregjun());
		e.setDataRegistroJunta(dto.getDataRegistroJunta());
		e.setProcessoUltimaAlteracaoJunta(dto.getProcessoUltimaAlteracaoJunta());
		e.setDataUltimaAlteracaoJunta(dto.getDataUltimaAlteracaoJunta());
		e.setInscricaoImobiliaria(dto.getInscricaoImobiliaria());
		e.setNumeroTelefoneEmpresa(dto.getNumeroTelefoneEmpresa());
		e.setHoraEntradaPrimario(dto.getHoraEntradaPrimario());
		e.setHoraSaidaPrimario(dto.getHoraSaidaPrimario());
		e.setHoraEntradaSecundario(dto.getHoraEntradaSecundario());
		e.setHoraSaidaSecundario(dto.getHoraSaidaSecundario());
		e.setHoraEntradaSabado(dto.getHoraEntradaSabado());
		e.setHoraSaidaSabado(dto.getHoraSaidaSabado());
		e.setHoraEntradaDomingo(dto.getHoraEntradaDomingo());
		e.setHoraSaidaDomingo(dto.getHoraSaidaDomingo());
		e.setObservacaoEmpresa(dto.getObservacaoEmpresa());
		e.setEmailEmpresa(dto.getEmailEmpresa());
		e.setMediaAreaOcupada(dto.getMediaAreaOcupada());
		e.setLogradouroCodigoLocalizacaoEmpresa(dto.getLogradouroCodigoLocalizacaoEmpresa());
		e.setBairroCodigoLocalizacaoEmpresa(dto.getBairroCodigoLocalizacaoEmpresa());
		e.setNumeroLocalizacaoEmpresa(dto.getNumeroLocalizacaoEmpresa());
		e.setCEPLocalizacaoEmpresa(dto.getCepLocalizacaoEmpresa());
		e.setMunicipioCodigoLocalizacaoEmpresa(dto.getMunicipioCodigoLocalizacaoEmpresa());
		e.setComplementoLocalizacaoEmpresa(dto.getComplementoLocalizacaoEmpresa());
		e.setCodigoClassificacaoAtividadeEconomica(dto.getCodigoClassificacaoAtividadeEconomica());
		e.setDescricaoClassificacaoAtividadeEconomica(dto.getDescricaoClassificacaoAtividadeEconomica());
		e.setComplementoAtividadeEconomica(dto.getComplementoAtividadeEconomica());
		
		List<SdtDadosCadastraisEmpresaCnaeItens> sdtDadosCadastraisEmpresaCnaeItenss = new ArrayList<SdtDadosCadastraisEmpresaCnaeItens>();
		

		for(Cnae c : dto.getCnaes()){
			SdtDadosCadastraisEmpresaCnaeItens SdtDadosCadastraisEmpresaCnaeItens = new SdtDadosCadastraisEmpresaCnaeItens();
			SdtDadosCadastraisEmpresaCnaeItens.setNumeroCnae(c.getNumeroCnae());
			sdtDadosCadastraisEmpresaCnaeItenss.add(SdtDadosCadastraisEmpresaCnaeItens);
		}
		
		ArrayOfSdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens caracteristicasFuncionamento = new ArrayOfSdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens();
		
		List<SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens> sdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens = new ArrayList<SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens>();;
					
		for(CaracteristicaFuncionamento caracteristicaFuncionamento : dto.getCaracteristicaFuncionamento()){
			SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens sdtDadosCadastraisEmpresaCaracteristicaFuncionamento = new SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens();
			sdtDadosCadastraisEmpresaCaracteristicaFuncionamento.setCodigoCaracteristicaFuncionamento(sdtDadosCadastraisEmpresaCaracteristicaFuncionamento.getCodigoCaracteristicaFuncionamento());
			sdtDadosCadastraisEmpresaCaracteristicaFuncionamento.setDescricaoCaracteristicaFuncionamento(caracteristicaFuncionamento.getDescricaoCaracteristicaFuncionamento());
			sdtDadosCadastraisEmpresaCaracteristicaFuncionamento.setQuantidadeCaracteristicaFuncionamento(caracteristicaFuncionamento.getQuantidadeCaracteristicaFuncionamento());
			//sdtDadosCadastraisEmpresaCaracteristicaFuncionamento.setSequencialCaractefisticaFuncionamento(caracteristicaFuncionamento.getSequencialCaractefisticaFuncionamento());
			sdtDadosCadastraisEmpresaCaracteristicaFuncionamento.setValorM2CaractefisticaFuncionamento(caracteristicaFuncionamento.getValorM2CaractefisticaFuncionamento());
			sdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens.add(sdtDadosCadastraisEmpresaCaracteristicaFuncionamento);
		}
		
		caracteristicasFuncionamento.setSdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens(sdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens );
		e.setCaracteristicasFuncionamento(caracteristicasFuncionamento); 
		
		
		ArrayOfSdtDadosCadastraisEmpresaCnaeItens arrayOfSdtDadosCadastraisEmpresaCnaeItens = new ArrayOfSdtDadosCadastraisEmpresaCnaeItens();
		arrayOfSdtDadosCadastraisEmpresaCnaeItens.setSdtDadosCadastraisEmpresaCnaeItens(sdtDadosCadastraisEmpresaCnaeItenss);
		e.setCnaes(arrayOfSdtDadosCadastraisEmpresaCnaeItens);
		
		
		List<SdtDadosCadastraisEmpresaSocioItens> sdtDadosCadastraisEmpresaSocioItens = new ArrayList<SdtDadosCadastraisEmpresaSocioItens>();
		for(Pessoa socio : dto.getSocios()){
			SdtDadosCadastraisEmpresaSocioItens t = new SdtDadosCadastraisEmpresaSocioItens();
			t.setNumeroCpfSocio(socio.getNumeroCpfSocio());
			t.setNumeroRgSocio(socio.getNumeroRgSocio());
			t.setNomeSocio(socio.getNomeSocio());
			t.setOrgaoExpedidorSocio(socio.getOrgaoExpedidorSocio());
			t.setLogradouroCodigoSocio(socio.getLogradouroCodigoSocio());
			t.setLogradouroTipoSocio(socio.getLogradouroTipoSocio());
			t.setLogradouroNomeSocio(socio.getLogradouroNomeSocio());
			t.setBairroCodigoSocio(socio.getBairroCodigoSocio());
			t.setBairroNomeSocio(socio.getBairroNomeSocio());
			t.setTelefoneSocio(socio.getTelefoneSocio());
			t.setNumeroLogradouroSocio(socio.getNumeroLogradouroSocio());
			t.setComplementoLogradouroSocio(socio.getComplementoLogradouroSocio());
			t.setEmailSocio(socio.getEmailSocio());
			t.setCEPSocio(socio.getcEPSocio());
			t.setMunicipioCodigoSocio(socio.getMunicipioCodigoSocio());
			t.setMunicipioNomeSocio(socio.getMunicipioNomeSocio());
			t.setMunicipioUfSocio(socio.getMunicipioUfSocio());
			t.setPaisCodigoSocio(socio.getPaisCodigoSocio());
			t.setPaisNomeSocio(socio.getPaisNomeSocio());
			
			sdtDadosCadastraisEmpresaSocioItens.add(t );
		}
		ArrayOfSdtDadosCadastraisEmpresaSocioItens value = new ArrayOfSdtDadosCadastraisEmpresaSocioItens();		
		value.setSdtDadosCadastraisEmpresaSocioItens(sdtDadosCadastraisEmpresaSocioItens);
		e.setSocios(value);
		

		List<SdtDadosCadastraisEmpresaRepresentanteLegalItens> sdtDadosCadastraisEmpresaRepresentanteLegalItens = new ArrayList<SdtDadosCadastraisEmpresaRepresentanteLegalItens>();
		for(Pessoa representeLegal : dto.getRepresentantesLegais()){
			SdtDadosCadastraisEmpresaRepresentanteLegalItens t = new SdtDadosCadastraisEmpresaRepresentanteLegalItens();
			t.setNumeroCpfRepresentanteLegal(representeLegal.getNumeroCpfSocio());
			t.setNumeroRgRepresentanteLegal(representeLegal.getNumeroRgSocio());
			t.setNomeRepresentanteLegal(representeLegal.getNomeSocio());
			t.setOrgaoExpedidorRepresentanteLegal(representeLegal.getOrgaoExpedidorSocio());
			t.setLogradouroCodigoRepresentanteLegal(representeLegal.getLogradouroCodigoSocio());
			t.setLogradouroTipoRepresentanteLegal(representeLegal.getLogradouroTipoSocio());
			t.setLogradouroNomeRepresentanteLegal(representeLegal.getLogradouroNomeSocio());
			t.setBairroCodigoRepresentanteLegal(representeLegal.getBairroCodigoSocio());
			t.setBairroNomeRepresentanteLegal(representeLegal.getBairroNomeSocio());
			t.setTelefoneRepresentanteLegal(representeLegal.getTelefoneSocio());
			t.setNumeroLogradouroRepresentanteLegal(representeLegal.getNumeroLogradouroSocio());
			t.setComplementoLogradouroRepresentanteLegal(representeLegal.getComplementoLogradouroSocio());
			t.setEmailRepresentanteLegal(representeLegal.getEmailSocio());
			t.setCEPRepresentanteLegal(representeLegal.getcEPSocio());
			t.setMunicipioCodigoRepresentanteLegal(representeLegal.getMunicipioCodigoSocio());
			t.setMunicipioNomeRepresentanteLegal(representeLegal.getMunicipioNomeSocio());
			t.setMunicipioUFRepresentanteLegal(representeLegal.getMunicipioUfSocio());
			t.setPaisCodigoRepresentanteLegal(representeLegal.getPaisCodigoSocio());
			t.setPaisNomeRepresentanteLegal(representeLegal.getPaisNomeSocio());			
			sdtDadosCadastraisEmpresaRepresentanteLegalItens.add(t);
		}
		
		
		ArrayOfSdtDadosCadastraisEmpresaRepresentanteLegalItens arrayOfSdtDadosCadastraisEmpresaRepresentanteLegalItens = new ArrayOfSdtDadosCadastraisEmpresaRepresentanteLegalItens();		
		arrayOfSdtDadosCadastraisEmpresaRepresentanteLegalItens.setSdtDadosCadastraisEmpresaRepresentanteLegalItens(sdtDadosCadastraisEmpresaRepresentanteLegalItens);
		e.setRepresentantesLegais(arrayOfSdtDadosCadastraisEmpresaRepresentanteLegalItens);
		
		
		List<SdtDadosCadastraisEmpresaProcuradorItens> sdtDadosCadastraisEmpresaProcuradorItens = new ArrayList<SdtDadosCadastraisEmpresaProcuradorItens>();
		for(Pessoa procuradores : dto.getProcuradores()){
			SdtDadosCadastraisEmpresaProcuradorItens t = new SdtDadosCadastraisEmpresaProcuradorItens();
		
			t.setNumeroCpfProcurador(procuradores.getNumeroCpfSocio());
			t.setNumeroRgProcurador(procuradores.getNumeroRgSocio());
			t.setNomeProcurador(procuradores.getNomeSocio());
			t.setOrgaoExpedidorProcurador(procuradores.getOrgaoExpedidorSocio());
			t.setLogradouroCodigoProcurador(procuradores.getLogradouroCodigoSocio());
			t.setLogradouroTipoProcurador(procuradores.getLogradouroTipoSocio());
			t.setLogradouroNomeProcurador(procuradores.getLogradouroNomeSocio());
			t.setBairroCodigoProcurador(procuradores.getBairroCodigoSocio());
			t.setBairroNomeProcurador(procuradores.getBairroNomeSocio());
			t.setTelefoneProcurador(procuradores.getTelefoneSocio());
			t.setNumeroLogradouroProcurador(procuradores.getNumeroLogradouroSocio());
			t.setComplementoLogradouroProcurador(procuradores.getComplementoLogradouroSocio());
			t.setEmailProcurador(procuradores.getEmailSocio());
			t.setCEPProcurador(procuradores.getcEPSocio());
			t.setMunicipioCodigoProcurador(procuradores.getMunicipioCodigoSocio());
			t.setMunicipioNomeProcurador(procuradores.getMunicipioNomeSocio());
			t.setMunicipioUfProcurador(procuradores.getMunicipioUfSocio());
			t.setPaisCodigoProcurador(procuradores.getPaisCodigoSocio());
			t.setPaisNomeProcurador(procuradores.getPaisNomeSocio());			
			sdtDadosCadastraisEmpresaProcuradorItens.add(t);
		}
		
		
		ArrayOfSdtDadosCadastraisEmpresaProcuradorItens arrayOfSdtDadosCadastraisEmpresaProcuradorItens = new ArrayOfSdtDadosCadastraisEmpresaProcuradorItens();
		arrayOfSdtDadosCadastraisEmpresaProcuradorItens.setSdtDadosCadastraisEmpresaProcuradorItens(sdtDadosCadastraisEmpresaProcuradorItens);
		e.setProcuradores(arrayOfSdtDadosCadastraisEmpresaProcuradorItens );
		
		
		ArrayOfSdtDadosCadastraisEmpresaServicoItens arrayOfSdtDadosCadastraisEmpresaServicoItens = new ArrayOfSdtDadosCadastraisEmpresaServicoItens();		
		List<SdtDadosCadastraisEmpresaServicoItens> sdtDadosCadastraisEmpresaServicoItens = new ArrayList<SdtDadosCadastraisEmpresaServicoItens>();
		for(Servico servico : dto.getServicos()){
			SdtDadosCadastraisEmpresaServicoItens sev = new SdtDadosCadastraisEmpresaServicoItens();
			sev.setCodigoServico(servico.getCodigoServico());
			sev.setDataFimServico(parseStringDate(servico.getDataFimServico()));
			sev.setDataInicioServico(parseStringDate(servico.getDataInicioServico()));
			sev.setSituacaoServico(servico.getSituacaoServico());
			sev.setTipoServico(servico.getTipoServico());
		}
		
		arrayOfSdtDadosCadastraisEmpresaServicoItens.setSdtDadosCadastraisEmpresaServicoItens(sdtDadosCadastraisEmpresaServicoItens );
		e.setServicos(arrayOfSdtDadosCadastraisEmpresaServicoItens);
		
		
		List<SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens> sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens = new ArrayList<SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens>();
		for(GrupoAtividade grupo : dto.getGrupoAtividade()){
			SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItenss = new SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens();
			sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItenss.setCodigoAtividade(grupo.getCodigoAtividade());
			sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItenss.setCodigoGrupoAtividade(grupo.getCodigoGrupoAtividade());
			sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItenss.setCodigoSubgrupoAtividade(grupo.getCodigoSubgrupoAtividade());
			sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItenss.setDataInicioAtividade(parseStringDate(grupo.getDataInicioAtividade()));
			sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItenss.setTipoAtividade(grupo.getTipoAtividade());
			
			sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens.add(sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItenss);
		}
		
		ArrayOfSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens arrayOfSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens = new ArrayOfSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens();
		arrayOfSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens.setSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens(sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens );
		e.setGrupoSubgrupoAtividades(arrayOfSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens);
		
		return e;
	}
}
