
package br.com.prefeitura.diadema.ws.abaco.hmg.enviar;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Sdt_DadosCadastraisEmpresa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Sdt_DadosCadastraisEmpresa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FLGACAO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DesRetorno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdRetorno" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="InscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SituacaoCadastral" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="DescSituacaoCadastral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RazaoSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NomeFantasia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoNaturezaJuridica" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DescricaoNaturezaJuridica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValidadeCertificadoLicenciamentoIntegrado" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NumeroCertificadoLicenciamentoIntegrado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InscricaoEstadual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataInicalMEI" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NumeroCNPJ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoTipoISSQN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescricaoTipoISSQN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SituacaoTLFInicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataAberturaEmpresa" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DataCadastroPrefeitura" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NumeroCRCContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UFCRCContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NomeEscritorioContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogradouroNomeEscritorioContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroEscritorioContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BairroNomeEscritorioContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MunicipioCodigoEscritorioContador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MunicipioNomeEscritorioContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MunicipioUFEscritorioContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TelefoneEscritorioContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CEPEscritorioContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NomeContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroCPFContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroRGContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrgaoExpedidorContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogradouroCodigoContador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LogradouroTipoContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogradouroNomeContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BairroCodigoContador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BairroNomeContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TelefoneContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroLogradouroContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ComplementoLogradouroContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CEPContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MunicipioCodigoContador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MunicipioNomeContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MunicipioUFContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FAXContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EmailContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CNPJContador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QtdeFuncionarios" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="QtdeProfissionais" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ValorCapitalSocial" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NumeroRegistroJunta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataRegistroJunta" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ProcessoUltimaAlteracaoJunta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataUltimaAlteracaoJunta" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="InscricaoImobiliaria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroTelefoneEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraEntradaPrimario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraSaidaPrimario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraEntradaSecundario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraSaidaSecundario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraEntradaSabado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraSaidaSabado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraEntradaDomingo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoraSaidaDomingo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ObservacaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EmailEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MediaAreaOcupada" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LogradouroCodigoLocalizacaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BairroCodigoLocalizacaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NumeroLocalizacaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CEPLocalizacaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MunicipioCodigoLocalizacaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ComplementoLocalizacaoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoClassificacaoAtividadeEconomica" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="DescricaoClassificacaoAtividadeEconomica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ComplementoAtividadeEconomica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EmpresaAutonomo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Contratos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContratoItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.ContratoItens" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cnaes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CnaeItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.CnaeItens" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CaracteristicasFuncionamento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CaracteristicaFuncionamentoItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.CaracteristicaFuncionamentoItens" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Socios">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SocioItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.SocioItens" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Procuradores">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProcuradorItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.ProcuradorItens" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RepresentantesLegais">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RepresentanteLegalItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.RepresentanteLegalItens" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Servicos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServicoItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.ServicoItens" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GrupoSubgrupoAtividades">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GrupoSubgrupoAtividadeItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.GrupoSubgrupoAtividadeItens" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sdt_DadosCadastraisEmpresa", propOrder = {
    "flgacao",
    "desRetorno",
    "idRetorno",
    "inscricaoMunicipal",
    "situacaoCadastral",
    "descSituacaoCadastral",
    "razaoSocial",
    "nomeFantasia",
    "codigoNaturezaJuridica",
    "descricaoNaturezaJuridica",
    "validadeCertificadoLicenciamentoIntegrado",
    "numeroCertificadoLicenciamentoIntegrado",
    "inscricaoEstadual",
    "dataInicalMEI",
    "numeroCNPJ",
    "codigoTipoISSQN",
    "descricaoTipoISSQN",
    "situacaoTLFInicial",
    "dataAberturaEmpresa",
    "dataCadastroPrefeitura",
    "numeroCRCContador",
    "ufcrcContador",
    "nomeEscritorioContador",
    "logradouroNomeEscritorioContador",
    "numeroEscritorioContador",
    "bairroNomeEscritorioContador",
    "municipioCodigoEscritorioContador",
    "municipioNomeEscritorioContador",
    "municipioUFEscritorioContador",
    "telefoneEscritorioContador",
    "cepEscritorioContador",
    "nomeContador",
    "numeroCPFContador",
    "numeroRGContador",
    "orgaoExpedidorContador",
    "logradouroCodigoContador",
    "logradouroTipoContador",
    "logradouroNomeContador",
    "bairroCodigoContador",
    "bairroNomeContador",
    "telefoneContador",
    "numeroLogradouroContador",
    "complementoLogradouroContador",
    "cepContador",
    "municipioCodigoContador",
    "municipioNomeContador",
    "municipioUFContador",
    "faxContador",
    "emailContador",
    "cnpjContador",
    "qtdeFuncionarios",
    "qtdeProfissionais",
    "valorCapitalSocial",
    "numeroRegistroJunta",
    "dataRegistroJunta",
    "processoUltimaAlteracaoJunta",
    "dataUltimaAlteracaoJunta",
    "inscricaoImobiliaria",
    "numeroTelefoneEmpresa",
    "horaEntradaPrimario",
    "horaSaidaPrimario",
    "horaEntradaSecundario",
    "horaSaidaSecundario",
    "horaEntradaSabado",
    "horaSaidaSabado",
    "horaEntradaDomingo",
    "horaSaidaDomingo",
    "observacaoEmpresa",
    "emailEmpresa",
    "mediaAreaOcupada",
    "logradouroCodigoLocalizacaoEmpresa",
    "bairroCodigoLocalizacaoEmpresa",
    "numeroLocalizacaoEmpresa",
    "cepLocalizacaoEmpresa",
    "municipioCodigoLocalizacaoEmpresa",
    "complementoLocalizacaoEmpresa",
    "codigoClassificacaoAtividadeEconomica",
    "descricaoClassificacaoAtividadeEconomica",
    "complementoAtividadeEconomica",
    "empresaAutonomo",
    "contratos",
    "cnaes",
    "caracteristicasFuncionamento",
    "socios",
    "procuradores",
    "representantesLegais",
    "servicos",
    "grupoSubgrupoAtividades"
})
public class SdtDadosCadastraisEmpresa {

    @XmlElement(name = "FLGACAO", required = true)
    protected String flgacao;
    @XmlElement(name = "DesRetorno", required = true)
    protected String desRetorno;
    @XmlElement(name = "IdRetorno")
    protected byte idRetorno;
    @XmlElement(name = "InscricaoMunicipal")
    protected long inscricaoMunicipal;
    @XmlElement(name = "SituacaoCadastral")
    protected byte situacaoCadastral;
    @XmlElement(name = "DescSituacaoCadastral", required = true)
    protected String descSituacaoCadastral;
    @XmlElement(name = "RazaoSocial", required = true)
    protected String razaoSocial;
    @XmlElement(name = "NomeFantasia", required = true)
    protected String nomeFantasia;
    @XmlElement(name = "CodigoNaturezaJuridica")
    protected int codigoNaturezaJuridica;
    @XmlElement(name = "DescricaoNaturezaJuridica", required = true)
    protected String descricaoNaturezaJuridica;
    @XmlElement(name = "ValidadeCertificadoLicenciamentoIntegrado", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validadeCertificadoLicenciamentoIntegrado;
    @XmlElement(name = "NumeroCertificadoLicenciamentoIntegrado", required = true)
    protected String numeroCertificadoLicenciamentoIntegrado;
    @XmlElement(name = "InscricaoEstadual", required = true)
    protected String inscricaoEstadual;
    @XmlElement(name = "DataInicalMEI", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataInicalMEI;
    @XmlElement(name = "NumeroCNPJ", required = true)
    protected String numeroCNPJ;
    @XmlElement(name = "CodigoTipoISSQN", required = true)
    protected String codigoTipoISSQN;
    @XmlElement(name = "DescricaoTipoISSQN", required = true)
    protected String descricaoTipoISSQN;
    @XmlElement(name = "SituacaoTLFInicial", required = true)
    protected String situacaoTLFInicial;
    @XmlElement(name = "DataAberturaEmpresa", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAberturaEmpresa;
    @XmlElement(name = "DataCadastroPrefeitura", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataCadastroPrefeitura;
    @XmlElement(name = "NumeroCRCContador", required = true)
    protected String numeroCRCContador;
    @XmlElement(name = "UFCRCContador", required = true)
    protected String ufcrcContador;
    @XmlElement(name = "NomeEscritorioContador", required = true)
    protected String nomeEscritorioContador;
    @XmlElement(name = "LogradouroNomeEscritorioContador", required = true)
    protected String logradouroNomeEscritorioContador;
    @XmlElement(name = "NumeroEscritorioContador", required = true)
    protected String numeroEscritorioContador;
    @XmlElement(name = "BairroNomeEscritorioContador", required = true)
    protected String bairroNomeEscritorioContador;
    @XmlElement(name = "MunicipioCodigoEscritorioContador")
    protected long municipioCodigoEscritorioContador;
    @XmlElement(name = "MunicipioNomeEscritorioContador", required = true)
    protected String municipioNomeEscritorioContador;
    @XmlElement(name = "MunicipioUFEscritorioContador", required = true)
    protected String municipioUFEscritorioContador;
    @XmlElement(name = "TelefoneEscritorioContador", required = true)
    protected String telefoneEscritorioContador;
    @XmlElement(name = "CEPEscritorioContador", required = true)
    protected String cepEscritorioContador;
    @XmlElement(name = "NomeContador", required = true)
    protected String nomeContador;
    @XmlElement(name = "NumeroCPFContador", required = true)
    protected String numeroCPFContador;
    @XmlElement(name = "NumeroRGContador", required = true)
    protected String numeroRGContador;
    @XmlElement(name = "OrgaoExpedidorContador", required = true)
    protected String orgaoExpedidorContador;
    @XmlElement(name = "LogradouroCodigoContador")
    protected long logradouroCodigoContador;
    @XmlElement(name = "LogradouroTipoContador", required = true)
    protected String logradouroTipoContador;
    @XmlElement(name = "LogradouroNomeContador", required = true)
    protected String logradouroNomeContador;
    @XmlElement(name = "BairroCodigoContador")
    protected long bairroCodigoContador;
    @XmlElement(name = "BairroNomeContador", required = true)
    protected String bairroNomeContador;
    @XmlElement(name = "TelefoneContador", required = true)
    protected String telefoneContador;
    @XmlElement(name = "NumeroLogradouroContador", required = true)
    protected String numeroLogradouroContador;
    @XmlElement(name = "ComplementoLogradouroContador", required = true)
    protected String complementoLogradouroContador;
    @XmlElement(name = "CEPContador", required = true)
    protected String cepContador;
    @XmlElement(name = "MunicipioCodigoContador")
    protected long municipioCodigoContador;
    @XmlElement(name = "MunicipioNomeContador", required = true)
    protected String municipioNomeContador;
    @XmlElement(name = "MunicipioUFContador", required = true)
    protected String municipioUFContador;
    @XmlElement(name = "FAXContador", required = true)
    protected String faxContador;
    @XmlElement(name = "EmailContador", required = true)
    protected String emailContador;
    @XmlElement(name = "CNPJContador", required = true)
    protected String cnpjContador;
    @XmlElement(name = "QtdeFuncionarios")
    protected short qtdeFuncionarios;
    @XmlElement(name = "QtdeProfissionais")
    protected short qtdeProfissionais;
    @XmlElement(name = "ValorCapitalSocial")
    protected double valorCapitalSocial;
    @XmlElement(name = "NumeroRegistroJunta", required = true)
    protected String numeroRegistroJunta;
    @XmlElement(name = "DataRegistroJunta", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataRegistroJunta;
    @XmlElement(name = "ProcessoUltimaAlteracaoJunta", required = true)
    protected String processoUltimaAlteracaoJunta;
    @XmlElement(name = "DataUltimaAlteracaoJunta", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataUltimaAlteracaoJunta;
    @XmlElement(name = "InscricaoImobiliaria", required = true)
    protected String inscricaoImobiliaria;
    @XmlElement(name = "NumeroTelefoneEmpresa", required = true)
    protected String numeroTelefoneEmpresa;
    @XmlElement(name = "HoraEntradaPrimario", required = true)
    protected String horaEntradaPrimario;
    @XmlElement(name = "HoraSaidaPrimario", required = true)
    protected String horaSaidaPrimario;
    @XmlElement(name = "HoraEntradaSecundario", required = true)
    protected String horaEntradaSecundario;
    @XmlElement(name = "HoraSaidaSecundario", required = true)
    protected String horaSaidaSecundario;
    @XmlElement(name = "HoraEntradaSabado", required = true)
    protected String horaEntradaSabado;
    @XmlElement(name = "HoraSaidaSabado", required = true)
    protected String horaSaidaSabado;
    @XmlElement(name = "HoraEntradaDomingo", required = true)
    protected String horaEntradaDomingo;
    @XmlElement(name = "HoraSaidaDomingo", required = true)
    protected String horaSaidaDomingo;
    @XmlElement(name = "ObservacaoEmpresa", required = true)
    protected String observacaoEmpresa;
    @XmlElement(name = "EmailEmpresa", required = true)
    protected String emailEmpresa;
    @XmlElement(name = "MediaAreaOcupada")
    protected double mediaAreaOcupada;
    @XmlElement(name = "LogradouroCodigoLocalizacaoEmpresa")
    protected long logradouroCodigoLocalizacaoEmpresa;
    @XmlElement(name = "BairroCodigoLocalizacaoEmpresa")
    protected long bairroCodigoLocalizacaoEmpresa;
    @XmlElement(name = "NumeroLocalizacaoEmpresa", required = true)
    protected String numeroLocalizacaoEmpresa;
    @XmlElement(name = "CEPLocalizacaoEmpresa", required = true)
    protected String cepLocalizacaoEmpresa;
    @XmlElement(name = "MunicipioCodigoLocalizacaoEmpresa")
    protected long municipioCodigoLocalizacaoEmpresa;
    @XmlElement(name = "ComplementoLocalizacaoEmpresa", required = true)
    protected String complementoLocalizacaoEmpresa;
    @XmlElement(name = "CodigoClassificacaoAtividadeEconomica")
    protected byte codigoClassificacaoAtividadeEconomica;
    @XmlElement(name = "DescricaoClassificacaoAtividadeEconomica", required = true)
    protected String descricaoClassificacaoAtividadeEconomica;
    @XmlElement(name = "ComplementoAtividadeEconomica", required = true)
    protected String complementoAtividadeEconomica;
    @XmlElement(name = "EmpresaAutonomo")
    protected byte empresaAutonomo;
    @XmlElement(name = "Contratos", required = true)
    protected SdtDadosCadastraisEmpresa.Contratos contratos;
    @XmlElement(name = "Cnaes", required = true)
    protected SdtDadosCadastraisEmpresa.Cnaes cnaes;
    @XmlElement(name = "CaracteristicasFuncionamento", required = true)
    protected SdtDadosCadastraisEmpresa.CaracteristicasFuncionamento caracteristicasFuncionamento;
    @XmlElement(name = "Socios", required = true)
    protected SdtDadosCadastraisEmpresa.Socios socios;
    @XmlElement(name = "Procuradores", required = true)
    protected SdtDadosCadastraisEmpresa.Procuradores procuradores;
    @XmlElement(name = "RepresentantesLegais", required = true)
    protected SdtDadosCadastraisEmpresa.RepresentantesLegais representantesLegais;
    @XmlElement(name = "Servicos", required = true)
    protected SdtDadosCadastraisEmpresa.Servicos servicos;
    @XmlElement(name = "GrupoSubgrupoAtividades", required = true)
    protected SdtDadosCadastraisEmpresa.GrupoSubgrupoAtividades grupoSubgrupoAtividades;

    /**
     * Obt�m o valor da propriedade flgacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLGACAO() {
        return flgacao;
    }

    /**
     * Define o valor da propriedade flgacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLGACAO(String value) {
        this.flgacao = value;
    }

    /**
     * Obt�m o valor da propriedade desRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesRetorno() {
        return desRetorno;
    }

    /**
     * Define o valor da propriedade desRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesRetorno(String value) {
        this.desRetorno = value;
    }

    /**
     * Obt�m o valor da propriedade idRetorno.
     * 
     */
    public byte getIdRetorno() {
        return idRetorno;
    }

    /**
     * Define o valor da propriedade idRetorno.
     * 
     */
    public void setIdRetorno(byte value) {
        this.idRetorno = value;
    }

    /**
     * Obt�m o valor da propriedade inscricaoMunicipal.
     * 
     */
    public long getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    /**
     * Define o valor da propriedade inscricaoMunicipal.
     * 
     */
    public void setInscricaoMunicipal(long value) {
        this.inscricaoMunicipal = value;
    }

    /**
     * Obt�m o valor da propriedade situacaoCadastral.
     * 
     */
    public byte getSituacaoCadastral() {
        return situacaoCadastral;
    }

    /**
     * Define o valor da propriedade situacaoCadastral.
     * 
     */
    public void setSituacaoCadastral(byte value) {
        this.situacaoCadastral = value;
    }

    /**
     * Obt�m o valor da propriedade descSituacaoCadastral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSituacaoCadastral() {
        return descSituacaoCadastral;
    }

    /**
     * Define o valor da propriedade descSituacaoCadastral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSituacaoCadastral(String value) {
        this.descSituacaoCadastral = value;
    }

    /**
     * Obt�m o valor da propriedade razaoSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Define o valor da propriedade razaoSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
    }

    /**
     * Obt�m o valor da propriedade nomeFantasia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * Define o valor da propriedade nomeFantasia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFantasia(String value) {
        this.nomeFantasia = value;
    }

    /**
     * Obt�m o valor da propriedade codigoNaturezaJuridica.
     * 
     */
    public int getCodigoNaturezaJuridica() {
        return codigoNaturezaJuridica;
    }

    /**
     * Define o valor da propriedade codigoNaturezaJuridica.
     * 
     */
    public void setCodigoNaturezaJuridica(int value) {
        this.codigoNaturezaJuridica = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoNaturezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoNaturezaJuridica() {
        return descricaoNaturezaJuridica;
    }

    /**
     * Define o valor da propriedade descricaoNaturezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoNaturezaJuridica(String value) {
        this.descricaoNaturezaJuridica = value;
    }

    /**
     * Obt�m o valor da propriedade validadeCertificadoLicenciamentoIntegrado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidadeCertificadoLicenciamentoIntegrado() {
        return validadeCertificadoLicenciamentoIntegrado;
    }

    /**
     * Define o valor da propriedade validadeCertificadoLicenciamentoIntegrado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidadeCertificadoLicenciamentoIntegrado(XMLGregorianCalendar value) {
        this.validadeCertificadoLicenciamentoIntegrado = value;
    }

    /**
     * Obt�m o valor da propriedade numeroCertificadoLicenciamentoIntegrado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCertificadoLicenciamentoIntegrado() {
        return numeroCertificadoLicenciamentoIntegrado;
    }

    /**
     * Define o valor da propriedade numeroCertificadoLicenciamentoIntegrado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCertificadoLicenciamentoIntegrado(String value) {
        this.numeroCertificadoLicenciamentoIntegrado = value;
    }

    /**
     * Obt�m o valor da propriedade inscricaoEstadual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    /**
     * Define o valor da propriedade inscricaoEstadual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoEstadual(String value) {
        this.inscricaoEstadual = value;
    }

    /**
     * Obt�m o valor da propriedade dataInicalMEI.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicalMEI() {
        return dataInicalMEI;
    }

    /**
     * Define o valor da propriedade dataInicalMEI.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicalMEI(XMLGregorianCalendar value) {
        this.dataInicalMEI = value;
    }

    /**
     * Obt�m o valor da propriedade numeroCNPJ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCNPJ() {
        return numeroCNPJ;
    }

    /**
     * Define o valor da propriedade numeroCNPJ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCNPJ(String value) {
        this.numeroCNPJ = value;
    }

    /**
     * Obt�m o valor da propriedade codigoTipoISSQN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoISSQN() {
        return codigoTipoISSQN;
    }

    /**
     * Define o valor da propriedade codigoTipoISSQN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoISSQN(String value) {
        this.codigoTipoISSQN = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoTipoISSQN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoTipoISSQN() {
        return descricaoTipoISSQN;
    }

    /**
     * Define o valor da propriedade descricaoTipoISSQN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoTipoISSQN(String value) {
        this.descricaoTipoISSQN = value;
    }

    /**
     * Obt�m o valor da propriedade situacaoTLFInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoTLFInicial() {
        return situacaoTLFInicial;
    }

    /**
     * Define o valor da propriedade situacaoTLFInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoTLFInicial(String value) {
        this.situacaoTLFInicial = value;
    }

    /**
     * Obt�m o valor da propriedade dataAberturaEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAberturaEmpresa() {
        return dataAberturaEmpresa;
    }

    /**
     * Define o valor da propriedade dataAberturaEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAberturaEmpresa(XMLGregorianCalendar value) {
        this.dataAberturaEmpresa = value;
    }

    /**
     * Obt�m o valor da propriedade dataCadastroPrefeitura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCadastroPrefeitura() {
        return dataCadastroPrefeitura;
    }

    /**
     * Define o valor da propriedade dataCadastroPrefeitura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCadastroPrefeitura(XMLGregorianCalendar value) {
        this.dataCadastroPrefeitura = value;
    }

    /**
     * Obt�m o valor da propriedade numeroCRCContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCRCContador() {
        return numeroCRCContador;
    }

    /**
     * Define o valor da propriedade numeroCRCContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCRCContador(String value) {
        this.numeroCRCContador = value;
    }

    /**
     * Obt�m o valor da propriedade ufcrcContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFCRCContador() {
        return ufcrcContador;
    }

    /**
     * Define o valor da propriedade ufcrcContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFCRCContador(String value) {
        this.ufcrcContador = value;
    }

    /**
     * Obt�m o valor da propriedade nomeEscritorioContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEscritorioContador() {
        return nomeEscritorioContador;
    }

    /**
     * Define o valor da propriedade nomeEscritorioContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEscritorioContador(String value) {
        this.nomeEscritorioContador = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroNomeEscritorioContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouroNomeEscritorioContador() {
        return logradouroNomeEscritorioContador;
    }

    /**
     * Define o valor da propriedade logradouroNomeEscritorioContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouroNomeEscritorioContador(String value) {
        this.logradouroNomeEscritorioContador = value;
    }

    /**
     * Obt�m o valor da propriedade numeroEscritorioContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEscritorioContador() {
        return numeroEscritorioContador;
    }

    /**
     * Define o valor da propriedade numeroEscritorioContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEscritorioContador(String value) {
        this.numeroEscritorioContador = value;
    }

    /**
     * Obt�m o valor da propriedade bairroNomeEscritorioContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairroNomeEscritorioContador() {
        return bairroNomeEscritorioContador;
    }

    /**
     * Define o valor da propriedade bairroNomeEscritorioContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairroNomeEscritorioContador(String value) {
        this.bairroNomeEscritorioContador = value;
    }

    /**
     * Obt�m o valor da propriedade municipioCodigoEscritorioContador.
     * 
     */
    public long getMunicipioCodigoEscritorioContador() {
        return municipioCodigoEscritorioContador;
    }

    /**
     * Define o valor da propriedade municipioCodigoEscritorioContador.
     * 
     */
    public void setMunicipioCodigoEscritorioContador(long value) {
        this.municipioCodigoEscritorioContador = value;
    }

    /**
     * Obt�m o valor da propriedade municipioNomeEscritorioContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioNomeEscritorioContador() {
        return municipioNomeEscritorioContador;
    }

    /**
     * Define o valor da propriedade municipioNomeEscritorioContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioNomeEscritorioContador(String value) {
        this.municipioNomeEscritorioContador = value;
    }

    /**
     * Obt�m o valor da propriedade municipioUFEscritorioContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioUFEscritorioContador() {
        return municipioUFEscritorioContador;
    }

    /**
     * Define o valor da propriedade municipioUFEscritorioContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioUFEscritorioContador(String value) {
        this.municipioUFEscritorioContador = value;
    }

    /**
     * Obt�m o valor da propriedade telefoneEscritorioContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneEscritorioContador() {
        return telefoneEscritorioContador;
    }

    /**
     * Define o valor da propriedade telefoneEscritorioContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneEscritorioContador(String value) {
        this.telefoneEscritorioContador = value;
    }

    /**
     * Obt�m o valor da propriedade cepEscritorioContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEPEscritorioContador() {
        return cepEscritorioContador;
    }

    /**
     * Define o valor da propriedade cepEscritorioContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEPEscritorioContador(String value) {
        this.cepEscritorioContador = value;
    }

    /**
     * Obt�m o valor da propriedade nomeContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeContador() {
        return nomeContador;
    }

    /**
     * Define o valor da propriedade nomeContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeContador(String value) {
        this.nomeContador = value;
    }

    /**
     * Obt�m o valor da propriedade numeroCPFContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCPFContador() {
        return numeroCPFContador;
    }

    /**
     * Define o valor da propriedade numeroCPFContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCPFContador(String value) {
        this.numeroCPFContador = value;
    }

    /**
     * Obt�m o valor da propriedade numeroRGContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRGContador() {
        return numeroRGContador;
    }

    /**
     * Define o valor da propriedade numeroRGContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRGContador(String value) {
        this.numeroRGContador = value;
    }

    /**
     * Obt�m o valor da propriedade orgaoExpedidorContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgaoExpedidorContador() {
        return orgaoExpedidorContador;
    }

    /**
     * Define o valor da propriedade orgaoExpedidorContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgaoExpedidorContador(String value) {
        this.orgaoExpedidorContador = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroCodigoContador.
     * 
     */
    public long getLogradouroCodigoContador() {
        return logradouroCodigoContador;
    }

    /**
     * Define o valor da propriedade logradouroCodigoContador.
     * 
     */
    public void setLogradouroCodigoContador(long value) {
        this.logradouroCodigoContador = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroTipoContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouroTipoContador() {
        return logradouroTipoContador;
    }

    /**
     * Define o valor da propriedade logradouroTipoContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouroTipoContador(String value) {
        this.logradouroTipoContador = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroNomeContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouroNomeContador() {
        return logradouroNomeContador;
    }

    /**
     * Define o valor da propriedade logradouroNomeContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouroNomeContador(String value) {
        this.logradouroNomeContador = value;
    }

    /**
     * Obt�m o valor da propriedade bairroCodigoContador.
     * 
     */
    public long getBairroCodigoContador() {
        return bairroCodigoContador;
    }

    /**
     * Define o valor da propriedade bairroCodigoContador.
     * 
     */
    public void setBairroCodigoContador(long value) {
        this.bairroCodigoContador = value;
    }

    /**
     * Obt�m o valor da propriedade bairroNomeContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairroNomeContador() {
        return bairroNomeContador;
    }

    /**
     * Define o valor da propriedade bairroNomeContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairroNomeContador(String value) {
        this.bairroNomeContador = value;
    }

    /**
     * Obt�m o valor da propriedade telefoneContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneContador() {
        return telefoneContador;
    }

    /**
     * Define o valor da propriedade telefoneContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneContador(String value) {
        this.telefoneContador = value;
    }

    /**
     * Obt�m o valor da propriedade numeroLogradouroContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLogradouroContador() {
        return numeroLogradouroContador;
    }

    /**
     * Define o valor da propriedade numeroLogradouroContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLogradouroContador(String value) {
        this.numeroLogradouroContador = value;
    }

    /**
     * Obt�m o valor da propriedade complementoLogradouroContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoLogradouroContador() {
        return complementoLogradouroContador;
    }

    /**
     * Define o valor da propriedade complementoLogradouroContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoLogradouroContador(String value) {
        this.complementoLogradouroContador = value;
    }

    /**
     * Obt�m o valor da propriedade cepContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEPContador() {
        return cepContador;
    }

    /**
     * Define o valor da propriedade cepContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEPContador(String value) {
        this.cepContador = value;
    }

    /**
     * Obt�m o valor da propriedade municipioCodigoContador.
     * 
     */
    public long getMunicipioCodigoContador() {
        return municipioCodigoContador;
    }

    /**
     * Define o valor da propriedade municipioCodigoContador.
     * 
     */
    public void setMunicipioCodigoContador(long value) {
        this.municipioCodigoContador = value;
    }

    /**
     * Obt�m o valor da propriedade municipioNomeContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioNomeContador() {
        return municipioNomeContador;
    }

    /**
     * Define o valor da propriedade municipioNomeContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioNomeContador(String value) {
        this.municipioNomeContador = value;
    }

    /**
     * Obt�m o valor da propriedade municipioUFContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioUFContador() {
        return municipioUFContador;
    }

    /**
     * Define o valor da propriedade municipioUFContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioUFContador(String value) {
        this.municipioUFContador = value;
    }

    /**
     * Obt�m o valor da propriedade faxContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAXContador() {
        return faxContador;
    }

    /**
     * Define o valor da propriedade faxContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAXContador(String value) {
        this.faxContador = value;
    }

    /**
     * Obt�m o valor da propriedade emailContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailContador() {
        return emailContador;
    }

    /**
     * Define o valor da propriedade emailContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailContador(String value) {
        this.emailContador = value;
    }

    /**
     * Obt�m o valor da propriedade cnpjContador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJContador() {
        return cnpjContador;
    }

    /**
     * Define o valor da propriedade cnpjContador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJContador(String value) {
        this.cnpjContador = value;
    }

    /**
     * Obt�m o valor da propriedade qtdeFuncionarios.
     * 
     */
    public short getQtdeFuncionarios() {
        return qtdeFuncionarios;
    }

    /**
     * Define o valor da propriedade qtdeFuncionarios.
     * 
     */
    public void setQtdeFuncionarios(short value) {
        this.qtdeFuncionarios = value;
    }

    /**
     * Obt�m o valor da propriedade qtdeProfissionais.
     * 
     */
    public short getQtdeProfissionais() {
        return qtdeProfissionais;
    }

    /**
     * Define o valor da propriedade qtdeProfissionais.
     * 
     */
    public void setQtdeProfissionais(short value) {
        this.qtdeProfissionais = value;
    }

    /**
     * Obt�m o valor da propriedade valorCapitalSocial.
     * 
     */
    public double getValorCapitalSocial() {
        return valorCapitalSocial;
    }

    /**
     * Define o valor da propriedade valorCapitalSocial.
     * 
     */
    public void setValorCapitalSocial(double value) {
        this.valorCapitalSocial = value;
    }

    /**
     * Obt�m o valor da propriedade numeroRegistroJunta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRegistroJunta() {
        return numeroRegistroJunta;
    }

    /**
     * Define o valor da propriedade numeroRegistroJunta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRegistroJunta(String value) {
        this.numeroRegistroJunta = value;
    }

    /**
     * Obt�m o valor da propriedade dataRegistroJunta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRegistroJunta() {
        return dataRegistroJunta;
    }

    /**
     * Define o valor da propriedade dataRegistroJunta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRegistroJunta(XMLGregorianCalendar value) {
        this.dataRegistroJunta = value;
    }

    /**
     * Obt�m o valor da propriedade processoUltimaAlteracaoJunta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessoUltimaAlteracaoJunta() {
        return processoUltimaAlteracaoJunta;
    }

    /**
     * Define o valor da propriedade processoUltimaAlteracaoJunta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessoUltimaAlteracaoJunta(String value) {
        this.processoUltimaAlteracaoJunta = value;
    }

    /**
     * Obt�m o valor da propriedade dataUltimaAlteracaoJunta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUltimaAlteracaoJunta() {
        return dataUltimaAlteracaoJunta;
    }

    /**
     * Define o valor da propriedade dataUltimaAlteracaoJunta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUltimaAlteracaoJunta(XMLGregorianCalendar value) {
        this.dataUltimaAlteracaoJunta = value;
    }

    /**
     * Obt�m o valor da propriedade inscricaoImobiliaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoImobiliaria() {
        return inscricaoImobiliaria;
    }

    /**
     * Define o valor da propriedade inscricaoImobiliaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoImobiliaria(String value) {
        this.inscricaoImobiliaria = value;
    }

    /**
     * Obt�m o valor da propriedade numeroTelefoneEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTelefoneEmpresa() {
        return numeroTelefoneEmpresa;
    }

    /**
     * Define o valor da propriedade numeroTelefoneEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTelefoneEmpresa(String value) {
        this.numeroTelefoneEmpresa = value;
    }

    /**
     * Obt�m o valor da propriedade horaEntradaPrimario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraEntradaPrimario() {
        return horaEntradaPrimario;
    }

    /**
     * Define o valor da propriedade horaEntradaPrimario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraEntradaPrimario(String value) {
        this.horaEntradaPrimario = value;
    }

    /**
     * Obt�m o valor da propriedade horaSaidaPrimario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraSaidaPrimario() {
        return horaSaidaPrimario;
    }

    /**
     * Define o valor da propriedade horaSaidaPrimario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraSaidaPrimario(String value) {
        this.horaSaidaPrimario = value;
    }

    /**
     * Obt�m o valor da propriedade horaEntradaSecundario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraEntradaSecundario() {
        return horaEntradaSecundario;
    }

    /**
     * Define o valor da propriedade horaEntradaSecundario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraEntradaSecundario(String value) {
        this.horaEntradaSecundario = value;
    }

    /**
     * Obt�m o valor da propriedade horaSaidaSecundario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraSaidaSecundario() {
        return horaSaidaSecundario;
    }

    /**
     * Define o valor da propriedade horaSaidaSecundario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraSaidaSecundario(String value) {
        this.horaSaidaSecundario = value;
    }

    /**
     * Obt�m o valor da propriedade horaEntradaSabado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraEntradaSabado() {
        return horaEntradaSabado;
    }

    /**
     * Define o valor da propriedade horaEntradaSabado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraEntradaSabado(String value) {
        this.horaEntradaSabado = value;
    }

    /**
     * Obt�m o valor da propriedade horaSaidaSabado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraSaidaSabado() {
        return horaSaidaSabado;
    }

    /**
     * Define o valor da propriedade horaSaidaSabado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraSaidaSabado(String value) {
        this.horaSaidaSabado = value;
    }

    /**
     * Obt�m o valor da propriedade horaEntradaDomingo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraEntradaDomingo() {
        return horaEntradaDomingo;
    }

    /**
     * Define o valor da propriedade horaEntradaDomingo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraEntradaDomingo(String value) {
        this.horaEntradaDomingo = value;
    }

    /**
     * Obt�m o valor da propriedade horaSaidaDomingo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraSaidaDomingo() {
        return horaSaidaDomingo;
    }

    /**
     * Define o valor da propriedade horaSaidaDomingo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraSaidaDomingo(String value) {
        this.horaSaidaDomingo = value;
    }

    /**
     * Obt�m o valor da propriedade observacaoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoEmpresa() {
        return observacaoEmpresa;
    }

    /**
     * Define o valor da propriedade observacaoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoEmpresa(String value) {
        this.observacaoEmpresa = value;
    }

    /**
     * Obt�m o valor da propriedade emailEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    /**
     * Define o valor da propriedade emailEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailEmpresa(String value) {
        this.emailEmpresa = value;
    }

    /**
     * Obt�m o valor da propriedade mediaAreaOcupada.
     * 
     */
    public double getMediaAreaOcupada() {
        return mediaAreaOcupada;
    }

    /**
     * Define o valor da propriedade mediaAreaOcupada.
     * 
     */
    public void setMediaAreaOcupada(double value) {
        this.mediaAreaOcupada = value;
    }

    /**
     * Obt�m o valor da propriedade logradouroCodigoLocalizacaoEmpresa.
     * 
     */
    public long getLogradouroCodigoLocalizacaoEmpresa() {
        return logradouroCodigoLocalizacaoEmpresa;
    }

    /**
     * Define o valor da propriedade logradouroCodigoLocalizacaoEmpresa.
     * 
     */
    public void setLogradouroCodigoLocalizacaoEmpresa(long value) {
        this.logradouroCodigoLocalizacaoEmpresa = value;
    }

    /**
     * Obt�m o valor da propriedade bairroCodigoLocalizacaoEmpresa.
     * 
     */
    public long getBairroCodigoLocalizacaoEmpresa() {
        return bairroCodigoLocalizacaoEmpresa;
    }

    /**
     * Define o valor da propriedade bairroCodigoLocalizacaoEmpresa.
     * 
     */
    public void setBairroCodigoLocalizacaoEmpresa(long value) {
        this.bairroCodigoLocalizacaoEmpresa = value;
    }

    /**
     * Obt�m o valor da propriedade numeroLocalizacaoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLocalizacaoEmpresa() {
        return numeroLocalizacaoEmpresa;
    }

    /**
     * Define o valor da propriedade numeroLocalizacaoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLocalizacaoEmpresa(String value) {
        this.numeroLocalizacaoEmpresa = value;
    }

    /**
     * Obt�m o valor da propriedade cepLocalizacaoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEPLocalizacaoEmpresa() {
        return cepLocalizacaoEmpresa;
    }

    /**
     * Define o valor da propriedade cepLocalizacaoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEPLocalizacaoEmpresa(String value) {
        this.cepLocalizacaoEmpresa = value;
    }

    /**
     * Obt�m o valor da propriedade municipioCodigoLocalizacaoEmpresa.
     * 
     */
    public long getMunicipioCodigoLocalizacaoEmpresa() {
        return municipioCodigoLocalizacaoEmpresa;
    }

    /**
     * Define o valor da propriedade municipioCodigoLocalizacaoEmpresa.
     * 
     */
    public void setMunicipioCodigoLocalizacaoEmpresa(long value) {
        this.municipioCodigoLocalizacaoEmpresa = value;
    }

    /**
     * Obt�m o valor da propriedade complementoLocalizacaoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoLocalizacaoEmpresa() {
        return complementoLocalizacaoEmpresa;
    }

    /**
     * Define o valor da propriedade complementoLocalizacaoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoLocalizacaoEmpresa(String value) {
        this.complementoLocalizacaoEmpresa = value;
    }

    /**
     * Obt�m o valor da propriedade codigoClassificacaoAtividadeEconomica.
     * 
     */
    public byte getCodigoClassificacaoAtividadeEconomica() {
        return codigoClassificacaoAtividadeEconomica;
    }

    /**
     * Define o valor da propriedade codigoClassificacaoAtividadeEconomica.
     * 
     */
    public void setCodigoClassificacaoAtividadeEconomica(byte value) {
        this.codigoClassificacaoAtividadeEconomica = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoClassificacaoAtividadeEconomica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoClassificacaoAtividadeEconomica() {
        return descricaoClassificacaoAtividadeEconomica;
    }

    /**
     * Define o valor da propriedade descricaoClassificacaoAtividadeEconomica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoClassificacaoAtividadeEconomica(String value) {
        this.descricaoClassificacaoAtividadeEconomica = value;
    }

    /**
     * Obt�m o valor da propriedade complementoAtividadeEconomica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoAtividadeEconomica() {
        return complementoAtividadeEconomica;
    }

    /**
     * Define o valor da propriedade complementoAtividadeEconomica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoAtividadeEconomica(String value) {
        this.complementoAtividadeEconomica = value;
    }

    /**
     * Obt�m o valor da propriedade empresaAutonomo.
     * 
     */
    public byte getEmpresaAutonomo() {
        return empresaAutonomo;
    }

    /**
     * Define o valor da propriedade empresaAutonomo.
     * 
     */
    public void setEmpresaAutonomo(byte value) {
        this.empresaAutonomo = value;
    }

    /**
     * Obt�m o valor da propriedade contratos.
     * 
     * @return
     *     possible object is
     *     {@link SdtDadosCadastraisEmpresa.Contratos }
     *     
     */
    public SdtDadosCadastraisEmpresa.Contratos getContratos() {
        return contratos;
    }

    /**
     * Define o valor da propriedade contratos.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtDadosCadastraisEmpresa.Contratos }
     *     
     */
    public void setContratos(SdtDadosCadastraisEmpresa.Contratos value) {
        this.contratos = value;
    }

    /**
     * Obt�m o valor da propriedade cnaes.
     * 
     * @return
     *     possible object is
     *     {@link SdtDadosCadastraisEmpresa.Cnaes }
     *     
     */
    public SdtDadosCadastraisEmpresa.Cnaes getCnaes() {
        return cnaes;
    }

    /**
     * Define o valor da propriedade cnaes.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtDadosCadastraisEmpresa.Cnaes }
     *     
     */
    public void setCnaes(SdtDadosCadastraisEmpresa.Cnaes value) {
        this.cnaes = value;
    }

    /**
     * Obt�m o valor da propriedade caracteristicasFuncionamento.
     * 
     * @return
     *     possible object is
     *     {@link SdtDadosCadastraisEmpresa.CaracteristicasFuncionamento }
     *     
     */
    public SdtDadosCadastraisEmpresa.CaracteristicasFuncionamento getCaracteristicasFuncionamento() {
        return caracteristicasFuncionamento;
    }

    /**
     * Define o valor da propriedade caracteristicasFuncionamento.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtDadosCadastraisEmpresa.CaracteristicasFuncionamento }
     *     
     */
    public void setCaracteristicasFuncionamento(SdtDadosCadastraisEmpresa.CaracteristicasFuncionamento value) {
        this.caracteristicasFuncionamento = value;
    }

    /**
     * Obt�m o valor da propriedade socios.
     * 
     * @return
     *     possible object is
     *     {@link SdtDadosCadastraisEmpresa.Socios }
     *     
     */
    public SdtDadosCadastraisEmpresa.Socios getSocios() {
        return socios;
    }

    /**
     * Define o valor da propriedade socios.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtDadosCadastraisEmpresa.Socios }
     *     
     */
    public void setSocios(SdtDadosCadastraisEmpresa.Socios value) {
        this.socios = value;
    }

    /**
     * Obt�m o valor da propriedade procuradores.
     * 
     * @return
     *     possible object is
     *     {@link SdtDadosCadastraisEmpresa.Procuradores }
     *     
     */
    public SdtDadosCadastraisEmpresa.Procuradores getProcuradores() {
        return procuradores;
    }

    /**
     * Define o valor da propriedade procuradores.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtDadosCadastraisEmpresa.Procuradores }
     *     
     */
    public void setProcuradores(SdtDadosCadastraisEmpresa.Procuradores value) {
        this.procuradores = value;
    }

    /**
     * Obt�m o valor da propriedade representantesLegais.
     * 
     * @return
     *     possible object is
     *     {@link SdtDadosCadastraisEmpresa.RepresentantesLegais }
     *     
     */
    public SdtDadosCadastraisEmpresa.RepresentantesLegais getRepresentantesLegais() {
        return representantesLegais;
    }

    /**
     * Define o valor da propriedade representantesLegais.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtDadosCadastraisEmpresa.RepresentantesLegais }
     *     
     */
    public void setRepresentantesLegais(SdtDadosCadastraisEmpresa.RepresentantesLegais value) {
        this.representantesLegais = value;
    }

    /**
     * Obt�m o valor da propriedade servicos.
     * 
     * @return
     *     possible object is
     *     {@link SdtDadosCadastraisEmpresa.Servicos }
     *     
     */
    public SdtDadosCadastraisEmpresa.Servicos getServicos() {
        return servicos;
    }

    /**
     * Define o valor da propriedade servicos.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtDadosCadastraisEmpresa.Servicos }
     *     
     */
    public void setServicos(SdtDadosCadastraisEmpresa.Servicos value) {
        this.servicos = value;
    }

    /**
     * Obt�m o valor da propriedade grupoSubgrupoAtividades.
     * 
     * @return
     *     possible object is
     *     {@link SdtDadosCadastraisEmpresa.GrupoSubgrupoAtividades }
     *     
     */
    public SdtDadosCadastraisEmpresa.GrupoSubgrupoAtividades getGrupoSubgrupoAtividades() {
        return grupoSubgrupoAtividades;
    }

    /**
     * Define o valor da propriedade grupoSubgrupoAtividades.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtDadosCadastraisEmpresa.GrupoSubgrupoAtividades }
     *     
     */
    public void setGrupoSubgrupoAtividades(SdtDadosCadastraisEmpresa.GrupoSubgrupoAtividades value) {
        this.grupoSubgrupoAtividades = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CaracteristicaFuncionamentoItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.CaracteristicaFuncionamentoItens" maxOccurs="unbounded" minOccurs="0"/>
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
        "caracteristicaFuncionamentoItens"
    })
    public static class CaracteristicasFuncionamento {

        @XmlElement(name = "CaracteristicaFuncionamentoItens")
        protected List<SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens> caracteristicaFuncionamentoItens;

        /**
         * Gets the value of the caracteristicaFuncionamentoItens property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the caracteristicaFuncionamentoItens property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCaracteristicaFuncionamentoItens().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens }
         * 
         * 
         */
        public List<SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens> getCaracteristicaFuncionamentoItens() {
            if (caracteristicaFuncionamentoItens == null) {
                caracteristicaFuncionamentoItens = new ArrayList<SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens>();
            }
            return this.caracteristicaFuncionamentoItens;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CnaeItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.CnaeItens" maxOccurs="unbounded" minOccurs="0"/>
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
        "cnaeItens"
    })
    public static class Cnaes {

        @XmlElement(name = "CnaeItens")
        protected List<SdtDadosCadastraisEmpresaCnaeItens> cnaeItens;

        /**
         * Gets the value of the cnaeItens property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cnaeItens property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCnaeItens().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SdtDadosCadastraisEmpresaCnaeItens }
         * 
         * 
         */
        public List<SdtDadosCadastraisEmpresaCnaeItens> getCnaeItens() {
            if (cnaeItens == null) {
                cnaeItens = new ArrayList<SdtDadosCadastraisEmpresaCnaeItens>();
            }
            return this.cnaeItens;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ContratoItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.ContratoItens" maxOccurs="unbounded" minOccurs="0"/>
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
        "contratoItens"
    })
    public static class Contratos {

        @XmlElement(name = "ContratoItens")
        protected List<SdtDadosCadastraisEmpresaContratoItens> contratoItens;

        /**
         * Gets the value of the contratoItens property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contratoItens property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContratoItens().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SdtDadosCadastraisEmpresaContratoItens }
         * 
         * 
         */
        public List<SdtDadosCadastraisEmpresaContratoItens> getContratoItens() {
            if (contratoItens == null) {
                contratoItens = new ArrayList<SdtDadosCadastraisEmpresaContratoItens>();
            }
            return this.contratoItens;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="GrupoSubgrupoAtividadeItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.GrupoSubgrupoAtividadeItens" maxOccurs="unbounded" minOccurs="0"/>
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
        "grupoSubgrupoAtividadeItens"
    })
    public static class GrupoSubgrupoAtividades {

        @XmlElement(name = "GrupoSubgrupoAtividadeItens")
        protected List<SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens> grupoSubgrupoAtividadeItens;

        /**
         * Gets the value of the grupoSubgrupoAtividadeItens property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the grupoSubgrupoAtividadeItens property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGrupoSubgrupoAtividadeItens().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens }
         * 
         * 
         */
        public List<SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens> getGrupoSubgrupoAtividadeItens() {
            if (grupoSubgrupoAtividadeItens == null) {
                grupoSubgrupoAtividadeItens = new ArrayList<SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens>();
            }
            return this.grupoSubgrupoAtividadeItens;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProcuradorItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.ProcuradorItens" maxOccurs="unbounded" minOccurs="0"/>
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
        "procuradorItens"
    })
    public static class Procuradores {

        @XmlElement(name = "ProcuradorItens")
        protected List<SdtDadosCadastraisEmpresaProcuradorItens> procuradorItens;

        /**
         * Gets the value of the procuradorItens property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procuradorItens property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcuradorItens().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SdtDadosCadastraisEmpresaProcuradorItens }
         * 
         * 
         */
        public List<SdtDadosCadastraisEmpresaProcuradorItens> getProcuradorItens() {
            if (procuradorItens == null) {
                procuradorItens = new ArrayList<SdtDadosCadastraisEmpresaProcuradorItens>();
            }
            return this.procuradorItens;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RepresentanteLegalItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.RepresentanteLegalItens" maxOccurs="unbounded" minOccurs="0"/>
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
        "representanteLegalItens"
    })
    public static class RepresentantesLegais {

        @XmlElement(name = "RepresentanteLegalItens")
        protected List<SdtDadosCadastraisEmpresaRepresentanteLegalItens> representanteLegalItens;

        /**
         * Gets the value of the representanteLegalItens property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the representanteLegalItens property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRepresentanteLegalItens().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SdtDadosCadastraisEmpresaRepresentanteLegalItens }
         * 
         * 
         */
        public List<SdtDadosCadastraisEmpresaRepresentanteLegalItens> getRepresentanteLegalItens() {
            if (representanteLegalItens == null) {
                representanteLegalItens = new ArrayList<SdtDadosCadastraisEmpresaRepresentanteLegalItens>();
            }
            return this.representanteLegalItens;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ServicoItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.ServicoItens" maxOccurs="unbounded" minOccurs="0"/>
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
        "servicoItens"
    })
    public static class Servicos {

        @XmlElement(name = "ServicoItens")
        protected List<SdtDadosCadastraisEmpresaServicoItens> servicoItens;

        /**
         * Gets the value of the servicoItens property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the servicoItens property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServicoItens().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SdtDadosCadastraisEmpresaServicoItens }
         * 
         * 
         */
        public List<SdtDadosCadastraisEmpresaServicoItens> getServicoItens() {
            if (servicoItens == null) {
                servicoItens = new ArrayList<SdtDadosCadastraisEmpresaServicoItens>();
            }
            return this.servicoItens;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SocioItens" type="{eAgata}Sdt_DadosCadastraisEmpresa.SocioItens" maxOccurs="unbounded" minOccurs="0"/>
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
        "socioItens"
    })
    public static class Socios {

        @XmlElement(name = "SocioItens")
        protected List<SdtDadosCadastraisEmpresaSocioItens> socioItens;

        /**
         * Gets the value of the socioItens property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the socioItens property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSocioItens().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SdtDadosCadastraisEmpresaSocioItens }
         * 
         * 
         */
        public List<SdtDadosCadastraisEmpresaSocioItens> getSocioItens() {
            if (socioItens == null) {
                socioItens = new ArrayList<SdtDadosCadastraisEmpresaSocioItens>();
            }
            return this.socioItens;
        }

    }

}
