
package br.com.prefeitura.diadema.ws.abaco.hmg.enviar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sdt_dadoscadastraisempresas" type="{AGATA}Sdt_DadosCadastraisEmpresa"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sdtDadoscadastraisempresas"
})
@XmlRootElement(name = "wsEnviarDadosEmpresa.Execute")
public class WsEnviarDadosEmpresaExecute {

    @XmlElement(name = "Sdt_dadoscadastraisempresas", required = true)
    protected SdtDadosCadastraisEmpresa sdtDadoscadastraisempresas;

    /**
     * Obt�m o valor da propriedade sdtDadoscadastraisempresas.
     * 
     * @return
     *     possible object is
     *     {@link SdtDadosCadastraisEmpresa }
     *     
     */
    public SdtDadosCadastraisEmpresa getSdtDadoscadastraisempresas() {
        return sdtDadoscadastraisempresas;
    }

    /**
     * Define o valor da propriedade sdtDadoscadastraisempresas.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtDadosCadastraisEmpresa }
     *     
     */
    public void setSdtDadoscadastraisempresas(SdtDadosCadastraisEmpresa value) {
        this.sdtDadoscadastraisempresas = value;
    }

}
