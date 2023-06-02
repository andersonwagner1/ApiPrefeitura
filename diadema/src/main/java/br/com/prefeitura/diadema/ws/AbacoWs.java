package br.com.prefeitura.diadema.ws;
/*
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.text.SimpleDateFormat;
import java.util.Date;
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.boleto.Boleto;
import br.com.prefeitura.diadema.boleto.Boletos;
import br.com.prefeitura.diadema.boleto.bancos.Bradesco;
import br.com.prefeitura.diadema.boleto.exception.BoletoException;
import br.com.prefeitura.diadema.boleto.transformer.GeradorDeBoleto;
import br.com.prefeitura.diadema.model.PmdBoleto;
import br.com.prefeitura.diadema.ws.abaco.hmg.RetornoWSRetornoWSItem;
import br.com.prefeitura.diadema.ws.abaco.hmg.WsBuscaDadosBoletoTaxasDiversa;
import br.com.prefeitura.diadema.ws.abaco.hmg.WsBuscaDadosBoletoTaxasDiversaExecute;
import br.com.prefeitura.diadema.ws.abaco.hmg.WsBuscaDadosBoletoTaxasDiversaExecuteResponse;
import br.com.prefeitura.diadema.ws.abaco.hmg.WsBuscaDadosBoletoTaxasDiversaSoapPort;


@Service
public class AbacoWs {
	/**
	 * Metodo apenas para teste
	 * @param boletos
	 * @return
	 */
	private static ConcurrentHashMap<String, Object> adicionarParametros(Boletos boletos){
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
	
	
	 private static Date converteData(XMLGregorianCalendar dateCalendar)
	  {
	    if (dateCalendar == null) {
	      return null;
	    }
	    return dateCalendar.toGregorianCalendar().getTime();
	  }
	
	public  static void main(String args[]) throws Exception{
		
		
		
		AbacoWs w = new AbacoWs();
		//PmdBoleto pmd = w.localizarBoleto(2022008307L); // TAXA VENCIDA
		//PmdBoleto pmd = w.localizarBoleto(20220L); // BOLEOT INVALIDO
		WsBuscaDadosBoletoTaxasDiversaExecuteResponse boletoResponse = w.localizarBoletoTeste(2023093596L); // BOLEOT gerado
		
		
		Boletos boleto = new Boletos();
		Bradesco bancoBradesco = new Bradesco();
		
		boleto.setAceite(boletoResponse.getSdtboletotaxasdiversas().getAceite());
		boleto.setAgenciaBeneficiario(boletoResponse.getSdtboletotaxasdiversas().getAgencia());
		boleto.setCodigoBeneficiario(boletoResponse.getSdtboletotaxasdiversas().getCedente());
		boleto.setBanco(bancoBradesco);
		boleto.setCarteiraBeneficiario(boletoResponse.getSdtboletotaxasdiversas().getCarteira());
		boleto.setCip(boletoResponse.getSdtboletotaxasdiversas().getCIP());
		boleto.setCorrecao(String.valueOf(boletoResponse.getSdtboletotaxasdiversas().getCorrecao()));
		boleto.setDamReferente(boletoResponse.getSdtboletotaxasdiversas().getDAMReferentea());
		boleto.setDataDocumento(converteData(boletoResponse.getSdtboletotaxasdiversas().getDataEmissao()));
		boleto.setDataProcessamento(converteData(boletoResponse.getSdtboletotaxasdiversas().getDataProcessamento()));
		boleto.setDataVencimento(converteData(boletoResponse.getSdtboletotaxasdiversas().getVencimento()));

		StringBuffer sb = new StringBuffer();
		sb.append(boletoResponse.getSdtboletotaxasdiversas().getDescricaoDAM1() + "\n");
		sb.append(boletoResponse.getSdtboletotaxasdiversas().getDescricaoDAM2() + "\n");
		sb.append(boletoResponse.getSdtboletotaxasdiversas().getDescricaoDAM3() + "\n");
		sb.append(boletoResponse.getSdtboletotaxasdiversas().getDescricaoDAM4() + "\n");
		sb.append(boletoResponse.getSdtboletotaxasdiversas().getDescricaoDAM5() + "\n");
		sb.append(boletoResponse.getSdtboletotaxasdiversas().getDescricaoDAM6());

		boleto.setDescricaoDAM(sb.toString());

		boleto.setDocumentoBeneficiario(boletoResponse.getSdtboletotaxasdiversas().getBeneficiarioCNPJ());
		boleto.setDocumentoPagador(boletoResponse.getSdtboletotaxasdiversas().getCpfCnpj());
		boleto.setEspecieMoeda(boletoResponse.getSdtboletotaxasdiversas().getMoeda());

		boleto.setCodigoEspecieMoeda("9");

		boleto.setInscricao(String.valueOf(boletoResponse.getSdtboletotaxasdiversas().getInscricao()));
		boleto.setInstrucao1(boletoResponse.getSdtboletotaxasdiversas().getMsgblt1());
		boleto.setInstrucao2(boletoResponse.getSdtboletotaxasdiversas().getMsgblt2());
		boleto.setInstrucao3(boletoResponse.getSdtboletotaxasdiversas().getMsgblt3());
		boleto.setInstrucao4(boletoResponse.getSdtboletotaxasdiversas().getMsgblt4());
		boleto.setInstrucao5(boletoResponse.getSdtboletotaxasdiversas().getMsgblt5());
		boleto.setLocaisPagamento(boletoResponse.getSdtboletotaxasdiversas().getLocalDePagamento());
		//this.boleto.setLogoPrefeitura(new FileInputStream(
		//		"/home/image/agiles-config/config/imgs/logo_pmd.jpg"));
		boleto.setMulta(String.valueOf(boletoResponse
			.getSdtboletotaxasdiversas().getMulta()));
		boleto.setNomeBeneficiario(boletoResponse
				.getSdtboletotaxasdiversas().getBeneficiario());
		boleto.setNomePagador(boletoResponse
				.getSdtboletotaxasdiversas().getContribuinte());
		boleto.setNossoNumero(boletoResponse
				.getSdtboletotaxasdiversas().getNossoNumero());
		boleto.setNossoNumeroDV(boletoResponse
				.getSdtboletotaxasdiversas().getNossoNumeroDV());
		boleto.setNumeroDocumento(boletoResponse
				.getSdtboletotaxasdiversas().getNossoNumero());
		boleto.setProcessoContribuinte(String
				.valueOf(boletoResponse.getSdtboletotaxasdiversas()
						.getProcesso()));
		boleto.setReferencia(boletoResponse
				.getSdtboletotaxasdiversas().getReferencia());
		boleto.setTipoInscricao(boletoResponse
				.getSdtboletotaxasdiversas().getTipoInscricao());
		boleto.setTsa(String.valueOf(boletoResponse
				.getSdtboletotaxasdiversas().getTSA()));
		boleto.setValorBoleto(String.valueOf(boletoResponse
				.getSdtboletotaxasdiversas().getValoraPagar()));
		
		

		
		
		

			ConcurrentHashMap<String, Object> parametros = adicionarParametros(boleto);
			
			Boleto boletoStella = boleto.toStellaBoleto();
			/*boletoStella.comInstrucoes("Após o vencimento,",
					"pagável somente nas agência do Banco Bradesco,",
					"mediante juros de 0,033% ao dia, por dia de atraso,",
					"e multa de 10%",
					"BANCO: NÃO RECEBER 30 DIAS APÓS O VENCIMENTO");*/
			
			//boletoStella.comDescricao("Descrcaiasdfas");
			
			GeradorDeBoleto gerador = new GeradorDeBoleto(parametros, boletoStella);
			String caminho = "C:/Users/ANDERS~1.OLI/AppData/Local/Temp/numeroProcesso.pdf";
			//caminho = caminho.replace(":", "/");
		//	caminho = caminho.replace(";", "");

			File pdf = new File(caminho); //desativadro o agerar arquivo no servidor, pois não é necessario
			gerador.geraPDF(pdf);
			byte[] arquivo = gerador.geraPDF();
	System.out.println(caminho);
		
		
		
		
	}
	
	public WsBuscaDadosBoletoTaxasDiversaExecuteResponse localizarBoletoTeste(Long nrBoleto) throws Exception{
		WsBuscaDadosBoletoTaxasDiversaExecute paramsWSBoleto = new WsBuscaDadosBoletoTaxasDiversaExecute();
		paramsWSBoleto.setProcesso(nrBoleto.intValue());

		WsBuscaDadosBoletoTaxasDiversa ws = new WsBuscaDadosBoletoTaxasDiversa();
		WsBuscaDadosBoletoTaxasDiversaSoapPort port = ws.getWsBuscaDadosBoletoTaxasDiversaSoapPort();
		WsBuscaDadosBoletoTaxasDiversaExecuteResponse retornoBoleto = port.execute(paramsWSBoleto);

		if (retornoBoleto == null || retornoBoleto.getSdtboletotaxasdiversas() == null) {
			throw new Exception("Boleto Não encontrado");
		}
		return retornoBoleto;
	}
	
	
	
	
	public PmdBoleto localizarBoleto(Long nrBoleto) throws Exception{
		WsBuscaDadosBoletoTaxasDiversaExecute paramsWSBoleto = new WsBuscaDadosBoletoTaxasDiversaExecute();
		paramsWSBoleto.setProcesso(nrBoleto.intValue());

		WsBuscaDadosBoletoTaxasDiversa ws = new WsBuscaDadosBoletoTaxasDiversa();
		WsBuscaDadosBoletoTaxasDiversaSoapPort port = ws.getWsBuscaDadosBoletoTaxasDiversaSoapPort();
		WsBuscaDadosBoletoTaxasDiversaExecuteResponse retornoBoleto = port.execute(paramsWSBoleto);

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
					
					
					if(retorno.getDesRetorno().contains("9999")){
						pmd.setDsBoleto("BOLETO_PAGO");
					}
					
					
					if(retorno.getDesRetorno().contains("9999")){
						pmd.setDsBoleto("BOLETO_EM_ANDAMENTO");
					}
				}
			}
		}else{
			for (RetornoWSRetornoWSItem retorno : retornoBoleto.getRetornows().getRetornoWSRetornoWSItem()) {					
				pmd.setCdSituacao((int) retorno.getIdRetorno());
				pmd.setDsSituacao(retorno.getDesRetorno());
				if(retorno.getDesRetorno().contains("9999")){
					pmd.setDsBoleto("BOLETO_PAGO");
				}
				
				
				if(retorno.getDesRetorno().contains("Consulta efetuada com sucesso!")){
					pmd.setDsBoleto("BOLETO_EM_ANDAMENTO");
				}
			}
		}
		
		return pmd;
	}
	
	
	
	@Deprecated
	public Boletos realizarChamada(Long nrTaxaDiversaProcesso) throws Exception{
		WsBuscaDadosBoletoTaxasDiversaExecuteResponse ws = buscarBoleto(nrTaxaDiversaProcesso);
		
		ConversorResponse resposta = new ConversorResponse(ws);
		Boletos boleto = resposta.getWSBoleto();
		
		return boleto;
	}
	
	
	//O RETORNO DO ERRO NÃO É UTILIZADO
	@Deprecated
	private WsBuscaDadosBoletoTaxasDiversaExecuteResponse buscarBoleto(Long nrTaxaDiversaProcesso) throws Exception {

		WsBuscaDadosBoletoTaxasDiversaExecute paramsWSBoleto = new WsBuscaDadosBoletoTaxasDiversaExecute();
		paramsWSBoleto.setProcesso(nrTaxaDiversaProcesso.intValue());

		WsBuscaDadosBoletoTaxasDiversa ws = new WsBuscaDadosBoletoTaxasDiversa();
		WsBuscaDadosBoletoTaxasDiversaSoapPort port = ws.getWsBuscaDadosBoletoTaxasDiversaSoapPort();
		WsBuscaDadosBoletoTaxasDiversaExecuteResponse retornoBoleto = port.execute(paramsWSBoleto);

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
	
	
	public class ConversorResponse {
		WsBuscaDadosBoletoTaxasDiversaExecuteResponse boletoResponse;
		Boletos boleto = new Boletos();

		public ConversorResponse(WsBuscaDadosBoletoTaxasDiversaExecuteResponse boletoResponse) {
			this.boletoResponse = boletoResponse;
		}

		public Boletos getWSBoleto() throws FileNotFoundException {
			Bradesco bancoBradesco = new Bradesco();

			this.boleto.setAceite(this.boletoResponse.getSdtboletotaxasdiversas().getAceite());
			this.boleto.setAgenciaBeneficiario(this.boletoResponse.getSdtboletotaxasdiversas().getAgencia());
			this.boleto.setCodigoBeneficiario(this.boletoResponse.getSdtboletotaxasdiversas().getCedente());
			this.boleto.setBanco(bancoBradesco);
			this.boleto.setCarteiraBeneficiario(this.boletoResponse.getSdtboletotaxasdiversas().getCarteira());
			this.boleto.setCip(this.boletoResponse.getSdtboletotaxasdiversas().getCIP());
			this.boleto.setCorrecao(String.valueOf(this.boletoResponse.getSdtboletotaxasdiversas().getCorrecao()));
			this.boleto.setDamReferente(this.boletoResponse.getSdtboletotaxasdiversas().getDAMReferentea());
			this.boleto.setDataDocumento(converteData(this.boletoResponse.getSdtboletotaxasdiversas().getDataEmissao()));
			this.boleto.setDataProcessamento(converteData(this.boletoResponse.getSdtboletotaxasdiversas().getDataProcessamento()));
			this.boleto.setDataVencimento(converteData(this.boletoResponse.getSdtboletotaxasdiversas().getVencimento()));

			StringBuffer sb = new StringBuffer();
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas().getDescricaoDAM1() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas().getDescricaoDAM2() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas().getDescricaoDAM3() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas().getDescricaoDAM4() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas().getDescricaoDAM5() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas().getDescricaoDAM6());

			this.boleto.setDescricaoDAM(sb.toString());

			this.boleto.setDocumentoBeneficiario(this.boletoResponse.getSdtboletotaxasdiversas().getBeneficiarioCNPJ());
			this.boleto.setDocumentoPagador(this.boletoResponse.getSdtboletotaxasdiversas().getCpfCnpj());
			this.boleto.setEspecieMoeda(this.boletoResponse.getSdtboletotaxasdiversas().getMoeda());

			this.boleto.setCodigoEspecieMoeda("9");

			this.boleto.setInscricao(String.valueOf(this.boletoResponse.getSdtboletotaxasdiversas().getInscricao()));
			this.boleto.setInstrucao1(this.boletoResponse.getSdtboletotaxasdiversas().getMsgblt1());
			this.boleto.setInstrucao2(this.boletoResponse.getSdtboletotaxasdiversas().getMsgblt2());
			this.boleto.setInstrucao3(this.boletoResponse.getSdtboletotaxasdiversas().getMsgblt3());
			this.boleto.setInstrucao4(this.boletoResponse.getSdtboletotaxasdiversas().getMsgblt4());
			this.boleto.setInstrucao5(this.boletoResponse.getSdtboletotaxasdiversas().getMsgblt5());
			this.boleto.setLocaisPagamento(this.boletoResponse.getSdtboletotaxasdiversas().getLocalDePagamento());
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

		public ConcurrentHashMap<String, Object> getWSParametros() {
			ConcurrentHashMap<String, Object> parametros = new ConcurrentHashMap();
			if (this.boleto.getDescricaoDAM() != null) {
				parametros.put("DESCRICAO_DAM", this.boleto.getDescricaoDAM());
			}
			if (this.boleto.getLogoPrefeitura() != null) {
				parametros.put("LOGO_PREFEITURA",
						this.boleto.getLogoPrefeitura());
			}
			if (this.boleto.getProcessoContribuinte() != null) {
				parametros.put("PROCESSO_CONTRIBUINTE",
						this.boleto.getProcessoContribuinte());
			}
			if (this.boleto.getDamReferente() != null) {
				parametros.put("DAM_REFERENTE", this.boleto.getDamReferente());
			}
			if (this.boleto.getReferencia() != null) {
				parametros.put("REFERENCIA", this.boleto.getReferencia());
			}
			if (this.boleto.getCodigoContribuinte() != null) {
				parametros.put("CODIGO_CONTRIBUINTE",
						this.boleto.getCodigoContribuinte());
			}
			if (this.boleto.getCodigoUsuario() != null) {
				parametros
						.put("CODIGO_USUARIO", this.boleto.getCodigoUsuario());
			}
			if (this.boleto.getNomeUsuario() != null) {
				parametros.put("NOME_USUARIO", this.boleto.getNomeUsuario());
			}
			if (this.boleto.getDocumentoUsuario() != null) {
				parametros.put("DOCUMENTO_USUARIO",
						this.boleto.getDocumentoUsuario());
			}
			if (this.boleto.getInscricao() != null) {
				parametros.put("INSCRICAO", this.boleto.getInscricao());
			}
			if (this.boleto.getTipoInscricao() != null) {
				parametros
						.put("TIPO_INSCRICAO", this.boleto.getTipoInscricao());
			}
			if (this.boleto.getCorrecao() != null) {
				parametros.put("CORRECAO", this.boleto.getCorrecao());
			}
			if (this.boleto.getCip() != null) {
				parametros.put("CIP", this.boleto.getCip());
			}
			return parametros;
		}

	  private Date converteData(XMLGregorianCalendar dateCalendar)
	  {
	    if (dateCalendar == null) {
	      return null;
	    }
	    return dateCalendar.toGregorianCalendar().getTime();
	  }
	  	 
	}
}
