
package br.com.prefeitura.diadema.ws.egata;

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
 *         &lt;element name="Nommunic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sigunifed" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "nommunic",
    "sigunifed"
})
@XmlRootElement(name = "wsBuscaMunicipio.Execute")
public class WsBuscaMunicipioExecute {

    @XmlElement(name = "Nommunic", required = true)
    protected String nommunic;
    @XmlElement(name = "Sigunifed", required = true)
    protected String sigunifed;

    /**
     * Obtém o valor da propriedade nommunic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNommunic() {
        return nommunic;
    }

    /**
     * Define o valor da propriedade nommunic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNommunic(String value) {
        this.nommunic = value;
    }

    /**
     * Obtém o valor da propriedade sigunifed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigunifed() {
        return sigunifed;
    }

    /**
     * Define o valor da propriedade sigunifed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigunifed(String value) {
        this.sigunifed = value;
    }

}
