
package br.com.prefeitura.diadema.ws.abaco.hmg.enviar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Sdt_DadosCadastraisEmpresa.SocioItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_DadosCadastraisEmpresa.SocioItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroCpfSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroRgSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NomeSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrgaoExpedidorSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogradouroCodigoSocio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LogradouroTipoSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogradouroNomeSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BairroCodigoSocio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BairroNomeSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TelefoneSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroLogradouroSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ComplementoLogradouroSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EmailSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CEPSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MunicipioCodigoSocio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MunicipioNomeSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MunicipioUfSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaisCodigoSocio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PaisNomeSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_DadosCadastraisEmpresa.SocioItens", propOrder = {
    "numeroCpfSocio",
    "numeroRgSocio",
    "nomeSocio",
    "orgaoExpedidorSocio",
    "logradouroCodigoSocio",
    "logradouroTipoSocio",
    "logradouroNomeSocio",
    "bairroCodigoSocio",
    "bairroNomeSocio",
    "telefoneSocio",
    "numeroLogradouroSocio",
    "complementoLogradouroSocio",
    "emailSocio",
    "cepSocio",
    "municipioCodigoSocio",
    "municipioNomeSocio",
    "municipioUfSocio",
    "paisCodigoSocio",
    "paisNomeSocio"
})
public class SdtDadosCadastraisEmpresaSocioItens {

    @XmlElement(name = "NumeroCpfSocio", required = true)
    protected String numeroCpfSocio;
    @XmlElement(name = "NumeroRgSocio", required = true)
    protected String numeroRgSocio;
    @XmlElement(name = "NomeSocio", required = true)
    protected String nomeSocio;
    @XmlElement(name = "OrgaoExpedidorSocio", required = true)
    protected String orgaoExpedidorSocio;
    @XmlElement(name = "LogradouroCodigoSocio")
    protected long logradouroCodigoSocio;
    @XmlElement(name = "LogradouroTipoSocio", required = true)
    protected String logradouroTipoSocio;
    @XmlElement(name = "LogradouroNomeSocio", required = true)
    protected String logradouroNomeSocio;
    @XmlElement(name = "BairroCodigoSocio")
    protected long bairroCodigoSocio;
    @XmlElement(name = "BairroNomeSocio", required = true)
    protected String bairroNomeSocio;
    @XmlElement(name = "TelefoneSocio", required = true)
    protected String telefoneSocio;
    @XmlElement(name = "NumeroLogradouroSocio", required = true)
    protected String numeroLogradouroSocio;
    @XmlElement(name = "ComplementoLogradouroSocio", required = true)
    protected String complementoLogradouroSocio;
    @XmlElement(name = "EmailSocio", required = true)
    protected String emailSocio;
    @XmlElement(name = "CEPSocio", required = true)
    protected String cepSocio;
    @XmlElement(name = "MunicipioCodigoSocio")
    protected long municipioCodigoSocio;
    @XmlElement(name = "MunicipioNomeSocio", required = true)
    protected String municipioNomeSocio;
    @XmlElement(name = "MunicipioUfSocio", required = true)
    protected String municipioUfSocio;
    @XmlElement(name = "PaisCodigoSocio")
    protected long paisCodigoSocio;
    @XmlElement(name = "PaisNomeSocio", required = true)
    protected String paisNomeSocio;

    /**
     * Obt�m o valor da propriedade numeroCpfSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCpfSocio() {
        return numeroCpfSocio;
    }

    /**
     * Define o valor da propriedade numeroCpfSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCpfSocio(String value) {
        this.numeroCpfSocio = value;
    }

    /**
     * Obt�m o valor da propriedade numeroRgSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRgSocio() {
        return numeroRgSocio;
    }

    /**
     * Define o valor da propriedade numeroRgSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRgSocio(String value) {
        this.numeroRgSocio = value;
    }

    /**
     * Obt�m o valor da propriedade nomeSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSocio() {
        return nomeSocio;
    }

    /**
     * Define o valor da propriedade nomeSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSocio(String value) {
        this.nomeSocio = value;
    }

    /**
     * Obt�m o valor da propriedade orgaoExpedidorSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgaoExpedidorSocio() {
        return orgaoExpedidorSocio;
    }

    /**
     * Define o valor da propriedade orgaoExpedidorSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgaoExpedidorSocio(String value) {
        this.orgaoExpedidorSocio = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroCodigoSocio.
     * 
     */
    public long getLogradouroCodigoSocio() {
        return logradouroCodigoSocio;
    }

    /**
     * Define o valor da propriedade logradouroCodigoSocio.
     * 
     */
    public void setLogradouroCodigoSocio(long value) {
        this.logradouroCodigoSocio = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroTipoSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouroTipoSocio() {
        return logradouroTipoSocio;
    }

    /**
     * Define o valor da propriedade logradouroTipoSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouroTipoSocio(String value) {
        this.logradouroTipoSocio = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroNomeSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouroNomeSocio() {
        return logradouroNomeSocio;
    }

    /**
     * Define o valor da propriedade logradouroNomeSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouroNomeSocio(String value) {
        this.logradouroNomeSocio = value;
    }

    /**
     * Obt�m o valor da propriedade bairroCodigoSocio.
     * 
     */
    public long getBairroCodigoSocio() {
        return bairroCodigoSocio;
    }

    /**
     * Define o valor da propriedade bairroCodigoSocio.
     * 
     */
    public void setBairroCodigoSocio(long value) {
        this.bairroCodigoSocio = value;
    }

    /**
     * Obt�m o valor da propriedade bairroNomeSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairroNomeSocio() {
        return bairroNomeSocio;
    }

    /**
     * Define o valor da propriedade bairroNomeSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairroNomeSocio(String value) {
        this.bairroNomeSocio = value;
    }

    /**
     * Obt�m o valor da propriedade telefoneSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneSocio() {
        return telefoneSocio;
    }

    /**
     * Define o valor da propriedade telefoneSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneSocio(String value) {
        this.telefoneSocio = value;
    }

    /**
     * Obt�m o valor da propriedade numeroLogradouroSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLogradouroSocio() {
        return numeroLogradouroSocio;
    }

    /**
     * Define o valor da propriedade numeroLogradouroSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLogradouroSocio(String value) {
        this.numeroLogradouroSocio = value;
    }

    /**
     * Obt�m o valor da propriedade complementoLogradouroSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoLogradouroSocio() {
        return complementoLogradouroSocio;
    }

    /**
     * Define o valor da propriedade complementoLogradouroSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoLogradouroSocio(String value) {
        this.complementoLogradouroSocio = value;
    }

    /**
     * Obt�m o valor da propriedade emailSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSocio() {
        return emailSocio;
    }

    /**
     * Define o valor da propriedade emailSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSocio(String value) {
        this.emailSocio = value;
    }

    /**
     * Obt�m o valor da propriedade cepSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEPSocio() {
        return cepSocio;
    }

    /**
     * Define o valor da propriedade cepSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEPSocio(String value) {
        this.cepSocio = value;
    }

    /**
     * Obt�m o valor da propriedade municipioCodigoSocio.
     * 
     */
    public long getMunicipioCodigoSocio() {
        return municipioCodigoSocio;
    }

    /**
     * Define o valor da propriedade municipioCodigoSocio.
     * 
     */
    public void setMunicipioCodigoSocio(long value) {
        this.municipioCodigoSocio = value;
    }

    /**
     * Obt�m o valor da propriedade municipioNomeSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioNomeSocio() {
        return municipioNomeSocio;
    }

    /**
     * Define o valor da propriedade municipioNomeSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioNomeSocio(String value) {
        this.municipioNomeSocio = value;
    }

    /**
     * Obt�m o valor da propriedade municipioUfSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioUfSocio() {
        return municipioUfSocio;
    }

    /**
     * Define o valor da propriedade municipioUfSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioUfSocio(String value) {
        this.municipioUfSocio = value;
    }

    /**
     * Obt�m o valor da propriedade paisCodigoSocio.
     * 
     */
    public long getPaisCodigoSocio() {
        return paisCodigoSocio;
    }

    /**
     * Define o valor da propriedade paisCodigoSocio.
     * 
     */
    public void setPaisCodigoSocio(long value) {
        this.paisCodigoSocio = value;
    }

    /**
     * Obt�m o valor da propriedade paisNomeSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisNomeSocio() {
        return paisNomeSocio;
    }

    /**
     * Define o valor da propriedade paisNomeSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisNomeSocio(String value) {
        this.paisNomeSocio = value;
    }

}
