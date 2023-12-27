package com.example.HabiPW.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.HabiPW.model.Jugador;
import com.example.HabiPW.service.JugadorService;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    @GetMapping
    public ResponseEntity<List<Jugador>> obtenerTodosLosJugadores() {
        return ResponseEntity.ok(jugadorService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jugador> obtenerJugadorPorId(@PathVariable Long id) {
        return ResponseEntity.ok(jugadorService.obtenerPorId(id));
    }

    @GetMapping("/clase/{claseId}")
    public ResponseEntity<List<Jugador>> obtenerJugadoresPorClase(@PathVariable Long claseId) {
        return ResponseEntity.ok(jugadorService.obtenerJugadoresPorClase(claseId));
    }

    @PostMapping
    public ResponseEntity<Jugador> registrarJugador(@RequestBody Jugador jugador) {
        return ResponseEntity.ok(jugadorService.registrarJugador(jugador));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Jugador> actualizarJugador(@PathVariable Long id, @RequestBody Jugador jugador) {
        return ResponseEntity.ok(jugadorService.actualizarJugador(id, jugador));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarJugador(@PathVariable Long id) {
        jugadorService.eliminarJugador(id);
        return ResponseEntity.ok().build();
    }
}
