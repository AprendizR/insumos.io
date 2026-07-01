package com.insumos.java.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "receitas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ReceitaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tempo_gas")
    private Double tempoGas;

    @Column(name = "tempo_energia")
    private Double tempoEnergia;

    @Column(name = "custo_total")
    private Double custoTotal;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "receita_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<ItemReceitaEntity> ingredientes = new ArrayList<>();

}
