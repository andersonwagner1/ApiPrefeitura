package br.com.prefeitura.diadema.vre.dto;

import java.util.List;

public class Endereco {
    private TipoLogradouro tipoLogradouro;
    private String logradouro;
    private String numero;
    private String cep;
    private String bairro;
    private String estado;
    private String referencia;
    //private List<String> complementos;
    private List<Complemento> complementos;
    private Municipio municipio;
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Object getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	public List<Complemento> getComplementos() {
		return complementos;
	}
	public void setComplementos(List<Complemento> complementos) {
		this.complementos = complementos;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

}
