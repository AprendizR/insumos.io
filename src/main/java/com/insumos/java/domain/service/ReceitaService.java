package com.insumos.java.domain.service;

import com.insumos.java.domain.entity.InsumoEntity;
import com.insumos.java.domain.entity.ItemReceitaEntity;
import com.insumos.java.domain.entity.ReceitaEntity;
import com.insumos.java.domain.repository.InsumoRepository;
import com.insumos.java.domain.repository.ReceitaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReceitaService {
    private final ReceitaRepository receitaRepository;
    private final InsumoRepository insumoRepository;

    public ReceitaEntity adicionarReceita(ReceitaEntity entity) {
        buscaUmaReceita(entity.getId());
        return receitaRepository.save(entity);
    }

    public List<ReceitaEntity> listarReceitas(){
        return receitaRepository.findAll();
    }

    public ReceitaEntity buscaUmaReceita(Long id){
        return receitaRepository.findById(id).orElseThrow(()-> new RuntimeException("Receita não encontrada"));
    }

    public ReceitaEntity atualizaReceita(Long id, ReceitaEntity entity){
        ReceitaEntity receita = buscaUmaReceita(id);
        if (entity.getTempoGas() != null){
            receita.setTempoGas(entity.getTempoGas());
        }
        if (entity.getTempoEnergia() != null) {
            receita.setTempoEnergia(entity.getTempoEnergia());
        }
        if (entity.getIngredientes() != null){
            receita.setIngredientes(entity.getIngredientes());
        }
        return receitaRepository.save(receita);
    }

    public void excluirReceita(Long id){
        buscaUmaReceita(id);
        receitaRepository.deleteById(id);
    }
}
