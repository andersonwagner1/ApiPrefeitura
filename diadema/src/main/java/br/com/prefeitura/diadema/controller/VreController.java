package br.com.prefeitura.diadema.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.service.LogsService;
import br.com.prefeitura.diadema.vre.VreService;
import br.com.prefeitura.diadema.vre.dto.EmpresaDTO;
import br.com.prefeitura.diadema.vre.dto.ResultadoDto;
///api/diadema/vre/consulta-protocolo/{protocolo}
@RestController
@RequestMapping("/api/diadema/vre")
public class VreController {
	private VreService serviceVre;
	private LogsService logsService;

	/**
	 * Realiza teste de comunicação de controller
	 * @return
	 */
	@GetMapping("/hello")
	public String sayHello() {
		return "Gerador E_VRe";
	}
	
	@Autowired
    public VreController(VreService serviceVre, LogsService logsService) {
       this.serviceVre = serviceVre;  
        this.logsService = logsService;
        
       
    }
	
	
	/**
	 * Realiza de consulta de protocolo na jucesp * chamada também da webservice da abaco para pegar as informações da empresa
	 * @param protocolo
	 * @return
	 */
	@GetMapping(value = "/consulta-protocolo/{protocolo}")
	public ResponseEntity<ResultadoDto> consultarProtocoloVre(@PathVariable("protocolo") String protocolo) {
		//PmdLogs log = logsService.infoJson("consultarProtocoloVre", protocolo);
		//ConsultaDataEmpresaResponse consulta = null;
		
		//Resultado consulta = null;
		try{
			ResultadoDto resultado = serviceVre.consultarEmpresaPorProtocoloNaJucespEAgata(protocolo);
			return new ResponseEntity<ResultadoDto>(resultado, HttpStatus.OK);
		}catch(Exception e){
			//logsService.falha(log, e.getMessage());
			e.printStackTrace();
			ResultadoDto dt= new ResultadoDto();
			dt.setResultado(e.getMessage());
			return new ResponseEntity<ResultadoDto>(dt, HttpStatus.BAD_GATEWAY);
		}		
	}
	
	/**
	 * Lista todas as informação da empresa do periodo de 7 dias até hoje
	 * @return
	 */
	@GetMapping(value = "/listar-protocolos-empresa")
	public ResponseEntity<String> listarTodosProtocolosDoPeriodoSeteDias() {
		//PmdLogs log = logsService.infoJson("consultarProtocoloVre", protocolo);
		//ConsultaDataEmpresaResponse consulta = null;
		
		//Resultado consulta = null;
		String resultado;
		try{
			resultado =  serviceVre.listarProtocoloEmpresa(new Date());
			return new ResponseEntity<String>(resultado, HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			ResultadoDto dt= new ResultadoDto();
			dt.setResultado(e.getMessage());
			resultado = new String();
			resultado = e.getMessage();
			return new ResponseEntity<String>(resultado, HttpStatus.BAD_GATEWAY);
		}		
	}
	
	
	/**
	 * Consulta as informação da jucesp, alterado a Dto a pedido da softplan
	 * @param protocolo
	 * @return
	 */
	@GetMapping(value = "/consulta-protocolo/dadosEmpresa/{protocolo}")
	public ResponseEntity<EmpresaDTO> consultarApenasDadosEmpresa(@PathVariable("protocolo") String protocolo) {
		//PmdLogs log = logsService.infoJson("consultarProtocoloVre", protocolo);
		//ConsultaDataEmpresaResponse consulta = null;
		
		//Resultado consulta = null;
		EmpresaDTO resultado = null;
		try{
			  resultado =  serviceVre.consultarDadosEmpresaPorCnpj(protocolo);
			  
			return new ResponseEntity<EmpresaDTO>(resultado, HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			
			
			return new ResponseEntity<EmpresaDTO>(resultado, HttpStatus.BAD_GATEWAY);
		}		
	}
	
	
	
	private boolean isValidDateFormat(String date) {
        // Define o formato esperado
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false); // Define para não permitir datas inválidas

        try {
            // Tenta analisar a data
            dateFormat.parse(date);
            return true; // Se não ocorrer exceção, o formato é válido
        } catch (ParseException e) {
            return false; // Se ocorrer exceção, o formato é inválido
        }
    }
	
	
	/**
	 * Lista os protocolos disponivel a pedido das informações necessária da data inicial e final
	 * @param dataInicial
	 * @param dataFinal
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value = "/listar-protocolos-empresa/{dataInicial}/{dataFinal}")
	public ResponseEntity<String> listarTodosProtocolosDoPeriodoSeteDias(@PathVariable("dataInicial") String dataInicial, @PathVariable("dataFinal") String dataFinal) throws Exception {
		
		
		if(!isValidDateFormat(dataInicial)){
			throw new Exception("Formato da data Inicial deve ser YYYY-mm-dd esta vindo com esse formato " + dataInicial);
		}
		if(!isValidDateFormat(dataFinal)){
			throw new Exception("Formato da data Final deve ser YYYY-mm-dd esta vindo com esse formato " + dataFinal);
		}
		
		String resultado;
		try{
			 resultado =  serviceVre.listarProtocoloEmpresa(dataInicial, dataFinal);
			return new ResponseEntity<String>(resultado, HttpStatus.OK);
		}catch(Exception e){
			//logsService.falha(log, e.getMessage());
			e.printStackTrace();
			ResultadoDto dt= new ResultadoDto();
			dt.setResultado(e.getMessage());
			resultado = new String();
			resultado = e.getMessage();
			return new ResponseEntity<String>(resultado, HttpStatus.BAD_GATEWAY);
		}		
	}
	

	
	
	
}
