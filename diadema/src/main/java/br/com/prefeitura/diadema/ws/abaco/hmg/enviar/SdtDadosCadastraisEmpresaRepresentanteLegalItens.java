
package br.com.prefeitura.diadema.ws.abaco.hmg.enviar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Sdt_DadosCadastraisEmpresa.RepresentanteLegalItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_DadosCadastraisEmpresa.RepresentanteLegalItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroCpfRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroRgRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NomeRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrgaoExpedidorRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogradouroCodigoRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LogradouroTipoRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogradouroNomeRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BairroCodigoRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BairroNomeRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TelefoneRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroLogradouroRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ComplementoLogradouroRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EmailRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CEPRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MunicipioCodigoRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MunicipioNomeRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MunicipioUFRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaisCodigoRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PaisNomeRepresentanteLegal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_DadosCadastraisEmpresa.RepresentanteLegalItens", propOrder = {
    "numeroCpfRepresentanteLegal",
    "numeroRgRepresentanteLegal",
    "nomeRepresentanteLegal",
    "orgaoExpedidorRepresentanteLegal",
    "logradouroCodigoRepresentanteLegal",
    "logradouroTipoRepresentanteLegal",
    "logradouroNomeRepresentanteLegal",
    "bairroCodigoRepresentanteLegal",
    "bairroNomeRepresentanteLegal",
    "telefoneRepresentanteLegal",
    "numeroLogradouroRepresentanteLegal",
    "complementoLogradouroRepresentanteLegal",
    "emailRepresentanteLegal",
    "cepRepresentanteLegal",
    "municipioCodigoRepresentanteLegal",
    "municipioNomeRepresentanteLegal",
    "municipioUFRepresentanteLegal",
    "paisCodigoRepresentanteLegal",
    "paisNomeRepresentanteLegal"
})
public class SdtDadosCadastraisEmpresaRepresentanteLegalItens {

    @XmlElement(name = "NumeroCpfRepresentanteLegal", required = true)
    protected String numeroCpfRepresentanteLegal;
    @XmlElement(name = "NumeroRgRepresentanteLegal", required = true)
    protected String numeroRgRepresentanteLegal;
    @XmlElement(name = "NomeRepresentanteLegal", required = true)
    protected String nomeRepresentanteLegal;
    @XmlElement(name = "OrgaoExpedidorRepresentanteLegal", required = true)
    protected String orgaoExpedidorRepresentanteLegal;
    @XmlElement(name = "LogradouroCodigoRepresentanteLegal")
    protected long logradouroCodigoRepresentanteLegal;
    @XmlElement(name = "LogradouroTipoRepresentanteLegal", required = true)
    protected String logradouroTipoRepresentanteLegal;
    @XmlElement(name = "LogradouroNomeRepresentanteLegal", required = true)
    protected String logradouroNomeRepresentanteLegal;
    @XmlElement(name = "BairroCodigoRepresentanteLegal")
    protected long bairroCodigoRepresentanteLegal;
    @XmlElement(name = "BairroNomeRepresentanteLegal", required = true)
    protected String bairroNomeRepresentanteLegal;
    @XmlElement(name = "TelefoneRepresentanteLegal", required = true)
    protected String telefoneRepresentanteLegal;
    @XmlElement(name = "NumeroLogradouroRepresentanteLegal", required = true)
    protected String numeroLogradouroRepresentanteLegal;
    @XmlElement(name = "ComplementoLogradouroRepresentanteLegal", required = true)
    protected String complementoLogradouroRepresentanteLegal;
    @XmlElement(name = "EmailRepresentanteLegal", required = true)
    protected String emailRepresentanteLegal;
    @XmlElement(name = "CEPRepresentanteLegal", required = true)
    protected String cepRepresentanteLegal;
    @XmlElement(name = "MunicipioCodigoRepresentanteLegal")
    protected long municipioCodigoRepresentanteLegal;
    @XmlElement(name = "MunicipioNomeRepresentanteLegal", required = true)
    protected String municipioNomeRepresentanteLegal;
    @XmlElement(name = "MunicipioUFRepresentanteLegal", required = true)
    protected String municipioUFRepresentanteLegal;
    @XmlElement(name = "PaisCodigoRepresentanteLegal")
    protected long paisCodigoRepresentanteLegal;
    @XmlElement(name = "PaisNomeRepresentanteLegal", required = true)
    protected String paisNomeRepresentanteLegal;

    /**
     * Obt�m o valor da propriedade numeroCpfRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCpfRepresentanteLegal() {
        return numeroCpfRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade numeroCpfRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCpfRepresentanteLegal(String value) {
        this.numeroCpfRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade numeroRgRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRgRepresentanteLegal() {
        return numeroRgRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade numeroRgRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRgRepresentanteLegal(String value) {
        this.numeroRgRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade nomeRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeRepresentanteLegal() {
        return nomeRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade nomeRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeRepresentanteLegal(String value) {
        this.nomeRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade orgaoExpedidorRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgaoExpedidorRepresentanteLegal() {
        return orgaoExpedidorRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade orgaoExpedidorRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgaoExpedidorRepresentanteLegal(String value) {
        this.orgaoExpedidorRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroCodigoRepresentanteLegal.
     * 
     */
    public long getLogradouroCodigoRepresentanteLegal() {
        return logradouroCodigoRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade logradouroCodigoRepresentanteLegal.
     * 
     */
    public void setLogradouroCodigoRepresentanteLegal(long value) {
        this.logradouroCodigoRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroTipoRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouroTipoRepresentanteLegal() {
        return logradouroTipoRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade logradouroTipoRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouroTipoRepresentanteLegal(String value) {
        this.logradouroTipoRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroNomeRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouroNomeRepresentanteLegal() {
        return logradouroNomeRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade logradouroNomeRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouroNomeRepresentanteLegal(String value) {
        this.logradouroNomeRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade bairroCodigoRepresentanteLegal.
     * 
     */
    public long getBairroCodigoRepresentanteLegal() {
        return bairroCodigoRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade bairroCodigoRepresentanteLegal.
     * 
     */
    public void setBairroCodigoRepresentanteLegal(long value) {
        this.bairroCodigoRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade bairroNomeRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairroNomeRepresentanteLegal() {
        return bairroNomeRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade bairroNomeRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairroNomeRepresentanteLegal(String value) {
        this.bairroNomeRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade telefoneRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneRepresentanteLegal() {
        return telefoneRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade telefoneRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneRepresentanteLegal(String value) {
        this.telefoneRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade numeroLogradouroRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLogradouroRepresentanteLegal() {
        return numeroLogradouroRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade numeroLogradouroRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLogradouroRepresentanteLegal(String value) {
        this.numeroLogradouroRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade complementoLogradouroRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoLogradouroRepresentanteLegal() {
        return complementoLogradouroRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade complementoLogradouroRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoLogradouroRepresentanteLegal(String value) {
        this.complementoLogradouroRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade emailRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailRepresentanteLegal() {
        return emailRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade emailRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailRepresentanteLegal(String value) {
        this.emailRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade cepRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEPRepresentanteLegal() {
        return cepRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade cepRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEPRepresentanteLegal(String value) {
        this.cepRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade municipioCodigoRepresentanteLegal.
     * 
     */
    public long getMunicipioCodigoRepresentanteLegal() {
        return municipioCodigoRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade municipioCodigoRepresentanteLegal.
     * 
     */
    public void setMunicipioCodigoRepresentanteLegal(long value) {
        this.municipioCodigoRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade municipioNomeRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioNomeRepresentanteLegal() {
        return municipioNomeRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade municipioNomeRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioNomeRepresentanteLegal(String value) {
        this.municipioNomeRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade municipioUFRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioUFRepresentanteLegal() {
        return municipioUFRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade municipioUFRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioUFRepresentanteLegal(String value) {
        this.municipioUFRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade paisCodigoRepresentanteLegal.
     * 
     */
    public long getPaisCodigoRepresentanteLegal() {
        return paisCodigoRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade paisCodigoRepresentanteLegal.
     * 
     */
    public void setPaisCodigoRepresentanteLegal(long value) {
        this.paisCodigoRepresentanteLegal = value;
    }

    /**
     * Obt�m o valor da propriedade paisNomeRepresentanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisNomeRepresentanteLegal() {
        return paisNomeRepresentanteLegal;
    }

    /**
     * Define o valor da propriedade paisNomeRepresentanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisNomeRepresentanteLegal(String value) {
        this.paisNomeRepresentanteLegal = value;
    }

}
