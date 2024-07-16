
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
 *         &lt;element name="InformarConclusaoLicencaResult" type="{Jucesp.Services.Licenciamentos.Licenciamento/01}InformarConclusaoLicencaOut" minOccurs="0"/>
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
    "informarConclusaoLicencaResult"
})
@XmlRootElement(name = "InformarConclusaoLicencaResponse", namespace = "Jucesp.Services.Licenciamentos.Licenciamento")
public class InformarConclusaoLicencaResponse {

    @XmlElementRef(name = "InformarConclusaoLicencaResult", namespace = "Jucesp.Services.Licenciamentos.Licenciamento", type = JAXBElement.class, required = false)
    protected JAXBElement<InformarConclusaoLicencaOut> informarConclusaoLicencaResult;

    /**
     * Obtém o valor da propriedade informarConclusaoLicencaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InformarConclusaoLicencaOut }{@code >}
     *     
     */
    public JAXBElement<InformarConclusaoLicencaOut> getInformarConclusaoLicencaResult() {
        return informarConclusaoLicencaResult;
    }

    /**
     * Define o valor da propriedade informarConclusaoLicencaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InformarConclusaoLicencaOut }{@code >}
     *     
     */
    public void setInformarConclusaoLicencaResult(JAXBElement<InformarConclusaoLicencaOut> value) {
        this.informarConclusaoLicencaResult = value;
    }

}
