package br.com.prefeitura.diadema.vre.dto;

public class EnderecoDTO {
    private String cdMunicipio;
    private String deBairro;
    private String nmLogradouro;
    private String nuCep;
    private String deComplemento;
    private String nuNumero;
	
    
    
    
	public String getCdMunicipio() {
		return cdMunicipio;
	}
	public void setCdMunicipio(String cdMunicipio) {
		this.cdMunicipio = cdMunicipio;
	}
	public String getDeBairro() {
		return deBairro;
	}
	public void setDeBairro(String deBairro) {
		this.deBairro = deBairro;
	}
	public String getNmLogradouro() {
		return nmLogradouro;
	}
	public void setNmLogradouro(String nmLogradouro) {
		this.nmLogradouro = nmLogradouro;
	}
	
	public String getNuCep() {
		return nuCep;
	}
	public void setNuCep(String nuCep) {
		this.nuCep = nuCep;
	}
	public String getDeComplemento() {
		return deComplemento;
	}
	public void setDeComplemento(String deComplemento) {
		this.deComplemento = deComplemento;
	}
	public String getNuNumero() {
		return nuNumero;
	}
	public void setNuNumero(String nuNumero) {
		this.nuNumero = nuNumero;
	}

   
}