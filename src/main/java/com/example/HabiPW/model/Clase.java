package com.example.HabiPW.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "clase")
public class Clase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "nuuid", unique = true, nullable = false)
    private String nuuid;
}
