
package br.com.prefeitura.diadema.ws.egata.execute;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfItemInformacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfItemInformacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemInformacao" type="{Jucesp.Services.Data/01}ItemInformacao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfItemInformacao", propOrder = {
    "itemInformacao"
})
public class ArrayOfItemInformacao {

    @XmlElement(name = "ItemInformacao", nillable = true)
    protected List<ItemInformacao> itemInformacao;

    /**
     * Gets the value of the itemInformacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemInformacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemInformacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInformacao }
     * 
     * 
     */
    public List<ItemInformacao> getItemInformacao() {
        if (itemInformacao == null) {
            itemInformacao = new ArrayList<ItemInformacao>();
        }
        return this.itemInformacao;
    }

}
