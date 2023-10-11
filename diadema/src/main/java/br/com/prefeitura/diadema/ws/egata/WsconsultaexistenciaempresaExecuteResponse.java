
package br.com.prefeitura.diadema.ws.egata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Sdt_empresasporcnpj" type="{eAgata}Sdt_EmpresasporCnpj"/>
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
    "sdtEmpresasporcnpj"
})
@XmlRootElement(name = "wsconsultaexistenciaempresa.ExecuteResponse")
public class WsconsultaexistenciaempresaExecuteResponse {

    @XmlElement(name = "Sdt_empresasporcnpj", required = true)
    protected SdtEmpresasporCnpj sdtEmpresasporcnpj;

    /**
     * Obtém o valor da propriedade sdtEmpresasporcnpj.
     * 
     * @return
     *     possible object is
     *     {@link SdtEmpresasporCnpj }
     *     
     */
    public SdtEmpresasporCnpj getSdtEmpresasporcnpj() {
        return sdtEmpresasporcnpj;
    }

    /**
     * Define o valor da propriedade sdtEmpresasporcnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtEmpresasporCnpj }
     *     
     */
    public void setSdtEmpresasporcnpj(SdtEmpresasporCnpj value) {
        this.sdtEmpresasporcnpj = value;
    }

}
