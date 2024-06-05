
package br.com.prefeitura.diadema.ws.egata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Sdt_LogradouroporBairro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_LogradouroporBairro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sdt_LogradouroporBairro.Sdt_LogradouroporBairroItem" type="{eAgata}Sdt_LogradouroporBairro.Sdt_LogradouroporBairroItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_LogradouroporBairro", propOrder = {
    "sdtLogradouroporBairroSdtLogradouroporBairroItem"
})
public class SdtLogradouroporBairro {

    @XmlElement(name = "Sdt_LogradouroporBairro.Sdt_LogradouroporBairroItem")
    protected List<SdtLogradouroporBairroSdtLogradouroporBairroItem> sdtLogradouroporBairroSdtLogradouroporBairroItem;

    /**
     * Gets the value of the sdtLogradouroporBairroSdtLogradouroporBairroItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtLogradouroporBairroSdtLogradouroporBairroItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdtLogradouroporBairroSdtLogradouroporBairroItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdtLogradouroporBairroSdtLogradouroporBairroItem }
     * 
     * 
     */
    public List<SdtLogradouroporBairroSdtLogradouroporBairroItem> getSdtLogradouroporBairroSdtLogradouroporBairroItem() {
        if (sdtLogradouroporBairroSdtLogradouroporBairroItem == null) {
            sdtLogradouroporBairroSdtLogradouroporBairroItem = new ArrayList<SdtLogradouroporBairroSdtLogradouroporBairroItem>();
        }
        return this.sdtLogradouroporBairroSdtLogradouroporBairroItem;
    }

}
