package br.com.prefeitura.diadema.dto.grafico;

public class GraficoPizza {
	private String labels[];
	private DataSetsPie datasets[];
	public String[] getLabels() {
		return labels;
	}
	public void setLabels(String... labels) {
		this.labels = labels;
	}
	public DataSetsPie[] getDatasets() {
		return datasets;
	}
	public void setDatasets(DataSetsPie[] datasets) {
		this.datasets = datasets;
	}
	
	
	
}
