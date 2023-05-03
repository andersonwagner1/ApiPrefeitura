package br.com.prefeitura.diadema.service;

import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.boleto.Boleto;
import br.com.prefeitura.diadema.boleto.Boletos;
import br.com.prefeitura.diadema.boleto.RetBoleto;
import br.com.prefeitura.diadema.boleto.transformer.GeradorDeBoleto;
import br.com.prefeitura.diadema.model.PmdBoleto;
import br.com.prefeitura.diadema.repository.BoletoRepository;
import br.com.prefeitura.diadema.ws.AbacoHomologacaoWs;
import br.com.prefeitura.diadema.ws.AbacoLancamentoHomologacaoWs;
import br.com.prefeitura.diadema.ws.AbacoWs;

@Deprecated
@Service
public class BoletoService {
	
	private BoletoRepository dao;
	
	
	private final String CAMINHO_ARQUIVO = System.getProperty ("java.io.tmpdir");

	@Autowired
	public BoletoService(BoletoRepository dao){
		this.dao = dao;
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
	
	
	private Boletos executarLancamentoNotaHmgWebService(Integer codigoTaxa, Double valorTaxa, Integer quantidadeTaxa, Integer tipoContribuinte, Long inscricao, String observacao) throws Exception {
		Boletos boletos = null;
		AbacoLancamentoHomologacaoWs ws = new AbacoLancamentoHomologacaoWs();
		boletos = ws.executarHmg(codigoTaxa, valorTaxa, quantidadeTaxa, tipoContribuinte, inscricao, observacao);
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
		ret.setNumeroProcesso(boletos.getProcessoContribuinte());
		return ret;

	}
	
	@Deprecated
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

	
	
	
	
	@Deprecated
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
	
	public PmdBoleto consultarBoletoHomologacao(Long numeroProcesso)  {
		try {
			AbacoHomologacaoWs ws = new AbacoHomologacaoWs();
			return ws.localizarBoleto(numeroProcesso);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
	
	@Deprecated
	public RetBoleto consultarBoletoHmg(Long numeroProcesso)  {
		Boletos boletos;
		RetBoleto ret = null;
		try {
			boletos = executarWebServiceHmg(numeroProcesso);
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
	
	
	public PmdBoleto consultaBoletoPorNumeroProcessoEletronico(Long numerProcesso, String orgao, Integer ano){
		List<PmdBoleto> boletos = dao.consultarBoletoPorNumeroProcesso(orgao, ano, numerProcesso);
		
		if(boletos.size() == 0){
			PmdBoleto boleto = new PmdBoleto();
			boleto.setCdSituacao(0);
			boleto.setDsOrgao(orgao);
			boleto.setNrAno(ano);
			boleto.setNrProcesso(numerProcesso);
			boleto.setDsSituacao("Não foi encontrado boleto consultando processo  na tabela auxiliar");
			boleto.setDsBoleto("BOLETO_INVALIDO");
			return boleto;
		}
		
		return boletos.get(0);
	}
	
	public PmdBoleto salvarRegistro(String numerProcesso, String orgao, Integer ano, Integer numeroProcesso){
		PmdBoleto boleto = new PmdBoleto();
		boleto.setDsOrgao(orgao);
		boleto.setNrAno(ano);
		boleto.setNrProcesso(numeroProcesso.longValue());
		
		boleto.setCdSituacao(0);
		boleto.setDsBoleto("BOLETO_EM_ANDAMENTO");
		
		boleto.setDsSituacao("BOLETO_EM_ANDAMENTO");
		boleto.setNrProcessoBoleto(Long.parseLong(numerProcesso));
		return dao.save(boleto);
	}
	
	public RetBoleto executarLancamentoNotaHmg(Integer codigoTaxa, Double valorTaxa,Integer quantidadeTaxa, Integer tipoContribuinte, Long inscricao, String observacao)  {
		Boletos boletos;
		RetBoleto ret = null;
		try {			
			boletos = executarLancamentoNotaHmgWebService(codigoTaxa, valorTaxa, quantidadeTaxa, tipoContribuinte, inscricao, observacao);
			ConcurrentHashMap<String, Object> parametros = adicionarParametros(boletos);
			ret = gerarBoleto(Long.parseLong(inscricao+ "" + codigoTaxa) , boletos, parametros);
			
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

	public void salvarRegistro(PmdBoleto fileBoelto) {
		dao.save(fileBoelto);
	}
	
}
