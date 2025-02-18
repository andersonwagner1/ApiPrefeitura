package br.com.prefeitura.diadema.dto.shopping;

import java.util.Date;
import java.util.List;

import br.com.prefeitura.diadema.enumerador.EnumEscolaridade;
import br.com.prefeitura.diadema.enumerador.EnumSimNao;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DtoJsonDados {
	
	private Date dataInclusao;
	
	
	private EnumSimNao dsPagaAluguel;
	
	
	private String dtNascimento;
	private Integer idade;
	
	private EnumSimNao dsPortadorNecessidadeEspecial;
	
	private Integer quantidadeDependente;
	
	private EnumSimNao dsMoraMais2AnosEmDiadema;
	
	private Double vlAlguel;
	private Double vlRendaMensal;
	private EnumSimNao dsAponsentado;
	
	private EnumEscolaridade dsEscolaridade;
	
	
	private List<Depedente> tbDepedente;

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public EnumSimNao getDsPagaAluguel() {
		return dsPagaAluguel;
	}

	public void setDsPagaAluguel(EnumSimNao dsPagaAluguel) {
		this.dsPagaAluguel = dsPagaAluguel;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public EnumSimNao getDsPortadorNecessidadeEspecial() {
		return dsPortadorNecessidadeEspecial;
	}

	public void setDsPortadorNecessidadeEspecial(
			EnumSimNao dsPortadorNecessidadeEspecial) {
		this.dsPortadorNecessidadeEspecial = dsPortadorNecessidadeEspecial;
	}

	public Integer getQuantidadeDependente() {
		return quantidadeDependente;
	}

	public void setQuantidadeDependente(Integer quantidadeDependente) {
		this.quantidadeDependente = quantidadeDependente;
	}

	public EnumSimNao getDsMoraMais2AnosEmDiadema() {
		return dsMoraMais2AnosEmDiadema;
	}

	public void setDsMoraMais2AnosEmDiadema(EnumSimNao dsMoraMais2AnosEmDiadema) {
		this.dsMoraMais2AnosEmDiadema = dsMoraMais2AnosEmDiadema;
	}

	public Double getVlAlguel() {
		return vlAlguel;
	}

	public void setVlAlguel(Double vlAlguel) {
		this.vlAlguel = vlAlguel;
	}

	public EnumSimNao getDsAponsentado() {
		return dsAponsentado;
	}

	public void setDsAponsentado(EnumSimNao dsAponsentado) {
		this.dsAponsentado = dsAponsentado;
	}

	public EnumEscolaridade getDsEscolaridade() {
		return dsEscolaridade;
	}

	public void setDsEscolaridade(EnumEscolaridade dsEscolaridade) {
		this.dsEscolaridade = dsEscolaridade;
	}

	public List<Depedente> getTbDepedente() {
		return tbDepedente;
	}

	public void setTbDepedente(List<Depedente> tbDepedente) {
		if(tbDepedente == null || tbDepedente.size() == 0){
			this.quantidadeDependente = 0;
		}else{
			if(tbDepedente.get(0).getDsNome() == null){
				this.tbDepedente = null;
				this.quantidadeDependente = 0;
			}else{
				this.quantidadeDependente = tbDepedente.size();
			}
		}
		
		
		this.tbDepedente = tbDepedente;
	}

	public Double getVlRendaMensal() {
		return vlRendaMensal;
	}

	public void setVlRendaMensal(Double vlRendaMensal) {
		this.vlRendaMensal = vlRendaMensal;
	}
	


}

class Depedente {
	private String dsNome;

	public String getDsNome() {
		return dsNome;
	}

	public void setDsNome(String dsNome) {
		this.dsNome = dsNome;
	}
	
	
	
}
