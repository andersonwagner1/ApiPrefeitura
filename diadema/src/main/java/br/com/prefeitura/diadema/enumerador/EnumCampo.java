package br.com.prefeitura.diadema.enumerador;

public enum EnumCampo {
	USUARIO_SEM_ACESSO(false, ""), 
	PROCESSO_SITUACAO(true,"pie"), 
	PROCESSO_UNIDADE(true,"bar");
    
   
    private boolean grafico;
    private String tipoGrafico;
   
    EnumCampo( boolean grafico, String tipoGrafico) {
        this.grafico = grafico;
        this.tipoGrafico = tipoGrafico;
    }

	public boolean isGrafico() {
		return grafico;
	}

	public void setGrafico(boolean grafico) {
		this.grafico = grafico;
	}

	public String getTipoGrafico() {
		return tipoGrafico;
	}

	public void setTipoGrafico(String tipoGrafico) {
		this.tipoGrafico = tipoGrafico;
	}
    
   
    
    
}
