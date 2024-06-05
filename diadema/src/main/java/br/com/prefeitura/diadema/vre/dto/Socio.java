package br.com.prefeitura.diadema.vre.dto;

public class Socio {
    private String nome;
    private String cpfCnpj;
    private String qualificacao;
    private String capitalSocialSocio;
    private Endereco endereco;
    private Contato contato;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getQualificacao() {
		return qualificacao;
	}
	public void setQualificacao(String qualificacao) {
		this.qualificacao = qualificacao;
	}
	public String getCapitalSocialSocio() {
		return capitalSocialSocio;
	}
	public void setCapitalSocialSocio(String capitalSocialSocio) {
		this.capitalSocialSocio = capitalSocialSocio;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
