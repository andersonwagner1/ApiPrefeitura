package br.com.prefeitura.diadema.service;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.boleto.Boleto;
import br.com.prefeitura.diadema.boleto.Boletos;
import br.com.prefeitura.diadema.boleto.RetBoleto;
import br.com.prefeitura.diadema.boleto.transformer.GeradorDeBoleto;
import br.com.prefeitura.diadema.ws.AbacoHomologacaoWs;
import br.com.prefeitura.diadema.ws.AbacoWs;


@Service
public class BoletoService {
	
	
	private final String CAMINHO_ARQUIVO = System.getProperty ("java.io.tmpdir");

	@Autowired
	public BoletoService(){
	}
	
	private Boletos executarWebServiceHmg(Long numeroProcesso) throws Exception {
		Boletos boletos = null;
		AbacoHomologacaoWs ws = new AbacoHomologacaoWs();
		boletos = ws.realizarChamada(numeroProcesso);
		return boletos;
	}
	
	private Boletos executarWebService(Long numeroProcesso) throws Exception {
		Boletos boletos = null;
		AbacoWs ws = new AbacoWs();
		boletos = ws.realizarChamada(numeroProcesso);
		return boletos;
	}
	
	private ConcurrentHashMap<String, Object> adicionarParametros(Boletos boletos){
		ConcurrentHashMap<String, Object> parametros = new ConcurrentHashMap();
	    if (boletos.getDescricaoDAM() != null) {
	      parametros.put("DESCRICAO_DAM", boletos.getDescricaoDAM());
	    }
	    if (boletos.getLogoPrefeitura() != null) {
	      parametros.put("LOGO_PREFEITURA", boletos.getLogoPrefeitura());
	    }
	    if (boletos.getProcessoContribuinte() != null) {
	      parametros.put("PROCESSO_CONTRIBUINTE", boletos.getProcessoContribuinte());
	    }
	    if (boletos.getDamReferente() != null) {
	      parametros.put("DAM_REFERENTE", boletos.getDamReferente());
	    }
	    if (boletos.getReferencia() != null) {
	      parametros.put("REFERENCIA", boletos.getReferencia());
	    }
	    if (boletos.getCodigoContribuinte() != null) {
	      parametros.put("CODIGO_CONTRIBUINTE", boletos.getCodigoContribuinte());
	    }
	    if (boletos.getCodigoUsuario() != null) {
	      parametros.put("CODIGO_USUARIO", boletos.getCodigoUsuario());
	    }
	    if (boletos.getNomeUsuario() != null) {
	      parametros.put("NOME_USUARIO", boletos.getNomeUsuario());
	    }
	    if (boletos.getDocumentoUsuario() != null) {
	      parametros.put("DOCUMENTO_USUARIO", boletos.getDocumentoUsuario());
	    }
	    if (boletos.getInscricao() != null) {
	      parametros.put("INSCRICAO", boletos.getInscricao());
	    }
	    if (boletos.getTipoInscricao() != null) {
	      parametros.put("TIPO_INSCRICAO", boletos.getTipoInscricao());
	    }
	    if (boletos.getCorrecao() != null) {
	      parametros.put("CORRECAO", boletos.getCorrecao());
	    }
	    if (boletos.getCip() != null) {
	      parametros.put("CIP", boletos.getCip());
	    }
	    
	    return parametros;
	}
	
	
	private RetBoleto gerarBoleto(Long numeroProcesso, Boletos boletos,	ConcurrentHashMap<String, Object> parametros) throws Exception{

		Boleto boletoStella = boletos.toStellaBoleto();
		GeradorDeBoleto gerador = new GeradorDeBoleto(parametros, boletoStella);
		String caminho = CAMINHO_ARQUIVO + File.separator +  numeroProcesso + ".pdf";
	//	caminho = caminho.replace(":", "/");
//		caminho = caminho.replace(";", "");

		File pdf = new File(caminho);
		gerador.geraPDF(pdf);
		byte[] arquivo = gerador.geraPDF();

		RetBoleto ret = new RetBoleto();
		ret.setResultado("SUCESSO");
		ret.setSucesso(true);
		ret.setCaminhoArquivo(caminho);
		ret.setArquivo(arquivo);
		return ret;

	}
	
	
	public RetBoleto executarHmg(Long numeroProcesso)  {
		Boletos boletos;
		RetBoleto ret = null;
		try {
			boletos = executarWebServiceHmg(numeroProcesso);
			ConcurrentHashMap<String, Object> parametros = adicionarParametros(boletos);
			ret = gerarBoleto(numeroProcesso, boletos, parametros);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ret = new RetBoleto();
			ret.setSucesso(false);
			ret.setResultado(e.getMessage());
		}

		return ret;
		
	}

	public RetBoleto executar(Long numeroProcesso)  {
		Boletos boletos;
		RetBoleto ret = null;
		try {
			boletos = executarWebService(numeroProcesso);
			ConcurrentHashMap<String, Object> parametros = adicionarParametros(boletos);
			ret = gerarBoleto(numeroProcesso, boletos, parametros);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ret = new RetBoleto();
			ret.setSucesso(false);
			//ret.setResultado(e.getMessage());
			ret.setResultado(e.getMessage());
		}

		return ret;
		
	}
}
