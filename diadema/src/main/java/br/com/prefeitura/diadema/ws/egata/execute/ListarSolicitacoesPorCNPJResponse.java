
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
 *         &lt;element name="ListarSolicitacoesPorCNPJResult" type="{Jucesp.Services.Licenciamentos.Licenciamento/01}ListarSolicitacoesPorCNJPOut" minOccurs="0"/>
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
    "listarSolicitacoesPorCNPJResult"
})
@XmlRootElement(name = "ListarSolicitacoesPorCNPJResponse", namespace = "Jucesp.Services.Licenciamentos.Licenciamento")
public class ListarSolicitacoesPorCNPJResponse {

    @XmlElementRef(name = "ListarSolicitacoesPorCNPJResult", namespace = "Jucesp.Services.Licenciamentos.Licenciamento", type = JAXBElement.class, required = false)
    protected JAXBElement<ListarSolicitacoesPorCNJPOut> listarSolicitacoesPorCNPJResult;

    /**
     * Obtém o valor da propriedade listarSolicitacoesPorCNPJResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorCNJPOut }{@code >}
     *     
     */
    public JAXBElement<ListarSolicitacoesPorCNJPOut> getListarSolicitacoesPorCNPJResult() {
        return listarSolicitacoesPorCNPJResult;
    }

    /**
     * Define o valor da propriedade listarSolicitacoesPorCNPJResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorCNJPOut }{@code >}
     *     
     */
    public void setListarSolicitacoesPorCNPJResult(JAXBElement<ListarSolicitacoesPorCNJPOut> value) {
        this.listarSolicitacoesPorCNPJResult = value;
    }

}
