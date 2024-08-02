package com.games.enterprisechallenge.external_service.repository;

import com.games.enterprisechallenge.external_service.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Aluno save(Aluno aluno);

}
