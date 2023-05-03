
package br.com.prefeitura.diadema.ws.abaco.hmg.inscricao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Sdt_DadosCadastraisEmpresa.GrupoSubgrupoAtividadeItens complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_DadosCadastraisEmpresa.GrupoSubgrupoAtividadeItens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CodigoGrupoAtividade" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CodigoSubgrupoAtividade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoAtividade" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="TipoAtividade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataInicioAtividade" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * Obt�m o valor da propriedade codigoGrupoAtividade.
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
     * Obt�m o valor da propriedade codigoSubgrupoAtividade.
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
     * Obt�m o valor da propriedade codigoAtividade.
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
     * Obt�m o valor da propriedade tipoAtividade.
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
     * Obt�m o valor da propriedade dataInicioAtividade.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicioAtividade(String value) {
        this.dataInicioAtividade = value;
    }

}
