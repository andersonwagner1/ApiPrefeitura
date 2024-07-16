
package br.com.prefeitura.diadema.ws.egata.execute;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfLicencaEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLicencaEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicencaEntity" type="{http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities}LicencaEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLicencaEntity", namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", propOrder = {
    "licencaEntity"
})
public class ArrayOfLicencaEntity {

    @XmlElement(name = "LicencaEntity", nillable = true)
    protected List<LicencaEntity> licencaEntity;

    /**
     * Gets the value of the licencaEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licencaEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicencaEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicencaEntity }
     * 
     * 
     */
    public List<LicencaEntity> getLicencaEntity() {
        if (licencaEntity == null) {
            licencaEntity = new ArrayList<LicencaEntity>();
        }
        return this.licencaEntity;
    }

}
