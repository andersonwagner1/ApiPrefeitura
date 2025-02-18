package br.com.prefeitura.diadema.ws;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import br.com.prefeitura.diadema.boleto.Banco;
import br.com.prefeitura.diadema.boleto.Boleto;
import br.com.prefeitura.diadema.boleto.Datas;
import br.com.prefeitura.diadema.boleto.Emissor;
import br.com.prefeitura.diadema.boleto.Sacado;
import br.com.prefeitura.diadema.boleto.bancos.Bradesco;
import br.com.prefeitura.diadema.boleto.transformer.GeradorDeBoleto;

public class BoletoBradescoExample {
    public static void main(String[] args) {
        Datas datas = Datas.novasDatas().comDocumento(1, 5, 2008)
                .comProcessamento(1, 5, 2008).comVencimento(2, 5, 2008);

        Emissor emissor = Emissor.novoEmissor()
            .comCedente("Fulano de Tal")
            .comAgencia(2345)
            .comDigitoAgencia('6')
            .comContaCorrente(12345)
            .comNumeroConvenio(1234567)
            .comDigitoContaCorrente('1')
            .comCarteira(22)
            .comNossoNumero(9050987);

        Sacado sacado = Sacado.novoSacado()
            .comNome("Fulano da Silva")
            .comCpf("111.222.333-12")
            .comEndereco("Av dos testes, 111 apto 333")
            .comBairro("Bairro Teste")
            .comCep("01234-111")
            .comCidade("São Paulo")
            .comUf("SP");

        Banco banco = new Bradesco();

        Boleto boleto = Boleto.novoBoleto()
            .comBanco(banco)
            .comDatas(datas)
            .comDescricoes("123456789", "descricao 2", "descricao 3",
                        "descricao 4", "descricao 5")
            .comEmissor(emissor)
            .comSacado(sacado)
            .comValorBoleto("200.00")
            .comNumeroDoDocumento("1234")
            .comInstrucoes("instrucao 1", "instrucao 2",
                        "instrucao 3", "instrucao 4", "instrucao 5")
            .comLocaisDePagamento("local 1", "local 2")
            .comNumeroDoDocumento("4343");


        Map<String,Object> parametros = new HashMap<String, Object>();
        
        parametros.put("SUB_INSTRUCOES", "JTestes");
        
		GeradorDeBoleto gerador = new GeradorDeBoleto(parametros, boleto);

        // Para gerar um boleto em PDF
        gerador.geraPDF("BoletoBradesco.pdf");

        // Para gerar um boleto em PNG
        gerador.geraPDF("BoletoBradesco.png");

        // Para gerar um array de bytes a partir de um PDF
       // @SuppressWarnings("unused")
       // byte[] bPDF = gerador.geraPDF();

        // Para gerar um array de bytes a partir de um PNG
      //  @SuppressWarnings("unused")
      //  byte[] bPNG = gerador.geraPDF();
        
        File pdf = new File("E:\\sakai\\pdf.pdf"); //desativadro o agerar arquivo no servidor, pois não é necessario
		gerador.geraPDF(pdf);
        
        
    }
}