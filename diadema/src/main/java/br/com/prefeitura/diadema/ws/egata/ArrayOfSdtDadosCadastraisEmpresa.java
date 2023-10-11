
package br.com.prefeitura.diadema.ws.egata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSdt_DadosCadastraisEmpresa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSdt_DadosCadastraisEmpresa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sdt_DadosCadastraisEmpresa" type="{eAgata}Sdt_DadosCadastraisEmpresa" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSdt_DadosCadastraisEmpresa", propOrder = {
    "sdtDadosCadastraisEmpresa"
})
public class ArrayOfSdtDadosCadastraisEmpresa {

    @XmlElement(name = "Sdt_DadosCadastraisEmpresa")
    protected List<SdtDadosCadastraisEmpresa> sdtDadosCadastraisEmpresa;

    /**
     * Gets the value of the sdtDadosCadastraisEmpresa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtDadosCadastraisEmpresa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdtDadosCadastraisEmpresa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdtDadosCadastraisEmpresa }
     * 
     * 
     */
    public List<SdtDadosCadastraisEmpresa> getSdtDadosCadastraisEmpresa() {
        if (sdtDadosCadastraisEmpresa == null) {
            sdtDadosCadastraisEmpresa = new ArrayList<SdtDadosCadastraisEmpresa>();
        }
        return this.sdtDadosCadastraisEmpresa;
    }

}
