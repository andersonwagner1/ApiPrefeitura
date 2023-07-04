
package br.com.prefeitura.diadema.ws.abaco.inscricao;

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
 *         &lt;element name="Retornows" type="{AGATA}RetornoWS"/>
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
    "retornows"
})
@XmlRootElement(name = "wsEnviarDadosEmpresa.ExecuteResponse")
public class WsEnviarDadosEmpresaExecuteResponse {

    @XmlElement(name = "Retornows", required = true)
    protected RetornoWS retornows;

    /**
     * Obtém o valor da propriedade retornows.
     * 
     * @return
     *     possible object is
     *     {@link RetornoWS }
     *     
     */
    public RetornoWS getRetornows() {
        return retornows;
    }

    /**
     * Define o valor da propriedade retornows.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoWS }
     *     
     */
    public void setRetornows(RetornoWS value) {
        this.retornows = value;
    }

}
