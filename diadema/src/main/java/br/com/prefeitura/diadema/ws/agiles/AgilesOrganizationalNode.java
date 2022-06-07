
package br.com.prefeitura.diadema.ws.agiles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de agilesOrganizationalNode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="agilesOrganizationalNode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imagetechnology.com.br/agiles_services}agilesItem">
 *       &lt;sequence>
 *         &lt;element name="levels" type="{http://imagetechnology.com.br/agiles_services}agilesOrganizationalLevel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agilesOrganizationalNode", propOrder = {
    "levels"
})
public class AgilesOrganizationalNode
    extends AgilesItem
{

    @XmlElement(nillable = true)
    protected List<AgilesOrganizationalLevel> levels;

    /**
     * Gets the value of the levels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgilesOrganizationalLevel }
     * 
     * 
     */
    public List<AgilesOrganizationalLevel> getLevels() {
        if (levels == null) {
            levels = new ArrayList<AgilesOrganizationalLevel>();
        }
        return this.levels;
    }

}
