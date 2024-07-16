package br.com.prefeitura.diadema.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PMD_SHOPPING_POPULAR_CONFIG")
public class PmdShoppingPopularConfiguracao {
	
	private Integer mesAbertura; // mes de permissão de abertura do processo
	
	@Id
	private Integer ano; //id do ano de abertura e as pontuacoes permitidas;
	
	private Double salarioMinimo;

	
	
	
	
	public Integer getMesAbertura() {
		return mesAbertura;
	}

	public void setMesAbertura(Integer mesAbertura) {
		this.mesAbertura = mesAbertura;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getSalarioMinimo() {
		return salarioMinimo;
	}

	public void setSalarioMinimo(Double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}

	
	
	
	
	
	
	
	
}
