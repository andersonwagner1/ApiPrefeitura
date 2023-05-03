
package br.com.prefeitura.diadema.ws.abaco.hmg.lancar;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetornoWS complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetornoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetornoWS.RetornoWSItem" type="{AGATA}RetornoWS.RetornoWSItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetornoWS", propOrder = {
    "retornoWSRetornoWSItem"
})
public class RetornoWS {

    @XmlElement(name = "RetornoWS.RetornoWSItem")
    protected List<RetornoWSRetornoWSItem> retornoWSRetornoWSItem;

    /**
     * Gets the value of the retornoWSRetornoWSItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retornoWSRetornoWSItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetornoWSRetornoWSItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetornoWSRetornoWSItem }
     * 
     * 
     */
    public List<RetornoWSRetornoWSItem> getRetornoWSRetornoWSItem() {
        if (retornoWSRetornoWSItem == null) {
            retornoWSRetornoWSItem = new ArrayList<RetornoWSRetornoWSItem>();
        }
        return this.retornoWSRetornoWSItem;
    }

}
