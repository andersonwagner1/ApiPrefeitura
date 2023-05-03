package br.com.prefeitura.diadema.service;

import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.InscricaoMunicipal;
import br.com.prefeitura.diadema.util.ParseInscricao;
import br.com.prefeitura.diadema.ws.AbacoHomologacaoWs;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.RetornoWSRetornoWSItem;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.WsEnviarDadosEmpresa;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.WsEnviarDadosEmpresaExecute;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.WsEnviarDadosEmpresaExecuteResponse;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.WsEnviarDadosEmpresaSoapPort;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.SdtDadosCadastraisEmpresa;


@Service
public class InscricaoService {

	@Autowired
	public InscricaoService(){
	}
	
	
	public boolean existeInscricaoMobiliario(String tipo, Long numeroInscricao) throws Exception{
		AbacoHomologacaoWs ws = new AbacoHomologacaoWs();
		tipo = tipo.toLowerCase();
		if(tipo.equals("cnpj")){
			return ws.existeCnpj(numeroInscricao);			
		}
		
		if(tipo.equals("mobiliario")){
			return  ws.existeInscricaoMobiliario(numeroInscricao);
		}
		
		if(tipo.equals("imobiliario")){
			return  ws.existeInscricaoImobiliario(numeroInscricao);
		}
		
		//Quando nenhuma opção for selecionado o dados retoranr true
		return false;
	}


	public Integer enviarDadosAgata(InscricaoMunicipal inscricaoMunicipal) throws Exception {
		ParseInscricao parse = new ParseInscricao();
		
		WsEnviarDadosEmpresa wsEnviarDadosEmpresa = new WsEnviarDadosEmpresa();
        WsEnviarDadosEmpresaSoapPort port = wsEnviarDadosEmpresa.getWsEnviarDadosEmpresaSoapPort();
        
        WsEnviarDadosEmpresaExecute execute = new WsEnviarDadosEmpresaExecute();
        SdtDadosCadastraisEmpresa params = new SdtDadosCadastraisEmpresa();
        params = parse.parseAgata(inscricaoMunicipal);
        execute.setSdtDadoscadastraisempresas(params);

        try {
            WsEnviarDadosEmpresaExecuteResponse response = port.execute(execute);
            if (response != null) {
                if (response.getRetornows() != null) {
                    List<RetornoWSRetornoWSItem> respostas = response.getRetornows().getRetornoWSRetornoWSItem();
                    for (RetornoWSRetornoWSItem item : respostas) {
                        if (item.getIdRetorno() != 0) {
                            throw new Exception("Não foi possível enviar dados ao àgata: " + item.getDesRetorno());
                        } else {
                            break;
                        }
                    }
                }
            } else {
                throw new Exception("Não foi possível enviar dados ao àgata: Não houve resposta para a chamada do Webservice");
            }
        } catch (Exception e) {
            throw new Exception("Não é foi possivel enviar dados para o agata: " + e.toString());
        }
        return 1;
		
		//return sInscricao;
	}

}
