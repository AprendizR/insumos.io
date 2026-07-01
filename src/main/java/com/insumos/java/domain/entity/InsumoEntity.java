package com.insumos.java.domain.entity;

import com.insumos.java.domain.Enum.UnidadeMedidaEnum;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "insumos")
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

    @Column(name = "quantidade_atual")
    private Double quantidadeAtual;

    @Enumerated(EnumType.STRING)
    @Column(name = "unidade_medida")
    private UnidadeMedidaEnum unidadeMedida;

    @Column(name = "custo_medio_unitario")
    private Double custoMedioUnitario;

    @Column(name = "data_insumo", updatable = false)
    private LocalDateTime dataCriacao;

    @PrePersist
    public void prePersist(){
        this.dataCriacao = LocalDateTime.now();
    }
}
