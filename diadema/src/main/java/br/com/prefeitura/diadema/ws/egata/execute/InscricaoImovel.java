
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InscricaoImovel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InscricaoImovel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoInscricaoImovel" type="{Jucesp.Services.Data/01}Item" minOccurs="0"/>
 *         &lt;element name="Principal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InscricaoImovel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InscricaoImovel", propOrder = {
    "tipoInscricaoImovel",
    "principal",
    "inscricaoImovel"
})
public class InscricaoImovel {

    @XmlElementRef(name = "TipoInscricaoImovel", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Item> tipoInscricaoImovel;
    @XmlElement(name = "Principal")
    protected Boolean principal;
    @XmlElementRef(name = "InscricaoImovel", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inscricaoImovel;

    /**
     * Obtém o valor da propriedade tipoInscricaoImovel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public JAXBElement<Item> getTipoInscricaoImovel() {
        return tipoInscricaoImovel;
    }

    /**
     * Define o valor da propriedade tipoInscricaoImovel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public void setTipoInscricaoImovel(JAXBElement<Item> value) {
        this.tipoInscricaoImovel = value;
    }

    /**
     * Obtém o valor da propriedade principal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrincipal() {
        return principal;
    }

    /**
     * Define o valor da propriedade principal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrincipal(Boolean value) {
        this.principal = value;
    }

    /**
     * Obtém o valor da propriedade inscricaoImovel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInscricaoImovel() {
        return inscricaoImovel;
    }

    /**
     * Define o valor da propriedade inscricaoImovel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInscricaoImovel(JAXBElement<String> value) {
        this.inscricaoImovel = value;
    }

}
