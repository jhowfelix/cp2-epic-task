package br.com.fiap.epictaskapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.epictaskapi.model.Integrante;

public interface IntegranteRepository extends JpaRepository<Integrante, Long> {

}
