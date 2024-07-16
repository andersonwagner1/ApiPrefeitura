
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ListarSolicitacoesPorDataOut complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ListarSolicitacoesPorDataOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Protocolos" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="Resultado" type="{Jucesp.Services.Data/01}RequestResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListarSolicitacoesPorDataOut", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", propOrder = {
    "protocolos",
    "resultado"
})
public class ListarSolicitacoesPorDataOut {

    @XmlElementRef(name = "Protocolos", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> protocolos;
    @XmlElementRef(name = "Resultado", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestResult> resultado;

    /**
     * Obtém o valor da propriedade protocolos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getProtocolos() {
        return protocolos;
    }

    /**
     * Define o valor da propriedade protocolos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setProtocolos(JAXBElement<ArrayOflong> value) {
        this.protocolos = value;
    }

    /**
     * Obtém o valor da propriedade resultado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestResult }{@code >}
     *     
     */
    public JAXBElement<RequestResult> getResultado() {
        return resultado;
    }

    /**
     * Define o valor da propriedade resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestResult }{@code >}
     *     
     */
    public void setResultado(JAXBElement<RequestResult> value) {
        this.resultado = value;
    }

}
