
package br.com.prefeitura.diadema.ws.abaco.hmg.enviar;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSdt_DadosCadastraisEmpresa.ContratoItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSdt_DadosCadastraisEmpresa.ContratoItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sdt_DadosCadastraisEmpresa.ContratoItens" type="{AGATA}Sdt_DadosCadastraisEmpresa.ContratoItens" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSdt_DadosCadastraisEmpresa.ContratoItens", propOrder = {
    "sdtDadosCadastraisEmpresaContratoItens"
})
public class ArrayOfSdtDadosCadastraisEmpresaContratoItens {

    @XmlElement(name = "Sdt_DadosCadastraisEmpresa.ContratoItens")
    protected List<SdtDadosCadastraisEmpresaContratoItens> sdtDadosCadastraisEmpresaContratoItens;

    /**
     * Gets the value of the sdtDadosCadastraisEmpresaContratoItens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtDadosCadastraisEmpresaContratoItens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdtDadosCadastraisEmpresaContratoItens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdtDadosCadastraisEmpresaContratoItens }
     * 
     * 
     */
    public List<SdtDadosCadastraisEmpresaContratoItens> getSdtDadosCadastraisEmpresaContratoItens() {
        if (sdtDadosCadastraisEmpresaContratoItens == null) {
            sdtDadosCadastraisEmpresaContratoItens = new ArrayList<SdtDadosCadastraisEmpresaContratoItens>();
        }
        return this.sdtDadosCadastraisEmpresaContratoItens;
    }

	public void setSdtDadosCadastraisEmpresaContratoItens(
			List<SdtDadosCadastraisEmpresaContratoItens> sdtDadosCadastraisEmpresaContratoItens) {
		this.sdtDadosCadastraisEmpresaContratoItens = sdtDadosCadastraisEmpresaContratoItens;
	}
    

}
