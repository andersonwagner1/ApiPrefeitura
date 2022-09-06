package br.com.prefeitura.diadema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.AGLHistoricoProcesso;
import br.com.prefeitura.diadema.model.Usuario;

@Repository
public abstract interface RelatorioAGLRepository extends JpaRepository<AGLHistoricoProcesso, Long> {
	//nome do método deve conter o atributo da classe
	@Query("from AGLHistoricoProcesso where posicao = :posicao and idAssunto = :idAssunto and idUnidade = :idUnidade and idUsuario =:idUsuario")
    public AGLHistoricoProcesso findExist(
    		@Param("posicao")Integer posicao, 
    		@Param("idAssunto")Long idAssunto, 
    		@Param("idUnidade")Long idUnidade, 
    		@Param("idUsuario")Long idUsuario);

	

  /*  //palavra-chave da consulta: Between
    public List<Usuario> findByIdadeBetween(int startAge, int endAge);

    //consulta por namedQuery
    public List<Usuario> findByDtCadastro(Date dtCadastro);

    //consulta por named parameters
    @Query("from Usuario where login = :login and senha = :senha")
    public Usuario findByLoginAndSenha(@Param("login")String login, @Param("senha") String senha);

    //consulta com ordinal parameters
    @Query("from Usuario where login = ?3 and senha = ?2 and idade = ?1")
    public Usuario findByLoginAndSenhaAndIdade
    (int idade, String senha, String login);*/
	
}