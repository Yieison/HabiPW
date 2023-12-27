package com.example.HabiPW.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "habilidad")
public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rango_id", referencedColumnName = "id")
    private Rango rango; // Relationship to Rango entity

    @Column(name = "nuuid", unique = true, nullable = false)
    private String nuuid;
}
