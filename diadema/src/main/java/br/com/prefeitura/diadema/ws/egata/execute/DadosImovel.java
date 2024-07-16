
package br.com.prefeitura.diadema.ws.egata.execute;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DadosImovel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosImovel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaImovel" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AreaEstabelecimento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AreaTerreno" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ComprimentoTestada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NumeroFuncionario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResponsavelInformacao" type="{Jucesp.Services.Data/01}Item" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosImovel", propOrder = {
    "areaImovel",
    "areaEstabelecimento",
    "areaTerreno",
    "comprimentoTestada",
    "numeroFuncionario",
    "responsavelInformacao"
})
public class DadosImovel {

    @XmlElementRef(name = "AreaImovel", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> areaImovel;
    @XmlElementRef(name = "AreaEstabelecimento", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> areaEstabelecimento;
    @XmlElementRef(name = "AreaTerreno", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> areaTerreno;
    @XmlElementRef(name = "ComprimentoTestada", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> comprimentoTestada;
    @XmlElementRef(name = "NumeroFuncionario", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numeroFuncionario;
    @XmlElementRef(name = "ResponsavelInformacao", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Item> responsavelInformacao;

    /**
     * Obtém o valor da propriedade areaImovel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAreaImovel() {
        return areaImovel;
    }

    /**
     * Define o valor da propriedade areaImovel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAreaImovel(JAXBElement<BigDecimal> value) {
        this.areaImovel = value;
    }

    /**
     * Obtém o valor da propriedade areaEstabelecimento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAreaEstabelecimento() {
        return areaEstabelecimento;
    }

    /**
     * Define o valor da propriedade areaEstabelecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAreaEstabelecimento(JAXBElement<BigDecimal> value) {
        this.areaEstabelecimento = value;
    }

    /**
     * Obtém o valor da propriedade areaTerreno.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAreaTerreno() {
        return areaTerreno;
    }

    /**
     * Define o valor da propriedade areaTerreno.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAreaTerreno(JAXBElement<BigDecimal> value) {
        this.areaTerreno = value;
    }

    /**
     * Obtém o valor da propriedade comprimentoTestada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getComprimentoTestada() {
        return comprimentoTestada;
    }

    /**
     * Define o valor da propriedade comprimentoTestada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setComprimentoTestada(JAXBElement<BigDecimal> value) {
        this.comprimentoTestada = value;
    }

    /**
     * Obtém o valor da propriedade numeroFuncionario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumeroFuncionario() {
        return numeroFuncionario;
    }

    /**
     * Define o valor da propriedade numeroFuncionario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumeroFuncionario(JAXBElement<Integer> value) {
        this.numeroFuncionario = value;
    }

    /**
     * Obtém o valor da propriedade responsavelInformacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public JAXBElement<Item> getResponsavelInformacao() {
        return responsavelInformacao;
    }

    /**
     * Define o valor da propriedade responsavelInformacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public void setResponsavelInformacao(JAXBElement<Item> value) {
        this.responsavelInformacao = value;
    }

}
