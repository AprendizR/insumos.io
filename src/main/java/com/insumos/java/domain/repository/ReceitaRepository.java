package com.insumos.java.domain.repository;

import com.insumos.java.domain.entity.ReceitaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<ReceitaEntity, Long> {
}
