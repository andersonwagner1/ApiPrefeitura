
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getUserPksFromParticipant complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getUserPksFromParticipant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="participantPk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserPksFromParticipant", propOrder = {
    "participantPk"
})
public class GetUserPksFromParticipant {

    protected String participantPk;

    /**
     * Obt�m o valor da propriedade participantPk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantPk() {
        return participantPk;
    }

    /**
     * Define o valor da propriedade participantPk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantPk(String value) {
        this.participantPk = value;
    }

}
