
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
 *         &lt;element name="ListarSolicitacoesPorProtocoloREDESIMResult" type="{Jucesp.Services.Licenciamentos.Licenciamento/01}ListarSolicitacoesPorProtocoloREDESIMOut" minOccurs="0"/>
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
    "listarSolicitacoesPorProtocoloREDESIMResult"
})
@XmlRootElement(name = "ListarSolicitacoesPorProtocoloREDESIMResponse", namespace = "Jucesp.Services.Licenciamentos.Licenciamento")
public class ListarSolicitacoesPorProtocoloREDESIMResponse {

    @XmlElementRef(name = "ListarSolicitacoesPorProtocoloREDESIMResult", namespace = "Jucesp.Services.Licenciamentos.Licenciamento", type = JAXBElement.class, required = false)
    protected JAXBElement<ListarSolicitacoesPorProtocoloREDESIMOut> listarSolicitacoesPorProtocoloREDESIMResult;

    /**
     * Obtém o valor da propriedade listarSolicitacoesPorProtocoloREDESIMResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorProtocoloREDESIMOut }{@code >}
     *     
     */
    public JAXBElement<ListarSolicitacoesPorProtocoloREDESIMOut> getListarSolicitacoesPorProtocoloREDESIMResult() {
        return listarSolicitacoesPorProtocoloREDESIMResult;
    }

    /**
     * Define o valor da propriedade listarSolicitacoesPorProtocoloREDESIMResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorProtocoloREDESIMOut }{@code >}
     *     
     */
    public void setListarSolicitacoesPorProtocoloREDESIMResult(JAXBElement<ListarSolicitacoesPorProtocoloREDESIMOut> value) {
        this.listarSolicitacoesPorProtocoloREDESIMResult = value;
    }

}
