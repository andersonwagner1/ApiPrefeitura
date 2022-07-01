
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de createAuditTrail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="createAuditTrail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="performerPk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="performerIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="performedPkOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAuditTrail", propOrder = {
    "action",
    "message",
    "performerPk",
    "performerIp",
    "performedPkOn",
    "result"
})
public class CreateAuditTrail {

    protected String action;
    protected String message;
    protected String performerPk;
    protected String performerIp;
    protected String performedPkOn;
    protected String result;

    /**
     * Obtém o valor da propriedade action.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Define o valor da propriedade action.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Obtém o valor da propriedade message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define o valor da propriedade message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtém o valor da propriedade performerPk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformerPk() {
        return performerPk;
    }

    /**
     * Define o valor da propriedade performerPk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformerPk(String value) {
        this.performerPk = value;
    }

    /**
     * Obtém o valor da propriedade performerIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformerIp() {
        return performerIp;
    }

    /**
     * Define o valor da propriedade performerIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformerIp(String value) {
        this.performerIp = value;
    }

    /**
     * Obtém o valor da propriedade performedPkOn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformedPkOn() {
        return performedPkOn;
    }

    /**
     * Define o valor da propriedade performedPkOn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformedPkOn(String value) {
        this.performedPkOn = value;
    }

    /**
     * Obtém o valor da propriedade result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Define o valor da propriedade result.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

}
