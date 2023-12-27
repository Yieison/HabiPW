package com.example.HabiPW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HabiPW.model.Jugador;
import com.example.HabiPW.repository.JugadorRepository;

import java.util.List;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public List<Jugador> listarTodos() {
        return jugadorRepository.findAll();
    }

    public Jugador obtenerPorId(Long id) {
        return jugadorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jugador no encontrado"));
    }

    public List<Jugador> obtenerJugadoresPorClase(Long claseId) {
        return jugadorRepository.findByClaseId(claseId);
    }

    public Jugador registrarJugador(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public Jugador actualizarJugador(Long id, Jugador jugadorActualizado) {
        Jugador jugador = jugadorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jugador no encontrado"));

        jugador.setNombre(jugadorActualizado.getNombre());
        jugador.setClase(jugadorActualizado.getClase());
        // ... otros campos a actualizar

        return jugadorRepository.save(jugador);
    }

    public void eliminarJugador(Long id) {
        jugadorRepository.deleteById(id);
    }
}
