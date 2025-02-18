package br.com.prefeitura.diadema.dto;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

public class TaxaDiversas {
	
	private String orgao;
	private Long numeroProcesso;
	private Integer ano;
	
	
	private Integer tipoContibuinte;//1= Contribuinte Geral, 2 = Inscrição do imóvel, 3 = cmc
	private Long inscricao;
	private Integer codigoSetor;
	private String codigoQuadra;
	private String codigoLote;
	private String observacao;
	private Double valorTaxaAdministrativa;
	private List<Taxa> taxas;
	
	
	public TaxaDiversas(){
		this.valorTaxaAdministrativa = 0.0; // valor padrão
		this.observacao = "BOLETO REFERENTE TAXA DE PROCESSOS ADMINISTRATIVO - PAGAR A PARTIR DO DIA SEGUINTE A DA DE EMISSAO";
		this.codigoLote = "0";
		this.codigoQuadra = "0";
		this.codigoSetor = 0;
	}
	
	public Integer getTipoContibuinte() {
		return tipoContibuinte;
	}
	public void setTipoContibuinte(Integer tipoContibuinte) {
		this.tipoContibuinte = tipoContibuinte;
	}
	public Long getInscricao() {
		return inscricao;
	}
	public void setInscricao(Long inscricao) {
		this.inscricao = inscricao;
	}
	public Integer getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(Integer codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public String getCodigoQuadra() {
		return codigoQuadra;
	}
	public void setCodigoQuadra(String codigoQuadra) {
		this.codigoQuadra = codigoQuadra;
	}
	public String getCodigoLote() {
		return codigoLote;
	}
	public void setCodigoLote(String codigoLote) {
		this.codigoLote = codigoLote;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Double getValorTaxaAdministrativa() {
		return valorTaxaAdministrativa;
	}
	public void setValorTaxaAdministrativa(Double valorTaxaAdministrativa) {
		this.valorTaxaAdministrativa = valorTaxaAdministrativa;
	}
	public List<Taxa> getTaxas() {
		return taxas;
	}
	public void setTaxas(List<Taxa> taxas) {
		this.taxas = taxas;
	}
	public String getOrgao() {
		return orgao;
	}
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	public Long getNumeroProcesso() {
		return numeroProcesso;
	}
	public void setNumeroProcesso(Long numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	
	


}
