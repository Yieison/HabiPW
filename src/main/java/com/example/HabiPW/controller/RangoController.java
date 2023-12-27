package com.example.HabiPW.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.HabiPW.model.Rango;
import com.example.HabiPW.service.RangoService;

import java.util.List;

@RestController
@RequestMapping("/rangos")
public class RangoController {

    private final RangoService rangoService;

    @Autowired
    public RangoController(RangoService rangoService) {
        this.rangoService = rangoService;
    }

    @GetMapping
    public List<Rango> obtenerTodosLosRangos() {
        return rangoService.listarTodosLosRangos();
    }

    // Métodos adicionales para POST, PUT, DELETE
}
