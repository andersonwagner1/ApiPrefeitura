package br.com.prefeitura.diadema.dto.shopping;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.prefeitura.diadema.enumerador.EnumShoppingSituacao;
import br.com.prefeitura.diadema.enumerador.EnumSimNao;

public class DtoShopping {
	private String cpf; // identificador
	private String nome; //nome de confirmação
	private String processo; // numero do processo eletronico
	private Integer ano; // ano do processo
	private Integer criterioDePontuacao; // pontuaçao do usuario
	private Long criterioDeDesempate; // prontuacções
	private EnumSimNao aprovado;
	private Integer posicao;
	private DtoJsonDados jsonDados;
	
	
	@Enumerated(EnumType.STRING)
	private EnumShoppingSituacao icSituacao;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProcesso() {
		return processo;
	}

	public void setProcesso(String processo) {
		this.processo = processo;
	}

	public EnumShoppingSituacao getIcSituacao() {
		return icSituacao;
	}

	public void setIcSituacao(EnumShoppingSituacao icSituacao) {
		this.icSituacao = icSituacao;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getCriterioDePontuacao() {
		return criterioDePontuacao;
	}

	public void setCriterioDePontuacao(Integer criterioDePontuacao) {
		this.criterioDePontuacao = criterioDePontuacao;
	}

	

	public Long getCriterioDeDesempate() {
		return criterioDeDesempate;
	}

	public void setCriterioDeDesempate(Long criterioDeDesempate) {
		this.criterioDeDesempate = criterioDeDesempate;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public DtoJsonDados getJsonDados() {
		return jsonDados;
	}

	public void setJsonDados(DtoJsonDados jsonDados) {
		this.jsonDados = jsonDados;
	}

	public EnumSimNao getAprovado() {
		return aprovado;
	}

	public void setAprovado(EnumSimNao aprovado) {
		this.aprovado = aprovado;
	}


	
	
	
	

}
