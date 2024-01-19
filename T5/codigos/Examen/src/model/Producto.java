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
public class Producto implements Serializable {

    private String nombre;
    private double precio;

    public void mostrarDatos(){
        System.out.println("Nombre "+nombre);
        System.out.println("Precio "+precio);
    }

}
