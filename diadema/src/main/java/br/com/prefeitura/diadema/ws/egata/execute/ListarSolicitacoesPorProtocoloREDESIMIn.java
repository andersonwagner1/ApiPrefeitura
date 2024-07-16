
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ListarSolicitacoesPorProtocoloREDESIMIn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ListarSolicitacoesPorProtocoloREDESIMIn">
 *   &lt;complexContent>
 *     &lt;extension base="{Jucesp.Services.Viabilidades.Data/01}MessageRequest">
 *       &lt;sequence>
 *         &lt;element name="ProtocoloREDESIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListarSolicitacoesPorProtocoloREDESIMIn", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", propOrder = {
    "protocoloREDESIM"
})
public class ListarSolicitacoesPorProtocoloREDESIMIn
    extends MessageRequest
{

    @XmlElementRef(name = "ProtocoloREDESIM", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protocoloREDESIM;

    /**
     * Obtém o valor da propriedade protocoloREDESIM.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtocoloREDESIM() {
        return protocoloREDESIM;
    }

    /**
     * Define o valor da propriedade protocoloREDESIM.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtocoloREDESIM(JAXBElement<String> value) {
        this.protocoloREDESIM = value;
    }

}
