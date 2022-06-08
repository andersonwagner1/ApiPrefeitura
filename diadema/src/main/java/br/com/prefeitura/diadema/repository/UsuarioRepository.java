package br.com.prefeitura.diadema.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.Usuario;

@Repository
public abstract interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	//nome do método deve conter o atributo da classe
	@Query("from Usuario where login = :login")
    public Usuario findByLogin(@Param("login")String login);

	public Usuario findByPk(String pk);

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