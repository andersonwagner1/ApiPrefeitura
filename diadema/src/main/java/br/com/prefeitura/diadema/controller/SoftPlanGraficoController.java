package br.com.prefeitura.diadema.controller;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.dto.RelatorioDto;
import br.com.prefeitura.diadema.dto.grafico.Converter;
import br.com.prefeitura.diadema.enumerador.EnumCampo;
import br.com.prefeitura.diadema.service.SoftPlanGraficoService;
import br.com.prefeitura.diadema.service.SoftPlanTabelaService;


/**
 * Controle para realizar agrupados para mostrar grafico
 * @author anderson.oliveira
 *
 */
@Deprecated
@RestController
@RequestMapping("/api/diadema/grafico")
public class SoftPlanGraficoController {
	
	private final SoftPlanGraficoService softPlanGraficoService;
	private final SoftPlanTabelaService softPlanTabelaService;

	 
	
	@Autowired
    public SoftPlanGraficoController(SoftPlanTabelaService softPlanTabelaService, SoftPlanGraficoService softPlanGraficoService) {
        this.softPlanGraficoService = softPlanGraficoService;
        this.softPlanTabelaService = softPlanTabelaService;
    }
	
	@GetMapping(value = "/relatorio/usuario_sem_acesso")
	public ResponseEntity<RelatorioDto> relatorio(
			//@PathVariable() String nomeRelatorio,			
			@RequestParam(value = "dataInicial") Long dataInicial,
			@RequestParam(value = "dataFinal") Long dataFinal,
			@RequestParam(value = "secretaria") Long secretaria)
			throws SQLException {

		EnumCampo enumTipoRelatorio = EnumCampo.USUARIO_SEM_ACESSO;

		
		Object[][] resultado = softPlanTabelaService.listarUsuariosMuitoTempoSemAcessar();
		RelatorioDto relatorio = new Converter().conveter(resultado, enumTipoRelatorio.isGrafico(), "Login","Nome","Data Cadastro","Ultimo Acesso");
		relatorio.setTipoGrafico(enumTipoRelatorio.getTipoGrafico());
		return new ResponseEntity<RelatorioDto>(relatorio, HttpStatus.OK);

	}
	
	
	@GetMapping(value ="/relatorio/processo_situacao")
	public ResponseEntity<RelatorioDto> listarQuantidadeProcessosAssuntoPorSecretaria(
			@RequestParam(value="dataInicial") Long dataInicial, 
			@RequestParam(value="dataFinal") Long dataFinal
			) throws SQLException{
		
		Date dInicial = parseData(dataInicial);
		Date dFinal =  parseData(dataFinal);
			
		EnumCampo enumTipoRelatorio = EnumCampo.PROCESSO_SITUACAO;

		
		Object[][] resultado = softPlanGraficoService.listarQuantidadeProcessoAgrupadoPorSituacaoFiltradoPorDataInicialFinal(dInicial, dFinal);		
		RelatorioDto relatorio = new Converter().conveter(resultado, enumTipoRelatorio.isGrafico(), "Assunto","Quantidade");
		relatorio.setTipoGrafico(enumTipoRelatorio.getTipoGrafico());
		return new ResponseEntity<RelatorioDto>(relatorio, HttpStatus.OK);		
	}
	
	@GetMapping(value ="/relatorio/processo_unidade")
	public ResponseEntity<RelatorioDto> listarQuantidadeProcessosAssuntoPorSecretaria(
			@RequestParam(value="dataInicial") Long dataInicial, 
			@RequestParam(value="dataFinal") Long dataFinal,
			@RequestParam(value="secretaria") Long secretaria) throws SQLException{
		
		Date dInicial = parseData(dataInicial);
		Date dFinal =  parseData(dataFinal);
		
		EnumCampo enumTipoRelatorio = EnumCampo.PROCESSO_UNIDADE;


		
		Object[][] resultado = softPlanGraficoService.listarQuantidadeProcessoPorAssuntoFiltradoPorDataInicialFinal(dInicial, dFinal, secretaria);		
		RelatorioDto relatorio = new Converter().conveter(resultado, enumTipoRelatorio.isGrafico(), "Assunto","Quantidade");
		relatorio.setTipoGrafico(enumTipoRelatorio.getTipoGrafico());
		return new ResponseEntity<RelatorioDto>(relatorio, HttpStatus.OK);		
	}
	
	
	
	
	
	
	private Date parseData(Long dataInicial){
		Date dInicial = new Date();
		dInicial.setTime(dataInicial);
		return dInicial;
	}
	
	

}
