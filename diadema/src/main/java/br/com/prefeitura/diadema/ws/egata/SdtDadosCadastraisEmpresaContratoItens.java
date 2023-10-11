
package br.com.prefeitura.diadema.ws.egata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Classe Java de Sdt_DadosCadastraisEmpresa.ContratoItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_DadosCadastraisEmpresa.ContratoItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroContrato" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DataContrato" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ObservacaoContrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_DadosCadastraisEmpresa.ContratoItens", propOrder = {
    "numeroContrato",
    "dataContrato",
    "observacaoContrato"
})
public class SdtDadosCadastraisEmpresaContratoItens {

    @XmlElement(name = "NumeroContrato")
    protected long numeroContrato;
    @XmlElement(name = "DataContrato", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected String dataContrato;
    @XmlElement(name = "ObservacaoContrato", required = true)
    protected String observacaoContrato;

    /**
     * Obt�m o valor da propriedade numeroContrato.
     * 
     */
    public long getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Define o valor da propriedade numeroContrato.
     * 
     */
    public void setNumeroContrato(long value) {
        this.numeroContrato = value;
    }

    /**
     * Obt�m o valor da propriedade dataContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataContrato() {
        return dataContrato;
    }

    /**
     * Define o valor da propriedade dataContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataContrato(String value) {
        this.dataContrato = value;
    }

    /**
     * Obt�m o valor da propriedade observacaoContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoContrato() {
        return observacaoContrato;
    }

    /**
     * Define o valor da propriedade observacaoContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoContrato(String value) {
        this.observacaoContrato = value;
    }

}
