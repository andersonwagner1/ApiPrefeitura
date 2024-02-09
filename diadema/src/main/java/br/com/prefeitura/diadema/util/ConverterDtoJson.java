package br.com.prefeitura.diadema.util;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterDtoJson {
	
	public static void main(String arg[]){
		
	}
	
	public static String json(Object dto){
		ObjectMapper objectMapper = new ObjectMapper();
		try {
	
			String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);
	        return json;		
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "erro ao converter para json";
	}
	
	
	public static void mostarJson(Object dto){
		ObjectMapper objectMapper = new ObjectMapper();
try {
	
			String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);
	        System.out.println(json);
			//String json = objectMapper.writeValueAsString(dto);
			//System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
