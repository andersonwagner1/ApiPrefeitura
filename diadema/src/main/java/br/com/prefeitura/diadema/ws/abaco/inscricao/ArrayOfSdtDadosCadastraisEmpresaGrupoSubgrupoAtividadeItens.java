
package br.com.prefeitura.diadema.ws.abaco.inscricao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSdt_DadosCadastraisEmpresa.GrupoSubgrupoAtividadeItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSdt_DadosCadastraisEmpresa.GrupoSubgrupoAtividadeItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sdt_DadosCadastraisEmpresa.GrupoSubgrupoAtividadeItens" type="{AGATA}Sdt_DadosCadastraisEmpresa.GrupoSubgrupoAtividadeItens" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSdt_DadosCadastraisEmpresa.GrupoSubgrupoAtividadeItens", propOrder = {
    "sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens"
})
public class ArrayOfSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens {

    @XmlElement(name = "Sdt_DadosCadastraisEmpresa.GrupoSubgrupoAtividadeItens")
    protected List<SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens> sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens;

    /**
     * Gets the value of the sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens }
     * 
     * 
     */
    public List<SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens> getSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens() {
        if (sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens == null) {
            sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens = new ArrayList<SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens>();
        }
        return this.sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens;
    }

	public void setSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens(
			List<SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens> sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens) {
		this.sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens = sdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens;
	}
    
    

}
