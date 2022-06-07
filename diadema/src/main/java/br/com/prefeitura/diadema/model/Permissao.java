package br.com.prefeitura.diadema.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "AGL_PERMISSAO")
public class Permissao {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_agl_permissao")
	@SequenceGenerator(name="seq_agl_permissao", sequenceName="seq_agl_permissao")
    private Long id;
    private String nome;
    
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

  
    

   
}