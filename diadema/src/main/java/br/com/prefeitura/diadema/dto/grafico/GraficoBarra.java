package br.com.prefeitura.diadema.dto.grafico;

public class GraficoBarra {
	private String labels[];
	private DataSetsBar datasets[];
	public String[] getLabels() {
		return labels;
	}
	
	public void setTitulos(String... labels){
		this.labels = labels;
	}
	
	public void setLabels(String[] labels) {
		this.labels = labels;
	}
	public DataSetsBar[] getDatasets() {
		return datasets;
	}
	public void setDatasets(DataSetsBar[] datasets) {
		this.datasets = datasets;
	}
	
	
	

}
