package br.com.prefeitura.diadema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.prefeitura.diadema.model.AdmCargaFormulario;

@Repository
public abstract interface CargaAuxiliarRepository extends JpaRepository<AdmCargaFormulario, Long>{
}
