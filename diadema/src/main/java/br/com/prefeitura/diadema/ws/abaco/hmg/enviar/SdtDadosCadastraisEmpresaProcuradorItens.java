
package br.com.prefeitura.diadema.ws.abaco.hmg.enviar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Sdt_DadosCadastraisEmpresa.ProcuradorItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_DadosCadastraisEmpresa.ProcuradorItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroCpfProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroRgProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NomeProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrgaoExpedidorProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogradouroCodigoProcurador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LogradouroTipoProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogradouroNomeProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BairroCodigoProcurador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BairroNomeProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TelefoneProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroLogradouroProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ComplementoLogradouroProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EmailProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CEPProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MunicipioCodigoProcurador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MunicipioNomeProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MunicipioUfProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaisCodigoProcurador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PaisNomeProcurador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_DadosCadastraisEmpresa.ProcuradorItens", propOrder = {
    "numeroCpfProcurador",
    "numeroRgProcurador",
    "nomeProcurador",
    "orgaoExpedidorProcurador",
    "logradouroCodigoProcurador",
    "logradouroTipoProcurador",
    "logradouroNomeProcurador",
    "bairroCodigoProcurador",
    "bairroNomeProcurador",
    "telefoneProcurador",
    "numeroLogradouroProcurador",
    "complementoLogradouroProcurador",
    "emailProcurador",
    "cepProcurador",
    "municipioCodigoProcurador",
    "municipioNomeProcurador",
    "municipioUfProcurador",
    "paisCodigoProcurador",
    "paisNomeProcurador"
})
public class SdtDadosCadastraisEmpresaProcuradorItens {

    @XmlElement(name = "NumeroCpfProcurador", required = true)
    protected String numeroCpfProcurador;
    @XmlElement(name = "NumeroRgProcurador", required = true)
    protected String numeroRgProcurador;
    @XmlElement(name = "NomeProcurador", required = true)
    protected String nomeProcurador;
    @XmlElement(name = "OrgaoExpedidorProcurador", required = true)
    protected String orgaoExpedidorProcurador;
    @XmlElement(name = "LogradouroCodigoProcurador")
    protected long logradouroCodigoProcurador;
    @XmlElement(name = "LogradouroTipoProcurador", required = true)
    protected String logradouroTipoProcurador;
    @XmlElement(name = "LogradouroNomeProcurador", required = true)
    protected String logradouroNomeProcurador;
    @XmlElement(name = "BairroCodigoProcurador")
    protected long bairroCodigoProcurador;
    @XmlElement(name = "BairroNomeProcurador", required = true)
    protected String bairroNomeProcurador;
    @XmlElement(name = "TelefoneProcurador", required = true)
    protected String telefoneProcurador;
    @XmlElement(name = "NumeroLogradouroProcurador", required = true)
    protected String numeroLogradouroProcurador;
    @XmlElement(name = "ComplementoLogradouroProcurador", required = true)
    protected String complementoLogradouroProcurador;
    @XmlElement(name = "EmailProcurador", required = true)
    protected String emailProcurador;
    @XmlElement(name = "CEPProcurador", required = true)
    protected String cepProcurador;
    @XmlElement(name = "MunicipioCodigoProcurador")
    protected long municipioCodigoProcurador;
    @XmlElement(name = "MunicipioNomeProcurador", required = true)
    protected String municipioNomeProcurador;
    @XmlElement(name = "MunicipioUfProcurador", required = true)
    protected String municipioUfProcurador;
    @XmlElement(name = "PaisCodigoProcurador")
    protected long paisCodigoProcurador;
    @XmlElement(name = "PaisNomeProcurador", required = true)
    protected String paisNomeProcurador;

    /**
     * Obt�m o valor da propriedade numeroCpfProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCpfProcurador() {
        return numeroCpfProcurador;
    }

    /**
     * Define o valor da propriedade numeroCpfProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCpfProcurador(String value) {
        this.numeroCpfProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade numeroRgProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRgProcurador() {
        return numeroRgProcurador;
    }

    /**
     * Define o valor da propriedade numeroRgProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRgProcurador(String value) {
        this.numeroRgProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade nomeProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProcurador() {
        return nomeProcurador;
    }

    /**
     * Define o valor da propriedade nomeProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProcurador(String value) {
        this.nomeProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade orgaoExpedidorProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgaoExpedidorProcurador() {
        return orgaoExpedidorProcurador;
    }

    /**
     * Define o valor da propriedade orgaoExpedidorProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgaoExpedidorProcurador(String value) {
        this.orgaoExpedidorProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroCodigoProcurador.
     * 
     */
    public long getLogradouroCodigoProcurador() {
        return logradouroCodigoProcurador;
    }

    /**
     * Define o valor da propriedade logradouroCodigoProcurador.
     * 
     */
    public void setLogradouroCodigoProcurador(long value) {
        this.logradouroCodigoProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroTipoProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouroTipoProcurador() {
        return logradouroTipoProcurador;
    }

    /**
     * Define o valor da propriedade logradouroTipoProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouroTipoProcurador(String value) {
        this.logradouroTipoProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroNomeProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouroNomeProcurador() {
        return logradouroNomeProcurador;
    }

    /**
     * Define o valor da propriedade logradouroNomeProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouroNomeProcurador(String value) {
        this.logradouroNomeProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade bairroCodigoProcurador.
     * 
     */
    public long getBairroCodigoProcurador() {
        return bairroCodigoProcurador;
    }

    /**
     * Define o valor da propriedade bairroCodigoProcurador.
     * 
     */
    public void setBairroCodigoProcurador(long value) {
        this.bairroCodigoProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade bairroNomeProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairroNomeProcurador() {
        return bairroNomeProcurador;
    }

    /**
     * Define o valor da propriedade bairroNomeProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairroNomeProcurador(String value) {
        this.bairroNomeProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade telefoneProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneProcurador() {
        return telefoneProcurador;
    }

    /**
     * Define o valor da propriedade telefoneProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneProcurador(String value) {
        this.telefoneProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade numeroLogradouroProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLogradouroProcurador() {
        return numeroLogradouroProcurador;
    }

    /**
     * Define o valor da propriedade numeroLogradouroProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLogradouroProcurador(String value) {
        this.numeroLogradouroProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade complementoLogradouroProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoLogradouroProcurador() {
        return complementoLogradouroProcurador;
    }

    /**
     * Define o valor da propriedade complementoLogradouroProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoLogradouroProcurador(String value) {
        this.complementoLogradouroProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade emailProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailProcurador() {
        return emailProcurador;
    }

    /**
     * Define o valor da propriedade emailProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailProcurador(String value) {
        this.emailProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade cepProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEPProcurador() {
        return cepProcurador;
    }

    /**
     * Define o valor da propriedade cepProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEPProcurador(String value) {
        this.cepProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade municipioCodigoProcurador.
     * 
     */
    public long getMunicipioCodigoProcurador() {
        return municipioCodigoProcurador;
    }

    /**
     * Define o valor da propriedade municipioCodigoProcurador.
     * 
     */
    public void setMunicipioCodigoProcurador(long value) {
        this.municipioCodigoProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade municipioNomeProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioNomeProcurador() {
        return municipioNomeProcurador;
    }

    /**
     * Define o valor da propriedade municipioNomeProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioNomeProcurador(String value) {
        this.municipioNomeProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade municipioUfProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioUfProcurador() {
        return municipioUfProcurador;
    }

    /**
     * Define o valor da propriedade municipioUfProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioUfProcurador(String value) {
        this.municipioUfProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade paisCodigoProcurador.
     * 
     */
    public long getPaisCodigoProcurador() {
        return paisCodigoProcurador;
    }

    /**
     * Define o valor da propriedade paisCodigoProcurador.
     * 
     */
    public void setPaisCodigoProcurador(long value) {
        this.paisCodigoProcurador = value;
    }

    /**
     * Obt�m o valor da propriedade paisNomeProcurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisNomeProcurador() {
        return paisNomeProcurador;
    }

    /**
     * Define o valor da propriedade paisNomeProcurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisNomeProcurador(String value) {
        this.paisNomeProcurador = value;
    }

}
