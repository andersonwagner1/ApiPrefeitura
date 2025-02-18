package br.com.prefeitura.diadema.enumerador;



public enum EnumEscolaridade {
	EBI("Ensino Básico Incompleto"), 	//EBI
	EBC("Ensino Básico Completo"), 		//EBC
	EFI("Ensino Fundamental Incompleto"),//EFI
	EFC("Ensino Fundamental Completo"), 	//EFC
	EMI("Ensino Médio Incompleto"), 		//EMI
	EMC("Ensino Médio Completo"), 			//EMC
	ESI("Ensino Superior Incompleto"), 		//ESI
	ESC("Ensino Superior Completo"); 			//ESC
	
	//ENS_SUP_INCOMPL, ENS_BASICO_COMPL, ENS_MEDIO_INCOMPL, ENS_SUP_COMPL, ENS_MEDIO_COMPL, ENS_BASICO_INCOMPL, ENS_FUNDAM_COMPL, ENS_FUNDAM_INCOMPL
	
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
