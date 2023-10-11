
package br.com.prefeitura.diadema.ws.egata;

import java.util.ArrayList;
import java.util.List;

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
 *       &lt;sequence>
 *         &lt;element name="TipoContribuinte" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Inscricao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CodigoSetor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoQuadra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoLote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Observacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValorTaxaAdministrativa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Taxas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxasItem" type="{eAgata}SdtLancarTaxasDiversas.TaxasItem" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SdtLancarTaxasDiversas", propOrder = {
    "tipoContribuinte",
    "inscricao",
    "codigoSetor",
    "codigoQuadra",
    "codigoLote",
    "observacao",
    "valorTaxaAdministrativa",
    "taxas"
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
    protected SdtLancarTaxasDiversas.Taxas taxas;

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
     *     {@link SdtLancarTaxasDiversas.Taxas }
     *     
     */
    public SdtLancarTaxasDiversas.Taxas getTaxas() {
        return taxas;
    }

    /**
     * Define o valor da propriedade taxas.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtLancarTaxasDiversas.Taxas }
     *     
     */
    public void setTaxas(SdtLancarTaxasDiversas.Taxas value) {
        this.taxas = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TaxasItem" type="{eAgata}SdtLancarTaxasDiversas.TaxasItem" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxasItem"
    })
    public static class Taxas {

        @XmlElement(name = "TaxasItem")
        protected List<SdtLancarTaxasDiversasTaxasItem> taxasItem;

        /**
         * Gets the value of the taxasItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxasItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxasItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SdtLancarTaxasDiversasTaxasItem }
         * 
         * 
         */
        public List<SdtLancarTaxasDiversasTaxasItem> getTaxasItem() {
            if (taxasItem == null) {
                taxasItem = new ArrayList<SdtLancarTaxasDiversasTaxasItem>();
            }
            return this.taxasItem;
        }

    }

}
