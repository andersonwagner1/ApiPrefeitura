package br.com.prefeitura.diadema.util;



import br.com.prefeitura.diadema.dto.shopping.DtoJsonDados;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterDtoJson {
	
	public static void main(String[] args) {
		// Exemplo de uso
		String json = "{\"nome\":\"João\", \"idade\":30}";
		DtoJsonDados dados = jsonParaDto(json, DtoJsonDados.class);
		System.out.println(dados);
	}
	
	public static <T> T jsonParaDto(String json, Class<T> dtoClass) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(json, dtoClass);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	@SuppressWarnings({ "unchecked", "unused" })
	private static <T> T jsonParaDto(String json, Class<DtoJsonDados> class1) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return (T) objectMapper.readValue(json, class1);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}*/


	public static String json(Object dto){
		ObjectMapper objectMapper = new ObjectMapper();
		try {
	
			String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);
			 System.out.println(json);
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
