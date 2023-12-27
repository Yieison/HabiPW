package com.example.HabiPW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HabiPW.model.Habilidad;
import com.example.HabiPW.repository.HabilidadRepository;

import java.util.List;

@Service
public class HabilidadService {

    private final HabilidadRepository habilidadRepository;

    @Autowired
    public HabilidadService(HabilidadRepository habilidadRepository) {
        this.habilidadRepository = habilidadRepository;
    }

    public List<Habilidad> listarTodasLasHabilidades() {
        return habilidadRepository.findAll();
    }
}
