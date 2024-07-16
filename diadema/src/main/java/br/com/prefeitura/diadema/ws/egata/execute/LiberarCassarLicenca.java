
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
 *         &lt;element name="dto" type="{Jucesp.Services.Licenciamentos.Licenciamento/01}LiberarCassarLicencaIn" minOccurs="0"/>
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
@XmlRootElement(name = "LiberarCassarLicenca", namespace = "Jucesp.Services.Licenciamentos.Licenciamento")
public class LiberarCassarLicenca {

    @XmlElementRef(name = "dto", namespace = "Jucesp.Services.Licenciamentos.Licenciamento", type = JAXBElement.class, required = false)
    protected JAXBElement<LiberarCassarLicencaIn> dto;

    /**
     * Obtém o valor da propriedade dto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiberarCassarLicencaIn }{@code >}
     *     
     */
    public JAXBElement<LiberarCassarLicencaIn> getDto() {
        return dto;
    }

    /**
     * Define o valor da propriedade dto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiberarCassarLicencaIn }{@code >}
     *     
     */
    public void setDto(JAXBElement<LiberarCassarLicencaIn> value) {
        this.dto = value;
    }

}
