package br.com.prefeitura.diadema.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.prefeitura.diadema.enumerador.EnumSimNao;


@Entity
@Table(name="PMD_LOG")
public class PmdLogs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "id")
	@SequenceGenerator(name="id", sequenceName="seq_PMD_LOG", initialValue = 1, allocationSize = 1)
	private Long id;
	@Enumerated(EnumType.STRING)
	private EnumSimNao icSucesso;
	@Lob
    //@Type(type = "org.hibernate.type.StringClobType")
	private String motivo;
	
	private Date cadastro;
	
	@Lob
    //@Type(type = "org.hibernate.type.StringClobType")
	private String parametros;
	 
	
	private String metodo;
	
	
	public PmdLogs(){
		this.cadastro = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EnumSimNao getIcSucesso() {
		return icSucesso;
	}

	public void setIcSucesso(EnumSimNao icSucesso) {
		this.icSucesso = icSucesso;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public String getParametros() {
		return parametros;
	}

	public void setParametros(String parametros) {
		this.parametros = parametros;
	}
	
	
	
	
}
