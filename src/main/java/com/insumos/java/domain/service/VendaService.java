package com.insumos.java.domain.service;

import com.insumos.java.domain.entity.VendaEntity;
import com.insumos.java.domain.repository.VendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VendaService {
    private final VendaRepository repository;

    public VendaEntity criarVenda(VendaEntity entity) {
        if (entity.getId() != null) {
            repository.findById(entity.getId()).orElseThrow(() -> new RuntimeException("Venda já realizada"));
        }
        return repository.save(entity);
    }

    public List<VendaEntity> listarVendas() {
        return repository.findAll();
    }

    public VendaEntity buscaUmaVenda(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Venda não encontrada"));
    }

    public VendaEntity atualizarVenda(Long id, VendaEntity entity) {
        VendaEntity venda = repository.findById(id).orElseThrow(() -> new RuntimeException("Venda não encontrada"));
        if (entity.getNomeProduto() != null) {
            venda.setNomeProduto(entity.getNomeProduto());
        }
        if (entity.getFormaPagamento() != null) {
            venda.setFormaPagamento(entity.getFormaPagamento());
        }
        if (entity.getPrecoVenda() != null) {
            venda.setPrecoVenda(entity.getPrecoVenda());
        }
        return repository.save(venda);
    }

    public void excluirVenda(Long id) {
        repository.findById(id).orElseThrow(() -> new RuntimeException("Venda não encontrada"));
        repository.deleteById(id);
    }
}
