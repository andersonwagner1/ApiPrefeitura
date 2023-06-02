package br.com.prefeitura.diadema.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PMD_BOLETO")
public class PmdBoleto {
	
	@Id
	private Long nrProcessoBoleto;
	
	private String dsOrgao;
	private Integer nrAno;
	private Long nrProcesso;

	private String dsSituacao; // descreve a situação do boleto
	private Integer cdSituacao; // codigo da situação do boleto
	private String dsBoleto; //mostra a situação atual do boleot
	private Date dtVencimento;
	private Date dtPagamento;
	private Date dtAtualizacao;
	
	
	
	public String getDsOrgao() {
		return dsOrgao;
	}
	public void setDsOrgao(String dsOrgao) {
		this.dsOrgao = dsOrgao;
	}
	public Integer getNrAno() {
		return nrAno;
	}
	public void setNrAno(Integer nrAno) {
		this.nrAno = nrAno;
	}
	public Long getNrProcesso() {
		return nrProcesso;
	}
	public void setNrProcesso(Long nrProcesso) {
		this.nrProcesso = nrProcesso;
	}
	public Long getNrProcessoBoleto() {
		return nrProcessoBoleto;
	}
	public void setNrProcessoBoleto(Long nrProcessoBoleto) {
		this.nrProcessoBoleto = nrProcessoBoleto;
	}
	public String getDsSituacao() {
		return dsSituacao;
	}
	public void setDsSituacao(String dsSituacao) {
		this.dsSituacao = dsSituacao;
	}
	public Integer getCdSituacao() {
		return cdSituacao;
	}
	public void setCdSituacao(Integer cdSituacao) {		
		this.cdSituacao = cdSituacao;
	}
	public String getDsBoleto() {
		return dsBoleto;
	}
	public void setDsBoleto(String dsBoleto) {
		this.dsBoleto = dsBoleto;
	}
	public Date getDtVencimento() {
		return dtVencimento;
	}
	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}
	public Date getDtPagamento() {
		return dtPagamento;
	}
	public void setDtPagamento(Date dtPagamento) {
		this.dtPagamento = dtPagamento;
	}
	public Date getDtAtualizacao() {
		return dtAtualizacao;
	}
	public void setDtAtualizacao(Date dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}
	
	
}
