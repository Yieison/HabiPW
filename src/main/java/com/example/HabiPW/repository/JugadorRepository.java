package com.example.HabiPW.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.HabiPW.model.Jugador;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {
    List<Jugador> findByClaseId(Long claseId);
}

