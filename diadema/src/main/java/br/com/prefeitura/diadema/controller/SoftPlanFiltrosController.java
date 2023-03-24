package br.com.prefeitura.diadema.controller;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.dto.Campo;
import br.com.prefeitura.diadema.dto.ComboDto;
import br.com.prefeitura.diadema.dto.Filtro;
import br.com.prefeitura.diadema.enumerador.EnumCampo;
import br.com.prefeitura.diadema.enumerador.EnumFiltro;
import br.com.prefeitura.diadema.service.SoftPlanFiltroService;


/**
 * Controle de acesso do usuario
 * @author anderson.oliveira
 *
 */
@RestController
@RequestMapping("/api/diadema/filtro")
public class SoftPlanFiltrosController {
	
	private final SoftPlanFiltroService softplan;
	
	@Autowired
    public SoftPlanFiltrosController(SoftPlanFiltroService softService) {
        this.softplan = softService;
    }
	
	
	private String dataAtual(int meses){
		Calendar cal = Calendar.getInstance();  
        cal.setTime(new Date()); 
	    cal.add (Calendar.MONTH, meses*-1); 
		
		
		SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
		String result = out.format(cal.getTime());
		return result;
	}
	
	private boolean contem(EnumFiltro e, EnumFiltro[] filtros){
		for(EnumFiltro es : filtros){
			if(e == es){
				return true;
			}
		}		
		return false;
	}
	
	private Filtro montarCamposFiltro(EnumFiltro... filtros)throws SQLException{
		boolean[] existeEsteFiltro = new boolean[12];
		Filtro filtro = new Filtro();
		
		//Filtro para adicionar os campos
		existeEsteFiltro[0] = contem(EnumFiltro.DATA_INICIAL, filtros);
		existeEsteFiltro[1] = contem(EnumFiltro.DATA_FINAL, filtros);
		existeEsteFiltro[2] = contem(EnumFiltro.UNIDADE, filtros);
		
		Campo dataInicial = new Campo(dataAtual(12), existeEsteFiltro[0]);
		Campo dataFinal = new Campo(dataAtual(0) , existeEsteFiltro[1]);

		
		List<ComboDto> resultado;
		if(existeEsteFiltro[2]){
			resultado = softplan.listarSecretariaPreitura();
		}else{
			 resultado = new ArrayList<ComboDto>();
		}
				
		Campo unidade = new Campo("1" , existeEsteFiltro[2], resultado);		
		filtro.addFiltro(dataInicial);
		filtro.addFiltro(dataFinal);
		filtro.addFiltro(unidade);
		
		return filtro;
		
	}
	
	//http://localhost:8090/api/diadema/filtro/campos/sem-acessar
	
	/*---------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 * Lista a lista de relatorios
	 *--------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
	@GetMapping(value ="/campos/usuario_sem_acesso")
	public ResponseEntity<Filtro> listarSecretariasPrefeiturat() throws SQLException{
		Filtro filtro = montarCamposFiltro();
		filtro.setSubTitulo("Campos para pesquisar Teste");
		filtro.setTitulo("Titulo Teste");
		filtro.setTipoRelatorio(EnumCampo.USUARIO_SEM_ACESSO);
		
		return new ResponseEntity<Filtro>(filtro, HttpStatus.OK);
	}
	
	
	@GetMapping(value ="/campos/processo_unidade")
	public ResponseEntity<Filtro> lsitarProcessoPorUnidade() throws SQLException{
		Filtro filtro = montarCamposFiltro(EnumFiltro.DATA_INICIAL, EnumFiltro.DATA_FINAL, EnumFiltro.UNIDADE);

		filtro.setSubTitulo("Processo por Unidade");
		filtro.setTitulo("lista quantidade de processo por secretaria");
		filtro.setTipoRelatorio(EnumCampo.PROCESSO_UNIDADE);
		
		return new ResponseEntity<Filtro>(filtro, HttpStatus.OK);
	}
	
	@GetMapping(value ="/campos/processo_situacao")
	public ResponseEntity<Filtro> lsitarProcessoPorSituacao() throws SQLException{
		Filtro filtro = montarCamposFiltro(EnumFiltro.DATA_INICIAL, EnumFiltro.DATA_FINAL);
		filtro.setSubTitulo("Situação dos processos");
		filtro.setTitulo("Lista quantidade de processo por situação");
		filtro.setTipoRelatorio(EnumCampo.PROCESSO_SITUACAO);
		
		return new ResponseEntity<Filtro>(filtro, HttpStatus.OK);
	}
	
	
	
	/*---------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 * Lista de usuario cadastrados no sistema
	 *--------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
	@GetMapping(value ="/listar/secretaria")
	public ResponseEntity<List<ComboDto>> listarSecretariasPrefeitura() throws SQLException{
		List<ComboDto> resultado = softplan.listarSecretariaPreitura();		
		return new ResponseEntity<List<ComboDto>>(resultado, HttpStatus.OK);
	}
	
	
}
