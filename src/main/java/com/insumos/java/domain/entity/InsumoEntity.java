package com.insumos.java.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table (name = "insumos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InsumoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_insumo")
    private String nomeInsumo;

    @Column(name = "preco_insumo")
    private String precoInsumo;

    @Column(name = "quantidade_insumo")
    private String quantidadeInsumo;

    @Column(name = "data_insumo")
    private LocalDateTime dataCriacao;

    @PrePersist
    public void prePersist(){
        this.dataCriacao = LocalDateTime.now();
    }
}
