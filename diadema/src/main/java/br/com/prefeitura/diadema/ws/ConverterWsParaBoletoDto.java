package br.com.prefeitura.diadema.ws;

import java.io.FileNotFoundException;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import br.com.prefeitura.diadema.boleto.Boletos;
import br.com.prefeitura.diadema.boleto.bancos.Bradesco;
import br.com.prefeitura.diadema.ws.egata.SdtBoletoTaxasDiversasTaxasItem;
import br.com.prefeitura.diadema.ws.egata.WsBuscaDadosBoletoTaxasDiversasExecuteResponse;

public class ConverterWsParaBoletoDto {
	WsBuscaDadosBoletoTaxasDiversasExecuteResponse boletoResponse;
	Boletos boleto = new Boletos();

	public ConverterWsParaBoletoDto(
			WsBuscaDadosBoletoTaxasDiversasExecuteResponse boletoResponse) {
		this.boletoResponse = boletoResponse;
	}

	public Boletos getWSBoleto() throws FileNotFoundException {
		Bradesco bancoBradesco = new Bradesco();

		this.boleto.setAceite(this.boletoResponse.getSdtboletotaxasdiversas()
				.getAceite());
		this.boleto.setAgenciaBeneficiario(this.boletoResponse
				.getSdtboletotaxasdiversas().getAgencia());
		this.boleto.setCodigoBeneficiario(this.boletoResponse
				.getSdtboletotaxasdiversas().getCedente());
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
		// this.boleto.setLogoPrefeitura(new FileInputStream(
		// "/home/image/agiles-config/config/imgs/logo_pmd.jpg"));
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
		this.boleto.setProcessoContribuinte(String.valueOf(this.boletoResponse
				.getSdtboletotaxasdiversas().getProcesso()));
		this.boleto.setReferencia(this.boletoResponse
				.getSdtboletotaxasdiversas().getReferencia());
		this.boleto.setTipoInscricao(this.boletoResponse
				.getSdtboletotaxasdiversas().getTipoInscricao());
		this.boleto.setTsa(String.valueOf(this.boletoResponse.getSdtboletotaxasdiversas().getTSA()));
		
		//versão antiga para mostrar o valor da taxa
		//this.boleto.setValorBoleto(String.valueOf(this.boletoResponse.getSdtboletotaxasdiversas().getValoraPagar()));
		
		//SOMAR TODAS AS TAXAS
		Double totalValor = 0d;
		if(this.boletoResponse.getSdtboletotaxasdiversas().getTaxas()!=null){
			for(SdtBoletoTaxasDiversasTaxasItem taxa :  this.boletoResponse.getSdtboletotaxasdiversas().getTaxas().getTaxasItem()){			
				totalValor = totalValor + taxa.getValorTaxa();
			}
		}
		
		this.boleto.setValorBoleto(String.valueOf(totalValor));
		

		return this.boleto;
	}

	private Date converteData(XMLGregorianCalendar dateCalendar) {
		if (dateCalendar == null) {
			return null;
		}
		return dateCalendar.toGregorianCalendar().getTime();
	}

}