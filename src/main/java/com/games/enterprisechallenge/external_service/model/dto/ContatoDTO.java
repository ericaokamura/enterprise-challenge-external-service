package com.games.enterprisechallenge.external_service.model.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContatoDTO {

    private String nomeCompleto;
    private String numeroCelular;
    private String email;
    private String criticaSugestao;
}
