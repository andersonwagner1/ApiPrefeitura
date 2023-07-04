package br.com.prefeitura.diadema.dto2;

import java.util.Date;
import java.util.List;

public class InscricaoDto {

	private String flgacao;
	private String desRetorno;
	private String idRetorno;
	private Long inscricaoMunicipal;
	private String situacaoCadastral;
	private String descSituacaoCadastral;
	private String razaoSocial;
	private String nomeFantasia;
	private Integer codigoNaturezaJuridica;
	private String descricaoNaturezaJuridica;
	private Date validadeCertificadoLicenciamentoIntegrado;
	private String numeroCertificadoLicenciamentoIntegrado;
	private String inscricaoEstadual;
	private String dataInicalMEI;
	private String numeroCNPJ;
	private String codigoTipoISSQN;
	private String descricaoTipoISSQN;
	private String situacaoTLFInicial;
	private String dataAberturaEmpresa;
	private String dataCadastroPrefeitura;
	private String numeroCRCContador;
	private String ufcrcContador;
	private String nomeEscritorioContador;
	private String logradouroNomeEscritorioContador;
	private String numeroEscritorioContador;
	private String bairroNomeEscritorioContador;
	private Integer municipioCodigoEscritorioContador;
	private String municipioNomeEscritorioContador;
	private String municipioUFEscritorioContador;
	private String telefoneEscritorioContador;
	private String cepEscritorioContador;
	private String nomeContador;
	private String numeroCPFContador;
	private String numeroRGContador;
	private String orgaoExpedidorContador;
	private Integer logradouroCodigoContador;
	private String logradouroTipoContador;
	private String logradouroNomeContador;
	private Integer bairroCodigoContador;
	private String bairroNomeContador;
	private String telefoneContador;
	private String numeroLogradouroContador;
	private String complementoLogradouroContador;
	private String cepContador;
	private Integer municipioCodigoContador;
	private String municipioNomeContador;
	private String municipioUFContador;
	private String faxContador;
	private String emailContador;
	private String cnpjContador;
	private Short qtdeFuncionarios;
	private Short qtdeProfissionais;
	private Double valorCapitalSocial;
	private String numeroRegistroJunta;
	private String nmrregjun;
	private String dataRegistroJunta;
	private String processoUltimaAlteracaoJunta;
	private String dataUltimaAlteracaoJunta;
	private String inscricaoImobiliaria;
	private String numeroTelefoneEmpresa;
	private String horaEntradaPrimario;
	private String horaSaidaPrimario;
	private String horaEntradaSecundario;
	private String horaSaidaSecundario;
	private String horaEntradaSabado;
	private String horaSaidaSabado;
	private String horaEntradaDomingo;
	private String horaSaidaDomingo;
	private String observacaoEmpresa;
	private String emailEmpresa;
	private Double mediaAreaOcupada;
	private Integer logradouroCodigoLocalizacaoEmpresa;
	private Integer bairroCodigoLocalizacaoEmpresa;
	private String numeroLocalizacaoEmpresa;
	private String cepLocalizacaoEmpresa;
	private Integer municipioCodigoLocalizacaoEmpresa;
	private String complementoLocalizacaoEmpresa;

	private byte codigoClassificacaoAtividadeEconomica;
	private String descricaoClassificacaoAtividadeEconomica;
	private String complementoAtividadeEconomica;

	private List<Pessoa> socios;
	private List<Pessoa> procuradores;
	private List<Pessoa> representantesLegais;

	private List<Cnae> cnaes;
	private List<CaracteristicaFuncionamento> caracteristicaFuncionamento;
	private List<Servico> servicos;
	private List<GrupoAtividade> grupoAtividade;

	public String getFlgacao() {
		return flgacao;
	}

	public void setFlgacao(String flgacao) {
		this.flgacao = flgacao;
	}

	public String getDesRetorno() {
		return desRetorno;
	}

	public void setDesRetorno(String desRetorno) {
		this.desRetorno = desRetorno;
	}

	public String getIdRetorno() {
		return idRetorno;
	}

	public void setIdRetorno(String idRetorno) {
		this.idRetorno = idRetorno;
	}

	public Long getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(Long inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getSituacaoCadastral() {
		return situacaoCadastral;
	}

	public void setSituacaoCadastral(String situacaoCadastral) {
		this.situacaoCadastral = situacaoCadastral;
	}

	public String getDescSituacaoCadastral() {
		return descSituacaoCadastral;
	}

	public void setDescSituacaoCadastral(String descSituacaoCadastral) {
		this.descSituacaoCadastral = descSituacaoCadastral;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public Integer getCodigoNaturezaJuridica() {
		return codigoNaturezaJuridica;
	}

	public void setCodigoNaturezaJuridica(Integer codigoNaturezaJuridica) {
		this.codigoNaturezaJuridica = codigoNaturezaJuridica;
	}

	public String getDescricaoNaturezaJuridica() {
		return descricaoNaturezaJuridica;
	}

	public void setDescricaoNaturezaJuridica(String descricaoNaturezaJuridica) {
		this.descricaoNaturezaJuridica = descricaoNaturezaJuridica;
	}

	public Date getValidadeCertificadoLicenciamentoIntegrado() {
		return validadeCertificadoLicenciamentoIntegrado;
	}

	public void setValidadeCertificadoLicenciamentoIntegrado(
			Date validadeCertificadoLicenciamentoIntegrado) {
		this.validadeCertificadoLicenciamentoIntegrado = validadeCertificadoLicenciamentoIntegrado;
	}

	public String getNumeroCertificadoLicenciamentoIntegrado() {
		return numeroCertificadoLicenciamentoIntegrado;
	}

	public void setNumeroCertificadoLicenciamentoIntegrado(
			String numeroCertificadoLicenciamentoIntegrado) {
		this.numeroCertificadoLicenciamentoIntegrado = numeroCertificadoLicenciamentoIntegrado;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getDataInicalMEI() {
		return dataInicalMEI;
	}

	public void setDataInicalMEI(String dataInicalMEI) {
		this.dataInicalMEI = dataInicalMEI;
	}

	public String getNumeroCNPJ() {
		return numeroCNPJ;
	}

	public void setNumeroCNPJ(String numeroCNPJ) {
		this.numeroCNPJ = numeroCNPJ;
	}

	public String getCodigoTipoISSQN() {
		return codigoTipoISSQN;
	}

	public void setCodigoTipoISSQN(String codigoTipoISSQN) {
		this.codigoTipoISSQN = codigoTipoISSQN;
	}

	public String getDescricaoTipoISSQN() {
		return descricaoTipoISSQN;
	}

	public void setDescricaoTipoISSQN(String descricaoTipoISSQN) {
		this.descricaoTipoISSQN = descricaoTipoISSQN;
	}

	public String getSituacaoTLFInicial() {
		return situacaoTLFInicial;
	}

	public void setSituacaoTLFInicial(String situacaoTLFInicial) {
		this.situacaoTLFInicial = situacaoTLFInicial;
	}

	public String getDataAberturaEmpresa() {
		return dataAberturaEmpresa;
	}

	public void setDataAberturaEmpresa(String dataAberturaEmpresa) {
		this.dataAberturaEmpresa = dataAberturaEmpresa;
	}

	public String getDataCadastroPrefeitura() {
		return dataCadastroPrefeitura;
	}

	public void setDataCadastroPrefeitura(String dataCadastroPrefeitura) {
		this.dataCadastroPrefeitura = dataCadastroPrefeitura;
	}

	public String getNumeroCRCContador() {
		return numeroCRCContador;
	}

	public void setNumeroCRCContador(String numeroCRCContador) {
		this.numeroCRCContador = numeroCRCContador;
	}

	public String getUfcrcContador() {
		return ufcrcContador;
	}

	public void setUfcrcContador(String ufcrcContador) {
		this.ufcrcContador = ufcrcContador;
	}

	public String getNomeEscritorioContador() {
		return nomeEscritorioContador;
	}

	public void setNomeEscritorioContador(String nomeEscritorioContador) {
		this.nomeEscritorioContador = nomeEscritorioContador;
	}

	public String getLogradouroNomeEscritorioContador() {
		return logradouroNomeEscritorioContador;
	}

	public void setLogradouroNomeEscritorioContador(
			String logradouroNomeEscritorioContador) {
		this.logradouroNomeEscritorioContador = logradouroNomeEscritorioContador;
	}

	public String getNumeroEscritorioContador() {
		return numeroEscritorioContador;
	}

	public void setNumeroEscritorioContador(String numeroEscritorioContador) {
		this.numeroEscritorioContador = numeroEscritorioContador;
	}

	public String getBairroNomeEscritorioContador() {
		return bairroNomeEscritorioContador;
	}

	public void setBairroNomeEscritorioContador(
			String bairroNomeEscritorioContador) {
		this.bairroNomeEscritorioContador = bairroNomeEscritorioContador;
	}

	public Integer getMunicipioCodigoEscritorioContador() {
		return municipioCodigoEscritorioContador;
	}

	public void setMunicipioCodigoEscritorioContador(
			Integer municipioCodigoEscritorioContador) {
		this.municipioCodigoEscritorioContador = municipioCodigoEscritorioContador;
	}

	public String getMunicipioNomeEscritorioContador() {
		return municipioNomeEscritorioContador;
	}

	public void setMunicipioNomeEscritorioContador(
			String municipioNomeEscritorioContador) {
		this.municipioNomeEscritorioContador = municipioNomeEscritorioContador;
	}

	public String getMunicipioUFEscritorioContador() {
		return municipioUFEscritorioContador;
	}

	public void setMunicipioUFEscritorioContador(
			String municipioUFEscritorioContador) {
		this.municipioUFEscritorioContador = municipioUFEscritorioContador;
	}

	public String getTelefoneEscritorioContador() {
		return telefoneEscritorioContador;
	}

	public void setTelefoneEscritorioContador(String telefoneEscritorioContador) {
		this.telefoneEscritorioContador = telefoneEscritorioContador;
	}

	public String getCepEscritorioContador() {
		return cepEscritorioContador;
	}

	public void setCepEscritorioContador(String cepEscritorioContador) {
		this.cepEscritorioContador = cepEscritorioContador;
	}

	public String getNomeContador() {
		return nomeContador;
	}

	public void setNomeContador(String nomeContador) {
		this.nomeContador = nomeContador;
	}

	public String getNumeroCPFContador() {
		return numeroCPFContador;
	}

	public void setNumeroCPFContador(String numeroCPFContador) {
		this.numeroCPFContador = numeroCPFContador;
	}

	public String getNumeroRGContador() {
		return numeroRGContador;
	}

	public void setNumeroRGContador(String numeroRGContador) {
		this.numeroRGContador = numeroRGContador;
	}

	public String getOrgaoExpedidorContador() {
		return orgaoExpedidorContador;
	}

	public void setOrgaoExpedidorContador(String orgaoExpedidorContador) {
		this.orgaoExpedidorContador = orgaoExpedidorContador;
	}

	public Integer getLogradouroCodigoContador() {
		return logradouroCodigoContador;
	}

	public void setLogradouroCodigoContador(Integer logradouroCodigoContador) {
		this.logradouroCodigoContador = logradouroCodigoContador;
	}

	public String getLogradouroTipoContador() {
		return logradouroTipoContador;
	}

	public void setLogradouroTipoContador(String logradouroTipoContador) {
		this.logradouroTipoContador = logradouroTipoContador;
	}

	public String getLogradouroNomeContador() {
		return logradouroNomeContador;
	}

	public void setLogradouroNomeContador(String logradouroNomeContador) {
		this.logradouroNomeContador = logradouroNomeContador;
	}

	public Integer getBairroCodigoContador() {
		return bairroCodigoContador;
	}

	public void setBairroCodigoContador(Integer bairroCodigoContador) {
		this.bairroCodigoContador = bairroCodigoContador;
	}

	public String getBairroNomeContador() {
		return bairroNomeContador;
	}

	public void setBairroNomeContador(String bairroNomeContador) {
		this.bairroNomeContador = bairroNomeContador;
	}

	public String getTelefoneContador() {
		return telefoneContador;
	}

	public void setTelefoneContador(String telefoneContador) {
		this.telefoneContador = telefoneContador;
	}

	public String getNumeroLogradouroContador() {
		return numeroLogradouroContador;
	}

	public void setNumeroLogradouroContador(String numeroLogradouroContador) {
		this.numeroLogradouroContador = numeroLogradouroContador;
	}

	public String getComplementoLogradouroContador() {
		return complementoLogradouroContador;
	}

	public void setComplementoLogradouroContador(
			String complementoLogradouroContador) {
		this.complementoLogradouroContador = complementoLogradouroContador;
	}

	public String getCepContador() {
		return cepContador;
	}

	public void setCepContador(String cepContador) {
		this.cepContador = cepContador;
	}

	public Integer getMunicipioCodigoContador() {
		return municipioCodigoContador;
	}

	public void setMunicipioCodigoContador(Integer municipioCodigoContador) {
		this.municipioCodigoContador = municipioCodigoContador;
	}

	public String getMunicipioNomeContador() {
		return municipioNomeContador;
	}

	public void setMunicipioNomeContador(String municipioNomeContador) {
		this.municipioNomeContador = municipioNomeContador;
	}

	public String getMunicipioUFContador() {
		return municipioUFContador;
	}

	public void setMunicipioUFContador(String municipioUFContador) {
		this.municipioUFContador = municipioUFContador;
	}

	public String getFaxContador() {
		return faxContador;
	}

	public void setFaxContador(String faxContador) {
		this.faxContador = faxContador;
	}

	public String getEmailContador() {
		return emailContador;
	}

	public void setEmailContador(String emailContador) {
		this.emailContador = emailContador;
	}

	public String getCnpjContador() {
		return cnpjContador;
	}

	public void setCnpjContador(String cnpjContador) {
		this.cnpjContador = cnpjContador;
	}

	public Short getQtdeFuncionarios() {
		return qtdeFuncionarios;
	}

	public void setQtdeFuncionarios(Short qtdeFuncionarios) {
		this.qtdeFuncionarios = qtdeFuncionarios;
	}

	public Short getQtdeProfissionais() {
		return qtdeProfissionais;
	}

	public void setQtdeProfissionais(Short qtdeProfissionais) {
		this.qtdeProfissionais = qtdeProfissionais;
	}

	public Double getValorCapitalSocial() {
		return valorCapitalSocial;
	}

	public void setValorCapitalSocial(Double valorCapitalSocial) {
		this.valorCapitalSocial = valorCapitalSocial;
	}

	public String getNumeroRegistroJunta() {
		return numeroRegistroJunta;
	}

	public void setNumeroRegistroJunta(String numeroRegistroJunta) {
		this.numeroRegistroJunta = numeroRegistroJunta;
	}

	public String getNmrregjun() {
		return nmrregjun;
	}

	public void setNmrregjun(String nmrregjun) {
		this.nmrregjun = nmrregjun;
	}

	public String getDataRegistroJunta() {
		return dataRegistroJunta;
	}

	public void setDataRegistroJunta(String dataRegistroJunta) {
		this.dataRegistroJunta = dataRegistroJunta;
	}

	public String getProcessoUltimaAlteracaoJunta() {
		return processoUltimaAlteracaoJunta;
	}

	public void setProcessoUltimaAlteracaoJunta(
			String processoUltimaAlteracaoJunta) {
		this.processoUltimaAlteracaoJunta = processoUltimaAlteracaoJunta;
	}

	public String getDataUltimaAlteracaoJunta() {
		return dataUltimaAlteracaoJunta;
	}

	public void setDataUltimaAlteracaoJunta(String dataUltimaAlteracaoJunta) {
		this.dataUltimaAlteracaoJunta = dataUltimaAlteracaoJunta;
	}

	public String getInscricaoImobiliaria() {
		return inscricaoImobiliaria;
	}

	public void setInscricaoImobiliaria(String inscricaoImobiliaria) {
		this.inscricaoImobiliaria = inscricaoImobiliaria;
	}

	public String getNumeroTelefoneEmpresa() {
		return numeroTelefoneEmpresa;
	}

	public void setNumeroTelefoneEmpresa(String numeroTelefoneEmpresa) {
		this.numeroTelefoneEmpresa = numeroTelefoneEmpresa;
	}

	public String getHoraEntradaPrimario() {
		return horaEntradaPrimario;
	}

	public void setHoraEntradaPrimario(String horaEntradaPrimario) {
		this.horaEntradaPrimario = horaEntradaPrimario;
	}

	public String getHoraSaidaPrimario() {
		return horaSaidaPrimario;
	}

	public void setHoraSaidaPrimario(String horaSaidaPrimario) {
		this.horaSaidaPrimario = horaSaidaPrimario;
	}

	public String getHoraEntradaSecundario() {
		return horaEntradaSecundario;
	}

	public void setHoraEntradaSecundario(String horaEntradaSecundario) {
		this.horaEntradaSecundario = horaEntradaSecundario;
	}

	public String getHoraSaidaSecundario() {
		return horaSaidaSecundario;
	}

	public void setHoraSaidaSecundario(String horaSaidaSecundario) {
		this.horaSaidaSecundario = horaSaidaSecundario;
	}

	public String getHoraEntradaSabado() {
		return horaEntradaSabado;
	}

	public void setHoraEntradaSabado(String horaEntradaSabado) {
		this.horaEntradaSabado = horaEntradaSabado;
	}

	public String getHoraSaidaSabado() {
		return horaSaidaSabado;
	}

	public void setHoraSaidaSabado(String horaSaidaSabado) {
		this.horaSaidaSabado = horaSaidaSabado;
	}

	public String getHoraEntradaDomingo() {
		return horaEntradaDomingo;
	}

	public void setHoraEntradaDomingo(String horaEntradaDomingo) {
		this.horaEntradaDomingo = horaEntradaDomingo;
	}

	public String getHoraSaidaDomingo() {
		return horaSaidaDomingo;
	}

	public void setHoraSaidaDomingo(String horaSaidaDomingo) {
		this.horaSaidaDomingo = horaSaidaDomingo;
	}

	public String getObservacaoEmpresa() {
		return observacaoEmpresa;
	}

	public void setObservacaoEmpresa(String observacaoEmpresa) {
		this.observacaoEmpresa = observacaoEmpresa;
	}

	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

	public Double getMediaAreaOcupada() {
		return mediaAreaOcupada;
	}

	public void setMediaAreaOcupada(Double mediaAreaOcupada) {
		this.mediaAreaOcupada = mediaAreaOcupada;
	}

	public Integer getLogradouroCodigoLocalizacaoEmpresa() {
		return logradouroCodigoLocalizacaoEmpresa;
	}

	public void setLogradouroCodigoLocalizacaoEmpresa(
			Integer logradouroCodigoLocalizacaoEmpresa) {
		this.logradouroCodigoLocalizacaoEmpresa = logradouroCodigoLocalizacaoEmpresa;
	}

	public Integer getBairroCodigoLocalizacaoEmpresa() {
		return bairroCodigoLocalizacaoEmpresa;
	}

	public void setBairroCodigoLocalizacaoEmpresa(
			Integer bairroCodigoLocalizacaoEmpresa) {
		this.bairroCodigoLocalizacaoEmpresa = bairroCodigoLocalizacaoEmpresa;
	}

	public String getNumeroLocalizacaoEmpresa() {
		return numeroLocalizacaoEmpresa;
	}

	public void setNumeroLocalizacaoEmpresa(String numeroLocalizacaoEmpresa) {
		this.numeroLocalizacaoEmpresa = numeroLocalizacaoEmpresa;
	}

	public String getCepLocalizacaoEmpresa() {
		return cepLocalizacaoEmpresa;
	}

	public void setCepLocalizacaoEmpresa(String cepLocalizacaoEmpresa) {
		this.cepLocalizacaoEmpresa = cepLocalizacaoEmpresa;
	}

	public Integer getMunicipioCodigoLocalizacaoEmpresa() {
		return municipioCodigoLocalizacaoEmpresa;
	}

	public void setMunicipioCodigoLocalizacaoEmpresa(
			Integer municipioCodigoLocalizacaoEmpresa) {
		this.municipioCodigoLocalizacaoEmpresa = municipioCodigoLocalizacaoEmpresa;
	}

	public String getComplementoLocalizacaoEmpresa() {
		return complementoLocalizacaoEmpresa;
	}

	public void setComplementoLocalizacaoEmpresa(
			String complementoLocalizacaoEmpresa) {
		this.complementoLocalizacaoEmpresa = complementoLocalizacaoEmpresa;
	}

	public byte getCodigoClassificacaoAtividadeEconomica() {
		return codigoClassificacaoAtividadeEconomica;
	}

	public void setCodigoClassificacaoAtividadeEconomica(
			byte codigoClassificacaoAtividadeEconomica) {
		this.codigoClassificacaoAtividadeEconomica = codigoClassificacaoAtividadeEconomica;
	}

	public String getDescricaoClassificacaoAtividadeEconomica() {
		return descricaoClassificacaoAtividadeEconomica;
	}

	public void setDescricaoClassificacaoAtividadeEconomica(
			String descricaoClassificacaoAtividadeEconomica) {
		this.descricaoClassificacaoAtividadeEconomica = descricaoClassificacaoAtividadeEconomica;
	}

	public String getComplementoAtividadeEconomica() {
		return complementoAtividadeEconomica;
	}

	public void setComplementoAtividadeEconomica(
			String complementoAtividadeEconomica) {
		this.complementoAtividadeEconomica = complementoAtividadeEconomica;
	}

	public List<Pessoa> getSocios() {
		return socios;
	}

	public void setSocios(List<Pessoa> socios) {
		this.socios = socios;
	}

	public List<Pessoa> getProcuradores() {
		return procuradores;
	}

	public void setProcuradores(List<Pessoa> procuradores) {
		this.procuradores = procuradores;
	}

	public List<Pessoa> getRepresentantesLegais() {
		return representantesLegais;
	}

	public void setRepresentantesLegais(List<Pessoa> representantesLegais) {
		this.representantesLegais = representantesLegais;
	}

	public List<Cnae> getCnaes() {
		return cnaes;
	}

	public void setCnaes(List<Cnae> cnaes) {
		this.cnaes = cnaes;
	}

	public List<CaracteristicaFuncionamento> getCaracteristicaFuncionamento() {
		return caracteristicaFuncionamento;
	}

	public void setCaracteristicaFuncionamento(
			List<CaracteristicaFuncionamento> caracteristicaFuncionamento) {
		this.caracteristicaFuncionamento = caracteristicaFuncionamento;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public List<GrupoAtividade> getGrupoAtividade() {
		return grupoAtividade;
	}

	public void setGrupoAtividade(List<GrupoAtividade> grupoAtividade) {
		this.grupoAtividade = grupoAtividade;
	}
	
	

}
