package br.com.prefeitura.diadema.dto;

import br.com.prefeitura.diadema.enumerador.EnumSimNao;

public class PermissaoDto {
	private Long id;
	private String nome;
	private EnumSimNao situacao;
	private String observacao;
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
	public EnumSimNao getSituacao() {
		return situacao;
	}
	public void setSituacao(EnumSimNao situacao) {
		this.situacao = situacao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
}
