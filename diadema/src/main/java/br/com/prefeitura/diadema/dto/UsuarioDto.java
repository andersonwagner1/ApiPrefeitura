package br.com.prefeitura.diadema.dto;

import lombok.Getter;
import lombok.Setter;
import br.com.prefeitura.diadema.security.Token;

@Getter
@Setter
public class UsuarioDto {
	private Long id;
	private String nome;
	private String senha;
	private String login;
	private String pk;
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
	
	
	
	
}
