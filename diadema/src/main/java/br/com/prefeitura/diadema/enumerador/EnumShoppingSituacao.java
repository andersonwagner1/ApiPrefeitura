package br.com.prefeitura.diadema.enumerador;

public enum EnumShoppingSituacao {
	
	 EXECUTANDO, //[EM ANDAMENTO] - não pode abrir um outro processo, pode alterar
	 CANCELADO, // [CANCELADO] - pode abrir um outro proesso, não pode alterar
	 CONCLUIDO // [CONCLUIDO] - não pode abrir outro processo, não pode alterar. 
}



