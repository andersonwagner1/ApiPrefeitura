package br.com.prefeitura.diadema.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "AGL_AGENDA_PROCESSO")
public class AgendaProcesso {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_agl_agenda_processo")
	@SequenceGenerator(name="seq_agl_agenda_processo", sequenceName="seq_agl_agenda_processo", allocationSize = 1)
    private Long id;
	private Long idDocumentoBase;
    private Date dtAvisoHoje;
    private Date dtAvisoOntem;
    private Date dtAviso5Dias;
    private Date dtCadastro;
    private Date dtAvisar;
    private String observacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDtAvisoHoje() {
		return dtAvisoHoje;
	}

	public void setDtAvisoHoje(Date dtAvisoHoje) {
		this.dtAvisoHoje = dtAvisoHoje;
	}

	public Date getDtAvisoOntem() {
		return dtAvisoOntem;
	}

	public void setDtAvisoOntem(Date dtAvisoOntem) {
		this.dtAvisoOntem = dtAvisoOntem;
	}

	public Date getDtAviso5Dias() {
		return dtAviso5Dias;
	}

	public void setDtAviso5Dias(Date dtAviso5Dias) {
		this.dtAviso5Dias = dtAviso5Dias;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDtAvisar() {
		return dtAvisar;
	}

	public void setDtAvisar(Date dtAvisar) {
		this.dtAvisar = dtAvisar;
	}

	public Long getIdDocumentoBase() {
		return idDocumentoBase;
	}

	public void setIdDocumentoBase(Long idDocumentoBase) {
		this.idDocumentoBase = idDocumentoBase;
	}

	
	
	
	
}