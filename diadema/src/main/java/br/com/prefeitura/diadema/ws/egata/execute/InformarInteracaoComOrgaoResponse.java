
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="InformarInteracaoComOrgaoResult" type="{Jucesp.Services.Licenciamentos.Licenciamento/01}InformarInteracaoComOrgaoOut" minOccurs="0"/>
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
    "informarInteracaoComOrgaoResult"
})
@XmlRootElement(name = "InformarInteracaoComOrgaoResponse", namespace = "Jucesp.Services.Licenciamentos.Licenciamento")
public class InformarInteracaoComOrgaoResponse {

    @XmlElementRef(name = "InformarInteracaoComOrgaoResult", namespace = "Jucesp.Services.Licenciamentos.Licenciamento", type = JAXBElement.class, required = false)
    protected JAXBElement<InformarInteracaoComOrgaoOut> informarInteracaoComOrgaoResult;

    /**
     * Obtém o valor da propriedade informarInteracaoComOrgaoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InformarInteracaoComOrgaoOut }{@code >}
     *     
     */
    public JAXBElement<InformarInteracaoComOrgaoOut> getInformarInteracaoComOrgaoResult() {
        return informarInteracaoComOrgaoResult;
    }

    /**
     * Define o valor da propriedade informarInteracaoComOrgaoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InformarInteracaoComOrgaoOut }{@code >}
     *     
     */
    public void setInformarInteracaoComOrgaoResult(JAXBElement<InformarInteracaoComOrgaoOut> value) {
        this.informarInteracaoComOrgaoResult = value;
    }

}
