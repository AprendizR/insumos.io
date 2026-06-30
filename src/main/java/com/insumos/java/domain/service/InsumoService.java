package com.insumos.java.domain.service;

import com.insumos.java.domain.entity.InsumoEntity;
import com.insumos.java.domain.repository.InsumoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InsumoService {
    private final InsumoRepository repository;

    public InsumoEntity adicionarInsumo(InsumoEntity entity) {
        if (entity.getId() != null) {
            repository.findById(entity.getId()).orElseThrow(() -> new RuntimeException("Insumo já cadastrado"));
        }
        return repository.save(entity);
    }

    public List<InsumoEntity> listarInsumos() {
        return repository.findAll();
    }

    public InsumoEntity buscaUmInsumo(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Insumo inexistente"));
    }

    public InsumoEntity atualizarInsumo(Long id, InsumoEntity entity) {
        InsumoEntity insumo = repository.findById(id).orElseThrow(() -> new RuntimeException("Insumo inexistente"));
        if (entity.getNomeInsumo() != null) {
            insumo.setNomeInsumo(entity.getNomeInsumo());
        }
        if (entity.getPrecoInsumo() != null) {
            insumo.setPrecoInsumo(entity.getPrecoInsumo());
        }
        if (entity.getQuantidadeInsumo() != null){
            insumo.setQuantidadeInsumo(entity.getQuantidadeInsumo());
        }
        return repository.save(insumo);
    }

    public void excluirInsumo(Long id){
        repository.findById(id).orElseThrow(()-> new RuntimeException("Insumo inexistente"));
        repository.deleteById(id);
    }
}