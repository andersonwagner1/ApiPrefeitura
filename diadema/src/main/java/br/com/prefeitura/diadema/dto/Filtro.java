package br.com.prefeitura.diadema.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.prefeitura.diadema.enumerador.EnumCampo;


public class Filtro {
	private List<Campo> campos;
	private String titulo;
	private String subTitulo;
	private EnumCampo tipoRelatorio;
	public List<Campo> getCampos() {
		return campos;
	}
	public void setCampos(List<Campo> campos) {
		this.campos = campos;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSubTitulo() {
		return subTitulo;
	}
	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}
	
	public void addFiltro(Campo campo){
		if(campos == null){
			campos = new ArrayList<Campo>();
		}
		this.campos.add(campo);
	}
	public EnumCampo getTipoRelatorio() {
		return tipoRelatorio;
	}
	public void setTipoRelatorio(EnumCampo tipoRelatorio) {
		this.tipoRelatorio = tipoRelatorio;
	}
	
	
	
	
	
	
}
