
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getActivityAssignee complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getActivityAssignee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userActivityInstancePk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getActivityAssignee", propOrder = {
    "userActivityInstancePk"
})
public class GetActivityAssignee {

    protected String userActivityInstancePk;

    /**
     * Obt�m o valor da propriedade userActivityInstancePk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserActivityInstancePk() {
        return userActivityInstancePk;
    }

    /**
     * Define o valor da propriedade userActivityInstancePk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserActivityInstancePk(String value) {
        this.userActivityInstancePk = value;
    }

}
