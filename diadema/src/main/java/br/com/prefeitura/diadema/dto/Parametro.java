package br.com.prefeitura.diadema.dto;

import java.util.Date;


public class Parametro {
	private Date dtInicial;
	private Date dtFinal;
	private Integer vlAletorio;
	public Date getDtInicial() {
		return dtInicial;
	}
	public void setDtInicial(Date dtInicial) {
		this.dtInicial = dtInicial;
	}
	public Date getDtFinal() {
		return dtFinal;
	}
	public void setDtFinal(Date dtFinal) {
		this.dtFinal = dtFinal;
	}
	public Integer getVlAletorio() {
		return vlAletorio;
	}
	public void setVlAletorio(Integer vlAletorio) {
		this.vlAletorio = vlAletorio;
	}
	
	
	
	
}
