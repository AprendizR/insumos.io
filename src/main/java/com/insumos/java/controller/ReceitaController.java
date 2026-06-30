package com.insumos.java.controller;

import com.insumos.java.domain.service.ReceitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/receita")

public class ReceitaController {
    private final ReceitaService service;
}
