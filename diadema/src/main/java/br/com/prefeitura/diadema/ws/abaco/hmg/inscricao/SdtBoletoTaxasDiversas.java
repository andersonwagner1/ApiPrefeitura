
package br.com.prefeitura.diadema.ws.abaco.hmg.inscricao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de SdtBoletoTaxasDiversas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SdtBoletoTaxasDiversas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Contribuinte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CpfCnpj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Processo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DAMReferentea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocalDePagamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Beneficiario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BeneficiarioCNPJ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataEmissao" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EspecieDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Aceite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataProcessamento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Carteira" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Moeda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Vencimento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Inscricao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TipoInscricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescricaoDAM1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescricaoDAM2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescricaoDAM3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescricaoDAM4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescricaoDAM5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescricaoDAM6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TSA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Correcao" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Juros" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Multa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NossoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NossoNumeroDV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Agencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cedente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msgblt1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msgblt2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msgblt3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msgblt4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msgblt5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValoraPagar" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Taxas" type="{AGATA}ArrayOfSdtBoletoTaxasDiversas.TaxasItem"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SdtBoletoTaxasDiversas", propOrder = {

})
public class SdtBoletoTaxasDiversas {

    @XmlElement(name = "Contribuinte", required = true)
    protected String contribuinte;
    @XmlElement(name = "CpfCnpj", required = true)
    protected String cpfCnpj;
    @XmlElement(name = "Processo")
    protected long processo;
    @XmlElement(name = "DAMReferentea", required = true)
    protected String damReferentea;
    @XmlElement(name = "Referencia", required = true)
    protected String referencia;
    @XmlElement(name = "LocalDePagamento", required = true)
    protected String localDePagamento;
    @XmlElement(name = "Beneficiario", required = true)
    protected String beneficiario;
    @XmlElement(name = "BeneficiarioCNPJ", required = true)
    protected String beneficiarioCNPJ;
    @XmlElement(name = "DataEmissao", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissao;
    @XmlElement(name = "EspecieDocumento", required = true)
    protected String especieDocumento;
    @XmlElement(name = "Aceite", required = true)
    protected String aceite;
    @XmlElement(name = "DataProcessamento", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataProcessamento;
    @XmlElement(name = "CIP", required = true)
    protected String cip;
    @XmlElement(name = "Carteira", required = true)
    protected String carteira;
    @XmlElement(name = "Moeda", required = true)
    protected String moeda;
    @XmlElement(name = "Vencimento", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vencimento;
    @XmlElement(name = "Inscricao")
    protected long inscricao;
    @XmlElement(name = "TipoInscricao", required = true)
    protected String tipoInscricao;
    @XmlElement(name = "DescricaoDAM1", required = true)
    protected String descricaoDAM1;
    @XmlElement(name = "DescricaoDAM2", required = true)
    protected String descricaoDAM2;
    @XmlElement(name = "DescricaoDAM3", required = true)
    protected String descricaoDAM3;
    @XmlElement(name = "DescricaoDAM4", required = true)
    protected String descricaoDAM4;
    @XmlElement(name = "DescricaoDAM5", required = true)
    protected String descricaoDAM5;
    @XmlElement(name = "DescricaoDAM6", required = true)
    protected String descricaoDAM6;
    @XmlElement(name = "TSA")
    protected double tsa;
    @XmlElement(name = "Correcao")
    protected double correcao;
    @XmlElement(name = "Juros")
    protected double juros;
    @XmlElement(name = "Multa")
    protected double multa;
    @XmlElement(name = "NossoNumero", required = true)
    protected String nossoNumero;
    @XmlElement(name = "NossoNumeroDV", required = true)
    protected String nossoNumeroDV;
    @XmlElement(name = "Agencia", required = true)
    protected String agencia;
    @XmlElement(name = "Cedente", required = true)
    protected String cedente;
    @XmlElement(required = true)
    protected String msgblt1;
    @XmlElement(required = true)
    protected String msgblt2;
    @XmlElement(required = true)
    protected String msgblt3;
    @XmlElement(required = true)
    protected String msgblt4;
    @XmlElement(required = true)
    protected String msgblt5;
    @XmlElement(name = "ValoraPagar")
    protected double valoraPagar;
    @XmlElement(name = "Taxas", required = true)
    protected ArrayOfSdtBoletoTaxasDiversasTaxasItem taxas;

    /**
     * Obtém o valor da propriedade contribuinte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContribuinte() {
        return contribuinte;
    }

    /**
     * Define o valor da propriedade contribuinte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContribuinte(String value) {
        this.contribuinte = value;
    }

    /**
     * Obtém o valor da propriedade cpfCnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * Define o valor da propriedade cpfCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfCnpj(String value) {
        this.cpfCnpj = value;
    }

    /**
     * Obtém o valor da propriedade processo.
     * 
     */
    public long getProcesso() {
        return processo;
    }

    /**
     * Define o valor da propriedade processo.
     * 
     */
    public void setProcesso(long value) {
        this.processo = value;
    }

    /**
     * Obtém o valor da propriedade damReferentea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAMReferentea() {
        return damReferentea;
    }

    /**
     * Define o valor da propriedade damReferentea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAMReferentea(String value) {
        this.damReferentea = value;
    }

    /**
     * Obtém o valor da propriedade referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Define o valor da propriedade referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Obtém o valor da propriedade localDePagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDePagamento() {
        return localDePagamento;
    }

    /**
     * Define o valor da propriedade localDePagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDePagamento(String value) {
        this.localDePagamento = value;
    }

    /**
     * Obtém o valor da propriedade beneficiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiario() {
        return beneficiario;
    }

    /**
     * Define o valor da propriedade beneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiario(String value) {
        this.beneficiario = value;
    }

    /**
     * Obtém o valor da propriedade beneficiarioCNPJ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiarioCNPJ() {
        return beneficiarioCNPJ;
    }

    /**
     * Define o valor da propriedade beneficiarioCNPJ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiarioCNPJ(String value) {
        this.beneficiarioCNPJ = value;
    }

    /**
     * Obtém o valor da propriedade dataEmissao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Define o valor da propriedade dataEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    /**
     * Obtém o valor da propriedade especieDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecieDocumento() {
        return especieDocumento;
    }

    /**
     * Define o valor da propriedade especieDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecieDocumento(String value) {
        this.especieDocumento = value;
    }

    /**
     * Obtém o valor da propriedade aceite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAceite() {
        return aceite;
    }

    /**
     * Define o valor da propriedade aceite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAceite(String value) {
        this.aceite = value;
    }

    /**
     * Obtém o valor da propriedade dataProcessamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProcessamento() {
        return dataProcessamento;
    }

    /**
     * Define o valor da propriedade dataProcessamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProcessamento(XMLGregorianCalendar value) {
        this.dataProcessamento = value;
    }

    /**
     * Obtém o valor da propriedade cip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIP() {
        return cip;
    }

    /**
     * Define o valor da propriedade cip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIP(String value) {
        this.cip = value;
    }

    /**
     * Obtém o valor da propriedade carteira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarteira() {
        return carteira;
    }

    /**
     * Define o valor da propriedade carteira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarteira(String value) {
        this.carteira = value;
    }

    /**
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoeda(String value) {
        this.moeda = value;
    }

    /**
     * Obtém o valor da propriedade vencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimento() {
        return vencimento;
    }

    /**
     * Define o valor da propriedade vencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimento(XMLGregorianCalendar value) {
        this.vencimento = value;
    }

    /**
     * Obtém o valor da propriedade inscricao.
     * 
     */
    public long getInscricao() {
        return inscricao;
    }

    /**
     * Define o valor da propriedade inscricao.
     * 
     */
    public void setInscricao(long value) {
        this.inscricao = value;
    }

    /**
     * Obtém o valor da propriedade tipoInscricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInscricao() {
        return tipoInscricao;
    }

    /**
     * Define o valor da propriedade tipoInscricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInscricao(String value) {
        this.tipoInscricao = value;
    }

    /**
     * Obtém o valor da propriedade descricaoDAM1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDAM1() {
        return descricaoDAM1;
    }

    /**
     * Define o valor da propriedade descricaoDAM1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDAM1(String value) {
        this.descricaoDAM1 = value;
    }

    /**
     * Obtém o valor da propriedade descricaoDAM2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDAM2() {
        return descricaoDAM2;
    }

    /**
     * Define o valor da propriedade descricaoDAM2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDAM2(String value) {
        this.descricaoDAM2 = value;
    }

    /**
     * Obtém o valor da propriedade descricaoDAM3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDAM3() {
        return descricaoDAM3;
    }

    /**
     * Define o valor da propriedade descricaoDAM3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDAM3(String value) {
        this.descricaoDAM3 = value;
    }

    /**
     * Obtém o valor da propriedade descricaoDAM4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDAM4() {
        return descricaoDAM4;
    }

    /**
     * Define o valor da propriedade descricaoDAM4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDAM4(String value) {
        this.descricaoDAM4 = value;
    }

    /**
     * Obtém o valor da propriedade descricaoDAM5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDAM5() {
        return descricaoDAM5;
    }

    /**
     * Define o valor da propriedade descricaoDAM5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDAM5(String value) {
        this.descricaoDAM5 = value;
    }

    /**
     * Obtém o valor da propriedade descricaoDAM6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDAM6() {
        return descricaoDAM6;
    }

    /**
     * Define o valor da propriedade descricaoDAM6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDAM6(String value) {
        this.descricaoDAM6 = value;
    }

    /**
     * Obtém o valor da propriedade tsa.
     * 
     */
    public double getTSA() {
        return tsa;
    }

    /**
     * Define o valor da propriedade tsa.
     * 
     */
    public void setTSA(double value) {
        this.tsa = value;
    }

    /**
     * Obtém o valor da propriedade correcao.
     * 
     */
    public double getCorrecao() {
        return correcao;
    }

    /**
     * Define o valor da propriedade correcao.
     * 
     */
    public void setCorrecao(double value) {
        this.correcao = value;
    }

    /**
     * Obtém o valor da propriedade juros.
     * 
     */
    public double getJuros() {
        return juros;
    }

    /**
     * Define o valor da propriedade juros.
     * 
     */
    public void setJuros(double value) {
        this.juros = value;
    }

    /**
     * Obtém o valor da propriedade multa.
     * 
     */
    public double getMulta() {
        return multa;
    }

    /**
     * Define o valor da propriedade multa.
     * 
     */
    public void setMulta(double value) {
        this.multa = value;
    }

    /**
     * Obtém o valor da propriedade nossoNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNossoNumero() {
        return nossoNumero;
    }

    /**
     * Define o valor da propriedade nossoNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNossoNumero(String value) {
        this.nossoNumero = value;
    }

    /**
     * Obtém o valor da propriedade nossoNumeroDV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNossoNumeroDV() {
        return nossoNumeroDV;
    }

    /**
     * Define o valor da propriedade nossoNumeroDV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNossoNumeroDV(String value) {
        this.nossoNumeroDV = value;
    }

    /**
     * Obtém o valor da propriedade agencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define o valor da propriedade agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencia(String value) {
        this.agencia = value;
    }

    /**
     * Obtém o valor da propriedade cedente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedente() {
        return cedente;
    }

    /**
     * Define o valor da propriedade cedente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedente(String value) {
        this.cedente = value;
    }

    /**
     * Obtém o valor da propriedade msgblt1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgblt1() {
        return msgblt1;
    }

    /**
     * Define o valor da propriedade msgblt1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgblt1(String value) {
        this.msgblt1 = value;
    }

    /**
     * Obtém o valor da propriedade msgblt2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgblt2() {
        return msgblt2;
    }

    /**
     * Define o valor da propriedade msgblt2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgblt2(String value) {
        this.msgblt2 = value;
    }

    /**
     * Obtém o valor da propriedade msgblt3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgblt3() {
        return msgblt3;
    }

    /**
     * Define o valor da propriedade msgblt3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgblt3(String value) {
        this.msgblt3 = value;
    }

    /**
     * Obtém o valor da propriedade msgblt4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgblt4() {
        return msgblt4;
    }

    /**
     * Define o valor da propriedade msgblt4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgblt4(String value) {
        this.msgblt4 = value;
    }

    /**
     * Obtém o valor da propriedade msgblt5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgblt5() {
        return msgblt5;
    }

    /**
     * Define o valor da propriedade msgblt5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgblt5(String value) {
        this.msgblt5 = value;
    }

    /**
     * Obtém o valor da propriedade valoraPagar.
     * 
     */
    public double getValoraPagar() {
        return valoraPagar;
    }

    /**
     * Define o valor da propriedade valoraPagar.
     * 
     */
    public void setValoraPagar(double value) {
        this.valoraPagar = value;
    }

    /**
     * Obtém o valor da propriedade taxas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSdtBoletoTaxasDiversasTaxasItem }
     *     
     */
    public ArrayOfSdtBoletoTaxasDiversasTaxasItem getTaxas() {
        return taxas;
    }

    /**
     * Define o valor da propriedade taxas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSdtBoletoTaxasDiversasTaxasItem }
     *     
     */
    public void setTaxas(ArrayOfSdtBoletoTaxasDiversasTaxasItem value) {
        this.taxas = value;
    }

}
