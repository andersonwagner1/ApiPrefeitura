package br.com.prefeitura.diadema.dto;

import java.util.List;



public class DtoInscricao {
	private String teste;
	private InscricaoMunicipal inscricaoMunicipal;
	private EnquadramentoAtividadeEconomica enquadramentoAtividadeEconomica;
	private EnquadramentoISS enquadramentoISS;
	public InscricaoMunicipal getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public void setInscricaoMunicipal(InscricaoMunicipal inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	public EnquadramentoAtividadeEconomica getEnquadramentoAtividadeEconomica() {
		return enquadramentoAtividadeEconomica;
	}
	public void setEnquadramentoAtividadeEconomica(
			EnquadramentoAtividadeEconomica enquadramentoAtividadeEconomica) {
		this.enquadramentoAtividadeEconomica = enquadramentoAtividadeEconomica;
	}
	public EnquadramentoISS getEnquadramentoISS() {
		return enquadramentoISS;
	}
	public void setEnquadramentoISS(EnquadramentoISS enquadramentoISS) {
		this.enquadramentoISS = enquadramentoISS;
	}

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	
	
 
	

	
	
	
}
