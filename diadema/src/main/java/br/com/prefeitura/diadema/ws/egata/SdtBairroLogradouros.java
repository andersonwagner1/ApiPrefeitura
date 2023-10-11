
package br.com.prefeitura.diadema.ws.egata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SdtBairroLogradouros complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SdtBairroLogradouros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SdtBairroLogradouros.SdtBairroLogradouroItem" type="{eAgata}SdtBairroLogradouros.SdtBairroLogradouroItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SdtBairroLogradouros", propOrder = {
    "sdtBairroLogradourosSdtBairroLogradouroItem"
})
public class SdtBairroLogradouros {

    @XmlElement(name = "SdtBairroLogradouros.SdtBairroLogradouroItem")
    protected List<SdtBairroLogradourosSdtBairroLogradouroItem> sdtBairroLogradourosSdtBairroLogradouroItem;

    /**
     * Gets the value of the sdtBairroLogradourosSdtBairroLogradouroItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtBairroLogradourosSdtBairroLogradouroItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdtBairroLogradourosSdtBairroLogradouroItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdtBairroLogradourosSdtBairroLogradouroItem }
     * 
     * 
     */
    public List<SdtBairroLogradourosSdtBairroLogradouroItem> getSdtBairroLogradourosSdtBairroLogradouroItem() {
        if (sdtBairroLogradourosSdtBairroLogradouroItem == null) {
            sdtBairroLogradourosSdtBairroLogradouroItem = new ArrayList<SdtBairroLogradourosSdtBairroLogradouroItem>();
        }
        return this.sdtBairroLogradourosSdtBairroLogradouroItem;
    }

}
