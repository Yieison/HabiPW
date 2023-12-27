package com.example.HabiPW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HabiPW.model.Clase;
import com.example.HabiPW.repository.ClaseRepository;

import java.util.List;

@Service
public class ClaseService {

    private final ClaseRepository claseRepository;

    @Autowired
    public ClaseService(ClaseRepository claseRepository) {
        this.claseRepository = claseRepository;
    }

    public List<Clase> listarTodasLasClases() {
        return claseRepository.findAll();
    }
}

