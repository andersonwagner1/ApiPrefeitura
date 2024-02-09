package br.com.prefeitura.diadema.dto;

public class Taxa {
	
	private Integer codigoTaxa;
	private Integer quantidadeTaxa;
	private Double valorTaxa;
	
	public Taxa(){
		this.quantidadeTaxa = 1;
		this.valorTaxa = 0.0;
	}
	
	public Integer getCodigoTaxa() {
		return codigoTaxa;
	}
	public void setCodigoTaxa(Integer codigoTaxa) {
		this.codigoTaxa = codigoTaxa;
	}
	public Integer getQuantidadeTaxa() {
		return quantidadeTaxa;
	}
	public void setQuantidadeTaxa(Integer quantidadeTaxa) {
		this.quantidadeTaxa = quantidadeTaxa;
	}
	public Double getValorTaxa() {
		return valorTaxa;
	}
	public void setValorTaxa(Double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	
	
}
