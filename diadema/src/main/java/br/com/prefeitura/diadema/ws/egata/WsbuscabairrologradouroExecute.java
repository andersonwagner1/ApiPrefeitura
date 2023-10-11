
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
 *         &lt;element name="Nomlgr" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "nomlgr"
})
@XmlRootElement(name = "wsbuscabairrologradouro.Execute")
public class WsbuscabairrologradouroExecute {

    @XmlElement(name = "Nomlgr", required = true)
    protected String nomlgr;

    /**
     * Obtém o valor da propriedade nomlgr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomlgr() {
        return nomlgr;
    }

    /**
     * Define o valor da propriedade nomlgr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomlgr(String value) {
        this.nomlgr = value;
    }

}
