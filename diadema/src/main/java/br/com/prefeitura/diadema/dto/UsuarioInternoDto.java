package br.com.prefeitura.diadema.dto;

import java.util.List;


public class UsuarioInternoDto {
	private Long id;
	private String active;
	private boolean ativo;
	private String celular;
	private String cpf;
	private String email;
	private String pkUsuarioAgiles;
	private String prontuario;
	private String idchaveKms;
	private String nome;
	private String situacaoRh = "sem informação";
	private String prontuarioRh = "sem informação";
	private List<UnidadeDto> listaUnidade;
	private List<ProcessoEletronicoDto> listaProcesso;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPkUsuarioAgiles() {
		return pkUsuarioAgiles;
	}
	public void setPkUsuarioAgiles(String pkUsuarioAgiles) {
		this.pkUsuarioAgiles = pkUsuarioAgiles;
	}
	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	public String getIdchaveKms() {
		return idchaveKms;
	}
	public void setIdchaveKms(String idchaveKms) {
		this.idchaveKms = idchaveKms;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSituacaoRh() {
		return situacaoRh;
	}
	public void setSituacaoRh(String situacaoRh) {
		this.situacaoRh = situacaoRh;
	}
	public String getProntuarioRh() {
		return prontuarioRh;
	}
	public void setProntuarioRh(String prontuarioRh) {
		this.prontuarioRh = prontuarioRh;
	}
	public List<UnidadeDto> getListaUnidade() {
		return listaUnidade;
	}
	public void setListaUnidade(List<UnidadeDto> listaUnidade) {
		this.listaUnidade = listaUnidade;
	}
	public List<ProcessoEletronicoDto> getListaProcesso() {
		return listaProcesso;
	}
	public void setListaProcesso(List<ProcessoEletronicoDto> listaProcesso) {
		this.listaProcesso = listaProcesso;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	
	
	
}
