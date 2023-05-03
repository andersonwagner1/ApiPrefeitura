package br.com.prefeitura.diadema.dto;

import java.util.List;


/**
 * Created by Image on 28/10/2014.
 */

public class EnquadramentoISS  {
   
    private Long id;
    private String processoDeveContinuar;
    private Integer tlfInicial;
    private Integer isentoTlf;
    private String tipoISSQN;

    private List<EnquadramentoISSCodigoServico> enquadramentoISSCodigoServico;


    private InscricaoMunicipal inscricaoMunicipal;

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProcessoDeveContinuar() {
        return processoDeveContinuar;
    }

    public void setProcessoDeveContinuar(String processoDeveContinuar) {
        this.processoDeveContinuar = processoDeveContinuar;
    }

    public Integer getTlfInicial() {
        return tlfInicial;
    }

    public void setTlfInicial(Integer tlfInicial) {    	
        this.tlfInicial = tlfInicial;
    }

    public Integer getIsentoTlf() {
        return isentoTlf;
    }

    public void setIsentoTlf(Integer isentoTlf) {    	
        this.isentoTlf = isentoTlf;
    }

    public String getTipoISSQN() {
        return tipoISSQN;
    }

    public void setTipoISSQN(String tipoISSQN) {
    	
        this.tipoISSQN = tipoISSQN;
    }

    public List<EnquadramentoISSCodigoServico> getEnquadramentoISSCodigoServico() {
        return enquadramentoISSCodigoServico;
    }

    public void setEnquadramentoISSCodigoServico(List<EnquadramentoISSCodigoServico> enquadramentoISSCodigoServico) {
        this.enquadramentoISSCodigoServico = enquadramentoISSCodigoServico;
    }

    public InscricaoMunicipal getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(InscricaoMunicipal inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }
}
