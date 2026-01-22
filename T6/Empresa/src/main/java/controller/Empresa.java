package controller;

import lombok.Data;
import model.*;

import java.util.HashMap;

@Data
public class Empresa {

    private HashMap<String, Persona> listaUsuarios;

    public Empresa() {
        listaUsuarios = new HashMap<>();
        Director director = new Director("Director1", "Apellido1", "1234A", 100);
        listaUsuarios.put(director.getDni(), director);
    }

    // mostrar los datos de todos las personas
    public void mostrarDatos() {
        for (Persona persona : listaUsuarios.values()) {
            persona.mostrarDatos();
        }

        /*for (String key: listaUsuarios.keySet()) {
            Persona persona = listaUsuarios.get(key)
            persona.mostrarDatos();
            listaUsuarios.get(key).mostrarDatos();
        }*/
    }

    // mostrar salario de los trabajadores
    public void mostrarSalarios() {
        for (Persona persona : listaUsuarios.values()) {
            if (persona instanceof Trabajador) {
                ((Trabajador) persona).calcularBruto();
                ((Trabajador) persona).calcularNeto();
            }
        }
    }

    // mostrar salario de un usuario
    public void mostrarSalarios(String dni) {
        if (listaUsuarios.containsKey(dni)) {
            Persona persona = listaUsuarios.get(dni);
            if (persona instanceof Trabajador) {
                ((Trabajador) persona).calcularNeto();
                ((Trabajador) persona).calcularBruto();
            } else {
                System.out.println("No es un trabajador, no tiene sueldo");
            }
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    // se le concede la ayuda a todos los autonomos
    public void darAyuda() {
        for (Persona persona : listaUsuarios.values()) {
            if (persona instanceof Autonomo) {
                ((Autonomo) persona).pedirAyuda();
            }
        }
    }

    // se le concede la ayuda a un autonomo mediante dni
    public void darAyuda(String dni) {
        if (listaUsuarios.containsKey(dni)) {
            Persona persona = listaUsuarios.get(dni);
            if (persona instanceof Autonomo) {
                ((Autonomo) persona).pedirAyuda();
            }
        } else {
            System.out.println("No esta en la lista");
        }
    }

    // TODO bajar sueldo pendiente para interfaz

    public void contratarTrabajador(String dniJefe, Trabajador trabajador) {
        // añade a la lista
        // lista -> ok
        // trabajador -> lo que voy a añadir
        // jefe -> que de el ok
        if (listaUsuarios.containsKey(dniJefe)) {
            Persona jefe = listaUsuarios.get(dniJefe);
            if (jefe instanceof Jefe
                    && !listaUsuarios.containsKey(trabajador.getDni())
                    && !(trabajador instanceof Jefe)
                    && ((Jefe) jefe).contratarTrabajador(trabajador)
            ) {
                System.out.println("La contratacion se da correctamente, bienvenido");
                listaUsuarios.put(trabajador.getDni(), trabajador);
            } else {
                System.out.println("Fallo en el proceso");
            }


        } else {
            System.out.println("Jefe no encontrado, el trabajador no se puede contratar");
        }
    }

    public void subirSalario() {
        for (Persona persona : listaUsuarios.values()) {
            if (persona instanceof Regulador) {
                // recorrer y sacar solo los trabajadores
                for (Persona persona1 : listaUsuarios.values()) {
                    if (persona1 instanceof Trabajador && !(persona1 instanceof Jefe)) {
                        ((Regulador) persona).subirSalario((Trabajador) persona1, (int) (Math.random()*1000)+500);
                    }
                }
                break;

            }
        }
    }

}
