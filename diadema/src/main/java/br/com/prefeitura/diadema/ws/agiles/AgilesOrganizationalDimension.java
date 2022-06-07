
package br.com.prefeitura.diadema.ws.agiles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de agilesOrganizationalDimension complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="agilesOrganizationalDimension">
 *   &lt;complexContent>
 *     &lt;extension base="{http://imagetechnology.com.br/agiles_services}agilesItem">
 *       &lt;sequence>
 *         &lt;element name="levelUpAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agilesOrganizationalDimension", propOrder = {
    "levelUpAllowed"
})
public class AgilesOrganizationalDimension
    extends AgilesItem
{

    protected boolean levelUpAllowed;

    /**
     * Obt�m o valor da propriedade levelUpAllowed.
     * 
     */
    public boolean isLevelUpAllowed() {
        return levelUpAllowed;
    }

    /**
     * Define o valor da propriedade levelUpAllowed.
     * 
     */
    public void setLevelUpAllowed(boolean value) {
        this.levelUpAllowed = value;
    }

}
