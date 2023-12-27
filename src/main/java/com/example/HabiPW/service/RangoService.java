package com.example.HabiPW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HabiPW.model.Rango;
import com.example.HabiPW.repository.RangoRepository;

import java.util.List;

@Service
public class RangoService {

    private final RangoRepository rangoRepository;

    @Autowired
    public RangoService(RangoRepository rangoRepository) {
        this.rangoRepository = rangoRepository;
    }

    public List<Rango> listarTodosLosRangos() {
        return rangoRepository.findAll();
    }
}
