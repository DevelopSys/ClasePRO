package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Profesor implements Serializable {

    private int id;
    private String nombre, correo;
    private int salario;
    private String direccion;

    public Profesor(String nombre, String correo, int salario, String direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.salario = salario;
        this.direccion = direccion;
    }
}
