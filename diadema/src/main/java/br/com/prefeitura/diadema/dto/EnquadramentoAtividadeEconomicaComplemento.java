package br.com.prefeitura.diadema.dto;



public class EnquadramentoAtividadeEconomicaComplemento {

     private Long id;

    private ComplementoAtividade complementoAtividade;

    private String tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ComplementoAtividade getComplementoAtividade() {
        return complementoAtividade;
    }

    public void setComplementoAtividade(ComplementoAtividade complementoAtividade) {
        this.complementoAtividade = complementoAtividade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
