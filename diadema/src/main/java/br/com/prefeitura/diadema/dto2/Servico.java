package br.com.prefeitura.diadema.dto2;

import java.util.Date;

public class Servico {
	private String codigoServico;
    private  String tipoServico;
    private String situacaoServico;
    private Date dataInicioServico;
    private Date dataFimServico;
	public String getCodigoServico() {
		return codigoServico;
	}
	public void setCodigoServico(String codigoServico) {
		this.codigoServico = codigoServico;
	}
	public String getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	public String getSituacaoServico() {
		return situacaoServico;
	}
	public void setSituacaoServico(String situacaoServico) {
		this.situacaoServico = situacaoServico;
	}
	public Date getDataInicioServico() {
		return dataInicioServico;
	}
	public void setDataInicioServico(Date dataInicioServico) {
		this.dataInicioServico = dataInicioServico;
	}
	public Date getDataFimServico() {
		return dataFimServico;
	}
	public void setDataFimServico(Date dataFimServico) {
		this.dataFimServico = dataFimServico;
	}
    
    
    

}
