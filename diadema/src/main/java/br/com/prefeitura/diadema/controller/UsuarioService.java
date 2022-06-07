package br.com.prefeitura.diadema.controller;

import br.com.prefeitura.diadema.security.Token;
import br.com.prefeitura.diadema.security.TokenUtils;

public class UsuarioService {

	public Token gerarToken(String usuario) {
		//validar usuario e senha
		return new Token(TokenUtils.createToken(usuario));
	}
	

}
