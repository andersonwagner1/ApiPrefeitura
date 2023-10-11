
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
 *         &lt;element name="Existe" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
    "existe"
})
@XmlRootElement(name = "wsverificainscricaoimobiliaria.ExecuteResponse")
public class WsverificainscricaoimobiliariaExecuteResponse {

    @XmlElement(name = "Existe")
    protected byte existe;

    /**
     * Obtém o valor da propriedade existe.
     * 
     */
    public byte getExiste() {
        return existe;
    }

    /**
     * Define o valor da propriedade existe.
     * 
     */
    public void setExiste(byte value) {
        this.existe = value;
    }

}
