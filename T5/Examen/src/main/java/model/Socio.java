package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Socio {

    private String dni, nombre;
    private int telefono;

    public void mostrarDatos(){
        System.out.println("dni = " + dni);
        System.out.println("nombre = " + nombre);
        System.out.println("telefono = " + telefono);
    }

}
