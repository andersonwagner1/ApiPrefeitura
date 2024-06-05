package br.com.prefeitura.diadema.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import br.com.prefeitura.diadema.enumerador.EnumVreSituacao;

@Entity
@Table(name = "PMD_VRE_PROTOCOLO")
public class PmdVreSolicitacao {

	@Id
	private String nrProcessoBoleto;

	@Enumerated(EnumType.STRING)
	private EnumVreSituacao dsSituacao;
	
	@Lob
	private String dsDadosJucesp;
	
	private String protocoloSolar;

	private Date dtCarga;
	
	private String motivo;
	
	public PmdVreSolicitacao(){
		this.dtCarga = new Date();
	}

	public String getNrProcessoBoleto() {
		return nrProcessoBoleto;
	}

	public void setNrProcessoBoleto(String nrProcessoBoleto) {
		this.nrProcessoBoleto = nrProcessoBoleto;
	}

	public EnumVreSituacao getDsSituacao() {
		return dsSituacao;
	}

	public void setDsSituacao(EnumVreSituacao dsSituacao) {
		this.dsSituacao = dsSituacao;
	}

	public Date getDtCarga() {
		return dtCarga;
	}

	public void setDtCarga(Date dtCarga) {
		this.dtCarga = dtCarga;
	}

	public String getDsDadosJucesp() {
		return dsDadosJucesp;
	}

	public void setDsDadosJucesp(String dsDadosJucesp) {
		this.dsDadosJucesp = dsDadosJucesp;
	}

	public String getProtocoloSolar() {
		return protocoloSolar;
	}

	public void setProtocoloSolar(String protocoloSolar) {
		this.protocoloSolar = protocoloSolar;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	
	
	
	
	
}
