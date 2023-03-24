package br.com.prefeitura.diadema.enumerador;

public enum EnumFiltro {
	DATA_INICIAL("12"), DATA_FINAL("0"), UNIDADE("1");

	private String tipoGrafico;

	EnumFiltro(String tipoGrafico) {
		this.tipoGrafico = tipoGrafico;
	}

	public String getTipoGrafico() {
		return tipoGrafico;
	}

	public void setTipoGrafico(String tipoGrafico) {
		this.tipoGrafico = tipoGrafico;
	}
	
	
	
}
