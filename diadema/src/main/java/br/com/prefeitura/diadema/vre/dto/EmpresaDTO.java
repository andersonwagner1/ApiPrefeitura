package br.com.prefeitura.diadema.vre.dto;

import java.util.List;

public class EmpresaDTO {
	private String resultado; 
    private List<String> cnpj;
    private String nomeEmpresa;
    private EnderecoDTO endereco;

    // Getters and Setters

    public List<String> getCnpj() {
        return cnpj;
    }

    public void setCnpj(List<String> cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
    
    
}

