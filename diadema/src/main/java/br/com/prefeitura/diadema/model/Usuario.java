package br.com.prefeitura.diadema.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "AGL_USUARIO")
@Getter
@NoArgsConstructor // JPA Only
public class Usuario {
	
	 public Usuario()
	    {
	     super();
	    }

	@Id
    private Long id;
    private String nome;
    private String email;
    private String login;
    
    @ManyToMany
    @JoinTable(
      name = "AGL_USUARIO_PERFIL", 
      joinColumns = @JoinColumn(name = "usuario_id"), 
      inverseJoinColumns = @JoinColumn(name = "perfil_id"))
    List<Perfil> listaPerfil;
    
    
    @ManyToMany
    @JoinTable(
      name = "AGL_USUARIO_PERMISSAO", 
      joinColumns = @JoinColumn(name = "usuario_id"), 
      inverseJoinColumns = @JoinColumn(name = "permissao_id"))
    List<Perfil> listaPermissao;

    public Usuario(Long id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Usuario transformaParaObjeto(){
        return new Usuario(id, nome, email);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Perfil> getListaPerfil() {
		return listaPerfil;
	}

	public void setListaPerfil(List<Perfil> listaPerfil) {
		this.listaPerfil = listaPerfil;
	}

	public List<Perfil> getListaPermissao() {
		return listaPermissao;
	}

	public void setListaPermissao(List<Perfil> listaPermissao) {
		this.listaPermissao = listaPermissao;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	
	
}