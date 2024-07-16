
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ConsultarSolicitacaoLicenciamentoIn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConsultarSolicitacaoLicenciamentoIn">
 *   &lt;complexContent>
 *     &lt;extension base="{Jucesp.Services.Viabilidades.Data/01}MessageRequest">
 *       &lt;sequence>
 *         &lt;element name="IdSolicitacaoLicenciamento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarSolicitacaoLicenciamentoIn", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", propOrder = {
    "idSolicitacaoLicenciamento"
})
public class ConsultarSolicitacaoLicenciamentoIn
    extends MessageRequest
{

    @XmlElement(name = "IdSolicitacaoLicenciamento")
    protected Long idSolicitacaoLicenciamento;

    /**
     * Obtém o valor da propriedade idSolicitacaoLicenciamento.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSolicitacaoLicenciamento() {
        return idSolicitacaoLicenciamento;
    }

    /**
     * Define o valor da propriedade idSolicitacaoLicenciamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSolicitacaoLicenciamento(Long value) {
        this.idSolicitacaoLicenciamento = value;
    }

}
