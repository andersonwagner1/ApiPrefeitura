package br.com.prefeitura.diadema.ws;
/*
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.text.SimpleDateFormat;
import java.util.Date;
*/

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.boleto.Boletos;
import br.com.prefeitura.diadema.boleto.exception.BoletoException;
import br.com.prefeitura.diadema.util.ConversorResponse;
import br.com.prefeitura.diadema.ws.abaco.hmg.WsBuscaDadosBoletoTaxasDiversaExecuteResponse;
import br.com.prefeitura.diadema.ws.abaco.hmg.lancar.ArrayOfSdtLancarTaxasDiversasTaxasItem;
import br.com.prefeitura.diadema.ws.abaco.hmg.lancar.SdtLancarTaxasDiversas;
import br.com.prefeitura.diadema.ws.abaco.hmg.lancar.SdtLancarTaxasDiversasTaxasItem;
import br.com.prefeitura.diadema.ws.abaco.hmg.lancar.WsLancarTaxasDiversas;
import br.com.prefeitura.diadema.ws.abaco.hmg.lancar.WsLancarTaxasDiversasExecute;
import br.com.prefeitura.diadema.ws.abaco.hmg.lancar.WsLancarTaxasDiversasExecuteResponse;
import br.com.prefeitura.diadema.ws.abaco.hmg.lancar.WsLancarTaxasDiversasSoapPort;


@Deprecated
@Service
public class AbacoLancamentoHomologacaoWs {

	public  static void main(String args[]) throws Exception{
		AbacoLancamentoHomologacaoWs a = new AbacoLancamentoHomologacaoWs();
		a.executarHmg(122, 0.0d,1, 2, 1206600102L, "observação");
	}
	
	
	
	public Boletos executarHmg(Integer codigoTaxa, Double valorTaxa, Integer quantidadeTaxa, Integer tipoContribuinte, Long inscricao, String observacao ) throws Exception{
		AbacoHomologacaoWs w = new AbacoHomologacaoWs();
		WsLancarTaxasDiversasExecuteResponse retorno = w.lancarTaxa(codigoTaxa, valorTaxa, quantidadeTaxa,  tipoContribuinte, inscricao, observacao);
	
		ConversorResponse resposta = new ConversorResponse(retorno);
		Boletos boleto = resposta.getWSBoleto();
		return boleto;
	}
	
	
	/**
	 * Realiza a pesquisa do boleto por numero do boleto
	 * @param numeroBoleto
	 * @return
	 * @throws Exception
	 */
	public Boletos consultarSituacaoBoletoPorNumeroProtocolo(Long numeroBoleto) throws Exception {
		AbacoWs ws = new AbacoWs();
		
		WsBuscaDadosBoletoTaxasDiversaExecuteResponse boletos = ws.localizarBoletoTeste(numeroBoleto);
	
		
		ConversorResponse resposta = new ConversorResponse(boletos.getSdtboletotaxasdiversas());
		Boletos boleto = resposta.getWSBoletoConsulta();
		return boleto;
	}
	
	
	public WsLancarTaxasDiversasExecuteResponse lancarTaxa(Integer codigoTaxa, Double valorTaxa, Integer tipoContribuinte, Long inscricao, String observacao ) throws Exception{
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
		lancarTaxasDiversasTaxasItem.setQuantidadeTaxa(1);
		//lancarTaxasDiversasTaxasItem.setValorTaxa(valorTaxa);
		
		ArrayOfSdtLancarTaxasDiversasTaxasItem taxas = new ArrayOfSdtLancarTaxasDiversasTaxasItem();		
		taxas.getSdtLancarTaxasDiversasTaxasItem().add(lancarTaxasDiversasTaxasItem);
				
		sdtLancarTaxasDiversas.setTaxas(taxas);
		
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
				for (br.com.prefeitura.diadema.ws.abaco.hmg.lancar.RetornoWSRetornoWSItem retorno : retornoBoleto.getRetornows().getRetornoWSRetornoWSItem()) {
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
	
	
	
	
	
	
	
	

}
