package ejercicios.ejercicioAgenda;

import java.util.ArrayList;

public class Persona {

    private String nombre, dni;
    private int telefono;
    ArrayList agenda;

    public Persona(){

    }

    public Persona(String nombre, String dni, int telefono)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }


    public void mostrarDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Teléfono: "+this.telefono);
        System.out.println("DNI: "+this.dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
