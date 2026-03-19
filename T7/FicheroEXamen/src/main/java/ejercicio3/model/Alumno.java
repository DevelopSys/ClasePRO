package ejercicio3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    private String nombre, apellido, dni;
    private int nota;

    public void mostrarDatos(){
        System.out.println(nombre + " "+ nota);
    }
}
