package br.com.prefeitura.diadema.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.prefeitura.diadema.enumerador.EnumSimNao;

@Entity
@Table(name = "AGL_PERFIL")
public class Perfil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_agl_perfil")
	@SequenceGenerator(name="seq_agl_perfil", sequenceName="seq_agl_perfil")
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
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