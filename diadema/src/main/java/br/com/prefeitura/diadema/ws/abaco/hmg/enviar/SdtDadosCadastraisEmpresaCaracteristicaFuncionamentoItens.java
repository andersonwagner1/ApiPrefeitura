
package br.com.prefeitura.diadema.ws.abaco.hmg.enviar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Sdt_DadosCadastraisEmpresa.CaracteristicaFuncionamentoItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_DadosCadastraisEmpresa.CaracteristicaFuncionamentoItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SequencialCaractefisticaFuncionamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoCaracteristicaFuncionamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DescricaoCaracteristicaFuncionamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QuantidadeCaracteristicaFuncionamento" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ValorM2CaractefisticaFuncionamento" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_DadosCadastraisEmpresa.CaracteristicaFuncionamentoItens", propOrder = {
    "sequencialCaractefisticaFuncionamento",
    "codigoCaracteristicaFuncionamento",
    "descricaoCaracteristicaFuncionamento",
    "quantidadeCaracteristicaFuncionamento",
    "valorM2CaractefisticaFuncionamento"
})
public class SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens {

    @XmlElement(name = "SequencialCaractefisticaFuncionamento")
    protected int sequencialCaractefisticaFuncionamento;
    @XmlElement(name = "CodigoCaracteristicaFuncionamento")
    protected int codigoCaracteristicaFuncionamento;
    @XmlElement(name = "DescricaoCaracteristicaFuncionamento", required = true)
    protected String descricaoCaracteristicaFuncionamento;
    @XmlElement(name = "QuantidadeCaracteristicaFuncionamento")
    protected short quantidadeCaracteristicaFuncionamento;
    @XmlElement(name = "ValorM2CaractefisticaFuncionamento")
    protected double valorM2CaractefisticaFuncionamento;

    /**
     * Obt�m o valor da propriedade sequencialCaractefisticaFuncionamento.
     * 
     */
    public int getSequencialCaractefisticaFuncionamento() {
        return sequencialCaractefisticaFuncionamento;
    }

    /**
     * Define o valor da propriedade sequencialCaractefisticaFuncionamento.
     * 
     */
    public void setSequencialCaractefisticaFuncionamento(int value) {
        this.sequencialCaractefisticaFuncionamento = value;
    }

    /**
     * Obt�m o valor da propriedade codigoCaracteristicaFuncionamento.
     * 
     */
    public int getCodigoCaracteristicaFuncionamento() {
        return codigoCaracteristicaFuncionamento;
    }

    /**
     * Define o valor da propriedade codigoCaracteristicaFuncionamento.
     * 
     */
    public void setCodigoCaracteristicaFuncionamento(int value) {
        this.codigoCaracteristicaFuncionamento = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoCaracteristicaFuncionamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoCaracteristicaFuncionamento() {
        return descricaoCaracteristicaFuncionamento;
    }

    /**
     * Define o valor da propriedade descricaoCaracteristicaFuncionamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoCaracteristicaFuncionamento(String value) {
        this.descricaoCaracteristicaFuncionamento = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeCaracteristicaFuncionamento.
     * 
     */
    public short getQuantidadeCaracteristicaFuncionamento() {
        return quantidadeCaracteristicaFuncionamento;
    }

    /**
     * Define o valor da propriedade quantidadeCaracteristicaFuncionamento.
     * 
     */
    public void setQuantidadeCaracteristicaFuncionamento(short value) {
        this.quantidadeCaracteristicaFuncionamento = value;
    }

    /**
     * Obt�m o valor da propriedade valorM2CaractefisticaFuncionamento.
     * 
     */
    public double getValorM2CaractefisticaFuncionamento() {
        return valorM2CaractefisticaFuncionamento;
    }

    /**
     * Define o valor da propriedade valorM2CaractefisticaFuncionamento.
     * 
     */
    public void setValorM2CaractefisticaFuncionamento(double value) {
        this.valorM2CaractefisticaFuncionamento = value;
    }

}
