package clase.ejercicio4.controller;



import clase.ejercicio4.model.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private ArrayList<Persona> listaPersonas;
    final int ID = 1;

    public Agenda() {
        listaPersonas = new ArrayList<>();
    }

    public void listarUsuarios() {
        if (listaPersonas.isEmpty()) {
            System.out.println("La lista no tiene datos");
        } else {
            for (Persona persona : listaPersonas) {
                persona.mostrarDatos();
            }
        }
    }

    private Persona estaUsuario(String dni) {

        for (Persona persona : listaPersonas) {
            if (persona.getDni().equalsIgnoreCase(dni)) {
                // retorno si la persona esta
                return persona;
            }
        }

        // retorno si la persona no esta
        return null;
    }

    public void agregarUsuario(Persona persona) {
        if (estaUsuario(persona.getDni()) == null) {
            listaPersonas.add(persona);
        } else {
            System.out.println("No se puede " +
                    "agregar porque esta en la lista");
        }
    }
    public void buscarUsuario(String dni){
        if (estaUsuario(dni)!=null){
            estaUsuario(dni).mostrarDatos();
        } else {
            System.out.println("la persona no se encuentra");
        }
    }

    public void borrarUsuario(String dni){
        if (estaUsuario(dni)!=null){
            listaPersonas.remove(estaUsuario(dni));
        } else {
            System.out.println("no se puede borrar porque no existe");
        }
    }

    public void editarUsuario(String dni){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime teledono nuevo");
        int telefono = scanner.nextInt();
        System.out.println("Dime nombre nuevo");
        String  nombre = scanner.next();
        if (estaUsuario(dni)!=null){
            estaUsuario(dni).setNombre(nombre);
            estaUsuario(dni).setTelefono(telefono);

        }
    }
}
