
package br.com.prefeitura.diadema.ws.agiles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sendEmailForProcessWithAttachments complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sendEmailForProcessWithAttachments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processPk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromUserPk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atachmentsPk" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendEmailForProcessWithAttachments", propOrder = {
    "processPk",
    "fromUserPk",
    "to",
    "cc",
    "bcc",
    "subject",
    "body",
    "atachmentsPk"
})
public class SendEmailForProcessWithAttachments {

    protected String processPk;
    protected String fromUserPk;
    protected String to;
    protected String cc;
    protected String bcc;
    protected String subject;
    protected String body;
    protected List<String> atachmentsPk;

    /**
     * Obtém o valor da propriedade processPk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessPk() {
        return processPk;
    }

    /**
     * Define o valor da propriedade processPk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessPk(String value) {
        this.processPk = value;
    }

    /**
     * Obtém o valor da propriedade fromUserPk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromUserPk() {
        return fromUserPk;
    }

    /**
     * Define o valor da propriedade fromUserPk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromUserPk(String value) {
        this.fromUserPk = value;
    }

    /**
     * Obtém o valor da propriedade to.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Define o valor da propriedade to.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Obtém o valor da propriedade cc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCc() {
        return cc;
    }

    /**
     * Define o valor da propriedade cc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCc(String value) {
        this.cc = value;
    }

    /**
     * Obtém o valor da propriedade bcc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBcc() {
        return bcc;
    }

    /**
     * Define o valor da propriedade bcc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBcc(String value) {
        this.bcc = value;
    }

    /**
     * Obtém o valor da propriedade subject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Define o valor da propriedade subject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Obtém o valor da propriedade body.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the atachmentsPk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atachmentsPk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtachmentsPk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAtachmentsPk() {
        if (atachmentsPk == null) {
            atachmentsPk = new ArrayList<String>();
        }
        return this.atachmentsPk;
    }

}
