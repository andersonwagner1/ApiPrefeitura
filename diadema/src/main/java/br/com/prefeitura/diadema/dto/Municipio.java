package br.com.prefeitura.diadema.dto;

import java.util.List;


public class Municipio {
	private Integer cdMunicipio;
	private String dsMunicipio;
	private String sgUf;
	public Integer getCdMunicipio() {
		return cdMunicipio;
	}
	public void setCdMunicipio(Integer cdMunicipio) {
		this.cdMunicipio = cdMunicipio;
	}
	public String getDsMunicipio() {
		return dsMunicipio;
	}
	public void setDsMunicipio(String dsMunicipio) {
		this.dsMunicipio = dsMunicipio.toUpperCase();// necessario para realizra a consulta apenas com letra maiscula
	}
	public String getSgUf() {
		return sgUf;
	}
	public void setSgUf(String sgUf) {
		this.sgUf = sgUf.toUpperCase(); // necessario para realizra a consulta apenas com letra maiscula
	}
	
	
	
	
	
	
	
	
	
}
