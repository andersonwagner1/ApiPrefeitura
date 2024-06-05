package br.com.prefeitura.diadema.vre.dto;

public class AtividadeEconomica {
    private String cnae;
    private String dsCnae;
    private boolean atividadePrincipal;
    private boolean atividadeEstabelecidaNoLocal;
	public String getCnae() {
		return cnae;
	}
	public void setCnae(String cnae) {
		this.cnae = cnae;
	}
	public String getDsCnae() {
		return dsCnae;
	}
	public void setDsCnae(String dsCnae) {
		this.dsCnae = dsCnae;
	}
	public boolean isAtividadePrincipal() {
		return atividadePrincipal;
	}
	public void setAtividadePrincipal(boolean atividadePrincipal) {
		this.atividadePrincipal = atividadePrincipal;
	}
	public boolean isAtividadeEstabelecidaNoLocal() {
		return atividadeEstabelecidaNoLocal;
	}
	public void setAtividadeEstabelecidaNoLocal(boolean atividadeEstabelecidaNoLocal) {
		this.atividadeEstabelecidaNoLocal = atividadeEstabelecidaNoLocal;
	}
}
