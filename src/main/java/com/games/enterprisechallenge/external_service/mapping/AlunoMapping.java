package com.games.enterprisechallenge.external_service.mapping;

import com.games.enterprisechallenge.external_service.model.Aluno;
import com.games.enterprisechallenge.external_service.model.dto.AlunoDTO;

public class AlunoMapping {

    public static AlunoDTO convertModelToDto(Aluno model) {
        AlunoDTO dto = new AlunoDTO();
        dto.setEmail(model.getEmail());
        dto.setIdade(model.getIdade());
        dto.setNomeCompleto(model.getNomeCompleto());
        dto.setNumeroCelular(model.getNumeroCelular());
        dto.setConheceProgramacao(model.isConheceProgramacao());
        return dto;
    }

    public static Aluno convertDtoToModel(AlunoDTO dto) {
        Aluno model = new Aluno();
        model.setEmail(dto.getEmail());
        model.setIdade(dto.getIdade());
        model.setNomeCompleto(dto.getNomeCompleto());
        model.setNumeroCelular(dto.getNumeroCelular());
        model.setConheceProgramacao(dto.isConheceProgramacao());
        return model;
    }
}
