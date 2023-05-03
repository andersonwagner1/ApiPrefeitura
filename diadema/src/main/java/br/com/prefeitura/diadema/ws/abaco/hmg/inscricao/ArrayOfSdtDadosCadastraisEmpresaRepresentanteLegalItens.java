
package br.com.prefeitura.diadema.ws.abaco.hmg.inscricao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSdt_DadosCadastraisEmpresa.RepresentanteLegalItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSdt_DadosCadastraisEmpresa.RepresentanteLegalItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sdt_DadosCadastraisEmpresa.RepresentanteLegalItens" type="{AGATA}Sdt_DadosCadastraisEmpresa.RepresentanteLegalItens" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSdt_DadosCadastraisEmpresa.RepresentanteLegalItens", propOrder = {
    "sdtDadosCadastraisEmpresaRepresentanteLegalItens"
})
public class ArrayOfSdtDadosCadastraisEmpresaRepresentanteLegalItens {

    @XmlElement(name = "Sdt_DadosCadastraisEmpresa.RepresentanteLegalItens")
    protected List<SdtDadosCadastraisEmpresaRepresentanteLegalItens> sdtDadosCadastraisEmpresaRepresentanteLegalItens;

    /**
     * Gets the value of the sdtDadosCadastraisEmpresaRepresentanteLegalItens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtDadosCadastraisEmpresaRepresentanteLegalItens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdtDadosCadastraisEmpresaRepresentanteLegalItens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdtDadosCadastraisEmpresaRepresentanteLegalItens }
     * 
     * 
     */
    public List<SdtDadosCadastraisEmpresaRepresentanteLegalItens> getSdtDadosCadastraisEmpresaRepresentanteLegalItens() {
        if (sdtDadosCadastraisEmpresaRepresentanteLegalItens == null) {
            sdtDadosCadastraisEmpresaRepresentanteLegalItens = new ArrayList<SdtDadosCadastraisEmpresaRepresentanteLegalItens>();
        }
        return this.sdtDadosCadastraisEmpresaRepresentanteLegalItens;
    }

	public void setSdtDadosCadastraisEmpresaRepresentanteLegalItens(
			List<SdtDadosCadastraisEmpresaRepresentanteLegalItens> sdtDadosCadastraisEmpresaRepresentanteLegalItens) {
		this.sdtDadosCadastraisEmpresaRepresentanteLegalItens = sdtDadosCadastraisEmpresaRepresentanteLegalItens;
	}
    
    

}
