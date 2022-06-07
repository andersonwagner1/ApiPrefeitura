
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de findLevelNamesByDimensionName complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="findLevelNamesByDimensionName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dimensionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findLevelNamesByDimensionName", propOrder = {
    "dimensionName"
})
public class FindLevelNamesByDimensionName {

    protected String dimensionName;

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

}
