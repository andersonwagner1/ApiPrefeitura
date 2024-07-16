
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ConsultarDadosEmpresaIn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConsultarDadosEmpresaIn">
 *   &lt;complexContent>
 *     &lt;extension base="{Jucesp.Services.Viabilidades.Data/01}MessageRequest">
 *       &lt;sequence>
 *         &lt;element name="CNPJouProtocoloREDESIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarDadosEmpresaIn", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", propOrder = {
    "cnpJouProtocoloREDESIM"
})
public class ConsultarDadosEmpresaIn
    extends MessageRequest
{

    @XmlElementRef(name = "CNPJouProtocoloREDESIM", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpJouProtocoloREDESIM;

    /**
     * Obtém o valor da propriedade cnpJouProtocoloREDESIM.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNPJouProtocoloREDESIM() {
        return cnpJouProtocoloREDESIM;
    }

    /**
     * Define o valor da propriedade cnpJouProtocoloREDESIM.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNPJouProtocoloREDESIM(JAXBElement<String> value) {
        this.cnpJouProtocoloREDESIM = value;
    }

}
