package br.com.prefeitura.diadema.enumerador;



public enum EnumEscolaridade {
	ENS_BASICO_INCOMPL("Ensino Básico Incompleto"), 	//EBI
	ENS_BASICO_COMPL("Ensino Básico Completo"), 		//EBC
	ENS_FUNDAM_INCOMPL("Ensino Fundamental Incompleto"),//EFI
	ENS_FUNDAM_COMPL("Ensino Fundamental Completo"), 	//EFC
	ENS_MEDIO_INCOMPL("Ensino Médio Incompleto"), 		//EMI
	ENS_MEDIO_COMPL("Ensino Médio Completo"), 			//EMC
	ENS_SUP_INCOMPL("Ensino Superior Incompleto"), 		//ESI
	ENS_SUP_COMPL("Ensino Superior Completo"); 			//ESC
	
	
	
	private String nomeEscolar;
	
	
	
	
	private EnumEscolaridade(String nomeEscolar){
		this.nomeEscolar = nomeEscolar;
	}
	
		
	public String getNomeEscolar() {
		return nomeEscolar;
	}
		
	
	
	public int getOrdinal(){
		return ordinal();
	}
	
	public String getName(){
		return name();
	}

}
