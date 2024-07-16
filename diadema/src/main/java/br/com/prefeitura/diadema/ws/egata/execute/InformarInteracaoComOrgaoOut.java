
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InformarInteracaoComOrgaoOut complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InformarInteracaoComOrgaoOut">
 *   &lt;complexContent>
 *     &lt;extension base="{Jucesp.Services.Viabilidades.Data/01}MessageRequest">
 *       &lt;sequence>
 *         &lt;element name="Resultado" type="{Jucesp.Services.Data/01}RequestResult" minOccurs="0"/>
 *         &lt;element name="ResultadoList" type="{Jucesp.Services.Data/01}ArrayOfRequestResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformarInteracaoComOrgaoOut", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", propOrder = {
    "resultado",
    "resultadoList"
})
public class InformarInteracaoComOrgaoOut
    extends MessageRequest
{

    @XmlElementRef(name = "Resultado", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestResult> resultado;
    @XmlElementRef(name = "ResultadoList", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRequestResult> resultadoList;

    /**
     * Obtém o valor da propriedade resultado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestResult }{@code >}
     *     
     */
    public JAXBElement<RequestResult> getResultado() {
        return resultado;
    }

    /**
     * Define o valor da propriedade resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestResult }{@code >}
     *     
     */
    public void setResultado(JAXBElement<RequestResult> value) {
        this.resultado = value;
    }

    /**
     * Obtém o valor da propriedade resultadoList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRequestResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRequestResult> getResultadoList() {
        return resultadoList;
    }

    /**
     * Define o valor da propriedade resultadoList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRequestResult }{@code >}
     *     
     */
    public void setResultadoList(JAXBElement<ArrayOfRequestResult> value) {
        this.resultadoList = value;
    }

}
