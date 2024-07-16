
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Socio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Socio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identificacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TipoIdentificacao" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="NumeroRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Socio", propOrder = {
    "identificacao",
    "tipoIdentificacao",
    "numeroRegistro",
    "nome"
})
public class Socio {

    @XmlElement(name = "Identificacao")
    protected Long identificacao;
    @XmlElement(name = "TipoIdentificacao")
    @XmlSchemaType(name = "unsignedByte")
    protected Short tipoIdentificacao;
    @XmlElementRef(name = "NumeroRegistro", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroRegistro;
    @XmlElementRef(name = "Nome", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nome;

    /**
     * Obtém o valor da propriedade identificacao.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdentificacao() {
        return identificacao;
    }

    /**
     * Define o valor da propriedade identificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdentificacao(Long value) {
        this.identificacao = value;
    }

    /**
     * Obtém o valor da propriedade tipoIdentificacao.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTipoIdentificacao() {
        return tipoIdentificacao;
    }

    /**
     * Define o valor da propriedade tipoIdentificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTipoIdentificacao(Short value) {
        this.tipoIdentificacao = value;
    }

    /**
     * Obtém o valor da propriedade numeroRegistro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * Define o valor da propriedade numeroRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroRegistro(JAXBElement<String> value) {
        this.numeroRegistro = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNome(JAXBElement<String> value) {
        this.nome = value;
    }

}
