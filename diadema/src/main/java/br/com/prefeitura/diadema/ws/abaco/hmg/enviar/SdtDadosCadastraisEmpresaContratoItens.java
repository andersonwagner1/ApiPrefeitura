
package br.com.prefeitura.diadema.ws.abaco.hmg.enviar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Sdt_DadosCadastraisEmpresa.ContratoItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteï¿½do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_DadosCadastraisEmpresa.ContratoItens"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="NumeroContrato" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DataContrato" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ObservacaoContrato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_DadosCadastraisEmpresa.ContratoItens", propOrder = {

})
public class SdtDadosCadastraisEmpresaContratoItens {

    @XmlElement(name = "NumeroContrato")
    protected int numeroContrato;
    @XmlElement(name = "DataContrato", required = true)
    @XmlSchemaType(name = "date")
    protected String dataContrato;
    @XmlElement(name = "ObservacaoContrato", required = true)
    protected String observacaoContrato;

    /**
     * Obtï¿½m o valor da propriedade numeroContrato.
     * 
     */
    public int getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Define o valor da propriedade numeroContrato.
     * 
     */
    public void setNumeroContrato(int value) {
        this.numeroContrato = value;
    }

    /**
     * Obtï¿½m o valor da propriedade dataContrato.
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
     * Obtï¿½m o valor da propriedade observacaoContrato.
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
