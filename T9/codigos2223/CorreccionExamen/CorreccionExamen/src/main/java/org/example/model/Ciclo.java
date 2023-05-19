package org.example.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ciclos")
@Entity
@Data

public class Ciclo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;

    @Column
    private String siglas;

    // Alumno - ciclo
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ciclo")
    private List<Alumno> listaAlumnos;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ciclo")
    private Profesor profesor;

    public Ciclo(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    @Override
    public String toString() {
        return "Ciclo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", siglas='" + siglas + '\'' +
                ", listaAlumnos=" + listaAlumnos +
                ", profesor=" + profesor +
                '}';
    }
}
