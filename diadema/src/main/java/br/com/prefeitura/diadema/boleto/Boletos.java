package br.com.prefeitura.diadema.boleto;

import java.io.File;
import java.io.FileInputStream;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;


public class Boletos
{

  private Long id;
  @Transient
  private Banco banco;
  @Transient
  private FileInputStream logoPrefeitura;
  @Column
  private String filePk;
  @Column
  private Date dataDocumento;
  @Column
  private Date dataProcessamento;
  @Column
  private Date dataVencimento;
  @Column
  private String logradouroBeneficiario;
  @Column
  private String bairroBeneficiario;
  @Column
  private String cepBeneficiario;
  @Column
  private String cidadeBeneficiario;
  @Column
  private String ufBeneficiario;
  @Column
  private String nomeBeneficiario;
  @Column
  private String documentoBeneficiario;
  @Column
  private String agenciaBeneficiario;
  @Column
  private String digitoAgenciaBeneficiario;
  @Column
  private String codigoBeneficiario;
  @Column
  private String digitoCodigoBeneficiario;
  @Column
  private String numeroConvenioBeneficiario;
  @Column
  private String carteiraBeneficiario;
  @Column
  private String nossoNumero;
  @Column
  private String logradouroPagador;
  @Column
  private String bairroPagador;
  @Column
  private String cepPagador;
  @Column
  private String cidadePagador;
  @Column
  private String ufPagador;
  @Column
  private String nomePagador;
  @Column
  private String documentoPagador;
  @Column
  private String especieDocumento;
  @Column
  private String valorBoleto;
  @Column
  private String numeroDocumento;
  @Column
  private String instrucao1;
  @Column
  private String instrucao2;
  @Column
  private String instrucao3;
  @Column
  private String instrucao4;
  @Column
  private String instrucao5;
  @Column
  private String locaisPagamento;
  @Column
  private String processoContribuinte;
  @Column
  private String damReferente;
  @Column
  private String referencia;
  @Column
  private String codigoContribuinte;
  @Column
  private String codigoUsuario;
  @Column
  private String nomeUsuario;
  @Column
  private String documentoUsuario;
  @Column
  private String descricaoDAM;
  @Column
  private String aceite;
  @Column
  private String cip;
  @Column
  private String especieMoeda;
  @Column
  private String inscricao;
  @Column
  private String tipoInscricao;
  @Column
  private String tsa;
  @Column
  private String correcao;
  @Column
  private String multa;
  @Column
  private String nossoNumeroDV;
  @Column
  private String codigoEspecieMoeda;
  @Column
  private Date dataGeracaoPDF;
  @Column
  private String codigoBarras;
  private File fileBoleto;
  
  public Boleto toStellaBoleto()
  {
    Datas datas = Datas.novasDatas().comDocumento(dateToCalendar(this.dataDocumento)).comProcessamento(dateToCalendar(this.dataProcessamento)).comVencimento(dateToCalendar(this.dataVencimento));
    
    Endereco enderecoBeneficiario = Endereco.novoEndereco().comLogradouro(this.logradouroBeneficiario).comBairro(this.bairroBeneficiario).comCep(this.cepBeneficiario).comCidade(this.cidadeBeneficiario).comUf(this.ufBeneficiario);
    
    Beneficiario beneficiario = Beneficiario.novoBeneficiario().comNomeBeneficiario(this.nomeBeneficiario).comDocumento(this.documentoBeneficiario).comAgencia(this.agenciaBeneficiario).comDigitoAgencia(this.digitoAgenciaBeneficiario).comCodigoBeneficiario(this.codigoBeneficiario).comDigitoCodigoBeneficiario(this.digitoCodigoBeneficiario).comNumeroConvenio(this.numeroConvenioBeneficiario).comCarteira(this.carteiraBeneficiario).comEndereco(enderecoBeneficiario).comNossoNumero(this.nossoNumero);
    
    Endereco enderecoPagador = Endereco.novoEndereco().comLogradouro(this.logradouroPagador).comBairro(this.bairroPagador).comCep(this.cepPagador).comCidade(this.cidadePagador).comUf(this.ufPagador);
    
    Pagador pagador = Pagador.novoPagador().comNome(this.nomePagador).comDocumento(this.documentoPagador).comEndereco(enderecoPagador);
    
    Boleto stelaBoleto = Boleto.novoBoleto().comBanco(this.banco).comDatas(datas).comBeneficiario(beneficiario).comPagador(pagador).comEspecieDocumento(this.especieDocumento).comValorBoleto(this.valorBoleto).comNumeroDoDocumento(this.numeroDocumento).comInstrucoes(new String[] { this.instrucao1, this.instrucao2, this.instrucao3, this.instrucao4, this.instrucao5 }).comLocaisDePagamento(new String[] { this.locaisPagamento }).comAceite(this.aceite != "N").comEspecieMoeda(this.especieMoeda).comCodigoEspecieMoeda(getCodigoEspecieMoedaInt());
    
    return stelaBoleto;
  }
  
  public Banco getBanco()
  {
    return this.banco;
  }
  
  public void setBanco(Banco banco)
  {
    this.banco = banco;
  }
  
  public Date getDataDocumento()
  {
    return this.dataDocumento;
  }
  
  public void setDataDocumento(Date dataDocumento)
  {
    this.dataDocumento = dataDocumento;
  }
  
  public Date getDataProcessamento()
  {
    return this.dataProcessamento;
  }
  
  public void setDataProcessamento(Date dataProcessamento)
  {
    this.dataProcessamento = dataProcessamento;
  }
  
  public Date getDataVencimento()
  {
    return this.dataVencimento;
  }
  
  public void setDataVencimento(Date dataVencimento)
  {
    this.dataVencimento = dataVencimento;
  }
  
  public String getLogradouroBeneficiario()
  {
    return this.logradouroBeneficiario;
  }
  
  public void setLogradouroBeneficiario(String logradouroBeneficiario)
  {
    this.logradouroBeneficiario = logradouroBeneficiario;
  }
  
  public String getBairroBeneficiario()
  {
    return this.bairroBeneficiario;
  }
  
  public void setBairroBeneficiario(String bairroBeneficiario)
  {
    this.bairroBeneficiario = bairroBeneficiario;
  }
  
  public String getCepBeneficiario()
  {
    return this.cepBeneficiario;
  }
  
  public void setCepBeneficiario(String cepBeneficiario)
  {
    this.cepBeneficiario = cepBeneficiario;
  }
  
  public String getCidadeBeneficiario()
  {
    return this.cidadeBeneficiario;
  }
  
  public void setCidadeBeneficiario(String cidadeBeneficiario)
  {
    this.cidadeBeneficiario = cidadeBeneficiario;
  }
  
  public String getUfBeneficiario()
  {
    return this.ufBeneficiario;
  }
  
  public void setUfBeneficiario(String ufBeneficiario)
  {
    this.ufBeneficiario = ufBeneficiario;
  }
  
  public String getNomeBeneficiario()
  {
    return this.nomeBeneficiario;
  }
  
  public void setNomeBeneficiario(String nomeBeneficiario)
  {
    this.nomeBeneficiario = nomeBeneficiario;
  }
  
  public String getDocumentoBeneficiario()
  {
    return this.documentoBeneficiario;
  }
  
  public void setDocumentoBeneficiario(String documentoBeneficiario)
  {
    this.documentoBeneficiario = documentoBeneficiario;
  }
  
  public String getAgenciaBeneficiario()
  {
    return this.agenciaBeneficiario;
  }
  
  public void setAgenciaBeneficiario(String agenciaBeneficiario)
  {
    if ((agenciaBeneficiario != null) && (!agenciaBeneficiario.trim().isEmpty()) && (agenciaBeneficiario.contains("-"))) {
      this.agenciaBeneficiario = agenciaBeneficiario.split("-")[0];
    } else {
      this.agenciaBeneficiario = agenciaBeneficiario;
    }
  }
  
  public String getDigitoAgenciaBeneficiario()
  {
    if ((this.agenciaBeneficiario != null) && (!this.agenciaBeneficiario.trim().isEmpty()) && (this.agenciaBeneficiario.contains("-"))) {
      this.digitoAgenciaBeneficiario = this.agenciaBeneficiario.split("-")[1];
    }
    return this.digitoAgenciaBeneficiario;
  }
  
  public String getCodigoBeneficiario()
  {
    return this.codigoBeneficiario;
  }
  
  public void setCodigoBeneficiario(String codigoBeneficiario)
  {
    if ((codigoBeneficiario != null) && (!codigoBeneficiario.trim().isEmpty()) && (codigoBeneficiario.contains("-"))) {
      this.codigoBeneficiario = codigoBeneficiario.split("-")[0];
    } else {
      this.codigoBeneficiario = codigoBeneficiario;
    }
  }
  
  public String getDigitoCodigoBeneficiario()
  {
    if ((this.codigoBeneficiario != null) && (!this.codigoBeneficiario.trim().isEmpty()) && (this.codigoBeneficiario.contains("-"))) {
      this.digitoCodigoBeneficiario = this.codigoBeneficiario.split("-")[1];
    }
    return this.digitoCodigoBeneficiario;
  }
  
  public void setDigitoCodigoBeneficiario(String digitoCodigoBeneficiario)
  {
    this.digitoCodigoBeneficiario = digitoCodigoBeneficiario;
  }
  
  public String getNumeroConvenioBeneficiario()
  {
    return this.numeroConvenioBeneficiario;
  }
  
  public void setNumeroConvenioBeneficiario(String numeroConvenioBeneficiario)
  {
    this.numeroConvenioBeneficiario = numeroConvenioBeneficiario;
  }
  
  public String getCarteiraBeneficiario()
  {
    return this.carteiraBeneficiario;
  }
  
  public void setCarteiraBeneficiario(String carteiraBeneficiario)
  {
    this.carteiraBeneficiario = carteiraBeneficiario;
  }
  
  public String getNossoNumero()
  {
    return this.nossoNumero;
  }
  
  public void setNossoNumero(String nossoNumero)
  {
    this.nossoNumero = nossoNumero;
  }
  
  public String getLogradouroPagador()
  {
    return this.logradouroPagador;
  }
  
  public void setLogradouroPagador(String logradouroPagador)
  {
    this.logradouroPagador = logradouroPagador;
  }
  
  public String getBairroPagador()
  {
    return this.bairroPagador;
  }
  
  public void setBairroPagador(String bairroPagador)
  {
    this.bairroPagador = bairroPagador;
  }
  
  public String getCepPagador()
  {
    return this.cepPagador;
  }
  
  public void setCepPagador(String cepPagador)
  {
    this.cepPagador = cepPagador;
  }
  
  public String getCidadePagador()
  {
    return this.cidadePagador;
  }
  
  public void setCidadePagador(String cidadePagador)
  {
    this.cidadePagador = cidadePagador;
  }
  
  public String getUfPagador()
  {
    return this.ufPagador;
  }
  
  public void setUfPagador(String ufPagador)
  {
    this.ufPagador = ufPagador;
  }
  
  public String getNomePagador()
  {
    return this.nomePagador;
  }
  
  public void setNomePagador(String nomePagador)
  {
    this.nomePagador = nomePagador;
  }
  
  public String getDocumentoPagador()
  {
    return this.documentoPagador;
  }
  
  public void setDocumentoPagador(String documentoPagador)
  {
    this.documentoPagador = documentoPagador;
  }
  
  public String getEspecieDocumento()
  {
    return this.especieDocumento;
  }
  
  public void setEspecieDocumento(String especieDocumento)
  {
    this.especieDocumento = especieDocumento;
  }
  
  public String getValorBoleto()
  {
    return this.valorBoleto;
  }
  
  public void setValorBoleto(String valorBoleto)
  {
    this.valorBoleto = valorBoleto;
  }
  
  public String getNumeroDocumento()
  {
    return this.numeroDocumento;
  }
  
  public void setNumeroDocumento(String numeroDocumento)
  {
    this.numeroDocumento = numeroDocumento;
  }
  
  public String getInstrucao1()
  {
    return this.instrucao1;
  }
  
  public void setInstrucao1(String instrucao1)
  {
    this.instrucao1 = instrucao1;
  }
  
  public String getInstrucao2()
  {
    return this.instrucao2;
  }
  
  public void setInstrucao2(String instrucao2)
  {
    this.instrucao2 = instrucao2;
  }
  
  public String getInstrucao3()
  {
    return this.instrucao3;
  }
  
  public void setInstrucao3(String instrucao3)
  {
    this.instrucao3 = instrucao3;
  }
  
  public String getLocaisPagamento()
  {
    return this.locaisPagamento;
  }
  
  public void setLocaisPagamento(String locaisPagamento)
  {
    this.locaisPagamento = locaisPagamento;
  }
  
  public String getProcessoContribuinte()
  {
    return this.processoContribuinte;
  }
  
  public void setProcessoContribuinte(String processoContribuinte)
  {
    this.processoContribuinte = processoContribuinte;
  }
  
  public String getDamReferente()
  {
    return this.damReferente;
  }
  
  public void setDamReferente(String damReferente)
  {
    this.damReferente = damReferente;
  }
  
  public String getReferencia()
  {
    return this.referencia;
  }
  
  public void setReferencia(String referencia)
  {
    this.referencia = referencia;
  }
  
  public String getCodigoContribuinte()
  {
    return this.codigoContribuinte;
  }
  
  public void setCodigoContribuinte(String codigoContribuinte)
  {
    this.codigoContribuinte = codigoContribuinte;
  }
  
  public String getCodigoUsuario()
  {
    return this.codigoUsuario;
  }
  
  public void setCodigoUsuario(String codigoUsuario)
  {
    this.codigoUsuario = codigoUsuario;
  }
  
  public String getNomeUsuario()
  {
    return this.nomeUsuario;
  }
  
  public void setNomeUsuario(String nomeUsuario)
  {
    this.nomeUsuario = nomeUsuario;
  }
  
  public String getDocumentoUsuario()
  {
    return this.documentoUsuario;
  }
  
  public void setDocumentoUsuario(String documentoUsuario)
  {
    this.documentoUsuario = documentoUsuario;
  }
  
  public String getDescricaoDAM()
  {
    return this.descricaoDAM;
  }
  
  public void setDescricaoDAM(String descricaoDAM)
  {
    this.descricaoDAM = descricaoDAM;
  }
  
  public FileInputStream getLogoPrefeitura()
  {
    return this.logoPrefeitura;
  }
  
  public void setLogoPrefeitura(FileInputStream logoPrefeitura)
  {
    this.logoPrefeitura = logoPrefeitura;
  }
  
  public String getAceite()
  {
    if (this.aceite == null) {
      this.aceite = "";
    }
    return this.aceite.toUpperCase();
  }
  
  public void setAceite(String aceite)
  {
    this.aceite = aceite;
  }
  
  public String getCip()
  {
    return this.cip;
  }
  
  public void setCip(String cip)
  {
    this.cip = cip;
  }
  
  public String getEspecieMoeda()
  {
    return this.especieMoeda;
  }
  
  public void setEspecieMoeda(String especieMoeda)
  {
    this.especieMoeda = especieMoeda;
  }
  
  public String getInscricao()
  {
    return this.inscricao;
  }
  
  public void setInscricao(String inscricao)
  {
    this.inscricao = inscricao;
  }
  
  public String getTipoInscricao()
  {
    return this.tipoInscricao;
  }
  
  public void setTipoInscricao(String tipoInscricao)
  {
    this.tipoInscricao = tipoInscricao;
  }
  
  public String getTsa()
  {
    return this.tsa;
  }
  
  public void setTsa(String tsa)
  {
    this.tsa = tsa;
  }
  
  public String getCorrecao()
  {
    return this.correcao;
  }
  
  public void setCorrecao(String correcao)
  {
    this.correcao = correcao;
  }
  
  public String getMulta()
  {
    return this.multa;
  }
  
  public void setMulta(String multa)
  {
    this.multa = multa;
  }
  
  public String getNossoNumeroDV()
  {
    return this.nossoNumeroDV;
  }
  
  public void setNossoNumeroDV(String nossoNumeroDV)
  {
    this.nossoNumeroDV = nossoNumeroDV;
  }
  
  public String getInstrucao4()
  {
    return this.instrucao4;
  }
  
  public void setInstrucao4(String instrucao4)
  {
    this.instrucao4 = instrucao4;
  }
  
  public String getInstrucao5()
  {
    return this.instrucao5;
  }
  
  public void setInstrucao5(String instrucao5)
  {
    this.instrucao5 = instrucao5;
  }
  
  public String getCodigoEspecieMoeda()
  {
    return this.codigoEspecieMoeda;
  }
  
  public void setCodigoEspecieMoeda(String codigoEspecieMoeda)
  {
    this.codigoEspecieMoeda = codigoEspecieMoeda;
  }
  
  public int getCodigoEspecieMoedaInt()
  {
    int codEspMoeda = 0;
    try
    {
      codEspMoeda = Integer.valueOf(this.codigoEspecieMoeda).intValue();
    }
    catch (Exception localException) {}
    return codEspMoeda;
  }
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public Date getDataGeracaoPDF()
  {
    return this.dataGeracaoPDF;
  }
  
  public void setDataGeracaoPDF(Date dataGeracaoPDF)
  {
    this.dataGeracaoPDF = dataGeracaoPDF;
  }
  
  public String getFilePk()
  {
    return this.filePk;
  }
  
  public void setFilePk(String filePk)
  {
    this.filePk = filePk;
  }
  
  public String getCodigoBarras()
  {
    return this.codigoBarras;
  }
  
  public void setCodigoBarras(String codigoBarras)
  {
    this.codigoBarras = codigoBarras;
  }
  
  private static Calendar dateToCalendar(Date data)
  {
    if (data == null) {
      return null;
    }
    Calendar cal = Calendar.getInstance();
    cal.setTime(data);
    return cal;
  }
  
  public File getFileBoleto()
  {
    return this.fileBoleto;
  }
  
  public void setFileBoleto(File fileBoleto)
  {
    this.fileBoleto = fileBoleto;
  }
}
