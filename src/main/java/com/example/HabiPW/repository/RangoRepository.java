package com.example.HabiPW.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HabiPW.model.Rango;

@Repository
public interface RangoRepository extends JpaRepository<Rango, Long> {
}
