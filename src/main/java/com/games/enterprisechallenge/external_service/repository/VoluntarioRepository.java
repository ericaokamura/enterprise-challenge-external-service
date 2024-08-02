package com.games.enterprisechallenge.external_service.repository;

import com.games.enterprisechallenge.external_service.model.Voluntario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoluntarioRepository extends JpaRepository<Voluntario, Long> {

    Voluntario save(Voluntario voluntario);
}