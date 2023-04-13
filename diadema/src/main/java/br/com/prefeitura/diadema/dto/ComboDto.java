package br.com.prefeitura.diadema.dto;

import java.util.List;



public class ComboDto {
	private Long id;
	private String descricao;
	private String sigla; // usado apenas para outras informações inforportante ou codigos
	private List<ComboDto> combo;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<ComboDto> getCombo() {
		return combo;
	}

	public void setCombo(List<ComboDto> combo) {
		this.combo = combo;
	}

	
	
	
}
