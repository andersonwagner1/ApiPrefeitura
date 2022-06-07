
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de findLevelByDimentionAndLevelName complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="findLevelByDimentionAndLevelName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dimentionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findLevelByDimentionAndLevelName", propOrder = {
    "dimentionName",
    "levelName"
})
public class FindLevelByDimentionAndLevelName {

    protected String dimentionName;
    protected String levelName;

    /**
     * Obt�m o valor da propriedade dimentionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimentionName() {
        return dimentionName;
    }

    /**
     * Define o valor da propriedade dimentionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimentionName(String value) {
        this.dimentionName = value;
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

}
