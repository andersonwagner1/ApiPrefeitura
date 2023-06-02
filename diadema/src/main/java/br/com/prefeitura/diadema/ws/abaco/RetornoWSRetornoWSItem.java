
package br.com.prefeitura.diadema.ws.abaco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetornoWS.RetornoWSItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetornoWS.RetornoWSItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DesRetorno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdRetorno" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetornoWS.RetornoWSItem", propOrder = {

})
public class RetornoWSRetornoWSItem {

    @XmlElement(name = "DesRetorno", required = true)
    protected String desRetorno;
    @XmlElement(name = "IdRetorno")
    protected byte idRetorno;

    /**
     * Obt�m o valor da propriedade desRetorno.
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

    /**
     * Obt�m o valor da propriedade idRetorno.
     * 
     */
    public byte getIdRetorno() {
        return idRetorno;
    }

    /**
     * Define o valor da propriedade idRetorno.
     * 
     */
    public void setIdRetorno(byte value) {
        this.idRetorno = value;
    }

}
