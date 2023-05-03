package br.com.prefeitura.diadema.dto;


public class Publicidades {

    private Long id;
    
    private Integer quantidade;
   // private String metros2;
    private Double m2;
    private Integer tipo; 
    //1 - Quantidade Publicidade Luminoso
    //2 - Publicidade Nao Luminioso
    //3 - Quantidade Publicida de Terceiro
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	/*public String getMetros2() {
		return metros2;
	}
	public void setMetros2(String metros2) {
		this.metros2 = metros2;
	}*/
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public Double getM2() {
		return m2;
	}
	public void setM2(Double m2) {
		this.m2 = m2;
	}
	
	
    
    
	
	
	
	
}
   
