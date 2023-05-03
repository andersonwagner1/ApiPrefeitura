package br.com.prefeitura.diadema.ws.abaco.hmg.inscricao;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Sdt_DadosCadastraisEmpresa.ServicoItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteï¿½do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_DadosCadastraisEmpresa.ServicoItens"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CodigoServico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoServico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SituacaoServico" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DataInicioServico" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DataFimServico" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_DadosCadastraisEmpresa.ServicoItens", propOrder = {

})
public class SdtDadosCadastraisEmpresaServicoItens {

    @XmlElement(name = "CodigoServico", required = true)
    protected String codigoServico;
    @XmlElement(name = "TipoServico", required = true)
    protected String tipoServico;
    @XmlElement(name = "SituacaoServico", required = true)
    protected String situacaoServico;
    @XmlElement(name = "DataInicioServico", required = true)
    @XmlSchemaType(name = "date")
    protected String dataInicioServico;
    @XmlElement(name = "DataFimServico", required = true)
    @XmlSchemaType(name = "date")
    protected String dataFimServico;

    /**
     * Obtï¿½m o valor da propriedade codigoServico.
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
     * Obtï¿½m o valor da propriedade tipoServico.
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
     * Obtï¿½m o valor da propriedade situacaoServico.
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
     * Obtï¿½m o valor da propriedade dataInicioServico.
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
     * Obtï¿½m o valor da propriedade dataFimServico.
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