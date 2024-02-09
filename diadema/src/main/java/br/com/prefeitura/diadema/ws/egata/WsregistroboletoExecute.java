
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
 *         &lt;element name="Prbid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Sdtenvioregistroparm" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "prbid",
    "sdtenvioregistroparm"
})
@XmlRootElement(name = "wsregistroboleto.Execute")
public class WsregistroboletoExecute {

    @XmlElement(name = "Prbid")
    protected long prbid;
    @XmlElement(name = "Sdtenvioregistroparm", required = true)
    protected String sdtenvioregistroparm;

    /**
     * Obtém o valor da propriedade prbid.
     * 
     */
    public long getPrbid() {
        return prbid;
    }

    /**
     * Define o valor da propriedade prbid.
     * 
     */
    public void setPrbid(long value) {
        this.prbid = value;
    }

    /**
     * Obtém o valor da propriedade sdtenvioregistroparm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdtenvioregistroparm() {
        return sdtenvioregistroparm;
    }

    /**
     * Define o valor da propriedade sdtenvioregistroparm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdtenvioregistroparm(String value) {
        this.sdtenvioregistroparm = value;
    }

}
