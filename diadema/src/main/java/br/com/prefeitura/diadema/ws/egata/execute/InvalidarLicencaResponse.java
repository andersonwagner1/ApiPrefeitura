
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
 *         &lt;element name="InvalidarLicencaResult" type="{Jucesp.Services.Licenciamentos.Licenciamento/01}InvalidarLicencaOut" minOccurs="0"/>
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
    "invalidarLicencaResult"
})
@XmlRootElement(name = "InvalidarLicencaResponse", namespace = "Jucesp.Services.Licenciamentos.Licenciamento")
public class InvalidarLicencaResponse {

    @XmlElementRef(name = "InvalidarLicencaResult", namespace = "Jucesp.Services.Licenciamentos.Licenciamento", type = JAXBElement.class, required = false)
    protected JAXBElement<InvalidarLicencaOut> invalidarLicencaResult;

    /**
     * Obtém o valor da propriedade invalidarLicencaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvalidarLicencaOut }{@code >}
     *     
     */
    public JAXBElement<InvalidarLicencaOut> getInvalidarLicencaResult() {
        return invalidarLicencaResult;
    }

    /**
     * Define o valor da propriedade invalidarLicencaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvalidarLicencaOut }{@code >}
     *     
     */
    public void setInvalidarLicencaResult(JAXBElement<InvalidarLicencaOut> value) {
        this.invalidarLicencaResult = value;
    }

}
