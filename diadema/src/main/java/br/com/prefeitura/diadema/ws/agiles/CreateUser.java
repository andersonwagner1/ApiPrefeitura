
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de createUser complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="createUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newUser" type="{http://imagetechnology.com.br/agiles_services}agilesUser" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUser", propOrder = {
    "newUser",
    "password"
})
public class CreateUser {

    protected AgilesUser newUser;
    protected String password;

    /**
     * Obt�m o valor da propriedade newUser.
     * 
     * @return
     *     possible object is
     *     {@link AgilesUser }
     *     
     */
    public AgilesUser getNewUser() {
        return newUser;
    }

    /**
     * Define o valor da propriedade newUser.
     * 
     * @param value
     *     allowed object is
     *     {@link AgilesUser }
     *     
     */
    public void setNewUser(AgilesUser value) {
        this.newUser = value;
    }

    /**
     * Obt�m o valor da propriedade password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define o valor da propriedade password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
