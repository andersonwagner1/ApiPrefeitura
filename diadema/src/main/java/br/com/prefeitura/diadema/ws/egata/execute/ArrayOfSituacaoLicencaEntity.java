
package br.com.prefeitura.diadema.ws.egata.execute;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSituacaoLicencaEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSituacaoLicencaEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SituacaoLicencaEntity" type="{http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities}SituacaoLicencaEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSituacaoLicencaEntity", namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", propOrder = {
    "situacaoLicencaEntity"
})
public class ArrayOfSituacaoLicencaEntity {

    @XmlElement(name = "SituacaoLicencaEntity", nillable = true)
    protected List<SituacaoLicencaEntity> situacaoLicencaEntity;

    /**
     * Gets the value of the situacaoLicencaEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situacaoLicencaEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituacaoLicencaEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituacaoLicencaEntity }
     * 
     * 
     */
    public List<SituacaoLicencaEntity> getSituacaoLicencaEntity() {
        if (situacaoLicencaEntity == null) {
            situacaoLicencaEntity = new ArrayList<SituacaoLicencaEntity>();
        }
        return this.situacaoLicencaEntity;
    }

}
