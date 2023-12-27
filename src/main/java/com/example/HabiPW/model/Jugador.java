package com.example.HabiPW.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "jugador")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "descripcion")
    private String descripcion;

    // Assuming 'clase' is another entity related to 'jugador'
    @ManyToOne
    @JoinColumn(name = "clase_id", referencedColumnName = "id")
    private Clase clase;

    @Column(name = "genero")
    private String genero;

    // Assuming 'rango' is another entity related to 'jugador'
    @ManyToOne
    @JoinColumn(name = "rango_id", referencedColumnName = "id")
    private Rango rango;

    @ManyToMany
    @JoinTable(
        name = "habilidad_jugador",
        joinColumns = @JoinColumn(name = "jugador_id"),
        inverseJoinColumns = @JoinColumn(name = "habilidad_id")
    )
    private Set<Habilidad> habilidades;

    @Column(name = "nuuid", unique = true, nullable = false)
    private String nuuid;
}
