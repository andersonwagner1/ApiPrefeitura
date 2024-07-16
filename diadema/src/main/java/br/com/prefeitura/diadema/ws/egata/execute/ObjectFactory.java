
package br.com.prefeitura.diadema.ws.egata.execute;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.prefeitura.diadema.ws.egata.execute package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfComplemento_QNAME = new QName("Jucesp.Services.Data/01", "ArrayOfComplemento");
    private final static QName _ArrayOfLicencaEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "ArrayOfLicencaEntity");
    private final static QName _ListarSolicitacoesPorProtocoloREDESIMOut_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ListarSolicitacoesPorProtocoloREDESIMOut");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _LiberarCassarLicencaIn_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "LiberarCassarLicencaIn");
    private final static QName _CancelarCassarLicencaIn_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "CancelarCassarLicencaIn");
    private final static QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private final static QName _ListarSolicitacoesPorCNJPOut_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ListarSolicitacoesPorCNJPOut");
    private final static QName _ArrayOfSocio_QNAME = new QName("Jucesp.Services.Data/01", "ArrayOfSocio");
    private final static QName _ListarSolicitacoesPorCNJPIn_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ListarSolicitacoesPorCNJPIn");
    private final static QName _ListarSolicitacoesPorProtocoloREDESIMIn_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ListarSolicitacoesPorProtocoloREDESIMIn");
    private final static QName _ListarSolicitacoesPorDataOut_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ListarSolicitacoesPorDataOut");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ArrayOfAreaPublicidade_QNAME = new QName("Jucesp.Services.Data/01", "ArrayOfAreaPublicidade");
    private final static QName _RG_QNAME = new QName("Jucesp.Services.Data/01", "RG");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfCnae_QNAME = new QName("Jucesp.Services.Data/01", "ArrayOfCnae");
    private final static QName _Pessoa_QNAME = new QName("Jucesp.Services.Data/01", "Pessoa");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _LicencaEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "LicencaEntity");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _CassarLicencaOut_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "CassarLicencaOut");
    private final static QName _ConsultarDadosEmpresaOut_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ConsultarDadosEmpresaOut");
    private final static QName _EnderecoViabilidade_QNAME = new QName("Jucesp.Services.Data/01", "EnderecoViabilidade");
    private final static QName _AtividadeAuxiliar_QNAME = new QName("Jucesp.Services.Data/01", "AtividadeAuxiliar");
    private final static QName _Socio_QNAME = new QName("Jucesp.Services.Data/01", "Socio");
    private final static QName _DadosComplementares_QNAME = new QName("Jucesp.Services.Data/01", "DadosComplementares");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Estabelecimento_QNAME = new QName("Jucesp.Services.Data/01", "Estabelecimento");
    private final static QName _ConsultarDadosEmpresaIn_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ConsultarDadosEmpresaIn");
    private final static QName _ArrayOfDadosImovel_QNAME = new QName("Jucesp.Services.Data/01", "ArrayOfDadosImovel");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _JucespFault_QNAME = new QName("Jucesp.Services.Data/01", "JucespFault");
    private final static QName _InvalidarLicencaIn_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "InvalidarLicencaIn");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Item_QNAME = new QName("Jucesp.Services.Data/01", "Item");
    private final static QName _ArrayOfInscricaoImovel_QNAME = new QName("Jucesp.Services.Data/01", "ArrayOfInscricaoImovel");
    private final static QName _InscricaoImovel_QNAME = new QName("Jucesp.Services.Data/01", "InscricaoImovel");
    private final static QName _ListarSolicitacoesPorDataIn_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ListarSolicitacoesPorDataIn");
    private final static QName _Endereco_QNAME = new QName("Jucesp.Services.Data/01", "Endereco");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _CassarLicencaIn_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "CassarLicencaIn");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Complemento_QNAME = new QName("Jucesp.Services.Data/01", "Complemento");
    private final static QName _BaseEntity_QNAME = new QName("Jucesp.Services.Data/01", "BaseEntity");
    private final static QName _ArrayOfAtividadeAuxiliar_QNAME = new QName("Jucesp.Services.Data/01", "ArrayOfAtividadeAuxiliar");
    private final static QName _ArrayOfSituacaoLicencaEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "ArrayOfSituacaoLicencaEntity");
    private final static QName _ItemInformacao_QNAME = new QName("Jucesp.Services.Data/01", "ItemInformacao");
    private final static QName _DadosImovel_QNAME = new QName("Jucesp.Services.Data/01", "DadosImovel");
    private final static QName _InformarConclusaoLicencaIn_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "InformarConclusaoLicencaIn");
    private final static QName _ConsultarSolicitacaoLicenciamentoIn_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ConsultarSolicitacaoLicenciamentoIn");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _InformarInteracaoComOrgaoIn_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "InformarInteracaoComOrgaoIn");
    private final static QName _AreaPublicidade_QNAME = new QName("Jucesp.Services.Data/01", "AreaPublicidade");
    private final static QName _ArrayOfEnderecoViabilidade_QNAME = new QName("Jucesp.Services.Data/01", "ArrayOfEnderecoViabilidade");
    private final static QName _ArrayOfRequestResult_QNAME = new QName("Jucesp.Services.Data/01", "ArrayOfRequestResult");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Cnae_QNAME = new QName("Jucesp.Services.Data/01", "Cnae");
    private final static QName _InformarConclusaoLicencaOut_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "InformarConclusaoLicencaOut");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfItemInformacao_QNAME = new QName("Jucesp.Services.Data/01", "ArrayOfItemInformacao");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _SituacaoLicencaEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "SituacaoLicencaEntity");
    private final static QName _ArrayOfHorario_QNAME = new QName("Jucesp.Services.Data/01", "ArrayOfHorario");
    private final static QName _AuthenticationHeader_QNAME = new QName("Jucesp.Services.Data/01", "AuthenticationHeader");
    private final static QName _SituacaoSolicitacaoEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "SituacaoSolicitacaoEntity");
    private final static QName _LiberarCassarLicencaOut_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "LiberarCassarLicencaOut");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _InformarInteracaoComOrgaoOut_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "InformarInteracaoComOrgaoOut");
    private final static QName _Horario_QNAME = new QName("Jucesp.Services.Data/01", "Horario");
    private final static QName _CancelarCassarLicencaOut_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "CancelarCassarLicencaOut");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _MessageRequest_QNAME = new QName("Jucesp.Services.Viabilidades.Data/01", "MessageRequest");
    private final static QName _ArrayOfSituacaoSolicitacaoEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "ArrayOfSituacaoSolicitacaoEntity");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ConsultarSolicitacaoLicenciamentoOut_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ConsultarSolicitacaoLicenciamentoOut");
    private final static QName _InvalidarLicencaOut_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "InvalidarLicencaOut");
    private final static QName _RequestResult_QNAME = new QName("Jucesp.Services.Data/01", "RequestResult");
    private final static QName _ArrayOfItem_QNAME = new QName("Jucesp.Services.Data/01", "ArrayOfItem");
    private final static QName _CancelarCassarLicencaResponseCancelarCassarLicencaResult_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "CancelarCassarLicencaResult");
    private final static QName _ConsultarDadosEmpresaInCNPJouProtocoloREDESIM_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "CNPJouProtocoloREDESIM");
    private final static QName _ListarSolicitacoesPorProtocoloREDESIMDto_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "dto");
    private final static QName _SituacaoSolicitacaoEntityData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "Data");
    private final static QName _SituacaoSolicitacaoEntityCPFResponsavel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "CPFResponsavel");
    private final static QName _SituacaoSolicitacaoEntityDescricao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "Descricao");
    private final static QName _AtividadeAuxiliarCodigo_QNAME = new QName("Jucesp.Services.Data/01", "Codigo");
    private final static QName _AtividadeAuxiliarDescricao_QNAME = new QName("Jucesp.Services.Data/01", "Descricao");
    private final static QName _EnderecoViabilidadeComplementos_QNAME = new QName("Jucesp.Services.Data/01", "Complementos");
    private final static QName _EnderecoViabilidadeCEP_QNAME = new QName("Jucesp.Services.Data/01", "CEP");
    private final static QName _EnderecoViabilidadeInscricaoSetorQuadraLotes_QNAME = new QName("Jucesp.Services.Data/01", "InscricaoSetorQuadraLotes");
    private final static QName _EnderecoViabilidadeBairro_QNAME = new QName("Jucesp.Services.Data/01", "Bairro");
    private final static QName _EnderecoViabilidadeReferencia_QNAME = new QName("Jucesp.Services.Data/01", "Referencia");
    private final static QName _EnderecoViabilidadeResponsavelInformacao_QNAME = new QName("Jucesp.Services.Data/01", "ResponsavelInformacao");
    private final static QName _EnderecoViabilidadeTipoLogradouro_QNAME = new QName("Jucesp.Services.Data/01", "TipoLogradouro");
    private final static QName _EnderecoViabilidadeNumero_QNAME = new QName("Jucesp.Services.Data/01", "Numero");
    private final static QName _EnderecoViabilidadeUF_QNAME = new QName("Jucesp.Services.Data/01", "UF");
    private final static QName _EnderecoViabilidadeLogradouro_QNAME = new QName("Jucesp.Services.Data/01", "Logradouro");
    private final static QName _EnderecoViabilidadeMunicipio_QNAME = new QName("Jucesp.Services.Data/01", "Municipio");
    private final static QName _InvalidarLicencaOutResultado_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "Resultado");
    private final static QName _ListarSolicitacoesPorProtocoloREDESIMOutProtocolos_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "Protocolos");
    private final static QName _AreaPublicidadeTipoPublicidade_QNAME = new QName("Jucesp.Services.Data/01", "TipoPublicidade");
    private final static QName _AreaPublicidadeArea_QNAME = new QName("Jucesp.Services.Data/01", "Area");
    private final static QName _CassarLicencaInNumeroProtocoloOrgao_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "NumeroProtocoloOrgao");
    private final static QName _CassarLicencaInInformacoesComplementares_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "InformacoesComplementares");
    private final static QName _SocioNome_QNAME = new QName("Jucesp.Services.Data/01", "Nome");
    private final static QName _SocioNumeroRegistro_QNAME = new QName("Jucesp.Services.Data/01", "NumeroRegistro");
    private final static QName _ConsultarSolicitacaoLicenciamentoResponseConsultarSolicitacaoLicenciamentoResult_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "ConsultarSolicitacaoLicenciamentoResult");
    private final static QName _InvalidarLicencaResponseInvalidarLicencaResult_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "InvalidarLicencaResult");
    private final static QName _InformarInteracaoComOrgaoResponseInformarInteracaoComOrgaoResult_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "InformarInteracaoComOrgaoResult");
    private final static QName _ComplementoValor_QNAME = new QName("Jucesp.Services.Data/01", "Valor");
    private final static QName _EstabelecimentoFormasAtuacao_QNAME = new QName("Jucesp.Services.Data/01", "FormasAtuacao");
    private final static QName _EstabelecimentoAtividadeAuxiliares_QNAME = new QName("Jucesp.Services.Data/01", "AtividadeAuxiliares");
    private final static QName _EstabelecimentoCnaes_QNAME = new QName("Jucesp.Services.Data/01", "Cnaes");
    private final static QName _EstabelecimentoEnderecosViabilidade_QNAME = new QName("Jucesp.Services.Data/01", "EnderecosViabilidade");
    private final static QName _EstabelecimentoInformacoesImovel_QNAME = new QName("Jucesp.Services.Data/01", "InformacoesImovel");
    private final static QName _EstabelecimentoTipoUnidade_QNAME = new QName("Jucesp.Services.Data/01", "TipoUnidade");
    private final static QName _JucespFaultMessages_QNAME = new QName("Jucesp.Services.Data/01", "Messages");
    private final static QName _LicencaEntityNumeroProtocolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "NumeroProtocolo");
    private final static QName _LicencaEntityDetalhe_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "Detalhe");
    private final static QName _LicencaEntityNumeroLicenca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "NumeroLicenca");
    private final static QName _LicencaEntityRisco_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "Risco");
    private final static QName _LicencaEntityDataEmissaoLicenca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "DataEmissaoLicenca");
    private final static QName _LicencaEntityDataValidadeLicenca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "DataValidadeLicenca");
    private final static QName _LicencaEntityInformacoesComplementares_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "InformacoesComplementares");
    private final static QName _LicencaEntityDataProtocolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "DataProtocolo");
    private final static QName _LicencaEntityOrgaoLicenca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "OrgaoLicenca");
    private final static QName _LicencaEntitySituacaoLicenca_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "SituacaoLicenca");
    private final static QName _CassarLicencaResponseCassarLicencaResult_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "CassarLicencaResult");
    private final static QName _DadosImovelNumeroFuncionario_QNAME = new QName("Jucesp.Services.Data/01", "NumeroFuncionario");
    private final static QName _DadosImovelAreaImovel_QNAME = new QName("Jucesp.Services.Data/01", "AreaImovel");
    private final static QName _DadosImovelAreaEstabelecimento_QNAME = new QName("Jucesp.Services.Data/01", "AreaEstabelecimento");
    private final static QName _DadosImovelAreaTerreno_QNAME = new QName("Jucesp.Services.Data/01", "AreaTerreno");
    private final static QName _DadosImovelComprimentoTestada_QNAME = new QName("Jucesp.Services.Data/01", "ComprimentoTestada");
    private final static QName _ListarSolicitacoesPorProtocoloREDESIMResponseListarSolicitacoesPorProtocoloREDESIMResult_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "ListarSolicitacoesPorProtocoloREDESIMResult");
    private final static QName _EnderecoTelefone_QNAME = new QName("Jucesp.Services.Data/01", "Telefone");
    private final static QName _EnderecoEmail_QNAME = new QName("Jucesp.Services.Data/01", "Email");
    private final static QName _ListarSolicitacoesPorProtocoloREDESIMInProtocoloREDESIM_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ProtocoloREDESIM");
    private final static QName _LiberarCassarLicencaResponseLiberarCassarLicencaResult_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "LiberarCassarLicencaResult");
    private final static QName _ListarSolicitacoesPorCNJPInCNPJ_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "CNPJ");
    private final static QName _ListarSolicitacoesPorCNPJResponseListarSolicitacoesPorCNPJResult_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "ListarSolicitacoesPorCNPJResult");
    private final static QName _InformarConclusaoLicencaInDataEmissaoLicenca_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "DataEmissaoLicenca");
    private final static QName _InformarConclusaoLicencaInDataValidadeLicenca_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "DataValidadeLicenca");
    private final static QName _InformarConclusaoLicencaInNumeroLicenca_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "NumeroLicenca");
    private final static QName _ConsultarDadosEmpresaResponseConsultarDadosEmpresaResult_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "ConsultarDadosEmpresaResult");
    private final static QName _MessageRequestAuthenticationHeader_QNAME = new QName("Jucesp.Services.Viabilidades.Data/01", "AuthenticationHeader");
    private final static QName _ConsultarDadosEmpresaOutObjetoSocial_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ObjetoSocial");
    private final static QName _ConsultarDadosEmpresaOutProtocoloReconsideracao_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ProtocoloReconsideracao");
    private final static QName _ConsultarDadosEmpresaOutValidadeViabilidade_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ValidadeViabilidade");
    private final static QName _ConsultarDadosEmpresaOutOrgaoRegistrador_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "OrgaoRegistrador");
    private final static QName _ConsultarDadosEmpresaOutRazaoSocial_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "RazaoSocial");
    private final static QName _ConsultarDadosEmpresaOutEstabelecimento_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "Estabelecimento");
    private final static QName _ConsultarDadosEmpresaOutSolicitante_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "Solicitante");
    private final static QName _ConsultarDadosEmpresaOutSocios_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "Socios");
    private final static QName _ConsultarDadosEmpresaOutEventos_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "Eventos");
    private final static QName _ConsultarDadosEmpresaOutProtocoloViabilidade_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ProtocoloViabilidade");
    private final static QName _ConsultarDadosEmpresaOutEnquadramento_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "Enquadramento");
    private final static QName _ConsultarDadosEmpresaOutNaturezaJuridica_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "NaturezaJuridica");
    private final static QName _PessoaNacionalidade_QNAME = new QName("Jucesp.Services.Data/01", "Nacionalidade");
    private final static QName _PessoaCodigoTipoRaca_QNAME = new QName("Jucesp.Services.Data/01", "CodigoTipoRaca");
    private final static QName _ConsultarSolicitacaoLicenciamentoOutSituacoesSolicitacao_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "SituacoesSolicitacao");
    private final static QName _ConsultarSolicitacaoLicenciamentoOutLicencas_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "Licencas");
    private final static QName _SituacaoLicencaEntityData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", "data");
    private final static QName _InformarConclusaoLicencaResponseInformarConclusaoLicencaResult_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "InformarConclusaoLicencaResult");
    private final static QName _AuthenticationHeaderPassword_QNAME = new QName("Jucesp.Services.Data/01", "Password");
    private final static QName _AuthenticationHeaderUsername_QNAME = new QName("Jucesp.Services.Data/01", "Username");
    private final static QName _InformarInteracaoComOrgaoOutResultadoList_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento/01", "ResultadoList");
    private final static QName _DadosComplementaresHorarios_QNAME = new QName("Jucesp.Services.Data/01", "Horarios");
    private final static QName _DadosComplementaresAreaPublicidades_QNAME = new QName("Jucesp.Services.Data/01", "AreaPublicidades");
    private final static QName _ListarSolicitacoesPorDataResponseListarSolicitacoesPorDataResult_QNAME = new QName("Jucesp.Services.Licenciamentos.Licenciamento", "ListarSolicitacoesPorDataResult");
    private final static QName _HorarioDiaSemana_QNAME = new QName("Jucesp.Services.Data/01", "DiaSemana");
    private final static QName _HorarioHoraAbertura_QNAME = new QName("Jucesp.Services.Data/01", "HoraAbertura");
    private final static QName _HorarioHoraFechamento_QNAME = new QName("Jucesp.Services.Data/01", "HoraFechamento");
    private final static QName _ItemInformacaoTipoInformacao_QNAME = new QName("Jucesp.Services.Data/01", "TipoInformacao");
    private final static QName _InscricaoImovelTipoInscricaoImovel_QNAME = new QName("Jucesp.Services.Data/01", "TipoInscricaoImovel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.prefeitura.diadema.ws.egata.execute
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarSolicitacaoLicenciamento }
     * 
     */
    public ConsultarSolicitacaoLicenciamento createConsultarSolicitacaoLicenciamento() {
        return new ConsultarSolicitacaoLicenciamento();
    }

    /**
     * Create an instance of {@link ConsultarSolicitacaoLicenciamentoIn }
     * 
     */
    public ConsultarSolicitacaoLicenciamentoIn createConsultarSolicitacaoLicenciamentoIn() {
        return new ConsultarSolicitacaoLicenciamentoIn();
    }

    /**
     * Create an instance of {@link LiberarCassarLicenca }
     * 
     */
    public LiberarCassarLicenca createLiberarCassarLicenca() {
        return new LiberarCassarLicenca();
    }

    /**
     * Create an instance of {@link LiberarCassarLicencaIn }
     * 
     */
    public LiberarCassarLicencaIn createLiberarCassarLicencaIn() {
        return new LiberarCassarLicencaIn();
    }

    /**
     * Create an instance of {@link LiberarCassarLicencaResponse }
     * 
     */
    public LiberarCassarLicencaResponse createLiberarCassarLicencaResponse() {
        return new LiberarCassarLicencaResponse();
    }

    /**
     * Create an instance of {@link LiberarCassarLicencaOut }
     * 
     */
    public LiberarCassarLicencaOut createLiberarCassarLicencaOut() {
        return new LiberarCassarLicencaOut();
    }

    /**
     * Create an instance of {@link ListarSolicitacoesPorProtocoloREDESIMResponse }
     * 
     */
    public ListarSolicitacoesPorProtocoloREDESIMResponse createListarSolicitacoesPorProtocoloREDESIMResponse() {
        return new ListarSolicitacoesPorProtocoloREDESIMResponse();
    }

    /**
     * Create an instance of {@link ListarSolicitacoesPorProtocoloREDESIMOut }
     * 
     */
    public ListarSolicitacoesPorProtocoloREDESIMOut createListarSolicitacoesPorProtocoloREDESIMOut() {
        return new ListarSolicitacoesPorProtocoloREDESIMOut();
    }

    /**
     * Create an instance of {@link CancelarCassarLicencaResponse }
     * 
     */
    public CancelarCassarLicencaResponse createCancelarCassarLicencaResponse() {
        return new CancelarCassarLicencaResponse();
    }

    /**
     * Create an instance of {@link CancelarCassarLicencaOut }
     * 
     */
    public CancelarCassarLicencaOut createCancelarCassarLicencaOut() {
        return new CancelarCassarLicencaOut();
    }

    /**
     * Create an instance of {@link InvalidarLicenca }
     * 
     */
    public InvalidarLicenca createInvalidarLicenca() {
        return new InvalidarLicenca();
    }

    /**
     * Create an instance of {@link InvalidarLicencaIn }
     * 
     */
    public InvalidarLicencaIn createInvalidarLicencaIn() {
        return new InvalidarLicencaIn();
    }

    /**
     * Create an instance of {@link ListarSolicitacoesPorCNPJResponse }
     * 
     */
    public ListarSolicitacoesPorCNPJResponse createListarSolicitacoesPorCNPJResponse() {
        return new ListarSolicitacoesPorCNPJResponse();
    }

    /**
     * Create an instance of {@link ListarSolicitacoesPorCNJPOut }
     * 
     */
    public ListarSolicitacoesPorCNJPOut createListarSolicitacoesPorCNJPOut() {
        return new ListarSolicitacoesPorCNJPOut();
    }

    /**
     * Create an instance of {@link InformarConclusaoLicenca }
     * 
     */
    public InformarConclusaoLicenca createInformarConclusaoLicenca() {
        return new InformarConclusaoLicenca();
    }

    /**
     * Create an instance of {@link InformarConclusaoLicencaIn }
     * 
     */
    public InformarConclusaoLicencaIn createInformarConclusaoLicencaIn() {
        return new InformarConclusaoLicencaIn();
    }

    /**
     * Create an instance of {@link ConsultarDadosEmpresa }
     * 
     */
    public ConsultarDadosEmpresa createConsultarDadosEmpresa() {
        return new ConsultarDadosEmpresa();
    }

    /**
     * Create an instance of {@link ConsultarDadosEmpresaIn }
     * 
     */
    public ConsultarDadosEmpresaIn createConsultarDadosEmpresaIn() {
        return new ConsultarDadosEmpresaIn();
    }

    /**
     * Create an instance of {@link CassarLicenca }
     * 
     */
    public CassarLicenca createCassarLicenca() {
        return new CassarLicenca();
    }

    /**
     * Create an instance of {@link CassarLicencaIn }
     * 
     */
    public CassarLicencaIn createCassarLicencaIn() {
        return new CassarLicencaIn();
    }

    /**
     * Create an instance of {@link ConsultarDadosEmpresaResponse }
     * 
     */
    public ConsultarDadosEmpresaResponse createConsultarDadosEmpresaResponse() {
        return new ConsultarDadosEmpresaResponse();
    }

    /**
     * Create an instance of {@link ConsultarDadosEmpresaOut }
     * 
     */
    public ConsultarDadosEmpresaOut createConsultarDadosEmpresaOut() {
        return new ConsultarDadosEmpresaOut();
    }

    /**
     * Create an instance of {@link CancelarCassarLicenca }
     * 
     */
    public CancelarCassarLicenca createCancelarCassarLicenca() {
        return new CancelarCassarLicenca();
    }

    /**
     * Create an instance of {@link CancelarCassarLicencaIn }
     * 
     */
    public CancelarCassarLicencaIn createCancelarCassarLicencaIn() {
        return new CancelarCassarLicencaIn();
    }

    /**
     * Create an instance of {@link ListarSolicitacoesPorCNPJ }
     * 
     */
    public ListarSolicitacoesPorCNPJ createListarSolicitacoesPorCNPJ() {
        return new ListarSolicitacoesPorCNPJ();
    }

    /**
     * Create an instance of {@link ListarSolicitacoesPorCNJPIn }
     * 
     */
    public ListarSolicitacoesPorCNJPIn createListarSolicitacoesPorCNJPIn() {
        return new ListarSolicitacoesPorCNJPIn();
    }

    /**
     * Create an instance of {@link ListarSolicitacoesPorProtocoloREDESIM }
     * 
     */
    public ListarSolicitacoesPorProtocoloREDESIM createListarSolicitacoesPorProtocoloREDESIM() {
        return new ListarSolicitacoesPorProtocoloREDESIM();
    }

    /**
     * Create an instance of {@link ListarSolicitacoesPorProtocoloREDESIMIn }
     * 
     */
    public ListarSolicitacoesPorProtocoloREDESIMIn createListarSolicitacoesPorProtocoloREDESIMIn() {
        return new ListarSolicitacoesPorProtocoloREDESIMIn();
    }

    /**
     * Create an instance of {@link InformarInteracaoComOrgao }
     * 
     */
    public InformarInteracaoComOrgao createInformarInteracaoComOrgao() {
        return new InformarInteracaoComOrgao();
    }

    /**
     * Create an instance of {@link InformarInteracaoComOrgaoIn }
     * 
     */
    public InformarInteracaoComOrgaoIn createInformarInteracaoComOrgaoIn() {
        return new InformarInteracaoComOrgaoIn();
    }

    /**
     * Create an instance of {@link InformarConclusaoLicencaResponse }
     * 
     */
    public InformarConclusaoLicencaResponse createInformarConclusaoLicencaResponse() {
        return new InformarConclusaoLicencaResponse();
    }

    /**
     * Create an instance of {@link InformarConclusaoLicencaOut }
     * 
     */
    public InformarConclusaoLicencaOut createInformarConclusaoLicencaOut() {
        return new InformarConclusaoLicencaOut();
    }

    /**
     * Create an instance of {@link ListarSolicitacoesPorData }
     * 
     */
    public ListarSolicitacoesPorData createListarSolicitacoesPorData() {
        return new ListarSolicitacoesPorData();
    }

    /**
     * Create an instance of {@link ListarSolicitacoesPorDataIn }
     * 
     */
    public ListarSolicitacoesPorDataIn createListarSolicitacoesPorDataIn() {
        return new ListarSolicitacoesPorDataIn();
    }

    /**
     * Create an instance of {@link CassarLicencaResponse }
     * 
     */
    public CassarLicencaResponse createCassarLicencaResponse() {
        return new CassarLicencaResponse();
    }

    /**
     * Create an instance of {@link CassarLicencaOut }
     * 
     */
    public CassarLicencaOut createCassarLicencaOut() {
        return new CassarLicencaOut();
    }

    /**
     * Create an instance of {@link InformarInteracaoComOrgaoResponse }
     * 
     */
    public InformarInteracaoComOrgaoResponse createInformarInteracaoComOrgaoResponse() {
        return new InformarInteracaoComOrgaoResponse();
    }

    /**
     * Create an instance of {@link InformarInteracaoComOrgaoOut }
     * 
     */
    public InformarInteracaoComOrgaoOut createInformarInteracaoComOrgaoOut() {
        return new InformarInteracaoComOrgaoOut();
    }

    /**
     * Create an instance of {@link ListarSolicitacoesPorDataResponse }
     * 
     */
    public ListarSolicitacoesPorDataResponse createListarSolicitacoesPorDataResponse() {
        return new ListarSolicitacoesPorDataResponse();
    }

    /**
     * Create an instance of {@link ListarSolicitacoesPorDataOut }
     * 
     */
    public ListarSolicitacoesPorDataOut createListarSolicitacoesPorDataOut() {
        return new ListarSolicitacoesPorDataOut();
    }

    /**
     * Create an instance of {@link ConsultarSolicitacaoLicenciamentoResponse }
     * 
     */
    public ConsultarSolicitacaoLicenciamentoResponse createConsultarSolicitacaoLicenciamentoResponse() {
        return new ConsultarSolicitacaoLicenciamentoResponse();
    }

    /**
     * Create an instance of {@link ConsultarSolicitacaoLicenciamentoOut }
     * 
     */
    public ConsultarSolicitacaoLicenciamentoOut createConsultarSolicitacaoLicenciamentoOut() {
        return new ConsultarSolicitacaoLicenciamentoOut();
    }

    /**
     * Create an instance of {@link InvalidarLicencaResponse }
     * 
     */
    public InvalidarLicencaResponse createInvalidarLicencaResponse() {
        return new InvalidarLicencaResponse();
    }

    /**
     * Create an instance of {@link InvalidarLicencaOut }
     * 
     */
    public InvalidarLicencaOut createInvalidarLicencaOut() {
        return new InvalidarLicencaOut();
    }

    /**
     * Create an instance of {@link MessageRequest }
     * 
     */
    public MessageRequest createMessageRequest() {
        return new MessageRequest();
    }

    /**
     * Create an instance of {@link Estabelecimento }
     * 
     */
    public Estabelecimento createEstabelecimento() {
        return new Estabelecimento();
    }

    /**
     * Create an instance of {@link AuthenticationHeader }
     * 
     */
    public AuthenticationHeader createAuthenticationHeader() {
        return new AuthenticationHeader();
    }

    /**
     * Create an instance of {@link ArrayOfHorario }
     * 
     */
    public ArrayOfHorario createArrayOfHorario() {
        return new ArrayOfHorario();
    }

    /**
     * Create an instance of {@link DadosComplementares }
     * 
     */
    public DadosComplementares createDadosComplementares() {
        return new DadosComplementares();
    }

    /**
     * Create an instance of {@link EnderecoViabilidade }
     * 
     */
    public EnderecoViabilidade createEnderecoViabilidade() {
        return new EnderecoViabilidade();
    }

    /**
     * Create an instance of {@link AtividadeAuxiliar }
     * 
     */
    public AtividadeAuxiliar createAtividadeAuxiliar() {
        return new AtividadeAuxiliar();
    }

    /**
     * Create an instance of {@link Socio }
     * 
     */
    public Socio createSocio() {
        return new Socio();
    }

    /**
     * Create an instance of {@link ArrayOfItemInformacao }
     * 
     */
    public ArrayOfItemInformacao createArrayOfItemInformacao() {
        return new ArrayOfItemInformacao();
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link Cnae }
     * 
     */
    public Cnae createCnae() {
        return new Cnae();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link ArrayOfItem }
     * 
     */
    public ArrayOfItem createArrayOfItem() {
        return new ArrayOfItem();
    }

    /**
     * Create an instance of {@link ArrayOfInscricaoImovel }
     * 
     */
    public ArrayOfInscricaoImovel createArrayOfInscricaoImovel() {
        return new ArrayOfInscricaoImovel();
    }

    /**
     * Create an instance of {@link InscricaoImovel }
     * 
     */
    public InscricaoImovel createInscricaoImovel() {
        return new InscricaoImovel();
    }

    /**
     * Create an instance of {@link RequestResult }
     * 
     */
    public RequestResult createRequestResult() {
        return new RequestResult();
    }

    /**
     * Create an instance of {@link JucespFault }
     * 
     */
    public JucespFault createJucespFault() {
        return new JucespFault();
    }

    /**
     * Create an instance of {@link ArrayOfDadosImovel }
     * 
     */
    public ArrayOfDadosImovel createArrayOfDadosImovel() {
        return new ArrayOfDadosImovel();
    }

    /**
     * Create an instance of {@link Horario }
     * 
     */
    public Horario createHorario() {
        return new Horario();
    }

    /**
     * Create an instance of {@link ItemInformacao }
     * 
     */
    public ItemInformacao createItemInformacao() {
        return new ItemInformacao();
    }

    /**
     * Create an instance of {@link BaseEntity }
     * 
     */
    public BaseEntity createBaseEntity() {
        return new BaseEntity();
    }

    /**
     * Create an instance of {@link ArrayOfAtividadeAuxiliar }
     * 
     */
    public ArrayOfAtividadeAuxiliar createArrayOfAtividadeAuxiliar() {
        return new ArrayOfAtividadeAuxiliar();
    }

    /**
     * Create an instance of {@link Complemento }
     * 
     */
    public Complemento createComplemento() {
        return new Complemento();
    }

    /**
     * Create an instance of {@link Endereco }
     * 
     */
    public Endereco createEndereco() {
        return new Endereco();
    }

    /**
     * Create an instance of {@link ArrayOfComplemento }
     * 
     */
    public ArrayOfComplemento createArrayOfComplemento() {
        return new ArrayOfComplemento();
    }

    /**
     * Create an instance of {@link ArrayOfCnae }
     * 
     */
    public ArrayOfCnae createArrayOfCnae() {
        return new ArrayOfCnae();
    }

    /**
     * Create an instance of {@link ArrayOfRequestResult }
     * 
     */
    public ArrayOfRequestResult createArrayOfRequestResult() {
        return new ArrayOfRequestResult();
    }

    /**
     * Create an instance of {@link RG }
     * 
     */
    public RG createRG() {
        return new RG();
    }

    /**
     * Create an instance of {@link ArrayOfEnderecoViabilidade }
     * 
     */
    public ArrayOfEnderecoViabilidade createArrayOfEnderecoViabilidade() {
        return new ArrayOfEnderecoViabilidade();
    }

    /**
     * Create an instance of {@link ArrayOfAreaPublicidade }
     * 
     */
    public ArrayOfAreaPublicidade createArrayOfAreaPublicidade() {
        return new ArrayOfAreaPublicidade();
    }

    /**
     * Create an instance of {@link AreaPublicidade }
     * 
     */
    public AreaPublicidade createAreaPublicidade() {
        return new AreaPublicidade();
    }

    /**
     * Create an instance of {@link DadosImovel }
     * 
     */
    public DadosImovel createDadosImovel() {
        return new DadosImovel();
    }

    /**
     * Create an instance of {@link ArrayOfSocio }
     * 
     */
    public ArrayOfSocio createArrayOfSocio() {
        return new ArrayOfSocio();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOflong }
     * 
     */
    public ArrayOflong createArrayOflong() {
        return new ArrayOflong();
    }

    /**
     * Create an instance of {@link ArrayOfSituacaoSolicitacaoEntity }
     * 
     */
    public ArrayOfSituacaoSolicitacaoEntity createArrayOfSituacaoSolicitacaoEntity() {
        return new ArrayOfSituacaoSolicitacaoEntity();
    }

    /**
     * Create an instance of {@link ArrayOfSituacaoLicencaEntity }
     * 
     */
    public ArrayOfSituacaoLicencaEntity createArrayOfSituacaoLicencaEntity() {
        return new ArrayOfSituacaoLicencaEntity();
    }

    /**
     * Create an instance of {@link SituacaoSolicitacaoEntity }
     * 
     */
    public SituacaoSolicitacaoEntity createSituacaoSolicitacaoEntity() {
        return new SituacaoSolicitacaoEntity();
    }

    /**
     * Create an instance of {@link LicencaEntity }
     * 
     */
    public LicencaEntity createLicencaEntity() {
        return new LicencaEntity();
    }

    /**
     * Create an instance of {@link ArrayOfLicencaEntity }
     * 
     */
    public ArrayOfLicencaEntity createArrayOfLicencaEntity() {
        return new ArrayOfLicencaEntity();
    }

    /**
     * Create an instance of {@link SituacaoLicencaEntity }
     * 
     */
    public SituacaoLicencaEntity createSituacaoLicencaEntity() {
        return new SituacaoLicencaEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfComplemento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ArrayOfComplemento")
    public JAXBElement<ArrayOfComplemento> createArrayOfComplemento(ArrayOfComplemento value) {
        return new JAXBElement<ArrayOfComplemento>(_ArrayOfComplemento_QNAME, ArrayOfComplemento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicencaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "ArrayOfLicencaEntity")
    public JAXBElement<ArrayOfLicencaEntity> createArrayOfLicencaEntity(ArrayOfLicencaEntity value) {
        return new JAXBElement<ArrayOfLicencaEntity>(_ArrayOfLicencaEntity_QNAME, ArrayOfLicencaEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorProtocoloREDESIMOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ListarSolicitacoesPorProtocoloREDESIMOut")
    public JAXBElement<ListarSolicitacoesPorProtocoloREDESIMOut> createListarSolicitacoesPorProtocoloREDESIMOut(ListarSolicitacoesPorProtocoloREDESIMOut value) {
        return new JAXBElement<ListarSolicitacoesPorProtocoloREDESIMOut>(_ListarSolicitacoesPorProtocoloREDESIMOut_QNAME, ListarSolicitacoesPorProtocoloREDESIMOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiberarCassarLicencaIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "LiberarCassarLicencaIn")
    public JAXBElement<LiberarCassarLicencaIn> createLiberarCassarLicencaIn(LiberarCassarLicencaIn value) {
        return new JAXBElement<LiberarCassarLicencaIn>(_LiberarCassarLicencaIn_QNAME, LiberarCassarLicencaIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarCassarLicencaIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "CancelarCassarLicencaIn")
    public JAXBElement<CancelarCassarLicencaIn> createCancelarCassarLicencaIn(CancelarCassarLicencaIn value) {
        return new JAXBElement<CancelarCassarLicencaIn>(_CancelarCassarLicencaIn_QNAME, CancelarCassarLicencaIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOflong")
    public JAXBElement<ArrayOflong> createArrayOflong(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ArrayOflong_QNAME, ArrayOflong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorCNJPOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ListarSolicitacoesPorCNJPOut")
    public JAXBElement<ListarSolicitacoesPorCNJPOut> createListarSolicitacoesPorCNJPOut(ListarSolicitacoesPorCNJPOut value) {
        return new JAXBElement<ListarSolicitacoesPorCNJPOut>(_ListarSolicitacoesPorCNJPOut_QNAME, ListarSolicitacoesPorCNJPOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSocio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ArrayOfSocio")
    public JAXBElement<ArrayOfSocio> createArrayOfSocio(ArrayOfSocio value) {
        return new JAXBElement<ArrayOfSocio>(_ArrayOfSocio_QNAME, ArrayOfSocio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorCNJPIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ListarSolicitacoesPorCNJPIn")
    public JAXBElement<ListarSolicitacoesPorCNJPIn> createListarSolicitacoesPorCNJPIn(ListarSolicitacoesPorCNJPIn value) {
        return new JAXBElement<ListarSolicitacoesPorCNJPIn>(_ListarSolicitacoesPorCNJPIn_QNAME, ListarSolicitacoesPorCNJPIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorProtocoloREDESIMIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ListarSolicitacoesPorProtocoloREDESIMIn")
    public JAXBElement<ListarSolicitacoesPorProtocoloREDESIMIn> createListarSolicitacoesPorProtocoloREDESIMIn(ListarSolicitacoesPorProtocoloREDESIMIn value) {
        return new JAXBElement<ListarSolicitacoesPorProtocoloREDESIMIn>(_ListarSolicitacoesPorProtocoloREDESIMIn_QNAME, ListarSolicitacoesPorProtocoloREDESIMIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorDataOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ListarSolicitacoesPorDataOut")
    public JAXBElement<ListarSolicitacoesPorDataOut> createListarSolicitacoesPorDataOut(ListarSolicitacoesPorDataOut value) {
        return new JAXBElement<ListarSolicitacoesPorDataOut>(_ListarSolicitacoesPorDataOut_QNAME, ListarSolicitacoesPorDataOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAreaPublicidade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ArrayOfAreaPublicidade")
    public JAXBElement<ArrayOfAreaPublicidade> createArrayOfAreaPublicidade(ArrayOfAreaPublicidade value) {
        return new JAXBElement<ArrayOfAreaPublicidade>(_ArrayOfAreaPublicidade_QNAME, ArrayOfAreaPublicidade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RG }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "RG")
    public JAXBElement<RG> createRG(RG value) {
        return new JAXBElement<RG>(_RG_QNAME, RG.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCnae }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ArrayOfCnae")
    public JAXBElement<ArrayOfCnae> createArrayOfCnae(ArrayOfCnae value) {
        return new JAXBElement<ArrayOfCnae>(_ArrayOfCnae_QNAME, ArrayOfCnae.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pessoa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Pessoa")
    public JAXBElement<Pessoa> createPessoa(Pessoa value) {
        return new JAXBElement<Pessoa>(_Pessoa_QNAME, Pessoa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicencaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "LicencaEntity")
    public JAXBElement<LicencaEntity> createLicencaEntity(LicencaEntity value) {
        return new JAXBElement<LicencaEntity>(_LicencaEntity_QNAME, LicencaEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CassarLicencaOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "CassarLicencaOut")
    public JAXBElement<CassarLicencaOut> createCassarLicencaOut(CassarLicencaOut value) {
        return new JAXBElement<CassarLicencaOut>(_CassarLicencaOut_QNAME, CassarLicencaOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDadosEmpresaOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ConsultarDadosEmpresaOut")
    public JAXBElement<ConsultarDadosEmpresaOut> createConsultarDadosEmpresaOut(ConsultarDadosEmpresaOut value) {
        return new JAXBElement<ConsultarDadosEmpresaOut>(_ConsultarDadosEmpresaOut_QNAME, ConsultarDadosEmpresaOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoViabilidade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "EnderecoViabilidade")
    public JAXBElement<EnderecoViabilidade> createEnderecoViabilidade(EnderecoViabilidade value) {
        return new JAXBElement<EnderecoViabilidade>(_EnderecoViabilidade_QNAME, EnderecoViabilidade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtividadeAuxiliar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "AtividadeAuxiliar")
    public JAXBElement<AtividadeAuxiliar> createAtividadeAuxiliar(AtividadeAuxiliar value) {
        return new JAXBElement<AtividadeAuxiliar>(_AtividadeAuxiliar_QNAME, AtividadeAuxiliar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Socio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Socio")
    public JAXBElement<Socio> createSocio(Socio value) {
        return new JAXBElement<Socio>(_Socio_QNAME, Socio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosComplementares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "DadosComplementares")
    public JAXBElement<DadosComplementares> createDadosComplementares(DadosComplementares value) {
        return new JAXBElement<DadosComplementares>(_DadosComplementares_QNAME, DadosComplementares.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estabelecimento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Estabelecimento")
    public JAXBElement<Estabelecimento> createEstabelecimento(Estabelecimento value) {
        return new JAXBElement<Estabelecimento>(_Estabelecimento_QNAME, Estabelecimento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDadosEmpresaIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ConsultarDadosEmpresaIn")
    public JAXBElement<ConsultarDadosEmpresaIn> createConsultarDadosEmpresaIn(ConsultarDadosEmpresaIn value) {
        return new JAXBElement<ConsultarDadosEmpresaIn>(_ConsultarDadosEmpresaIn_QNAME, ConsultarDadosEmpresaIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosImovel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ArrayOfDadosImovel")
    public JAXBElement<ArrayOfDadosImovel> createArrayOfDadosImovel(ArrayOfDadosImovel value) {
        return new JAXBElement<ArrayOfDadosImovel>(_ArrayOfDadosImovel_QNAME, ArrayOfDadosImovel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JucespFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "JucespFault")
    public JAXBElement<JucespFault> createJucespFault(JucespFault value) {
        return new JAXBElement<JucespFault>(_JucespFault_QNAME, JucespFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidarLicencaIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "InvalidarLicencaIn")
    public JAXBElement<InvalidarLicencaIn> createInvalidarLicencaIn(InvalidarLicencaIn value) {
        return new JAXBElement<InvalidarLicencaIn>(_InvalidarLicencaIn_QNAME, InvalidarLicencaIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Item")
    public JAXBElement<Item> createItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInscricaoImovel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ArrayOfInscricaoImovel")
    public JAXBElement<ArrayOfInscricaoImovel> createArrayOfInscricaoImovel(ArrayOfInscricaoImovel value) {
        return new JAXBElement<ArrayOfInscricaoImovel>(_ArrayOfInscricaoImovel_QNAME, ArrayOfInscricaoImovel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InscricaoImovel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "InscricaoImovel")
    public JAXBElement<InscricaoImovel> createInscricaoImovel(InscricaoImovel value) {
        return new JAXBElement<InscricaoImovel>(_InscricaoImovel_QNAME, InscricaoImovel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorDataIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ListarSolicitacoesPorDataIn")
    public JAXBElement<ListarSolicitacoesPorDataIn> createListarSolicitacoesPorDataIn(ListarSolicitacoesPorDataIn value) {
        return new JAXBElement<ListarSolicitacoesPorDataIn>(_ListarSolicitacoesPorDataIn_QNAME, ListarSolicitacoesPorDataIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Endereco }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Endereco")
    public JAXBElement<Endereco> createEndereco(Endereco value) {
        return new JAXBElement<Endereco>(_Endereco_QNAME, Endereco.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CassarLicencaIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "CassarLicencaIn")
    public JAXBElement<CassarLicencaIn> createCassarLicencaIn(CassarLicencaIn value) {
        return new JAXBElement<CassarLicencaIn>(_CassarLicencaIn_QNAME, CassarLicencaIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Complemento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Complemento")
    public JAXBElement<Complemento> createComplemento(Complemento value) {
        return new JAXBElement<Complemento>(_Complemento_QNAME, Complemento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "BaseEntity")
    public JAXBElement<BaseEntity> createBaseEntity(BaseEntity value) {
        return new JAXBElement<BaseEntity>(_BaseEntity_QNAME, BaseEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAtividadeAuxiliar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ArrayOfAtividadeAuxiliar")
    public JAXBElement<ArrayOfAtividadeAuxiliar> createArrayOfAtividadeAuxiliar(ArrayOfAtividadeAuxiliar value) {
        return new JAXBElement<ArrayOfAtividadeAuxiliar>(_ArrayOfAtividadeAuxiliar_QNAME, ArrayOfAtividadeAuxiliar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSituacaoLicencaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "ArrayOfSituacaoLicencaEntity")
    public JAXBElement<ArrayOfSituacaoLicencaEntity> createArrayOfSituacaoLicencaEntity(ArrayOfSituacaoLicencaEntity value) {
        return new JAXBElement<ArrayOfSituacaoLicencaEntity>(_ArrayOfSituacaoLicencaEntity_QNAME, ArrayOfSituacaoLicencaEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInformacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ItemInformacao")
    public JAXBElement<ItemInformacao> createItemInformacao(ItemInformacao value) {
        return new JAXBElement<ItemInformacao>(_ItemInformacao_QNAME, ItemInformacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosImovel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "DadosImovel")
    public JAXBElement<DadosImovel> createDadosImovel(DadosImovel value) {
        return new JAXBElement<DadosImovel>(_DadosImovel_QNAME, DadosImovel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformarConclusaoLicencaIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "InformarConclusaoLicencaIn")
    public JAXBElement<InformarConclusaoLicencaIn> createInformarConclusaoLicencaIn(InformarConclusaoLicencaIn value) {
        return new JAXBElement<InformarConclusaoLicencaIn>(_InformarConclusaoLicencaIn_QNAME, InformarConclusaoLicencaIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSolicitacaoLicenciamentoIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ConsultarSolicitacaoLicenciamentoIn")
    public JAXBElement<ConsultarSolicitacaoLicenciamentoIn> createConsultarSolicitacaoLicenciamentoIn(ConsultarSolicitacaoLicenciamentoIn value) {
        return new JAXBElement<ConsultarSolicitacaoLicenciamentoIn>(_ConsultarSolicitacaoLicenciamentoIn_QNAME, ConsultarSolicitacaoLicenciamentoIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformarInteracaoComOrgaoIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "InformarInteracaoComOrgaoIn")
    public JAXBElement<InformarInteracaoComOrgaoIn> createInformarInteracaoComOrgaoIn(InformarInteracaoComOrgaoIn value) {
        return new JAXBElement<InformarInteracaoComOrgaoIn>(_InformarInteracaoComOrgaoIn_QNAME, InformarInteracaoComOrgaoIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaPublicidade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "AreaPublicidade")
    public JAXBElement<AreaPublicidade> createAreaPublicidade(AreaPublicidade value) {
        return new JAXBElement<AreaPublicidade>(_AreaPublicidade_QNAME, AreaPublicidade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEnderecoViabilidade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ArrayOfEnderecoViabilidade")
    public JAXBElement<ArrayOfEnderecoViabilidade> createArrayOfEnderecoViabilidade(ArrayOfEnderecoViabilidade value) {
        return new JAXBElement<ArrayOfEnderecoViabilidade>(_ArrayOfEnderecoViabilidade_QNAME, ArrayOfEnderecoViabilidade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ArrayOfRequestResult")
    public JAXBElement<ArrayOfRequestResult> createArrayOfRequestResult(ArrayOfRequestResult value) {
        return new JAXBElement<ArrayOfRequestResult>(_ArrayOfRequestResult_QNAME, ArrayOfRequestResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cnae }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Cnae")
    public JAXBElement<Cnae> createCnae(Cnae value) {
        return new JAXBElement<Cnae>(_Cnae_QNAME, Cnae.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformarConclusaoLicencaOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "InformarConclusaoLicencaOut")
    public JAXBElement<InformarConclusaoLicencaOut> createInformarConclusaoLicencaOut(InformarConclusaoLicencaOut value) {
        return new JAXBElement<InformarConclusaoLicencaOut>(_InformarConclusaoLicencaOut_QNAME, InformarConclusaoLicencaOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItemInformacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ArrayOfItemInformacao")
    public JAXBElement<ArrayOfItemInformacao> createArrayOfItemInformacao(ArrayOfItemInformacao value) {
        return new JAXBElement<ArrayOfItemInformacao>(_ArrayOfItemInformacao_QNAME, ArrayOfItemInformacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituacaoLicencaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "SituacaoLicencaEntity")
    public JAXBElement<SituacaoLicencaEntity> createSituacaoLicencaEntity(SituacaoLicencaEntity value) {
        return new JAXBElement<SituacaoLicencaEntity>(_SituacaoLicencaEntity_QNAME, SituacaoLicencaEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHorario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ArrayOfHorario")
    public JAXBElement<ArrayOfHorario> createArrayOfHorario(ArrayOfHorario value) {
        return new JAXBElement<ArrayOfHorario>(_ArrayOfHorario_QNAME, ArrayOfHorario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "AuthenticationHeader")
    public JAXBElement<AuthenticationHeader> createAuthenticationHeader(AuthenticationHeader value) {
        return new JAXBElement<AuthenticationHeader>(_AuthenticationHeader_QNAME, AuthenticationHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituacaoSolicitacaoEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "SituacaoSolicitacaoEntity")
    public JAXBElement<SituacaoSolicitacaoEntity> createSituacaoSolicitacaoEntity(SituacaoSolicitacaoEntity value) {
        return new JAXBElement<SituacaoSolicitacaoEntity>(_SituacaoSolicitacaoEntity_QNAME, SituacaoSolicitacaoEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiberarCassarLicencaOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "LiberarCassarLicencaOut")
    public JAXBElement<LiberarCassarLicencaOut> createLiberarCassarLicencaOut(LiberarCassarLicencaOut value) {
        return new JAXBElement<LiberarCassarLicencaOut>(_LiberarCassarLicencaOut_QNAME, LiberarCassarLicencaOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformarInteracaoComOrgaoOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "InformarInteracaoComOrgaoOut")
    public JAXBElement<InformarInteracaoComOrgaoOut> createInformarInteracaoComOrgaoOut(InformarInteracaoComOrgaoOut value) {
        return new JAXBElement<InformarInteracaoComOrgaoOut>(_InformarInteracaoComOrgaoOut_QNAME, InformarInteracaoComOrgaoOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Horario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Horario")
    public JAXBElement<Horario> createHorario(Horario value) {
        return new JAXBElement<Horario>(_Horario_QNAME, Horario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarCassarLicencaOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "CancelarCassarLicencaOut")
    public JAXBElement<CancelarCassarLicencaOut> createCancelarCassarLicencaOut(CancelarCassarLicencaOut value) {
        return new JAXBElement<CancelarCassarLicencaOut>(_CancelarCassarLicencaOut_QNAME, CancelarCassarLicencaOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Viabilidades.Data/01", name = "MessageRequest")
    public JAXBElement<MessageRequest> createMessageRequest(MessageRequest value) {
        return new JAXBElement<MessageRequest>(_MessageRequest_QNAME, MessageRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSituacaoSolicitacaoEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "ArrayOfSituacaoSolicitacaoEntity")
    public JAXBElement<ArrayOfSituacaoSolicitacaoEntity> createArrayOfSituacaoSolicitacaoEntity(ArrayOfSituacaoSolicitacaoEntity value) {
        return new JAXBElement<ArrayOfSituacaoSolicitacaoEntity>(_ArrayOfSituacaoSolicitacaoEntity_QNAME, ArrayOfSituacaoSolicitacaoEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSolicitacaoLicenciamentoOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ConsultarSolicitacaoLicenciamentoOut")
    public JAXBElement<ConsultarSolicitacaoLicenciamentoOut> createConsultarSolicitacaoLicenciamentoOut(ConsultarSolicitacaoLicenciamentoOut value) {
        return new JAXBElement<ConsultarSolicitacaoLicenciamentoOut>(_ConsultarSolicitacaoLicenciamentoOut_QNAME, ConsultarSolicitacaoLicenciamentoOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidarLicencaOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "InvalidarLicencaOut")
    public JAXBElement<InvalidarLicencaOut> createInvalidarLicencaOut(InvalidarLicencaOut value) {
        return new JAXBElement<InvalidarLicencaOut>(_InvalidarLicencaOut_QNAME, InvalidarLicencaOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "RequestResult")
    public JAXBElement<RequestResult> createRequestResult(RequestResult value) {
        return new JAXBElement<RequestResult>(_RequestResult_QNAME, RequestResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ArrayOfItem")
    public JAXBElement<ArrayOfItem> createArrayOfItem(ArrayOfItem value) {
        return new JAXBElement<ArrayOfItem>(_ArrayOfItem_QNAME, ArrayOfItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarCassarLicencaOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "CancelarCassarLicencaResult", scope = CancelarCassarLicencaResponse.class)
    public JAXBElement<CancelarCassarLicencaOut> createCancelarCassarLicencaResponseCancelarCassarLicencaResult(CancelarCassarLicencaOut value) {
        return new JAXBElement<CancelarCassarLicencaOut>(_CancelarCassarLicencaResponseCancelarCassarLicencaResult_QNAME, CancelarCassarLicencaOut.class, CancelarCassarLicencaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "CNPJouProtocoloREDESIM", scope = ConsultarDadosEmpresaIn.class)
    public JAXBElement<String> createConsultarDadosEmpresaInCNPJouProtocoloREDESIM(String value) {
        return new JAXBElement<String>(_ConsultarDadosEmpresaInCNPJouProtocoloREDESIM_QNAME, String.class, ConsultarDadosEmpresaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorProtocoloREDESIMIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "dto", scope = ListarSolicitacoesPorProtocoloREDESIM.class)
    public JAXBElement<ListarSolicitacoesPorProtocoloREDESIMIn> createListarSolicitacoesPorProtocoloREDESIMDto(ListarSolicitacoesPorProtocoloREDESIMIn value) {
        return new JAXBElement<ListarSolicitacoesPorProtocoloREDESIMIn>(_ListarSolicitacoesPorProtocoloREDESIMDto_QNAME, ListarSolicitacoesPorProtocoloREDESIMIn.class, ListarSolicitacoesPorProtocoloREDESIM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "Data", scope = SituacaoSolicitacaoEntity.class)
    public JAXBElement<XMLGregorianCalendar> createSituacaoSolicitacaoEntityData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SituacaoSolicitacaoEntityData_QNAME, XMLGregorianCalendar.class, SituacaoSolicitacaoEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "CPFResponsavel", scope = SituacaoSolicitacaoEntity.class)
    public JAXBElement<String> createSituacaoSolicitacaoEntityCPFResponsavel(String value) {
        return new JAXBElement<String>(_SituacaoSolicitacaoEntityCPFResponsavel_QNAME, String.class, SituacaoSolicitacaoEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "Descricao", scope = SituacaoSolicitacaoEntity.class)
    public JAXBElement<String> createSituacaoSolicitacaoEntityDescricao(String value) {
        return new JAXBElement<String>(_SituacaoSolicitacaoEntityDescricao_QNAME, String.class, SituacaoSolicitacaoEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Codigo", scope = AtividadeAuxiliar.class)
    public JAXBElement<String> createAtividadeAuxiliarCodigo(String value) {
        return new JAXBElement<String>(_AtividadeAuxiliarCodigo_QNAME, String.class, AtividadeAuxiliar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Descricao", scope = AtividadeAuxiliar.class)
    public JAXBElement<String> createAtividadeAuxiliarDescricao(String value) {
        return new JAXBElement<String>(_AtividadeAuxiliarDescricao_QNAME, String.class, AtividadeAuxiliar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfComplemento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Complementos", scope = EnderecoViabilidade.class)
    public JAXBElement<ArrayOfComplemento> createEnderecoViabilidadeComplementos(ArrayOfComplemento value) {
        return new JAXBElement<ArrayOfComplemento>(_EnderecoViabilidadeComplementos_QNAME, ArrayOfComplemento.class, EnderecoViabilidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "CEP", scope = EnderecoViabilidade.class)
    public JAXBElement<String> createEnderecoViabilidadeCEP(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeCEP_QNAME, String.class, EnderecoViabilidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInscricaoImovel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "InscricaoSetorQuadraLotes", scope = EnderecoViabilidade.class)
    public JAXBElement<ArrayOfInscricaoImovel> createEnderecoViabilidadeInscricaoSetorQuadraLotes(ArrayOfInscricaoImovel value) {
        return new JAXBElement<ArrayOfInscricaoImovel>(_EnderecoViabilidadeInscricaoSetorQuadraLotes_QNAME, ArrayOfInscricaoImovel.class, EnderecoViabilidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Bairro", scope = EnderecoViabilidade.class)
    public JAXBElement<String> createEnderecoViabilidadeBairro(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeBairro_QNAME, String.class, EnderecoViabilidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Referencia", scope = EnderecoViabilidade.class)
    public JAXBElement<String> createEnderecoViabilidadeReferencia(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeReferencia_QNAME, String.class, EnderecoViabilidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ResponsavelInformacao", scope = EnderecoViabilidade.class)
    public JAXBElement<Item> createEnderecoViabilidadeResponsavelInformacao(Item value) {
        return new JAXBElement<Item>(_EnderecoViabilidadeResponsavelInformacao_QNAME, Item.class, EnderecoViabilidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "TipoLogradouro", scope = EnderecoViabilidade.class)
    public JAXBElement<Item> createEnderecoViabilidadeTipoLogradouro(Item value) {
        return new JAXBElement<Item>(_EnderecoViabilidadeTipoLogradouro_QNAME, Item.class, EnderecoViabilidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Numero", scope = EnderecoViabilidade.class)
    public JAXBElement<String> createEnderecoViabilidadeNumero(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeNumero_QNAME, String.class, EnderecoViabilidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "UF", scope = EnderecoViabilidade.class)
    public JAXBElement<String> createEnderecoViabilidadeUF(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeUF_QNAME, String.class, EnderecoViabilidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Logradouro", scope = EnderecoViabilidade.class)
    public JAXBElement<String> createEnderecoViabilidadeLogradouro(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeLogradouro_QNAME, String.class, EnderecoViabilidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Municipio", scope = EnderecoViabilidade.class)
    public JAXBElement<Item> createEnderecoViabilidadeMunicipio(Item value) {
        return new JAXBElement<Item>(_EnderecoViabilidadeMunicipio_QNAME, Item.class, EnderecoViabilidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Resultado", scope = InvalidarLicencaOut.class)
    public JAXBElement<ArrayOfRequestResult> createInvalidarLicencaOutResultado(ArrayOfRequestResult value) {
        return new JAXBElement<ArrayOfRequestResult>(_InvalidarLicencaOutResultado_QNAME, ArrayOfRequestResult.class, InvalidarLicencaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CassarLicencaIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "dto", scope = CassarLicenca.class)
    public JAXBElement<CassarLicencaIn> createCassarLicencaDto(CassarLicencaIn value) {
        return new JAXBElement<CassarLicencaIn>(_ListarSolicitacoesPorProtocoloREDESIMDto_QNAME, CassarLicencaIn.class, CassarLicenca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformarConclusaoLicencaIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "dto", scope = InformarConclusaoLicenca.class)
    public JAXBElement<InformarConclusaoLicencaIn> createInformarConclusaoLicencaDto(InformarConclusaoLicencaIn value) {
        return new JAXBElement<InformarConclusaoLicencaIn>(_ListarSolicitacoesPorProtocoloREDESIMDto_QNAME, InformarConclusaoLicencaIn.class, InformarConclusaoLicenca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarCassarLicencaIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "dto", scope = CancelarCassarLicenca.class)
    public JAXBElement<CancelarCassarLicencaIn> createCancelarCassarLicencaDto(CancelarCassarLicencaIn value) {
        return new JAXBElement<CancelarCassarLicencaIn>(_ListarSolicitacoesPorProtocoloREDESIMDto_QNAME, CancelarCassarLicencaIn.class, CancelarCassarLicenca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Resultado", scope = ListarSolicitacoesPorProtocoloREDESIMOut.class)
    public JAXBElement<RequestResult> createListarSolicitacoesPorProtocoloREDESIMOutResultado(RequestResult value) {
        return new JAXBElement<RequestResult>(_InvalidarLicencaOutResultado_QNAME, RequestResult.class, ListarSolicitacoesPorProtocoloREDESIMOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Protocolos", scope = ListarSolicitacoesPorProtocoloREDESIMOut.class)
    public JAXBElement<ArrayOflong> createListarSolicitacoesPorProtocoloREDESIMOutProtocolos(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ListarSolicitacoesPorProtocoloREDESIMOutProtocolos_QNAME, ArrayOflong.class, ListarSolicitacoesPorProtocoloREDESIMOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "TipoPublicidade", scope = AreaPublicidade.class)
    public JAXBElement<Item> createAreaPublicidadeTipoPublicidade(Item value) {
        return new JAXBElement<Item>(_AreaPublicidadeTipoPublicidade_QNAME, Item.class, AreaPublicidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Area", scope = AreaPublicidade.class)
    public JAXBElement<BigDecimal> createAreaPublicidadeArea(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaPublicidadeArea_QNAME, BigDecimal.class, AreaPublicidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Resultado", scope = LiberarCassarLicencaOut.class)
    public JAXBElement<ArrayOfRequestResult> createLiberarCassarLicencaOutResultado(ArrayOfRequestResult value) {
        return new JAXBElement<ArrayOfRequestResult>(_InvalidarLicencaOutResultado_QNAME, ArrayOfRequestResult.class, LiberarCassarLicencaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Resultado", scope = InformarConclusaoLicencaOut.class)
    public JAXBElement<ArrayOfRequestResult> createInformarConclusaoLicencaOutResultado(ArrayOfRequestResult value) {
        return new JAXBElement<ArrayOfRequestResult>(_InvalidarLicencaOutResultado_QNAME, ArrayOfRequestResult.class, InformarConclusaoLicencaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Resultado", scope = CancelarCassarLicencaOut.class)
    public JAXBElement<ArrayOfRequestResult> createCancelarCassarLicencaOutResultado(ArrayOfRequestResult value) {
        return new JAXBElement<ArrayOfRequestResult>(_InvalidarLicencaOutResultado_QNAME, ArrayOfRequestResult.class, CancelarCassarLicencaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Resultado", scope = CassarLicencaOut.class)
    public JAXBElement<ArrayOfRequestResult> createCassarLicencaOutResultado(ArrayOfRequestResult value) {
        return new JAXBElement<ArrayOfRequestResult>(_InvalidarLicencaOutResultado_QNAME, ArrayOfRequestResult.class, CassarLicencaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "NumeroProtocoloOrgao", scope = CassarLicencaIn.class)
    public JAXBElement<String> createCassarLicencaInNumeroProtocoloOrgao(String value) {
        return new JAXBElement<String>(_CassarLicencaInNumeroProtocoloOrgao_QNAME, String.class, CassarLicencaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItemInformacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "InformacoesComplementares", scope = CassarLicencaIn.class)
    public JAXBElement<ArrayOfItemInformacao> createCassarLicencaInInformacoesComplementares(ArrayOfItemInformacao value) {
        return new JAXBElement<ArrayOfItemInformacao>(_CassarLicencaInInformacoesComplementares_QNAME, ArrayOfItemInformacao.class, CassarLicencaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Descricao", scope = Cnae.class)
    public JAXBElement<String> createCnaeDescricao(String value) {
        return new JAXBElement<String>(_AtividadeAuxiliarDescricao_QNAME, String.class, Cnae.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Nome", scope = Socio.class)
    public JAXBElement<String> createSocioNome(String value) {
        return new JAXBElement<String>(_SocioNome_QNAME, String.class, Socio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "NumeroRegistro", scope = Socio.class)
    public JAXBElement<String> createSocioNumeroRegistro(String value) {
        return new JAXBElement<String>(_SocioNumeroRegistro_QNAME, String.class, Socio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSolicitacaoLicenciamentoOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "ConsultarSolicitacaoLicenciamentoResult", scope = ConsultarSolicitacaoLicenciamentoResponse.class)
    public JAXBElement<ConsultarSolicitacaoLicenciamentoOut> createConsultarSolicitacaoLicenciamentoResponseConsultarSolicitacaoLicenciamentoResult(ConsultarSolicitacaoLicenciamentoOut value) {
        return new JAXBElement<ConsultarSolicitacaoLicenciamentoOut>(_ConsultarSolicitacaoLicenciamentoResponseConsultarSolicitacaoLicenciamentoResult_QNAME, ConsultarSolicitacaoLicenciamentoOut.class, ConsultarSolicitacaoLicenciamentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidarLicencaOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "InvalidarLicencaResult", scope = InvalidarLicencaResponse.class)
    public JAXBElement<InvalidarLicencaOut> createInvalidarLicencaResponseInvalidarLicencaResult(InvalidarLicencaOut value) {
        return new JAXBElement<InvalidarLicencaOut>(_InvalidarLicencaResponseInvalidarLicencaResult_QNAME, InvalidarLicencaOut.class, InvalidarLicencaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformarInteracaoComOrgaoOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "InformarInteracaoComOrgaoResult", scope = InformarInteracaoComOrgaoResponse.class)
    public JAXBElement<InformarInteracaoComOrgaoOut> createInformarInteracaoComOrgaoResponseInformarInteracaoComOrgaoResult(InformarInteracaoComOrgaoOut value) {
        return new JAXBElement<InformarInteracaoComOrgaoOut>(_InformarInteracaoComOrgaoResponseInformarInteracaoComOrgaoResult_QNAME, InformarInteracaoComOrgaoOut.class, InformarInteracaoComOrgaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Valor", scope = Complemento.class)
    public JAXBElement<String> createComplementoValor(String value) {
        return new JAXBElement<String>(_ComplementoValor_QNAME, String.class, Complemento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Codigo", scope = Complemento.class)
    public JAXBElement<String> createComplementoCodigo(String value) {
        return new JAXBElement<String>(_AtividadeAuxiliarCodigo_QNAME, String.class, Complemento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Descricao", scope = Complemento.class)
    public JAXBElement<String> createComplementoDescricao(String value) {
        return new JAXBElement<String>(_AtividadeAuxiliarDescricao_QNAME, String.class, Complemento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "FormasAtuacao", scope = Estabelecimento.class)
    public JAXBElement<ArrayOfItem> createEstabelecimentoFormasAtuacao(ArrayOfItem value) {
        return new JAXBElement<ArrayOfItem>(_EstabelecimentoFormasAtuacao_QNAME, ArrayOfItem.class, Estabelecimento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAtividadeAuxiliar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "AtividadeAuxiliares", scope = Estabelecimento.class)
    public JAXBElement<ArrayOfAtividadeAuxiliar> createEstabelecimentoAtividadeAuxiliares(ArrayOfAtividadeAuxiliar value) {
        return new JAXBElement<ArrayOfAtividadeAuxiliar>(_EstabelecimentoAtividadeAuxiliares_QNAME, ArrayOfAtividadeAuxiliar.class, Estabelecimento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCnae }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Cnaes", scope = Estabelecimento.class)
    public JAXBElement<ArrayOfCnae> createEstabelecimentoCnaes(ArrayOfCnae value) {
        return new JAXBElement<ArrayOfCnae>(_EstabelecimentoCnaes_QNAME, ArrayOfCnae.class, Estabelecimento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosComplementares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "DadosComplementares", scope = Estabelecimento.class)
    public JAXBElement<DadosComplementares> createEstabelecimentoDadosComplementares(DadosComplementares value) {
        return new JAXBElement<DadosComplementares>(_DadosComplementares_QNAME, DadosComplementares.class, Estabelecimento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEnderecoViabilidade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "EnderecosViabilidade", scope = Estabelecimento.class)
    public JAXBElement<ArrayOfEnderecoViabilidade> createEstabelecimentoEnderecosViabilidade(ArrayOfEnderecoViabilidade value) {
        return new JAXBElement<ArrayOfEnderecoViabilidade>(_EstabelecimentoEnderecosViabilidade_QNAME, ArrayOfEnderecoViabilidade.class, Estabelecimento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDadosImovel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "InformacoesImovel", scope = Estabelecimento.class)
    public JAXBElement<ArrayOfDadosImovel> createEstabelecimentoInformacoesImovel(ArrayOfDadosImovel value) {
        return new JAXBElement<ArrayOfDadosImovel>(_EstabelecimentoInformacoesImovel_QNAME, ArrayOfDadosImovel.class, Estabelecimento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "TipoUnidade", scope = Estabelecimento.class)
    public JAXBElement<Item> createEstabelecimentoTipoUnidade(Item value) {
        return new JAXBElement<Item>(_EstabelecimentoTipoUnidade_QNAME, Item.class, Estabelecimento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformarInteracaoComOrgaoIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "dto", scope = InformarInteracaoComOrgao.class)
    public JAXBElement<InformarInteracaoComOrgaoIn> createInformarInteracaoComOrgaoDto(InformarInteracaoComOrgaoIn value) {
        return new JAXBElement<InformarInteracaoComOrgaoIn>(_ListarSolicitacoesPorProtocoloREDESIMDto_QNAME, InformarInteracaoComOrgaoIn.class, InformarInteracaoComOrgao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Messages", scope = JucespFault.class)
    public JAXBElement<ArrayOfstring> createJucespFaultMessages(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_JucespFaultMessages_QNAME, ArrayOfstring.class, JucespFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "NumeroProtocolo", scope = LicencaEntity.class)
    public JAXBElement<String> createLicencaEntityNumeroProtocolo(String value) {
        return new JAXBElement<String>(_LicencaEntityNumeroProtocolo_QNAME, String.class, LicencaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "Detalhe", scope = LicencaEntity.class)
    public JAXBElement<String> createLicencaEntityDetalhe(String value) {
        return new JAXBElement<String>(_LicencaEntityDetalhe_QNAME, String.class, LicencaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "NumeroLicenca", scope = LicencaEntity.class)
    public JAXBElement<String> createLicencaEntityNumeroLicenca(String value) {
        return new JAXBElement<String>(_LicencaEntityNumeroLicenca_QNAME, String.class, LicencaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "Risco", scope = LicencaEntity.class)
    public JAXBElement<Item> createLicencaEntityRisco(Item value) {
        return new JAXBElement<Item>(_LicencaEntityRisco_QNAME, Item.class, LicencaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "DataEmissaoLicenca", scope = LicencaEntity.class)
    public JAXBElement<XMLGregorianCalendar> createLicencaEntityDataEmissaoLicenca(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LicencaEntityDataEmissaoLicenca_QNAME, XMLGregorianCalendar.class, LicencaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "DataValidadeLicenca", scope = LicencaEntity.class)
    public JAXBElement<XMLGregorianCalendar> createLicencaEntityDataValidadeLicenca(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LicencaEntityDataValidadeLicenca_QNAME, XMLGregorianCalendar.class, LicencaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItemInformacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "InformacoesComplementares", scope = LicencaEntity.class)
    public JAXBElement<ArrayOfItemInformacao> createLicencaEntityInformacoesComplementares(ArrayOfItemInformacao value) {
        return new JAXBElement<ArrayOfItemInformacao>(_LicencaEntityInformacoesComplementares_QNAME, ArrayOfItemInformacao.class, LicencaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "DataProtocolo", scope = LicencaEntity.class)
    public JAXBElement<XMLGregorianCalendar> createLicencaEntityDataProtocolo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LicencaEntityDataProtocolo_QNAME, XMLGregorianCalendar.class, LicencaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "OrgaoLicenca", scope = LicencaEntity.class)
    public JAXBElement<Item> createLicencaEntityOrgaoLicenca(Item value) {
        return new JAXBElement<Item>(_LicencaEntityOrgaoLicenca_QNAME, Item.class, LicencaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSituacaoLicencaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "SituacaoLicenca", scope = LicencaEntity.class)
    public JAXBElement<ArrayOfSituacaoLicencaEntity> createLicencaEntitySituacaoLicenca(ArrayOfSituacaoLicencaEntity value) {
        return new JAXBElement<ArrayOfSituacaoLicencaEntity>(_LicencaEntitySituacaoLicenca_QNAME, ArrayOfSituacaoLicencaEntity.class, LicencaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CassarLicencaOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "CassarLicencaResult", scope = CassarLicencaResponse.class)
    public JAXBElement<CassarLicencaOut> createCassarLicencaResponseCassarLicencaResult(CassarLicencaOut value) {
        return new JAXBElement<CassarLicencaOut>(_CassarLicencaResponseCassarLicencaResult_QNAME, CassarLicencaOut.class, CassarLicencaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "NumeroFuncionario", scope = DadosImovel.class)
    public JAXBElement<Integer> createDadosImovelNumeroFuncionario(Integer value) {
        return new JAXBElement<Integer>(_DadosImovelNumeroFuncionario_QNAME, Integer.class, DadosImovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ResponsavelInformacao", scope = DadosImovel.class)
    public JAXBElement<Item> createDadosImovelResponsavelInformacao(Item value) {
        return new JAXBElement<Item>(_EnderecoViabilidadeResponsavelInformacao_QNAME, Item.class, DadosImovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "AreaImovel", scope = DadosImovel.class)
    public JAXBElement<BigDecimal> createDadosImovelAreaImovel(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DadosImovelAreaImovel_QNAME, BigDecimal.class, DadosImovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "AreaEstabelecimento", scope = DadosImovel.class)
    public JAXBElement<BigDecimal> createDadosImovelAreaEstabelecimento(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DadosImovelAreaEstabelecimento_QNAME, BigDecimal.class, DadosImovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "AreaTerreno", scope = DadosImovel.class)
    public JAXBElement<BigDecimal> createDadosImovelAreaTerreno(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DadosImovelAreaTerreno_QNAME, BigDecimal.class, DadosImovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "ComprimentoTestada", scope = DadosImovel.class)
    public JAXBElement<BigDecimal> createDadosImovelComprimentoTestada(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DadosImovelComprimentoTestada_QNAME, BigDecimal.class, DadosImovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorProtocoloREDESIMOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "ListarSolicitacoesPorProtocoloREDESIMResult", scope = ListarSolicitacoesPorProtocoloREDESIMResponse.class)
    public JAXBElement<ListarSolicitacoesPorProtocoloREDESIMOut> createListarSolicitacoesPorProtocoloREDESIMResponseListarSolicitacoesPorProtocoloREDESIMResult(ListarSolicitacoesPorProtocoloREDESIMOut value) {
        return new JAXBElement<ListarSolicitacoesPorProtocoloREDESIMOut>(_ListarSolicitacoesPorProtocoloREDESIMResponseListarSolicitacoesPorProtocoloREDESIMResult_QNAME, ListarSolicitacoesPorProtocoloREDESIMOut.class, ListarSolicitacoesPorProtocoloREDESIMResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "CEP", scope = Endereco.class)
    public JAXBElement<String> createEnderecoCEP(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeCEP_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Bairro", scope = Endereco.class)
    public JAXBElement<String> createEnderecoBairro(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeBairro_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Complemento", scope = Endereco.class)
    public JAXBElement<String> createEnderecoComplemento(String value) {
        return new JAXBElement<String>(_Complemento_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Telefone", scope = Endereco.class)
    public JAXBElement<Long> createEnderecoTelefone(Long value) {
        return new JAXBElement<Long>(_EnderecoTelefone_QNAME, Long.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Email", scope = Endereco.class)
    public JAXBElement<String> createEnderecoEmail(String value) {
        return new JAXBElement<String>(_EnderecoEmail_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "TipoLogradouro", scope = Endereco.class)
    public JAXBElement<String> createEnderecoTipoLogradouro(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeTipoLogradouro_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Numero", scope = Endereco.class)
    public JAXBElement<String> createEnderecoNumero(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeNumero_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "UF", scope = Endereco.class)
    public JAXBElement<String> createEnderecoUF(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeUF_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Logradouro", scope = Endereco.class)
    public JAXBElement<String> createEnderecoLogradouro(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeLogradouro_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Municipio", scope = Endereco.class)
    public JAXBElement<String> createEnderecoMunicipio(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeMunicipio_QNAME, String.class, Endereco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ProtocoloREDESIM", scope = ListarSolicitacoesPorProtocoloREDESIMIn.class)
    public JAXBElement<String> createListarSolicitacoesPorProtocoloREDESIMInProtocoloREDESIM(String value) {
        return new JAXBElement<String>(_ListarSolicitacoesPorProtocoloREDESIMInProtocoloREDESIM_QNAME, String.class, ListarSolicitacoesPorProtocoloREDESIMIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSolicitacaoLicenciamentoIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "dto", scope = ConsultarSolicitacaoLicenciamento.class)
    public JAXBElement<ConsultarSolicitacaoLicenciamentoIn> createConsultarSolicitacaoLicenciamentoDto(ConsultarSolicitacaoLicenciamentoIn value) {
        return new JAXBElement<ConsultarSolicitacaoLicenciamentoIn>(_ListarSolicitacoesPorProtocoloREDESIMDto_QNAME, ConsultarSolicitacaoLicenciamentoIn.class, ConsultarSolicitacaoLicenciamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Resultado", scope = ListarSolicitacoesPorCNJPOut.class)
    public JAXBElement<RequestResult> createListarSolicitacoesPorCNJPOutResultado(RequestResult value) {
        return new JAXBElement<RequestResult>(_InvalidarLicencaOutResultado_QNAME, RequestResult.class, ListarSolicitacoesPorCNJPOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Protocolos", scope = ListarSolicitacoesPorCNJPOut.class)
    public JAXBElement<ArrayOflong> createListarSolicitacoesPorCNJPOutProtocolos(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ListarSolicitacoesPorProtocoloREDESIMOutProtocolos_QNAME, ArrayOflong.class, ListarSolicitacoesPorCNJPOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiberarCassarLicencaOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "LiberarCassarLicencaResult", scope = LiberarCassarLicencaResponse.class)
    public JAXBElement<LiberarCassarLicencaOut> createLiberarCassarLicencaResponseLiberarCassarLicencaResult(LiberarCassarLicencaOut value) {
        return new JAXBElement<LiberarCassarLicencaOut>(_LiberarCassarLicencaResponseLiberarCassarLicencaResult_QNAME, LiberarCassarLicencaOut.class, LiberarCassarLicencaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Codigo", scope = Item.class)
    public JAXBElement<String> createItemCodigo(String value) {
        return new JAXBElement<String>(_AtividadeAuxiliarCodigo_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Descricao", scope = Item.class)
    public JAXBElement<String> createItemDescricao(String value) {
        return new JAXBElement<String>(_AtividadeAuxiliarDescricao_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "CNPJ", scope = ListarSolicitacoesPorCNJPIn.class)
    public JAXBElement<String> createListarSolicitacoesPorCNJPInCNPJ(String value) {
        return new JAXBElement<String>(_ListarSolicitacoesPorCNJPInCNPJ_QNAME, String.class, ListarSolicitacoesPorCNJPIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorCNJPOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "ListarSolicitacoesPorCNPJResult", scope = ListarSolicitacoesPorCNPJResponse.class)
    public JAXBElement<ListarSolicitacoesPorCNJPOut> createListarSolicitacoesPorCNPJResponseListarSolicitacoesPorCNPJResult(ListarSolicitacoesPorCNJPOut value) {
        return new JAXBElement<ListarSolicitacoesPorCNJPOut>(_ListarSolicitacoesPorCNPJResponseListarSolicitacoesPorCNPJResult_QNAME, ListarSolicitacoesPorCNJPOut.class, ListarSolicitacoesPorCNPJResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorCNJPIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "dto", scope = ListarSolicitacoesPorCNPJ.class)
    public JAXBElement<ListarSolicitacoesPorCNJPIn> createListarSolicitacoesPorCNPJDto(ListarSolicitacoesPorCNJPIn value) {
        return new JAXBElement<ListarSolicitacoesPorCNJPIn>(_ListarSolicitacoesPorProtocoloREDESIMDto_QNAME, ListarSolicitacoesPorCNJPIn.class, ListarSolicitacoesPorCNPJ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "NumeroProtocoloOrgao", scope = InformarConclusaoLicencaIn.class)
    public JAXBElement<String> createInformarConclusaoLicencaInNumeroProtocoloOrgao(String value) {
        return new JAXBElement<String>(_CassarLicencaInNumeroProtocoloOrgao_QNAME, String.class, InformarConclusaoLicencaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "DataEmissaoLicenca", scope = InformarConclusaoLicencaIn.class)
    public JAXBElement<XMLGregorianCalendar> createInformarConclusaoLicencaInDataEmissaoLicenca(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InformarConclusaoLicencaInDataEmissaoLicenca_QNAME, XMLGregorianCalendar.class, InformarConclusaoLicencaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "DataValidadeLicenca", scope = InformarConclusaoLicencaIn.class)
    public JAXBElement<XMLGregorianCalendar> createInformarConclusaoLicencaInDataValidadeLicenca(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InformarConclusaoLicencaInDataValidadeLicenca_QNAME, XMLGregorianCalendar.class, InformarConclusaoLicencaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItemInformacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "InformacoesComplementares", scope = InformarConclusaoLicencaIn.class)
    public JAXBElement<ArrayOfItemInformacao> createInformarConclusaoLicencaInInformacoesComplementares(ArrayOfItemInformacao value) {
        return new JAXBElement<ArrayOfItemInformacao>(_CassarLicencaInInformacoesComplementares_QNAME, ArrayOfItemInformacao.class, InformarConclusaoLicencaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "NumeroLicenca", scope = InformarConclusaoLicencaIn.class)
    public JAXBElement<String> createInformarConclusaoLicencaInNumeroLicenca(String value) {
        return new JAXBElement<String>(_InformarConclusaoLicencaInNumeroLicenca_QNAME, String.class, InformarConclusaoLicencaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiberarCassarLicencaIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "dto", scope = LiberarCassarLicenca.class)
    public JAXBElement<LiberarCassarLicencaIn> createLiberarCassarLicencaDto(LiberarCassarLicencaIn value) {
        return new JAXBElement<LiberarCassarLicencaIn>(_ListarSolicitacoesPorProtocoloREDESIMDto_QNAME, LiberarCassarLicencaIn.class, LiberarCassarLicenca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Numero", scope = RG.class)
    public JAXBElement<String> createRGNumero(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeNumero_QNAME, String.class, RG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "UF", scope = RG.class)
    public JAXBElement<String> createRGUF(String value) {
        return new JAXBElement<String>(_EnderecoViabilidadeUF_QNAME, String.class, RG.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDadosEmpresaOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "ConsultarDadosEmpresaResult", scope = ConsultarDadosEmpresaResponse.class)
    public JAXBElement<ConsultarDadosEmpresaOut> createConsultarDadosEmpresaResponseConsultarDadosEmpresaResult(ConsultarDadosEmpresaOut value) {
        return new JAXBElement<ConsultarDadosEmpresaOut>(_ConsultarDadosEmpresaResponseConsultarDadosEmpresaResult_QNAME, ConsultarDadosEmpresaOut.class, ConsultarDadosEmpresaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorDataIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "dto", scope = ListarSolicitacoesPorData.class)
    public JAXBElement<ListarSolicitacoesPorDataIn> createListarSolicitacoesPorDataDto(ListarSolicitacoesPorDataIn value) {
        return new JAXBElement<ListarSolicitacoesPorDataIn>(_ListarSolicitacoesPorProtocoloREDESIMDto_QNAME, ListarSolicitacoesPorDataIn.class, ListarSolicitacoesPorData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "NumeroProtocoloOrgao", scope = CancelarCassarLicencaIn.class)
    public JAXBElement<String> createCancelarCassarLicencaInNumeroProtocoloOrgao(String value) {
        return new JAXBElement<String>(_CassarLicencaInNumeroProtocoloOrgao_QNAME, String.class, CancelarCassarLicencaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItemInformacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "InformacoesComplementares", scope = CancelarCassarLicencaIn.class)
    public JAXBElement<ArrayOfItemInformacao> createCancelarCassarLicencaInInformacoesComplementares(ArrayOfItemInformacao value) {
        return new JAXBElement<ArrayOfItemInformacao>(_CassarLicencaInInformacoesComplementares_QNAME, ArrayOfItemInformacao.class, CancelarCassarLicencaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "NumeroProtocoloOrgao", scope = InformarInteracaoComOrgaoIn.class)
    public JAXBElement<String> createInformarInteracaoComOrgaoInNumeroProtocoloOrgao(String value) {
        return new JAXBElement<String>(_CassarLicencaInNumeroProtocoloOrgao_QNAME, String.class, InformarInteracaoComOrgaoIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDadosEmpresaIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "dto", scope = ConsultarDadosEmpresa.class)
    public JAXBElement<ConsultarDadosEmpresaIn> createConsultarDadosEmpresaDto(ConsultarDadosEmpresaIn value) {
        return new JAXBElement<ConsultarDadosEmpresaIn>(_ListarSolicitacoesPorProtocoloREDESIMDto_QNAME, ConsultarDadosEmpresaIn.class, ConsultarDadosEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Viabilidades.Data/01", name = "AuthenticationHeader", scope = MessageRequest.class)
    public JAXBElement<AuthenticationHeader> createMessageRequestAuthenticationHeader(AuthenticationHeader value) {
        return new JAXBElement<AuthenticationHeader>(_MessageRequestAuthenticationHeader_QNAME, AuthenticationHeader.class, MessageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Descricao", scope = BaseEntity.class)
    public JAXBElement<String> createBaseEntityDescricao(String value) {
        return new JAXBElement<String>(_AtividadeAuxiliarDescricao_QNAME, String.class, BaseEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ObjetoSocial", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<String> createConsultarDadosEmpresaOutObjetoSocial(String value) {
        return new JAXBElement<String>(_ConsultarDadosEmpresaOutObjetoSocial_QNAME, String.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ProtocoloReconsideracao", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<String> createConsultarDadosEmpresaOutProtocoloReconsideracao(String value) {
        return new JAXBElement<String>(_ConsultarDadosEmpresaOutProtocoloReconsideracao_QNAME, String.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ValidadeViabilidade", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<XMLGregorianCalendar> createConsultarDadosEmpresaOutValidadeViabilidade(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ConsultarDadosEmpresaOutValidadeViabilidade_QNAME, XMLGregorianCalendar.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "OrgaoRegistrador", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<Item> createConsultarDadosEmpresaOutOrgaoRegistrador(Item value) {
        return new JAXBElement<Item>(_ConsultarDadosEmpresaOutOrgaoRegistrador_QNAME, Item.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "RazaoSocial", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<String> createConsultarDadosEmpresaOutRazaoSocial(String value) {
        return new JAXBElement<String>(_ConsultarDadosEmpresaOutRazaoSocial_QNAME, String.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estabelecimento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Estabelecimento", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<Estabelecimento> createConsultarDadosEmpresaOutEstabelecimento(Estabelecimento value) {
        return new JAXBElement<Estabelecimento>(_ConsultarDadosEmpresaOutEstabelecimento_QNAME, Estabelecimento.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pessoa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Solicitante", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<Pessoa> createConsultarDadosEmpresaOutSolicitante(Pessoa value) {
        return new JAXBElement<Pessoa>(_ConsultarDadosEmpresaOutSolicitante_QNAME, Pessoa.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSocio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Socios", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<ArrayOfSocio> createConsultarDadosEmpresaOutSocios(ArrayOfSocio value) {
        return new JAXBElement<ArrayOfSocio>(_ConsultarDadosEmpresaOutSocios_QNAME, ArrayOfSocio.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Eventos", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<ArrayOfItem> createConsultarDadosEmpresaOutEventos(ArrayOfItem value) {
        return new JAXBElement<ArrayOfItem>(_ConsultarDadosEmpresaOutEventos_QNAME, ArrayOfItem.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Resultado", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<RequestResult> createConsultarDadosEmpresaOutResultado(RequestResult value) {
        return new JAXBElement<RequestResult>(_InvalidarLicencaOutResultado_QNAME, RequestResult.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ProtocoloViabilidade", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<String> createConsultarDadosEmpresaOutProtocoloViabilidade(String value) {
        return new JAXBElement<String>(_ConsultarDadosEmpresaOutProtocoloViabilidade_QNAME, String.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Enquadramento", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<Item> createConsultarDadosEmpresaOutEnquadramento(Item value) {
        return new JAXBElement<Item>(_ConsultarDadosEmpresaOutEnquadramento_QNAME, Item.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "CNPJ", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<String> createConsultarDadosEmpresaOutCNPJ(String value) {
        return new JAXBElement<String>(_ListarSolicitacoesPorCNJPInCNPJ_QNAME, String.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "NaturezaJuridica", scope = ConsultarDadosEmpresaOut.class)
    public JAXBElement<Item> createConsultarDadosEmpresaOutNaturezaJuridica(Item value) {
        return new JAXBElement<Item>(_ConsultarDadosEmpresaOutNaturezaJuridica_QNAME, Item.class, ConsultarDadosEmpresaOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Endereco }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Endereco", scope = Pessoa.class)
    public JAXBElement<Endereco> createPessoaEndereco(Endereco value) {
        return new JAXBElement<Endereco>(_Endereco_QNAME, Endereco.class, Pessoa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Nome", scope = Pessoa.class)
    public JAXBElement<String> createPessoaNome(String value) {
        return new JAXBElement<String>(_SocioNome_QNAME, String.class, Pessoa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Telefone", scope = Pessoa.class)
    public JAXBElement<Long> createPessoaTelefone(Long value) {
        return new JAXBElement<Long>(_EnderecoTelefone_QNAME, Long.class, Pessoa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RG }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "RG", scope = Pessoa.class)
    public JAXBElement<RG> createPessoaRG(RG value) {
        return new JAXBElement<RG>(_RG_QNAME, RG.class, Pessoa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Nacionalidade", scope = Pessoa.class)
    public JAXBElement<String> createPessoaNacionalidade(String value) {
        return new JAXBElement<String>(_PessoaNacionalidade_QNAME, String.class, Pessoa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Email", scope = Pessoa.class)
    public JAXBElement<String> createPessoaEmail(String value) {
        return new JAXBElement<String>(_EnderecoEmail_QNAME, String.class, Pessoa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "CodigoTipoRaca", scope = Pessoa.class)
    public JAXBElement<Integer> createPessoaCodigoTipoRaca(Integer value) {
        return new JAXBElement<Integer>(_PessoaCodigoTipoRaca_QNAME, Integer.class, Pessoa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Resultado", scope = ConsultarSolicitacaoLicenciamentoOut.class)
    public JAXBElement<RequestResult> createConsultarSolicitacaoLicenciamentoOutResultado(RequestResult value) {
        return new JAXBElement<RequestResult>(_InvalidarLicencaOutResultado_QNAME, RequestResult.class, ConsultarSolicitacaoLicenciamentoOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estabelecimento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Estabelecimento", scope = ConsultarSolicitacaoLicenciamentoOut.class)
    public JAXBElement<Estabelecimento> createConsultarSolicitacaoLicenciamentoOutEstabelecimento(Estabelecimento value) {
        return new JAXBElement<Estabelecimento>(_ConsultarDadosEmpresaOutEstabelecimento_QNAME, Estabelecimento.class, ConsultarSolicitacaoLicenciamentoOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSituacaoSolicitacaoEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "SituacoesSolicitacao", scope = ConsultarSolicitacaoLicenciamentoOut.class)
    public JAXBElement<ArrayOfSituacaoSolicitacaoEntity> createConsultarSolicitacaoLicenciamentoOutSituacoesSolicitacao(ArrayOfSituacaoSolicitacaoEntity value) {
        return new JAXBElement<ArrayOfSituacaoSolicitacaoEntity>(_ConsultarSolicitacaoLicenciamentoOutSituacoesSolicitacao_QNAME, ArrayOfSituacaoSolicitacaoEntity.class, ConsultarSolicitacaoLicenciamentoOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pessoa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Solicitante", scope = ConsultarSolicitacaoLicenciamentoOut.class)
    public JAXBElement<Pessoa> createConsultarSolicitacaoLicenciamentoOutSolicitante(Pessoa value) {
        return new JAXBElement<Pessoa>(_ConsultarDadosEmpresaOutSolicitante_QNAME, Pessoa.class, ConsultarSolicitacaoLicenciamentoOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicencaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Licencas", scope = ConsultarSolicitacaoLicenciamentoOut.class)
    public JAXBElement<ArrayOfLicencaEntity> createConsultarSolicitacaoLicenciamentoOutLicencas(ArrayOfLicencaEntity value) {
        return new JAXBElement<ArrayOfLicencaEntity>(_ConsultarSolicitacaoLicenciamentoOutLicencas_QNAME, ArrayOfLicencaEntity.class, ConsultarSolicitacaoLicenciamentoOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ProtocoloViabilidade", scope = ConsultarSolicitacaoLicenciamentoOut.class)
    public JAXBElement<String> createConsultarSolicitacaoLicenciamentoOutProtocoloViabilidade(String value) {
        return new JAXBElement<String>(_ConsultarDadosEmpresaOutProtocoloViabilidade_QNAME, String.class, ConsultarSolicitacaoLicenciamentoOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "CNPJ", scope = ConsultarSolicitacaoLicenciamentoOut.class)
    public JAXBElement<String> createConsultarSolicitacaoLicenciamentoOutCNPJ(String value) {
        return new JAXBElement<String>(_ListarSolicitacoesPorCNJPInCNPJ_QNAME, String.class, ConsultarSolicitacaoLicenciamentoOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "CPFResponsavel", scope = SituacaoLicencaEntity.class)
    public JAXBElement<String> createSituacaoLicencaEntityCPFResponsavel(String value) {
        return new JAXBElement<String>(_SituacaoSolicitacaoEntityCPFResponsavel_QNAME, String.class, SituacaoLicencaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "Descricao", scope = SituacaoLicencaEntity.class)
    public JAXBElement<String> createSituacaoLicencaEntityDescricao(String value) {
        return new JAXBElement<String>(_SituacaoSolicitacaoEntityDescricao_QNAME, String.class, SituacaoLicencaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Jucesp.Services.Contract.Data.Entities", name = "data", scope = SituacaoLicencaEntity.class)
    public JAXBElement<XMLGregorianCalendar> createSituacaoLicencaEntityData(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SituacaoLicencaEntityData_QNAME, XMLGregorianCalendar.class, SituacaoLicencaEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformarConclusaoLicencaOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "InformarConclusaoLicencaResult", scope = InformarConclusaoLicencaResponse.class)
    public JAXBElement<InformarConclusaoLicencaOut> createInformarConclusaoLicencaResponseInformarConclusaoLicencaResult(InformarConclusaoLicencaOut value) {
        return new JAXBElement<InformarConclusaoLicencaOut>(_InformarConclusaoLicencaResponseInformarConclusaoLicencaResult_QNAME, InformarConclusaoLicencaOut.class, InformarConclusaoLicencaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Password", scope = AuthenticationHeader.class)
    public JAXBElement<String> createAuthenticationHeaderPassword(String value) {
        return new JAXBElement<String>(_AuthenticationHeaderPassword_QNAME, String.class, AuthenticationHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Username", scope = AuthenticationHeader.class)
    public JAXBElement<String> createAuthenticationHeaderUsername(String value) {
        return new JAXBElement<String>(_AuthenticationHeaderUsername_QNAME, String.class, AuthenticationHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "NumeroProtocoloOrgao", scope = LiberarCassarLicencaIn.class)
    public JAXBElement<String> createLiberarCassarLicencaInNumeroProtocoloOrgao(String value) {
        return new JAXBElement<String>(_CassarLicencaInNumeroProtocoloOrgao_QNAME, String.class, LiberarCassarLicencaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Resultado", scope = InformarInteracaoComOrgaoOut.class)
    public JAXBElement<RequestResult> createInformarInteracaoComOrgaoOutResultado(RequestResult value) {
        return new JAXBElement<RequestResult>(_InvalidarLicencaOutResultado_QNAME, RequestResult.class, InformarInteracaoComOrgaoOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "ResultadoList", scope = InformarInteracaoComOrgaoOut.class)
    public JAXBElement<ArrayOfRequestResult> createInformarInteracaoComOrgaoOutResultadoList(ArrayOfRequestResult value) {
        return new JAXBElement<ArrayOfRequestResult>(_InformarInteracaoComOrgaoOutResultadoList_QNAME, ArrayOfRequestResult.class, InformarInteracaoComOrgaoOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "NumeroProtocoloOrgao", scope = InvalidarLicencaIn.class)
    public JAXBElement<String> createInvalidarLicencaInNumeroProtocoloOrgao(String value) {
        return new JAXBElement<String>(_CassarLicencaInNumeroProtocoloOrgao_QNAME, String.class, InvalidarLicencaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItemInformacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "InformacoesComplementares", scope = InvalidarLicencaIn.class)
    public JAXBElement<ArrayOfItemInformacao> createInvalidarLicencaInInformacoesComplementares(ArrayOfItemInformacao value) {
        return new JAXBElement<ArrayOfItemInformacao>(_CassarLicencaInInformacoesComplementares_QNAME, ArrayOfItemInformacao.class, InvalidarLicencaIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHorario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Horarios", scope = DadosComplementares.class)
    public JAXBElement<ArrayOfHorario> createDadosComplementaresHorarios(ArrayOfHorario value) {
        return new JAXBElement<ArrayOfHorario>(_DadosComplementaresHorarios_QNAME, ArrayOfHorario.class, DadosComplementares.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAreaPublicidade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "AreaPublicidades", scope = DadosComplementares.class)
    public JAXBElement<ArrayOfAreaPublicidade> createDadosComplementaresAreaPublicidades(ArrayOfAreaPublicidade value) {
        return new JAXBElement<ArrayOfAreaPublicidade>(_DadosComplementaresAreaPublicidades_QNAME, ArrayOfAreaPublicidade.class, DadosComplementares.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidarLicencaIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "dto", scope = InvalidarLicenca.class)
    public JAXBElement<InvalidarLicencaIn> createInvalidarLicencaDto(InvalidarLicencaIn value) {
        return new JAXBElement<InvalidarLicencaIn>(_ListarSolicitacoesPorProtocoloREDESIMDto_QNAME, InvalidarLicencaIn.class, InvalidarLicenca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSolicitacoesPorDataOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento", name = "ListarSolicitacoesPorDataResult", scope = ListarSolicitacoesPorDataResponse.class)
    public JAXBElement<ListarSolicitacoesPorDataOut> createListarSolicitacoesPorDataResponseListarSolicitacoesPorDataResult(ListarSolicitacoesPorDataOut value) {
        return new JAXBElement<ListarSolicitacoesPorDataOut>(_ListarSolicitacoesPorDataResponseListarSolicitacoesPorDataResult_QNAME, ListarSolicitacoesPorDataOut.class, ListarSolicitacoesPorDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "DiaSemana", scope = Horario.class)
    public JAXBElement<Short> createHorarioDiaSemana(Short value) {
        return new JAXBElement<Short>(_HorarioDiaSemana_QNAME, Short.class, Horario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "HoraAbertura", scope = Horario.class)
    public JAXBElement<String> createHorarioHoraAbertura(String value) {
        return new JAXBElement<String>(_HorarioHoraAbertura_QNAME, String.class, Horario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "HoraFechamento", scope = Horario.class)
    public JAXBElement<String> createHorarioHoraFechamento(String value) {
        return new JAXBElement<String>(_HorarioHoraFechamento_QNAME, String.class, Horario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Resultado", scope = ListarSolicitacoesPorDataOut.class)
    public JAXBElement<RequestResult> createListarSolicitacoesPorDataOutResultado(RequestResult value) {
        return new JAXBElement<RequestResult>(_InvalidarLicencaOutResultado_QNAME, RequestResult.class, ListarSolicitacoesPorDataOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Licenciamentos.Licenciamento/01", name = "Protocolos", scope = ListarSolicitacoesPorDataOut.class)
    public JAXBElement<ArrayOflong> createListarSolicitacoesPorDataOutProtocolos(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ListarSolicitacoesPorProtocoloREDESIMOutProtocolos_QNAME, ArrayOflong.class, ListarSolicitacoesPorDataOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "TipoInformacao", scope = ItemInformacao.class)
    public JAXBElement<Item> createItemInformacaoTipoInformacao(Item value) {
        return new JAXBElement<Item>(_ItemInformacaoTipoInformacao_QNAME, Item.class, ItemInformacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Complemento", scope = ItemInformacao.class)
    public JAXBElement<String> createItemInformacaoComplemento(String value) {
        return new JAXBElement<String>(_Complemento_QNAME, String.class, ItemInformacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Codigo", scope = ItemInformacao.class)
    public JAXBElement<String> createItemInformacaoCodigo(String value) {
        return new JAXBElement<String>(_AtividadeAuxiliarCodigo_QNAME, String.class, ItemInformacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "Descricao", scope = ItemInformacao.class)
    public JAXBElement<String> createItemInformacaoDescricao(String value) {
        return new JAXBElement<String>(_AtividadeAuxiliarDescricao_QNAME, String.class, ItemInformacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "TipoInscricaoImovel", scope = InscricaoImovel.class)
    public JAXBElement<Item> createInscricaoImovelTipoInscricaoImovel(Item value) {
        return new JAXBElement<Item>(_InscricaoImovelTipoInscricaoImovel_QNAME, Item.class, InscricaoImovel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Jucesp.Services.Data/01", name = "InscricaoImovel", scope = InscricaoImovel.class)
    public JAXBElement<String> createInscricaoImovelInscricaoImovel(String value) {
        return new JAXBElement<String>(_InscricaoImovel_QNAME, String.class, InscricaoImovel.class, value);
    }

}
