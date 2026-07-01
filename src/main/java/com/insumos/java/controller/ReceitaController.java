package com.insumos.java.controller;

import com.insumos.java.domain.entity.ReceitaEntity;
import com.insumos.java.domain.service.ReceitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/receita")

public class ReceitaController {
    private final ReceitaService service;

    @PostMapping
    public ResponseEntity<ReceitaEntity> adicionarReceita(@RequestBody ReceitaEntity entity){
        return ResponseEntity.ok(service.adicionarReceita(entity));
    }

    @GetMapping
    public List<ReceitaEntity> listarReceitas(){
        return service.listarReceitas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReceitaEntity> buscarUmaReceita(@PathVariable Long id){
        return ResponseEntity.ok(service.buscaUmaReceita(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReceitaEntity> atualizarReceita(@PathVariable Long id, @RequestBody ReceitaEntity entity){
        return ResponseEntity.ok(service.atualizaReceita(id, entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ReceitaEntity> deletarReceita(@PathVariable Long id){
        service.excluirReceita(id);
        return ResponseEntity.noContent().build();
    }
}

