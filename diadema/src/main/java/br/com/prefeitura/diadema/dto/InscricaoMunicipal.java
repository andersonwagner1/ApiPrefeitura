package br.com.prefeitura.diadema.dto;

import java.util.Date;
import java.util.List;

public class InscricaoMunicipal {
    private Long id;
    private String numeroProtocolo;
    private String cnpj;
    private String razaoSocial;
    private String ultimoRegistroJucesp;
    private byte empresaAutonoma;

	private Long numeroInscricaoMunicipal;
    private String statusEmpresa;
    private String nomeFantasia;
    private Integer codigoNaturezaJuridica;
    private Integer situacaoCadastral;

    private Date dataAbertura;

    private String inscricaoEstadual;

    private String objetoSocial;
	private Integer numeroFuncionario;
    private Integer numeroProfissionais;
    private Integer numeroInstrumentosMusicais;
    private Float bancaDeJornal;
    private Integer numeroDeJogos;
    private Integer numeroDeEletronicos;
	private Integer quantidadePublicidadeNaoLuminioso;
	private Integer quantidadePublicidadeLuminoso;
	private Integer quantidadePublicidadeTerceiro;

    private Integer empresacodigoLogradouroAgata;
    private String empresaLogradouro;
    private String empresaNumeroLogradouro;
    private String empresaComplementoLogradouro;
    private String empresaBairro;
    private Integer empresaCodigoBairro;
    private String empresaMunicipio;
    private String empresaUF;
    private String empresaCep;
    private String empresaEmail;
    private String empresaTelefone;
    private String empresaFax;

    private String registroJuntaComercial;

    private Date dataEmissaoNIREInicial;
   
    private String detalhaUltimaAlteracaoJunta;

    private Date dataUltimaAlteracaoJunta;
    private Double capitalSocial;

    private String horaDeFuncionamentoSegundaASexta;
    private String horaDeFuncionamentoSabado;
    private String horaDeFuncionamentoDomingo;

    private String dadosContadorCrc;
    private String dadosContadorNome;
    private String dadosContadorCPF;
    private String dadosContadorRG;
    private String dadosContadorNomeEscritorio;
    private String dadosContadorEndereco;
    private String dadosContadorNumeroEndereco;
    private String dadosContadorComplementoEndereco;
    private String dadosContadorMunicipio;
    private String dadosContadorCEP;
    private String dadosContadorTelefone;
    private String dadosContadorFax;
    private String dadosContadorEmail;
    private String dadosContadorAtividadeEconomica;
    private String dadosContadorUf;
    private String dadosContadorBairro;

    private String representanteLegalNome;
    private String representanteLegalCPF;
    private String representanteLegalRG;
    private String representanteLegalEmail;
    private String representanteLegalTelefone;
    private String representanteLegalEndereco;
    private String representanteLegalNumeroDoEndereco;
    private String representanteLegalComplementoDeEndereco;
    private String representanteLegalBairro;
    private String representanteLegalMunicipio;
    private String representanteLegalUf;
    private String representanteLegalCEP;

    private Integer tipoAlteracaoAtividades;
    private Integer tipoAlteracaoRazaoSocial;
    private Integer tipoAlteracaoSocios;
    private Integer tipoAlteracaoEndereco;
    private Integer tipoAlteracaoRenovacao;
    private Date dataDeAlteracao;
    private Date dataDeEntrada;
    
    
    private List<Publicidades> publicidades;
    private EnquadramentoAtividadeEconomica enquadramentoAtividadeEconomica;
    private List<Socio> socios;
    private EnquadramentoISS enquadramentoISS;
    private List<Cnae> cnaes;
    
    
    
    
	@Override
	public String toString() {
		return "InscricaoMunicipal [id=" + id + ", numeroProtocolo="
				+ numeroProtocolo + ", cnpj=" + cnpj + ", razaoSocial="
				+ razaoSocial + ", ultimoRegistroJucesp="
				+ ultimoRegistroJucesp + ", numeroInscricaoMunicipal="
				+ numeroInscricaoMunicipal + ", statusEmpresa=" + statusEmpresa
				+ ", nomeFantasia=" + nomeFantasia
				+ ", codigoNaturezaJuridica=" + codigoNaturezaJuridica
				+ ", dataAbertura=" + dataAbertura + ", inscricaoEstadual="
				+ inscricaoEstadual + ", objetoSocial=" + objetoSocial
				+ ", numeroFuncionario=" + numeroFuncionario
				+ ", numeroProfissionais=" + numeroProfissionais
				+ ", numeroInstrumentosMusicais=" + numeroInstrumentosMusicais
				+ ", bancaDeJornal=" + bancaDeJornal + ", numeroDeJogos="
				+ numeroDeJogos + ", numeroDeEletronicos="
				+ numeroDeEletronicos + ", quantidadePublicidadeNaoLuminioso="
				+ quantidadePublicidadeNaoLuminioso
				+ ", quantidadePublicidadeLuminoso="
				+ quantidadePublicidadeLuminoso
				+ ", quantidadePublicidadeTerceiro="
				+ quantidadePublicidadeTerceiro
				+ ", empresacodigoLogradouroAgata="
				+ empresacodigoLogradouroAgata + ", empresaLogradouro="
				+ empresaLogradouro + ", empresaNumeroLogradouro="
				+ empresaNumeroLogradouro + ", empresaComplementoLogradouro="
				+ empresaComplementoLogradouro + ", empresaBairro="
				+ empresaBairro + ", empresaCodigoBairro="
				+ empresaCodigoBairro + ", empresaMunicipio="
				+ empresaMunicipio + ", empresaUF=" + empresaUF
				+ ", empresaCep=" + empresaCep + ", empresaEmail="
				+ empresaEmail + ", empresaTelefone=" + empresaTelefone
				+ ", empresaFax=" + empresaFax + ", registroJuntaComercial="
				+ registroJuntaComercial + ", dataEmissaoNIREInicial="
				+ dataEmissaoNIREInicial + ", detalhaUltimaAlteracaoJunta="
				+ detalhaUltimaAlteracaoJunta + ", dataUltimaAlteracaoJunta="
				+ dataUltimaAlteracaoJunta + ", capitalSocial=" + capitalSocial
				+ ", horaDeFuncionamentoSegundaASexta="
				+ horaDeFuncionamentoSegundaASexta
				+ ", horaDeFuncionamentoSabado=" + horaDeFuncionamentoSabado
				+ ", horaDeFuncionamentoDomingo=" + horaDeFuncionamentoDomingo
				+ ", dadosContadorCrc=" + dadosContadorCrc
				+ ", dadosContadorNome=" + dadosContadorNome
				+ ", dadosContadorCPF=" + dadosContadorCPF
				+ ", dadosContadorRG=" + dadosContadorRG
				+ ", dadosContadorNomeEscritorio="
				+ dadosContadorNomeEscritorio + ", dadosContadorEndereco="
				+ dadosContadorEndereco + ", dadosContadorNumeroEndereco="
				+ dadosContadorNumeroEndereco
				+ ", dadosContadorComplementoEndereco="
				+ dadosContadorComplementoEndereco
				+ ", dadosContadorMunicipio=" + dadosContadorMunicipio
				+ ", dadosContadorCEP=" + dadosContadorCEP
				+ ", dadosContadorTelefone=" + dadosContadorTelefone
				+ ", dadosContadorFax=" + dadosContadorFax
				+ ", dadosContadorEmail=" + dadosContadorEmail
				+ ", dadosContadorAtividadeEconomica="
				+ dadosContadorAtividadeEconomica + ", dadosContadorUf="
				+ dadosContadorUf + ", dadosContadorBairro="
				+ dadosContadorBairro + ", representanteLegalNome="
				+ representanteLegalNome + ", representanteLegalCPF="
				+ representanteLegalCPF + ", representanteLegalRG="
				+ representanteLegalRG + ", representanteLegalEmail="
				+ representanteLegalEmail + ", representanteLegalTelefone="
				+ representanteLegalTelefone + ", representanteLegalEndereco="
				+ representanteLegalEndereco
				+ ", representanteLegalNumeroDoEndereco="
				+ representanteLegalNumeroDoEndereco
				+ ", representanteLegalComplementoDeEndereco="
				+ representanteLegalComplementoDeEndereco
				+ ", representanteLegalBairro=" + representanteLegalBairro
				+ ", representanteLegalMunicipio="
				+ representanteLegalMunicipio + ", representanteLegalUf="
				+ representanteLegalUf + ", representanteLegalCEP="
				+ representanteLegalCEP + ", tipoAlteracaoAtividades="
				+ tipoAlteracaoAtividades + ", tipoAlteracaoRazaoSocial="
				+ tipoAlteracaoRazaoSocial + ", tipoAlteracaoSocios="
				+ tipoAlteracaoSocios + ", tipoAlteracaoEndereco="
				+ tipoAlteracaoEndereco + ", tipoAlteracaoRenovacao="
				+ tipoAlteracaoRenovacao + ", dataDeAlteracao="
				+ dataDeAlteracao + ", dataDeEntrada=" + dataDeEntrada
				+ ", publicidades=" + publicidades
				+ ", enquadramentoAtividadeEconomica="
				+ enquadramentoAtividadeEconomica + ", socios=" + socios
				+ ", enquadramentoISS=" + enquadramentoISS + ", cnaes=" + cnaes
				+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumeroProtocolo() {
		return numeroProtocolo;
	}
	public void setNumeroProtocolo(String numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getUltimoRegistroJucesp() {
		return ultimoRegistroJucesp;
	}
	public void setUltimoRegistroJucesp(String ultimoRegistroJucesp) {
		this.ultimoRegistroJucesp = ultimoRegistroJucesp;
	}
	public Long getNumeroInscricaoMunicipal() {
		return numeroInscricaoMunicipal;
	}
	public void setNumeroInscricaoMunicipal(Long numeroInscricaoMunicipal) {
		this.numeroInscricaoMunicipal = numeroInscricaoMunicipal;
	}
	public String getStatusEmpresa() {
		return statusEmpresa;
	}
	public void setStatusEmpresa(String statusEmpresa) {
		this.statusEmpresa = statusEmpresa;
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
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getObjetoSocial() {
		return objetoSocial;
	}
	public void setObjetoSocial(String objetoSocial) {
		this.objetoSocial = objetoSocial;
	}
	public Integer getNumeroFuncionario() {
		return numeroFuncionario;
	}
	public void setNumeroFuncionario(Integer numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}
	public Integer getNumeroProfissionais() {
		return numeroProfissionais;
	}
	public void setNumeroProfissionais(Integer numeroProfissionais) {
		this.numeroProfissionais = numeroProfissionais;
	}
	public Integer getNumeroInstrumentosMusicais() {
		return numeroInstrumentosMusicais;
	}
	public void setNumeroInstrumentosMusicais(Integer numeroInstrumentosMusicais) {
		this.numeroInstrumentosMusicais = numeroInstrumentosMusicais;
	}
	public Float getBancaDeJornal() {
		return bancaDeJornal;
	}
	public void setBancaDeJornal(Float bancaDeJornal) {
		this.bancaDeJornal = bancaDeJornal;
	}
	public Integer getNumeroDeJogos() {
		return numeroDeJogos;
	}
	public void setNumeroDeJogos(Integer numeroDeJogos) {
		this.numeroDeJogos = numeroDeJogos;
	}
	public Integer getNumeroDeEletronicos() {
		return numeroDeEletronicos;
	}
	public void setNumeroDeEletronicos(Integer numeroDeEletronicos) {
		this.numeroDeEletronicos = numeroDeEletronicos;
	}
	public Integer getQuantidadePublicidadeNaoLuminioso() {
		return quantidadePublicidadeNaoLuminioso;
	}
	public void setQuantidadePublicidadeNaoLuminioso(
			Integer quantidadePublicidadeNaoLuminioso) {
		this.quantidadePublicidadeNaoLuminioso = quantidadePublicidadeNaoLuminioso;
	}
	public Integer getQuantidadePublicidadeLuminoso() {
		return quantidadePublicidadeLuminoso;
	}
	public void setQuantidadePublicidadeLuminoso(
			Integer quantidadePublicidadeLuminoso) {
		this.quantidadePublicidadeLuminoso = quantidadePublicidadeLuminoso;
	}
	public Integer getQuantidadePublicidadeTerceiro() {
		return quantidadePublicidadeTerceiro;
	}
	public void setQuantidadePublicidadeTerceiro(
			Integer quantidadePublicidadeTerceiro) {
		this.quantidadePublicidadeTerceiro = quantidadePublicidadeTerceiro;
	}
	public Integer getEmpresacodigoLogradouroAgata() {
		return empresacodigoLogradouroAgata;
	}
	public void setEmpresacodigoLogradouroAgata(Integer empresacodigoLogradouroAgata) {
		this.empresacodigoLogradouroAgata = empresacodigoLogradouroAgata;
	}
	public String getEmpresaLogradouro() {
		return empresaLogradouro;
	}
	public void setEmpresaLogradouro(String empresaLogradouro) {
		this.empresaLogradouro = empresaLogradouro;
	}
	public String getEmpresaNumeroLogradouro() {
		return empresaNumeroLogradouro;
	}
	public void setEmpresaNumeroLogradouro(String empresaNumeroLogradouro) {
		this.empresaNumeroLogradouro = empresaNumeroLogradouro;
	}
	public String getEmpresaComplementoLogradouro() {
		return empresaComplementoLogradouro;
	}
	public void setEmpresaComplementoLogradouro(String empresaComplementoLogradouro) {
		this.empresaComplementoLogradouro = empresaComplementoLogradouro;
	}
	public String getEmpresaBairro() {
		return empresaBairro;
	}
	public void setEmpresaBairro(String empresaBairro) {
		this.empresaBairro = empresaBairro;
	}
	public Integer getEmpresaCodigoBairro() {
		return empresaCodigoBairro;
	}
	public void setEmpresaCodigoBairro(Integer empresaCodigoBairro) {
		this.empresaCodigoBairro = empresaCodigoBairro;
	}
	public String getEmpresaMunicipio() {
		return empresaMunicipio;
	}
	public void setEmpresaMunicipio(String empresaMunicipio) {
		this.empresaMunicipio = empresaMunicipio;
	}
	public String getEmpresaUF() {
		return empresaUF;
	}
	public void setEmpresaUF(String empresaUF) {
		this.empresaUF = empresaUF;
	}
	public String getEmpresaCep() {
		return empresaCep;
	}
	public void setEmpresaCep(String empresaCep) {
		this.empresaCep = empresaCep;
	}
	public String getEmpresaEmail() {
		return empresaEmail;
	}
	public void setEmpresaEmail(String empresaEmail) {
		this.empresaEmail = empresaEmail;
	}
	public String getEmpresaTelefone() {
		return empresaTelefone;
	}
	public void setEmpresaTelefone(String empresaTelefone) {
		this.empresaTelefone = empresaTelefone;
	}
	public String getEmpresaFax() {
		return empresaFax;
	}
	public void setEmpresaFax(String empresaFax) {
		this.empresaFax = empresaFax;
	}
	public String getRegistroJuntaComercial() {
		return registroJuntaComercial;
	}
	public void setRegistroJuntaComercial(String registroJuntaComercial) {
		this.registroJuntaComercial = registroJuntaComercial;
	}
	public Date getDataEmissaoNIREInicial() {
		return dataEmissaoNIREInicial;
	}
	public void setDataEmissaoNIREInicial(Date dataEmissaoNIREInicial) {
		this.dataEmissaoNIREInicial = dataEmissaoNIREInicial;
	}
	public String getDetalhaUltimaAlteracaoJunta() {
		return detalhaUltimaAlteracaoJunta;
	}
	public void setDetalhaUltimaAlteracaoJunta(String detalhaUltimaAlteracaoJunta) {
		this.detalhaUltimaAlteracaoJunta = detalhaUltimaAlteracaoJunta;
	}
	public Date getDataUltimaAlteracaoJunta() {
		return dataUltimaAlteracaoJunta;
	}
	public void setDataUltimaAlteracaoJunta(Date dataUltimaAlteracaoJunta) {
		this.dataUltimaAlteracaoJunta = dataUltimaAlteracaoJunta;
	}
	public Double getCapitalSocial() {
		return capitalSocial;
	}
	public void setCapitalSocial(Double capitalSocial) {
		this.capitalSocial = capitalSocial;
	}
	public String getHoraDeFuncionamentoSegundaASexta() {
		return horaDeFuncionamentoSegundaASexta;
	}
	public void setHoraDeFuncionamentoSegundaASexta(
			String horaDeFuncionamentoSegundaASexta) {
		this.horaDeFuncionamentoSegundaASexta = horaDeFuncionamentoSegundaASexta;
	}
	public String getHoraDeFuncionamentoSabado() {
		return horaDeFuncionamentoSabado;
	}
	public void setHoraDeFuncionamentoSabado(String horaDeFuncionamentoSabado) {
		this.horaDeFuncionamentoSabado = horaDeFuncionamentoSabado;
	}
	public String getHoraDeFuncionamentoDomingo() {
		return horaDeFuncionamentoDomingo;
	}
	public void setHoraDeFuncionamentoDomingo(String horaDeFuncionamentoDomingo) {
		this.horaDeFuncionamentoDomingo = horaDeFuncionamentoDomingo;
	}
	public String getDadosContadorCrc() {
		return dadosContadorCrc;
	}
	public void setDadosContadorCrc(String dadosContadorCrc) {
		this.dadosContadorCrc = dadosContadorCrc;
	}
	public String getDadosContadorNome() {
		return dadosContadorNome;
	}
	public void setDadosContadorNome(String dadosContadorNome) {
		this.dadosContadorNome = dadosContadorNome;
	}
	public String getDadosContadorCPF() {
		return dadosContadorCPF;
	}
	public void setDadosContadorCPF(String dadosContadorCPF) {
		this.dadosContadorCPF = dadosContadorCPF;
	}
	public String getDadosContadorRG() {
		return dadosContadorRG;
	}
	public void setDadosContadorRG(String dadosContadorRG) {
		this.dadosContadorRG = dadosContadorRG;
	}
	public String getDadosContadorNomeEscritorio() {
		return dadosContadorNomeEscritorio;
	}
	public void setDadosContadorNomeEscritorio(String dadosContadorNomeEscritorio) {
		this.dadosContadorNomeEscritorio = dadosContadorNomeEscritorio;
	}
	public String getDadosContadorEndereco() {
		return dadosContadorEndereco;
	}
	public void setDadosContadorEndereco(String dadosContadorEndereco) {
		this.dadosContadorEndereco = dadosContadorEndereco;
	}
	public String getDadosContadorNumeroEndereco() {
		return dadosContadorNumeroEndereco;
	}
	public void setDadosContadorNumeroEndereco(String dadosContadorNumeroEndereco) {
		this.dadosContadorNumeroEndereco = dadosContadorNumeroEndereco;
	}
	public String getDadosContadorComplementoEndereco() {
		return dadosContadorComplementoEndereco;
	}
	public void setDadosContadorComplementoEndereco(
			String dadosContadorComplementoEndereco) {
		this.dadosContadorComplementoEndereco = dadosContadorComplementoEndereco;
	}
	public String getDadosContadorMunicipio() {
		return dadosContadorMunicipio;
	}
	public void setDadosContadorMunicipio(String dadosContadorMunicipio) {
		this.dadosContadorMunicipio = dadosContadorMunicipio;
	}
	public String getDadosContadorCEP() {
		return dadosContadorCEP;
	}
	public void setDadosContadorCEP(String dadosContadorCEP) {
		this.dadosContadorCEP = dadosContadorCEP;
	}
	public String getDadosContadorTelefone() {
		return dadosContadorTelefone;
	}
	public void setDadosContadorTelefone(String dadosContadorTelefone) {
		this.dadosContadorTelefone = dadosContadorTelefone;
	}
	public String getDadosContadorFax() {
		return dadosContadorFax;
	}
	public void setDadosContadorFax(String dadosContadorFax) {
		this.dadosContadorFax = dadosContadorFax;
	}
	public String getDadosContadorEmail() {
		return dadosContadorEmail;
	}
	public void setDadosContadorEmail(String dadosContadorEmail) {
		this.dadosContadorEmail = dadosContadorEmail;
	}
	public String getDadosContadorAtividadeEconomica() {
		return dadosContadorAtividadeEconomica;
	}
	public void setDadosContadorAtividadeEconomica(
			String dadosContadorAtividadeEconomica) {
		this.dadosContadorAtividadeEconomica = dadosContadorAtividadeEconomica;
	}
	public String getDadosContadorUf() {
		return dadosContadorUf;
	}
	public void setDadosContadorUf(String dadosContadorUf) {
		this.dadosContadorUf = dadosContadorUf;
	}
	public String getDadosContadorBairro() {
		return dadosContadorBairro;
	}
	public void setDadosContadorBairro(String dadosContadorBairro) {
		this.dadosContadorBairro = dadosContadorBairro;
	}
	public String getRepresentanteLegalNome() {
		return representanteLegalNome;
	}
	public void setRepresentanteLegalNome(String representanteLegalNome) {
		this.representanteLegalNome = representanteLegalNome;
	}
	public String getRepresentanteLegalCPF() {
		return representanteLegalCPF;
	}
	public void setRepresentanteLegalCPF(String representanteLegalCPF) {
		this.representanteLegalCPF = representanteLegalCPF;
	}
	public String getRepresentanteLegalRG() {
		return representanteLegalRG;
	}
	public void setRepresentanteLegalRG(String representanteLegalRG) {
		this.representanteLegalRG = representanteLegalRG;
	}
	public String getRepresentanteLegalEmail() {
		return representanteLegalEmail;
	}
	public void setRepresentanteLegalEmail(String representanteLegalEmail) {
		this.representanteLegalEmail = representanteLegalEmail;
	}
	public String getRepresentanteLegalTelefone() {
		return representanteLegalTelefone;
	}
	public void setRepresentanteLegalTelefone(String representanteLegalTelefone) {
		this.representanteLegalTelefone = representanteLegalTelefone;
	}
	public String getRepresentanteLegalEndereco() {
		return representanteLegalEndereco;
	}
	public void setRepresentanteLegalEndereco(String representanteLegalEndereco) {
		this.representanteLegalEndereco = representanteLegalEndereco;
	}
	public String getRepresentanteLegalNumeroDoEndereco() {
		return representanteLegalNumeroDoEndereco;
	}
	public void setRepresentanteLegalNumeroDoEndereco(
			String representanteLegalNumeroDoEndereco) {
		this.representanteLegalNumeroDoEndereco = representanteLegalNumeroDoEndereco;
	}
	public String getRepresentanteLegalComplementoDeEndereco() {
		return representanteLegalComplementoDeEndereco;
	}
	public void setRepresentanteLegalComplementoDeEndereco(
			String representanteLegalComplementoDeEndereco) {
		this.representanteLegalComplementoDeEndereco = representanteLegalComplementoDeEndereco;
	}
	public String getRepresentanteLegalBairro() {
		return representanteLegalBairro;
	}
	public void setRepresentanteLegalBairro(String representanteLegalBairro) {
		this.representanteLegalBairro = representanteLegalBairro;
	}
	public String getRepresentanteLegalMunicipio() {
		return representanteLegalMunicipio;
	}
	public void setRepresentanteLegalMunicipio(String representanteLegalMunicipio) {
		this.representanteLegalMunicipio = representanteLegalMunicipio;
	}
	public String getRepresentanteLegalUf() {
		return representanteLegalUf;
	}
	public void setRepresentanteLegalUf(String representanteLegalUf) {
		this.representanteLegalUf = representanteLegalUf;
	}
	public String getRepresentanteLegalCEP() {
		return representanteLegalCEP;
	}
	public void setRepresentanteLegalCEP(String representanteLegalCEP) {
		this.representanteLegalCEP = representanteLegalCEP;
	}
	public Integer getTipoAlteracaoAtividades() {
		return tipoAlteracaoAtividades;
	}
	public void setTipoAlteracaoAtividades(Integer tipoAlteracaoAtividades) {
		this.tipoAlteracaoAtividades = tipoAlteracaoAtividades;
	}
	public Integer getTipoAlteracaoRazaoSocial() {
		return tipoAlteracaoRazaoSocial;
	}
	public void setTipoAlteracaoRazaoSocial(Integer tipoAlteracaoRazaoSocial) {
		this.tipoAlteracaoRazaoSocial = tipoAlteracaoRazaoSocial;
	}
	public Integer getTipoAlteracaoSocios() {
		return tipoAlteracaoSocios;
	}
	public void setTipoAlteracaoSocios(Integer tipoAlteracaoSocios) {
		this.tipoAlteracaoSocios = tipoAlteracaoSocios;
	}
	public Integer getTipoAlteracaoEndereco() {
		return tipoAlteracaoEndereco;
	}
	public void setTipoAlteracaoEndereco(Integer tipoAlteracaoEndereco) {
		this.tipoAlteracaoEndereco = tipoAlteracaoEndereco;
	}
	public Integer getTipoAlteracaoRenovacao() {
		return tipoAlteracaoRenovacao;
	}
	public void setTipoAlteracaoRenovacao(Integer tipoAlteracaoRenovacao) {
		this.tipoAlteracaoRenovacao = tipoAlteracaoRenovacao;
	}
	public Date getDataDeAlteracao() {
		return dataDeAlteracao;
	}
	public void setDataDeAlteracao(Date dataDeAlteracao) {
		this.dataDeAlteracao = dataDeAlteracao;
	}
	public Date getDataDeEntrada() {
		return dataDeEntrada;
	}
	public void setDataDeEntrada(Date dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	public List<Publicidades> getPublicidades() {
		return publicidades;
	}
	public void setPublicidades(List<Publicidades> publicidades) {
		this.publicidades = publicidades;
	}
	public EnquadramentoAtividadeEconomica getEnquadramentoAtividadeEconomica() {
		return enquadramentoAtividadeEconomica;
	}
	public void setEnquadramentoAtividadeEconomica(
			EnquadramentoAtividadeEconomica enquadramentoAtividadeEconomica) {
		this.enquadramentoAtividadeEconomica = enquadramentoAtividadeEconomica;
	}
	public List<Socio> getSocios() {
		return socios;
	}
	public void setSocios(List<Socio> socios) {
		this.socios = socios;
	}
	public EnquadramentoISS getEnquadramentoISS() {
		return enquadramentoISS;
	}
	public void setEnquadramentoISS(EnquadramentoISS enquadramentoISS) {
		this.enquadramentoISS = enquadramentoISS;
	}
	public List<Cnae> getCnaes() {
		return cnaes;
	}
	public void setCnaes(List<Cnae> cnaes) {
		this.cnaes = cnaes;
	}
	public Integer getSituacaoCadastral() {
		return situacaoCadastral;
	}
	public void setSituacaoCadastral(Integer situacaoCadastral) {
		this.situacaoCadastral = situacaoCadastral;
	}
	public byte getEmpresaAutonoma() {
		return empresaAutonoma;
	}
	public void setEmpresaAutonoma(byte empresaAutonoma) {
		this.empresaAutonoma = empresaAutonoma;
	}
	
	
	
	
    

	

}   