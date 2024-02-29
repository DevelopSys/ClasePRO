package exepctionpersona.model;

import exepctionpersona.utils.EdadException;
import exepctionpersona.utils.NombreException;

public class Persona {

    private String nombre;
    private int edad;


    public Persona() {
    }

    public Persona(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        this.edad = edad;

        if (nombre == null){
            throw new NombreException("usuario con nombre nulo");
        }
        else if (edad<18){
            throw new EdadException("usuario menor de edad");
        }
    }

    public void validarDatos() throws Exception{

        if (nombre == null){
            throw new NombreException("usuario con nombre nulo");
        }
        else if (edad<18){
            throw new EdadException("usuario menor de edad");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
