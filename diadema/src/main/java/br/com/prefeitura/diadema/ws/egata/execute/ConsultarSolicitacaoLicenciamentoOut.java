
package br.com.prefeitura.diadema.ws.egata.execute;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ConsultarSolicitacaoLicenciamentoOut complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConsultarSolicitacaoLicenciamentoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdSolicitacaoLicenca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Solicitante" type="{Jucesp.Services.Data/01}Pessoa" minOccurs="0"/>
 *         &lt;element name="ProtocoloViabilidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SituacoesSolicitacao" type="{http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities}ArrayOfSituacaoSolicitacaoEntity" minOccurs="0"/>
 *         &lt;element name="Estabelecimento" type="{Jucesp.Services.Data/01}Estabelecimento" minOccurs="0"/>
 *         &lt;element name="Licencas" type="{http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities}ArrayOfLicencaEntity" minOccurs="0"/>
 *         &lt;element name="Resultado" type="{Jucesp.Services.Data/01}RequestResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarSolicitacaoLicenciamentoOut", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", propOrder = {
    "idSolicitacaoLicenca",
    "solicitante",
    "protocoloViabilidade",
    "cnpj",
    "situacoesSolicitacao",
    "estabelecimento",
    "licencas",
    "resultado"
})
public class ConsultarSolicitacaoLicenciamentoOut {

    @XmlElement(name = "IdSolicitacaoLicenca")
    protected Long idSolicitacaoLicenca;
    @XmlElementRef(name = "Solicitante", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Pessoa> solicitante;
    @XmlElementRef(name = "ProtocoloViabilidade", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protocoloViabilidade;
    @XmlElementRef(name = "CNPJ", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpj;
    @XmlElementRef(name = "SituacoesSolicitacao", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSituacaoSolicitacaoEntity> situacoesSolicitacao;
    @XmlElementRef(name = "Estabelecimento", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Estabelecimento> estabelecimento;
    @XmlElementRef(name = "Licencas", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLicencaEntity> licencas;
    @XmlElementRef(name = "Resultado", namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestResult> resultado;

    /**
     * Obtém o valor da propriedade idSolicitacaoLicenca.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSolicitacaoLicenca() {
        return idSolicitacaoLicenca;
    }

    /**
     * Define o valor da propriedade idSolicitacaoLicenca.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSolicitacaoLicenca(Long value) {
        this.idSolicitacaoLicenca = value;
    }

    /**
     * Obtém o valor da propriedade solicitante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Pessoa }{@code >}
     *     
     */
    public JAXBElement<Pessoa> getSolicitante() {
        return solicitante;
    }

    /**
     * Define o valor da propriedade solicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Pessoa }{@code >}
     *     
     */
    public void setSolicitante(JAXBElement<Pessoa> value) {
        this.solicitante = value;
    }

    /**
     * Obtém o valor da propriedade protocoloViabilidade.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtocoloViabilidade() {
        return protocoloViabilidade;
    }

    /**
     * Define o valor da propriedade protocoloViabilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtocoloViabilidade(JAXBElement<String> value) {
        this.protocoloViabilidade = value;
    }

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNPJ() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNPJ(JAXBElement<String> value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade situacoesSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSituacaoSolicitacaoEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSituacaoSolicitacaoEntity> getSituacoesSolicitacao() {
        return situacoesSolicitacao;
    }

    /**
     * Define o valor da propriedade situacoesSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSituacaoSolicitacaoEntity }{@code >}
     *     
     */
    public void setSituacoesSolicitacao(JAXBElement<ArrayOfSituacaoSolicitacaoEntity> value) {
        this.situacoesSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade estabelecimento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Estabelecimento }{@code >}
     *     
     */
    public JAXBElement<Estabelecimento> getEstabelecimento() {
        return estabelecimento;
    }

    /**
     * Define o valor da propriedade estabelecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Estabelecimento }{@code >}
     *     
     */
    public void setEstabelecimento(JAXBElement<Estabelecimento> value) {
        this.estabelecimento = value;
    }

    /**
     * Obtém o valor da propriedade licencas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicencaEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLicencaEntity> getLicencas() {
        return licencas;
    }

    /**
     * Define o valor da propriedade licencas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicencaEntity }{@code >}
     *     
     */
    public void setLicencas(JAXBElement<ArrayOfLicencaEntity> value) {
        this.licencas = value;
    }

    /**
     * Obtém o valor da propriedade resultado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestResult }{@code >}
     *     
     */
    public JAXBElement<RequestResult> getResultado() {
        return resultado;
    }

    /**
     * Define o valor da propriedade resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestResult }{@code >}
     *     
     */
    public void setResultado(JAXBElement<RequestResult> value) {
        this.resultado = value;
    }

}
