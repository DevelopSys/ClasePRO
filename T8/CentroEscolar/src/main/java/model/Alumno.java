package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.annotation.Repeatable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    private long id;
    private String nombre;
    private String apellido;
    private String correo;
    private int telefono;

    public Alumno(String nombre, String apellido, String correo, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }
}
