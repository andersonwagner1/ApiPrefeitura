package br.com.prefeitura.diadema.model;

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

	private String dsSituacao;
	private Integer cdSituacao;
	private String dsBoleto;
	
	
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
	
}
