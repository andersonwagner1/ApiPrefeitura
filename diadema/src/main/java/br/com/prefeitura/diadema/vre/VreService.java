package br.com.prefeitura.diadema.vre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.Cnae;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomica;
import br.com.prefeitura.diadema.dto.EnquadramentoISS;
import br.com.prefeitura.diadema.dto.InscricaoMunicipal;
import br.com.prefeitura.diadema.dto.Publicidades;
import br.com.prefeitura.diadema.enumerador.EnumVreSituacao;
import br.com.prefeitura.diadema.model.PmdVreSolicitacao;
import br.com.prefeitura.diadema.repository.VreSolicitacaoRespository;
import br.com.prefeitura.diadema.vre.dto.Contador;
import br.com.prefeitura.diadema.vre.dto.DadosEmpresa;
import br.com.prefeitura.diadema.vre.dto.DadosEstabelecimento;
import br.com.prefeitura.diadema.vre.dto.EmpresaDTO;
import br.com.prefeitura.diadema.vre.dto.EnderecoDTO;
import br.com.prefeitura.diadema.vre.dto.ResultadoDto;
import br.com.prefeitura.diadema.ws.EgataInscricaoWS;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresa;
import br.com.prefeitura.diadema.ws.egata.SdtEmpresasporCnpjSdtEmpresasporCnpjItem;
import br.com.prefeitura.diadema.ws.egata.WsConsultarExistenciaDaEmpresaExecuteResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
@Service
public class VreService {
	private VreSolicitacaoRespository dao;
	private EgataInscricaoWS egataWs;
	
	final String USUARIO = "diadema.im.redesim";
	final String SENHA = "161.redesim";
	
	@Autowired
    public VreService(EgataInscricaoWS egataWs, VreSolicitacaoRespository dao) {
        this.dao = dao;     
        this.egataWs = egataWs;
    }
	
	
	public String listarProtocoloEmpresa(Date currentDate) throws IOException{
		String token = "abc";
		token = getToken(USUARIO, SENHA);
        // Converte a data para o formato YYYY-MM-DD
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentDate);
        //System.out.println("Data atual formatada: " + formattedDate);

        // Calcula a data 3 dias antes
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_YEAR, -3);
        Date dateBefore7Days = calendar.getTime();
        String formattedDateBefore7Days = dateFormat.format(dateBefore7Days);
        //System.out.println("Data 5 dias antes: " + formattedDateBefore7Days);
		
        String dataInicial = formattedDateBefore7Days;
        String  dataFinal = formattedDate;
        
        String resultado[] = listarProtocolosValidosSemRepeticao(token, dataInicial, dataFinal);
        
        ObjectMapper mapper = new ObjectMapper();

        // Cria um ArrayNode e adiciona os elementos do array de strings
        ArrayNode arrayNode = mapper.createArrayNode();
        for (String s : resultado) {
            arrayNode.add(s);
        }

        // Cria um ObjectNode e coloca o ArrayNode dentro dele
        ObjectNode objectNode = mapper.createObjectNode();
        objectNode.set("protocolos", arrayNode);

        // Converte o ObjectNode para string e imprime
        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectNode);
      //  System.out.println(jsonString);
        
       
		
		return jsonString;
	}
	
	
	/**
	 * consulta dados da empresa enviado para jucesp personalisado para o softplan realizar os ajustes no sistema solar
	 * @param protocolo
	 * @return
	 * @throws IOException
	 */
	public EmpresaDTO consultarDadosEmpresaPorCnpj(String protocolo) throws IOException {
		ResultadoDto resultado = consultarEmpresaPorProtocolo(protocolo);
		
		EmpresaDTO empresa = new EmpresaDTO();
		List<String> cnpjs = new ArrayList<String>();
		
		if(resultado.getDadosEmpresa() == null){
			empresa.setResultado("Empresa não encontrado");
			return empresa;
		}
		
		//Necessario adicionar os campos que vem da abaco
		
		
		cnpjs.add(resultado.getDadosEmpresa().getCnpj());
		empresa.setCnpj(cnpjs);
		empresa.setNomeEmpresa(resultado.getDadosEmpresa().getNomeEmpresarial());
		
		EnderecoDTO endereco = new EnderecoDTO();
		endereco.setDeBairro(resultado.getDadosEstabelecimento().getEnderecos().get(0).getBairro());
		endereco.setCdMunicipio(resultado.getDadosEstabelecimento().getEnderecos().get(0).getMunicipio().getCdMunicipioRfb());
		endereco.setNuCep(resultado.getDadosEstabelecimento().getEnderecos().get(0).getCep());
		
		if(resultado.getDadosEstabelecimento().getEnderecos().get(0).getComplementos().size() > 0){
			endereco.setDeComplemento(resultado.getDadosEstabelecimento().getEnderecos().get(0).getComplementos().get(0));
		}
		endereco.setNmLogradouro(resultado.getDadosEstabelecimento().getEnderecos().get(0).getTipoLogradouro().getDsTipoLogradouro() + " " + resultado.getDadosEstabelecimento().getEnderecos().get(0).getLogradouro());
		endereco.setNuNumero( resultado.getDadosEstabelecimento().getEnderecos().get(0).getNumero());
		empresa.setEndereco(endereco );
		
		
		return empresa;
	}
	
	
	private void realizarSobreques(String protocolo) throws IOException{
		ResultadoDto returon = consultarEmpresaPorProtocolo(protocolo);
		SdtDadosCadastraisEmpresa dadosEmpresa = realizarConsultaEmpresaPorCnpj(returon.getDadosEmpresa().getCnpj());
		
		
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
		
		
		
		
		
		
		
		
		
		
		/*
		
		Contador contador = new Contador();
		contador.setCpfCnpj(dadosEmpresa.getCNPJContador());
		contador.setNome(dadosEmpresa.getNomeContador());
		returon.setContador(contador);
		
		
		
		DadosEmpresa dadosEmpresa5 = new DadosEmpresa();
		//dadosEmpresa5.setCapitalSocial(dadosEmpresa.ge);
		dadosEmpresa5.setDataCriacao(dadosEmpresa.getDataCadastroPrefeitura());
		dadosEmpresa5.setDataInicioOperacao(dadosEmpresa.getDataAberturaEmpresa());
		
		dadosEmpresa5.setEnquadramento(dadosEmpresa.get);
		dadosEmpresa5.setObjetoSocial(objetoSocial);
		
		
		
		returon.setDadosEmpresa(dadosEmpresa5 );
		returon.setDadosEstabelecimento(dadosEstabelecimento);
		returon.setRepresentanteIM(representanteIM);
		returon.setSituacoesInscricao(situacoesInscricao);
		returon.setSocios(socios);
		
		
		*/
		
	}
	
	

	private SdtDadosCadastraisEmpresa realizarConsultaEmpresaPorCnpj(String cnpj){
		 try {
				SdtEmpresasporCnpjSdtEmpresasporCnpjItem dadosEmpresaAbaco = egataWs.consultarExistemEmpresaPorCnpj(Long.parseLong(cnpj));
				WsConsultarExistenciaDaEmpresaExecuteResponse restornoInforamcaoEmpresa = egataWs.consultaInformacaoDaInscricaoMobiliario(dadosEmpresaAbaco.getInscricaoMunicipal());
				
				return restornoInforamcaoEmpresa.getSdtDadoscadastraisempresas();
				
				
				
				
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 return null;
	}
	
	
	private int extractHttpStatusCode(String errorMessage) {
		Pattern pattern = Pattern.compile("HTTP response code: (\\d+)");
		Matcher matcher = pattern.matcher(errorMessage);

		if (matcher.find()) {
			String statusCodeStr = matcher.group(1);
			return Integer.parseInt(statusCodeStr);
		}

		// Se não encontrar o código de status HTTP, retorne -1 ou algum outro
		// valor padrão
		return -1;
	}
	
	/**
	 * Desabilitado o ponto de salvar para não prejudicar a solar bpms
	 * @param protoclo
	 * @return
	 * @throws IOException
	 */
	private ResultadoDto consultarEmpresaPorProtocolo(String protoclo) throws IOException{
		String token = "abc";
		token = getToken(USUARIO, SENHA);
		String resposta  = consultarEmpresaPorProtocolo(token, protoclo);
		
		Gson gson = new Gson();
		ResultadoDto dataEmpresaResponse = gson.fromJson(resposta, ResultadoDto.class);
		dataEmpresaResponse.setResultado("Sucesso");
		return dataEmpresaResponse;
	}
	
	
	
	/**
	 * Realizar o parse das informação da JUCESP para o sistema da abaco
	 * @param protocolo
	 * @return
	 * @throws IOException
	 */
	public ResultadoDto consultarEmpresaPorProtocoloNaJucespEAgata(String protocolo) throws IOException {
		
		
		
		ResultadoDto dadosJucesp = consultarEmpresaPorProtocolo(protocolo);
		if(dadosJucesp.getSolicitacao() == null){
			
			
			
			return dadosJucesp;
		}
		SdtDadosCadastraisEmpresa dadosEmpresaAbaco = realizarConsultaEmpresaPorCnpj(dadosJucesp.getDadosEmpresa().getCnpj());
		
		
		
		if(dadosEmpresaAbaco != null){
			if(!dadosEmpresaAbaco.getNumeroCNPJ().equals("")){
				DadosEmpresa dadosEmpresa = dadosJucesp.getDadosEmpresa();
				dadosEmpresa.setObjetoSocial(dadosEmpresaAbaco.getComplementoAtividadeEconomica());
				dadosEmpresa.setDataCriacao(dadosEmpresaAbaco.getDataCadastroPrefeitura());
				dadosEmpresa.setDataInicioOperacao(dadosEmpresaAbaco.getDataAberturaEmpresa());
				//dadosEmpresa.setCapitalSocial(dadosEmpresaAbaco.getValorCapitalSocial());
				
				
				Contador dadosContador = dadosJucesp.getContador();
				if(dadosContador == null){
					dadosContador = new Contador();
				}
				
				dadosContador.setCpfCnpj(dadosEmpresaAbaco.getCNPJContador());
				dadosContador.setNome(dadosEmpresaAbaco.getNomeContador());
				dadosJucesp.setContador(dadosContador);
				
				
				DadosEstabelecimento dadosEstabelicimento = dadosJucesp.getDadosEstabelecimento();
				if(dadosEstabelicimento == null){
					dadosEstabelicimento = new DadosEstabelecimento();
				}
				
				
				/*
				dadosEstabelicimento.setAreaEstabelecimento(dadosEmpresaAbaco.getMediaAreaOcupada());
				dadosEstabelicimento.setAreaImovel(dadosEmpresaAbaco.get);
				dadosEstabelicimento.setAreaPublicidades(areaPublicidades);
				dadosEstabelicimento.setAreaTerreno(areaTerreno);
				dadosEstabelicimento.setAtividadesAuxiliares(atividadesAuxiliares);
				dadosEstabelicimento.setAtividadesEconomicas(atividadesEconomicas);
				dadosEstabelicimento.setCumprimentoTestada(cumprimentoTestada);
				dadosEstabelicimento.setEmail(email);
				dadosEstabelicimento.setEnderecos(enderecos);
				dadosEstabelicimento.setEnderecosCorrespondencia(enderecosCorrespondencia);
				dadosEstabelicimento.setFax(fax);
				dadosEstabelicimento.setFormasAtuacao(formasAtuacao);
				dadosEstabelicimento.setHorariosFuncionamento(horariosFuncionamento);
				dadosEstabelicimento.setInscricoes(inscricoes);
				dadosEstabelicimento.setNumeroFuncionarios(numeroFuncionarios);
				dadosEstabelicimento.setTelefone(telefone);
				dadosEstabelicimento.setTipodeUnidade(tipodeUnidade);
				*/
				
				
				
				
			}
		}
		
		
		
		return dadosJucesp;
		
		
		
		/*
		
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
		inscricaoMunicipal.setEnquadramentoISS(enquadramentoISS);*/
		
		/*
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
		*/
		/*
		
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
		*/
		
		
		
	}
	

	
	public String listarProtocoloEmpresa(String dataInicial, String dataFinal) throws IOException {
		String token = "abc";
		token = getToken(USUARIO, SENHA);	
		String[] resultado = listarProtocolosValidosSemRepeticao(token, dataInicial, dataFinal);
		
		 ObjectMapper mapper = new ObjectMapper();

	        // Cria um ArrayNode e adiciona os elementos do array de strings
	        ArrayNode arrayNode = mapper.createArrayNode();
	        for (String s : resultado) {
	            arrayNode.add(s);
	        }

	        // Cria um ObjectNode e coloca o ArrayNode dentro dele
	        ObjectNode objectNode = mapper.createObjectNode();
	        objectNode.set("protocolos", arrayNode);

	        // Converte o ObjectNode para string e imprime
	        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectNode);
	      //  System.out.println(jsonString);
	        
	       
			
			return jsonString;
	
	}
	
	 private String[] removerProtoocolosQueNaoSejaSPMeSPP(String[] inputArray) {
	        return Arrays.stream(inputArray)
	                     .filter(s -> s.startsWith("SPM") || s.startsWith("SPP"))
	                     .toArray(String[]::new);
	    }
	

	
	
	private String[] removerInscricaoesJaVerificadas(String[] inscricoes){
		List<PmdVreSolicitacao> listaProtocolosJaPesquisado = dao.listarProtocolosDeUmPeriodoCarga();
		
		Set<String> inscricoesCadastradasSet = new HashSet<>();
        for (PmdVreSolicitacao solicitacao : listaProtocolosJaPesquisado) {
            inscricoesCadastradasSet.add(solicitacao.getNrProcessoBoleto());
        }

        // Filtrar a lista de inscrições
        List<String> inscricoesFiltradas = new ArrayList<>();
        for (String inscricao : inscricoes) {
            if (!inscricoesCadastradasSet.contains(inscricao)) {
                inscricoesFiltradas.add(inscricao);
            }
        }

        // Converter de volta para um array, se necessário
        String[] inscricoesFinal = inscricoesFiltradas.toArray(new String[0]);
        return inscricoesFinal;
	}
	
	private String[] verificaSituacaoNovasInscricao(String token, String[] inscricoes)  throws IOException{		
		 List<String> inscricoesList = new ArrayList<>(Arrays.asList(inscricoes));	
		System.out.println("Total " + inscricoesList.size());
		 //Verificar protocolo por protocolo para ver se existe um protocolo com o codigo
		 for (String inscricao : inscricoes){
			 
			 //Consulta o protocolo
			String resposta  = consultarEmpresaPorProtocolo(token, inscricao);	
			//System.out.println(resposta);
			Gson gson = new Gson();
			//System.out.println(inscricao);
			ResultadoDto dataEmpresaResponse = gson.fromJson(resposta, ResultadoDto.class);
			dataEmpresaResponse.setResultado("Sucesso");
			//--------------------------
			
			PmdVreSolicitacao v = new PmdVreSolicitacao();
			v.setDsDadosJucesp(resposta);
			v.setDsSituacao(EnumVreSituacao.INICIADO);
			v.setDtCarga(new Date());
			v.setNrProcessoBoleto(inscricao);
			
			
			boolean continua = true; // variavel auxiliar para ajudar se continua ou não
			
			
			//------------------ Verifica se possui codiog 209 [mudança de municipio]  ------------------------------------
			boolean hasSpecificCodigo = false;
			List<String> codigosEspecificos = Arrays.asList("101", "102", "209", "210", "211", "220", "225", "244");

			if(dataEmpresaResponse.getEventos() != null){
			    hasSpecificCodigo = dataEmpresaResponse.getEventos().stream()
			        .anyMatch(event -> codigosEspecificos.contains(event.getCodigo()));
			    
			    // Se o protocolo tiver um dos codigos especificos no evento, realizar as operações
			    if(!hasSpecificCodigo){
			        v.setDsSituacao(EnumVreSituacao.NAO_ENVIAR_SOLAR);
			        inscricoesList.removeIf(valor -> valor.equals(inscricao)); 
			        v.setMotivo(dataEmpresaResponse.getEventos().get(0).getDescricao()); // coloca a descrição do motivo de não pode enviar para o SOLAR
			        continua = false;
			        //System.out.println(dataEmpresaResponse.getEventos().get(0).getCodigo() + " Codigo invalido");
			    }/*else{
			    	System.out.println(dataEmpresaResponse.getEventos().get(0).getCodigo()  + "Codigo valido");
			    }*/
			}
			
			// -------------------- Verifica se possui codiog 209 [mudança de municipio]  ---------------------------------------------
			// verifica se o municipio e de Diadema se houve mudança de municipio
			
			if(continua){				
				if(dataEmpresaResponse.getEventos() != null){
					//6377 -- é codigo de Diadema
					boolean temDiadema = dataEmpresaResponse.getDadosEstabelecimento().getEnderecos().stream().anyMatch(endereco -> "6377".equalsIgnoreCase(endereco.getMunicipio().getCdMunicipioRfb()));
					
					
					if(!temDiadema){
						v.setDsSituacao(EnumVreSituacao.NAO_ENVIAR_SOLAR);
						inscricoesList.removeIf(valor -> valor.equals(inscricao)); 
						v.setMotivo("Alteração de Municipio");
						continua = false;
						//System.out.println(dataEmpresaResponse.getDadosEstabelecimento().getEnderecos().get(0).getMunicipio().getCdMunicipioRfb() + "Municipio invalido");
					}//else{
						//System.out.println(dataEmpresaResponse.getDadosEstabelecimento().getEnderecos().get(0).getMunicipio().getCdMunicipioRfb() + "Municipio valido");
					//}
				}
			}
			
			
			
	       //------------------ Verifica se possui codiog 209 [mudança de municipio]  ------------------------------------
			/*boolean hasCodigo209 = false;
			if(dataEmpresaResponse.getEventos() != null){
				 hasCodigo209 = dataEmpresaResponse.getEventos().stream().anyMatch(event -> "209".equals(event.getCodigo()));
				 
				 //Se o protocolo tiver o codigo 209 no evento, remover
				 //o codigo 209 é codigo de mundaça de municipio
				 //Não é possivel prever se o municipio veio para diadema.
				 if(hasCodigo209){
					 v.setDsSituacao(EnumVreSituacao.NAO_ENVIAR_SOLAR);
					 inscricoesList.removeIf(valor -> valor.equals(inscricao)); 
					 v.setMotivo("Alteração de Municipio");
				 }
			}*/
			
			//------------------ Verifique se a empresa esta ativa na prefeitura de diadema  ------------------------------------
			
			//
			if(continua){ // caso a empresa tenha o codigo 209 apenas considera que a empresa não precisa realizar consulta no webservice
				try {
					SdtEmpresasporCnpjSdtEmpresasporCnpjItem empresaAgata = egataWs.consultarExistemEmpresaPorCnpj(Long.parseLong(dataEmpresaResponse.getDadosEmpresa().getCnpj()));
					
					if(empresaAgata != null){
						//String empresa = empresaAgata.getDescSituacaoCadastral();
						//Apenas empresa ATIVA E reativa e empresaAgata.getIdRetorno() == 0 é o 
						// qualquer outra mensagem remover o protocolos
						// empresaAgata.getIdRetorno() == 0 significa que existe empresa cadastrada no agata
						if(empresaAgata.getIdRetorno() == 0 && !(empresaAgata.getSituacaoCadastral() == 1 || empresaAgata.getSituacaoCadastral() == 3) ){
							v.setDsSituacao(EnumVreSituacao.NAO_ENVIAR_SOLAR);
							v.setMotivo(empresaAgata.getSituacaoCadastral() + " - " + empresaAgata.getDescSituacaoCadastral());							
						}
						
					}
					
					
				} catch (NumberFormatException e) {
					v.setDsSituacao(EnumVreSituacao.ERRO);
					v.setMotivo( e.getMessage());
				// 	TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					v.setDsSituacao(EnumVreSituacao.ERRO);
					v.setMotivo( e.getMessage());
				// 	TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			//------------------ Verifique apenas os codigo de evento valido  ------------------------------------
			dao.save(v); //salva as informaçõa
			//--------------------------------------------------------------------------------------------------------------
		}
		inscricoes = inscricoesList.toArray(new String[0]);
		System.out.println("Final " + inscricoesList.size());
		return inscricoes;
	}
	
	private String[] listarProtocolosJucesp(String token, String dataInicial,	String dataFinal)throws IOException {
		String url = "https://www.jucesp.sp.gov.br/inscricaomunicipal20.services/api/v1/listar-inscricoes-municipais";

		Map<String, Object> params = new HashMap<>();
		Map<String, String> intervalo = new HashMap<>();
		intervalo.put("dataInicial", dataInicial);
		intervalo.put("dataFinal", dataFinal);
		params.put("intervalo", intervalo);

		String requestBody = "{\"intervalo\": {\"dataInicial\": \""
				+ dataInicial + "\", \"dataFinal\": \"" + dataFinal + "\"}}";

		HttpURLConnection connection = (HttpURLConnection) new URL(url)
				.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setRequestProperty("Authorization", "Bearer " + token);
		connection.setDoOutput(true);

		connection.getOutputStream().write(requestBody.getBytes());

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				connection.getInputStream()));
		String response = reader.lines().collect(Collectors.joining());
		reader.close();

		// Parse the JSON response to get the list of inscricoes
		// You can use libraries like Gson or Jackson for parsing JSON, but for
		// simplicity, I'll use substring here
		String[] inscricoes = response
				.substring(response.indexOf("[") + 1, response.indexOf("]"))
				.replaceAll("\"", "").split(",");
		
		return inscricoes;
	}
	
	private String[] listarProtocolosValidosSemRepeticao(String token, String dataInicial,	String dataFinal) throws IOException {
		String[] inscricoes = listarProtocolosJucesp(token, dataInicial,dataFinal);
		inscricoes = removerProtoocolosQueNaoSejaSPMeSPP(inscricoes); //Mudar Apenas o SPP		
		inscricoes = removerInscricaoesJaVerificadas(inscricoes);
		//inscricoes = filtrarApenasProtocolosNosEventosValido(inscricoes); // 101 102 209 210 211 220 225 244 
		inscricoes = verificaSituacaoNovasInscricao(token, inscricoes);
		return inscricoes;
	}
	
	
	private String[] filtrarApenasProtocolosNosEventosValido(String[] inscricoes) {
		
		
		return null;
	}


	private String consultarEmpresaPorProtocolo(String token, String protocolo) throws IOException {
        String url = "https://www.jucesp.sp.gov.br/inscricaomunicipal20.services/api/v1/consultar-inscricao-municipal";

        String requestBody = "{\"protocolo\": \"" + protocolo + "\", \"cnpj\": \"\"}";

        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", "Bearer " + token);
        connection.setDoOutput(true);

        try (OutputStream os = connection.getOutputStream()) {
            os.write(requestBody.getBytes());
        }

        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String response = reader.lines().reduce("", (accumulator, line) -> accumulator + line);
                return response;
            }
        } else if (responseCode == 400) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()))) {
                String response = reader.lines().reduce("", (accumulator, line) -> accumulator + line);
                return response;
                // Aqui você pode analisar o JSON de resposta para verificar a mensagem de erro específica.
                //if (response.contains("Número de protocolo não localizado ou inválido")) {
                //    return "Registro não existe: Número de protocolo não localizado ou inválido";
                //}
            }
        } else {
            return "Erro ao consultar o serviço: " + responseCode;
        }      
    }
	
	

	/*private String consultarEmpresaPorProtocolo(String token, String protocolo) throws IOException {
		String url = "https://www.jucesp.sp.gov.br/inscricaomunicipal20.services/api/v1/consultar-inscricao-municipal";

		String requestBody = "{\"protocolo\": \"" + protocolo + "\", \"cnpj\": \"\"}";

		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setRequestProperty("Authorization", "Bearer " + token);
		connection.setDoOutput(true);

		connection.getOutputStream().write(requestBody.getBytes());

		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String response = reader.lines().reduce("",	(accumulator, line) -> accumulator + line);
		reader.close();

		return response;
	}*/

	/*private Solicitacao parseSolicitacao(JSONObject jsonObject)	 {
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setProtocoloRedesim(jsonObject.getString("protocoloRedesim"));
		solicitacao.setCnpj(jsonObject.getString("cnpj"));
		solicitacao.setNrInscricao(jsonObject.optString("nrInscricao")); // Trata
																			// o
																			// caso
																			// de
																			// ser
																			// opcional
		solicitacao.setFgBaixa(jsonObject.getInt("fgBaixa"));
		return solicitacao;
	}*/

	public String getToken(String userName, String password)throws IOException {
		String url = "https://www.jucesp.sp.gov.br/inscricaomunicipal20.services/api/v1/token-autenticacao";

		Map<String, Object> params = new HashMap<>();
		Map<String, Object> auth = new HashMap<>();
		auth.put("userName", userName);
		auth.put("password", password);
		auth.put("refreshToken", "string");
		auth.put("grantType", "webadmin-credential");
		params.put("autenticacao", auth);

		String requestBody = "{\"autenticacao\": {\"userName\": \""
				+ userName
				+ "\", \"password\": \""
				+ password
				+ "\", \"refreshToken\": \"string\", \"grantType\": \"webadmin-credential\"}}";

		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		connection.getOutputStream().write(requestBody.getBytes());

		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String response = reader.lines().collect(Collectors.joining());
		reader.close();

		// System.out.println(response);

		String token = response.substring(response.indexOf("tokenAcesso"));

		token = token.replace("tokenAcesso\":\"", "");
		String aspas = token.substring(token.indexOf("\""));
		token = token.replace(aspas, "");

		return token;
	}




	public static void main(String[] args) throws IOException {
		String userName = "diadema.im.redesim";
		String password = "161.redesim";
		String token = "abc";

		
		VreService s = new VreService(null, null);
		EmpresaDTO retorno =  s.consultarDadosEmpresaPorCnpj("SPP2430386949");
		
		
		
		
		int httpStatusCode = 0;

		/*int tentativas = 3; // o sistema ira fazer uma nova tentativas
		do {
			String situacao = rodarAplicaca(token);
			httpStatusCode = extractHttpStatusCode(situacao);
			tentativas--;

		} while ((httpStatusCode == 401 || httpStatusCode == 403)
				&& tentativas > 0);*/

	}


	


	



	

	

	

}
