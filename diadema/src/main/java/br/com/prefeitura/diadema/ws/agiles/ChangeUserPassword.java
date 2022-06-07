
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de changeUserPassword complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="changeUserPassword">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userPk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldPass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeUserPassword", propOrder = {
    "userPk",
    "oldPass",
    "newPass"
})
public class ChangeUserPassword {

    protected String userPk;
    protected String oldPass;
    protected String newPass;

    /**
     * Obt�m o valor da propriedade userPk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPk() {
        return userPk;
    }

    /**
     * Define o valor da propriedade userPk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPk(String value) {
        this.userPk = value;
    }

    /**
     * Obt�m o valor da propriedade oldPass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPass() {
        return oldPass;
    }

    /**
     * Define o valor da propriedade oldPass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPass(String value) {
        this.oldPass = value;
    }

    /**
     * Obt�m o valor da propriedade newPass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPass() {
        return newPass;
    }

    /**
     * Define o valor da propriedade newPass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPass(String value) {
        this.newPass = value;
    }

}
