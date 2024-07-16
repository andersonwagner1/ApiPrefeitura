
package br.com.prefeitura.diadema.ws.egata.execute;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AreaPublicidade complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AreaPublicidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoPublicidade" type="{Jucesp.Services.Data/01}Item" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaPublicidade", propOrder = {
    "tipoPublicidade",
    "area"
})
public class AreaPublicidade {

    @XmlElementRef(name = "TipoPublicidade", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Item> tipoPublicidade;
    @XmlElementRef(name = "Area", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> area;

    /**
     * Obtém o valor da propriedade tipoPublicidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public JAXBElement<Item> getTipoPublicidade() {
        return tipoPublicidade;
    }

    /**
     * Define o valor da propriedade tipoPublicidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public void setTipoPublicidade(JAXBElement<Item> value) {
        this.tipoPublicidade = value;
    }

    /**
     * Obtém o valor da propriedade area.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getArea() {
        return area;
    }

    /**
     * Define o valor da propriedade area.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setArea(JAXBElement<BigDecimal> value) {
        this.area = value;
    }

}
