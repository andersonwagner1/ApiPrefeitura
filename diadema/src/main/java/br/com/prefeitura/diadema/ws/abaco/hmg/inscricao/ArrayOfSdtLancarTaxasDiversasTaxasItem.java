
package br.com.prefeitura.diadema.ws.abaco.hmg.inscricao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSdtLancarTaxasDiversas.TaxasItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSdtLancarTaxasDiversas.TaxasItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SdtLancarTaxasDiversas.TaxasItem" type="{AGATA}SdtLancarTaxasDiversas.TaxasItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSdtLancarTaxasDiversas.TaxasItem", propOrder = {
    "sdtLancarTaxasDiversasTaxasItem"
})
public class ArrayOfSdtLancarTaxasDiversasTaxasItem {

    @XmlElement(name = "SdtLancarTaxasDiversas.TaxasItem")
    protected List<SdtLancarTaxasDiversasTaxasItem> sdtLancarTaxasDiversasTaxasItem;

    /**
     * Gets the value of the sdtLancarTaxasDiversasTaxasItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtLancarTaxasDiversasTaxasItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdtLancarTaxasDiversasTaxasItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdtLancarTaxasDiversasTaxasItem }
     * 
     * 
     */
    public List<SdtLancarTaxasDiversasTaxasItem> getSdtLancarTaxasDiversasTaxasItem() {
        if (sdtLancarTaxasDiversasTaxasItem == null) {
            sdtLancarTaxasDiversasTaxasItem = new ArrayList<SdtLancarTaxasDiversasTaxasItem>();
        }
        return this.sdtLancarTaxasDiversasTaxasItem;
    }

}
