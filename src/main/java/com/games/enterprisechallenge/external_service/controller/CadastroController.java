package com.games.enterprisechallenge.external_service.controller;

import com.games.enterprisechallenge.external_service.model.dto.AlunoDTO;
import com.games.enterprisechallenge.external_service.model.dto.ContatoDTO;
import com.games.enterprisechallenge.external_service.model.dto.VoluntarioDTO;
import com.games.enterprisechallenge.external_service.service.CadastroService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastros")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class CadastroController {
    @Autowired
    private CadastroService cadastroService;

    @PostMapping("/alunos")
    public ResponseEntity<AlunoDTO> cadastrarAluno(@RequestBody AlunoDTO aluno) {
        return ResponseEntity.ok(cadastroService.cadastrarAluno(aluno));
    }

    @PostMapping("/voluntarios")
    public ResponseEntity<VoluntarioDTO> cadastrarVoluntario(@RequestBody VoluntarioDTO voluntario) {
        return ResponseEntity.ok(cadastroService.cadastrarVoluntario(voluntario));
    }

    @PostMapping("/contatos")
    public ResponseEntity<ContatoDTO> cadastrarContato(@RequestBody ContatoDTO contato) {
        return ResponseEntity.ok(cadastroService.cadastrarContato(contato));
    }
}
