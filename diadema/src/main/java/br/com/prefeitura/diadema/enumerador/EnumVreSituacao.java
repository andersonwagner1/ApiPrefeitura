package br.com.prefeitura.diadema.enumerador;

public enum EnumVreSituacao {

	INICIADO, // gravado no banco de dados mas ainda não foi enviado para o
	//ENVIADO_SOLAR, // enviado para o solar com sucesso
	NAO_ENVIAR_SOLAR // solicitação que não atendente a prefeitura de diadema
, ERRO
}
