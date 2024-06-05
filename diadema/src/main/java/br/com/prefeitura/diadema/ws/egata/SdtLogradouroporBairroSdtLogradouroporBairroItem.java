
package br.com.prefeitura.diadema.ws.egata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Sdt_LogradouroporBairro.Sdt_LogradouroporBairroItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_LogradouroporBairro.Sdt_LogradouroporBairroItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogradouroCodigo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LogradouroTipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogradouroNome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BairroCodigo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BairroNome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_LogradouroporBairro.Sdt_LogradouroporBairroItem", propOrder = {
    "logradouroCodigo",
    "logradouroTipo",
    "logradouroNome",
    "bairroCodigo",
    "bairroNome"
})
public class SdtLogradouroporBairroSdtLogradouroporBairroItem {

    @XmlElement(name = "LogradouroCodigo")
    protected long logradouroCodigo;
    @XmlElement(name = "LogradouroTipo", required = true)
    protected String logradouroTipo;
    @XmlElement(name = "LogradouroNome", required = true)
    protected String logradouroNome;
    @XmlElement(name = "BairroCodigo")
    protected long bairroCodigo;
    @XmlElement(name = "BairroNome", required = true)
    protected String bairroNome;

    /**
     * Obtém o valor da propriedade logradouroCodigo.
     * 
     */
    public long getLogradouroCodigo() {
        return logradouroCodigo;
    }

    /**
     * Define o valor da propriedade logradouroCodigo.
     * 
     */
    public void setLogradouroCodigo(long value) {
        this.logradouroCodigo = value;
    }

    /**
     * Obtém o valor da propriedade logradouroTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouroTipo() {
        return logradouroTipo;
    }

    /**
     * Define o valor da propriedade logradouroTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouroTipo(String value) {
        this.logradouroTipo = value;
    }

    /**
     * Obtém o valor da propriedade logradouroNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouroNome() {
        return logradouroNome;
    }

    /**
     * Define o valor da propriedade logradouroNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouroNome(String value) {
        this.logradouroNome = value;
    }

    /**
     * Obtém o valor da propriedade bairroCodigo.
     * 
     */
    public long getBairroCodigo() {
        return bairroCodigo;
    }

    /**
     * Define o valor da propriedade bairroCodigo.
     * 
     */
    public void setBairroCodigo(long value) {
        this.bairroCodigo = value;
    }

    /**
     * Obtém o valor da propriedade bairroNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairroNome() {
        return bairroNome;
    }

    /**
     * Define o valor da propriedade bairroNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairroNome(String value) {
        this.bairroNome = value;
    }

}
