package com.insumos.java.controller;

import com.insumos.java.domain.entity.InsumoEntity;
import com.insumos.java.domain.service.InsumoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/insumo")

public class InsumoController {
    private final InsumoService service;

    @PostMapping
    public ResponseEntity<InsumoEntity> adicionarInsumo(@RequestBody InsumoEntity entity){
        return ResponseEntity.ok(service.adicionarInsumo(entity));
    }

    @GetMapping
    public List<InsumoEntity> listarInsumos(){
        return service.listarInsumos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InsumoEntity> buscarUmInsumo(@PathVariable Long id){
        return ResponseEntity.ok(service.buscaUmInsumo(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<InsumoEntity> atualizarInsumo (@PathVariable Long id, @RequestBody InsumoEntity entity){
        return ResponseEntity.ok(service.atualizarInsumo(id, entity));
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<InsumoEntity> deletarInsumo(@PathVariable Long id){
        service.excluirInsumo(id);
        return ResponseEntity.noContent().build();
    }
}
