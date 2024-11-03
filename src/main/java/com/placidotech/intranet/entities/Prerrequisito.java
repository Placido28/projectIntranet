package com.placidotech.intranet.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "prerrequisito")
public class Prerrequisito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pre;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "id_prerrequisito_curso")
    private Curso prerrequisitoCurso;
}
