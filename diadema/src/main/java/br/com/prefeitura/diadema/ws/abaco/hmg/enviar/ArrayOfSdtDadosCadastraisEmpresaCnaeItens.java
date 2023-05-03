package br.com.prefeitura.diadema.ws.abaco.hmg.enviar;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSdt_DadosCadastraisEmpresa.CnaeItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSdt_DadosCadastraisEmpresa.CnaeItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sdt_DadosCadastraisEmpresa.CnaeItens" type="{AGATA}Sdt_DadosCadastraisEmpresa.CnaeItens" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSdt_DadosCadastraisEmpresa.CnaeItens", propOrder = {
    "sdtDadosCadastraisEmpresaCnaeItens"
})
public class ArrayOfSdtDadosCadastraisEmpresaCnaeItens {

    @XmlElement(name = "Sdt_DadosCadastraisEmpresa.CnaeItens")
    protected List<SdtDadosCadastraisEmpresaCnaeItens> sdtDadosCadastraisEmpresaCnaeItens;

    /**
     * Gets the value of the sdtDadosCadastraisEmpresaCnaeItens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtDadosCadastraisEmpresaCnaeItens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdtDadosCadastraisEmpresaCnaeItens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdtDadosCadastraisEmpresaCnaeItens }
     * 
     * 
     */
    public List<SdtDadosCadastraisEmpresaCnaeItens> getSdtDadosCadastraisEmpresaCnaeItens() {
        if (sdtDadosCadastraisEmpresaCnaeItens == null) {
            sdtDadosCadastraisEmpresaCnaeItens = new ArrayList<SdtDadosCadastraisEmpresaCnaeItens>();
        }
        return this.sdtDadosCadastraisEmpresaCnaeItens;
    }

	public void setSdtDadosCadastraisEmpresaCnaeItens(
			List<SdtDadosCadastraisEmpresaCnaeItens> sdtDadosCadastraisEmpresaCnaeItens) {
		this.sdtDadosCadastraisEmpresaCnaeItens = sdtDadosCadastraisEmpresaCnaeItens;
	}
    
    

}
