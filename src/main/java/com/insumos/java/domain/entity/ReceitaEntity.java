package com.insumos.java.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private int tempoGas;

    @Column(name = "tempo_energia")
    private int tempoEnergia;

    @Column(name = "valor_receita")
    private double valorReceita;

    @OneToMany
    @JoinColumn(name = "insumo_id")
    private List<InsumoEntity> insumo;

    @OneToMany
    @JoinColumn(name = "venda_id")
    private List<VendaEntity> venda;

}
