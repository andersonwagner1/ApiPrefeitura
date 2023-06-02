
package br.com.prefeitura.diadema.ws.abaco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Processo" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "processo"
})
@XmlRootElement(name = "wsBuscaDadosBoletoTaxasDiversa.Execute")
public class WsBuscaDadosBoletoTaxasDiversaExecute {

    @XmlElement(name = "Processo")
    protected long processo;

    /**
     * Obt�m o valor da propriedade processo.
     * 
     */
    public long getProcesso() {
        return processo;
    }

    /**
     * Define o valor da propriedade processo.
     * 
     */
    public void setProcesso(long value) {
        this.processo = value;
    }

}
