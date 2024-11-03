package com.placidotech.intranet.entities;

import com.placidotech.intranet.enums.EstadoCivil;
import com.placidotech.intranet.enums.Genero;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "personas")
public abstract class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long idPersona;

    private String nombre;

    @Column(name = "a_paterno")
    private String aPaterno;

    @Column(name = "a_materno")
    private String aMaterno;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Documento> documentos;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @OneToOne
    private Direccion direccion;

    private String email;

    @Column(name = "tlf_movil")
    private String tlfMovil;

    @Column(name = "tlf_fijo")
    private String tlfFijo;

    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;
}
