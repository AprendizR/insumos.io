package com.insumos.java.domain.repository;

import com.insumos.java.domain.entity.VendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<VendaEntity, Long> {
}
