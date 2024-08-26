package br.com.prefeitura.diadema;

public class Principal {

	public  static void main (String args[]){
		
		 String texto  =  "10.0.1 testes";
		 
		 String[] partes = texto.split(" ");
	        
	        // O primeiro elemento é a parte com os números
	        String numeros = partes[0];
	        String[] numerosArray = numeros.split("\\.");
		 
		 System.out.println("teses");
		
	/*	CompletionRequest request = new CompletionRequest.Builder()
	    .prompt("Olá, como você está?")
	    .model("text-davinci-002")
	    .build();

	CompletionResponse response = openai.completions(request);
	String answer = response.getChoices().get(0).getText();
	System.out.println(answer);
		*/
	}
	
}
