package br.com.prefeitura.diadema.vre.dto;


public class Complemento {
    private String dsComplementoLogradouro;
    private TipoComplemento tipoComplemento;

    // Getters e Setters
    public String getDsComplementoLogradouro() {
        return dsComplementoLogradouro;
    }

    public void setDsComplementoLogradouro(String dsComplementoLogradouro) {
        this.dsComplementoLogradouro = dsComplementoLogradouro;
    }

    public TipoComplemento getTipoComplemento() {
        return tipoComplemento;
    }

    public void setTipoComplemento(TipoComplemento tipoComplemento) {
        this.tipoComplemento = tipoComplemento;
    }
}

