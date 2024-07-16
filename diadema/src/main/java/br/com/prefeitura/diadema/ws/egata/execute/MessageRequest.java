
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MessageRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MessageRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthenticationHeader" type="{Jucesp.Services.Data/01}AuthenticationHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageRequest", namespace = "Jucesp.Services.Viabilidades.Data/01", propOrder = {
    "authenticationHeader"
})
@XmlSeeAlso({
    ConsultarSolicitacaoLicenciamentoIn.class,
    LiberarCassarLicencaIn.class,
    LiberarCassarLicencaOut.class,
    CancelarCassarLicencaOut.class,
    InvalidarLicencaIn.class,
    InformarConclusaoLicencaIn.class,
    ConsultarDadosEmpresaIn.class,
    CassarLicencaIn.class,
    CancelarCassarLicencaIn.class,
    ListarSolicitacoesPorCNJPIn.class,
    ListarSolicitacoesPorProtocoloREDESIMIn.class,
    InformarInteracaoComOrgaoIn.class,
    InformarConclusaoLicencaOut.class,
    ListarSolicitacoesPorDataIn.class,
    CassarLicencaOut.class,
    InformarInteracaoComOrgaoOut.class,
    InvalidarLicencaOut.class
})
public class MessageRequest {

    @XmlElementRef(name = "AuthenticationHeader", namespace = "Jucesp.Services.Viabilidades.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticationHeader> authenticationHeader;

    /**
     * Obtém o valor da propriedade authenticationHeader.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthenticationHeader }{@code >}
     *     
     */
    public JAXBElement<AuthenticationHeader> getAuthenticationHeader() {
        return authenticationHeader;
    }

    /**
     * Define o valor da propriedade authenticationHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthenticationHeader }{@code >}
     *     
     */
    public void setAuthenticationHeader(JAXBElement<AuthenticationHeader> value) {
        this.authenticationHeader = value;
    }

}
