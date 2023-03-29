package br.com.prefeitura.diadema.boleto;

import java.io.File;

import br.com.prefeitura.diadema.boleto.bancos.Bradesco;
import br.com.prefeitura.diadema.boleto.transformer.GeradorDeBoleto;


public class Snippet {
	public static void main(String[] args) {
	
	            Datas datas = Datas.novasDatas()
	                    .comDocumento(1, 5, 2016)
	                    .comProcessamento(1, 5, 2016)
	                    .comVencimento(2, 12, 2016);
	
	            Endereco enderecoBeneficiario = Endereco.novoEndereco()
	                    .comLogradouro("Av das Empresas, 555")
	                    .comBairro("Bairro Grande")
	                    .comCep("01234-555")
	                    .comCidade("São Paulo")
	                    .comUf("SP");
	
	            //Quem emite o boleto
	
	            Beneficiario beneficiario = Beneficiario.novoBeneficiario()
	                    .comNomeBeneficiario("Fulano de Tal")
	                    .comAgencia("1824").comDigitoAgencia("4")
	                    .comCodigoBeneficiario("76000")
	                    .comDigitoCodigoBeneficiario("5")
	                    .comNumeroConvenio("1207113")
	                    .comCarteira("18")
	                    .comEndereco(enderecoBeneficiario)
	                    .comDocumento("05.606.206/0001-83")
	                    .comNossoNumero("9000206").comDigitoNossoNumero("3");
	
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
	                    .comValorBoleto("200.00")
	                    .comNumeroDoDocumento("1234")
	                    .comInstrucoes("instrucao 1", "instrucao 2", "instrucao 3", "instrucao 4", "instrucao 5")
	                    .comLocaisDePagamento("local 1", "local 2");
	
	            GeradorDeBoleto gerador = new GeradorDeBoleto(boleto);
	
	
	            System.out.println(gerador.toString());
	            File pdf = new File("E://Desenvolvimento//BancoBradesco.pdf");
	            gerador.geraPDF(pdf);
}
}

