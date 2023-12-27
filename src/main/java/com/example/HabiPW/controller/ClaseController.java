package com.example.HabiPW.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.HabiPW.model.Clase;
import com.example.HabiPW.service.ClaseService;

import java.util.List;

@RestController
@RequestMapping("/clases")
public class ClaseController {

    private final ClaseService claseService;

    @Autowired
    public ClaseController(ClaseService claseService) {
        this.claseService = claseService;
    }

    @GetMapping
    public List<Clase> obtenerTodasLasClases() {
        return claseService.listarTodasLasClases();
    }

    // Métodos adicionales para POST, PUT, DELETE
}
