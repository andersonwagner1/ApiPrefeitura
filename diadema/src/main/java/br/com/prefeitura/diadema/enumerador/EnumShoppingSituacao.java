package br.com.prefeitura.diadema.enumerador;

public enum EnumShoppingSituacao {
	
	 EXECUTANDO, //[EM ANDAMENTO] - não pode abrir um outro processo, pode alterar (SITUAÇÕES: quando esta aberto e aguardando a avaliação
	 CANCELADO, // [CANCELADO] - pode abrir um outro proesso, não pode alterar	
	 APROVADO, // [CONCLUIDO] - não pode abrir outro processo, não pode alterar.
	 REPROVADO //  [PODE INICAR
}



