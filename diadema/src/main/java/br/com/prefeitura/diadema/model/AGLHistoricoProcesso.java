package br.com.prefeitura.diadema.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "AGL_HISTORICO")
public class AGLHistoricoProcesso {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_agl_historico")
	@SequenceGenerator(name="seq_agl_historico", sequenceName="seq_agl_historico", allocationSize = 1)
    private Long id;
   
	private Integer posicao;
	
	private Long idAssunto;
	
	private Long idUnidade;
	
	private Long idUsuario;
	
	private Long idBase;
	
	private Long idEvento;
	
	//private Integer qtd;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public Long getIdAssunto() {
		return idAssunto;
	}

	public void setIdAssunto(Long idAssunto) {
		this.idAssunto = idAssunto;
	}

	public Long getIdUnidade() {
		return idUnidade;
	}

	public void setIdUnidade(Long idUnidade) {
		this.idUnidade = idUnidade;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	//public Integer getQtd() {
	//	return qtd;
	//}

	//public void setQtd(Integer qtd) {
	//	this.qtd = qtd;
	//}

	public Long getIdBase() {
		return idBase;
	}

	public void setIdBase(Long idBase) {
		this.idBase = idBase;
	}

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}
	
	
	
    
	

  
    

   
}