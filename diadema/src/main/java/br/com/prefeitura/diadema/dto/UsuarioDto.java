package br.com.prefeitura.diadema.dto;

import br.com.prefeitura.diadema.security.Token;

public class UsuarioDto {
	private Long id;
	private String nome;
	private String cpf;
	private String ativado;
	private String email;
	private String pk;
	private String certificado;
	private String prontuario;
	private String prontuarioRh;
	private String senha;
	private String login;
	private String situacaoRh;
	private Integer codigoRh;
	private Token token;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Token getToken() {
		return token;
	}
	public void setToken(Token token) {
		this.token = token;
	}
	public String getPk() {
		return pk;
	}
	public void setPk(String pk) {
		this.pk = pk;
	}
	public String getAtivado() {
		return ativado;
	}
	public void setAtivado(String ativado) {
		this.ativado = ativado;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCertificado() {
		return certificado;
	}
	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}
	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	public String getProntuarioRh() {
		return prontuarioRh;
	}
	public void setProntuarioRh(String prontuarioRh) {
		this.prontuarioRh = prontuarioRh;
	}
	public String getSituacaoRh() {
		return situacaoRh;
	}
	public void setSituacaoRh(String situacaoRh) {
		this.situacaoRh = situacaoRh;
	}
	public Integer getCodigoRh() {
		return codigoRh;
	}
	public void setCodigoRh(Integer codigoRh) {
		this.codigoRh = codigoRh;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
}
