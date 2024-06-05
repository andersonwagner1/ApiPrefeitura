package br.com.prefeitura.diadema.vre.dto;
public class Solicitacao {
    private String protocoloRedesim;
    private String cnpj;
    private String nrInscricao;
    private int fgBaixa;
	public String getProtocoloRedesim() {
		return protocoloRedesim;
	}
	public void setProtocoloRedesim(String protocoloRedesim) {
		this.protocoloRedesim = protocoloRedesim;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNrInscricao() {
		return nrInscricao;
	}
	public void setNrInscricao(String nrInscricao) {
		this.nrInscricao = nrInscricao;
	}
	public int getFgBaixa() {
		return fgBaixa;
	}
	public void setFgBaixa(int fgBaixa) {
		this.fgBaixa = fgBaixa;
	}

}