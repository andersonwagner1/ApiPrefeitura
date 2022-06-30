package br.com.prefeitura.diadema.dto;

import java.util.Calendar;
import java.util.Date;


public class AgendaProcessoDto {
	private Long id;
	private Date dtAvisar;
	private Date dtAvisoHoje;
    private Date dtAvisoOntem;
    private Date dtAviso5Dias;
	private Date dtCadastro;
	private String observacao;
	private Long idDocumentoBase;
	private String situacao;
	private ProcessoEletronicoDto processo;
	
	
	
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDtAvisar() {
		return dtAvisar;
	}
	public void setDtAvisar(Date dtAvisar) {
		if(dtAvisar != null){
						
			Calendar data1 = Calendar.getInstance();
			data1.setTime(dtAvisar);		
			
			Calendar data2 = Calendar.getInstance();
			
			int dias = data1.get(Calendar.DAY_OF_YEAR) - data2.get(Calendar.DAY_OF_YEAR);
			
		
			if(dias  > 5){
				this.situacao = "aguardando";
			}
						
			if(dias <= 5 ){
				this.situacao = "avisado";
			}			
			
			if(dias <=0){
				this.situacao = "concluido";
			}
		}else{
			this.situacao = "Erro";
		}
		
		
		
		this.dtAvisar = dtAvisar;
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
	public Long getIdDocumentoBase() {
		return idDocumentoBase;
	}
	public void setIdDocumentoBase(Long idDocumentoBase) {
		this.idDocumentoBase = idDocumentoBase;
	}
	public ProcessoEletronicoDto getProcesso() {
		return processo;
	}
	public void setProcesso(ProcessoEletronicoDto processo) {
		this.processo = processo;
	}
	
	
	
	
	
}
