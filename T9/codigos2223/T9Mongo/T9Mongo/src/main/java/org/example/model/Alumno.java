package org.example.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;


import java.util.ArrayList;
import java.util.Objects;


@Getter
@Setter
public class Alumno {

    private ObjectId _id;
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

    public Alumno(ObjectId _id, String nombre, int edad, int telefono, boolean experiencia, ArrayList<String> conocimientos) {
        this._id = _id;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.experiencia = experiencia;
        this.conocimientos = conocimientos;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id='" + _id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                '}';
    }
}
