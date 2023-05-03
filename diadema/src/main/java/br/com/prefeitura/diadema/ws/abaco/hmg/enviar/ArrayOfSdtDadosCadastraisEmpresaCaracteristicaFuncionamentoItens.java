
package br.com.prefeitura.diadema.ws.abaco.hmg.enviar;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSdt_DadosCadastraisEmpresa.CaracteristicaFuncionamentoItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSdt_DadosCadastraisEmpresa.CaracteristicaFuncionamentoItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sdt_DadosCadastraisEmpresa.CaracteristicaFuncionamentoItens" type="{AGATA}Sdt_DadosCadastraisEmpresa.CaracteristicaFuncionamentoItens" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSdt_DadosCadastraisEmpresa.CaracteristicaFuncionamentoItens", propOrder = {
    "sdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens"
})
public class ArrayOfSdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens {

    @XmlElement(name = "Sdt_DadosCadastraisEmpresa.CaracteristicaFuncionamentoItens")
    protected List<SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens> sdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens;

    /**
     * Gets the value of the sdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens }
     * 
     * 
     */
    public List<SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens> getSdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens() {
        if (sdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens == null) {
            sdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens = new ArrayList<SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens>();
        }
        return this.sdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens;
    }

	public void setSdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens(
			List<SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens> sdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens) {
		this.sdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens = sdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens;
	}
    

}
