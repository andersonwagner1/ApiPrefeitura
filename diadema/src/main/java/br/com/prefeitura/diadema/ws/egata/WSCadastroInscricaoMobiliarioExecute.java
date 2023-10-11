
package br.com.prefeitura.diadema.ws.egata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sdt_dadoscadastraisempresa" type="{eAgata}ArrayOfSdt_DadosCadastraisEmpresa"/>
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
    "sdtDadoscadastraisempresa"
})
@XmlRootElement(name = "WSCadastroInscricaoMobiliario.Execute")
public class WSCadastroInscricaoMobiliarioExecute {

    @XmlElement(name = "Sdt_dadoscadastraisempresa", required = true)
    protected ArrayOfSdtDadosCadastraisEmpresa sdtDadoscadastraisempresa;

    /**
     * Obtém o valor da propriedade sdtDadoscadastraisempresa.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSdtDadosCadastraisEmpresa }
     *     
     */
    public ArrayOfSdtDadosCadastraisEmpresa getSdtDadoscadastraisempresa() {
        return sdtDadoscadastraisempresa;
    }

    /**
     * Define o valor da propriedade sdtDadoscadastraisempresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSdtDadosCadastraisEmpresa }
     *     
     */
    public void setSdtDadoscadastraisempresa(ArrayOfSdtDadosCadastraisEmpresa value) {
        this.sdtDadoscadastraisempresa = value;
    }

}
