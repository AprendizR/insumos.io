package com.insumos.java.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "vendas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VendaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_produto")
    private String nomeProduto;

    @Column(name = "forma_pagamento")
    private String formaPagamento;

    @Column(name = "preco_venda")
    private String precoVenda;

    @Column(name = "data_venda")
    private LocalDateTime dataVenda;

    @PrePersist
    public void prePersist() {
        this.dataVenda = LocalDateTime.now();
    }
}
