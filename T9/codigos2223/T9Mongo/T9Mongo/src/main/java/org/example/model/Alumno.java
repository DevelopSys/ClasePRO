package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Getter
@Setter
public class Alumno {

    private String id;
    private String nombre;
    private int edad, telefono;
    private boolean experiencia;

    private ArrayList<String> conocimientos;

    public Alumno() {
        conocimientos = new ArrayList<>();
    }

    public Alumno(String nombre, int edad, int telefono, boolean experiencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.experiencia = experiencia;
        this.conocimientos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                '}';
    }
}
