package br.com.prefeitura.diadema.boleto;

import br.com.prefeitura.diadema.boleto.bancos.Bradesco;
import br.com.prefeitura.diadema.boleto.transformer.GeradorDeBoleto;



//import com.lowagie.text.pdf.codec.Base64.InputStream;

public class Principal {
	
	
	
	public static void main(String args[]){
		        Datas datas = Datas.novasDatas()
		                .comDocumento(1, 5, 2008)
		                .comProcessamento(1, 5, 2008)
		                .comVencimento(2, 5, 2008);

		        Endereco enderecoBeneficiario = Endereco.novoEndereco()
		        		.comLogradouro("Av das Empresas, 555")  
		        		.comBairro("Bairro Grande")  
		        		.comCep("01234-555")  
		        		.comCidade("São Paulo")  
		        		.comUf("SP");  

		        //Quem emite o boleto
		        Beneficiario beneficiario = Beneficiario.novoBeneficiario()
		                .comNomeBeneficiario("Anderson Wagner Oliveira")  		                
		                .comAgencia("1824").comDigitoAgencia("4")  
		                .comCodigoBeneficiario("76000")  
		                .comDigitoCodigoBeneficiario("5")  
		                .comNumeroConvenio("1207113")  
		                .comCarteira("18")  
		                
		                .comEndereco(enderecoBeneficiario)
		                .comNossoNumero("9000206"); 
		        

		        Endereco enderecoPagador = Endereco.novoEndereco()
		        		.comLogradouro("Av dos testes, 111 apto 333")  
		        		.comBairro("Bairro Teste")  
		        		.comCep("01234-111")  
		        		.comCidade("São Paulo")  
		        		.comUf("SP");  
		        
		        //Quem paga o boleto
		        Pagador pagador = Pagador.novoPagador()  
		                .comNome("Fulano da Silva")  
		                .comDocumento("111.222.333-12")
		                .comEndereco(enderecoPagador);

		        Banco banco = new Bradesco();  

		        Boleto boleto = Boleto.novoBoleto()  
		                .comBanco(banco)  
		                .comDatas(datas)  
		                .comBeneficiario(beneficiario)  
		                .comPagador(pagador)  
		               // .comDescricao("Descricao teste")
		                //.comDescricoes("LINHA 1","linha 2", "linha 6","linha 2")
		                .comInstrucoes("Algum instrução no boleot")
		                
		                .comValorBoleto("700")  
		                .comNumeroDoDocumento("1234")  
		                .comInstrucoes("instrucao 1", "instrucao 2", "instrucao 3", "instrucao 4", "instrucao 5")  
		                .comLocaisDePagamento("local 1", "local 2");  
		        
		        
		        
		        
		        

		        GeradorDeBoleto gerador = new GeradorDeBoleto(boleto);
		       // System.out.println(gerador.geraPDF());
		        gerador.geraPDF("E:\\Documentos\\123.pdf");
		        
		        
		        
//		        InputStream templateBoleto = context.getResourceAsStream("ABc");
		        
	//	        GeradorDeBoletoHTML geradorBoletos = new GeradorDeBoletoHTML(templateBoleto, parametros, new Boleto[] { boletoStella });
		        
	//	        geradorBoletos.geraPDF(baos);
		        
	//	        IOUtils.closeQuietly(templateBoleto);
		        
		       // File boletoPDF = File.createTempFile("boleto-agata", ".pdf");
		       // FileOutputStream fos = new FileOutputStream(boletoPDF);
		       // baos.writeTo(fos);
		       // fos.flush();
		       // IOUtils.closeQuietly(fos);
		        
		       // boleto.setCodigoBarras(boletoStella.getLinhaDigitavel());
		       // boleto.setDataGeracaoPDF(new Date());
		       // boleto.setFileBoleto(boletoPDF);

		        // Para gerar um boleto em PDF  
		        //gerador.geraPDF("E://Documentos//BancoDoBrasil.pdf");  

		        // Para gerar um boleto em PNG  
		       // gerador.geraPNG("E://Documentos//BancoDoBrasil.png");  

		        // Para gerar um array de bytes a partir de um PDF  
		       // byte[] bPDF = gerador.geraPDF();  

		        // Para gerar um array de bytes a partir de um PNG  
		       // byte[] bPNG = gerador.geraPNG();
		    }  
	}

