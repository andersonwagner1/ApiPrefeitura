package br.com.prefeitura.diadema.controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prefeitura.diadema.service.GrupoUsuariosService;
import br.com.prefeitura.diadema.service.LogsService;
import br.com.prefeitura.diadema.vre.VreService;
import br.com.prefeitura.diadema.vre.dto.EmpresaDTO;
import br.com.prefeitura.diadema.vre.dto.ResultadoDto;
///api/diadema/vre/consulta-protocolo/{protocolo}
@RestController
@RequestMapping("/api/diadema/grupo/")
public class GrupoUsuarioController {
	private GrupoUsuariosService serviceVre;

	/**
	 * Realiza teste de comunicação de controller
	 * @return
	 */
	@GetMapping("/hello")
	public String sayHello() {
		return "Gerador usuario grupo";
	}
	
	@Autowired
    public GrupoUsuarioController(GrupoUsuariosService serviceVre) {
        this.serviceVre = serviceVre;
    }
	
	@GetMapping(value = "/usuario-grupo/{grupo}")
	public ResponseEntity<List<String[]>> listarUsuariosPorGrupo(@PathVariable("grupo") String grupo) throws SQLException {
			List<String[]> resultado = serviceVre.listarUsuariosPorGrupo(grupo);
			return new ResponseEntity<List<String[]>>(resultado, HttpStatus.OK);		
	}
	
	
	/**
	 * valores Fiscias fixo
	 * @return
	 * @throws SQLException
	 */
	@GetMapping(value = "/usuario-grupo/fixo/FISCAIS_ITBI")
	public ResponseEntity<List<String[]>> listarApenasCodigoUsuariosPorGrupo() throws SQLException {
		return listarUsuariosPorGrupo("FISCAIS_ITBI");
	}
}
