
package br.com.prefeitura.diadema.ws.egata.execute;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDadosImovel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDadosImovel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DadosImovel" type="{Jucesp.Services.Data/01}DadosImovel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDadosImovel", propOrder = {
    "dadosImovel"
})
public class ArrayOfDadosImovel {

    @XmlElement(name = "DadosImovel", nillable = true)
    protected List<DadosImovel> dadosImovel;

    /**
     * Gets the value of the dadosImovel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosImovel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosImovel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosImovel }
     * 
     * 
     */
    public List<DadosImovel> getDadosImovel() {
        if (dadosImovel == null) {
            dadosImovel = new ArrayList<DadosImovel>();
        }
        return this.dadosImovel;
    }

}
