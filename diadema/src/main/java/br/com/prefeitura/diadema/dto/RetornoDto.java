package br.com.prefeitura.diadema.dto;




public class RetornoDto<T> {
	
	private int retorno;
	private String descricao;
	private T objeto;
	
	
	public RetornoDto(){
		this.retorno = 1;
		this.descricao = "SUCESSO";
	}


	public int getRetorno() {
		return retorno;
	}


	public void setRetorno(int retorno) {
		this.retorno = retorno;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public T getObjeto() {
		return objeto;
	}


	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}
}
