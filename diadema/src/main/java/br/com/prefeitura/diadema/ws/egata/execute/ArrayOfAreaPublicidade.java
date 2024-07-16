
package br.com.prefeitura.diadema.ws.egata.execute;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfAreaPublicidade complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAreaPublicidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaPublicidade" type="{Jucesp.Services.Data/01}AreaPublicidade" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAreaPublicidade", propOrder = {
    "areaPublicidade"
})
public class ArrayOfAreaPublicidade {

    @XmlElement(name = "AreaPublicidade", nillable = true)
    protected List<AreaPublicidade> areaPublicidade;

    /**
     * Gets the value of the areaPublicidade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaPublicidade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaPublicidade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaPublicidade }
     * 
     * 
     */
    public List<AreaPublicidade> getAreaPublicidade() {
        if (areaPublicidade == null) {
            areaPublicidade = new ArrayList<AreaPublicidade>();
        }
        return this.areaPublicidade;
    }

}
