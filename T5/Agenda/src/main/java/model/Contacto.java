package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Contacto {

    private String dni, nombre, apellido;
    private int telefono;

    public Contacto(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarDatos(){
        System.out.println("dni = " + dni);
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("telefono = " + telefono);
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
