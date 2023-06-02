package br.com.prefeitura.diadema.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.dto.Cnae;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomica;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomicaComplemento;
import br.com.prefeitura.diadema.dto.EnquadramentoISS;
import br.com.prefeitura.diadema.dto.InscricaoMunicipal;
import br.com.prefeitura.diadema.dto.Socio;
import br.com.prefeitura.diadema.util.ParseInscricao;
import br.com.prefeitura.diadema.ws.AbacoHomologacaoWs;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.RetornoWSRetornoWSItem;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.SdtDadosCadastraisEmpresa;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.WsEnviarDadosEmpresa;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.WsEnviarDadosEmpresaExecute;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.WsEnviarDadosEmpresaExecuteResponse;
import br.com.prefeitura.diadema.ws.abaco.hmg.enviar.WsEnviarDadosEmpresaSoapPort;


@Service
public class InscricaoService {

	


	@Autowired
	public InscricaoService(){; 
	}
	
	
	public static void main(String args[]){
		InscricaoMunicipal inscricaoMunicipal = new InscricaoMunicipal();
		inscricaoMunicipal.setBancaDeJornal(40f);
		inscricaoMunicipal.setCodigoNaturezaJuridica(1);
		inscricaoMunicipal.setNumeroFuncionario(1);
		inscricaoMunicipal.setNumeroProfissionais(1);
		inscricaoMunicipal.setStatusEmpresa("NOVA");
		inscricaoMunicipal.setDadosContadorTelefone("32379324859");
		inscricaoMunicipal.setEmpresacodigoLogradouroAgata(1);
		inscricaoMunicipal.setEmpresaCodigoBairro(5);
		inscricaoMunicipal.setQuantidadePublicidadeLuminoso(0);
 		inscricaoMunicipal.setQuantidadePublicidadeNaoLuminioso(0);
 		inscricaoMunicipal.setQuantidadePublicidadeTerceiro(0);
 		inscricaoMunicipal.setNumeroDeJogos(0);
 		inscricaoMunicipal.setNumeroDeEletronicos(0);
 		inscricaoMunicipal.setNumeroInstrumentosMusicais(0);
 		inscricaoMunicipal.setCnpj("70342476000196");
 		inscricaoMunicipal.setRazaoSocial("Anderson Teste");
 		inscricaoMunicipal.setDataAbertura(new Date());
 		inscricaoMunicipal.setEmpresaNumeroLogradouro("numero");
 		//inscricaoMunicipal.setEmpresaCodigoBairro(1500);
 		inscricaoMunicipal.setEmpresacodigoLogradouroAgata(3100);
 		inscricaoMunicipal.setEmpresaCep("09921250");
 		inscricaoMunicipal.setNumeroInscricaoMunicipal(630L);
 		
 		
 		
 		//ENQUANTRAMENTO aTIVIDADE 
 		EnquadramentoAtividadeEconomica enquadramentoAtividadeEconomica = new EnquadramentoAtividadeEconomica();
 		enquadramentoAtividadeEconomica.setClassificacaoAtividade("Industria");
 		enquadramentoAtividadeEconomica.setDataAlteracao(new Date());
 		enquadramentoAtividadeEconomica.setObservacao("Observação para teste");
 		
 		List<EnquadramentoAtividadeEconomicaComplemento> enquadramentoAtividadeEconomicaComplementos = new ArrayList<EnquadramentoAtividadeEconomicaComplemento>();
		enquadramentoAtividadeEconomica.setEnquadramentoAtividadeEconomicaComplementos(enquadramentoAtividadeEconomicaComplementos );
 		inscricaoMunicipal.setEnquadramentoAtividadeEconomica(enquadramentoAtividadeEconomica);
 		
 		
 		
 		//Enquatramento de ISS
 		EnquadramentoISS enquadramentoISS = new EnquadramentoISS();
 		enquadramentoISS.setTipoISSQN("I");
		inscricaoMunicipal.setEnquadramentoISS(enquadramentoISS );
		
		
		
		//CNAE
		List<Cnae> cnaes = new ArrayList<Cnae>();
		Cnae cnae = new Cnae();
		cnae.setCodigo("123456");
		cnae.setNome("Nome do cnae");
		cnae.setPrincipal(true);
		
		Cnae cnae2 = new Cnae();
		cnae2.setCodigo("666666");
		cnae2.setNome("Nome do cnae 2");
		cnae2.setPrincipal(false);
		
		cnaes.add(cnae );
		cnaes.add(cnae2 );
		inscricaoMunicipal.setCnaes(cnaes);
		//----
		
		//Socios
		Socio socio1 = new Socio();
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
		
		List<Socio> socios = new ArrayList<Socio>();
		socios.add(socio1);
		inscricaoMunicipal.setSocios(socios);
		
		
		//----------------------
		//Representante
		//----------------------
		//----------------------
		//----------------------
		
		
		
		ParseInscricao parse = new ParseInscricao();
		
		WsEnviarDadosEmpresa wsEnviarDadosEmpresa = new WsEnviarDadosEmpresa();
        WsEnviarDadosEmpresaSoapPort port = wsEnviarDadosEmpresa.getWsEnviarDadosEmpresaSoapPort();
        
        WsEnviarDadosEmpresaExecute execute = new WsEnviarDadosEmpresaExecute();
        SdtDadosCadastraisEmpresa params = new SdtDadosCadastraisEmpresa();
        params = parse.parseAgata(inscricaoMunicipal);
        execute.setSdtDadoscadastraisempresas(params);

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
        params = parse.parseAgata(inscricaoMunicipal);
        execute.setSdtDadoscadastraisempresas(params);

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
