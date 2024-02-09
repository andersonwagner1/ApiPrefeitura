
package br.com.prefeitura.diadema.ws.egata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sdtMunicipios complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sdtMunicipios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sdtMunicipios.sdtMunicipiosItem" type="{eAgata}sdtMunicipios.sdtMunicipiosItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sdtMunicipios", propOrder = {
    "sdtMunicipiosSdtMunicipiosItem"
})
public class SdtMunicipios {

    @XmlElement(name = "sdtMunicipios.sdtMunicipiosItem")
    protected List<SdtMunicipiosSdtMunicipiosItem> sdtMunicipiosSdtMunicipiosItem;

    /**
     * Gets the value of the sdtMunicipiosSdtMunicipiosItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtMunicipiosSdtMunicipiosItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdtMunicipiosSdtMunicipiosItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdtMunicipiosSdtMunicipiosItem }
     * 
     * 
     */
    public List<SdtMunicipiosSdtMunicipiosItem> getSdtMunicipiosSdtMunicipiosItem() {
        if (sdtMunicipiosSdtMunicipiosItem == null) {
            sdtMunicipiosSdtMunicipiosItem = new ArrayList<SdtMunicipiosSdtMunicipiosItem>();
        }
        return this.sdtMunicipiosSdtMunicipiosItem;
    }

}
