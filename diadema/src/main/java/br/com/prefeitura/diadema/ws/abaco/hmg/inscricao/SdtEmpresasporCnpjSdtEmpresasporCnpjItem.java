
package br.com.prefeitura.diadema.ws.abaco.hmg.inscricao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Sdt_EmpresasporCnpj.Sdt_EmpresasporCnpjItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_EmpresasporCnpj.Sdt_EmpresasporCnpjItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SituacaoCadastral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescSituacaoCadastral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DesRetorno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdRetorno" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_EmpresasporCnpj.Sdt_EmpresasporCnpjItem", propOrder = {

})
public class SdtEmpresasporCnpjSdtEmpresasporCnpjItem {

    @XmlElement(name = "InscricaoMunicipal")
    protected long inscricaoMunicipal;
    @XmlElement(name = "SituacaoCadastral", required = true)
    protected String situacaoCadastral;
    @XmlElement(name = "DescSituacaoCadastral", required = true)
    protected String descSituacaoCadastral;
    @XmlElement(name = "DesRetorno", required = true)
    protected String desRetorno;
    @XmlElement(name = "IdRetorno")
    protected byte idRetorno;

    /**
     * Obtém o valor da propriedade inscricaoMunicipal.
     * 
     */
    public long getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    /**
     * Define o valor da propriedade inscricaoMunicipal.
     * 
     */
    public void setInscricaoMunicipal(long value) {
        this.inscricaoMunicipal = value;
    }

    /**
     * Obtém o valor da propriedade situacaoCadastral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }

    /**
     * Define o valor da propriedade situacaoCadastral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoCadastral(String value) {
        this.situacaoCadastral = value;
    }

    /**
     * Obtém o valor da propriedade descSituacaoCadastral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSituacaoCadastral() {
        return descSituacaoCadastral;
    }

    /**
     * Define o valor da propriedade descSituacaoCadastral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSituacaoCadastral(String value) {
        this.descSituacaoCadastral = value;
    }

    /**
     * Obtém o valor da propriedade desRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesRetorno() {
        return desRetorno;
    }

    /**
     * Define o valor da propriedade desRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesRetorno(String value) {
        this.desRetorno = value;
    }

    /**
     * Obtém o valor da propriedade idRetorno.
     * 
     */
    public byte getIdRetorno() {
        return idRetorno;
    }

    /**
     * Define o valor da propriedade idRetorno.
     * 
     */
    public void setIdRetorno(byte value) {
        this.idRetorno = value;
    }

}
