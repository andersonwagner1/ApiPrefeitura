package br.com.prefeitura.diadema.service;

import java.io.File;
import java.util.Date;
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
import br.com.prefeitura.diadema.ws.AbacoWs.ConversorResponse;
import br.com.prefeitura.diadema.ws.abaco.WsBuscaDadosBoletoTaxasDiversaExecuteResponse;


@Service
public class BoletoHmgService {
	private final String CAMINHO_ARQUIVO = System.getProperty ("java.io.tmpdir");
	
	private BoletoRepository dao;
	
	
	

	@Autowired
	public BoletoHmgService(BoletoRepository dao){
		this.dao = dao;
	}
	
	/**
	 * Consultar o boleto
	 * @param numerProcesso
	 * @param orgao
	 * @param ano
	 * @return
	 * @throws Exception 
	 */
	public PmdBoleto consultarSituacaoBoletoPorNumeroProtocolo(Long numerProcesso, String orgao, Integer ano) throws Exception{
		PmdBoleto boleto = consultaBoletoPorNumeroProcessoEletronico(numerProcesso, orgao,ano);
		
		if(boleto == null){
			boleto = new PmdBoleto();
			boleto.setDsBoleto("BOLETO_INVALIDO");
			boleto.setDsOrgao(orgao);
			boleto.setNrAno(ano);
			boleto.setNrProcesso(numerProcesso);
			boleto.setDtAtualizacao(new Date());
			boleto = dao.save(boleto);
			return boleto;
		}
		
		if(boleto.getCdSituacao() == -1 ){
			return boleto;
		}
		
		PmdBoleto boletoSituacao = consultarBoletoHomologacao(boleto.getNrProcessoBoleto());
		boleto.setDsBoleto(boletoSituacao.getDsBoleto());
		boleto.setDsSituacao(boletoSituacao.getDsSituacao());	
		boleto.setDtAtualizacao(new Date());
		dao.save(boleto);
		return boleto;
	}
	
	
	/**
	 * 
	 * @param orgao
	 * @param numeroProcesso
	 * @param ano
	 * @param codigoTaxa
	 * @param valorTaxa
	 * @param quantidadeTaxa
	 * @param tipoContribuinte
	 * @param inscricao
	 * @param observacao
	 * @return
	 * @throws Exception
	 */
	public RetBoleto lancarTaxaHomologacao(String orgao, 
			Long numeroProcesso, 
			Integer ano, 
			Integer codigoTaxa, 
			Double valorTaxa, 
			Integer quantidadeTaxa, 
			Integer tipoContribuinte, 
			Long inscricao, 
			String observacao) throws Exception {
		
		
		//verificar se existe algum protocolo ja aberto
		PmdBoleto existeBoleto = dao.verificarSeExisteBoletoCadastradoPorNumeroProtocolo(orgao, ano, numeroProcesso);
		if(existeBoleto != null){
			RetBoleto ret = new RetBoleto();
			ret.setResultado("SUCESSO - Boleto esta duplicado para este numero de processo");
			ret.setSucesso(true);
			ret.setArquivo(null);
			ret.setNumeroProcesso(existeBoleto.getNrProcessoBoleto().toString());			
			return ret;
		}
		
		
		
		
		//consultaBoletoPorNumeroProcessoEletronico(numeroProcesso, orgao, ano);
		
		Boletos boletos = lancarBoleto(codigoTaxa, valorTaxa, quantidadeTaxa, tipoContribuinte, inscricao, observacao);
		ConcurrentHashMap<String, Object> parametros = adicionarParametros(boletos);
		RetBoleto ret = gerarBoleto(Long.parseLong(inscricao+ "" + codigoTaxa) , boletos, parametros);
		
		PmdBoleto boleto = new PmdBoleto();
		boleto.setCdSituacao(0);		
		boleto.setDsBoleto("BOLETO_EM_ANDAMENTO");
		boleto.setDsOrgao(orgao);
		boleto.setDsSituacao("boleto em andamento");
		boleto.setNrAno(ano);
		boleto.setNrProcesso(numeroProcesso);
		boleto.setDtVencimento(boletos.getDataVencimento());		
		boleto.setNrProcessoBoleto(Long.parseLong(ret.getNumeroProcesso()));
		
		dao.save(boleto);
		
		return ret;
	}
	
	
	private Boletos lancarBoleto(Integer codigoTaxa, 
			Double valorTaxa, 
			Integer quantidadeTaxa, 
			Integer tipoContribuinte, 
			Long inscricao, 
			String observacao) throws Exception{
		
		Boletos boletos = null;
		AbacoLancamentoHomologacaoWs ws = new AbacoLancamentoHomologacaoWs();
		boletos = ws.executarHmg(codigoTaxa, valorTaxa, quantidadeTaxa, tipoContribuinte, inscricao, observacao);
		return boletos;
	}
	
	
	private RetBoleto gerarBoleto(Long numeroProcesso, Boletos boletos,	ConcurrentHashMap<String, Object> parametros) throws Exception{

		Boleto boletoStella = boletos.toStellaBoleto();
		GeradorDeBoleto gerador = new GeradorDeBoleto(parametros, boletoStella);
		String caminho = CAMINHO_ARQUIVO + File.separator +  numeroProcesso + ".pdf";
	//	caminho = caminho.replace(":", "/");
//		caminho = caminho.replace(";", "");

		File pdf = new File(caminho); //desativadro o agerar arquivo no servidor, pois não é necessario
		gerador.geraPDF(pdf);
		byte[] arquivo = gerador.geraPDF();

		RetBoleto ret = new RetBoleto();
		ret.setResultado("SUCESSO");
		ret.setSucesso(true);
		//ret.setCaminhoArquivo(caminho);
		ret.setArquivo(arquivo);
		ret.setNumeroProcesso(boletos.getProcessoContribuinte());
		return ret;

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
	
	
	
	private PmdBoleto consultaBoletoPorNumeroProcessoEletronico(Long numerProcesso, String orgao, Integer ano) throws Exception{		
		List<PmdBoleto> boleto = dao.consultarBoletoPorNumeroProcesso(orgao, ano, numerProcesso);	
		if(boleto.size() == 0){
			PmdBoleto p = new PmdBoleto();
			p.setCdSituacao(-1);
			p.setDsBoleto("BOLETO_INVALIDO");
			p.setDsSituacao("Não foi encontrado boleto para este numero de protocolo " + orgao + " " + numerProcesso + "/" + ano);
			
			
			throw new Exception(p.getDsSituacao());
		}
		return boleto.get(0);
	}
	
	
	private PmdBoleto consultarBoletoHomologacao(Long numeroProcesso)  {
		try {
			AbacoHomologacaoWs ws = new AbacoHomologacaoWs();
			return ws.localizarBoleto(numeroProcesso);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
	
}
