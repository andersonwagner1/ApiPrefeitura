package br.com.prefeitura.diadema.dto;

import java.util.List;


public class Campo {
	List<ComboDto> listaValores;
	String valorPadrao;
	boolean mostrar;
	
	public Campo(String valor, boolean mostrar, List<ComboDto> listaValores){
		this.valorPadrao = valor;
		this.listaValores = listaValores;
		this.mostrar = mostrar;				
	}
	
	public Campo(String valor, boolean mostrar){
		this(valor, mostrar, null);
		
	}
	
	public List<ComboDto> getListaValores() {
		return listaValores;
	}
	public void setListaValores(List<ComboDto> listaValores) {
		this.listaValores = listaValores;
	}
	public String getValorPadrao() {
		return valorPadrao;
	}
	public void setValorPadrao(String valorPadrao) {
		this.valorPadrao = valorPadrao;
	}

	public boolean getMostrar() {
		return mostrar;
	}

	public void setMostrar(boolean mostrar) {
		this.mostrar = mostrar;
	}
	
	
	
}
