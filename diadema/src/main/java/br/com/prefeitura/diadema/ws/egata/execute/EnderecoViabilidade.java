
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EnderecoViabilidade complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EnderecoViabilidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoLogradouro" type="{Jucesp.Services.Data/01}Item" minOccurs="0"/>
 *         &lt;element name="Logradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Complementos" type="{Jucesp.Services.Data/01}ArrayOfComplemento" minOccurs="0"/>
 *         &lt;element name="Bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Municipio" type="{Jucesp.Services.Data/01}Item" minOccurs="0"/>
 *         &lt;element name="UF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponsavelInformacao" type="{Jucesp.Services.Data/01}Item" minOccurs="0"/>
 *         &lt;element name="InscricaoSetorQuadraLotes" type="{Jucesp.Services.Data/01}ArrayOfInscricaoImovel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnderecoViabilidade", propOrder = {
    "tipoLogradouro",
    "logradouro",
    "numero",
    "complementos",
    "bairro",
    "cep",
    "municipio",
    "uf",
    "referencia",
    "responsavelInformacao",
    "inscricaoSetorQuadraLotes"
})
public class EnderecoViabilidade {

    @XmlElementRef(name = "TipoLogradouro", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Item> tipoLogradouro;
    @XmlElementRef(name = "Logradouro", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> logradouro;
    @XmlElementRef(name = "Numero", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numero;
    @XmlElementRef(name = "Complementos", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfComplemento> complementos;
    @XmlElementRef(name = "Bairro", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bairro;
    @XmlElementRef(name = "CEP", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cep;
    @XmlElementRef(name = "Municipio", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Item> municipio;
    @XmlElementRef(name = "UF", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uf;
    @XmlElementRef(name = "Referencia", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencia;
    @XmlElementRef(name = "ResponsavelInformacao", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Item> responsavelInformacao;
    @XmlElementRef(name = "InscricaoSetorQuadraLotes", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInscricaoImovel> inscricaoSetorQuadraLotes;

    /**
     * Obtém o valor da propriedade tipoLogradouro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public JAXBElement<Item> getTipoLogradouro() {
        return tipoLogradouro;
    }

    /**
     * Define o valor da propriedade tipoLogradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public void setTipoLogradouro(JAXBElement<Item> value) {
        this.tipoLogradouro = value;
    }

    /**
     * Obtém o valor da propriedade logradouro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogradouro() {
        return logradouro;
    }

    /**
     * Define o valor da propriedade logradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogradouro(JAXBElement<String> value) {
        this.logradouro = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumero(JAXBElement<String> value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade complementos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComplemento }{@code >}
     *     
     */
    public JAXBElement<ArrayOfComplemento> getComplementos() {
        return complementos;
    }

    /**
     * Define o valor da propriedade complementos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComplemento }{@code >}
     *     
     */
    public void setComplementos(JAXBElement<ArrayOfComplemento> value) {
        this.complementos = value;
    }

    /**
     * Obtém o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBairro(JAXBElement<String> value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCEP() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCEP(JAXBElement<String> value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade municipio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public JAXBElement<Item> getMunicipio() {
        return municipio;
    }

    /**
     * Define o valor da propriedade municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public void setMunicipio(JAXBElement<Item> value) {
        this.municipio = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUF() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUF(JAXBElement<String> value) {
        this.uf = value;
    }

    /**
     * Obtém o valor da propriedade referencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferencia() {
        return referencia;
    }

    /**
     * Define o valor da propriedade referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferencia(JAXBElement<String> value) {
        this.referencia = value;
    }

    /**
     * Obtém o valor da propriedade responsavelInformacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public JAXBElement<Item> getResponsavelInformacao() {
        return responsavelInformacao;
    }

    /**
     * Define o valor da propriedade responsavelInformacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public void setResponsavelInformacao(JAXBElement<Item> value) {
        this.responsavelInformacao = value;
    }

    /**
     * Obtém o valor da propriedade inscricaoSetorQuadraLotes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInscricaoImovel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInscricaoImovel> getInscricaoSetorQuadraLotes() {
        return inscricaoSetorQuadraLotes;
    }

    /**
     * Define o valor da propriedade inscricaoSetorQuadraLotes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInscricaoImovel }{@code >}
     *     
     */
    public void setInscricaoSetorQuadraLotes(JAXBElement<ArrayOfInscricaoImovel> value) {
        this.inscricaoSetorQuadraLotes = value;
    }

}
