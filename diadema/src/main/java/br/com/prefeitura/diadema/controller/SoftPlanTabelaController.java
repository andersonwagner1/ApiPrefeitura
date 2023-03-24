package br.com.prefeitura.diadema.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.dto.RelatorioDto;
import br.com.prefeitura.diadema.dto.grafico.Converter;
import br.com.prefeitura.diadema.service.SoftPlanTabelaService;


/**
 * Controla de relatorios apenas para mostrar tabela
 * @author anderson.oliveira
 *
 */
@RestController
@RequestMapping("/api/diadema/tabela")
public class SoftPlanTabelaController {
	
	private final SoftPlanTabelaService softplan;
	
	@Autowired
    public SoftPlanTabelaController(SoftPlanTabelaService softService) {
        this.softplan = softService;
    }
	
	/**
	 * Apenas tabelaa
	 * @return
	 * @throws SQLException
	 */
	@GetMapping(value ="/listar/usuarios/semacessar")
	public ResponseEntity<RelatorioDto> listarUsuariosMuitoTempoSemAcessar() throws SQLException{
		Object[][] resultado = softplan.listarUsuariosMuitoTempoSemAcessar();
		
		RelatorioDto relatorio = new Converter().conveter(resultado, false, "Login","Nome","Data Cadastro","Ultimo Acesso");
		relatorio.setTitulo("Usuario muito tempo sem acessar");
		relatorio.setSubtitulo("Lista dos usuario que estão a mais 60 dias sem acessar no sistema");
		
		return new ResponseEntity<RelatorioDto>(relatorio, HttpStatus.OK);
	}
}
