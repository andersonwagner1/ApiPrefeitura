package br.com.prefeitura.diadema.ws;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.boleto.Boleto;
import br.com.prefeitura.diadema.boleto.Boletos;
import br.com.prefeitura.diadema.boleto.RetBoleto;
import br.com.prefeitura.diadema.boleto.exception.BoletoException;
import br.com.prefeitura.diadema.boleto.transformer.GeradorDeBoleto;
import br.com.prefeitura.diadema.dto.Taxa;
import br.com.prefeitura.diadema.dto.TaxaDiversas;
import br.com.prefeitura.diadema.model.PmdBoleto;
import br.com.prefeitura.diadema.repository.BoletoRepository;
import br.com.prefeitura.diadema.ws.egata.RetornoWSRetornoWSItem;
import br.com.prefeitura.diadema.ws.egata.SdtLancarTaxasDiversas;
import br.com.prefeitura.diadema.ws.egata.SdtLancarTaxasDiversas.Taxas;
import br.com.prefeitura.diadema.ws.egata.SdtLancarTaxasDiversasTaxasItem;
import br.com.prefeitura.diadema.ws.egata.WsBuscaDadosBoletoTaxasDiversas;
import br.com.prefeitura.diadema.ws.egata.WsBuscaDadosBoletoTaxasDiversasExecute;
import br.com.prefeitura.diadema.ws.egata.WsBuscaDadosBoletoTaxasDiversasExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsBuscaDadosBoletoTaxasDiversasSoapPort;
import br.com.prefeitura.diadema.ws.egata.WsLancarTaxasDiversas;
import br.com.prefeitura.diadema.ws.egata.WsLancarTaxasDiversasExecute;
import br.com.prefeitura.diadema.ws.egata.WsLancarTaxasDiversasExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsLancarTaxasDiversasSoapPort;
import br.com.prefeitura.diadema.ws.egata.Wsregistroboleto;
import br.com.prefeitura.diadema.ws.egata.WsregistroboletoExecute;
import br.com.prefeitura.diadema.ws.egata.WsregistroboletoExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsregistroboletoSoapPort;





@Service
public class EgataBoletoTesteWS {
	
	private BoletoRepository dao;
//	private final String CAMINHO_ARQUIVO = System.getProperty ("java.io.tmpdir");
	
	public EgataBoletoTesteWS(BoletoRepository dao){
		this.dao = dao;
	}
	
	
	public PmdBoleto consultarBoletoPorNumeroProcesso(Long numeroProcesso) throws Exception{
		// verificar se o processo existe
		PmdBoleto pmdBoleto = consultaBoletoPorNumeroProcessoEletronico(numeroProcesso);
		
		//boleto não encontrado não é necessario pois o metodo ja tem essa opção
		if(pmdBoleto == null){
			throw new Exception("Boleto Não encontrado");
		}
		
		//Buscar informações na web
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse ws = buscarDadosBoletoTaxasDiversasPeloNumeroProcessoAgata(pmdBoleto.getNrProcessoBoleto());
		PmdBoleto auxBoleto = verificarQualSituacaoEstaTaxaDiversasAgata(ws);
		
		//Atualizar a tabela
		pmdBoleto = atualizarLogBoletoPmd(pmdBoleto, auxBoleto);
		return pmdBoleto;
	}
	
	
	public PmdBoleto consultarBoletoPorNumeroProcessoBoleto(Long numerProcesso, String orgao, Integer ano) throws Exception{
		// verificar se o processo existe
		PmdBoleto pmdBoleto = consultaBoletoPorNumeroProcessoEletronico(numerProcesso, orgao, ano);
		
		//boleto não encontrado não é necessario pois o metodo ja tem essa opção
		if(pmdBoleto == null){
			throw new Exception("Boleto Não encontrado");
		}
		
		//Buscar informações na web
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse ws = buscarDadosBoletoTaxasDiversasPeloNumeroProcessoAgata(pmdBoleto.getNrProcessoBoleto());
		PmdBoleto auxBoleto = verificarQualSituacaoEstaTaxaDiversasAgata(ws);
		
		//Atualizar a tabela
		pmdBoleto = atualizarLogBoletoPmd(pmdBoleto, auxBoleto);
		return pmdBoleto;
	}
	
	
	public PmdBoleto consultarBoletoPorNumeroProcesso(Long numerProcesso, String orgao, Integer ano) throws Exception{
		// verificar se o processo existe
		PmdBoleto pmdBoleto = consultaBoletoPorNumeroProcessoEletronico(numerProcesso, orgao, ano);
		
		//boleto não encontrado não é necessario pois o metodo ja tem essa opção
		if(pmdBoleto == null){
			throw new Exception("Boleto Não encontrado");
		}
		
		//Buscar informações na web
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse ws = buscarDadosBoletoTaxasDiversasPeloNumeroProcessoAgata(pmdBoleto.getNrProcessoBoleto());
		PmdBoleto auxBoleto = verificarQualSituacaoEstaTaxaDiversasAgata(ws);
		
		//Atualizar a tabela
		pmdBoleto = atualizarLogBoletoPmd(pmdBoleto, auxBoleto);
		return pmdBoleto;
	}
	
	
	public RetBoleto gerarBoletoNumeroProcesso(Long numeroProcessoBoletoAgata) throws Exception {
		PmdBoleto pmdBoleto = consultaBoletoPorNumeroProcessoEletronico(numeroProcessoBoletoAgata);
		
		//boleto não encontrado não é necessario pois o metodo ja tem essa opção
		if(pmdBoleto == null){
			RetBoleto fileBoelto = new RetBoleto();
			fileBoelto.setResultado("Numero do boleto não encontrado" + numeroProcessoBoletoAgata);
			return fileBoelto;
		 }
		
				//Buscar informações na web
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse ws = buscarDadosBoletoTaxasDiversasPeloNumeroProcessoAgata(pmdBoleto.getNrProcessoBoleto());
		PmdBoleto auxBoleto = verificarQualSituacaoEstaTaxaDiversasAgata(ws);
				
		//Atualizar a tabela
		pmdBoleto = atualizarLogBoletoPmd(pmdBoleto, auxBoleto);
		
		if(!pmdBoleto.getDsBoleto().equals("BOLETO_EM_ANDAMENTO")){
			RetBoleto fileBoelto = new RetBoleto();
			fileBoelto.setResultado("Boleto não pode ser gerado pois esta vencido ou ja esta pago [ " + pmdBoleto.getDsBoleto() + "]");
			return fileBoelto;
		}
				
				//converter para classe boleto
		Boletos  boletos = conveterResponseWsParaDtoBoleto(ws);
				 
				
				//tranformar em boleto
		ConcurrentHashMap<String, Object> parametros = adicionarParametros(boletos);
		RetBoleto ret = gerarBoletoModeloBradesco(numeroProcessoBoletoAgata, boletos,parametros);
		return ret;
	}
	
	public RetBoleto lancarTaxasDiversasParaAgata(TaxaDiversas taxasDiversas) throws Exception{
		//verificar se o processo existe
		PmdBoleto existeBoleto = dao.verificarSeExisteBoletoCadastradoPorNumeroProtocolo(
				taxasDiversas.getOrgao(), 
				taxasDiversas.getAno(),
				taxasDiversas.getNumeroProcesso());
		
		Long numeroProcessoBoletoAgata = null;
		String situacaoBoleto = null;
		
		//Verifica se não houve uma chamada duplicada no sistema do solar bpms, caso tenha boleto ja lancado o sistema apenas ira realizar a consulta
		if(existeBoleto == null){
			//lançar a taxa
			WsLancarTaxasDiversasExecuteResponse respostaWs = lancarTaxaParaAgata(taxasDiversas);

			//registrar o boleto
			boolean resultado = registrarBoletoAgata(taxasDiversas.getAno(), respostaWs.getSdtboletotaxasdiversas().getNossoNumero());

			//pesquisar o boleto ja cadastrado
			numeroProcessoBoletoAgata = respostaWs.getSdtboletotaxasdiversas().getProcesso();
			
			//atribuir a situação
			situacaoBoleto = resultado ? "sucesso" :"sucesso, mas não foi registrado";
			
		}else{
			//pesquisar o boleto ja cadastrado
			numeroProcessoBoletoAgata = existeBoleto.getNrProcessoBoleto();
			
			//atribuir a situação
			situacaoBoleto = "sucesso, mas a chamada foi duplicada";
		}
		
		//pesquisar na webservice
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse ws = buscarDadosBoletoTaxasDiversasPeloNumeroProcessoAgata(numeroProcessoBoletoAgata);
		
		//converter para classe boleto
		Boletos  boletos = conveterResponseWsParaDtoBoleto(ws);
		 
		//registrar no log		
		registrarNovaTaxaNoLog(taxasDiversas, boletos, situacaoBoleto);
		
		//tranformar em boleto
		ConcurrentHashMap<String, Object> parametros = adicionarParametros(boletos);
		RetBoleto ret = gerarBoletoModeloBradesco(numeroProcessoBoletoAgata, boletos,parametros);
		return ret;
	}
	
	
	//-------------------------------------------------------------------------------------------------------------------
	// 	PRIVATE
	//-------------------------------------------------------------------------------------------------------------------
	private Boletos conveterResponseWsParaDtoBoleto(WsBuscaDadosBoletoTaxasDiversasExecuteResponse ws) throws Exception{		
		ConverterWsParaBoletoDto resposta = new ConverterWsParaBoletoDto(ws);
		Boletos boleto = resposta.getWSBoleto();
		//ConverterDtoJson.mostarJson(ws);
		return boleto;
	}
	
	private void registrarNovaTaxaNoLog(TaxaDiversas taxasDiversas, Boletos boleto, String registrado){
		PmdBoleto boletot = new PmdBoleto();
		boletot.setCdSituacao(0);
		boletot.setDsBoleto("BOLETO_EM_ANDAMENTO");
		boletot.setDsOrgao(taxasDiversas.getOrgao());
		boletot.setDsSituacao(registrado);
		boletot.setNrAno(taxasDiversas.getAno());
		boletot.setNrProcesso(taxasDiversas.getNumeroProcesso());
		boletot.setDtVencimento(boleto.getDataVencimento());
		boletot.setNrProcessoBoleto(Long.parseLong(boleto.getProcessoContribuinte()));
		dao.save(boletot);
	}
	
	private WsLancarTaxasDiversasExecuteResponse lancarTaxaParaAgata(TaxaDiversas taxasDiversas ) throws Exception{
		SdtLancarTaxasDiversas sdtLancarTaxasDiversas = atribuirParametorsParaWebservice(taxasDiversas);
		
		WsLancarTaxasDiversas ws = new WsLancarTaxasDiversas();
		WsLancarTaxasDiversasSoapPort port = ws.getWsLancarTaxasDiversasSoapPort();
		
		WsLancarTaxasDiversasExecute parameters = new WsLancarTaxasDiversasExecute();		
		parameters.setSdtlancartaxasdiversas(sdtLancarTaxasDiversas);
		
		WsLancarTaxasDiversasExecuteResponse retornoBoleto = port.execute(parameters);

		if (retornoBoleto == null || retornoBoleto.getSdtboletotaxasdiversas() == null) {
			throw new Exception("Boleto não lançado");
		}

		if (retornoBoleto.getSdtboletotaxasdiversas().getValoraPagar() == 0.0D) {
			if ((retornoBoleto.getRetornows() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem().size() > 0)) {
				String ret = "";
				
				for (RetornoWSRetornoWSItem retorno :retornoBoleto.getRetornows().getRetornoWSRetornoWSItem()) {
					ret = ret + "\n Erro ao gerar o boleto: "
							+ retorno.getIdRetorno() + " - "
							+ retorno.getDesRetorno();
				}
				throw new BoletoException(ret);
			}
			throw new BoletoException("Retorno do WS boleto: null - Falha desconhecida");
		}	
		return retornoBoleto;
	}
	
	/**
	 * Realiza a consulta do banco de dados
	 * @param numerProcesso
	 * @param orgao
	 * @param ano
	 * @return
	 * @throws Exception retorna se não encontra o processo
	 */
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
	
	private PmdBoleto consultaBoletoPorNumeroProcessoEletronico(Long numerProcesso) throws Exception{		
		PmdBoleto boleto = dao.consultarBoletoPorNumeroBoleto(numerProcesso);	
		if(boleto == null){
			PmdBoleto p = new PmdBoleto();
			p.setCdSituacao(-1);
			p.setDsBoleto("BOLETO_INVALIDO");
			p.setDsSituacao("Não foi encontrado boleto para este numero de protocolo do boleto " + numerProcesso);			
			throw new Exception(p.getDsSituacao());
		}
		return boleto;
	}
	
	
	private WsBuscaDadosBoletoTaxasDiversasExecuteResponse buscarDadosBoletoTaxasDiversasPeloNumeroProcessoAgata(Long nrBoleto) throws Exception{
		WsBuscaDadosBoletoTaxasDiversasExecute paramsWSBoleto = new WsBuscaDadosBoletoTaxasDiversasExecute();
		paramsWSBoleto.setProcesso(nrBoleto);

		WsBuscaDadosBoletoTaxasDiversas ws = new WsBuscaDadosBoletoTaxasDiversas();
		WsBuscaDadosBoletoTaxasDiversasSoapPort port = ws.getWsBuscaDadosBoletoTaxasDiversasSoapPort();
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse retornoBoleto = port.execute(paramsWSBoleto);

		if (retornoBoleto == null || retornoBoleto.getSdtboletotaxasdiversas() == null) {
			throw new Exception("Boleto Não encontrado");
		}
		
		return retornoBoleto;
	}
	
	private SdtLancarTaxasDiversas atribuirParametorsParaWebservice(TaxaDiversas taxasDiversas) {
		// ------------------------------------ PARAMETROS
		SdtLancarTaxasDiversas sdtLancarTaxasDiversas = new SdtLancarTaxasDiversas();
		sdtLancarTaxasDiversas.setTipoContribuinte(taxasDiversas.getTipoContibuinte().byteValue());
		sdtLancarTaxasDiversas.setInscricao(taxasDiversas.getInscricao());
		sdtLancarTaxasDiversas.setCodigoSetor(0);
		sdtLancarTaxasDiversas.setCodigoQuadra("0");
		sdtLancarTaxasDiversas.setCodigoLote("0");
		sdtLancarTaxasDiversas.setObservacao(taxasDiversas.getObservacao());
		sdtLancarTaxasDiversas.setValorTaxaAdministrativa(taxasDiversas.getValorTaxaAdministrativa());

		Taxas taxas = new Taxas();
		for (Taxa ta : taxasDiversas.getTaxas()) {
			SdtLancarTaxasDiversasTaxasItem lancarTaxasDiversasTaxasItem = new SdtLancarTaxasDiversasTaxasItem();
			lancarTaxasDiversasTaxasItem.setCodigoTaxa(ta.getCodigoTaxa().shortValue());
			lancarTaxasDiversasTaxasItem.setQuantidadeTaxa(ta.getQuantidadeTaxa());
			taxas.getTaxasItem().add(lancarTaxasDiversasTaxasItem);
		}

		sdtLancarTaxasDiversas.setTaxas(taxas);
		return sdtLancarTaxasDiversas;
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
	
	private RetBoleto gerarBoletoModeloBradesco(Long numeroProcesso, Boletos boletos,	ConcurrentHashMap<String, Object> parametros) throws Exception{
		Boleto boletoStella = boletos.toStellaBoleto();
		GeradorDeBoleto gerador = new GeradorDeBoleto(parametros, boletoStella);
		//String caminho = CAMINHO_ARQUIVO + File.separator +  numeroProcesso + ".pdf";
	//	caminho = caminho.replace(":", "/");
//		caminho = caminho.replace(";", "");

		//File pdf = new File(caminho); //desativadro o agerar arquivo no servidor, pois não é necessario
		//gerador.geraPDF(pdf);
		
		byte[] arquivo = gerador.geraPDF();

		RetBoleto ret = new RetBoleto();
		ret.setResultado("SUCESSO");
		ret.setSucesso(true);
		//ret.setCaminhoArquivo(caminho);
		ret.setArquivo(arquivo);
		ret.setNumeroProcesso(boletos.getProcessoContribuinte());
		return ret;
	}
	
	private boolean registrarBoletoAgata(Integer ano, String numeroDam){
		WsregistroboletoExecute paramsWSBoleto = new WsregistroboletoExecute();
		paramsWSBoleto.setPrbid(ano);
		paramsWSBoleto.setSdtenvioregistroparm(numeroDam);
		
		try{
			Wsregistroboleto ws = new Wsregistroboleto();
			WsregistroboletoSoapPort port = ws.getWsregistroboletoSoapPort();
			WsregistroboletoExecuteResponse retornoBoleto = port.execute(paramsWSBoleto);
			System.out.println(retornoBoleto.getSdtretornoregistrostring());
		}catch(Exception e){			
			return false;
		}
		
		return true;
	}
		 

	private PmdBoleto atualizarLogBoletoPmd(PmdBoleto pmdBoleto, PmdBoleto aux){
		pmdBoleto.setDsBoleto(aux.getDsBoleto());
		pmdBoleto.setDsSituacao(aux.getDsSituacao());	
		pmdBoleto.setDtAtualizacao(new Date());
		return dao.save(pmdBoleto);		
	}
	
	private PmdBoleto verificarQualSituacaoEstaTaxaDiversasAgata(WsBuscaDadosBoletoTaxasDiversasExecuteResponse retornoBoleto){
		PmdBoleto pmd = new PmdBoleto();

		if (retornoBoleto.getSdtboletotaxasdiversas().getValoraPagar() == 0.0D) {
			if ((retornoBoleto.getRetornows() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem().size() > 0)) {				
				for (RetornoWSRetornoWSItem retorno : retornoBoleto.getRetornows().getRetornoWSRetornoWSItem()) {					
					pmd.setCdSituacao((int) retorno.getIdRetorno());
					pmd.setDsSituacao(retorno.getDesRetorno());
					pmd.setDsBoleto(trocarMensagemRetornoSituacaoBoletoWsParaSituacaoSolarBpm(retorno.getDesRetorno()));
				}
			}
		}else{
			for (RetornoWSRetornoWSItem retorno : retornoBoleto.getRetornows().getRetornoWSRetornoWSItem()) {					
				pmd.setCdSituacao((int) retorno.getIdRetorno());
				pmd.setDsSituacao(retorno.getDesRetorno());
				pmd.setDsBoleto(trocarMensagemRetornoSituacaoBoletoWsParaSituacaoSolarBpm(retorno.getDesRetorno()));
			}
		}
		return pmd;
	}
	
	private String trocarMensagemRetornoSituacaoBoletoWsParaSituacaoSolarBpm(String textoSituacao){
		if(textoSituacao.contains("Erro: Taxas diversas foi paga")){
			return ("BOLETO_PAGO");
		}
		
		if(textoSituacao.contains("Consulta efetuada com sucesso!")){
			return ("BOLETO_EM_ANDAMENTO");
		}
		
		if("Erro: Taxas diversas informada inválida!".equals(textoSituacao)){
			return("BOLETO_INVALIDO");
		}
		
		if(textoSituacao.contains("Erro: Taxas diversas com validade vencida!")){
			return("BOLETO_VENCIDO");
		}
		
		if(textoSituacao.contains("Taxas diversas com situação [C]")){
			return("BOLETO_CANCELADO");
		}
		
		return textoSituacao;
	}


	
}


