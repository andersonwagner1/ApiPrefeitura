
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de modifyUser complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="modifyUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifiedUser" type="{http://imagetechnology.com.br/agiles_services}agilesUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyUser", propOrder = {
    "modifiedUser"
})
public class ModifyUser {

    protected AgilesUser modifiedUser;

    /**
     * Obt�m o valor da propriedade modifiedUser.
     * 
     * @return
     *     possible object is
     *     {@link AgilesUser }
     *     
     */
    public AgilesUser getModifiedUser() {
        return modifiedUser;
    }

    /**
     * Define o valor da propriedade modifiedUser.
     * 
     * @param value
     *     allowed object is
     *     {@link AgilesUser }
     *     
     */
    public void setModifiedUser(AgilesUser value) {
        this.modifiedUser = value;
    }

}
