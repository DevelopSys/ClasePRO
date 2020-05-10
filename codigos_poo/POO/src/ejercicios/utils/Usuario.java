package ejercicios.utils;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre, apellido, DNI;
    private int telefono, edad;
    private int intentos;

    public Usuario(String nombre, int intentos) {
        this.nombre = nombre;
        this.intentos = intentos;
    }

    public Usuario(String nombre, String apellido, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Usuario(String nombre, String apellido, String DNI, int telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
        this.edad = edad;
    }

    public Usuario() {
    }


    public String formatoJuego(){
        return getNombre()+ ","+getIntentos();
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", telefono=" + telefono +
                ", edad=" + edad +
                '}';
    }
}
