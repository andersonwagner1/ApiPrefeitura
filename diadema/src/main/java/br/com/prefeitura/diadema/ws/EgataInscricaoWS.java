package br.com.prefeitura.diadema.ws;
/*
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.text.SimpleDateFormat;
import java.util.Date;
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.boleto.Boleto;
import br.com.prefeitura.diadema.boleto.Boletos;
import br.com.prefeitura.diadema.boleto.RetBoleto;
import br.com.prefeitura.diadema.boleto.bancos.Bradesco;
import br.com.prefeitura.diadema.boleto.exception.BoletoException;
import br.com.prefeitura.diadema.boleto.transformer.GeradorDeBoleto;
import br.com.prefeitura.diadema.dto.Cnae;
import br.com.prefeitura.diadema.dto.ComplementoAtividade;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomica;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomicaComplemento;
import br.com.prefeitura.diadema.dto.EnquadramentoISS;
import br.com.prefeitura.diadema.dto.EnquadramentoISSCodigoServico;
import br.com.prefeitura.diadema.dto.InscricaoMunicipal;
import br.com.prefeitura.diadema.dto.Logradouro;
import br.com.prefeitura.diadema.dto.Municipio;
import br.com.prefeitura.diadema.dto.Publicidades;
import br.com.prefeitura.diadema.dto.Socio;
import br.com.prefeitura.diadema.model.PmdBoleto;
import br.com.prefeitura.diadema.repository.BoletoRepository;
import br.com.prefeitura.diadema.util.ConverterDtoJson;
import br.com.prefeitura.diadema.util.ParseInscricaoEgata;
import br.com.prefeitura.diadema.ws.egata.RetornoWSRetornoWSItem;
import br.com.prefeitura.diadema.ws.egata.SdtBairroLogradourosSdtBairroLogradouroItem;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresa;
import br.com.prefeitura.diadema.ws.egata.SdtEmpresasporCnpjSdtEmpresasporCnpjItem;
import br.com.prefeitura.diadema.ws.egata.SdtLogradouroporBairroSdtLogradouroporBairroItem;
import br.com.prefeitura.diadema.ws.egata.SdtMunicipiosSdtMunicipiosItem;
import br.com.prefeitura.diadema.ws.egata.WSEnviarDadosEmpresa;
import br.com.prefeitura.diadema.ws.egata.WSEnviarDadosEmpresaExecute;
import br.com.prefeitura.diadema.ws.egata.WSEnviarDadosEmpresaExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WSEnviarDadosEmpresaSoapPort;
import br.com.prefeitura.diadema.ws.egata.WsBuscaDadosBoletoTaxasDiversas;
import br.com.prefeitura.diadema.ws.egata.WsBuscaDadosBoletoTaxasDiversasExecute;
import br.com.prefeitura.diadema.ws.egata.WsBuscaDadosBoletoTaxasDiversasExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsBuscaDadosBoletoTaxasDiversasSoapPort;
import br.com.prefeitura.diadema.ws.egata.WsBuscaMunicipio;
import br.com.prefeitura.diadema.ws.egata.WsBuscaMunicipioExecute;
import br.com.prefeitura.diadema.ws.egata.WsBuscaMunicipioExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsBuscaMunicipioSoapPort;
import br.com.prefeitura.diadema.ws.egata.WsConsultarExistenciaDaEmpresa;
import br.com.prefeitura.diadema.ws.egata.WsConsultarExistenciaDaEmpresaExecute;
import br.com.prefeitura.diadema.ws.egata.WsConsultarExistenciaDaEmpresaExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsConsultarExistenciaDaEmpresaSoapPort;
import br.com.prefeitura.diadema.ws.egata.WsEnderecamento;
import br.com.prefeitura.diadema.ws.egata.WsEnderecamentoExecute;
import br.com.prefeitura.diadema.ws.egata.WsEnderecamentoExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsEnderecamentoSoapPort;
import br.com.prefeitura.diadema.ws.egata.Wsbuscabairrologradouro;
import br.com.prefeitura.diadema.ws.egata.WsbuscabairrologradouroExecute;
import br.com.prefeitura.diadema.ws.egata.WsbuscabairrologradouroExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsbuscabairrologradouroSoapPort;
import br.com.prefeitura.diadema.ws.egata.Wsconsultaexistenciaempresa;
import br.com.prefeitura.diadema.ws.egata.WsconsultaexistenciaempresaExecute;
import br.com.prefeitura.diadema.ws.egata.WsconsultaexistenciaempresaExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsconsultaexistenciaempresaSoapPort;
import br.com.prefeitura.diadema.ws.egata.Wsverificainscricaoimobiliaria;
import br.com.prefeitura.diadema.ws.egata.WsverificainscricaoimobiliariaExecute;
import br.com.prefeitura.diadema.ws.egata.WsverificainscricaoimobiliariaExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsverificainscricaoimobiliariaSoapPort;





@Service
public class EgataInscricaoWS {
	
	private BoletoRepository dao;
	
	
	private  InscricaoMunicipal paramentroInsrciao2(){
		InscricaoMunicipal inscricaoMunicipal = new InscricaoMunicipal();
		inscricaoMunicipal.setStatusEmpresa("ALTERACAO");
		inscricaoMunicipal.setNumeroInscricaoMunicipal(6304l);
		inscricaoMunicipal.setRazaoSocial("Anderson 132");
		inscricaoMunicipal.setNomeFantasia("Fantasia");
		inscricaoMunicipal.setCodigoNaturezaJuridica(1);
		inscricaoMunicipal.setNumeroProtocolo("SPM123132");
		inscricaoMunicipal.setInscricaoEstadual("9999");
		inscricaoMunicipal.setCnpj("01462765000106");
		
		
		EnquadramentoISS enquadramentoISS = new EnquadramentoISS();
 		enquadramentoISS.setTipoISSQN("A");
 		enquadramentoISS.setTlfInicial(1);
		inscricaoMunicipal.setEnquadramentoISS(enquadramentoISS);
		
		
		inscricaoMunicipal.setDataAbertura(new Date());
		
		inscricaoMunicipal.setDadosContadorCrc("111");
		inscricaoMunicipal.setDadosContadorNomeEscritorio("contabil");
		inscricaoMunicipal.setDadosContadorNome("nome contador");
		inscricaoMunicipal.setDadosContadorCPF("56169904003");
		inscricaoMunicipal.setDadosContadorRG("543534");
		inscricaoMunicipal.setDadosContadorEndereco("Avenida José Aparecido de Melo");
		inscricaoMunicipal.setDadosContadorBairro("Jardim Mase");
		inscricaoMunicipal.setDadosContadorTelefone("1156353453");
		inscricaoMunicipal.setDadosContadorNumeroEndereco("66");
		inscricaoMunicipal.setDadosContadorComplementoEndereco("casa");
		inscricaoMunicipal.setDadosContadorCEP("09921000");
		inscricaoMunicipal.setDadosContadorMunicipio("0");
		inscricaoMunicipal.setDadosContadorUf("SP");
		inscricaoMunicipal.setDadosContadorFax("000");
		inscricaoMunicipal.setDadosContadorEmail("teste@gmail.com");
		
		inscricaoMunicipal.setNumeroFuncionario(1);
		inscricaoMunicipal.setNumeroProfissionais(1);
		inscricaoMunicipal.setCapitalSocial(44.44);
		inscricaoMunicipal.setRegistroJuntaComercial("9990987");
		inscricaoMunicipal.setDataUltimaAlteracaoJunta(new Date());
		inscricaoMunicipal.setUltimoRegistroJucesp("SPM88974");
		inscricaoMunicipal.setDataUltimaAlteracaoJunta(new Date());
		inscricaoMunicipal.setEmpresaTelefone("11534534534");
		inscricaoMunicipal.setEmpresaEmail("casa");
		inscricaoMunicipal.setBancaDeJornal(5.0f);
		inscricaoMunicipal.setEmpresacodigoLogradouroAgata(613619);
		inscricaoMunicipal.setEmpresaCodigoBairro(27352);
		inscricaoMunicipal.setEmpresaNumeroLogradouro("100");
		inscricaoMunicipal.setEmpresaCep("09910170");
		inscricaoMunicipal.setEmpresaComplementoLogradouro("casa");
		inscricaoMunicipal.setEmpresacodigoLogradouroAgata(1063255);
		inscricaoMunicipal.setEmpresaCodigoBairro(27358);
		
		
		
		Cnae cna1 = new Cnae();
		cna1.setCodigo("1412601");
		cna1.setPrincipal(true);
		
		List<Cnae> cnaes = new ArrayList<Cnae>();
		
		cnaes.add(cna1);
		inscricaoMunicipal.setCnaes(cnaes);;
		
		
		EnquadramentoAtividadeEconomica enquadramento = new EnquadramentoAtividadeEconomica();
		enquadramento.setClassificacaoAtividade("industria");

		inscricaoMunicipal.setEnquadramentoAtividadeEconomica(enquadramento );
		inscricaoMunicipal.setObjetoSocial("12");
		
		Publicidades publicidade = new Publicidades();
		publicidade.setTipo(1);
		publicidade.setM2(6d);
		publicidade.setQuantidade(2);
		
		List<Publicidades> publicidades = new ArrayList<Publicidades>();
		publicidades.add(publicidade);
		inscricaoMunicipal.setPublicidades(publicidades );

		//Isso repete no item pulibidade
		inscricaoMunicipal.setQuantidadePublicidadeLuminoso(2);
		inscricaoMunicipal.setQuantidadePublicidadeNaoLuminioso(2);
		inscricaoMunicipal.setQuantidadePublicidadeTerceiro(2);
		inscricaoMunicipal.setNumeroDeJogos(2);
		inscricaoMunicipal.setNumeroDeEletronicos(2);
		inscricaoMunicipal.setNumeroFuncionario(2);
		inscricaoMunicipal.setNumeroInstrumentosMusicais(2);
		
		
		
		
		/*Socio socio2 = new Socio();		
		socio2.setCpf("05398178806");
		socio2.setNome("socio");
		socio2.setEndereco("TESTE");
		socio2.setBairro("TESTE");
		
		List<Socio> socios = new ArrayList<Socio>();
		socios.add(socio2);
		inscricaoMunicipal.setSocios(socios);*/
		
		
		List<EnquadramentoISSCodigoServico> enquadramentoISSCodigoServico = new ArrayList<EnquadramentoISSCodigoServico>();
 		EnquadramentoISSCodigoServico enquadramentoISSCodigoServico1 = new EnquadramentoISSCodigoServico();
 		enquadramentoISSCodigoServico1.setCodigoServico("10.01");
 		enquadramentoISSCodigoServico1.setTipo("P");
 		enquadramentoISSCodigoServico1.setSituacao("M");
 		enquadramentoISSCodigoServico1.setDataInicial(new Date());
		enquadramentoISSCodigoServico.add(enquadramentoISSCodigoServico1 );		
		enquadramentoISS.setEnquadramentoISSCodigoServico(enquadramentoISSCodigoServico);
		inscricaoMunicipal.setEnquadramentoISS(enquadramentoISS);
		
		
		List<EnquadramentoAtividadeEconomicaComplemento> enquadramentoAtividadeEconomicaComplementos = new ArrayList<EnquadramentoAtividadeEconomicaComplemento>();
 		EnquadramentoAtividadeEconomicaComplemento encontradmento = new EnquadramentoAtividadeEconomicaComplemento();
		ComplementoAtividade complemento = new ComplementoAtividade();
		complemento.setGrupo(2);
		complemento.setSubgrupo(0);		
		complemento.setAtividade(3);
		encontradmento.setComplementoAtividade(complemento);
		encontradmento.setTipo("P");
		enquadramentoAtividadeEconomicaComplementos.add(encontradmento);
		
		//continuação
		enquadramento.setEnquadramentoAtividadeEconomicaComplementos(enquadramentoAtividadeEconomicaComplementos);		
		inscricaoMunicipal.setEnquadramentoAtividadeEconomica(enquadramento );
		
		return inscricaoMunicipal;
	}
	
	private InscricaoMunicipal parametroInscricao(){
		InscricaoMunicipal inscricaoMunicipal = new InscricaoMunicipal();
		inscricaoMunicipal.setStatusEmpresa("ALTERACAO");
		inscricaoMunicipal.setNumeroInscricaoMunicipal(6304L);
		inscricaoMunicipal.setRazaoSocial("Anderson Teste");
		inscricaoMunicipal.setNomeFantasia("Fantasia");
		inscricaoMunicipal.setCodigoNaturezaJuridica(1);
		inscricaoMunicipal.setCnpj("32379324859");
		inscricaoMunicipal.setDataAbertura(new Date());
		
		inscricaoMunicipal.setNumeroFuncionario(1);
		inscricaoMunicipal.setNumeroProfissionais(1);
		inscricaoMunicipal.setNumeroDeJogos(0);
 		inscricaoMunicipal.setNumeroDeEletronicos(0);
 		inscricaoMunicipal.setNumeroInstrumentosMusicais(0);
		
		inscricaoMunicipal.setBancaDeJornal(40f);
		inscricaoMunicipal.setDadosContadorTelefone("9999");
		
		
		inscricaoMunicipal.setEmpresacodigoLogradouroAgata(613619);
		inscricaoMunicipal.setEmpresaCodigoBairro(27352);
		inscricaoMunicipal.setEmpresaNumeroLogradouro("5555");
		inscricaoMunicipal.setEmpresaCep("09921250");
		
		inscricaoMunicipal.setQuantidadePublicidadeTerceiro(0);
		inscricaoMunicipal.setQuantidadePublicidadeLuminoso(0);
 		inscricaoMunicipal.setQuantidadePublicidadeNaoLuminioso(0);
 		
 		
 		
 		
		/*
		
		inscricaoMunicipal.setNumeroProtocolo("SPM123132");
		inscricaoMunicipal.setUltimoRegistroJucesp("SPM999999");
		
		
		
		
		
 		
 		*/
 		
 	/*	
 		
 		
 		
 		
 		;
 	
 		
 		
 		
 		
 		inscricaoMunicipal.setInscricaoEstadual("99999");
 		inscricaoMunicipal.setObjetoSocial("objeto social");
 		
 		inscricaoMunicipal.setEmpresaLogradouro("99999");
 		inscricaoMunicipal.setEmpresaComplementoLogradouro("Complemento");
 		inscricaoMunicipal.setEmpresaBairro("Bairro");
 		
 		inscricaoMunicipal.setEmpresaUF("SP");
 		inscricaoMunicipal.setEmpresaEmail("a@gmail.com");
 		inscricaoMunicipal.setEmpresaFax("99999");
 		inscricaoMunicipal.setRegistroJuntaComercial("9999999");
 		inscricaoMunicipal.setDataEmissaoNIREInicial(new Date());
 		inscricaoMunicipal.setDetalhaUltimaAlteracaoJunta("detaçje");
 		inscricaoMunicipal.setDataUltimaAlteracaoJunta(new Date());
 		inscricaoMunicipal.setCapitalSocial(9999.0000);
 		inscricaoMunicipal.setHoraDeFuncionamentoDomingo("9:00 - 10:00");
 		inscricaoMunicipal.setHoraDeFuncionamentoSabado("00:00 - 00:00");
 		inscricaoMunicipal.setHoraDeFuncionamentoSegundaASexta("00:00 - 00:00");
 		
 		inscricaoMunicipal.setDadosContadorNumeroEndereco("99999");
 		inscricaoMunicipal.setTipoAlteracaoAtividades(1);
 		inscricaoMunicipal.setTipoAlteracaoRazaoSocial(1);
 		inscricaoMunicipal.setTipoAlteracaoRenovacao(1);
 		inscricaoMunicipal.setTipoAlteracaoSocios(1);
 		inscricaoMunicipal.setDataAbertura(new Date());
 		inscricaoMunicipal.setDataDeEntrada(new Date());
 		inscricaoMunicipal.setId(0L);
 		inscricaoMunicipal.setEmpresaMunicipio("Diadema");
 		inscricaoMunicipal.setEmpresaTelefone("11-40970101");
 		inscricaoMunicipal.setTipoAlteracaoEndereco(0);
 		
 		//inscricaoMunicipal.setEmpresacodigoLogradouroAgata(5);
 	//	inscricaoMunicipal.setEmpresaCodigoBairro(6);
 		
 		Publicidades p = new Publicidades();
 		p.setId(0L);
 		p.setM2(5.0);
 		p.setQuantidade(5);
 		p.setTipo(1);
 		
 		List<Publicidades> publicidades = new ArrayList<Publicidades>();
 		publicidades.add(p);
		inscricaoMunicipal.setPublicidades(publicidades );
 		
 		*/
 		//ENQUANTRAMENTO aTIVIDADE 
 		EnquadramentoAtividadeEconomica enquadramentoAtividadeEconomica = new EnquadramentoAtividadeEconomica();
 		enquadramentoAtividadeEconomica.setId(0L);
 		enquadramentoAtividadeEconomica.setClassificacaoAtividade("Industria");
 		enquadramentoAtividadeEconomica.setDataAlteracao(new Date());
 		enquadramentoAtividadeEconomica.setObservacao("Observação para teste");
 		inscricaoMunicipal.setEnquadramentoAtividadeEconomica(enquadramentoAtividadeEconomica);
 	
 		List<EnquadramentoAtividadeEconomicaComplemento> enquadramentoAtividadeEconomicaComplementos = new ArrayList<EnquadramentoAtividadeEconomicaComplemento>();
 		EnquadramentoAtividadeEconomicaComplemento encontradmento = new EnquadramentoAtividadeEconomicaComplemento();
		ComplementoAtividade complemento = new ComplementoAtividade();
		complemento.setGrupo(2);
		complemento.setSubgrupo(0);
		complemento.setAtividade(11);
		complemento.setId(0L);		
		complemento.setDescricao("Descricao");
		encontradmento.setTipo("principal");
		encontradmento.setComplementoAtividade(complemento);
		encontradmento.setId(0L);
		enquadramentoAtividadeEconomicaComplementos.add(encontradmento);
		enquadramentoAtividadeEconomica.setEnquadramentoAtividadeEconomicaComplementos(enquadramentoAtividadeEconomicaComplementos );
		enquadramentoAtividadeEconomica.setDataAlteracao(new Date());
		enquadramentoAtividadeEconomica.setDataContrato(new Date());
		enquadramentoAtividadeEconomica.setObservacao("Abc");
		enquadramentoAtividadeEconomica.setObservacaoContrato("contrato");
		enquadramentoAtividadeEconomica.setHoraContrato(new Date());
		enquadramentoAtividadeEconomica.setNumeroContrato(999);
		enquadramentoAtividadeEconomica.setSequencia(1);
		enquadramentoAtividadeEconomica.setId(0L);
 		
 		
 		
 		
 		List<EnquadramentoISSCodigoServico> enquadramentoISSCodigoServico = new ArrayList<EnquadramentoISSCodigoServico>();
 		EnquadramentoISSCodigoServico enquadramentoISSCodigoServico1 = new EnquadramentoISSCodigoServico();
 		enquadramentoISSCodigoServico1.setCodigoServico("10.09");
 		enquadramentoISSCodigoServico1.setDataFinal(new Date());
 		enquadramentoISSCodigoServico1.setDataInicial(new Date());
 		enquadramentoISSCodigoServico1.setId(0L);
 		enquadramentoISSCodigoServico1.setSituacao("A");
 		enquadramentoISSCodigoServico1.setTipo("P");
		enquadramentoISSCodigoServico.add(enquadramentoISSCodigoServico1 );		
 		
 		//Enquatramento de ISS
 		EnquadramentoISS enquadramentoISS = new EnquadramentoISS();
 		enquadramentoISS.setTipoISSQN("I");
 		
		enquadramentoISS.setEnquadramentoISSCodigoServico(enquadramentoISSCodigoServico);
 		enquadramentoISS.setIsentoTlf(1);
 		enquadramentoISS.setId(0L);
 		enquadramentoISS.setProcessoDeveContinuar("S");
 		enquadramentoISS.setTlfInicial(1);
		inscricaoMunicipal.setEnquadramentoISS(enquadramentoISS);
		
		
		
		//CNAE
		List<Cnae> cnaes = new ArrayList<Cnae>();
		Cnae cnae = new Cnae();
		cnae.setCodigo("123456");
		cnae.setNome("Nome do cnae");
		cnae.setPrincipal(true);
		cnae.setId(0L);
		
		Cnae cnae2 = new Cnae();
		cnae2.setCodigo("666666");
		cnae2.setNome("Nome do cnae 2");
		cnae2.setPrincipal(false);
		cnae2.setId(0L);
		
		cnaes.add(cnae );
		cnaes.add(cnae2 );
		inscricaoMunicipal.setCnaes(cnaes);
		//----
		
		//Socios
		Socio socio1 = new Socio();
		socio1.setId(0L);
		socio1.setBairro("Bairro");
		socio1.setCep("09921250");
		socio1.setCidade("31805");
		socio1.setComplementoEndereco("Tests");
		socio1.setCpf("32379324859");
		socio1.setEmail("abc@abc.com.br");
		socio1.setEndereco("endereço de teste");
		socio1.setNome("nome");
		socio1.setNumeroEndereco("798");
		socio1.setRg("456789");
		socio1.setTelefone("78998898");
		socio1.setUf("SP");
		
		Socio socio2 = new Socio();
		socio2.setId(0L);
		socio2.setBairro("Bairro");
		socio2.setCep("09921250");
		socio2.setCidade("31805");
		socio2.setComplementoEndereco("Tests");
		socio2.setCpf("32379324859");
		socio2.setEmail("abc@abc.com.br");
		socio2.setEndereco("endereço de teste");
		socio2.setNome("nome");
		socio2.setNumeroEndereco("798");
		socio2.setRg("456789");
		socio2.setTelefone("78998898");
		socio2.setUf("SP");
		
		List<Socio> socios = new ArrayList<Socio>();
		socios.add(socio1);
		socios.add(socio2);
		inscricaoMunicipal.setSocios(socios);
		
		//----------------------
		//CONTATODR
		//----------------------
		//----------------------
		//----------------------
		inscricaoMunicipal.setDadosContadorAtividadeEconomica("789798");
		inscricaoMunicipal.setDadosContadorBairro("BAIRRO DO CONTADOR");
		inscricaoMunicipal.setDadosContadorCEP("09921000");
		inscricaoMunicipal.setDadosContadorComplementoEndereco("cOMPELEMNTO");
		inscricaoMunicipal.setDadosContadorCPF("32379324859");
		inscricaoMunicipal.setDadosContadorCrc("1111");
		inscricaoMunicipal.setDadosContadorEmail("contador@contador.com");
		inscricaoMunicipal.setDadosContadorEndereco("endereço contador");
		inscricaoMunicipal.setDadosContadorFax("12123");
		inscricaoMunicipal.setDadosContadorNome("nome contador");
		inscricaoMunicipal.setDadosContadorMunicipio("31080");
		inscricaoMunicipal.setDadosContadorNomeEscritorio("Escritorio do contador");
		inscricaoMunicipal.setDadosContadorRG("789798");
		inscricaoMunicipal.setDadosContadorTelefone("9999");
		inscricaoMunicipal.setDadosContadorUf("SP");
		inscricaoMunicipal.setDataDeAlteracao(new Date());
		//BANCO DE DADOS (BASE DE TESTE) SIAP ETL
		
		//----------------------
		//Representante
		//----------------------
		//----------------------
		//----------------------
		
		inscricaoMunicipal.setRepresentanteLegalBairro("Bairro");
		inscricaoMunicipal.setRepresentanteLegalCEP("099921000");
		inscricaoMunicipal.setRepresentanteLegalComplementoDeEndereco("complemento");
		inscricaoMunicipal.setRepresentanteLegalCPF("32379324859");
		inscricaoMunicipal.setRepresentanteLegalEmail("abc@email.com");
		inscricaoMunicipal.setRepresentanteLegalEndereco("Endereço do represente");
		inscricaoMunicipal.setRepresentanteLegalMunicipio("31805");
		inscricaoMunicipal.setRepresentanteLegalNome("nome do representando");
		inscricaoMunicipal.setRepresentanteLegalNumeroDoEndereco("99999");
		inscricaoMunicipal.setRepresentanteLegalRG("rg 33333");
		inscricaoMunicipal.setRepresentanteLegalTelefone("11111");
		inscricaoMunicipal.setRepresentanteLegalUf("SP");
		
		
	//	wsTeste.lancarTaxa(122, 0.0d,1, 2, 1206600102L, "observação");
		
	//	SdtEmpresasporCnpjSdtEmpresasporCnpjItem t = wsTeste.consultarExistemEmpresaPorCnpj(46523247000193L);
	//	System.out.println(t.getDescSituacaoCadastral());
		
		
//		WsBuscaDadosBoletoTaxasDiversasExecuteResponse t1 = wsTeste.buscarBoleto(9999l);
//		boolean t2 = wsTeste.existeInscricaoImobiliario(61580L);
//		System.out.println(t2);
//		boolean t3 = wsTeste.existeCnpj(46523247000193L);
//		System.out.println(t3);
//		PmdBoleto t4 = wsTeste.localizarBoleto(879789798L);
//		System.out.println(t4.getDsBoleto());
//		Boletos t5 = wsTeste.realizarChamada(2023094280l);
//		System.out.println(t5);
		
	
		return inscricaoMunicipal;
	}
	
	
	public  static void main(String args[]) throws Exception{
		
		EgataInscricaoWS w = new EgataInscricaoWS();
		w.consultarCmcPorCnpj(32379324859L);
		w.consultarExistemEmpresaPorCnpj(32379324859L);
		
		//w.enviarDadosAgata(paramentroInsrciao2());
		
		//EgataInscricaoWS wsTeste = new EgataInscricaoWS();
		
		//EgataBoletoWS wsTest3e = new EgataBoletoWS(null);
		//wsTest3e.registrarBoleto(1L, "n2");
		
		// System.out.println(t);
	//	List<Logradouro> tt = wsTeste.listarEnderecoPorNomeLogradouro("NOVA YORK");
		
		//Municipio param = new Municipio();
		//param.setSgUf("sp");
		//param.setDsMunicipio("diadema");
	//	List<Municipio> tt = wsTeste.lsitarMunicipioPorUfOuCidade(param);
		//WsBuscaDadosBoletoTaxasDiversasExecuteResponse t = wsTeste.buscarBoleto(9999L); //BOLETO NÃO EXISTE
		
	//	System.out.println(tt);
	}
	
	
	
	public List<Municipio> listarMunicipioPorUfOuCidade(Municipio municipio) throws Exception{
		
		
		
		WsBuscaMunicipioExecute param = new WsBuscaMunicipioExecute();
		param.setNommunic(municipio.getDsMunicipio());
		param.setSigunifed(municipio.getSgUf());
				
		WsBuscaMunicipio wsl = new WsBuscaMunicipio();
		WsBuscaMunicipioSoapPort port = wsl.getWsBuscaMunicipioSoapPort();
		
		WsBuscaMunicipioExecuteResponse er = port.execute(param);
		
		List<Municipio> listaMunicipio = new ArrayList<Municipio>();

			
		
		for( SdtMunicipiosSdtMunicipiosItem l : er.getSdtmunicipios().getSdtMunicipiosSdtMunicipiosItem()){
			Municipio municipioItem =  new Municipio();
			
			municipioItem.setCdMunicipio(l.getCdgmunic());
			municipioItem.setDsMunicipio(l.getNommunic());
			municipioItem.setSgUf(l.getSigunifed());
			listaMunicipio.add(municipioItem);
		}
			
		return listaMunicipio;
	}
	
	
	/**
	 * Lista a quantidade de endereços por nome da rua
	 * @param logradouro
	 * @return
	 * @throws Exception
	 */
	public List<Logradouro> listarEnderecoPorNomeLogradouro(String logradouro) throws Exception{
		WsbuscabairrologradouroExecute param = new WsbuscabairrologradouroExecute();
		param.setNomlgr(logradouro);
				
		Wsbuscabairrologradouro wsl = new Wsbuscabairrologradouro();
		WsbuscabairrologradouroSoapPort port = wsl.getWsbuscabairrologradouroSoapPort();
		
		WsbuscabairrologradouroExecuteResponse er = port.execute(param);
		
		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		for(SdtBairroLogradourosSdtBairroLogradouroItem item : er.getSdtbairrologradouros().getSdtBairroLogradourosSdtBairroLogradouroItem()){
			Logradouro logradouroItem =  new Logradouro();
			logradouroItem.setCdBairro(item.getCdgsetor());
			logradouroItem.setCdLogradouro(item.getCdglgr());
			logradouroItem.setDsBairro(item.getNomsetor());
			logradouroItem.setDsLogradouro(item.getNomlgr());
			logradouroItem.setDsTipoLogradouro(item.getTpolgr());
			logradouros.add(logradouroItem);
		}
			
		return logradouros;
	}
	
	
	/**
	 * Lista a quantidade de endereços por nome da rua
	 * @param logradouro
	 * @return
	 * @throws Exception
	 */
	public List<Logradouro> listarTodosEnderecos(String logradouro) throws Exception{
		WsEnderecamentoExecute param = new WsEnderecamentoExecute();
		param.setTrechologradouro(logradouro);
		param.setUfsiglaQ("SP");
				
		WsEnderecamento wsl = new WsEnderecamento();
		WsEnderecamentoSoapPort port = wsl.getWsEnderecamentoSoapPort();
		
		WsEnderecamentoExecuteResponse er = port.execute(param);
		
		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		for(SdtLogradouroporBairroSdtLogradouroporBairroItem item : er.getSdtLogradouroporbairro().getSdtLogradouroporBairroSdtLogradouroporBairroItem()){
			Logradouro logradouroItem =  new Logradouro();
			logradouroItem.setCdBairro(item.getBairroCodigo());
			logradouroItem.setCdLogradouro(item.getLogradouroCodigo());
			logradouroItem.setDsBairro(item.getBairroNome());
			logradouroItem.setDsLogradouro(item.getLogradouroNome());
			logradouroItem.setDsTipoLogradouro(item.getLogradouroTipo());
			logradouros.add(logradouroItem);
		}
			
		return logradouros;
	}
	
	
	/**
	 * Retornar o numero do CMC por CNPJ
	 * @param cnpj
	 * @return
	 * @throws Exception
	 */
	public Long consultarCmcPorCnpj(Long cnpj) throws Exception{
		
		WsconsultaexistenciaempresaExecute param = new WsconsultaexistenciaempresaExecute();
		param.setCnpj(cnpj.toString());

		Wsconsultaexistenciaempresa ws1 = new Wsconsultaexistenciaempresa();
		WsconsultaexistenciaempresaSoapPort port = ws1.getWsconsultaexistenciaempresaSoapPort();
		
		WsconsultaexistenciaempresaExecuteResponse exisiteInscricaoMunicipal = port.execute(param);
		return exisiteInscricaoMunicipal.getSdtEmpresasporcnpj().getSdtEmpresasporCnpjSdtEmpresasporCnpjItem().get(0).getInscricaoMunicipal();
	}
	
	
	

	
	public Long enviarDadosAgata(InscricaoMunicipal inscricaoMunicipal) throws Exception {
		ParseInscricaoEgata parse = new ParseInscricaoEgata();
		
		WSEnviarDadosEmpresa wsEnviarDadosEmpresa = new WSEnviarDadosEmpresa();
        WSEnviarDadosEmpresaSoapPort port = wsEnviarDadosEmpresa.getWSEnviarDadosEmpresaSoapPort();
        
        WSEnviarDadosEmpresaExecute execute = new WSEnviarDadosEmpresaExecute();
        SdtDadosCadastraisEmpresa params = new SdtDadosCadastraisEmpresa();
        params = parse.parseAgata(inscricaoMunicipal);
        
        
        //ConverterDtoJson.mostarJson(params);
        
        execute.setSdtDadoscadastraisempresas(params);
        

        try {
            WSEnviarDadosEmpresaExecuteResponse response = port.execute(execute);
            
            if (response != null) {
                if (response.getRetornows() != null) {
                    List<RetornoWSRetornoWSItem> respostas = response.getRetornows().getRetornoWSRetornoWSItem();
                    for (RetornoWSRetornoWSItem item : respostas) {
                        if (item.getIdRetorno() != 0) {
                            throw new Exception("Não foi possível enviar dados ao àgata: " + item.getDesRetorno());
                        } else {
                        	ConverterDtoJson.mostarJson(item);
                        	return Long.parseLong(item.getDesRetorno().split(":")[1].trim());
                            //break;
                        }
                    }
                }
            } else {
                throw new Exception("Não foi possível enviar dados ao àgata: Não houve resposta para a chamada do Webservice");
            }
        } catch (Exception e) {
        	ConverterDtoJson.mostarJson(params);
            throw new Exception("Não é foi possivel enviar dados para o agata: " + e.toString());
        }
        return -1L;
		
		//return sInscricao;
	}
	
	
	/**
	 * Consulta cnpj da empresa
	 * @param cnpj
	 * @return
	 * @throws Exception
	 */
	public SdtEmpresasporCnpjSdtEmpresasporCnpjItem consultarExistemEmpresaPorCnpj(Long cnpj) throws Exception{
		WsconsultaexistenciaempresaExecute param = new WsconsultaexistenciaempresaExecute();
		param.setCnpj(cnpj.toString());

		Wsconsultaexistenciaempresa ws1 = new Wsconsultaexistenciaempresa();
		WsconsultaexistenciaempresaSoapPort port = ws1.getWsconsultaexistenciaempresaSoapPort();
		
		WsconsultaexistenciaempresaExecuteResponse exisiteInscricaoMunicipal = port.execute(param);
		return exisiteInscricaoMunicipal.getSdtEmpresasporcnpj().getSdtEmpresasporCnpjSdtEmpresasporCnpjItem().get(0);
	}
	
	
	private boolean existeCnpj(Long cnpj) throws Exception{
		
		
		WsconsultaexistenciaempresaExecute param = new WsconsultaexistenciaempresaExecute();
		param.setCnpj(cnpj.toString());

		Wsconsultaexistenciaempresa ws1 = new Wsconsultaexistenciaempresa();
		WsconsultaexistenciaempresaSoapPort port = ws1.getWsconsultaexistenciaempresaSoapPort();
		
		WsconsultaexistenciaempresaExecuteResponse exisiteInscricaoMunicipal = port.execute(param);
		return exisiteInscricaoMunicipal.getSdtEmpresasporcnpj().getSdtEmpresasporCnpjSdtEmpresasporCnpjItem().get(0).getIdRetorno() == 0;
	}
	
	
	/**
	 * Verifica se existe a inscrição mobiliario
	 * @param inscricaoMunicipal
	 * @return
	 * @throws Exception
	 */
	public boolean existeInscricaoMobiliario(String tipo, Long numeroInscricao) throws Exception{
		tipo = tipo.toLowerCase();
		if(tipo.equals("cnpj")){
			return existeCnpj(numeroInscricao);			
		}
		
		if(tipo.equals("mobiliario")){
			return  existeInscricaoMobiliario(numeroInscricao);
		}
		
		if(tipo.equals("imobiliario")){
			return  existeInscricaoImobiliario(numeroInscricao);
		}
		
		//Quando nenhuma opção for selecionado o dados retoranr true
		return false;
	}
	
	private boolean existeInscricaoImobiliario(Long inscricaoMunicipal) throws Exception{		
		WsverificainscricaoimobiliariaExecute param = new WsverificainscricaoimobiliariaExecute();
		param.setInscricaoimobiliaria(inscricaoMunicipal.toString());

		Wsverificainscricaoimobiliaria ws1 = new Wsverificainscricaoimobiliaria();
		WsverificainscricaoimobiliariaSoapPort port = ws1.getWsverificainscricaoimobiliariaSoapPort();
		
		WsverificainscricaoimobiliariaExecuteResponse exisiteInscricaoMunicipal = port.execute(param);
		
		return exisiteInscricaoMunicipal.getExiste() == 1;
	}
	
	private boolean existeInscricaoMobiliario(Long inscricaoMunicipal) throws Exception{
		
		WsConsultarExistenciaDaEmpresaExecute parameters = new WsConsultarExistenciaDaEmpresaExecute();
		parameters.setInscricaomunicipal(inscricaoMunicipal);
		
		
		
		WsConsultarExistenciaDaEmpresa wsdl = new WsConsultarExistenciaDaEmpresa();
		WsConsultarExistenciaDaEmpresaSoapPort port = wsdl.getWsConsultarExistenciaDaEmpresaSoapPort();
		
		WsConsultarExistenciaDaEmpresaExecuteResponse resposta = port.execute(parameters);
		
		
		return resposta.getSdtDadoscadastraisempresas().getIdRetorno() == 0; //0 = existe emporesa; 1 = não existe emporesa;
	}
		
		
		
		
		 
		//ConverterDtoJson.mostarJson(empresa);
		//return true;*/
		
		//WsConsultarExistenciaDaEmpresaExecute parameters = new WsConsultarExistenciaDaEmpresaExecute();
		//parameters.setInscricaomunicipal(inscricaoMunicipal);

//		WsConsultarExistenciaDaEmpresa ws1 = new WsConsultarExistenciaDaEmpresa();
//		WsConsultarExistenciaDaEmpresaSoapPort port = ws1.getWsConsultarExistenciaDaEmpresaSoapPort();
	//
	//	WsConsultarExistenciaDaEmpresaExecuteResponse inscricao = port.execute(parameters);
	//	return inscricao.getSdtDadoscadastraisempresas().getIdRetorno() == 0;
	//}
	
	
	
		
	
	/**
	 * 
	 * @param orgao
	 * @param numeroProcesso
	 * @param ano
	 * @param codigoTaxa
	 * @param valorTaxa
	 * @param quantidadeTaxa
	 * @param tipoContribuinte
	 * @param inscricao
	 * @param observacao
	 * @return
	 * @throws Exception
	 */
	public RetBoleto lancarTaxaHomologacao(String orgao, 
			Long numeroProcesso, 
			Integer ano, 
			Integer codigoTaxa, 
			Double valorTaxa, 
			Integer quantidadeTaxa, 
			Integer tipoContribuinte, 
			Long inscricao, 
			String observacao) throws Exception {
		
		
		//verificar se existe algum protocolo ja aberto
		PmdBoleto existeBoleto = dao.verificarSeExisteBoletoCadastradoPorNumeroProtocolo(orgao, ano, numeroProcesso);
		if(existeBoleto != null){
			// criar uma boleto novo aqui
			
			/// Caso exista o boleto o sistema apenas ira realizar a consulta do boleto e devolver para o usuario
			Boletos boletos = realizarChamada(existeBoleto.getNrProcessoBoleto());
			ConcurrentHashMap<String, Object> parametros = adicionarParametros(boletos);
			RetBoleto ret = gerarBoleto(Long.parseLong(inscricao+ "" + codigoTaxa) , boletos, parametros);
			ret.setResultado("Boleto duplicado");
			ret.setSucesso(true);
			//ret.setArquivo(null);
			ret.setNumeroProcesso(existeBoleto.getNrProcessoBoleto().toString());
			
			PmdBoleto boleto = new PmdBoleto();
			boleto.setCdSituacao(0);		
			boleto.setDsBoleto("BOLETO_EM_ANDAMENTO");
			boleto.setDsOrgao(orgao);
			boleto.setDsSituacao("boleto em andamento");
			boleto.setNrAno(ano);
			boleto.setNrProcesso(numeroProcesso);
			boleto.setDtVencimento(boletos.getDataVencimento());		
			boleto.setNrProcessoBoleto(Long.parseLong(ret.getNumeroProcesso()));
			
			dao.save(boleto);
			return ret;
		}
		
		
		
		
		//consultaBoletoPorNumeroProcessoEletronico(numeroProcesso, orgao, ano);
		
		Boletos boletos = lancarBoleto(codigoTaxa, valorTaxa, quantidadeTaxa, tipoContribuinte, inscricao, observacao);
		ConcurrentHashMap<String, Object> parametros = adicionarParametros(boletos);
		RetBoleto ret = gerarBoleto(Long.parseLong(inscricao+ "" + codigoTaxa) , boletos, parametros);
		
		PmdBoleto boleto = new PmdBoleto();
		boleto.setCdSituacao(0);		
		boleto.setDsBoleto("BOLETO_EM_ANDAMENTO");
		boleto.setDsOrgao(orgao);
		boleto.setDsSituacao("boleto em andamento");
		boleto.setNrAno(ano);
		boleto.setNrProcesso(numeroProcesso);
		boleto.setDtVencimento(boletos.getDataVencimento());		
		boleto.setNrProcessoBoleto(Long.parseLong(ret.getNumeroProcesso()));
		
		dao.save(boleto);
		
		return ret;
	}
	
	private ConcurrentHashMap<String, Object> adicionarParametros(Boletos boletos){
		ConcurrentHashMap<String, Object> parametros = new ConcurrentHashMap();
	    if (boletos.getDescricaoDAM() != null) {
	      parametros.put("DESCRICAO_DAM", boletos.getDescricaoDAM());
	    }
	    if (boletos.getLogoPrefeitura() != null) {
	      parametros.put("LOGO_PREFEITURA", boletos.getLogoPrefeitura());
	    }
	    if (boletos.getProcessoContribuinte() != null) {
	      parametros.put("PROCESSO_CONTRIBUINTE", boletos.getProcessoContribuinte());
	    }
	    if (boletos.getDamReferente() != null) {
	      parametros.put("DAM_REFERENTE", boletos.getDamReferente());
	    }
	    if (boletos.getReferencia() != null) {
	      parametros.put("REFERENCIA", boletos.getReferencia());
	    }
	    if (boletos.getCodigoContribuinte() != null) {
	      parametros.put("CODIGO_CONTRIBUINTE", boletos.getCodigoContribuinte());
	    }
	    if (boletos.getCodigoUsuario() != null) {
	      parametros.put("CODIGO_USUARIO", boletos.getCodigoUsuario());
	    }
	    if (boletos.getNomeUsuario() != null) {
	      parametros.put("NOME_USUARIO", boletos.getNomeUsuario());
	    }
	    if (boletos.getDocumentoUsuario() != null) {
	      parametros.put("DOCUMENTO_USUARIO", boletos.getDocumentoUsuario());
	    }
	    if (boletos.getInscricao() != null) {
	      parametros.put("INSCRICAO", boletos.getInscricao());
	    }
	    if (boletos.getTipoInscricao() != null) {
	      parametros.put("TIPO_INSCRICAO", boletos.getTipoInscricao());
	    }
	    if (boletos.getCorrecao() != null) {
	      parametros.put("CORRECAO", boletos.getCorrecao());
	    }
	    if (boletos.getCip() != null) {
	      parametros.put("CIP", boletos.getCip());
	    }
	    
	    return parametros;
	}
	
	
	private final String CAMINHO_ARQUIVO = System.getProperty ("java.io.tmpdir");
	private RetBoleto gerarBoleto(Long numeroProcesso, Boletos boletos,	ConcurrentHashMap<String, Object> parametros) throws Exception{

		Boleto boletoStella = boletos.toStellaBoleto();
		GeradorDeBoleto gerador = new GeradorDeBoleto(parametros, boletoStella);
		String caminho = CAMINHO_ARQUIVO + File.separator +  numeroProcesso + ".pdf";
	//	caminho = caminho.replace(":", "/");
//		caminho = caminho.replace(";", "");

		File pdf = new File(caminho); //desativadro o agerar arquivo no servidor, pois não é necessario
		gerador.geraPDF(pdf);
		byte[] arquivo = gerador.geraPDF();

		RetBoleto ret = new RetBoleto();
		ret.setResultado("SUCESSO");
		ret.setSucesso(true);
		//ret.setCaminhoArquivo(caminho);
		ret.setArquivo(arquivo);
		ret.setNumeroProcesso(boletos.getProcessoContribuinte());
		return ret;

	}
	
	
	private Boletos lancarBoleto(Integer codigoTaxa, 
			Double valorTaxa, 
			Integer quantidadeTaxa, 
			Integer tipoContribuinte, 
			Long inscricao, 
			String observacao) throws Exception{
		
		Boletos boletos = null;
		AbacoLancamentoHomologacaoWs ws = new AbacoLancamentoHomologacaoWs();
		boletos =  ws.executarHmg(codigoTaxa, valorTaxa, quantidadeTaxa, tipoContribuinte, inscricao, observacao);
		return boletos;
	}

	
	private PmdBoleto localizarBoleto(Long nrBoleto) throws Exception{
		
		WsBuscaDadosBoletoTaxasDiversasExecute  paramsWSBoleto = new WsBuscaDadosBoletoTaxasDiversasExecute();
		paramsWSBoleto.setProcesso(nrBoleto.intValue());
		
		WsBuscaDadosBoletoTaxasDiversas ws = new WsBuscaDadosBoletoTaxasDiversas();
		WsBuscaDadosBoletoTaxasDiversasSoapPort port = ws.getWsBuscaDadosBoletoTaxasDiversasSoapPort();
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse retornoBoleto = port.execute(paramsWSBoleto);

		if (retornoBoleto == null || retornoBoleto.getSdtboletotaxasdiversas() == null) {
			throw new Exception("Boleto Não encontrado");
		}
		
		
		PmdBoleto pmd = new PmdBoleto();
		

		if (retornoBoleto.getSdtboletotaxasdiversas().getValoraPagar() == 0.0D) {
			if ((retornoBoleto.getRetornows() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem().size() > 0)) {
				String ret = "";
				for (RetornoWSRetornoWSItem retorno : retornoBoleto.getRetornows().getRetornoWSRetornoWSItem()) {					
					pmd.setCdSituacao((int) retorno.getIdRetorno());
					pmd.setDsSituacao(retorno.getDesRetorno());
					
					if("Erro: Taxas diversas informada inválida!".equals(retorno.getDesRetorno())){
						pmd.setDsBoleto("BOLETO_INVALIDO");
					}
					
					if(retorno.getDesRetorno().contains("Taxas diversas com validade vencida!")){
						pmd.setDsBoleto("BOLETO_VENCIDO");
					}
					
					
					if(retorno.getDesRetorno().contains("Erro: Taxas diversas foi paga")){
						pmd.setDsBoleto("BOLETO_PAGO");
						
					}
					
					
					if(retorno.getDesRetorno().contains("Consulta efetuada com sucesso!")){
						pmd.setDsBoleto("BOLETO_EM_ANDAMENTO");
					}
				}
			}
		}else{
			for (RetornoWSRetornoWSItem retorno : retornoBoleto.getRetornows().getRetornoWSRetornoWSItem()) {					
				pmd.setCdSituacao((int) retorno.getIdRetorno());
				pmd.setDsSituacao(retorno.getDesRetorno());
				if(retorno.getDesRetorno().contains("Erro: Taxas diversas foi paga")){
					pmd.setDsBoleto("BOLETO_PAGO");
					
				}
				
				
				if(retorno.getDesRetorno().contains("Consulta efetuada com sucesso!")){
					pmd.setDsBoleto("BOLETO_EM_ANDAMENTO");
				}
				
				
				if("Erro: Taxas diversas informada inválida!".equals(retorno.getDesRetorno())){
					pmd.setDsBoleto("BOLETO_INVALIDO");
				}
				
				if(retorno.getDesRetorno().contains("Taxas diversas com validade vencida!")){
					pmd.setDsBoleto("BOLETO_VENCIDO");
				}
			}
		}
		
		return pmd;
	}
	
	
	
	
	private Boletos realizarChamada(Long nrTaxaDiversaProcesso) throws Exception{
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse ws = buscarBoleto(nrTaxaDiversaProcesso);
		
		ConversorResponse resposta = new ConversorResponse(ws);
		Boletos boleto = resposta.getWSBoleto();
		
		return boleto;
	}
	
	private WsBuscaDadosBoletoTaxasDiversasExecuteResponse buscarBoleto(Long nrTaxaDiversaProcesso) throws Exception {

		WsBuscaDadosBoletoTaxasDiversasExecute paramsWSBoleto = new WsBuscaDadosBoletoTaxasDiversasExecute();
		paramsWSBoleto.setProcesso(nrTaxaDiversaProcesso.intValue());

		WsBuscaDadosBoletoTaxasDiversas ws = new WsBuscaDadosBoletoTaxasDiversas();
		WsBuscaDadosBoletoTaxasDiversasSoapPort port = ws.getWsBuscaDadosBoletoTaxasDiversasSoapPort();
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse retornoBoleto = port.execute(paramsWSBoleto);

		if (retornoBoleto == null || retornoBoleto.getSdtboletotaxasdiversas() == null) {
			throw new Exception("Boleto Não encontrado");
		}

		if (retornoBoleto.getSdtboletotaxasdiversas().getValoraPagar() == 0.0D) {
			if ((retornoBoleto.getRetornows() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem() != null) && (retornoBoleto.getRetornows().getRetornoWSRetornoWSItem().size() > 0)) {
				String ret = "";
				for (RetornoWSRetornoWSItem retorno : retornoBoleto.getRetornows().getRetornoWSRetornoWSItem()) {
					ret = ret + "\n Erro ao gerar o boleto: "
							+ retorno.getIdRetorno() + " - "
							+ retorno.getDesRetorno() + " - numero da taxa " + nrTaxaDiversaProcesso;
				}
				throw new BoletoException(ret);
			}
			throw new BoletoException("Retorno do WS boleto: null - Falha desconhecida");
		}
		
		return retornoBoleto;
	}
	
	
	 class ConversorResponse {
		WsBuscaDadosBoletoTaxasDiversasExecuteResponse boletoResponse;
		Boletos boleto = new Boletos();

		public ConversorResponse(WsBuscaDadosBoletoTaxasDiversasExecuteResponse boletoResponse) {
			this.boletoResponse = boletoResponse;
		}

		public Boletos getWSBoleto() throws FileNotFoundException {
			Bradesco bancoBradesco = new Bradesco();

			this.boleto.setAceite(this.boletoResponse.getSdtboletotaxasdiversas().getAceite());
			this.boleto.setAgenciaBeneficiario(this.boletoResponse.getSdtboletotaxasdiversas().getAgencia());
			this.boleto.setCodigoBeneficiario(this.boletoResponse.getSdtboletotaxasdiversas().getCedente());
			this.boleto.setBanco(bancoBradesco);
			this.boleto.setCarteiraBeneficiario(this.boletoResponse
					.getSdtboletotaxasdiversas().getCarteira());
			this.boleto.setCip(this.boletoResponse.getSdtboletotaxasdiversas()
					.getCIP());
			this.boleto.setCorrecao(String.valueOf(this.boletoResponse
					.getSdtboletotaxasdiversas().getCorrecao()));
			this.boleto.setDamReferente(this.boletoResponse
					.getSdtboletotaxasdiversas().getDAMReferentea());
			this.boleto.setDataDocumento(converteData(this.boletoResponse
					.getSdtboletotaxasdiversas().getDataEmissao()));
			this.boleto.setDataProcessamento(converteData(this.boletoResponse
					.getSdtboletotaxasdiversas().getDataProcessamento()));
			this.boleto.setDataVencimento(converteData(this.boletoResponse
					.getSdtboletotaxasdiversas().getVencimento()));

			StringBuffer sb = new StringBuffer();
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas()
					.getDescricaoDAM1() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas()
					.getDescricaoDAM2() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas()
					.getDescricaoDAM3() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas()
					.getDescricaoDAM4() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas()
					.getDescricaoDAM5() + "\n");
			sb.append(this.boletoResponse.getSdtboletotaxasdiversas()
					.getDescricaoDAM6());

			this.boleto.setDescricaoDAM(sb.toString());

			this.boleto.setDocumentoBeneficiario(this.boletoResponse
					.getSdtboletotaxasdiversas().getBeneficiarioCNPJ());
			this.boleto.setDocumentoPagador(this.boletoResponse
					.getSdtboletotaxasdiversas().getCpfCnpj());
			this.boleto.setEspecieMoeda(this.boletoResponse
					.getSdtboletotaxasdiversas().getMoeda());

			this.boleto.setCodigoEspecieMoeda("9");

			this.boleto.setInscricao(String.valueOf(this.boletoResponse
					.getSdtboletotaxasdiversas().getInscricao()));
			this.boleto.setInstrucao1(this.boletoResponse
					.getSdtboletotaxasdiversas().getMsgblt1());
			this.boleto.setInstrucao2(this.boletoResponse
					.getSdtboletotaxasdiversas().getMsgblt2());
			this.boleto.setInstrucao3(this.boletoResponse
					.getSdtboletotaxasdiversas().getMsgblt3());
			this.boleto.setInstrucao4(this.boletoResponse
					.getSdtboletotaxasdiversas().getMsgblt4());
			this.boleto.setInstrucao5(this.boletoResponse
					.getSdtboletotaxasdiversas().getMsgblt5());
			this.boleto.setLocaisPagamento(this.boletoResponse
					.getSdtboletotaxasdiversas().getLocalDePagamento());
			//this.boleto.setLogoPrefeitura(new FileInputStream(
			//		"/home/image/agiles-config/config/imgs/logo_pmd.jpg"));
			this.boleto.setMulta(String.valueOf(this.boletoResponse
					.getSdtboletotaxasdiversas().getMulta()));
			this.boleto.setNomeBeneficiario(this.boletoResponse
					.getSdtboletotaxasdiversas().getBeneficiario());
			this.boleto.setNomePagador(this.boletoResponse
					.getSdtboletotaxasdiversas().getContribuinte());
			this.boleto.setNossoNumero(this.boletoResponse
					.getSdtboletotaxasdiversas().getNossoNumero());
			this.boleto.setNossoNumeroDV(this.boletoResponse
					.getSdtboletotaxasdiversas().getNossoNumeroDV());
			this.boleto.setNumeroDocumento(this.boletoResponse
					.getSdtboletotaxasdiversas().getNossoNumero());
			this.boleto.setProcessoContribuinte(String
					.valueOf(this.boletoResponse.getSdtboletotaxasdiversas()
							.getProcesso()));
			this.boleto.setReferencia(this.boletoResponse
					.getSdtboletotaxasdiversas().getReferencia());
			this.boleto.setTipoInscricao(this.boletoResponse
					.getSdtboletotaxasdiversas().getTipoInscricao());
			this.boleto.setTsa(String.valueOf(this.boletoResponse
					.getSdtboletotaxasdiversas().getTSA()));
			this.boleto.setValorBoleto(String.valueOf(this.boletoResponse
					.getSdtboletotaxasdiversas().getValoraPagar()));

			return this.boleto;
		}

		

	  private Date converteData(XMLGregorianCalendar dateCalendar)
	  {
	    if (dateCalendar == null) {
	      return null;
	    }
	    return dateCalendar.toGregorianCalendar().getTime();
	  }
	  	 
	}


	public PmdBoleto consultarSituacaoBoletoPorNumeroProtocolo(Long numerProcesso, String orgao, Integer ano) throws Exception{
		PmdBoleto boleto = consultaBoletoPorNumeroProcessoEletronico(numerProcesso, orgao,ano);
		
		if(boleto == null){
			boleto = new PmdBoleto();
			boleto.setDsBoleto("BOLETO_INVALIDO");
			boleto.setDsOrgao(orgao);
			boleto.setNrAno(ano);
			boleto.setNrProcesso(numerProcesso);
			boleto.setDtAtualizacao(new Date());
			boleto = dao.save(boleto);
			return boleto;
		}
		
		if(boleto.getCdSituacao() == -1 ){
			return boleto;
		}
		
		PmdBoleto boletoSituacao = localizarBoleto(boleto.getNrProcessoBoleto());
		boleto.setDsBoleto(boletoSituacao.getDsBoleto());
		boleto.setDsSituacao(boletoSituacao.getDsSituacao());	
		boleto.setDtAtualizacao(new Date());
		dao.save(boleto);
		return boleto;
	}
	
	
	
	
	private PmdBoleto consultaBoletoPorNumeroProcessoEletronico(Long numerProcesso, String orgao, Integer ano) throws Exception{		
		List<PmdBoleto> boleto = dao.consultarBoletoPorNumeroProcesso(orgao, ano, numerProcesso);	
		if(boleto.size() == 0){
			PmdBoleto p = new PmdBoleto();
			p.setCdSituacao(-1);
			p.setDsBoleto("BOLETO_INVALIDO");
			p.setDsSituacao("Não foi encontrado boleto para este numero de protocolo " + orgao + " " + numerProcesso + "/" + ano);
			
			
			throw new Exception(p.getDsSituacao());
		}
		return boleto.get(0);
	}
}
