package br.com.prefeitura.diadema.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import java.text.Normalizer;

import org.springframework.aop.ThrowsAdvice;

import br.com.prefeitura.diadema.dto.Cnae;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomica;
import br.com.prefeitura.diadema.dto.EnquadramentoAtividadeEconomicaComplemento;
import br.com.prefeitura.diadema.dto.EnquadramentoISS;
import br.com.prefeitura.diadema.dto.EnquadramentoISSCodigoServico;
import br.com.prefeitura.diadema.dto.InscricaoMunicipal;
import br.com.prefeitura.diadema.dto.Logradouro;
import br.com.prefeitura.diadema.dto.Publicidades;
import br.com.prefeitura.diadema.dto.Socio;
import br.com.prefeitura.diadema.dto.grafico.Converter;
import br.com.prefeitura.diadema.ws.egata.ArrayOfSdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens;
import br.com.prefeitura.diadema.ws.egata.ArrayOfSdtDadosCadastraisEmpresaCnaeItens;
import br.com.prefeitura.diadema.ws.egata.ArrayOfSdtDadosCadastraisEmpresaContratoItens;
import br.com.prefeitura.diadema.ws.egata.ArrayOfSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens;
import br.com.prefeitura.diadema.ws.egata.ArrayOfSdtDadosCadastraisEmpresaServicoItens;
import br.com.prefeitura.diadema.ws.egata.ArrayOfSdtDadosCadastraisEmpresaSocioItens;
import br.com.prefeitura.diadema.ws.egata.SdtBairroLogradourosSdtBairroLogradouroItem;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresa;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresa.CaracteristicasFuncionamento;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresa.Contratos;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresa.GrupoSubgrupoAtividades;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresa.RepresentantesLegais;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresa.Socios;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresaCnaeItens;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresaContratoItens;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresaRepresentanteLegalItens;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresaServicoItens;
import br.com.prefeitura.diadema.ws.egata.SdtDadosCadastraisEmpresaSocioItens;
import br.com.prefeitura.diadema.ws.egata.SdtLogradouroporBairroSdtLogradouroporBairroItem;
import br.com.prefeitura.diadema.ws.egata.WsEnderecamento;
import br.com.prefeitura.diadema.ws.egata.WsEnderecamentoExecute;
import br.com.prefeitura.diadema.ws.egata.WsEnderecamentoExecuteResponse;
import br.com.prefeitura.diadema.ws.egata.WsEnderecamentoSoapPort;
import br.com.prefeitura.diadema.ws.egata.WsbuscabairrologradouroExecuteResponse;


public class ParseInscricaoEgata {
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	 /**
     * Ajudar na nova alterações do codigo da empresa onde é uma lista, porém acredito que apenas um dos dados sejam reais então a sequencia
     * @param status
     * @param codigo
     * @return
     */
    private byte gerarCodigoEmpresa(String status, byte codigo){
    	status = status.toLowerCase();
    	 if(status.equalsIgnoreCase("nova")){
             return 0;
         }
    	 //Integer maisUm = 1;
    	 return 1;
    	// return  (short) (codigo.shortValue()+ maisUm.shortValue());
    }
    
    private  String removerAcentos(String texto) {
        // Normaliza a string para separar os caracteres diacríticos
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        // Remove os caracteres diacríticos usando expressão regular
        Pattern padrao = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return padrao.matcher(textoNormalizado).replaceAll("").replace("ç", "c").replace("Ç", "C");
    }
	
	
	  private String parseStringDate(Date date) {
	        if (date != null) {
	            return sdf.format(date);
	        } else {
	            return "0000-00-00";
	        }

	    }
	  
	  private int parseInt(String i) {
	        if (i != null) {
	            if (!i.isEmpty()) {
	                return Integer.parseInt(i);
	            }
	        }
	        return 0;
	    }

	    private long parseLong(String i) {
	        if (i != null) {
	            if (!i.isEmpty()) {
	                return Long.parseLong(i);
	            }
	        }
	        return 0;
	    }

	    private float parseFloat(Object o) {
	        if (o != null) {
	            try {
	                return Float.parseFloat(o.toString());
	            } catch (Exception e) {
	                return 0;
	            }
	        }
	        return 0;
	    }

	  
	  public String somenteNumeros(String src) {
	        if (src == null) {
	            return "";
	        }
	        StringBuilder builder = new StringBuilder();
	        for (int i = 0; i < src.length(); i++) {
	            char c = src.charAt(i);
	            if (Character.isDigit(c)) {
	                builder.append(c);
	            }
	        }
	        return builder.toString();
	    }
	  
	  private Long codigoBairro(String tipoEndereco, String uf) {
		  if(tipoEndereco == null){
			  return 0L;
		  }
		 try{
			 tipoEndereco = tipoEndereco.toUpperCase();
			 
			 tipoEndereco=  Normalizer.normalize(tipoEndereco, Normalizer.Form.NFD)
                     .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
			 
  		tipoEndereco= tipoEndereco.replace("RUA ", "");
  		tipoEndereco= tipoEndereco.replace("PRACA ", "");
  		tipoEndereco= tipoEndereco.replace("TRAVESSA ", "");
  		tipoEndereco= tipoEndereco.replace("AVENIDA ", "");
  		tipoEndereco= tipoEndereco.replace("PASSAGEM ", "");
  		tipoEndereco= tipoEndereco.replace("ESTRADA ", "");
  		tipoEndereco= tipoEndereco.replace("RODOVIA ", "");
  		tipoEndereco= tipoEndereco.replace("VIELA ", "");
  		tipoEndereco= tipoEndereco.replace("PASSAGEM DE PEDESTRES ", "");
  		tipoEndereco= tipoEndereco.replace("RUA PARTICULAR ", "");
  		tipoEndereco= tipoEndereco.replace("ALAMEDA ", "");
  		tipoEndereco= tipoEndereco.replace("LARGO ", "");
  		tipoEndereco= tipoEndereco.replace("AREA ", "");
  		tipoEndereco= tipoEndereco.replace("CORREDOR ", "");
		  
			WsEnderecamentoExecute param = new WsEnderecamentoExecute();
			//param.setMunidQ(7384);
			param.setUfsiglaQ(uf.toUpperCase());
			param.setTrechologradouro(tipoEndereco);
					
			WsEnderecamento wsl = new WsEnderecamento();
			WsEnderecamentoSoapPort port = wsl.getWsEnderecamentoSoapPort();
			
			 WsEnderecamentoExecuteResponse er = port.execute(param);
			

			
			
			
			for(SdtLogradouroporBairroSdtLogradouroporBairroItem item :  er.getSdtLogradouroporbairro().getSdtLogradouroporBairroSdtLogradouroporBairroItem()){
				return item.getBairroCodigo();
			}
				return 0L;
			}catch(Exception ex){
				return 0L;
			}
		}
	 
	
	public SdtDadosCadastraisEmpresa parseAgata(InscricaoMunicipal inscricaoMunicipal) {
		
		
		SdtDadosCadastraisEmpresa dadosCadastraisEmpresa = new SdtDadosCadastraisEmpresa();
		
		
		//------------------------------------------------------------------
	    // EMPPRESA
	    //-------------------------------------------------------------------    
		//INFORMAÇÃO DA EMPRESA
		
		if(inscricaoMunicipal.getCodigoNaturezaJuridica() == null){
			throw new NumberFormatException("Campo CodigoNaturezaJuridica esta nulo");
		}
		
		
		
		if(inscricaoMunicipal.getEnquadramentoISS() != null){
			dadosCadastraisEmpresa.setCodigoTipoISSQN(inscricaoMunicipal.getEnquadramentoISS().getTipoISSQN());
		}
		
		
		///campos obrigatorios no sistema que não é no dtm mas e no vre, então é colocado campo para arrumar
		if(inscricaoMunicipal.getInscricaoEstadual() == null){
			inscricaoMunicipal.setInscricaoEstadual("0");
		}
		
		if(inscricaoMunicipal.getNumeroInscricaoMunicipal() == null){
			inscricaoMunicipal.setNumeroInscricaoMunicipal(1L);
		}
		
		
		
		if(inscricaoMunicipal.getObjetoSocial() == null){
			inscricaoMunicipal.setObjetoSocial("");
		}
		
		
		
		
		
	    dadosCadastraisEmpresa.setCodigoNaturezaJuridica(inscricaoMunicipal.getCodigoNaturezaJuridica());
	    
	    //Caso seja uma empresa == 2, qualquer outra será SIM
	    if(inscricaoMunicipal.getCodigoNaturezaJuridica() == 2){
	    	inscricaoMunicipal.setEmpresaAutonoma((byte) 2 ); // NÃO PARA EMPRESA AUTONOMA
	    }else{
	    	inscricaoMunicipal.setEmpresaAutonoma((byte) 1); // SIM PARA EMPREAS AUTONOMA	    	
	    }
	    dadosCadastraisEmpresa.setEmpresaAutonomo(inscricaoMunicipal.getEmpresaAutonoma());
	    
	    dadosCadastraisEmpresa.setDataRegistroJunta(parseStringDate(new Date()));
	    dadosCadastraisEmpresa.setDataCadastroPrefeitura(parseStringDate(new Date()));
	    dadosCadastraisEmpresa.setDataUltimaAlteracaoJunta(parseStringDate(inscricaoMunicipal.getDataUltimaAlteracaoJunta()));
	    dadosCadastraisEmpresa.setNumeroCertificadoLicenciamentoIntegrado(inscricaoMunicipal.getNumeroProtocolo());
	    dadosCadastraisEmpresa.setNumeroCNPJ(inscricaoMunicipal.getCnpj());
        dadosCadastraisEmpresa.setRazaoSocial(inscricaoMunicipal.getRazaoSocial());
        dadosCadastraisEmpresa.setNomeFantasia(inscricaoMunicipal.getNomeFantasia());
        dadosCadastraisEmpresa.setDataAberturaEmpresa(parseStringDate(inscricaoMunicipal.getDataAbertura()));
        dadosCadastraisEmpresa.setInscricaoEstadual(inscricaoMunicipal.getInscricaoEstadual());
        dadosCadastraisEmpresa.setDescricaoClassificacaoAtividadeEconomica(inscricaoMunicipal.getObjetoSocial());

        dadosCadastraisEmpresa.setSituacaoCadastral(Byte.valueOf("5")); // situaão sempre ativa
       // dadosCadastraisEmpresa.setSituacaoCadastral(inscricaoMunicipal.getSituacaoCadastral().byteValue());
        if(inscricaoMunicipal.getNumeroFuncionario() == null){
			throw new NumberFormatException("Campo NumeroFuncionario esta nulo");
		}
        
        if(inscricaoMunicipal.getNumeroProfissionais() == null){
			throw new NumberFormatException("Campo NumeroProfissionais esta nulo");
		}
        
        dadosCadastraisEmpresa.setQtdeFuncionarios(Short.parseShort(inscricaoMunicipal.getNumeroFuncionario().toString()));
        dadosCadastraisEmpresa.setQtdeProfissionais(Short.parseShort(inscricaoMunicipal.getNumeroProfissionais().toString()));
        dadosCadastraisEmpresa.setMediaAreaOcupada(inscricaoMunicipal.getBancaDeJornal());
        dadosCadastraisEmpresa.setEmailEmpresa(inscricaoMunicipal.getEmpresaEmail());
        
        //SITUAÇÃO
        
        if(inscricaoMunicipal.getStatusEmpresa() == null){
			throw new NumberFormatException("Campo StatusEmpresa esta nulo");
		}
        
        if (inscricaoMunicipal.getStatusEmpresa().equalsIgnoreCase("nova")) {
	    	dadosCadastraisEmpresa.setFLGACAO("NOVA");
	    } else {
	    	dadosCadastraisEmpresa.setFLGACAO("ALTERACAO");
	    	  if(inscricaoMunicipal.getNumeroInscricaoMunicipal() == null){
	    		  throw new NumberFormatException("Caso a empresa for uma alteração não é possivel o valro da NumeroInscricaoMunicipal ser nulo");
	    	  }
	    	dadosCadastraisEmpresa.setInscricaoMunicipal(inscricaoMunicipal.getNumeroInscricaoMunicipal()); // se a emporesa for nova o campo é nulo
	    }

        //REGISTRO DA JUNTA
        dadosCadastraisEmpresa.setNumeroRegistroJunta(inscricaoMunicipal.getRegistroJuntaComercial());
        dadosCadastraisEmpresa.setDataRegistroJunta(parseStringDate(inscricaoMunicipal.getDataEmissaoNIREInicial()));
        dadosCadastraisEmpresa.setProcessoUltimaAlteracaoJunta(inscricaoMunicipal.getUltimoRegistroJucesp());
        dadosCadastraisEmpresa.setDataUltimaAlteracaoJunta(parseStringDate(inscricaoMunicipal.getDataUltimaAlteracaoJunta()));
        if(inscricaoMunicipal.getCapitalSocial() == null){
        	dadosCadastraisEmpresa.setValorCapitalSocial(0.0d);            	
        }else{
        	dadosCadastraisEmpresa.setValorCapitalSocial(inscricaoMunicipal.getCapitalSocial());
        }
        
        
        
        //CONTADOR
        if(inscricaoMunicipal.getDadosContadorNome() != null){
        	if(!inscricaoMunicipal.getDadosContadorNome().equals("")){
        		dadosCadastraisEmpresa.setNumeroCRCContador(inscricaoMunicipal.getDadosContadorCrc());
        		dadosCadastraisEmpresa.setNomeContador(inscricaoMunicipal.getDadosContadorNome());
        		dadosCadastraisEmpresa.setNumeroCPFContador(somenteNumeros(inscricaoMunicipal.getDadosContadorCPF()));
        		dadosCadastraisEmpresa.setNumeroRGContador(inscricaoMunicipal.getDadosContadorRG());
        		dadosCadastraisEmpresa.setNomeEscritorioContador(inscricaoMunicipal.getDadosContadorNomeEscritorio());
        		dadosCadastraisEmpresa.setLogradouroNomeContador(inscricaoMunicipal.getDadosContadorEndereco());
        		dadosCadastraisEmpresa.setNumeroLogradouroContador(inscricaoMunicipal.getDadosContadorNumeroEndereco());
        		dadosCadastraisEmpresa.setComplementoLogradouroContador(inscricaoMunicipal.getDadosContadorComplementoEndereco());
        		dadosCadastraisEmpresa.setBairroNomeContador(inscricaoMunicipal.getDadosContadorBairro());
        		dadosCadastraisEmpresa.setMunicipioCodigoContador(parseInt(inscricaoMunicipal.getDadosContadorMunicipio()));
        		dadosCadastraisEmpresa.setMunicipioUFContador(inscricaoMunicipal.getDadosContadorUf());
        		dadosCadastraisEmpresa.setCEPContador(inscricaoMunicipal.getDadosContadorCEP());
        		dadosCadastraisEmpresa.setTelefoneContador(somenteNumeros(inscricaoMunicipal.getDadosContadorTelefone()));
                dadosCadastraisEmpresa.setFAXContador(somenteNumeros(inscricaoMunicipal.getDadosContadorFax()));
                dadosCadastraisEmpresa.setEmailContador(inscricaoMunicipal.getDadosContadorEmail());
        	}
        }
      //  dadosCadastraisEmpresa.setBairroCodigoContador(27352);
        
        
      //  if(inscricaoMunicipal.getDadosContadorTelefone() == null){
	//		throw new NumberFormatException("Campo DadosContadorTelefone esta nulo");
	//	}
        

        // ENDEREÇO DA EMPRESA
        
        if(inscricaoMunicipal.getEmpresacodigoLogradouroAgata() == null){
			throw new NumberFormatException("Campo EmpresacodigoLogradouroAgata esta nulo");
		}
        
        if(inscricaoMunicipal.getEmpresaCodigoBairro() == null){
			throw new NumberFormatException("Campo getEmpresaCodigoBairro esta nulo");
		}
        
        dadosCadastraisEmpresa.setLogradouroCodigoLocalizacaoEmpresa(inscricaoMunicipal.getEmpresacodigoLogradouroAgata());
        dadosCadastraisEmpresa.setBairroCodigoLocalizacaoEmpresa(inscricaoMunicipal.getEmpresaCodigoBairro());
        dadosCadastraisEmpresa.setNumeroLocalizacaoEmpresa(inscricaoMunicipal.getEmpresaNumeroLogradouro());
        dadosCadastraisEmpresa.setCEPLocalizacaoEmpresa(inscricaoMunicipal.getEmpresaCep());
        dadosCadastraisEmpresa.setNumeroTelefoneEmpresa(somenteNumeros(inscricaoMunicipal.getEmpresaTelefone()));
        dadosCadastraisEmpresa.setComplementoLocalizacaoEmpresa(inscricaoMunicipal.getEmpresaComplementoLogradouro());
	    
	
	    
	        
	    //------------------------------------------------------------------
	    // LISTA DE PUBLICIDADE
	    //-------------------------------------------------------------------
	    ArrayOfSdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens caracteristicaFuncionamentoItens = new ArrayOfSdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens();
	    List<SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens> listaCaracteristicas = new ArrayList<SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens>();
	
	            //publicidade
	            byte codigo = 0;
	            if (inscricaoMunicipal.getPublicidades() != null) {
	                for (Publicidades p : inscricaoMunicipal.getPublicidades()) {
	                	if(p.getQuantidade() != null && p.getQuantidade() > 0){
	                		SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens dadosPublicidadario = new SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens();
	                	 	codigo = gerarCodigoEmpresa(inscricaoMunicipal.getStatusEmpresa(), codigo);
	                	 	dadosPublicidadario.setSequencialCaractefisticaFuncionamento(codigo);
	                	 	dadosPublicidadario.setValorM2CaractefisticaFuncionamento(p.getM2());
	                	 	dadosPublicidadario.setCodigoCaracteristicaFuncionamento(p.getTipo().byteValue());                	 
	                	 	dadosPublicidadario.setQuantidadeCaracteristicaFuncionamento(p.getQuantidade().shortValue());                    	
	                	 	listaCaracteristicas.add(dadosPublicidadario);
	                	}
	                }
	            }
	            
	            SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens dados = new SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens();
	            
	            if(inscricaoMunicipal.getQuantidadePublicidadeLuminoso() == null){
	    			throw new NumberFormatException("Campo getQuantidadePublicidadeLuminoso esta nulo");
	    		}
	            
	            if(inscricaoMunicipal.getQuantidadePublicidadeNaoLuminioso() == null){
	    			throw new NumberFormatException("Campo getQuantidadePublicidadeNaoLuminioso esta nulo");
	    		}
	            
	            
	            if(inscricaoMunicipal.getQuantidadePublicidadeTerceiro() == null){
	    			throw new NumberFormatException("Campo getQuantidadePublicidadeTerceiro esta nulo");
	    		}
	            
	            if(inscricaoMunicipal.getNumeroDeJogos() == null){
	    			throw new NumberFormatException("Campo getNumeroDeJogos esta nulo");
	    		}
	            
	            
	            if(inscricaoMunicipal.getNumeroDeEletronicos() == null){
	    			throw new NumberFormatException("Campo getNumeroDeEletronicos esta nulo");
	    		}
	            
	            if(inscricaoMunicipal.getNumeroInstrumentosMusicais() == null){
	    			throw new NumberFormatException("Campo getNumeroInstrumentosMusicais esta nulo");
	    		}
	            
	           //Outros
	            if (inscricaoMunicipal.getQuantidadePublicidadeLuminoso() > 0) {
	            	
	            	//Campo Novo
	            	codigo= gerarCodigoEmpresa(inscricaoMunicipal.getStatusEmpresa(), codigo);
	                dados.setSequencialCaractefisticaFuncionamento(codigo);
	                dados.setValorM2CaractefisticaFuncionamento(0.0);
	                //------
	                
	                dados.setCodigoCaracteristicaFuncionamento(Byte.valueOf("1"));
	                dados.setQuantidadeCaracteristicaFuncionamento(Short.parseShort(inscricaoMunicipal.getQuantidadePublicidadeLuminoso().toString()));                
	                listaCaracteristicas.add(dados);
	            }
	            
	            if (inscricaoMunicipal.getQuantidadePublicidadeNaoLuminioso() > 0) {
	                dados = new SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens();
	                
	                //Campo Novo
	            	codigo= gerarCodigoEmpresa(inscricaoMunicipal.getStatusEmpresa(), codigo);
	                dados.setSequencialCaractefisticaFuncionamento(codigo);
	                dados.setValorM2CaractefisticaFuncionamento(0.0);
	                //------
	                
	                dados.setCodigoCaracteristicaFuncionamento(Byte.valueOf("2"));                
	                dados.setQuantidadeCaracteristicaFuncionamento(Short.parseShort(inscricaoMunicipal.getQuantidadePublicidadeNaoLuminioso().toString()));
	                listaCaracteristicas.add(dados);
	            }
	
	            if (inscricaoMunicipal.getQuantidadePublicidadeTerceiro() > 0) {
	                dados = new SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens();
	                
	                //Campo Novo
	            	codigo= gerarCodigoEmpresa(inscricaoMunicipal.getStatusEmpresa(), codigo);
	                dados.setSequencialCaractefisticaFuncionamento(codigo);
	                dados.setValorM2CaractefisticaFuncionamento(0.0);
	                //------
	                
	                dados.setCodigoCaracteristicaFuncionamento(Byte.valueOf("3"));
	                dados.setQuantidadeCaracteristicaFuncionamento(Short.parseShort(inscricaoMunicipal.getQuantidadePublicidadeTerceiro().toString()));
	                listaCaracteristicas.add(dados);
	            }
	
	            if (inscricaoMunicipal.getNumeroDeJogos() > 0) {
	                dados = new SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens();
	                
	                //Campo Novo
	            	codigo= gerarCodigoEmpresa(inscricaoMunicipal.getStatusEmpresa(), codigo);
	                dados.setSequencialCaractefisticaFuncionamento(codigo);
	                dados.setValorM2CaractefisticaFuncionamento(0.0);
	                //------
	                
	                dados.setCodigoCaracteristicaFuncionamento(Byte.valueOf("4"));
	                dados.setQuantidadeCaracteristicaFuncionamento(Short.parseShort(inscricaoMunicipal.getNumeroDeJogos().toString()));
	                listaCaracteristicas.add(dados);
	            }
	
	            if (inscricaoMunicipal.getNumeroDeEletronicos() > 0) {
	                dados = new SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens();
	                
	                //Campo Novo
	            	codigo= gerarCodigoEmpresa(inscricaoMunicipal.getStatusEmpresa(), codigo);
	                dados.setSequencialCaractefisticaFuncionamento(codigo);
	                dados.setValorM2CaractefisticaFuncionamento(0.0);
	                //------
	                
	                dados.setCodigoCaracteristicaFuncionamento(Byte.valueOf("5"));
	                dados.setQuantidadeCaracteristicaFuncionamento(Short.parseShort(inscricaoMunicipal.getNumeroDeEletronicos().toString()));
	                listaCaracteristicas.add(dados);
	            }
	
	            if (inscricaoMunicipal.getNumeroInstrumentosMusicais() > 0) {
	                dados = new SdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens();
	                
	                //Campo Novo
	            	codigo= gerarCodigoEmpresa(inscricaoMunicipal.getStatusEmpresa(), codigo);
	                dados.setSequencialCaractefisticaFuncionamento(codigo);
	                dados.setValorM2CaractefisticaFuncionamento(0.0);
	                //------
	                
	                dados.setCodigoCaracteristicaFuncionamento(Byte.valueOf("6"));
	                dados.setQuantidadeCaracteristicaFuncionamento(Short.parseShort(inscricaoMunicipal.getNumeroInstrumentosMusicais().toString()));
	                listaCaracteristicas.add(dados);
	            }
	
	            caracteristicaFuncionamentoItens.setSdtDadosCadastraisEmpresaCaracteristicaFuncionamentoItens(listaCaracteristicas);
	            CaracteristicasFuncionamento caracteristicaFuncionamentoItensEstatico = new CaracteristicasFuncionamento();
	            caracteristicaFuncionamentoItensEstatico.setCaracteristicaFuncionamentoItens(listaCaracteristicas);
				dadosCadastraisEmpresa.setCaracteristicasFuncionamento(caracteristicaFuncionamentoItensEstatico );
	
	            
	            //------------------------------------------------------------------
	    	    // CLASSIFICAÇÃO DA ATIVIDADE
	    	    //-------------------------------------------------------------------
	            
	            if(inscricaoMunicipal.getEnquadramentoAtividadeEconomica() == null || inscricaoMunicipal.getEnquadramentoAtividadeEconomica().getClassificacaoAtividade() == null){
	    			throw new NumberFormatException("Campo ClassificacaoAtividade esta nulo é um campo obrigatorio");
	    		}
	            
	            String classificacaoAtividade = inscricaoMunicipal.getEnquadramentoAtividadeEconomica().getClassificacaoAtividade().toLowerCase();
	            classificacaoAtividade = removerAcentos(classificacaoAtividade);
	            dadosCadastraisEmpresa.setDescricaoClassificacaoAtividadeEconomica(classificacaoAtividade);
	
	            if (classificacaoAtividade.equalsIgnoreCase("industria")) {
	                dadosCadastraisEmpresa.setCodigoClassificacaoAtividadeEconomica(Byte.valueOf("1"));
	            } else if (classificacaoAtividade.equalsIgnoreCase("comercio")) {
	                dadosCadastraisEmpresa.setCodigoClassificacaoAtividadeEconomica(Byte.valueOf("2"));
	            } else if (classificacaoAtividade.equalsIgnoreCase("prestacao de servico")) {
	                dadosCadastraisEmpresa.setCodigoClassificacaoAtividadeEconomica(Byte.valueOf("3"));
	            } else if (classificacaoAtividade.equalsIgnoreCase("deposito fechado")) {
	                dadosCadastraisEmpresa.setCodigoClassificacaoAtividadeEconomica(Byte.valueOf("7"));
	            } else if (classificacaoAtividade.equalsIgnoreCase("mei")) {
	                dadosCadastraisEmpresa.setCodigoClassificacaoAtividadeEconomica(Byte.valueOf("9"));
	            } else if (classificacaoAtividade.equalsIgnoreCase("agropecuaria")) {
	                dadosCadastraisEmpresa.setCodigoClassificacaoAtividadeEconomica(Byte.valueOf("4"));
	            } else if (classificacaoAtividade.equalsIgnoreCase("hoteis/moteis e outros")) {
	                dadosCadastraisEmpresa.setCodigoClassificacaoAtividadeEconomica(Byte.valueOf("6"));
	            } else {
	                dadosCadastraisEmpresa.setCodigoClassificacaoAtividadeEconomica(Byte.valueOf("5"));
	            }
	
	            //------------------------------------------------------------------
	    	    // CLASSIFICAÇÃO DA ATIVIDADE
	    	    //-------------------------------------------------------------------
	            
	           // inscricaoMunicipal.setHoraDeFuncionamentoSegundaASexta(item.getHoraEntradaPrimario() + " ás " + item.getHoraSaidaPrimario());
	           // inscricaoMunicipal.setHoraDeFuncionamentoSabado(item.getHoraEntradaSabado()+ " ás " + item.getHoraSaidaSabado());
	           // inscricaoMunicipal.setHoraDeFuncionamentoDomingo(item.getHoraEntradaDomingo()+ " ás " + item.getHoraSaidaDomingo());
	
	            
	            //------------------------------------------------------------------
	    	    // SOCIOS
	    	    //-------------------------------------------------------------------
	            List<SdtDadosCadastraisEmpresaSocioItens> sociosList = new ArrayList<SdtDadosCadastraisEmpresaSocioItens>();
	            if (inscricaoMunicipal.getSocios() != null) {
	                for (Socio s : inscricaoMunicipal.getSocios()) {
	                    SdtDadosCadastraisEmpresaSocioItens socio = new SdtDadosCadastraisEmpresaSocioItens();
	                    socio.setNomeSocio(s.getNome().toUpperCase());
	                    socio.setNumeroCpfSocio(somenteNumeros(s.getCpf()));
	                    socio.setNumeroRgSocio(s.getRg());
	                    socio.setEmailSocio(s.getEmail());
	                    socio.setTelefoneSocio(somenteNumeros(s.getTelefone()));
	                    socio.setLogradouroNomeSocio(s.getEndereco().toUpperCase());
	                    socio.setNumeroLogradouroSocio(s.getNumeroEndereco());
	                    socio.setComplementoLogradouroSocio(s.getComplementoEndereco());
	                    socio.setBairroNomeSocio(s.getBairro().toUpperCase());
	                    socio.setBairroCodigoSocio(codigoBairro(s.getEndereco(), s.getUf()));//#BAIRRO
	                    
	                    if(s.getCidade() == null || s.getCidade().equals("0")){
	                    	throw new NumberFormatException("Nome do socio " + s.getNome() + " esta com o codigo do municipio nulo favor selecione o municipio");
	                    }
	                    socio.setMunicipioCodigoSocio(parseInt(s.getCidade()));
	                    socio.setCEPSocio(s.getCep().replace("-", ""));
	                    socio.setMunicipioUfSocio(s.getUf());
	                    sociosList.add(socio);
	                }
	            }
	
	            ArrayOfSdtDadosCadastraisEmpresaSocioItens socios = new ArrayOfSdtDadosCadastraisEmpresaSocioItens();
	            socios.setSdtDadosCadastraisEmpresaSocioItens(sociosList);
				Socios sociosItensEstatico = new Socios();
				sociosItensEstatico.setSocioItens(sociosList);
				dadosCadastraisEmpresa.setSocios(sociosItensEstatico  );
	
	            
	            //------------------------------------------------------------------
	    	    // REPRESENTANTE LEGAL
	    	    //-------------------------------------------------------------------
	            List<SdtDadosCadastraisEmpresaRepresentanteLegalItens> representantesList = new ArrayList<SdtDadosCadastraisEmpresaRepresentanteLegalItens>();
	
	            SdtDadosCadastraisEmpresaRepresentanteLegalItens representante = new SdtDadosCadastraisEmpresaRepresentanteLegalItens();
	
	            representante.setNomeRepresentanteLegal(inscricaoMunicipal.getRepresentanteLegalNome());
	            representante.setNumeroCpfRepresentanteLegal(somenteNumeros(inscricaoMunicipal.getRepresentanteLegalCPF()));
	            representante.setNumeroRgRepresentanteLegal(inscricaoMunicipal.getRepresentanteLegalRG());
	            representante.setEmailRepresentanteLegal(inscricaoMunicipal.getRepresentanteLegalEmail());
	            representante.setTelefoneRepresentanteLegal(somenteNumeros(inscricaoMunicipal.getRepresentanteLegalTelefone()));
	            representante.setLogradouroNomeRepresentanteLegal(inscricaoMunicipal.getRepresentanteLegalEndereco());
	            representante.setNumeroLogradouroRepresentanteLegal(inscricaoMunicipal.getRepresentanteLegalNumeroDoEndereco());
	            representante.setComplementoLogradouroRepresentanteLegal(inscricaoMunicipal.getRepresentanteLegalComplementoDeEndereco());
	            representante.setBairroNomeRepresentanteLegal(inscricaoMunicipal.getRepresentanteLegalBairro());
	            representante.setBairroCodigoRepresentanteLegal(codigoBairro(inscricaoMunicipal.getRepresentanteLegalEndereco(), inscricaoMunicipal.getRepresentanteLegalUf()));
	            representante.setMunicipioCodigoRepresentanteLegal(parseInt(inscricaoMunicipal.getRepresentanteLegalMunicipio()));
	            representante.setMunicipioUFRepresentanteLegal(inscricaoMunicipal.getRepresentanteLegalUf());
	            representante.setCEPRepresentanteLegal(inscricaoMunicipal.getRepresentanteLegalCEP());
	            representantesList.add(representante);
	
	          //  ArrayOfSdtDadosCadastraisEmpresaRepresentanteLegalItens representantes = new ArrayOfSdtDadosCadastraisEmpresaRepresentanteLegalItens();
	         
	           
	            
	            RepresentantesLegais representantesEstaticoStatico = new RepresentantesLegais();
	            representantesEstaticoStatico.setRepresentanteLegalItens(representantesList);
	            
				dadosCadastraisEmpresa.setRepresentantesLegais(representantesEstaticoStatico );
	
	            ArrayOfSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens atividades = new ArrayOfSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens();
	            List<SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens> atividadeItensList = new ArrayList<SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens>();
	
	            //------------------------------------------------------------------
	    	    // ENQUADRAMENTO ATIVIDADE ECONOMICA
	    	    //-------------------------------------------------------------------
	            EnquadramentoAtividadeEconomica enquadramentoAtividadeEconomica = inscricaoMunicipal.getEnquadramentoAtividadeEconomica();
	            List<EnquadramentoAtividadeEconomicaComplemento> complementoAtividades = enquadramentoAtividadeEconomica.getEnquadramentoAtividadeEconomicaComplementos();
	
	            if(complementoAtividades == null){
	    			throw new NumberFormatException("Campo complementoAtividades esta nulo");
	    		}
	            
	            for (EnquadramentoAtividadeEconomicaComplemento enquadramentoAtividadeEconomicaComplemento : complementoAtividades) {
	                SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens item = new SdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens();
	                
			if (enquadramentoAtividadeEconomicaComplemento.getComplementoAtividade().getAtividade() == null) {
/*
				String[] partes = enquadramentoAtividadeEconomicaComplemento
						.getComplementoAtividade().getDescricao().split(" ");

				// O primeiro elemento é a parte com os números
				String numeros = partes[0];
				String[] numerosArray = numeros.split("\\.");

				item.setCodigoAtividade(Short.valueOf(numerosArray[0]));
				item.setCodigoGrupoAtividade(Short.valueOf(numerosArray[1]));
				item.setCodigoSubgrupoAtividade(Short.valueOf(numerosArray[2]));*/
				throw new NumberFormatException("Enquadramento Atividade Economica Codigo da Atividade esta nulo");
			}
	               
	                item.setCodigoAtividade(Short.valueOf(enquadramentoAtividadeEconomicaComplemento.getComplementoAtividade().getAtividade().toString()));
	                item.setCodigoGrupoAtividade(Short.valueOf(enquadramentoAtividadeEconomicaComplemento.getComplementoAtividade().getGrupo().toString()));
	                item.setCodigoSubgrupoAtividade(enquadramentoAtividadeEconomicaComplemento.getComplementoAtividade().getSubgrupo());
	                item.setDataInicioAtividade(parseStringDate(inscricaoMunicipal.getDataDeAlteracao()));
	                if (enquadramentoAtividadeEconomicaComplemento.getTipo().equalsIgnoreCase("principal")) {
	                    item.setTipoAtividade("P");
	                } else {
	                    item.setTipoAtividade("S");
	                }
	                
	                if (enquadramentoAtividadeEconomicaComplemento.getTipo().equals("1")) {
	                    item.setTipoAtividade("P");
	                }
	                if (enquadramentoAtividadeEconomicaComplemento.getTipo().equals("2")) {
	                    item.setTipoAtividade("S");
	                }
	                
	                
	                atividadeItensList.add(item);
	            }
	
	            dadosCadastraisEmpresa.setComplementoAtividadeEconomica(inscricaoMunicipal.getObjetoSocial());
	
	            
	            /* REMOVIDO POIS NÃO ESTA SENDO ADICIONADO CONTRATO
	            if (enquadramentoAtividadeEconomica.getNumeroContrato() != null) {
	              //  ArrayOfSdtDadosCadastraisEmpresaContratoItens contratos = new ArrayOfSdtDadosCadastraisEmpresaContratoItens();
	                List<SdtDadosCadastraisEmpresaContratoItens> contratoItensList = new ArrayList<SdtDadosCadastraisEmpresaContratoItens>();
	
	                SdtDadosCadastraisEmpresaContratoItens contratoItem = new SdtDadosCadastraisEmpresaContratoItens();
	                contratoItem.setDataContrato(parseStringDate(enquadramentoAtividadeEconomica.getDataContrato()));
	                contratoItem.setNumeroContrato(enquadramentoAtividadeEconomica.getNumeroContrato());
	                
	                
	                //observação de contrato é campo obrigatório na webservice então
	                if(enquadramentoAtividadeEconomica.getObservacao() == null || enquadramentoAtividadeEconomica.getObservacao().length() < 7){
	                	enquadramentoAtividadeEconomica.setObservacao("(Sem informação)"); 
	                }
	                
	                if(enquadramentoAtividadeEconomica.getDataAlteracao() == null){
	                	enquadramentoAtividadeEconomica.setDataAlteracao(new Date());
	                }
	                
	                if(enquadramentoAtividadeEconomica.getObservacaoContrato() == null || enquadramentoAtividadeEconomica.getObservacaoContrato().length() < 7){
	                	enquadramentoAtividadeEconomica.setObservacaoContrato("(Sem informação)");
	                }
	                	 
	                
	                contratoItem.setObservacaoContrato(enquadramentoAtividadeEconomica.getObservacaoContrato());
	                contratoItensList.add(contratoItem);
	                //contratos.setSdtDadosCadastraisEmpresaContratoItens(contratoItensList);
	                Contratos contratosStatico = new Contratos();
	                contratosStatico.setContratoItens(contratoItensList);
					dadosCadastraisEmpresa.setContratos(contratosStatico );
					
	            }
	*/
	            //atividades.setSdtDadosCadastraisEmpresaGrupoSubgrupoAtividadeItens(atividadeItensList);
	            GrupoSubgrupoAtividades atividadesEstatico = new GrupoSubgrupoAtividades();
	            atividadesEstatico.setGrupoSubgrupoAtividadeItens(atividadeItensList);
				dadosCadastraisEmpresa.setGrupoSubgrupoAtividades(atividadesEstatico );
	
	            ArrayOfSdtDadosCadastraisEmpresaServicoItens servicos = new ArrayOfSdtDadosCadastraisEmpresaServicoItens();
	            List<SdtDadosCadastraisEmpresaServicoItens> servicoItensList = new ArrayList<SdtDadosCadastraisEmpresaServicoItens>();
	
	            //------------------------------------------------------------------
	    	    // ENQUADRAMENTO ISS
	    	    //-------------------------------------------------------------------
	            EnquadramentoISS enquadramentoISS = inscricaoMunicipal.getEnquadramentoISS();
	
	            if(enquadramentoISS == null){
	    			throw new NumberFormatException("Campo enquadramentoISS esta nulo");
	    		}
	            
	            dadosCadastraisEmpresa.setDescricaoTipoISSQN(enquadramentoISS.getTipoISSQN());
	
	            if (enquadramentoISS.getTlfInicial() != null) {
	                if (enquadramentoISS.getTlfInicial() == 1) {
	                    dadosCadastraisEmpresa.setSituacaoTLFInicial("S");
	                } else {
	                    dadosCadastraisEmpresa.setSituacaoTLFInicial("N");
	                }
	            } else {
	                dadosCadastraisEmpresa.setSituacaoTLFInicial("N");
	            }
	
	            List<EnquadramentoISSCodigoServico> enquadramentoISSCodigoServicos = enquadramentoISS.getEnquadramentoISSCodigoServico();
	
	            if (enquadramentoISSCodigoServicos != null) {
	                for (EnquadramentoISSCodigoServico codigoServico : enquadramentoISSCodigoServicos) {
	                	if(codigoServico.getCodigoServico() != null){
	                		SdtDadosCadastraisEmpresaServicoItens item = new SdtDadosCadastraisEmpresaServicoItens();
	                		item.setCodigoServico(codigoServico.getCodigoServico().toString());
	                		item.setDataInicioServico(parseStringDate(codigoServico.getDataInicial()));
	                		item.setDataFimServico(parseStringDate(codigoServico.getDataFinal()));
	                		if (codigoServico.getTipo().equalsIgnoreCase("anual")) {
	                			item.setSituacaoServico("A");
	                		} else {
	                			item.setSituacaoServico("M");
	                		}
	                		if (codigoServico.getSituacao().equalsIgnoreCase("primario")) {
	                			item.setTipoServico("P");
	                		} else {
	                			item.setTipoServico("S");
	                		}
	                		servicoItensList.add(item);
	                	}
	                }
	            }
	
	            SdtDadosCadastraisEmpresa.Servicos servicosEstatico = new SdtDadosCadastraisEmpresa.Servicos();
	            servicosEstatico.setServicoItens(servicoItensList);
				dadosCadastraisEmpresa.setServicos(servicosEstatico);
	
	            
	            //------------------------------------------------------------------
	    	    // ENQUADRAMENTO CNAES
	    	    //-------------------------------------------------------------------
	            ArrayOfSdtDadosCadastraisEmpresaCnaeItens cnaes = new ArrayOfSdtDadosCadastraisEmpresaCnaeItens();
	            List<SdtDadosCadastraisEmpresaCnaeItens> cnaeItensList = new ArrayList<SdtDadosCadastraisEmpresaCnaeItens>();
	
	            List<Cnae> lista = inscricaoMunicipal.getCnaes();
	            
	            for (Cnae cnae : lista) {
	            	SdtDadosCadastraisEmpresaCnaeItens item = new SdtDadosCadastraisEmpresaCnaeItens();
	            	item.setNumeroCnae(cnae.getCodigo());
	            	if (cnae.getPrincipal()) {
	            		item.setPosicaoCnae("P");
	            	} else {
	            		item.setPosicaoCnae("S");
	            	}
	            	cnaeItensList.add(item);
	            }
	            
	            
	            SdtDadosCadastraisEmpresa.Cnaes cnaesEstatico = new SdtDadosCadastraisEmpresa.Cnaes();
	            cnaesEstatico.setCnaeItens(cnaeItensList);
	            dadosCadastraisEmpresa.setCnaes(cnaesEstatico);
	           // ConverterDtoJson.mostarJson(dadosCadastraisEmpresa);
	        return dadosCadastraisEmpresa;
	    }



}

