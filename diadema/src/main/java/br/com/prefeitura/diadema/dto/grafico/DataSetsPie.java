package br.com.prefeitura.diadema.dto.grafico;

public class DataSetsPie {
	private String backgroundColor[] = {"#FF6384", "#36A2EB",  "#FFCE56","#FF6384", "#36A2EB",  "#FFCE56","#FF6384", "#36A2EB",  "#FFCE56","#FF6384", "#36A2EB",  "#FFCE56"};
	private Double data[];
	
	public DataSetsPie(Double... valor){
		this.data = valor;
	}
	
	public String[] getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String[] backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public Double[] getData() {
		return data;
	}
	public void setData(Double[] data) {
		this.data = data;
	}
}
