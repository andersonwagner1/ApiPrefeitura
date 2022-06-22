package br.com.prefeitura.diadema.model;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.prefeitura.diadema.enumerador.EnumSimNao;

@Entity
@Table(name = "AGL_PERMISSAO")
public class Permissao {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_agl_permissao")
	@SequenceGenerator(name="seq_agl_permissao", sequenceName="seq_agl_permissao", allocationSize = 1)
    private Long id;
    private String nome;
    
    @Enumerated(EnumType.STRING)
    private EnumSimNao situacao;
    
    private String observacao;
    
    @ManyToOne    
    @JoinColumn(name = "pagina_id")
    private Pagina pagina;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public Pagina getPagina() {
		return pagina;
	}
	public void setPagina(Pagina pagina) {
		this.pagina = pagina;
	}
	public void setId(Long id) {
		this.id = id;
	}

  
    

   
}