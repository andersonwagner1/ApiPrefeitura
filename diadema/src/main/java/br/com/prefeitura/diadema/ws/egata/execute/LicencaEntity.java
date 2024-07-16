
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de LicencaEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LicencaEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ambito" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="DataEmissaoLicenca" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataProtocolo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DataValidadeLicenca" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Detalhe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InformacoesComplementares" type="{Jucesp.Services.Data/01}ArrayOfItemInformacao" minOccurs="0"/>
 *         &lt;element name="NumeroLicenca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroProtocolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrgaoLicenca" type="{Jucesp.Services.Data/01}Item" minOccurs="0"/>
 *         &lt;element name="Prazo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Risco" type="{Jucesp.Services.Data/01}Item" minOccurs="0"/>
 *         &lt;element name="SituacaoLicenca" type="{http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities}ArrayOfSituacaoLicencaEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicencaEntity", namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", propOrder = {
    "ambito",
    "dataEmissaoLicenca",
    "dataProtocolo",
    "dataValidadeLicenca",
    "detalhe",
    "informacoesComplementares",
    "numeroLicenca",
    "numeroProtocolo",
    "orgaoLicenca",
    "prazo",
    "risco",
    "situacaoLicenca"
})
public class LicencaEntity {

    @XmlElement(name = "Ambito")
    protected Short ambito;
    @XmlElementRef(name = "DataEmissaoLicenca", namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataEmissaoLicenca;
    @XmlElementRef(name = "DataProtocolo", namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataProtocolo;
    @XmlElementRef(name = "DataValidadeLicenca", namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataValidadeLicenca;
    @XmlElementRef(name = "Detalhe", namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> detalhe;
    @XmlElementRef(name = "InformacoesComplementares", namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfItemInformacao> informacoesComplementares;
    @XmlElementRef(name = "NumeroLicenca", namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroLicenca;
    @XmlElementRef(name = "NumeroProtocolo", namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroProtocolo;
    @XmlElementRef(name = "OrgaoLicenca", namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Item> orgaoLicenca;
    @XmlElement(name = "Prazo")
    protected Integer prazo;
    @XmlElementRef(name = "Risco", namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Item> risco;
    @XmlElementRef(name = "SituacaoLicenca", namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSituacaoLicencaEntity> situacaoLicenca;

    /**
     * Obtém o valor da propriedade ambito.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAmbito() {
        return ambito;
    }

    /**
     * Define o valor da propriedade ambito.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAmbito(Short value) {
        this.ambito = value;
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
     * Obtém o valor da propriedade dataProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataProtocolo() {
        return dataProtocolo;
    }

    /**
     * Define o valor da propriedade dataProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataProtocolo(JAXBElement<XMLGregorianCalendar> value) {
        this.dataProtocolo = value;
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
     * Obtém o valor da propriedade detalhe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetalhe() {
        return detalhe;
    }

    /**
     * Define o valor da propriedade detalhe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetalhe(JAXBElement<String> value) {
        this.detalhe = value;
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
     * Obtém o valor da propriedade numeroProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Define o valor da propriedade numeroProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroProtocolo(JAXBElement<String> value) {
        this.numeroProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade orgaoLicenca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public JAXBElement<Item> getOrgaoLicenca() {
        return orgaoLicenca;
    }

    /**
     * Define o valor da propriedade orgaoLicenca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public void setOrgaoLicenca(JAXBElement<Item> value) {
        this.orgaoLicenca = value;
    }

    /**
     * Obtém o valor da propriedade prazo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrazo() {
        return prazo;
    }

    /**
     * Define o valor da propriedade prazo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrazo(Integer value) {
        this.prazo = value;
    }

    /**
     * Obtém o valor da propriedade risco.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public JAXBElement<Item> getRisco() {
        return risco;
    }

    /**
     * Define o valor da propriedade risco.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public void setRisco(JAXBElement<Item> value) {
        this.risco = value;
    }

    /**
     * Obtém o valor da propriedade situacaoLicenca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSituacaoLicencaEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSituacaoLicencaEntity> getSituacaoLicenca() {
        return situacaoLicenca;
    }

    /**
     * Define o valor da propriedade situacaoLicenca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSituacaoLicencaEntity }{@code >}
     *     
     */
    public void setSituacaoLicenca(JAXBElement<ArrayOfSituacaoLicencaEntity> value) {
        this.situacaoLicenca = value;
    }

}
