package br.com.prefeitura.diadema.dto;


public class UnidadeDto {
	
	private Long id;
	private String nome;
	private String area;
	private Integer ativo;
	private String tipo;
	private String sistema;
	
	
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
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getAtivo() {
		return ativo;
	}
	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
}
