
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de agilesOrganizationalLevel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="agilesOrganizationalLevel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imagetechnology.com.br/agiles_services}agilesItem">
 *       &lt;sequence>
 *         &lt;element name="dimension" type="{http://imagetechnology.com.br/agiles_services}agilesOrganizationalDimension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agilesOrganizationalLevel", propOrder = {
    "dimension"
})
public class AgilesOrganizationalLevel
    extends AgilesItem
{

    protected AgilesOrganizationalDimension dimension;

    /**
     * Obt�m o valor da propriedade dimension.
     * 
     * @return
     *     possible object is
     *     {@link AgilesOrganizationalDimension }
     *     
     */
    public AgilesOrganizationalDimension getDimension() {
        return dimension;
    }

    /**
     * Define o valor da propriedade dimension.
     * 
     * @param value
     *     allowed object is
     *     {@link AgilesOrganizationalDimension }
     *     
     */
    public void setDimension(AgilesOrganizationalDimension value) {
        this.dimension = value;
    }

}
