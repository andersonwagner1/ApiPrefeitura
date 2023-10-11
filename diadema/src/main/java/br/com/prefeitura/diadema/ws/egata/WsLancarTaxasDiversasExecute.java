
package br.com.prefeitura.diadema.ws.egata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Sdtlancartaxasdiversas" type="{eAgata}SdtLancarTaxasDiversas"/>
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
    "sdtlancartaxasdiversas"
})
@XmlRootElement(name = "wsLancarTaxasDiversas.Execute")
public class WsLancarTaxasDiversasExecute {

    @XmlElement(name = "Sdtlancartaxasdiversas", required = true)
    protected SdtLancarTaxasDiversas sdtlancartaxasdiversas;

    /**
     * Obt�m o valor da propriedade sdtlancartaxasdiversas.
     * 
     * @return
     *     possible object is
     *     {@link SdtLancarTaxasDiversas }
     *     
     */
    public SdtLancarTaxasDiversas getSdtlancartaxasdiversas() {
        return sdtlancartaxasdiversas;
    }

    /**
     * Define o valor da propriedade sdtlancartaxasdiversas.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtLancarTaxasDiversas }
     *     
     */
    public void setSdtlancartaxasdiversas(SdtLancarTaxasDiversas value) {
        this.sdtlancartaxasdiversas = value;
    }

}
