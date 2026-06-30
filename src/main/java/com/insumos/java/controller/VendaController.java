package com.insumos.java.controller;

import com.insumos.java.domain.service.VendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/venda")

public class VendaController {
    private final VendaService service;
}
