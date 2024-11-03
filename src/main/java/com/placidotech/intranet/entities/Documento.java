package com.placidotech.intranet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tipo_documento")
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_documento;

    private String tipo;
    private String numero;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
}
