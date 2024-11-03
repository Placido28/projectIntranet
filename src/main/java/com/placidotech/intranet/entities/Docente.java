package com.placidotech.intranet.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;



@Entity
@PrimaryKeyJoinColumn(name = "id_docente")
@Table(name = "docentes")
public class Docente extends Persona{
}
