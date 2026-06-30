package com.insumos.java.domain.repository;

import com.insumos.java.domain.entity.InsumoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsumoRepository extends JpaRepository<InsumoEntity, Long> {
}
