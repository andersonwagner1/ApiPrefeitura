package br.com.prefeitura.diadema.dto;

import br.com.prefeitura.diadema.dto.grafico.GraficoBarra;
import br.com.prefeitura.diadema.dto.grafico.GraficoPizza;



public class RelatorioDto {
	
	
	
	private String titulo = "Sem titulo";
	private String subtitulo= "";
	
	private String colunas[]; //colunas da tabela
	private String valores[][]; // registro da tabela
	
	private String tipoGrafico;
	private GraficoBarra barData;
    private GraficoPizza pieData;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String[] getColunas() {
		return colunas;
	}
	public void setColunas(String[] colunas) {
		this.colunas = colunas;
	}
	public String[][] getValores() {
		return valores;
	}
	public void setValores(String[][] valores) {
		this.valores = valores;
	}
	public GraficoBarra getBarData() {
		return barData;
	}
	public void setBarData(GraficoBarra barData) {
		this.barData = barData;
	}
	public GraficoPizza getPieData() {
		return pieData;
	}
	public void setPieData(GraficoPizza pieData) {
		this.pieData = pieData;
	}
	public String getSubtitulo() {
		return subtitulo;
	}
	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}
	public String getTipoGrafico() {
		return tipoGrafico;
	}
	public void setTipoGrafico(String tipoGrafico) {
		this.tipoGrafico = tipoGrafico;
	}
	
     
	
    
    
    

	
	
}
