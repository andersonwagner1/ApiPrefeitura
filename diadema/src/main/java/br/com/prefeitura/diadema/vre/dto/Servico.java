package br.com.prefeitura.diadema.vre.dto;

import java.util.Date;

public class Servico {
	private String codigoServico;
	private Date dataFimServico;
	private Date dataInicioServico;
	private String descricaoServico;
	private String situacaoServico;
	private String tipoServico;
	public String getCodigoServico() {
		return codigoServico;
	}
	public void setCodigoServico(String codigoServico) {
		this.codigoServico = codigoServico;
	}
	public Date getDataFimServico() {
		return dataFimServico;
	}
	public void setDataFimServico(Date dataFimServico) {
		this.dataFimServico = dataFimServico;
	}
	public Date getDataInicioServico() {
		return dataInicioServico;
	}
	public void setDataInicioServico(Date dataInicioServico) {
		this.dataInicioServico = dataInicioServico;
	}
	public String getDescricaoServico() {
		return descricaoServico;
	}
	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}
	public String getSituacaoServico() {
		return situacaoServico;
	}
	public void setSituacaoServico(String situacaoServico) {
		this.situacaoServico = situacaoServico;
	}
	public String getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	
     
     
     
     
}
