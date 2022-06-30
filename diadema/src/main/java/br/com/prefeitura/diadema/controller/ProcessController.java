package br.com.prefeitura.diadema.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.dto.AgendaProcessoDto;
import br.com.prefeitura.diadema.dto.ProcessoEletronicoDto;
import br.com.prefeitura.diadema.model.AgendaProcesso;
import br.com.prefeitura.diadema.service.ProcessoService;
import br.com.prefeitura.diadema.service.ScheduleService;


/**
 * Controle de acesso do usuario
 * @author anderson.oliveira
 *
 */
@RestController
@RequestMapping("/api/prefeitura/processo")
public class ProcessController {
	
	private final ProcessoService processService;
	
	private final ScheduleService scheduleService;
	
	
	@Autowired
    public ProcessController(ProcessoService processService, ScheduleService scheduleService) {
        this.processService = processService;
        this.scheduleService = scheduleService;
       
    }
	
	@GetMapping(value ="/{idDocBase}")
	public ResponseEntity<ProcessoEletronicoDto> getProcessByIdDocBase(@PathVariable(value = "idDocBase") Long idDocBase) {
		try{
			ProcessoEletronicoDto processDto = processService.findprocessByIdBaseDocumento(idDocBase);
			return new ResponseEntity<ProcessoEletronicoDto>(processDto, HttpStatus.OK);
		}catch(SQLException sq){
			sq.printStackTrace();
			return new ResponseEntity<ProcessoEletronicoDto>(HttpStatus.BAD_GATEWAY);
		}
		
	}
	
	@GetMapping(value ="/get/{numberProcess}")
	public ResponseEntity<List<ProcessoEletronicoDto>> findProcessByNumberProcess(@PathVariable(value = "numberProcess") String numberProcess) {
		try{
			numberProcess = numberProcess.replace('-', '/');
			List<ProcessoEletronicoDto> listProcessDto = processService.findProcessByNumberProcess(numberProcess);
			return new ResponseEntity<List<ProcessoEletronicoDto>>(listProcessDto, HttpStatus.OK);
		}catch(SQLException sq){
			sq.printStackTrace();
			return new ResponseEntity<List<ProcessoEletronicoDto>>(HttpStatus.BAD_GATEWAY);
		}
		
	}
	

	@PostMapping(value = "/agendar/enviarAviso")
	public ResponseEntity<Object> sendScheduleTask(@RequestBody AgendaProcessoDto agendaProcessoDto){
		//enviar registro para e-mail
		AgendaProcesso agendaProcesso = new AgendaProcesso();
		BeanUtils.copyProperties(agendaProcessoDto, agendaProcesso);
		agendaProcesso.setDtAvisar(agendaProcessoDto.getDtAvisar());
		agendaProcesso.setDtCadastro(new Date());
		
		agendaProcesso = scheduleService.sendSchedule(agendaProcesso);
		return new ResponseEntity<Object>(agendaProcessoDto, HttpStatus.OK);
	}
	
	
	
	@GetMapping(value ="/agenda/enviarEmail")
	public ResponseEntity<Object> sendScheduleTaskEmail(){
		//ENVIAR E-MAIL
		scheduleService.sendEmail();
		return new ResponseEntity<Object>("e-mail enviado com sucesso", HttpStatus.OK);
	}
	
	@GetMapping(value="/agenda/listarAgenda/{dataInicial}/{dataFinal}")
	public ResponseEntity<List<AgendaProcessoDto>> listScheduleByPeriodDate(@PathVariable("dataInicial") Date dtStart, @PathVariable("dataFinal") Date dtEnd){
		List<AgendaProcesso> listSchedule = scheduleService.findScheduleDateAvisoBetween(dtStart, dtEnd);
		List<AgendaProcessoDto> listProcessDto = new ArrayList<AgendaProcessoDto>();
		for (AgendaProcesso item : listSchedule) {
			AgendaProcessoDto agendaDto = new AgendaProcessoDto();
			BeanUtils.copyProperties(item,agendaDto);
			
			ProcessoEletronicoDto processo;
			try {
				processo = processService.findprocessByIdBaseDocumento(agendaDto.getIdDocumentoBase());
				agendaDto.setProcesso(processo);
			} catch (SQLException e) {
				e.printStackTrace();
			}			
			
			
			listProcessDto.add(agendaDto);
	    }
		return new ResponseEntity<List<AgendaProcessoDto>>(listProcessDto, HttpStatus.OK);
	}
	
	
	@GetMapping(value= "/agenda/listaProcessoAguardando")
	public ResponseEntity<List<AgendaProcessoDto>> listAllScheduleWainting(){
		List<AgendaProcesso> listSchedule = scheduleService.findScheduleDateAvisoBetween(null, null);
		List<AgendaProcessoDto> listProcessDto = new ArrayList<AgendaProcessoDto>();
		
		for (AgendaProcesso item : listSchedule) {
			AgendaProcessoDto agendaDto = new AgendaProcessoDto();
			BeanUtils.copyProperties(item,agendaDto);
			
			ProcessoEletronicoDto processo;
			try {
				processo = processService.findprocessByIdBaseDocumento(agendaDto.getIdDocumentoBase());
				agendaDto.setProcesso(processo);
			} catch (SQLException e) {
				e.printStackTrace();
			}			
			
			
			listProcessDto.add(agendaDto);
	    }
		return new ResponseEntity<List<AgendaProcessoDto>>(listProcessDto, HttpStatus.OK);
	}
	
	@DeleteMapping(value="/agenda/deletaAviso/{id}")
	public ResponseEntity<AgendaProcessoDto> deleteScheduleTask(@PathVariable(value="id") Long id){
		scheduleService.deletScheduleTask(id);
		return new ResponseEntity<AgendaProcessoDto>(HttpStatus.OK);
	}
	
}
