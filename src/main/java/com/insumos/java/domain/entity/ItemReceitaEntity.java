package com.insumos.java.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item_receita")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ItemReceitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "insumo_id")
    private InsumoEntity insumo;

    @Column (name = "quantidade_usada")
    private Double quantidadeUsada;
}
