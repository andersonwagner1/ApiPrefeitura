
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CancelarCassarLicencaIn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CancelarCassarLicencaIn">
 *   &lt;complexContent>
 *     &lt;extension base="{Jucesp.Services.Viabilidades.Data/01}MessageRequest">
 *       &lt;sequence>
 *         &lt;element name="IdSolicitacaoLicenca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumeroProtocoloOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InformacoesComplementares" type="{Jucesp.Services.Data/01}ArrayOfItemInformacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelarCassarLicencaIn", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", propOrder = {
    "idSolicitacaoLicenca",
    "numeroProtocoloOrgao",
    "informacoesComplementares"
})
public class CancelarCassarLicencaIn
    extends MessageRequest
{

    @XmlElement(name = "IdSolicitacaoLicenca")
    protected Long idSolicitacaoLicenca;
    @XmlElementRef(name = "NumeroProtocoloOrgao", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroProtocoloOrgao;
    @XmlElementRef(name = "InformacoesComplementares", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfItemInformacao> informacoesComplementares;

    /**
     * Obtém o valor da propriedade idSolicitacaoLicenca.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSolicitacaoLicenca() {
        return idSolicitacaoLicenca;
    }

    /**
     * Define o valor da propriedade idSolicitacaoLicenca.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSolicitacaoLicenca(Long value) {
        this.idSolicitacaoLicenca = value;
    }

    /**
     * Obtém o valor da propriedade numeroProtocoloOrgao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroProtocoloOrgao() {
        return numeroProtocoloOrgao;
    }

    /**
     * Define o valor da propriedade numeroProtocoloOrgao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroProtocoloOrgao(JAXBElement<String> value) {
        this.numeroProtocoloOrgao = value;
    }

    /**
     * Obtém o valor da propriedade informacoesComplementares.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItemInformacao }{@code >}
     *     
     */
    public JAXBElement<ArrayOfItemInformacao> getInformacoesComplementares() {
        return informacoesComplementares;
    }

    /**
     * Define o valor da propriedade informacoesComplementares.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItemInformacao }{@code >}
     *     
     */
    public void setInformacoesComplementares(JAXBElement<ArrayOfItemInformacao> value) {
        this.informacoesComplementares = value;
    }

}
