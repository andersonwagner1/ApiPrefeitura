
package br.com.prefeitura.diadema.ws.egata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Sdt_EmpresasporCnpj complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_EmpresasporCnpj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sdt_EmpresasporCnpj.Sdt_EmpresasporCnpjItem" type="{eAgata}Sdt_EmpresasporCnpj.Sdt_EmpresasporCnpjItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_EmpresasporCnpj", propOrder = {
    "sdtEmpresasporCnpjSdtEmpresasporCnpjItem"
})
public class SdtEmpresasporCnpj {

    @XmlElement(name = "Sdt_EmpresasporCnpj.Sdt_EmpresasporCnpjItem")
    protected List<SdtEmpresasporCnpjSdtEmpresasporCnpjItem> sdtEmpresasporCnpjSdtEmpresasporCnpjItem;

    /**
     * Gets the value of the sdtEmpresasporCnpjSdtEmpresasporCnpjItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtEmpresasporCnpjSdtEmpresasporCnpjItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdtEmpresasporCnpjSdtEmpresasporCnpjItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdtEmpresasporCnpjSdtEmpresasporCnpjItem }
     * 
     * 
     */
    public List<SdtEmpresasporCnpjSdtEmpresasporCnpjItem> getSdtEmpresasporCnpjSdtEmpresasporCnpjItem() {
        if (sdtEmpresasporCnpjSdtEmpresasporCnpjItem == null) {
            sdtEmpresasporCnpjSdtEmpresasporCnpjItem = new ArrayList<SdtEmpresasporCnpjSdtEmpresasporCnpjItem>();
        }
        return this.sdtEmpresasporCnpjSdtEmpresasporCnpjItem;
    }

}
