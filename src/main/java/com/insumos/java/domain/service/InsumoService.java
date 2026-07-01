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
        buscarUmInsumo(entity.getId());
        if (entity.getQuantidadeAtual() == null){
            entity.setQuantidadeAtual(0.0);
        }
        if (entity.getCustoMedioUnitario() == null){
            entity.setCustoMedioUnitario(0.0);
        }
        return repository.save(entity);
    }

    public List<InsumoEntity> listarInsumos() {
        return repository.findAll();
    }

    public InsumoEntity buscarUmInsumo(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Insumo não encontrado"));
    }

    public InsumoEntity atualizarInsumo(Long id, InsumoEntity entity) {
        InsumoEntity insumo = buscarUmInsumo(id);
        if (entity.getNomeInsumo() != null) {
            insumo.setNomeInsumo(entity.getNomeInsumo());
        }
        if (entity.getUnidadeMedida() != null) {
            insumo.setUnidadeMedida(entity.getUnidadeMedida());
        }
        return repository.save(insumo);
    }

    public void atualizarSaldo(Long id, Double novaQuantidade, Double novoCustoMedio) {
        InsumoEntity insumo = buscarUmInsumo(id);
        insumo.setQuantidadeAtual(novaQuantidade);
        insumo.setCustoMedioUnitario(novoCustoMedio);
        repository.save(insumo);
    }

    public void excluirInsumo(Long id) {
        buscarUmInsumo(id);
        repository.deleteById(id);
    }
}