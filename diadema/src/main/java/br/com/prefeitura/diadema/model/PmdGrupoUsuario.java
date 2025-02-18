package br.com.prefeitura.diadema.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Define o grupo de usuarios para listar, neste caso esta sendo usando no ITBI para listar os usuarios que estão para serem fiscais no ITBI
 * @author anderson.oliveira
 *
 */
@Entity
@Table(name="PMD_GRUPO_USUARIO")
public class PmdGrupoUsuario {
	@Id
	private Long id;
	
	private String cdUsuario;
	private String dsNomeGrupo;
	private String dsObservacao;
	private String icAtivo;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCdUsuario() {
		return cdUsuario;
	}
	public void setCdUsuario(String cdUsuario) {
		this.cdUsuario = cdUsuario;
	}
	public String getDsNomeGrupo() {
		return dsNomeGrupo;
	}
	public void setDsNomeGrupo(String dsNomeGrupo) {
		this.dsNomeGrupo = dsNomeGrupo;
	}
	public String getDsObservacao() {
		return dsObservacao;
	}
	public void setDsObservacao(String dsObservacao) {
		this.dsObservacao = dsObservacao;
	}
	public String getIcAtivo() {
		return icAtivo;
	}
	public void setIcAtivo(String icAtivo) {
		this.icAtivo = icAtivo;
	}
	
		
	
		
	
	
	
	
	
}
