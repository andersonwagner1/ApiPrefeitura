package br.com.prefeitura.diadema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.Permissao;

@Repository
public abstract interface PermissaoRepository extends JpaRepository<Permissao, Long> {
}