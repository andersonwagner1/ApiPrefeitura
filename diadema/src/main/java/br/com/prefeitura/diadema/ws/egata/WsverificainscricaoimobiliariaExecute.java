
package br.com.prefeitura.diadema.ws.egata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inscricaoimobiliaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inscricaoimobiliaria"
})
@XmlRootElement(name = "wsverificainscricaoimobiliaria.Execute")
public class WsverificainscricaoimobiliariaExecute {

    @XmlElement(name = "Inscricaoimobiliaria", required = true)
    protected String inscricaoimobiliaria;

    /**
     * Obtém o valor da propriedade inscricaoimobiliaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoimobiliaria() {
        return inscricaoimobiliaria;
    }

    /**
     * Define o valor da propriedade inscricaoimobiliaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoimobiliaria(String value) {
        this.inscricaoimobiliaria = value;
    }

}
