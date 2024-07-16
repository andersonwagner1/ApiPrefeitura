
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ConsultarDadosEmpresaOut complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConsultarDadosEmpresaOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Solicitante" type="{Jucesp.Services.Data/01}Pessoa" minOccurs="0"/>
 *         &lt;element name="ProtocoloViabilidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocoloReconsideracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidadeViabilidade" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OrgaoRegistrador" type="{Jucesp.Services.Data/01}Item" minOccurs="0"/>
 *         &lt;element name="Eventos" type="{Jucesp.Services.Data/01}ArrayOfItem" minOccurs="0"/>
 *         &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Matriz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjetoSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NaturezaJuridica" type="{Jucesp.Services.Data/01}Item" minOccurs="0"/>
 *         &lt;element name="Enquadramento" type="{Jucesp.Services.Data/01}Item" minOccurs="0"/>
 *         &lt;element name="Estabelecimento" type="{Jucesp.Services.Data/01}Estabelecimento" minOccurs="0"/>
 *         &lt;element name="Socios" type="{Jucesp.Services.Data/01}ArrayOfSocio" minOccurs="0"/>
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
@XmlType(name = "ConsultarDadosEmpresaOut", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", propOrder = {
    "solicitante",
    "protocoloViabilidade",
    "protocoloReconsideracao",
    "validadeViabilidade",
    "orgaoRegistrador",
    "eventos",
    "cnpj",
    "matriz",
    "razaoSocial",
    "objetoSocial",
    "naturezaJuridica",
    "enquadramento",
    "estabelecimento",
    "socios",
    "resultado"
})
public class ConsultarDadosEmpresaOut {

    @XmlElementRef(name = "Solicitante", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Pessoa> solicitante;
    @XmlElementRef(name = "ProtocoloViabilidade", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protocoloViabilidade;
    @XmlElementRef(name = "ProtocoloReconsideracao", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protocoloReconsideracao;
    @XmlElementRef(name = "ValidadeViabilidade", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> validadeViabilidade;
    @XmlElementRef(name = "OrgaoRegistrador", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Item> orgaoRegistrador;
    @XmlElementRef(name = "Eventos", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfItem> eventos;
    @XmlElementRef(name = "CNPJ", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpj;
    @XmlElement(name = "Matriz")
    protected Boolean matriz;
    @XmlElementRef(name = "RazaoSocial", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> razaoSocial;
    @XmlElementRef(name = "ObjetoSocial", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objetoSocial;
    @XmlElementRef(name = "NaturezaJuridica", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Item> naturezaJuridica;
    @XmlElementRef(name = "Enquadramento", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Item> enquadramento;
    @XmlElementRef(name = "Estabelecimento", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Estabelecimento> estabelecimento;
    @XmlElementRef(name = "Socios", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSocio> socios;
    @XmlElementRef(name = "Resultado", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestResult> resultado;

    /**
     * Obtém o valor da propriedade solicitante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Pessoa }{@code >}
     *     
     */
    public JAXBElement<Pessoa> getSolicitante() {
        return solicitante;
    }

    /**
     * Define o valor da propriedade solicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Pessoa }{@code >}
     *     
     */
    public void setSolicitante(JAXBElement<Pessoa> value) {
        this.solicitante = value;
    }

    /**
     * Obtém o valor da propriedade protocoloViabilidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtocoloViabilidade() {
        return protocoloViabilidade;
    }

    /**
     * Define o valor da propriedade protocoloViabilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtocoloViabilidade(JAXBElement<String> value) {
        this.protocoloViabilidade = value;
    }

    /**
     * Obtém o valor da propriedade protocoloReconsideracao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtocoloReconsideracao() {
        return protocoloReconsideracao;
    }

    /**
     * Define o valor da propriedade protocoloReconsideracao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtocoloReconsideracao(JAXBElement<String> value) {
        this.protocoloReconsideracao = value;
    }

    /**
     * Obtém o valor da propriedade validadeViabilidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getValidadeViabilidade() {
        return validadeViabilidade;
    }

    /**
     * Define o valor da propriedade validadeViabilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setValidadeViabilidade(JAXBElement<XMLGregorianCalendar> value) {
        this.validadeViabilidade = value;
    }

    /**
     * Obtém o valor da propriedade orgaoRegistrador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public JAXBElement<Item> getOrgaoRegistrador() {
        return orgaoRegistrador;
    }

    /**
     * Define o valor da propriedade orgaoRegistrador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public void setOrgaoRegistrador(JAXBElement<Item> value) {
        this.orgaoRegistrador = value;
    }

    /**
     * Obtém o valor da propriedade eventos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfItem> getEventos() {
        return eventos;
    }

    /**
     * Define o valor da propriedade eventos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItem }{@code >}
     *     
     */
    public void setEventos(JAXBElement<ArrayOfItem> value) {
        this.eventos = value;
    }

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNPJ() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNPJ(JAXBElement<String> value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade matriz.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatriz() {
        return matriz;
    }

    /**
     * Define o valor da propriedade matriz.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatriz(Boolean value) {
        this.matriz = value;
    }

    /**
     * Obtém o valor da propriedade razaoSocial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Define o valor da propriedade razaoSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRazaoSocial(JAXBElement<String> value) {
        this.razaoSocial = value;
    }

    /**
     * Obtém o valor da propriedade objetoSocial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjetoSocial() {
        return objetoSocial;
    }

    /**
     * Define o valor da propriedade objetoSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjetoSocial(JAXBElement<String> value) {
        this.objetoSocial = value;
    }

    /**
     * Obtém o valor da propriedade naturezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public JAXBElement<Item> getNaturezaJuridica() {
        return naturezaJuridica;
    }

    /**
     * Define o valor da propriedade naturezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public void setNaturezaJuridica(JAXBElement<Item> value) {
        this.naturezaJuridica = value;
    }

    /**
     * Obtém o valor da propriedade enquadramento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public JAXBElement<Item> getEnquadramento() {
        return enquadramento;
    }

    /**
     * Define o valor da propriedade enquadramento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public void setEnquadramento(JAXBElement<Item> value) {
        this.enquadramento = value;
    }

    /**
     * Obtém o valor da propriedade estabelecimento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Estabelecimento }{@code >}
     *     
     */
    public JAXBElement<Estabelecimento> getEstabelecimento() {
        return estabelecimento;
    }

    /**
     * Define o valor da propriedade estabelecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Estabelecimento }{@code >}
     *     
     */
    public void setEstabelecimento(JAXBElement<Estabelecimento> value) {
        this.estabelecimento = value;
    }

    /**
     * Obtém o valor da propriedade socios.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSocio }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSocio> getSocios() {
        return socios;
    }

    /**
     * Define o valor da propriedade socios.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSocio }{@code >}
     *     
     */
    public void setSocios(JAXBElement<ArrayOfSocio> value) {
        this.socios = value;
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
