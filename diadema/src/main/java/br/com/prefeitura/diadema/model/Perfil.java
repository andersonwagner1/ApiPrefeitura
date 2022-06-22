package br.com.prefeitura.diadema.model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	@SequenceGenerator(name="seq_agl_perfil", sequenceName="seq_agl_perfil", allocationSize = 1)
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private EnumSimNao situacao;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
      name = "AGL_PERFIL_PERMISSAO", 
      joinColumns = @JoinColumn(name ="perfil_id"), 
      inverseJoinColumns = @JoinColumn(name = "permissao_id"))
    List<Permissao> listaPemissao;
    
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
	public List<Permissao> getListaPemissao() {
		return listaPemissao;
	}
	public void setListaPemissao(List<Permissao> listaPemissao) {
		this.listaPemissao = listaPemissao;
	}
	
	
	
	
}