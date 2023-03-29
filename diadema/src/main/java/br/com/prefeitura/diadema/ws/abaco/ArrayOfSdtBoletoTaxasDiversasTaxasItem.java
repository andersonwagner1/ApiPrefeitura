
package br.com.prefeitura.diadema.ws.abaco;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSdtBoletoTaxasDiversas.TaxasItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSdtBoletoTaxasDiversas.TaxasItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SdtBoletoTaxasDiversas.TaxasItem" type="{AGATA}SdtBoletoTaxasDiversas.TaxasItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSdtBoletoTaxasDiversas.TaxasItem", propOrder = {
    "sdtBoletoTaxasDiversasTaxasItem"
})
public class ArrayOfSdtBoletoTaxasDiversasTaxasItem {

    @XmlElement(name = "SdtBoletoTaxasDiversas.TaxasItem")
    protected List<SdtBoletoTaxasDiversasTaxasItem> sdtBoletoTaxasDiversasTaxasItem;

    /**
     * Gets the value of the sdtBoletoTaxasDiversasTaxasItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtBoletoTaxasDiversasTaxasItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdtBoletoTaxasDiversasTaxasItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdtBoletoTaxasDiversasTaxasItem }
     * 
     * 
     */
    public List<SdtBoletoTaxasDiversasTaxasItem> getSdtBoletoTaxasDiversasTaxasItem() {
        if (sdtBoletoTaxasDiversasTaxasItem == null) {
            sdtBoletoTaxasDiversasTaxasItem = new ArrayList<SdtBoletoTaxasDiversasTaxasItem>();
        }
        return this.sdtBoletoTaxasDiversasTaxasItem;
    }

}
