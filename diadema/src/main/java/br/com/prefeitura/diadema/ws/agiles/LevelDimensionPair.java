
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de levelDimensionPair complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="levelDimensionPair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dimensionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelPk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "levelDimensionPair", propOrder = {
    "dimensionName",
    "levelName",
    "levelPk"
})
public class LevelDimensionPair {

    protected String dimensionName;
    protected String levelName;
    protected String levelPk;

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
     * Obt�m o valor da propriedade levelPk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelPk() {
        return levelPk;
    }

    /**
     * Define o valor da propriedade levelPk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelPk(String value) {
        this.levelPk = value;
    }

}
