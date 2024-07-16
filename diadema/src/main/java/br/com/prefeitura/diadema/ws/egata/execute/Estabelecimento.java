
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Estabelecimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Estabelecimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Estabelecido" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnderecosViabilidade" type="{Jucesp.Services.Data/01}ArrayOfEnderecoViabilidade" minOccurs="0"/>
 *         &lt;element name="InformacoesImovel" type="{Jucesp.Services.Data/01}ArrayOfDadosImovel" minOccurs="0"/>
 *         &lt;element name="TipoUnidade" type="{Jucesp.Services.Data/01}Item" minOccurs="0"/>
 *         &lt;element name="FormasAtuacao" type="{Jucesp.Services.Data/01}ArrayOfItem" minOccurs="0"/>
 *         &lt;element name="Cnaes" type="{Jucesp.Services.Data/01}ArrayOfCnae" minOccurs="0"/>
 *         &lt;element name="AtividadeAuxiliares" type="{Jucesp.Services.Data/01}ArrayOfAtividadeAuxiliar" minOccurs="0"/>
 *         &lt;element name="DadosComplementares" type="{Jucesp.Services.Data/01}DadosComplementares" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Estabelecimento", propOrder = {
    "estabelecido",
    "enderecosViabilidade",
    "informacoesImovel",
    "tipoUnidade",
    "formasAtuacao",
    "cnaes",
    "atividadeAuxiliares",
    "dadosComplementares"
})
public class Estabelecimento {

    @XmlElement(name = "Estabelecido")
    protected Boolean estabelecido;
    @XmlElementRef(name = "EnderecosViabilidade", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEnderecoViabilidade> enderecosViabilidade;
    @XmlElementRef(name = "InformacoesImovel", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDadosImovel> informacoesImovel;
    @XmlElementRef(name = "TipoUnidade", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Item> tipoUnidade;
    @XmlElementRef(name = "FormasAtuacao", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfItem> formasAtuacao;
    @XmlElementRef(name = "Cnaes", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCnae> cnaes;
    @XmlElementRef(name = "AtividadeAuxiliares", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAtividadeAuxiliar> atividadeAuxiliares;
    @XmlElementRef(name = "DadosComplementares", namespace = "Jucesp.Services.Data/01", type = JAXBElement.class, required = false)
    protected JAXBElement<DadosComplementares> dadosComplementares;

    /**
     * Obtém o valor da propriedade estabelecido.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstabelecido() {
        return estabelecido;
    }

    /**
     * Define o valor da propriedade estabelecido.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstabelecido(Boolean value) {
        this.estabelecido = value;
    }

    /**
     * Obtém o valor da propriedade enderecosViabilidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEnderecoViabilidade }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEnderecoViabilidade> getEnderecosViabilidade() {
        return enderecosViabilidade;
    }

    /**
     * Define o valor da propriedade enderecosViabilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEnderecoViabilidade }{@code >}
     *     
     */
    public void setEnderecosViabilidade(JAXBElement<ArrayOfEnderecoViabilidade> value) {
        this.enderecosViabilidade = value;
    }

    /**
     * Obtém o valor da propriedade informacoesImovel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosImovel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDadosImovel> getInformacoesImovel() {
        return informacoesImovel;
    }

    /**
     * Define o valor da propriedade informacoesImovel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDadosImovel }{@code >}
     *     
     */
    public void setInformacoesImovel(JAXBElement<ArrayOfDadosImovel> value) {
        this.informacoesImovel = value;
    }

    /**
     * Obtém o valor da propriedade tipoUnidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public JAXBElement<Item> getTipoUnidade() {
        return tipoUnidade;
    }

    /**
     * Define o valor da propriedade tipoUnidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     
     */
    public void setTipoUnidade(JAXBElement<Item> value) {
        this.tipoUnidade = value;
    }

    /**
     * Obtém o valor da propriedade formasAtuacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfItem> getFormasAtuacao() {
        return formasAtuacao;
    }

    /**
     * Define o valor da propriedade formasAtuacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItem }{@code >}
     *     
     */
    public void setFormasAtuacao(JAXBElement<ArrayOfItem> value) {
        this.formasAtuacao = value;
    }

    /**
     * Obtém o valor da propriedade cnaes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCnae }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCnae> getCnaes() {
        return cnaes;
    }

    /**
     * Define o valor da propriedade cnaes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCnae }{@code >}
     *     
     */
    public void setCnaes(JAXBElement<ArrayOfCnae> value) {
        this.cnaes = value;
    }

    /**
     * Obtém o valor da propriedade atividadeAuxiliares.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAtividadeAuxiliar }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAtividadeAuxiliar> getAtividadeAuxiliares() {
        return atividadeAuxiliares;
    }

    /**
     * Define o valor da propriedade atividadeAuxiliares.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAtividadeAuxiliar }{@code >}
     *     
     */
    public void setAtividadeAuxiliares(JAXBElement<ArrayOfAtividadeAuxiliar> value) {
        this.atividadeAuxiliares = value;
    }

    /**
     * Obtém o valor da propriedade dadosComplementares.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DadosComplementares }{@code >}
     *     
     */
    public JAXBElement<DadosComplementares> getDadosComplementares() {
        return dadosComplementares;
    }

    /**
     * Define o valor da propriedade dadosComplementares.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DadosComplementares }{@code >}
     *     
     */
    public void setDadosComplementares(JAXBElement<DadosComplementares> value) {
        this.dadosComplementares = value;
    }

}
