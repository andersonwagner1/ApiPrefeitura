package br.com.prefeitura.diadema.vre.dto;

import java.util.List;

public class DadosEstabelecimento {
    private List<Inscricao> inscricoes;
    private List<Endereco> enderecos;
    private double areaEstabelecimento;
    private double areaTerreno;
    private double areaImovel;
    private Double cumprimentoTestada;
    private List<AreaPublicidades> areaPublicidades;
    private int numeroFuncionarios;
    private String tipodeUnidade;
    private List<FormaAtuacao> formasAtuacao;
    private List<AtividadeEconomica> atividadesEconomicas;
    private List<AtividadeAuxiliar> atividadesAuxiliares;
    private List<HorarioFuncionamento> horariosFuncionamento;
    private List<Endereco> enderecosCorrespondencia;
    private String telefone;
    private String fax;
    private String email;
	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public double getAreaEstabelecimento() {
		return areaEstabelecimento;
	}
	public void setAreaEstabelecimento(double areaEstabelecimento) {
		this.areaEstabelecimento = areaEstabelecimento;
	}
	public double getAreaTerreno() {
		return areaTerreno;
	}
	public void setAreaTerreno(double areaTerreno) {
		this.areaTerreno = areaTerreno;
	}
	public double getAreaImovel() {
		return areaImovel;
	}
	public void setAreaImovel(double areaImovel) {
		this.areaImovel = areaImovel;
	}
	public Double getCumprimentoTestada() {
		return cumprimentoTestada;
	}
	public void setCumprimentoTestada(Double cumprimentoTestada) {
		this.cumprimentoTestada = cumprimentoTestada;
	}
	public List<AreaPublicidades> getAreaPublicidades() {
		return areaPublicidades;
	}
	public void setAreaPublicidades(List<AreaPublicidades> areaPublicidades) {
		this.areaPublicidades = areaPublicidades;
	}
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	public String getTipodeUnidade() {
		return tipodeUnidade;
	}
	public void setTipodeUnidade(String tipodeUnidade) {
		this.tipodeUnidade = tipodeUnidade;
	}
	public List<FormaAtuacao> getFormasAtuacao() {
		return formasAtuacao;
	}
	public void setFormasAtuacao(List<FormaAtuacao> formasAtuacao) {
		this.formasAtuacao = formasAtuacao;
	}
	public List<AtividadeEconomica> getAtividadesEconomicas() {
		return atividadesEconomicas;
	}
	public void setAtividadesEconomicas(
			List<AtividadeEconomica> atividadesEconomicas) {
		this.atividadesEconomicas = atividadesEconomicas;
	}
	public List<AtividadeAuxiliar> getAtividadesAuxiliares() {
		return atividadesAuxiliares;
	}
	public void setAtividadesAuxiliares(List<AtividadeAuxiliar> atividadesAuxiliares) {
		this.atividadesAuxiliares = atividadesAuxiliares;
	}
	
	
	public List<HorarioFuncionamento> getHorariosFuncionamento() {
		return horariosFuncionamento;
	}
	public void setHorariosFuncionamento(
			List<HorarioFuncionamento> horariosFuncionamento) {
		this.horariosFuncionamento = horariosFuncionamento;
	}
	public List<Endereco> getEnderecosCorrespondencia() {
		return enderecosCorrespondencia;
	}
	public void setEnderecosCorrespondencia(List<Endereco> enderecosCorrespondencia) {
		this.enderecosCorrespondencia = enderecosCorrespondencia;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

