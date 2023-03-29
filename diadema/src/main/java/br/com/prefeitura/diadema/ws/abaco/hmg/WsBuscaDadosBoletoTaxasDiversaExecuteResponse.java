
package br.com.prefeitura.diadema.ws.abaco.hmg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sdtboletotaxasdiversas" type="{AGATA}SdtBoletoTaxasDiversas"/>
 *         &lt;element name="Retornows" type="{AGATA}RetornoWS"/>
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
    "sdtboletotaxasdiversas",
    "retornows"
})
@XmlRootElement(name = "wsBuscaDadosBoletoTaxasDiversa.ExecuteResponse")
public class WsBuscaDadosBoletoTaxasDiversaExecuteResponse {

    @XmlElement(name = "Sdtboletotaxasdiversas", required = true)
    protected SdtBoletoTaxasDiversas sdtboletotaxasdiversas;
    @XmlElement(name = "Retornows", required = true)
    protected RetornoWS retornows;

    /**
     * Obtém o valor da propriedade sdtboletotaxasdiversas.
     * 
     * @return
     *     possible object is
     *     {@link SdtBoletoTaxasDiversas }
     *     
     */
    public SdtBoletoTaxasDiversas getSdtboletotaxasdiversas() {
        return sdtboletotaxasdiversas;
    }

    /**
     * Define o valor da propriedade sdtboletotaxasdiversas.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtBoletoTaxasDiversas }
     *     
     */
    public void setSdtboletotaxasdiversas(SdtBoletoTaxasDiversas value) {
        this.sdtboletotaxasdiversas = value;
    }

    /**
     * Obtém o valor da propriedade retornows.
     * 
     * @return
     *     possible object is
     *     {@link RetornoWS }
     *     
     */
    public RetornoWS getRetornows() {
        return retornows;
    }

    /**
     * Define o valor da propriedade retornows.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoWS }
     *     
     */
    public void setRetornows(RetornoWS value) {
        this.retornows = value;
    }

}
