package br.com.prefeitura.diadema.vre.dto;

import java.util.List;

public class ResultadoDto {

	private String resultado;

	private Solicitacao solicitacao;
	private List<SituacaoInscricao> situacoesInscricao;
	private List<Evento> eventos;
	private DadosEmpresa dadosEmpresa;
	private DadosEstabelecimento dadosEstabelecimento;
	private List<Socio> socios;
	private RepresentanteIM representanteIM;
	private Contador contador;
	private Validacao validacao;

	public Solicitacao getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}

	public List<SituacaoInscricao> getSituacoesInscricao() {
		return situacoesInscricao;
	}

	public void setSituacoesInscricao(List<SituacaoInscricao> situacoesInscricao) {
		this.situacoesInscricao = situacoesInscricao;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public DadosEmpresa getDadosEmpresa() {
		return dadosEmpresa;
	}

	public void setDadosEmpresa(DadosEmpresa dadosEmpresa) {
		this.dadosEmpresa = dadosEmpresa;
	}

	public DadosEstabelecimento getDadosEstabelecimento() {
		return dadosEstabelecimento;
	}

	public void setDadosEstabelecimento(
			DadosEstabelecimento dadosEstabelecimento) {
		this.dadosEstabelecimento = dadosEstabelecimento;
	}

	public List<Socio> getSocios() {
		return socios;
	}

	public void setSocios(List<Socio> socios) {
		this.socios = socios;
	}

	public RepresentanteIM getRepresentanteIM() {
		return representanteIM;
	}

	public void setRepresentanteIM(RepresentanteIM representanteIM) {
		this.representanteIM = representanteIM;
	}

	public Contador getContador() {
		return contador;
	}

	public void setContador(Contador contador) {
		this.contador = contador;
	}

	public Validacao getValidacao() {
		return validacao;
	}

	public void setValidacao(Validacao validacao) {
		this.validacao = validacao;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
