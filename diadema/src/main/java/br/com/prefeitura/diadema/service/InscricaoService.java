package br.com.prefeitura.diadema.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.Cnae;
import br.com.prefeitura.diadema.dto.ComplementoAtividade;
import br.com.prefeitura.diadema.dto.DtoInscricao;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomica;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomicaComplemento;
import br.com.prefeitura.diadema.dto.EnquadramentoISS;
import br.com.prefeitura.diadema.dto.EnquadramentoISSCodigoServico;
import br.com.prefeitura.diadema.dto.InscricaoMunicipal;
import br.com.prefeitura.diadema.dto.Publicidades;
import br.com.prefeitura.diadema.dto.Socio;
import br.com.prefeitura.diadema.model.PmdLogs;
import br.com.prefeitura.diadema.util.ConverterDtoJson;
import br.com.prefeitura.diadema.util.ParseInscricao;
import br.com.prefeitura.diadema.ws.AbacoHomologacaoWs;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.RetornoWSRetornoWSItem;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.SdtDadosCadastraisEmpresa;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.WsEnviarDadosEmpresa;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.WsEnviarDadosEmpresaExecute;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.WsEnviarDadosEmpresaExecuteResponse;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.WsEnviarDadosEmpresaSoapPort;

//BANCO DE DADOS (BASE DE TESTE) SIAP ETL
@Service
public class InscricaoService {

	@Autowired
	public InscricaoService(){; 
	}

	public static void main(String args[]){
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
		inscricaoMunicipal.setEmpresacodigoLogradouroAgata(5);
		inscricaoMunicipal.setEmpresaCodigoBairro(6);
		inscricaoMunicipal.setEmpresaNumeroLogradouro("100");
		inscricaoMunicipal.setEmpresaCep("09910170");
		inscricaoMunicipal.setEmpresaComplementoLogradouro("casa");
		
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
		
		
		Socio socio2 = new Socio();		
		socio2.setCpf("05398178806");
		socio2.setNome("socio");
		socio2.setEndereco("TESTE");
		socio2.setBairro("TESTE");
		
		List<Socio> socios = new ArrayList<Socio>();
		socios.add(socio2);
		inscricaoMunicipal.setSocios(socios);
		
		
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
		
		
 		/*List<EnquadramentoISSCodigoServico> enquadramentoISSCodigoServico = new ArrayList<EnquadramentoISSCodigoServico>();
		enquadramentoISS.setEnquadramentoISSCodigoServico(enquadramentoISSCodigoServico );
		
		//	inscricaoMunicipal.setBancaDeJornal(40f);
		
		inscricaoMunicipal.setUltimoRegistroJucesp("SPM999999");
		
		inscricaoMunicipal.setNumeroFuncionario(1);
		inscricaoMunicipal.setNumeroProfissionais(1);
		inscricaoMunicipal.setStatusEmpresa("NOVA");
		inscricaoMunicipal.setDadosContadorTelefone("9999");
		inscricaoMunicipal.setQuantidadePublicidadeLuminoso(0);
 		inscricaoMunicipal.setQuantidadePublicidadeNaoLuminioso(0);
 		
 		inscricaoMunicipal.setQuantidadePublicidadeTerceiro(0);
 		inscricaoMunicipal.setNumeroDeJogos(0);
 		inscricaoMunicipal.setNumeroDeEletronicos(0);
 		inscricaoMunicipal.setNumeroInstrumentosMusicais(0);
 		
 	
 		inscricaoMunicipal.setEmpresaNumeroLogradouro("numero");
 		inscricaoMunicipal.setEmpresaCodigoBairro(5);
 		inscricaoMunicipal.setEmpresacodigoLogradouroAgata(1030);
 		inscricaoMunicipal.setEmpresaCep("09921250");
 		
 		
 		
 		inscricaoMunicipal.setInscricaoEstadual("99999");
 		inscricaoMunicipal.setObjetoSocial("objeto social");
 		
 		inscricaoMunicipal.setEmpresaLogradouro("99999");
 		inscricaoMunicipal.setEmpresaComplementoLogradouro("Complemento");
 		inscricaoMunicipal.setEmpresaBairro("Bairro");
 		inscricaoMunicipal.setEmpresaCodigoBairro(9999);
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
 		inscricaoMunicipal.setEmpresaMunicipio("2");
 		inscricaoMunicipal.setEmpresaTelefone("11-40970101");
 		inscricaoMunicipal.setTipoAlteracaoEndereco(0);
 		
 		inscricaoMunicipal.setEmpresacodigoLogradouroAgata(5);
 		inscricaoMunicipal.setEmpresaCodigoBairro(6);
 		
 		Publicidades p = new Publicidades();
 		p.setId(0L);
 		p.setM2(5.0);
 		p.setQuantidade(5);
 		p.setTipo(1);
 		
 		List<Publicidades> publicidades = new ArrayList<Publicidades>();
 		publicidades.add(p);
		inscricaoMunicipal.setPublicidades(publicidades);
 		
 		
 		//ENQUANTRAMENTO aTIVIDADE 
 		EnquadramentoAtividadeEconomica enquadramentoAtividadeEconomica = new EnquadramentoAtividadeEconomica();
 		enquadramentoAtividadeEconomica.setId(0L);
 		enquadramentoAtividadeEconomica.setClassificacaoAtividade("Industria");
 		enquadramentoAtividadeEconomica.setDataAlteracao(new Date());
 		enquadramentoAtividadeEconomica.setObservacao("Observação para teste");
 	
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
 		inscricaoMunicipal.setEnquadramentoAtividadeEconomica(enquadramentoAtividadeEconomica);
 		
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
		*/
		
		
		//----------------------
		//CONTATODR
		//----------------------
		//----------------------
		//----------------------
		/*inscricaoMunicipal.setDadosContadorAtividadeEconomica("789798");
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
		inscricaoMunicipal.setDataDeAlteracao(new Date());*/
		//BANCO DE DADOS (BASE DE TESTE) SIAP ETL
		
		//----------------------
		//Representante
		//----------------------
		//----------------------
		//----------------------
		
	/*	inscricaoMunicipal.setRepresentanteLegalBairro("Bairro");
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
		
		*/
		ParseInscricao parse = new ParseInscricao();
		
		
		/* DtoInscricao i = new DtoInscricao();
	        i.setEnquadramentoAtividadeEconomica(inscricaoMunicipal.getEnquadramentoAtividadeEconomica());
	        i.setInscricaoMunicipal(inscricaoMunicipal);
	        i.setEnquadramentoISS(inscricaoMunicipal.getEnquadramentoISS());
	      */
	        ConverterDtoJson.mostarJson(inscricaoMunicipal);
		
		
		WsEnviarDadosEmpresa wsEnviarDadosEmpresa = new WsEnviarDadosEmpresa();
        WsEnviarDadosEmpresaSoapPort port = wsEnviarDadosEmpresa.getWsEnviarDadosEmpresaSoapPort();
        
        WsEnviarDadosEmpresaExecute execute = new WsEnviarDadosEmpresaExecute();
        SdtDadosCadastraisEmpresa params = new SdtDadosCadastraisEmpresa();
        params = parse.parseAgata(inscricaoMunicipal);
        execute.setSdtDadoscadastraisempresas(params);
        
        
        
        
        
    	// converte objetos Java para JSON e retorna JSON como String
    	//String json = gson.toJson(inscricaoMunicipal);
//System.out.println(json);
        try {
            WsEnviarDadosEmpresaExecuteResponse response = port.execute(execute);
            
            if (response != null) {
                if (response.getRetornows() != null) {
                    List<RetornoWSRetornoWSItem> respostas = response.getRetornows().getRetornoWSRetornoWSItem();
                    for (RetornoWSRetornoWSItem item : respostas) {
                        if (item.getIdRetorno() != 0) {
                        	
                            throw new Exception("Não foi possível enviar dados ao àgata: " + item.getDesRetorno());
                        } else {
                        	System.out.println("Finalizado NUMERO DA INSCRICAO " + item.getDesRetorno().split(":")[1].trim());
                            break;
                        }
                    }
                }
            } else {
            	
                throw new Exception("Não foi possível enviar dados ao àgata: Não houve resposta para a chamada do Webservice");
            }
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        	//throw new Exception("Não é foi possivel enviar dados para o agata: " + e.toString());
        }
	}
	
	public Long consultarCmcPorCnpj( Long cnpj) throws Exception{	
		AbacoHomologacaoWs ws = new AbacoHomologacaoWs();
		return ws.retornarNumeroCMC(cnpj);			
	}
	
	
	public boolean consultarInscricao(String tipo, Long numeroInscricao) throws Exception{	
		AbacoHomologacaoWs ws = new AbacoHomologacaoWs();
		tipo = tipo.toLowerCase();
		if(tipo.equals("cnpj")){
			return ws.existeCnpj(numeroInscricao);			
		}
		
		if(tipo.equals("mobiliario")){
			return  ws.existeInscricaoMobiliario(numeroInscricao);
		}
		
		if(tipo.equals("imobiliario")){
			return  ws.existeInscricaoImobiliario(numeroInscricao);
		}
		
		//Quando nenhuma opção for selecionado o dados retoranr true
		return false;
	}
	
	public boolean buscarCodigoMunicipio(String tipo, Long numeroInscricao) throws Exception{
		
		//Quando nenhuma opção for selecionado o dados retoranr true
		return false;
	}
	
	
	public boolean existeInscricaoMobiliario(String tipo, Long numeroInscricao) throws Exception{
		
		AbacoHomologacaoWs ws = new AbacoHomologacaoWs();
		tipo = tipo.toLowerCase();
		if(tipo.equals("cnpj")){
			return ws.existeCnpj(numeroInscricao);			
		}
		
		if(tipo.equals("mobiliario")){
			return  ws.existeInscricaoMobiliario(numeroInscricao);
		}
		
		if(tipo.equals("imobiliario")){
			return  ws.existeInscricaoImobiliario(numeroInscricao);
		}
		
		//Quando nenhuma opção for selecionado o dados retoranr true
		return false;
	}
	
	
	


	public Long enviarDadosAgata(InscricaoMunicipal inscricaoMunicipal) throws Exception {
		ParseInscricao parse = new ParseInscricao();
		
		WsEnviarDadosEmpresa wsEnviarDadosEmpresa = new WsEnviarDadosEmpresa();
        WsEnviarDadosEmpresaSoapPort port = wsEnviarDadosEmpresa.getWsEnviarDadosEmpresaSoapPort();
        
        WsEnviarDadosEmpresaExecute execute = new WsEnviarDadosEmpresaExecute();
        SdtDadosCadastraisEmpresa params = new SdtDadosCadastraisEmpresa();
       // params.setSituacaoCadastral("ALTERACAO"); /// codigo provisorio para realiza o cadastro do sistema
        params = parse.parseAgata(inscricaoMunicipal);
        execute.setSdtDadoscadastraisempresas(params);
        
        //String valor = ConverterDtoJson.json(execute);
       //System.out.println(valor);

        try {
            WsEnviarDadosEmpresaExecuteResponse response = port.execute(execute);
            
            if (response != null) {
                if (response.getRetornows() != null) {
                    List<RetornoWSRetornoWSItem> respostas = response.getRetornows().getRetornoWSRetornoWSItem();
                    for (RetornoWSRetornoWSItem item : respostas) {
                        if (item.getIdRetorno() != 0) {
                            throw new Exception("Não foi possível enviar dados ao àgata: " + item.getDesRetorno());
                        } else {
                        	return Long.parseLong(item.getDesRetorno().split(":")[1].trim());
                            //break;
                        }
                    }
                }
            } else {
                throw new Exception("Não foi possível enviar dados ao àgata: Não houve resposta para a chamada do Webservice");
            }
        } catch (Exception e) {
            throw new Exception("Não é foi possivel enviar dados para o agata: " + e.toString());
        }
        return -1L;
		
		//return sInscricao;
	}

}
