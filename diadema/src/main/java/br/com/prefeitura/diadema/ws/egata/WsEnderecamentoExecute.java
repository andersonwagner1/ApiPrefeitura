
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
 *         &lt;element name="Ufsigla_q" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Munid_q" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Trechologradouro" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ufsiglaQ",
    "munidQ",
    "trechologradouro"
})
@XmlRootElement(name = "wsEnderecamento.Execute")
public class WsEnderecamentoExecute {

    @XmlElement(name = "Ufsigla_q", required = true)
    protected String ufsiglaQ;
    @XmlElement(name = "Munid_q")
    protected long munidQ;
    @XmlElement(name = "Trechologradouro", required = true)
    protected String trechologradouro;

    /**
     * Obtém o valor da propriedade ufsiglaQ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfsiglaQ() {
        return ufsiglaQ;
    }

    /**
     * Define o valor da propriedade ufsiglaQ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfsiglaQ(String value) {
        this.ufsiglaQ = value;
    }

    /**
     * Obtém o valor da propriedade munidQ.
     * 
     */
    public long getMunidQ() {
        return munidQ;
    }

    /**
     * Define o valor da propriedade munidQ.
     * 
     */
    public void setMunidQ(long value) {
        this.munidQ = value;
    }

    /**
     * Obtém o valor da propriedade trechologradouro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrechologradouro() {
        return trechologradouro;
    }

    /**
     * Define o valor da propriedade trechologradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrechologradouro(String value) {
        this.trechologradouro = value;
    }

}
