
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de InformarConclusaoLicencaIn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InformarConclusaoLicencaIn">
 *   &lt;complexContent>
 *     &lt;extension base="{Jucesp.Services.Viabilidades.Data/01}MessageRequest">
 *       &lt;sequence>
 *         &lt;element name="IdSolicitacaoLicenca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumeroProtocoloOrgao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultadoAnalise" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumeroLicenca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataEmissaoLicenca" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataValidadeLicenca" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "InformarConclusaoLicencaIn", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", propOrder = {
    "idSolicitacaoLicenca",
    "numeroProtocoloOrgao",
    "resultadoAnalise",
    "numeroLicenca",
    "dataEmissaoLicenca",
    "dataValidadeLicenca",
    "informacoesComplementares"
})
public class InformarConclusaoLicencaIn
    extends MessageRequest
{

    @XmlElement(name = "IdSolicitacaoLicenca")
    protected Long idSolicitacaoLicenca;
    @XmlElementRef(name = "NumeroProtocoloOrgao", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroProtocoloOrgao;
    @XmlElement(name = "ResultadoAnalise")
    protected Integer resultadoAnalise;
    @XmlElementRef(name = "NumeroLicenca", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroLicenca;
    @XmlElementRef(name = "DataEmissaoLicenca", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataEmissaoLicenca;
    @XmlElementRef(name = "DataValidadeLicenca", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataValidadeLicenca;
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
     * Obtém o valor da propriedade resultadoAnalise.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultadoAnalise() {
        return resultadoAnalise;
    }

    /**
     * Define o valor da propriedade resultadoAnalise.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultadoAnalise(Integer value) {
        this.resultadoAnalise = value;
    }

    /**
     * Obtém o valor da propriedade numeroLicenca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroLicenca() {
        return numeroLicenca;
    }

    /**
     * Define o valor da propriedade numeroLicenca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroLicenca(JAXBElement<String> value) {
        this.numeroLicenca = value;
    }

    /**
     * Obtém o valor da propriedade dataEmissaoLicenca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataEmissaoLicenca() {
        return dataEmissaoLicenca;
    }

    /**
     * Define o valor da propriedade dataEmissaoLicenca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataEmissaoLicenca(JAXBElement<XMLGregorianCalendar> value) {
        this.dataEmissaoLicenca = value;
    }

    /**
     * Obtém o valor da propriedade dataValidadeLicenca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataValidadeLicenca() {
        return dataValidadeLicenca;
    }

    /**
     * Define o valor da propriedade dataValidadeLicenca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataValidadeLicenca(JAXBElement<XMLGregorianCalendar> value) {
        this.dataValidadeLicenca = value;
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
