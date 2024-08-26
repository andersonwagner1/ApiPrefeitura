package br.com.prefeitura.diadema.service;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prefeitura.diadema.model.PmdCnae;
import br.com.prefeitura.diadema.repository.CnaeRepository;
import br.com.prefeitura.diadema.repository.dao.OracleAgiles;
import br.com.prefeitura.diadema.vre.dto.ResultadoDto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ArquivoAgilesService {
	
	
	
	public ArquivoAgilesService(){
		
	}
	
	// Método para ler o arquivo PDF do servidor e armazená-lo na memória
    public byte[] readPdfFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.readAllBytes(path);
    }

    // Método para realizar o download do arquivo PDF para o computador local
    public void downloadPdfFile(byte[] fileData, String downloadPath) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(downloadPath)) {
            fos.write(fileData);
        }
    }

    public static void main(String[] args) {
    	ArquivoAgilesService fileService = new ArquivoAgilesService();
        String serverFilePath = "C:\\Users\\anderson.oliveira\\Desktop\\PDF\\DANFE.pdf";
        String localDownloadPath = "C://Users//anderson.oliveira//Desktop\\PDF\\DANFE.pdf";

        try {
            // Ler o arquivo do servidor e armazenar na memória
            byte[] fileData = fileService.readPdfFile(serverFilePath);

            // Realizar o download do arquivo para o computador local
            fileService.downloadPdfFile(fileData, localDownloadPath);

            System.out.println("Arquivo baixado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public String[] localizarArquivoPorPk(String pk) throws SQLException {
    	OracleAgiles agiles = new OracleAgiles();
    	
    	ResultSet rsArquivoOriginal = agiles.executeQuery("select * from view_file_agiles asd  WHERE ASD.PK_ARQUIVO = '9-5hu3yeir3sgjxr5x'");
    	
    	ResultadoDto dto = new ResultadoDto();
    	
    	String[] arquivo = new String[4];
    	
    	if(rsArquivoOriginal.next()){
    		arquivo[0] = rsArquivoOriginal.getString("CAMINHO");
    		arquivo[1] = rsArquivoOriginal.getString("CAMINHOSIGNED");
    		arquivo[2] = rsArquivoOriginal.getString("NOME_ARQUIVO");
    		return arquivo;
    	}
    	
    	return null;
    }
    
	

	public String[] consultarLocalizacaoDocumento(String pk) {
		
		OracleAgiles agiles = new OracleAgiles();
		try {
			
			ResultSet rs = agiles.executeQuery("select t.caminho,CAMINHOSIGNED, NOME_ARQUIVO from view_file_agiles t where pk_arquivo = '9-5hu3yeir3sgjxr5x'");
			
			String[] caminhodoArquivo = new String[3];
			if(rs.next()){
				caminhodoArquivo[0] = rs.getString("NOME_ARQUIVO");
				caminhodoArquivo[1] = rs.getString("CAMINHO");
				caminhodoArquivo[2] = rs.getString("CAMINHOSIGNED");
			}
			return caminhodoArquivo;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			String[] t = {e.getMessage()};
			return t;
		}
		
		// TODO Auto-generated method stub

	}
	
	
	
	
}
