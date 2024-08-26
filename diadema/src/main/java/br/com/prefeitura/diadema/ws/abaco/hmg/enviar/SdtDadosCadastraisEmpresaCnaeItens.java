
package br.com.prefeitura.diadema.ws.abaco.hmg.enviar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Sdt_DadosCadastraisEmpresa.CnaeItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_DadosCadastraisEmpresa.CnaeItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroCnae" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PosicaoCnae" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_DadosCadastraisEmpresa.CnaeItens", propOrder = {
    "numeroCnae",
    "posicaoCnae"
})
public class SdtDadosCadastraisEmpresaCnaeItens {

    @XmlElement(name = "NumeroCnae", required = true)
    protected String numeroCnae;
    @XmlElement(name = "PosicaoCnae", required = true)
    protected String posicaoCnae;

    /**
     * Obt�m o valor da propriedade numeroCnae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCnae() {
        return numeroCnae;
    }

    /**
     * Define o valor da propriedade numeroCnae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCnae(String value) {
        this.numeroCnae = value;
    }

    /**
     * Obt�m o valor da propriedade posicaoCnae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosicaoCnae() {
        return posicaoCnae;
    }

    /**
     * Define o valor da propriedade posicaoCnae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosicaoCnae(String value) {
        this.posicaoCnae = value;
    }

}
