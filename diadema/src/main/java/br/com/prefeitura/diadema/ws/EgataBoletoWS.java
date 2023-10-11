package br.com.prefeitura.diadema.ws;
/*
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.text.SimpleDateFormat;
import java.util.Date;
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.boleto.Boleto;
import br.com.prefeitura.diadema.boleto.Boletos;
import br.com.prefeitura.diadema.boleto.RetBoleto;
import br.com.prefeitura.diadema.boleto.bancos.Bradesco;
import br.com.prefeitura.diadema.boleto.exception.BoletoException;
import br.com.prefeitura.diadema.boleto.transformer.GeradorDeBoleto;
import br.com.prefeitura.diadema.dto.Cnae;
import br.com.prefeitura.diadema.dto.ComplementoAtividade;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomica;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomicaComplemento;
import br.com.prefeitura.diadema.dto.EnquadramentoISS;
import br.com.prefeitura.diadema.dto.EnquadramentoISSCodigoServico;
import br.com.prefeitura.diadema.dto.InscricaoMunicipal;
import br.com.prefeitura.diadema.dto.Logradouro;
import br.com.prefeitura.diadema.dto.Publicidades;
import br.com.prefeitura.diadema.dto.Socio;
import br.com.prefeitura.diadema.model.PmdBoleto;
import br.com.prefeitura.diadema.repository.BoletoRepository;
import br.com.prefeitura.diadema.util.ConverterDtoJson;
import br.com.prefeitura.diadema.util.ParseInscricaoEgata;
import br.com.prefeitura.diadema.ws.abaco.hmg.WsBuscaDadosBoletoTaxasDiversa;
import br.com.prefeitura.diadema.ws.abaco.hmg.WsBuscaDadosBoletoTaxasDiversaExecute;
import br.com.prefeitura.diadema.ws.abaco.hmg.WsBuscaDadosBoletoTaxasDiversaExecuteResponse;
import br.com.prefeitura.diadema.ws.abaco.hmg.WsBuscaDadosBoletoTaxasDiversaSoapPort;
import br.com.prefeitura.diadema.ws.abaco.hmg.inscricao.WsConsultarExistenciaDaEmpresa;
import br.com.prefeitura.diadema.ws.abaco.hmg.inscricao.WsConsultarExistenciaDaEmpresaExecute;
import br.com.prefeitura.diadema.ws.abaco.hmg.inscricao.WsConsultarExistenciaDaEmpresaExecuteResponse;
import br.com.prefeitura.diadema.ws.abaco.hmg.inscricao.WsConsultarExistenciaDaEmpresaSoapPort;
import br.com.prefeitura.diadema.ws.egata.RetornoWSRetornoWSItem;
import br.com.prefeitura.diadema.ws.egata.SdtBairroLogradourosSdtBairroLogradouroItem;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresa;
import br.com.prefeitura.diadema.ws.egata.SdtLancarTaxasDiversas;
import br.com.prefeitura.diadema.ws.egata.SdtLancarTaxasDiversas.Taxas;
import br.com.prefeitura.diadema.ws.egata.SdtLancarTaxasDiversasTaxasItem;
import br.com.prefeitura.diadema.ws.egata.WSEnviarDadosEmpresa;
import br.com.prefeitura.diadema.ws.egata.WSEnviarDadosEmpresaExecute;
import br.com.prefeitura.diadema.ws.egata.WSEnviarDadosEmpresaExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WSEnviarDadosEmpresaSoapPort;
import br.com.prefeitura.diadema.ws.egata.WsBuscaDadosBoletoTaxasDiversas;
import br.com.prefeitura.diadema.ws.egata.WsBuscaDadosBoletoTaxasDiversasExecute;
import br.com.prefeitura.diadema.ws.egata.WsBuscaDadosBoletoTaxasDiversasExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsBuscaDadosBoletoTaxasDiversasSoapPort;
import br.com.prefeitura.diadema.ws.egata.WsLancarTaxasDiversas;
import br.com.prefeitura.diadema.ws.egata.WsLancarTaxasDiversasExecute;
import br.com.prefeitura.diadema.ws.egata.WsLancarTaxasDiversasExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsLancarTaxasDiversasSoapPort;
import br.com.prefeitura.diadema.ws.egata.Wsbuscabairrologradouro;
import br.com.prefeitura.diadema.ws.egata.WsbuscabairrologradouroExecute;
import br.com.prefeitura.diadema.ws.egata.WsbuscabairrologradouroExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsbuscabairrologradouroSoapPort;
import br.com.prefeitura.diadema.ws.egata.Wsconsultaexistenciaempresa;
import br.com.prefeitura.diadema.ws.egata.WsconsultaexistenciaempresaExecute;
import br.com.prefeitura.diadema.ws.egata.WsconsultaexistenciaempresaExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsconsultaexistenciaempresaSoapPort;
import br.com.prefeitura.diadema.ws.egata.Wsverificainscricaoimobiliaria;
import br.com.prefeitura.diadema.ws.egata.WsverificainscricaoimobiliariaExecute;
import br.com.prefeitura.diadema.ws.egata.WsverificainscricaoimobiliariaExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsverificainscricaoimobiliariaSoapPort;





@Service
public class EgataBoletoWS {
	
	private BoletoRepository dao;
	private final String CAMINHO_ARQUIVO = System.getProperty ("java.io.tmpdir");
	
	
	public EgataBoletoWS(BoletoRepository dao){
		this.dao = dao;
	}
	
	/**
	 * Consulta a situação do boleto pelo numero do processo
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
		
		PmdBoleto boletoSituacao = localizarBoleto(boleto.getNrProcessoBoleto());
		boleto.setDsBoleto(boletoSituacao.getDsBoleto());
		boleto.setDsSituacao(boletoSituacao.getDsSituacao());	
		boleto.setDtAtualizacao(new Date());
		dao.save(boleto);
		return boleto;
	}
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Lancamento de Taxa
	 * @param codigoTaxa
	 * @param valorTaxa
	 * @param quantidadeTaxa
	 * @param tipoContribuinte
	 * @param inscricao
	 * @param observacao
	 * @return
	 * @throws Exception
	 */
	private WsLancarTaxasDiversasExecuteResponse lancarTaxa(Integer codigoTaxa, Double valorTaxa, Integer quantidadeTaxa, Integer tipoContribuinte, Long inscricao, String observacao ) throws Exception{
		WsLancarTaxasDiversas ws = new WsLancarTaxasDiversas();
		WsLancarTaxasDiversasSoapPort port = ws.getWsLancarTaxasDiversasSoapPort();

		
		//------------------------------------   PARAMETROS
		SdtLancarTaxasDiversas sdtLancarTaxasDiversas = new SdtLancarTaxasDiversas();
		sdtLancarTaxasDiversas.setTipoContribuinte(tipoContribuinte.byteValue());
		sdtLancarTaxasDiversas.setInscricao(inscricao);
		sdtLancarTaxasDiversas.setCodigoSetor(0);
		sdtLancarTaxasDiversas.setCodigoQuadra("0");
		sdtLancarTaxasDiversas.setCodigoLote("0");
		sdtLancarTaxasDiversas.setObservacao(observacao);
		sdtLancarTaxasDiversas.setValorTaxaAdministrativa(valorTaxa);
		
		SdtLancarTaxasDiversasTaxasItem lancarTaxasDiversasTaxasItem = new SdtLancarTaxasDiversasTaxasItem();
		lancarTaxasDiversasTaxasItem.setCodigoTaxa(codigoTaxa.shortValue());
		lancarTaxasDiversasTaxasItem.setQuantidadeTaxa(quantidadeTaxa);
		//lancarTaxasDiversasTaxasItem.setValorTaxa(valorTaxa);
		
		//ArrayOfSdtLancarTaxasDiversasTaxasItem taxas = new ArrayOfSdtLancarTaxasDiversasTaxasItem();		
		//taxas.getSdtLancarTaxasDiversasTaxasItem().add(lancarTaxasDiversasTaxasItem);
				
		Taxas taxas = new Taxas();
		taxas.getTaxasItem().add(lancarTaxasDiversasTaxasItem);		
		sdtLancarTaxasDiversas.setTaxas(taxas );
		
		//-----------------------------------------------------------------
		
		
		WsLancarTaxasDiversasExecute parameters = new WsLancarTaxasDiversasExecute();		
		parameters.setSdtlancartaxasdiversas(sdtLancarTaxasDiversas);
		
		WsLancarTaxasDiversasExecuteResponse retornoBoleto = port.execute(parameters);
		

		if (retornoBoleto == null || retornoBoleto.getSdtboletotaxasdiversas() == null) {
			throw new Exception("Boleto não lançado");
		}

		if (retornoBoleto.getSdtboletotaxasdiversas().getValoraPagar() == 0.0D) {
			if ((retornoBoleto.getRetornows() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem().size() > 0)) {
				String ret = "";
				
				for (br.com.prefeitura.diadema.ws.egata.RetornoWSRetornoWSItem retorno :retornoBoleto.getRetornows().getRetornoWSRetornoWSItem()) {
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
			// criar uma boleto novo aqui
			
			/// Caso exista o boleto o sistema apenas ira realizar a consulta do boleto e devolver para o usuario
			Boletos boletos = realizarChamada(existeBoleto.getNrProcessoBoleto());
			ConcurrentHashMap<String, Object> parametros = adicionarParametros(boletos);
			RetBoleto ret = gerarBoleto(Long.parseLong(inscricao+ "" + codigoTaxa) , boletos, parametros);
			ret.setResultado("Boleto duplicado");
			ret.setSucesso(true);
			//ret.setArquivo(null);
			ret.setNumeroProcesso(existeBoleto.getNrProcessoBoleto().toString());
			
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
	
	
	private Boletos lancarBoleto(Integer codigoTaxa, 
			Double valorTaxa, 
			Integer quantidadeTaxa, 
			Integer tipoContribuinte, 
			Long inscricao, 
			String observacao) throws Exception{
		
		Boletos boletos = null;
		AbacoLancamentoHomologacaoWs ws = new AbacoLancamentoHomologacaoWs();
		boletos =  ws.executarHmg(codigoTaxa, valorTaxa, quantidadeTaxa, tipoContribuinte, inscricao, observacao);
		return boletos;
	}

	
	
	
	
	
	private Boletos realizarChamada(Long nrTaxaDiversaProcesso) throws Exception{
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse ws = buscarBoleto(nrTaxaDiversaProcesso);
		
		ConversorResponse resposta = new ConversorResponse(ws);
		Boletos boleto = resposta.getWSBoleto();
		
		return boleto;
	}
	
	private WsBuscaDadosBoletoTaxasDiversasExecuteResponse buscarBoleto(Long nrTaxaDiversaProcesso) throws Exception {

		WsBuscaDadosBoletoTaxasDiversasExecute paramsWSBoleto = new WsBuscaDadosBoletoTaxasDiversasExecute();
		paramsWSBoleto.setProcesso(nrTaxaDiversaProcesso.intValue());

		WsBuscaDadosBoletoTaxasDiversas ws = new WsBuscaDadosBoletoTaxasDiversas();
		WsBuscaDadosBoletoTaxasDiversasSoapPort port = ws.getWsBuscaDadosBoletoTaxasDiversasSoapPort();
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse retornoBoleto = port.execute(paramsWSBoleto);

		if (retornoBoleto == null || retornoBoleto.getSdtboletotaxasdiversas() == null) {
			throw new Exception("Boleto Não encontrado");
		}

		if (retornoBoleto.getSdtboletotaxasdiversas().getValoraPagar() == 0.0D) {
			if ((retornoBoleto.getRetornows() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem().size() > 0)) {
				String ret = "";
				for (RetornoWSRetornoWSItem retorno : retornoBoleto.getRetornows().getRetornoWSRetornoWSItem()) {
					ret = ret + "\n Erro ao gerar o boleto: "
							+ retorno.getIdRetorno() + " - "
							+ retorno.getDesRetorno() + " - numero da taxa " + nrTaxaDiversaProcesso;
				}
				throw new BoletoException(ret);
			}
			throw new BoletoException("Retorno do WS boleto: null - Falha desconhecida");
		}
		
		return retornoBoleto;
	}
	
	
	 class ConversorResponse {
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse boletoResponse;
		Boletos boleto = new Boletos();

		public ConversorResponse(WsBuscaDadosBoletoTaxasDiversasExecuteResponse boletoResponse) {
			this.boletoResponse = boletoResponse;
		}

		public Boletos getWSBoleto() throws FileNotFoundException {
			Bradesco bancoBradesco = new Bradesco();

			this.boleto.setAceite(this.boletoResponse.getSdtboletotaxasdiversas().getAceite());
			this.boleto.setAgenciaBeneficiario(this.boletoResponse.getSdtboletotaxasdiversas().getAgencia());
			this.boleto.setCodigoBeneficiario(this.boletoResponse.getSdtboletotaxasdiversas().getCedente());
			this.boleto.setBanco(bancoBradesco);
			this.boleto.setCarteiraBeneficiario(this.boletoResponse
					.getSdtboletotaxasdiversas().getCarteira());
			this.boleto.setCip(this.boletoResponse.getSdtboletotaxasdiversas()
					.getCIP());
			this.boleto.setCorrecao(String.valueOf(this.boletoResponse
					.getSdtboletotaxasdiversas().getCorrecao()));
			this.boleto.setDamReferente(this.boletoResponse
					.getSdtboletotaxasdiversas().getDAMReferentea());
			this.boleto.setDataDocumento(converteData(this.boletoResponse
					.getSdtboletotaxasdiversas().getDataEmissao()));
			this.boleto.setDataProcessamento(converteData(this.boletoResponse
					.getSdtboletotaxasdiversas().getDataProcessamento()));
			this.boleto.setDataVencimento(converteData(this.boletoResponse
					.getSdtboletotaxasdiversas().getVencimento()));

			StringBuffer sb = new StringBuffer();
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas()
					.getDescricaoDAM1() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas()
					.getDescricaoDAM2() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas()
					.getDescricaoDAM3() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas()
					.getDescricaoDAM4() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas()
					.getDescricaoDAM5() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas()
					.getDescricaoDAM6());

			this.boleto.setDescricaoDAM(sb.toString());

			this.boleto.setDocumentoBeneficiario(this.boletoResponse
					.getSdtboletotaxasdiversas().getBeneficiarioCNPJ());
			this.boleto.setDocumentoPagador(this.boletoResponse
					.getSdtboletotaxasdiversas().getCpfCnpj());
			this.boleto.setEspecieMoeda(this.boletoResponse
					.getSdtboletotaxasdiversas().getMoeda());

			this.boleto.setCodigoEspecieMoeda("9");

			this.boleto.setInscricao(String.valueOf(this.boletoResponse
					.getSdtboletotaxasdiversas().getInscricao()));
			this.boleto.setInstrucao1(this.boletoResponse
					.getSdtboletotaxasdiversas().getMsgblt1());
			this.boleto.setInstrucao2(this.boletoResponse
					.getSdtboletotaxasdiversas().getMsgblt2());
			this.boleto.setInstrucao3(this.boletoResponse
					.getSdtboletotaxasdiversas().getMsgblt3());
			this.boleto.setInstrucao4(this.boletoResponse
					.getSdtboletotaxasdiversas().getMsgblt4());
			this.boleto.setInstrucao5(this.boletoResponse
					.getSdtboletotaxasdiversas().getMsgblt5());
			this.boleto.setLocaisPagamento(this.boletoResponse
					.getSdtboletotaxasdiversas().getLocalDePagamento());
			//this.boleto.setLogoPrefeitura(new FileInputStream(
			//		"/home/image/agiles-config/config/imgs/logo_pmd.jpg"));
			this.boleto.setMulta(String.valueOf(this.boletoResponse
					.getSdtboletotaxasdiversas().getMulta()));
			this.boleto.setNomeBeneficiario(this.boletoResponse
					.getSdtboletotaxasdiversas().getBeneficiario());
			this.boleto.setNomePagador(this.boletoResponse
					.getSdtboletotaxasdiversas().getContribuinte());
			this.boleto.setNossoNumero(this.boletoResponse
					.getSdtboletotaxasdiversas().getNossoNumero());
			this.boleto.setNossoNumeroDV(this.boletoResponse
					.getSdtboletotaxasdiversas().getNossoNumeroDV());
			this.boleto.setNumeroDocumento(this.boletoResponse
					.getSdtboletotaxasdiversas().getNossoNumero());
			this.boleto.setProcessoContribuinte(String
					.valueOf(this.boletoResponse.getSdtboletotaxasdiversas()
							.getProcesso()));
			this.boleto.setReferencia(this.boletoResponse
					.getSdtboletotaxasdiversas().getReferencia());
			this.boleto.setTipoInscricao(this.boletoResponse
					.getSdtboletotaxasdiversas().getTipoInscricao());
			this.boleto.setTsa(String.valueOf(this.boletoResponse
					.getSdtboletotaxasdiversas().getTSA()));
			this.boleto.setValorBoleto(String.valueOf(this.boletoResponse
					.getSdtboletotaxasdiversas().getValoraPagar()));

			return this.boleto;
		}

		

	  private Date converteData(XMLGregorianCalendar dateCalendar)
	  {
	    if (dateCalendar == null) {
	      return null;
	    }
	    return dateCalendar.toGregorianCalendar().getTime();
	  }
	  	 
	}


	
	 
	 
	 //////---------------------------- PRIVATE ----------------------------------------
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
	
	
	private PmdBoleto localizarBoleto(Long nrBoleto) throws Exception{
		
		WsBuscaDadosBoletoTaxasDiversasExecute  paramsWSBoleto = new WsBuscaDadosBoletoTaxasDiversasExecute();
		paramsWSBoleto.setProcesso(nrBoleto.intValue());
		
		WsBuscaDadosBoletoTaxasDiversas ws = new WsBuscaDadosBoletoTaxasDiversas();
		WsBuscaDadosBoletoTaxasDiversasSoapPort port = ws.getWsBuscaDadosBoletoTaxasDiversasSoapPort();
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse retornoBoleto = port.execute(paramsWSBoleto);

		if (retornoBoleto == null || retornoBoleto.getSdtboletotaxasdiversas() == null) {
			throw new Exception("Boleto Não encontrado");
		}
		
		
		PmdBoleto pmd = new PmdBoleto();
		

		if (retornoBoleto.getSdtboletotaxasdiversas().getValoraPagar() == 0.0D) {
			if ((retornoBoleto.getRetornows() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem().size() > 0)) {
				String ret = "";
				for (RetornoWSRetornoWSItem retorno : retornoBoleto.getRetornows().getRetornoWSRetornoWSItem()) {					
					pmd.setCdSituacao((int) retorno.getIdRetorno());
					pmd.setDsSituacao(retorno.getDesRetorno());
					
					if("Erro: Taxas diversas informada inválida!".equals(retorno.getDesRetorno())){
						pmd.setDsBoleto("BOLETO_INVALIDO");
					}
					
					if(retorno.getDesRetorno().contains("Taxas diversas com validade vencida!")){
						pmd.setDsBoleto("BOLETO_VENCIDO");
					}
					
					
					if(retorno.getDesRetorno().contains("Erro: Taxas diversas foi paga")){
						pmd.setDsBoleto("BOLETO_PAGO");
						
					}
					
					
					if(retorno.getDesRetorno().contains("Consulta efetuada com sucesso!")){
						pmd.setDsBoleto("BOLETO_EM_ANDAMENTO");
					}
				}
			}
		}else{
			for (RetornoWSRetornoWSItem retorno : retornoBoleto.getRetornows().getRetornoWSRetornoWSItem()) {					
				pmd.setCdSituacao((int) retorno.getIdRetorno());
				pmd.setDsSituacao(retorno.getDesRetorno());
				if(retorno.getDesRetorno().contains("Erro: Taxas diversas foi paga")){
					pmd.setDsBoleto("BOLETO_PAGO");
					
				}
				
				
				if(retorno.getDesRetorno().contains("Consulta efetuada com sucesso!")){
					pmd.setDsBoleto("BOLETO_EM_ANDAMENTO");
				}
				
				
				if("Erro: Taxas diversas informada inválida!".equals(retorno.getDesRetorno())){
					pmd.setDsBoleto("BOLETO_INVALIDO");
				}
				
				if(retorno.getDesRetorno().contains("Taxas diversas com validade vencida!")){
					pmd.setDsBoleto("BOLETO_VENCIDO");
				}
			}
		}
		
		return pmd;
	}
	
}
