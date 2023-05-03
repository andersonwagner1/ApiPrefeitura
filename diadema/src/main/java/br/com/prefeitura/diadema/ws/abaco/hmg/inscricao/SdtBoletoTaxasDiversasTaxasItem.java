
package br.com.prefeitura.diadema.ws.abaco.hmg.inscricao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SdtBoletoTaxasDiversas.TaxasItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SdtBoletoTaxasDiversas.TaxasItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CodigoTaxa" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="DescricaoTaxa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValorTaxa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SdtBoletoTaxasDiversas.TaxasItem", propOrder = {

})
public class SdtBoletoTaxasDiversasTaxasItem {

    @XmlElement(name = "CodigoTaxa")
    protected short codigoTaxa;
    @XmlElement(name = "DescricaoTaxa", required = true)
    protected String descricaoTaxa;
    @XmlElement(name = "ValorTaxa")
    protected double valorTaxa;

    /**
     * Obtém o valor da propriedade codigoTaxa.
     * 
     */
    public short getCodigoTaxa() {
        return codigoTaxa;
    }

    /**
     * Define o valor da propriedade codigoTaxa.
     * 
     */
    public void setCodigoTaxa(short value) {
        this.codigoTaxa = value;
    }

    /**
     * Obtém o valor da propriedade descricaoTaxa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoTaxa() {
        return descricaoTaxa;
    }

    /**
     * Define o valor da propriedade descricaoTaxa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoTaxa(String value) {
        this.descricaoTaxa = value;
    }

    /**
     * Obtém o valor da propriedade valorTaxa.
     * 
     */
    public double getValorTaxa() {
        return valorTaxa;
    }

    /**
     * Define o valor da propriedade valorTaxa.
     * 
     */
    public void setValorTaxa(double value) {
        this.valorTaxa = value;
    }

}
