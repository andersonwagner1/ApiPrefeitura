	package br.com.prefeitura.diadema.dto;




public class ArquivoAgilesDto {
	
	private Long id;
	private String pkAgiles;
	private String localizacao;
	private String nomeArquivo;
	private int ativo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPkAgiles() {
		return pkAgiles;
	}
	public void setPkAgiles(String pkAgiles) {
		this.pkAgiles = pkAgiles;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	public int getAtivo() {
		return ativo;
	}
	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}
	
	
	
	
	
}
