package com.placidotech.intranet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long idCurso;

    private String descripcion;

    private int creditos;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private Set<Prerrequisito> prerrequisitos;

    @ManyToOne
    @JoinColumn(name = "id_carrera")
    private Carrera carrera;
}
