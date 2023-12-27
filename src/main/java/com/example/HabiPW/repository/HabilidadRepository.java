package com.example.HabiPW.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HabiPW.model.Habilidad;

@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad, Long> {
}
