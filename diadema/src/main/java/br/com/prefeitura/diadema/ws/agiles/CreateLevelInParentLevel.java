
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de createLevelInParentLevel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="createLevelInParentLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dimensionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentLevelPk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createLevelInParentLevel", propOrder = {
    "dimensionName",
    "levelName",
    "parentLevelPk"
})
public class CreateLevelInParentLevel {

    protected String dimensionName;
    protected String levelName;
    protected String parentLevelPk;

    /**
     * Obt�m o valor da propriedade dimensionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionName() {
        return dimensionName;
    }

    /**
     * Define o valor da propriedade dimensionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionName(String value) {
        this.dimensionName = value;
    }

    /**
     * Obt�m o valor da propriedade levelName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelName() {
        return levelName;
    }

    /**
     * Define o valor da propriedade levelName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelName(String value) {
        this.levelName = value;
    }

    /**
     * Obt�m o valor da propriedade parentLevelPk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentLevelPk() {
        return parentLevelPk;
    }

    /**
     * Define o valor da propriedade parentLevelPk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentLevelPk(String value) {
        this.parentLevelPk = value;
    }

}
