package br.com.prefeitura.diadema.boleto;

public class RetBoleto {
	
	private String resultado;
	private boolean sucesso;
	private String caminhoArquivo;
	private byte[] arquivo;
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public boolean isSucesso() {
		return sucesso;
	}
	public void setSucesso(boolean sucesso) {
		this.sucesso = sucesso;
	}
	public String getCaminhoArquivo() {
		return caminhoArquivo;
	}
	public void setCaminhoArquivo(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}
	public byte[] getArquivo() {
		return arquivo;
	}
	public void setArquivo(byte[] arquivo) {
		this.arquivo = arquivo;
	}
	
	
 
}
