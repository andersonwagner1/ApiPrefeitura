
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de addUserToOrganizationalNode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="addUserToOrganizationalNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nodePk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addUserToOrganizationalNode", propOrder = {
    "nodePk",
    "userPk"
})
public class AddUserToOrganizationalNode {

    protected String nodePk;
    protected String userPk;

    /**
     * Obt�m o valor da propriedade nodePk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodePk() {
        return nodePk;
    }

    /**
     * Define o valor da propriedade nodePk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodePk(String value) {
        this.nodePk = value;
    }

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

}
