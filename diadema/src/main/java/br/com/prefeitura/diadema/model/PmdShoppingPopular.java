package br.com.prefeitura.diadema.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.prefeitura.diadema.enumerador.EnumShoppingSituacao;


@Entity
@Table(name="PMD_SHOPPING_POPULAR")
public class PmdShoppingPopular {
	
	private String cpf; // identificador
	private String nome; //nome de confirmação
	
	@Id
	private String processo; // numero do processo eletronico
	private Integer ano; // ano do processo
	private Integer criterioDePontuacao; // pontuaçao do usuario
	private Long criterioDeDesempate; // prontuacções
	private Integer posicao;	
	private String pontuacaoDetalhada; // essa pontuação estara separado por ponto e virgular para facilitar a leitura
	
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
	public String getPontuacaoDetalhada() {
		return pontuacaoDetalhada;
	}
	public void setPontuacaoDetalhada(String pontuacaoDetalhada) {
		this.pontuacaoDetalhada = pontuacaoDetalhada;
	}
	public EnumShoppingSituacao getIcSituacao() {
		return icSituacao;
	}
	public void setIcSituacao(EnumShoppingSituacao icSituacao) {
		this.icSituacao = icSituacao;
	}
	
	
	
	
	
}
