package org.example.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "profesores")
@Entity
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String correo;
    @Column
    private String titulacion;
    @Column
    private int telefono;
    @Column
    private int sueldo;
    @Column
    private boolean doctorado;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "id_ciclo")
    private Ciclo ciclo;

    public Profesor(String nombre, String apellido, String correo, String titulacion, int telefono, int sueldo, boolean doctorado, Ciclo ciclo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.titulacion = titulacion;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.doctorado = doctorado;
        this.ciclo = ciclo;
    }

    public Profesor(String nombre, String apellido, String correo, String titulacion, int telefono, int sueldo, boolean doctorado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.titulacion = titulacion;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.doctorado = doctorado;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", titulacion='" + titulacion + '\'' +
                ", telefono=" + telefono +
                ", sueldo=" + sueldo +
                ", doctorado=" + doctorado +
                ", ciclo=" + ciclo +
                '}';
    }
}
