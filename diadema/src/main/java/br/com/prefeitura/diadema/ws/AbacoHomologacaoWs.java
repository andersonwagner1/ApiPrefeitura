package br.com.prefeitura.diadema.ws;
/*
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.text.SimpleDateFormat;
import java.util.Date;
*/

import java.io.FileNotFoundException;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.boleto.Boletos;
import br.com.prefeitura.diadema.boleto.bancos.Bradesco;
import br.com.prefeitura.diadema.boleto.exception.BoletoException;
import br.com.prefeitura.diadema.ws.abaco.hmg.RetornoWSRetornoWSItem;
import br.com.prefeitura.diadema.ws.abaco.hmg.WsBuscaDadosBoletoTaxasDiversa;
import br.com.prefeitura.diadema.ws.abaco.hmg.WsBuscaDadosBoletoTaxasDiversaExecute;
import br.com.prefeitura.diadema.ws.abaco.hmg.WsBuscaDadosBoletoTaxasDiversaExecuteResponse;
import br.com.prefeitura.diadema.ws.abaco.hmg.WsBuscaDadosBoletoTaxasDiversaSoapPort;


@Service
public class AbacoHomologacaoWs {
	
	
	public  static void main(String args[]) throws Exception{
		AbacoHomologacaoWs w = new AbacoHomologacaoWs();
		w.realizarChamada(2023093190L);		
	}
	
	
	
	
	
	
	public Boletos realizarChamada(Long nrTaxaDiversaProcesso) throws Exception{
		WsBuscaDadosBoletoTaxasDiversaExecuteResponse ws = buscarBoleto(nrTaxaDiversaProcesso);
		
		ConversorResponse resposta = new ConversorResponse(ws);
		Boletos boleto = resposta.getWSBoleto();
		
		return boleto;
	}
	
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
