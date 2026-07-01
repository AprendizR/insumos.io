package com.insumos.java.domain.service;

import com.insumos.java.domain.entity.ReceitaEntity;
import com.insumos.java.domain.repository.ReceitaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReceitaService {
    private final ReceitaRepository receitaRepository;

    public ReceitaEntity criarReceita(ReceitaEntity entity) {
        if (entity.getId() != null) {
            receitaRepository.findById(entity.getId()).orElseThrow(() -> new RuntimeException("Receita não encontrada"));
        }
        return receitaRepository.save(entity);
    }
}
