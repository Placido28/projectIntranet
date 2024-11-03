package com.placidotech.intranet.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;


@Entity
@PrimaryKeyJoinColumn(name = "id_estudiante")
@Table(name = "estudiantes")
public class Estudiante extends Persona{


}
