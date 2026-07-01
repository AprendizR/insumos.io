package com.insumos.java.controller;

import com.insumos.java.domain.entity.VendaEntity;
import com.insumos.java.domain.service.VendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/venda")

public class VendaController {
    private final VendaService service;

    @PostMapping
    public ResponseEntity<VendaEntity> criarVenda(@RequestBody VendaEntity entity) {
        return ResponseEntity.ok(service.criarVenda(entity));
    }

    @GetMapping
    public List<VendaEntity> listarVendas() {
        return service.listarVendas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VendaEntity> buscaUmaVenda(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscaUmaVenda(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<VendaEntity> atualizarVenda(@PathVariable Long id, @RequestBody VendaEntity entity) {
        return ResponseEntity.ok(service.atualizarVenda(id, entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<VendaEntity> deletarVenda(@PathVariable Long id) {
        service.excluirVenda(id);
        return ResponseEntity.noContent().build();
    }
}
