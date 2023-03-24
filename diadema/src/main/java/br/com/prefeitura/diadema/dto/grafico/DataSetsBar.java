package br.com.prefeitura.diadema.dto.grafico;

public class DataSetsBar {
	private String label;
	private String backgroundColor;
	private Double data[];
	
	
	
	public DataSetsBar(String label, String backgroundColor,  Double[] data){
		this.backgroundColor = backgroundColor;
		this.label = label;
		this.data = data;
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public Double[] getData() {
		return data;
	}
	public void setData(Double[] data) {
		this.data = data;
	}
	
	
	

}
