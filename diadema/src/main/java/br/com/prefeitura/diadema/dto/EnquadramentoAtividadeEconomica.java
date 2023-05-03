package br.com.prefeitura.diadema.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * Created by Image on 29/10/2014.
 */

public class EnquadramentoAtividadeEconomica {


      private Long id;

    private String classificacaoAtividade;
    private String observacao;
    private Date dataContrato;
    private Date horaContrato;
    private Integer sequencia;
    private Integer numeroContrato;
    private Date dataAlteracao;
    private String observacaoContrato;


   
    private List<EnquadramentoAtividadeEconomicaComplemento> enquadramentoAtividadeEconomicaComplementos;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getClassificacaoAtividade() {
		return classificacaoAtividade;
	}



	public void setClassificacaoAtividade(String classificacaoAtividade) {
		this.classificacaoAtividade = classificacaoAtividade;
	}



	public String getObservacao() {
		return observacao;
	}



	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}



	public Date getDataContrato() {
		return dataContrato;
	}



	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}



	public Date getHoraContrato() {
		return horaContrato;
	}



	public void setHoraContrato(Date horaContrato) {
		this.horaContrato = horaContrato;
	}



	public Integer getSequencia() {
		return sequencia;
	}



	public void setSequencia(Integer sequencia) {
		this.sequencia = sequencia;
	}



	public Integer getNumeroContrato() {
		return numeroContrato;
	}



	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}



	public Date getDataAlteracao() {
		return dataAlteracao;
	}



	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}



	public String getObservacaoContrato() {
		return observacaoContrato;
	}



	public void setObservacaoContrato(String observacaoContrato) {
		this.observacaoContrato = observacaoContrato;
	}



	public List<EnquadramentoAtividadeEconomicaComplemento> getEnquadramentoAtividadeEconomicaComplementos() {
		return enquadramentoAtividadeEconomicaComplementos;
	}



	public void setEnquadramentoAtividadeEconomicaComplementos(
			List<EnquadramentoAtividadeEconomicaComplemento> enquadramentoAtividadeEconomicaComplementos) {
		this.enquadramentoAtividadeEconomicaComplementos = enquadramentoAtividadeEconomicaComplementos;
	}

   
}
