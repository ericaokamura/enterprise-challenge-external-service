package com.games.enterprisechallenge.external_service.mapping;

import com.games.enterprisechallenge.external_service.model.Contato;
import com.games.enterprisechallenge.external_service.model.dto.ContatoDTO;

public class ContatoMapping {


    public static ContatoDTO convertModelToDto(Contato model) {
        ContatoDTO dto = new ContatoDTO();
        dto.setEmail(model.getEmail());
        dto.setNomeCompleto(model.getNomeCompleto());
        dto.setNumeroCelular(model.getNumeroCelular());
        dto.setCriticaSugestao(model.getCriticaSugestao());
        return dto;
    }

    public static Contato convertDtoToModel(ContatoDTO dto) {
        Contato model = new Contato();
        model.setEmail(dto.getEmail());
        model.setNomeCompleto(dto.getNomeCompleto());
        model.setNumeroCelular(dto.getNumeroCelular());
        model.setCriticaSugestao(dto.getCriticaSugestao());
        return model;
    }
}
