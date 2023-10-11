
package br.com.prefeitura.diadema.ws.egata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SDTErros complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SDTErros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdRetorno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DesRetorno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDTErros", propOrder = {
    "idRetorno",
    "desRetorno"
})
public class SDTErros {

    @XmlElement(name = "IdRetorno")
    protected int idRetorno;
    @XmlElement(name = "DesRetorno", required = true)
    protected String desRetorno;

    /**
     * Obtém o valor da propriedade idRetorno.
     * 
     */
    public int getIdRetorno() {
        return idRetorno;
    }

    /**
     * Define o valor da propriedade idRetorno.
     * 
     */
    public void setIdRetorno(int value) {
        this.idRetorno = value;
    }

    /**
     * Obtém o valor da propriedade desRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesRetorno() {
        return desRetorno;
    }

    /**
     * Define o valor da propriedade desRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesRetorno(String value) {
        this.desRetorno = value;
    }

}
