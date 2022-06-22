package br.com.prefeitura.diadema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.Permissao;

@Repository
public abstract interface PermissaoRepository extends JpaRepository<Permissao, Long> {
	List<Permissao> findByNome(String nome);
	
	
	
	 @Query("from Permissao where nome like concat(?1, '%')")
	 List<Permissao> findByName(String nome);
}

/*
Produto findByNome(String nome);

// Equivalente ao like, mas não precisamos nos preocupar com o sinal de percentual. 
// Podemos usar também EndingWith, Containing.
List<Produto> findByNomeStartingWith(String nome);

// Ordenando pelo nome.
List<Produto> findByNomeStartingWithOrderByNome(String nome);

// Não levar em consideração a caixa.
List<Produto> findByNomeStartingWithIgnoreCase(String nome);

// Pesquisando por duas propriedades: nome e ativo.
List<Produto> findByNomeStartingWithIgnoreCaseAndAtivoEquals(String nome, boolean ativo);

// Nesse caso, precisamos usar o sinal de percentual em nossas consultas.
List<Produto> findByNomeLike(String nome);

// Podemos usar também IsNotNull ou NotNull.
List<Produto> findByDescricaoIsNull(); 

// Quando você quer negar o que passa no parâmetro
List<Produto> findByNomeNot(String nome);

// Todos os produtos com os IDs passados no varargs. Poderia usar NotIn para negar os IDs.
List<Produto> findByIdIn(Long... ids);

// Todos onde a propriedade ativo é true. Poderia ser falso, usando False.
List<Produto> findByAtivoTrue();

// Buscar onde a data de cadastro é depois do parâmetro passado. 
// Pode ser usado Before também.
List<Produto> findByCadastroAfter(Date data);

// Buscar onde a data cadastro está dentro de um período.
List<Produto> findByCadastroBetween(Date inicio, Date fim);

// Todos com quantidade "menor que". Poderia ser usado
// também LessThanEqual, GreaterThan, GreaterThanEqual.
List<Produto> findByQuantidadeLessThan(int quantidade);

*/