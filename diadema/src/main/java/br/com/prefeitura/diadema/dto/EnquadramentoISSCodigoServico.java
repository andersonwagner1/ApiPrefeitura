package br.com.prefeitura.diadema.dto;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Felipe Hila on 05/11/2014.
 */

public class EnquadramentoISSCodigoServico {


    private Long id;


    private String codigoServico;

    private String tipo;

    private String situacao;

    private Date dataInicial;

    private Date dataFinal;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*public CodigoServico getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(CodigoServico codigoServico) {
        this.codigoServico = codigoServico;
    }*/

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

	public String getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(String codigoServico) {
		this.codigoServico = codigoServico;
	}
    
    
    
}


