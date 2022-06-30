package br.com.prefeitura.diadema.dto;

public class HistoricoDto {
	private Long idEventoDigital;
	private UnidadeDto unidadeDestino;
	private UsuarioInternoDto usuarioDestino;
	public Long getIdEventoDigital() {
		return idEventoDigital;
	}
	public void setIdEventoDigital(Long idEventoDigital) {
		this.idEventoDigital = idEventoDigital;
	}
	public UnidadeDto getUnidadeDestino() {
		return unidadeDestino;
	}
	public void setUnidadeDestino(UnidadeDto unidadeDestino) {
		this.unidadeDestino = unidadeDestino;
	}
	public UsuarioInternoDto getUsuarioDestino() {
		return usuarioDestino;
	}
	public void setUsuarioDestino(UsuarioInternoDto usuarioDestino) {
		this.usuarioDestino = usuarioDestino;
	}
	
	
	
	
	

}
