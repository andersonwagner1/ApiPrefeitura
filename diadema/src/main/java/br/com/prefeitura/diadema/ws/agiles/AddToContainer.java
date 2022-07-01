
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de addToContainer complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="addToContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="containerPk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemPk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addToContainer", propOrder = {
    "containerPk",
    "itemPk"
})
public class AddToContainer {

    protected String containerPk;
    protected String itemPk;

    /**
     * Obtém o valor da propriedade containerPk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerPk() {
        return containerPk;
    }

    /**
     * Define o valor da propriedade containerPk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerPk(String value) {
        this.containerPk = value;
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

}
