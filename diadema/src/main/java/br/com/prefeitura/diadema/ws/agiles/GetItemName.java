
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getItemName complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getItemName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "getItemName", propOrder = {
    "itemPk"
})
public class GetItemName {

    protected String itemPk;

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
