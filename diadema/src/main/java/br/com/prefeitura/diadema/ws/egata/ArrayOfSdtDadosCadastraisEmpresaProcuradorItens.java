
package br.com.prefeitura.diadema.ws.egata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSdt_DadosCadastraisEmpresa.ProcuradorItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSdt_DadosCadastraisEmpresa.ProcuradorItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sdt_DadosCadastraisEmpresa.ProcuradorItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.ProcuradorItens" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSdt_DadosCadastraisEmpresa.ProcuradorItens", propOrder = {
    "sdtDadosCadastraisEmpresaProcuradorItens"
})
public class ArrayOfSdtDadosCadastraisEmpresaProcuradorItens {

    @XmlElement(name = "Sdt_DadosCadastraisEmpresa.ProcuradorItens")
    protected List<SdtDadosCadastraisEmpresaProcuradorItens> sdtDadosCadastraisEmpresaProcuradorItens;

    /**
     * Gets the value of the sdtDadosCadastraisEmpresaProcuradorItens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtDadosCadastraisEmpresaProcuradorItens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdtDadosCadastraisEmpresaProcuradorItens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdtDadosCadastraisEmpresaProcuradorItens }
     * 
     * 
     */
    public List<SdtDadosCadastraisEmpresaProcuradorItens> getSdtDadosCadastraisEmpresaProcuradorItens() {
        if (sdtDadosCadastraisEmpresaProcuradorItens == null) {
            sdtDadosCadastraisEmpresaProcuradorItens = new ArrayList<SdtDadosCadastraisEmpresaProcuradorItens>();
        }
        return this.sdtDadosCadastraisEmpresaProcuradorItens;
    }

}
