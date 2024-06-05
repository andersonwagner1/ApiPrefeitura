package br.com.prefeitura.diadema.vre.dto;

import java.util.List;

public class Validacao {
    private int codigo;
    private List<String> mensagens;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public List<String> getMensagens() {
		return mensagens;
	}
	public void setMensagens(List<String> mensagens) {
		this.mensagens = mensagens;
	}

}