
package br.com.prefeitura.diadema.ws.abaco.hmg.inscricao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Sdt_DadosCadastraisEmpresa.CnaeItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_DadosCadastraisEmpresa.CnaeItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="NumeroCnae" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PosicaoCnae" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_DadosCadastraisEmpresa.CnaeItens", propOrder = {

})
public class SdtDadosCadastraisEmpresaCnaeItens {

    @XmlElement(name = "NumeroCnae")
    protected int numeroCnae;
    @XmlElement(name = "PosicaoCnae", required = true)
    protected String posicaoCnae;

    /**
     * Obtém o valor da propriedade numeroCnae.
     * 
     */
    public int getNumeroCnae() {
        return numeroCnae;
    }

    /**
     * Define o valor da propriedade numeroCnae.
     * 
     */
    public void setNumeroCnae(int value) {
        this.numeroCnae = value;
    }

    /**
     * Obtém o valor da propriedade posicaoCnae.
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
