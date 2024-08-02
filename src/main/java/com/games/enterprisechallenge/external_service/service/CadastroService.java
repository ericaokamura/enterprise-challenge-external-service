package com.games.enterprisechallenge.external_service.service;

import com.games.enterprisechallenge.external_service.mapping.AlunoMapping;
import com.games.enterprisechallenge.external_service.mapping.ContatoMapping;
import com.games.enterprisechallenge.external_service.mapping.VoluntarioMapping;
import com.games.enterprisechallenge.external_service.model.Aluno;
import com.games.enterprisechallenge.external_service.model.Contato;
import com.games.enterprisechallenge.external_service.model.Voluntario;
import com.games.enterprisechallenge.external_service.model.dto.AlunoDTO;
import com.games.enterprisechallenge.external_service.model.dto.ContatoDTO;
import com.games.enterprisechallenge.external_service.model.dto.VoluntarioDTO;
import com.games.enterprisechallenge.external_service.repository.AlunoRepository;
import com.games.enterprisechallenge.external_service.repository.ContatoRepository;
import com.games.enterprisechallenge.external_service.repository.VoluntarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CadastroService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private VoluntarioRepository voluntarioRepository;

    @Autowired
    private ContatoRepository contatoRepository;

    public AlunoDTO cadastrarAluno(AlunoDTO dto) {
        Aluno aluno = alunoRepository.save(AlunoMapping.convertDtoToModel(dto));
        return AlunoMapping.convertModelToDto(aluno);
    }

    public ContatoDTO cadastrarContato(ContatoDTO dto) {
        Contato contato = contatoRepository.save(ContatoMapping.convertDtoToModel(dto));
        return ContatoMapping.convertModelToDto(contato);
    }

    public VoluntarioDTO cadastrarVoluntario(VoluntarioDTO dto) {
        Voluntario voluntario = voluntarioRepository.save(VoluntarioMapping.convertDtoToModel(dto));
        return VoluntarioMapping.convertModelToDto(voluntario);
    }
}

