package br.com.prefeitura.diadema.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity
@Table(name="ADM_CARGA_FORMULARIO")
public class AdmCargaFormulario {
	 
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "idCarga")
	//@SequenceGenerator(name="idCarga", sequenceName="seq_ADM_CARGA_FORMULARIO", initialValue = 1, allocationSize = 1)
	//private Long id;
		
	@Lob
	private String formulario;
	
	@Id
	private Long idDocBase;
	
	private Long idModelo;
	
	@Lob
	private String observacao; 

	public String getFormulario() {
		return formulario;
	}

	public void setFormulario(String formulario) {
		this.formulario = formulario;
	}

	public Long getIdDocBase() {
		return idDocBase;
	}

	public void setIdDocBase(Long idDocBase) {
		this.idDocBase = idDocBase;
	}

	public Long getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(Long idModelo) {
		this.idModelo = idModelo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	

	
	
	
	
}
