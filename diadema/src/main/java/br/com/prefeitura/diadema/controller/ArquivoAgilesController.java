package br.com.prefeitura.diadema.controller;



import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



import br.com.prefeitura.diadema.service.ArquivoAgilesService;
//import br.com.prefeitura.diadema.service.LogsService;



@RestController
@RequestMapping("/api/diadema/arquivo")
public class ArquivoAgilesController {
	//private LogsService logsService;
	private ArquivoAgilesService arquivoAgilesService;

	/**
	 * Realiza teste de comunicação de controller
	 * @return
	 */
	@GetMapping("/hello")
	public String sayHello() {
		return "-Gerador Arquivo AgilesX";
	}
	
	@GetMapping("/arquivo")
	public String oi(){
		// String[] caminhoArquivo = arquivoAgilesService.consultarLocalizacaoDocumento(pk);
		 String remoteFilePath = "//10.1.2.1/aplicacao/storage/blobdir/0/000/000/000/000/016/459";
		// System.out.println("estou aqui" + caminhoArquivo[tipo]);
	     //   File file = new File("/aplicacao/storage/blobdir/" + caminhoArquivo[tipo]);
		// String remoteFilePath = "\\\\10.1.2.92\\aplicacao\\storage\\blobdir\\0\\000\\000\\000\\000\\000\\016\\459";
		 // String remoteFilePath = "//10.1.2.1/aplicacao/storage/blobdir/" + caminhoArquivo[tipo];
		  System.out.println(remoteFilePath);
		  File file = new File(remoteFilePath);
		  
		  if (!file.exists() || !file.isFile()) {
	        	System.out.println("Não encontrou o arquivo");
	        	return "arquivo não existe";
	        }
		  
		  return "arquivoExiset";
		  
		  
	}
	
	@Autowired
    public ArquivoAgilesController(ArquivoAgilesService arquivoAgilesService) {
       this.arquivoAgilesService = arquivoAgilesService;  
       // this.logsService = logsService;
    }
	
	
	
	@GetMapping(value = "/consulta-protocolo/{protocolo}")
	public ResponseEntity<String[]> consultarProtocoloVre(@PathVariable("pk") String pk) {
		
		try{
			String[] resultado = arquivoAgilesService.localizarArquivoPorPk(pk);
			return new ResponseEntity<String[]>(resultado, HttpStatus.OK);
		}catch(Exception e){
			//logsService.falha(log, e.getMessage());
			e.printStackTrace();
			String[] s = new String[1];
			s[0] = e.getMessage();
			return new ResponseEntity<String[]>(s, HttpStatus.BAD_GATEWAY);
		}		
	}
	
	
	 @PostMapping("/download")
	    public ResponseEntity<InputStreamResource> downloadFile(@RequestParam String pk, @RequestParam Integer tipo) throws IOException {
		 System.out.println("downloadFile");
		 String[] caminhoArquivo = arquivoAgilesService.consultarLocalizacaoDocumento(pk);
		 System.out.println("//10.1.2.1/aplicacao/storage/blobdir/0/000/000/000/000/016/459");
		 System.out.println("estou aqui" + caminhoArquivo[tipo]);
	     //   File file = new File("/aplicacao/storage/blobdir/" + caminhoArquivo[tipo]);
		// String remoteFilePath = "\\\\10.1.2.92\\aplicacao\\storage\\blobdir\\0\\000\\000\\000\\000\\000\\016\\459";
		  String remoteFilePath = "//10.1.2.1/aplicacao/storage/blobdir/" + caminhoArquivo[tipo];
		  System.out.println(remoteFilePath);
		  File file = new File(remoteFilePath);

	    //    File file = new File("C:\\Users\\anderson.oliveira\\Desktop\\PDF\\Danfe.pdf");
	        System.out.println("Encotocuo  o arquivo");
	        if (!file.exists() || !file.isFile()) {
	        	System.out.println("Não encontrou o arquivo");
	            return ResponseEntity.notFound().build();
	        }
	        System.out.println("encontrou o arquivo");
	        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
	        HttpHeaders headers = new HttpHeaders();
	        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + file.getName());
	        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_PDF_VALUE);

	        return ResponseEntity.ok()
	                .headers(headers)
	                .contentLength(file.length())
	                .contentType(MediaType.APPLICATION_PDF)
	                .body(resource);
	    }
	


	
	
	
}
