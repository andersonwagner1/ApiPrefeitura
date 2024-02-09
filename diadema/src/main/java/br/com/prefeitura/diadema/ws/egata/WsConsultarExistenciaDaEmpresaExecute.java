
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
 *         &lt;element name="Inscricaomunicipal" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "inscricaomunicipal"
})
@XmlRootElement(name = "wsConsultarExistenciaDaEmpresa.Execute")
public class WsConsultarExistenciaDaEmpresaExecute {

    @XmlElement(name = "Inscricaomunicipal")
    protected long inscricaomunicipal;

    /**
     * Obtém o valor da propriedade inscricaomunicipal.
     * 
     */
    public long getInscricaomunicipal() {
        return inscricaomunicipal;
    }

    /**
     * Define o valor da propriedade inscricaomunicipal.
     * 
     */
    public void setInscricaomunicipal(long value) {
        this.inscricaomunicipal = value;
    }

}
