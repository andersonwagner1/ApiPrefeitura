
package br.com.prefeitura.diadema.ws.abaco.hmg.enviar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Sdt_DadosCadastraisEmpresa.GrupoSubgrupoAtividadeItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteï¿½do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_DadosCadastraisEmpresa.GrupoSubgrupoAtividadeItens"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CodigoGrupoAtividade" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CodigoSubgrupoAtividade" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CodigoAtividade" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="TipoAtividade" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DataInicioAtividade" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_DadosCadastraisEmpresa.GrupoSubgrupoAtividadeItens", propOrder = {

})
public class SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens {

    @XmlElement(name = "CodigoGrupoAtividade")
    protected short codigoGrupoAtividade;
    @XmlElement(name = "CodigoSubgrupoAtividade")
    protected int codigoSubgrupoAtividade;
    @XmlElement(name = "CodigoAtividade")
    protected short codigoAtividade;
    @XmlElement(name = "TipoAtividade", required = true)
    protected String tipoAtividade;
    @XmlElement(name = "DataInicioAtividade", required = true)
    @XmlSchemaType(name = "date")
    protected String dataInicioAtividade;

    /**
     * Obtï¿½m o valor da propriedade codigoGrupoAtividade.
     * 
     */
    public short getCodigoGrupoAtividade() {
        return codigoGrupoAtividade;
    }

    /**
     * Define o valor da propriedade codigoGrupoAtividade.
     * 
     */
    public void setCodigoGrupoAtividade(short value) {
        this.codigoGrupoAtividade = value;
    }

    /**
     * Obtï¿½m o valor da propriedade codigoSubgrupoAtividade.
     * 
     */
    public int getCodigoSubgrupoAtividade() {
        return codigoSubgrupoAtividade;
    }

    /**
     * Define o valor da propriedade codigoSubgrupoAtividade.
     * 
     */
    public void setCodigoSubgrupoAtividade(int value) {
        this.codigoSubgrupoAtividade = value;
    }

    /**
     * Obtï¿½m o valor da propriedade codigoAtividade.
     * 
     */
    public short getCodigoAtividade() {
        return codigoAtividade;
    }

    /**
     * Define o valor da propriedade codigoAtividade.
     * 
     */
    public void setCodigoAtividade(short value) {
        this.codigoAtividade = value;
    }

    /**
     * Obtï¿½m o valor da propriedade tipoAtividade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAtividade() {
        return tipoAtividade;
    }

    /**
     * Define o valor da propriedade tipoAtividade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAtividade(String value) {
        this.tipoAtividade = value;
    }

    /**
     * Obtï¿½m o valor da propriedade dataInicioAtividade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicioAtividade() {
        return dataInicioAtividade;
    }

    /**
     * Define o valor da propriedade dataInicioAtividade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicioAtividade(String value) {
        this.dataInicioAtividade = value;
    }

}