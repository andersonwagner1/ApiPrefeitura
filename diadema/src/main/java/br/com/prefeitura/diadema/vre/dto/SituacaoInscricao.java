package br.com.prefeitura.diadema.vre.dto;

import java.util.List;


public class SituacaoInscricao {
    private int codigoSituacao;
    private String descricaoSituacao;
    private String cpfResponsavelSituacao;
    private String dataSituacao;
    private List<String> motivoSituacao;
	public int getCodigoSituacao() {
		return codigoSituacao;
	}
	public void setCodigoSituacao(int codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}
	public String getDescricaoSituacao() {
		return descricaoSituacao;
	}
	public void setDescricaoSituacao(String descricaoSituacao) {
		this.descricaoSituacao = descricaoSituacao;
	}
	public String getCpfResponsavelSituacao() {
		return cpfResponsavelSituacao;
	}
	public void setCpfResponsavelSituacao(String cpfResponsavelSituacao) {
		this.cpfResponsavelSituacao = cpfResponsavelSituacao;
	}
	public String getDataSituacao() {
		return dataSituacao;
	}
	public void setDataSituacao(String dataSituacao) {
		this.dataSituacao = dataSituacao;
	}
	public List<String> getMotivoSituacao() {
		return motivoSituacao;
	}
	public void setMotivoSituacao(List<String> motivoSituacao) {
		this.motivoSituacao = motivoSituacao;
	}

}
