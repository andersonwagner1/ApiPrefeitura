
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DadosComplementares complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosComplementares">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaPublicidades" type="{Jucesp.Services.Data/01}ArrayOfAreaPublicidade" minOccurs="0"/>
 *         &lt;element name="Horarios" type="{Jucesp.Services.Data/01}ArrayOfHorario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosComplementares", propOrder = {
    "areaPublicidades",
    "horarios"
})
public class DadosComplementares {

    @XmlElementRef(name = "AreaPublicidades", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAreaPublicidade> areaPublicidades;
    @XmlElementRef(name = "Horarios", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHorario> horarios;

    /**
     * Obtém o valor da propriedade areaPublicidades.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAreaPublicidade }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAreaPublicidade> getAreaPublicidades() {
        return areaPublicidades;
    }

    /**
     * Define o valor da propriedade areaPublicidades.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAreaPublicidade }{@code >}
     *     
     */
    public void setAreaPublicidades(JAXBElement<ArrayOfAreaPublicidade> value) {
        this.areaPublicidades = value;
    }

    /**
     * Obtém o valor da propriedade horarios.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHorario }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHorario> getHorarios() {
        return horarios;
    }

    /**
     * Define o valor da propriedade horarios.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHorario }{@code >}
     *     
     */
    public void setHorarios(JAXBElement<ArrayOfHorario> value) {
        this.horarios = value;
    }

}
