package br.com.prefeitura.diadema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.enumerador.EnumSimNao;
import br.com.prefeitura.diadema.model.PmdLogs;
import br.com.prefeitura.diadema.repository.LogRepository;
import br.com.prefeitura.diadema.util.ConverterDtoJson;


@Service
public class LogsService {

	


	private LogRepository logRepository;




	@Autowired
	public LogsService(LogRepository logRepository){;
		this.logRepository = logRepository;
	}
	
	
	public PmdLogs falha(PmdLogs log, String erro){
		//return null;
		log.setIcSucesso(EnumSimNao.NAO);
		log.setMotivo(erro);
		return logRepository.save(log);
		
	}
	
	public PmdLogs infoJson(String metodos, Object parametro){
		
		//return null;
		PmdLogs log = new PmdLogs();
		log.setIcSucesso(EnumSimNao.SIM);
		
		String valor = ConverterDtoJson.json(parametro);
		log.setMetodo(metodos);
		log.setParametros(valor);
		System.out.println(valor);
		return logRepository.save(log);
		
	}
@Deprecated
	public PmdLogs info(String metodo,  Object... parametros) {
		PmdLogs log = new PmdLogs();
		log.setIcSucesso(EnumSimNao.SIM);
		
		String valor = "";
		for(Object o : parametros){
			if(o == null){
				valor += "nulo;";
			}else{
				valor += o.toString() +";";
			}
		}
		log.setMetodo(metodo);
		log.setParametros(valor);
		return logRepository.save(log);
		//return null;
	
	}

}
