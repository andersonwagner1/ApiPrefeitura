
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
 *         &lt;element name="dto" type="{Jucesp.Services.Licenciamentos.Licenciamento/01}CancelarCassarLicencaIn" minOccurs="0"/>
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
    "dto"
})
@XmlRootElement(name = "CancelarCassarLicenca", namespace = "Jucesp.Services.Licenciamentos.Licenciamento")
public class CancelarCassarLicenca {

    @XmlElementRef(name = "dto", namespace = "Jucesp.Services.Licenciamentos.Licenciamento", type = JAXBElement.class, required = false)
    protected JAXBElement<CancelarCassarLicencaIn> dto;

    /**
     * Obtém o valor da propriedade dto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CancelarCassarLicencaIn }{@code >}
     *     
     */
    public JAXBElement<CancelarCassarLicencaIn> getDto() {
        return dto;
    }

    /**
     * Define o valor da propriedade dto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CancelarCassarLicencaIn }{@code >}
     *     
     */
    public void setDto(JAXBElement<CancelarCassarLicencaIn> value) {
        this.dto = value;
    }

}
