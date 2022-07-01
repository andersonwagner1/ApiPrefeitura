
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de checkPermission complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="checkPermission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principalPk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemPk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permissionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkPermission", propOrder = {
    "principalPk",
    "itemPk",
    "permissionName"
})
public class CheckPermission {

    protected String principalPk;
    protected String itemPk;
    protected String permissionName;

    /**
     * Obtém o valor da propriedade principalPk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalPk() {
        return principalPk;
    }

    /**
     * Define o valor da propriedade principalPk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalPk(String value) {
        this.principalPk = value;
    }

    /**
     * Obtém o valor da propriedade itemPk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPk() {
        return itemPk;
    }

    /**
     * Define o valor da propriedade itemPk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPk(String value) {
        this.itemPk = value;
    }

    /**
     * Obtém o valor da propriedade permissionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * Define o valor da propriedade permissionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionName(String value) {
        this.permissionName = value;
    }

}
