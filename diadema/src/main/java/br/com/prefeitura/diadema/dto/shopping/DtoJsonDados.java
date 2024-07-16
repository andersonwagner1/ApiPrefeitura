package br.com.prefeitura.diadema.dto.shopping;

import java.util.Date;

import br.com.prefeitura.diadema.enumerador.EnumEscolaridade;
import br.com.prefeitura.diadema.enumerador.EnumSimNao;


public class DtoJsonDados {
	
	private Date dataInclusao;
	
	
	private EnumSimNao pagaAluguel;
	
	
	private Date dataNascimento;
	private Integer idade;
	
	private EnumSimNao temNecessidadeEspecial;
	
	private Integer quantidadeDependente;
	
	private EnumSimNao eMoradorDiademaMais2Anos;
	
	private Double rendaMensal;
	private EnumSimNao eAponsentado;
	
	private EnumEscolaridade escolaridade;
	
	
	
	public Date getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public EnumSimNao getPagaAluguel() {
		return pagaAluguel;
	}
	public void setPagaAluguel(EnumSimNao pagaAluguel) {
		this.pagaAluguel = pagaAluguel;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public EnumSimNao getTemNecessidadeEspecial() {
		return temNecessidadeEspecial;
	}
	public void setTemNecessidadeEspecial(EnumSimNao temNecessidadeEspecial) {
		this.temNecessidadeEspecial = temNecessidadeEspecial;
	}
	public Integer getQuantidadeDependente() {
		return quantidadeDependente;
	}
	public void setQuantidadeDependente(Integer quantidadeDependente) {
		this.quantidadeDependente = quantidadeDependente;
	}
	public EnumSimNao geteMoradorDiademaMais2Anos() {
		return eMoradorDiademaMais2Anos;
	}
	public void seteMoradorDiademaMais2Anos(EnumSimNao eMoradorDiademaMais2Anos) {
		this.eMoradorDiademaMais2Anos = eMoradorDiademaMais2Anos;
	}
	public Double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(Double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public EnumSimNao geteAponsentado() {
		return eAponsentado;
	}
	public void seteAponsentado(EnumSimNao eAponsentado) {
		this.eAponsentado = eAponsentado;
	}
	public EnumEscolaridade getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(EnumEscolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	
	
}
