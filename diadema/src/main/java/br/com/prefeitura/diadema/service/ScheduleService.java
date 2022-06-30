package br.com.prefeitura.diadema.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.prefeitura.diadema.model.AgendaProcesso;
import br.com.prefeitura.diadema.repository.ScheduleRepository;

@Service
public class ScheduleService {
	
	private ScheduleRepository schedulepository;

	@Autowired
	public ScheduleService(ScheduleRepository agendaRepository){
		this.schedulepository = agendaRepository;
	}

	@Transactional
	public AgendaProcesso save(AgendaProcesso agendaProcesso) {
		return schedulepository.save(agendaProcesso);
	}

	public Optional<AgendaProcesso> getScheduleById(Long id) {
		return schedulepository.findById(id);
	}
	

	/**
	 * realiza a pesquisa por periodo de data caso a data não foi selecionado listar todos os dados
	 * @param dtStart
	 * @param dtEnd
	 * @return
	 */
	public List<AgendaProcesso>findScheduleDateAvisoBetween(Date dtStart, Date dtEnd) {
		if(dtStart == null && dtEnd == null){
			return schedulepository.findTaskActivate();
		}else{
			return schedulepository.findByDtAvisarBetween(dtStart, dtEnd);
		}
	}
	
	
	
	/**
	 * Envia agenda
	 * @param agendaProcesso
	 * @return
	 */
	public AgendaProcesso sendSchedule(AgendaProcesso agendaProcesso){
		return schedulepository.save(agendaProcesso);
	}
	
	public void sendEmail(){
		List<AgendaProcesso> schedulesNow = schedulepository.findScheduleNoticeNow(new Date());
		List<AgendaProcesso> schedulesYesterney = schedulepository.findScheduleNoticeYesterney(new Date());
		List<AgendaProcesso> schedulesFiveDaysAgo = schedulepository.findScheduleNoticeFiveDaysAgo(new Date());
		
		//atualizar data
		
	}

	public void deletScheduleTask(Long id) {
		schedulepository.deleteById(id);
	}

	
	
}
