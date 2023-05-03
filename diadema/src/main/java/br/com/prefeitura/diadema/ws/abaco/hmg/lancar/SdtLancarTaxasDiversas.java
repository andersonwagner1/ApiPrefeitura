
package br.com.prefeitura.diadema.ws.abaco.hmg.lancar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SdtLancarTaxasDiversas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SdtLancarTaxasDiversas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="TipoContribuinte" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Inscricao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CodigoSetor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoQuadra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoLote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValorTaxaAdministrativa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Taxas" type="{AGATA}ArrayOfSdtLancarTaxasDiversas.TaxasItem"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SdtLancarTaxasDiversas", propOrder = {

})
public class SdtLancarTaxasDiversas {

    @XmlElement(name = "TipoContribuinte")
    protected byte tipoContribuinte;
    @XmlElement(name = "Inscricao")
    protected long inscricao;
    @XmlElement(name = "CodigoSetor")
    protected int codigoSetor;
    @XmlElement(name = "CodigoQuadra", required = true)
    protected String codigoQuadra;
    @XmlElement(name = "CodigoLote", required = true)
    protected String codigoLote;
    @XmlElement(name = "Observacao", required = true)
    protected String observacao;
    @XmlElement(name = "ValorTaxaAdministrativa")
    protected double valorTaxaAdministrativa;
    @XmlElement(name = "Taxas", required = true)
    protected ArrayOfSdtLancarTaxasDiversasTaxasItem taxas;

    /**
     * Obt�m o valor da propriedade tipoContribuinte.
     * 
     */
    public byte getTipoContribuinte() {
        return tipoContribuinte;
    }

    /**
     * Define o valor da propriedade tipoContribuinte.
     * 
     */
    public void setTipoContribuinte(byte value) {
        this.tipoContribuinte = value;
    }

    /**
     * Obt�m o valor da propriedade inscricao.
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
     * Obt�m o valor da propriedade codigoSetor.
     * 
     */
    public int getCodigoSetor() {
        return codigoSetor;
    }

    /**
     * Define o valor da propriedade codigoSetor.
     * 
     */
    public void setCodigoSetor(int value) {
        this.codigoSetor = value;
    }

    /**
     * Obt�m o valor da propriedade codigoQuadra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoQuadra() {
        return codigoQuadra;
    }

    /**
     * Define o valor da propriedade codigoQuadra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoQuadra(String value) {
        this.codigoQuadra = value;
    }

    /**
     * Obt�m o valor da propriedade codigoLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoLote() {
        return codigoLote;
    }

    /**
     * Define o valor da propriedade codigoLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoLote(String value) {
        this.codigoLote = value;
    }

    /**
     * Obt�m o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obt�m o valor da propriedade valorTaxaAdministrativa.
     * 
     */
    public double getValorTaxaAdministrativa() {
        return valorTaxaAdministrativa;
    }

    /**
     * Define o valor da propriedade valorTaxaAdministrativa.
     * 
     */
    public void setValorTaxaAdministrativa(double value) {
        this.valorTaxaAdministrativa = value;
    }

    /**
     * Obt�m o valor da propriedade taxas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSdtLancarTaxasDiversasTaxasItem }
     *     
     */
    public ArrayOfSdtLancarTaxasDiversasTaxasItem getTaxas() {
        return taxas;
    }

    /**
     * Define o valor da propriedade taxas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSdtLancarTaxasDiversasTaxasItem }
     *     
     */
    public void setTaxas(ArrayOfSdtLancarTaxasDiversasTaxasItem value) {
        this.taxas = value;
    }

}
