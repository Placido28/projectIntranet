package com.placidotech.intranet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "carreras")
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrera")
    private Long idCarrera;

    @Column(name = "nombre_carrera")
    private String nombreCarrera;

    @OneToMany(mappedBy = "carrera", cascade = CascadeType.ALL)
    private List<Curso> cursos;
}
