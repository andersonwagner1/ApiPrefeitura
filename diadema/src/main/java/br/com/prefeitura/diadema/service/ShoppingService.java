package br.com.prefeitura.diadema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.shopping.DtoShopping;

/**
 * Desenvolvimento do shopping popular
 * @author anderson.oliveira
 *
 */
@Service
public class ShoppingService {

	@Autowired
	public ShoppingService(){; 
	}

	public static void main(String args[]){
		
	}

	public Boolean verificarInscricaoEstaAberta() {
		
		return false;
	}

	public String verificarSeExisteUmProcessoAberto(Long cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	public void realizarCalculoEAtualizarLista(Integer ano) {
		// TODO Auto-generated method stub
		
	}

	public List<String[]> classificacao(Integer ano) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void enviarDados(DtoShopping shooping) {
		
		
	}
	
	
	
	

}
