
package br.com.prefeitura.diadema.ws.egata.execute;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfInscricaoImovel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInscricaoImovel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InscricaoImovel" type="{Jucesp.Services.Data/01}InscricaoImovel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInscricaoImovel", propOrder = {
    "inscricaoImovel"
})
public class ArrayOfInscricaoImovel {

    @XmlElement(name = "InscricaoImovel", nillable = true)
    protected List<InscricaoImovel> inscricaoImovel;

    /**
     * Gets the value of the inscricaoImovel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inscricaoImovel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInscricaoImovel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InscricaoImovel }
     * 
     * 
     */
    public List<InscricaoImovel> getInscricaoImovel() {
        if (inscricaoImovel == null) {
            inscricaoImovel = new ArrayList<InscricaoImovel>();
        }
        return this.inscricaoImovel;
    }

}
