
package br.com.prefeitura.diadema.ws.egata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SdtBairroLogradouros.SdtBairroLogradouroItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SdtBairroLogradouros.SdtBairroLogradouroItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cdglgr" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Tpolgr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nomlgr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cdgsetor" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Nomsetor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SdtBairroLogradouros.SdtBairroLogradouroItem", propOrder = {
    "cdglgr",
    "tpolgr",
    "nomlgr",
    "cdgsetor",
    "nomsetor"
})
public class SdtBairroLogradourosSdtBairroLogradouroItem {

    @XmlElement(name = "Cdglgr")
    protected long cdglgr;
    @XmlElement(name = "Tpolgr", required = true)
    protected String tpolgr;
    @XmlElement(name = "Nomlgr", required = true)
    protected String nomlgr;
    @XmlElement(name = "Cdgsetor")
    protected long cdgsetor;
    @XmlElement(name = "Nomsetor", required = true)
    protected String nomsetor;

    /**
     * Obtém o valor da propriedade cdglgr.
     * 
     */
    public long getCdglgr() {
        return cdglgr;
    }

    /**
     * Define o valor da propriedade cdglgr.
     * 
     */
    public void setCdglgr(long value) {
        this.cdglgr = value;
    }

    /**
     * Obtém o valor da propriedade tpolgr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpolgr() {
        return tpolgr;
    }

    /**
     * Define o valor da propriedade tpolgr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpolgr(String value) {
        this.tpolgr = value;
    }

    /**
     * Obtém o valor da propriedade nomlgr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomlgr() {
        return nomlgr;
    }

    /**
     * Define o valor da propriedade nomlgr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomlgr(String value) {
        this.nomlgr = value;
    }

    /**
     * Obtém o valor da propriedade cdgsetor.
     * 
     */
    public long getCdgsetor() {
        return cdgsetor;
    }

    /**
     * Define o valor da propriedade cdgsetor.
     * 
     */
    public void setCdgsetor(long value) {
        this.cdgsetor = value;
    }

    /**
     * Obtém o valor da propriedade nomsetor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomsetor() {
        return nomsetor;
    }

    /**
     * Define o valor da propriedade nomsetor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomsetor(String value) {
        this.nomsetor = value;
    }

}
