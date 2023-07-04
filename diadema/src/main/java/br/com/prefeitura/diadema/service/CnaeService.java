package br.com.prefeitura.diadema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.model.PmdCnae;
import br.com.prefeitura.diadema.repository.CnaeRepository;


@Service
public class CnaeService {
	
	private CnaeRepository dao;

	@Autowired
	public CnaeService(CnaeRepository dao){
		this.dao = dao;
	}
	

	public PmdCnae consultarCnaePorCodigo(Integer codigo){
		return this.dao.consultarCnaePorNumero(codigo.toString());
	}
	
	public List<PmdCnae> listarCnaePorDescricao(String descricao){
		return this.dao.listarCnaePorDescricao(descricao);
	}
	
	
	
	
}
