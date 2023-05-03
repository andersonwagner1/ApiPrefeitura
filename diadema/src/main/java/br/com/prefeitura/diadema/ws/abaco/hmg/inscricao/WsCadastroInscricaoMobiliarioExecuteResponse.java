
package br.com.prefeitura.diadema.ws.abaco.hmg.inscricao;

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
 *         &lt;element name="Messages" type="{AGATA}RetornoWS"/>
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
    "messages"
})
@XmlRootElement(name = "wsCadastroInscricaoMobiliario.ExecuteResponse")
public class WsCadastroInscricaoMobiliarioExecuteResponse {

    @XmlElement(name = "Messages", required = true)
    protected RetornoWS messages;

    /**
     * Obtém o valor da propriedade messages.
     * 
     * @return
     *     possible object is
     *     {@link RetornoWS }
     *     
     */
    public RetornoWS getMessages() {
        return messages;
    }

    /**
     * Define o valor da propriedade messages.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoWS }
     *     
     */
    public void setMessages(RetornoWS value) {
        this.messages = value;
    }

}
