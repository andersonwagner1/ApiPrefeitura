
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultarDadosEmpresaResult" type="{Jucesp.Services.Licenciamentos.Licenciamento/01}ConsultarDadosEmpresaOut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultarDadosEmpresaResult"
})
@XmlRootElement(name = "ConsultarDadosEmpresaResponse", namespace = "Jucesp.Services.Licenciamentos.Licenciamento")
public class ConsultarDadosEmpresaResponse {

    @XmlElementRef(name = "ConsultarDadosEmpresaResult", namespace = "Jucesp.Services.Licenciamentos.Licenciamento", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsultarDadosEmpresaOut> consultarDadosEmpresaResult;

    /**
     * Obtém o valor da propriedade consultarDadosEmpresaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsultarDadosEmpresaOut }{@code >}
     *     
     */
    public JAXBElement<ConsultarDadosEmpresaOut> getConsultarDadosEmpresaResult() {
        return consultarDadosEmpresaResult;
    }

    /**
     * Define o valor da propriedade consultarDadosEmpresaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsultarDadosEmpresaOut }{@code >}
     *     
     */
    public void setConsultarDadosEmpresaResult(JAXBElement<ConsultarDadosEmpresaOut> value) {
        this.consultarDadosEmpresaResult = value;
    }

}
