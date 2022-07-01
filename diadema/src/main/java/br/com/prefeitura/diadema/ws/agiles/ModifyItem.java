
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de modifyItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="modifyItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modified" type="{http://imagetechnology.com.br/agiles_services}agilesItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyItem", propOrder = {
    "modified"
})
public class ModifyItem {

    protected AgilesItem modified;

    /**
     * Obtém o valor da propriedade modified.
     * 
     * @return
     *     possible object is
     *     {@link AgilesItem }
     *     
     */
    public AgilesItem getModified() {
        return modified;
    }

    /**
     * Define o valor da propriedade modified.
     * 
     * @param value
     *     allowed object is
     *     {@link AgilesItem }
     *     
     */
    public void setModified(AgilesItem value) {
        this.modified = value;
    }

}
