package com.example.HabiPW.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HabiPW.model.Clase;

@Repository
public interface ClaseRepository extends JpaRepository<Clase, Long> {
}

