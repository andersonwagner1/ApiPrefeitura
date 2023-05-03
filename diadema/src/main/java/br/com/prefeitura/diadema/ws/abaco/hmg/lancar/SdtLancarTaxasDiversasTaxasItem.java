
package br.com.prefeitura.diadema.ws.abaco.hmg.lancar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SdtLancarTaxasDiversas.TaxasItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SdtLancarTaxasDiversas.TaxasItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CodigoTaxa" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="QuantidadeTaxa" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "SdtLancarTaxasDiversas.TaxasItem", propOrder = {

})
public class SdtLancarTaxasDiversasTaxasItem {

    @XmlElement(name = "CodigoTaxa")
    protected short codigoTaxa;
    @XmlElement(name = "QuantidadeTaxa")
    protected double quantidadeTaxa;
    @XmlElement(name = "ValorTaxa")
    protected double valorTaxa;

    /**
     * Obt�m o valor da propriedade codigoTaxa.
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
     * Obt�m o valor da propriedade quantidadeTaxa.
     * 
     */
    public double getQuantidadeTaxa() {
        return quantidadeTaxa;
    }

    /**
     * Define o valor da propriedade quantidadeTaxa.
     * 
     */
    public void setQuantidadeTaxa(double value) {
        this.quantidadeTaxa = value;
    }

    /**
     * Obt�m o valor da propriedade valorTaxa.
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
