
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
 *         &lt;element name="LiberarCassarLicencaResult" type="{Jucesp.Services.Licenciamentos.Licenciamento/01}LiberarCassarLicencaOut" minOccurs="0"/>
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
    "liberarCassarLicencaResult"
})
@XmlRootElement(name = "LiberarCassarLicencaResponse", namespace = "Jucesp.Services.Licenciamentos.Licenciamento")
public class LiberarCassarLicencaResponse {

    @XmlElementRef(name = "LiberarCassarLicencaResult", namespace = "Jucesp.Services.Licenciamentos.Licenciamento", type = JAXBElement.class, required = false)
    protected JAXBElement<LiberarCassarLicencaOut> liberarCassarLicencaResult;

    /**
     * Obtém o valor da propriedade liberarCassarLicencaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiberarCassarLicencaOut }{@code >}
     *     
     */
    public JAXBElement<LiberarCassarLicencaOut> getLiberarCassarLicencaResult() {
        return liberarCassarLicencaResult;
    }

    /**
     * Define o valor da propriedade liberarCassarLicencaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiberarCassarLicencaOut }{@code >}
     *     
     */
    public void setLiberarCassarLicencaResult(JAXBElement<LiberarCassarLicencaOut> value) {
        this.liberarCassarLicencaResult = value;
    }

}
