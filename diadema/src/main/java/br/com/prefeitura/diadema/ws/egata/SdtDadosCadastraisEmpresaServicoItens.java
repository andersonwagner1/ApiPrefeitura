
package br.com.prefeitura.diadema.ws.egata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Classe Java de Sdt_DadosCadastraisEmpresa.ServicoItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_DadosCadastraisEmpresa.ServicoItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoServico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescricaoServico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoServico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SituacaoServico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataInicioServico" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DataFimServico" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_DadosCadastraisEmpresa.ServicoItens", propOrder = {
    "codigoServico",
    "descricaoServico",
    "tipoServico",
    "situacaoServico",
    "dataInicioServico",
    "dataFimServico"
})
public class SdtDadosCadastraisEmpresaServicoItens {

    @XmlElement(name = "CodigoServico", required = true)
    protected String codigoServico;
    @XmlElement(name = "DescricaoServico", required = true)
    protected String descricaoServico;
    @XmlElement(name = "TipoServico", required = true)
    protected String tipoServico;
    @XmlElement(name = "SituacaoServico", required = true)
    protected String situacaoServico;
    @XmlElement(name = "DataInicioServico", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected String dataInicioServico;
    @XmlElement(name = "DataFimServico", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected String dataFimServico;

    /**
     * Obt�m o valor da propriedade codigoServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoServico() {
        return codigoServico;
    }

    /**
     * Define o valor da propriedade codigoServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoServico(String value) {
        this.codigoServico = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoServico() {
        return descricaoServico;
    }

    /**
     * Define o valor da propriedade descricaoServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoServico(String value) {
        this.descricaoServico = value;
    }

    /**
     * Obt�m o valor da propriedade tipoServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoServico() {
        return tipoServico;
    }

    /**
     * Define o valor da propriedade tipoServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoServico(String value) {
        this.tipoServico = value;
    }

    /**
     * Obt�m o valor da propriedade situacaoServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoServico() {
        return situacaoServico;
    }

    /**
     * Define o valor da propriedade situacaoServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoServico(String value) {
        this.situacaoServico = value;
    }

    /**
     * Obt�m o valor da propriedade dataInicioServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicioServico() {
        return dataInicioServico;
    }

    /**
     * Define o valor da propriedade dataInicioServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicioServico(String value) {
        this.dataInicioServico = value;
    }

    /**
     * Obt�m o valor da propriedade dataFimServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFimServico() {
        return dataFimServico;
    }

    /**
     * Define o valor da propriedade dataFimServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFimServico(String value) {
        this.dataFimServico = value;
    }

}
