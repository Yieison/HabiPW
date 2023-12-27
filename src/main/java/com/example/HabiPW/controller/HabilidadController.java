package com.example.HabiPW.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.HabiPW.model.Habilidad;
import com.example.HabiPW.service.HabilidadService;

import java.util.List;

@RestController
@RequestMapping("/habilidades")
public class HabilidadController {

    private final HabilidadService habilidadService;

    @Autowired
    public HabilidadController(HabilidadService habilidadService) {
        this.habilidadService = habilidadService;
    }

    @GetMapping
    public List<Habilidad> obtenerTodasLasHabilidades() {
        return habilidadService.listarTodasLasHabilidades();
    }
 // Métodos adicionales para POST, PUT, DELETE
}
