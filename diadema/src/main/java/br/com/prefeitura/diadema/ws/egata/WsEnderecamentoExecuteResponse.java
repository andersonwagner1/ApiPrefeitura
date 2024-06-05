
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
 *         &lt;element name="Sdt_logradouroporbairro" type="{eAgata}Sdt_LogradouroporBairro"/>
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
    "sdtLogradouroporbairro"
})
@XmlRootElement(name = "wsEnderecamento.ExecuteResponse")
public class WsEnderecamentoExecuteResponse {

    @XmlElement(name = "Sdt_logradouroporbairro", required = true)
    protected SdtLogradouroporBairro sdtLogradouroporbairro;

    /**
     * Obtém o valor da propriedade sdtLogradouroporbairro.
     * 
     * @return
     *     possible object is
     *     {@link SdtLogradouroporBairro }
     *     
     */
    public SdtLogradouroporBairro getSdtLogradouroporbairro() {
        return sdtLogradouroporbairro;
    }

    /**
     * Define o valor da propriedade sdtLogradouroporbairro.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtLogradouroporBairro }
     *     
     */
    public void setSdtLogradouroporbairro(SdtLogradouroporBairro value) {
        this.sdtLogradouroporbairro = value;
    }

}
