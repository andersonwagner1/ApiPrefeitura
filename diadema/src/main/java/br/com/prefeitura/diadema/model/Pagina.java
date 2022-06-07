package br.com.prefeitura.diadema.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "AGL_PAGINA")
public class Pagina {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_agl_pagina")
	@SequenceGenerator(name="seq_agl_pagina", sequenceName="seq_agl_pagina")
    private Long id;
    private String nome;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

  
    

   
}