package br.com.prefeitura.diadema.dto;




/**
 * Created by Image on 13/10/2014.
 */

public class ComplementoAtividade {

    private Long id;

    private Integer grupo;
    private Integer subgrupo;
    private Integer atividade;
    private String descricao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getGrupo() {
		return grupo;
	}
	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}
	public Integer getSubgrupo() {
		return subgrupo;
	}
	public void setSubgrupo(Integer subgrupo) {
		this.subgrupo = subgrupo;
	}
	public Integer getAtividade() {
		return atividade;
	}
	public void setAtividade(Integer atividade) {
		this.atividade = atividade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

   
   
}
