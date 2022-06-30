package br.com.prefeitura.diadema.dto;

import java.util.Date;
import java.util.List;


public class ProcessoEletronicoDto {
	private Long idProcesso;
	private String assunto;
	private Integer  anoProcesso;
	private String numeroProcesso;
	private String siglaProcesso;
	private Date dataCriacao;
	private String identificacaoLabel;
	private Integer numeroRequisicao;
	private Integer  anoRequisicao;
	private String acaoLabel;
	private String situacaoLabel;
	private SolicitanteDto interessado;
	private SolicitanteDto solicitante;
	private Long idDocumentoBase;	
	private List<ArquivoAgilesDto> listaArquivo;
	private HistoricoDto ultimoEvento;
	
	
	
	public Long getIdDocumentoBase() {
		return idDocumentoBase;
	}
	public Long getIdProcesso() {
		return idProcesso;
	}
	public void setIdProcesso(Long idProcesso) {
		this.idProcesso = idProcesso;
	}
	public Integer getAnoProcesso() {
		return anoProcesso;
	}
	public void setAnoProcesso(Integer anoProcesso) {
		this.anoProcesso = anoProcesso;
	}
	public String getNumeroProcesso() {
		return numeroProcesso;
	}
	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}
	public String getSiglaProcesso() {
		return siglaProcesso;
	}
	public void setSiglaProcesso(String siglaProcesso) {
		this.siglaProcesso = siglaProcesso;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public String getIdentificacaoLabel() {
		return identificacaoLabel;
	}
	public void setIdentificacaoLabel(String identificacaoLabel) {
		this.identificacaoLabel = identificacaoLabel;
	}
	public Integer getNumeroRequisicao() {
		return numeroRequisicao;
	}
	public void setNumeroRequisicao(Integer numeroRequisicao) {
		this.numeroRequisicao = numeroRequisicao;
	}
	public Integer getAnoRequisicao() {
		return anoRequisicao;
	}
	public void setAnoRequisicao(Integer anoRequisicao) {
		this.anoRequisicao = anoRequisicao;
	}
	public String getAcaoLabel() {
		return acaoLabel;
	}
	public void setAcaoLabel(String acaoLabel) {
		this.acaoLabel = acaoLabel;
	}
	
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getSituacaoLabel() {
		return situacaoLabel;
	}
	public void setSituacaoLabel(String situacaoLabel) {
		this.situacaoLabel = situacaoLabel;
	}
	public SolicitanteDto getInteressado() {
		return interessado;
	}
	public void setInteressado(SolicitanteDto interessado) {
		this.interessado = interessado;
	}
	public SolicitanteDto getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(SolicitanteDto solicitante) {
		this.solicitante = solicitante;
	}
	public void setIdDocumentoBase(Long idDocumentoBase) {
		this.idDocumentoBase = idDocumentoBase;
		
	}
	public List<ArquivoAgilesDto> getListaArquivo() {
		return listaArquivo;
	}
	public void setListaArquivo(List<ArquivoAgilesDto> listaArquivo) {
		this.listaArquivo = listaArquivo;
	}
	public HistoricoDto getUltimoEvento() {
		return ultimoEvento;
	}
	public void setUltimoEvento(HistoricoDto ultimoEvento) {
		this.ultimoEvento = ultimoEvento;
	}
	
	
	
	
	
	
	
}
