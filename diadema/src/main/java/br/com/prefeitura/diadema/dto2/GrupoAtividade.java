package br.com.prefeitura.diadema.dto2;

import java.util.Date;

public class GrupoAtividade {
	
	private Short codigoGrupoAtividade;
    private Short codigoSubgrupoAtividade;
    private Short codigoAtividade;
    private String tipoAtividade;
    private Date dataInicioAtividade;
	public Short getCodigoGrupoAtividade() {
		return codigoGrupoAtividade;
	}
	public void setCodigoGrupoAtividade(Short codigoGrupoAtividade) {
		this.codigoGrupoAtividade = codigoGrupoAtividade;
	}
	public Short getCodigoSubgrupoAtividade() {
		return codigoSubgrupoAtividade;
	}
	public void setCodigoSubgrupoAtividade(Short codigoSubgrupoAtividade) {
		this.codigoSubgrupoAtividade = codigoSubgrupoAtividade;
	}
	public Short getCodigoAtividade() {
		return codigoAtividade;
	}
	public void setCodigoAtividade(Short codigoAtividade) {
		this.codigoAtividade = codigoAtividade;
	}
	public String getTipoAtividade() {
		return tipoAtividade;
	}
	public void setTipoAtividade(String tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}
	public Date getDataInicioAtividade() {
		return dataInicioAtividade;
	}
	public void setDataInicioAtividade(Date dataInicioAtividade) {
		this.dataInicioAtividade = dataInicioAtividade;
	}
	
    
	
}
