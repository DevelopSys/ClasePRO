package trabajadores.controller;

import trabajadores.model.Persona;
import trabajadores.model.Responsable;
import trabajadores.model.Trabajador;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Persona> listaPersonas;
    private int numeroVotos;

    public Empresa() {
        listaPersonas = new ArrayList<>();
    }

    public void agregarPersona(Persona p) {
        // restriccion -> por dni
        listaPersonas.add(p);
    }

    public void mostrarTrabajadores() {
        for (Persona persona : listaPersonas) {
            if (persona instanceof Trabajador) {
                persona.mostrarDatos();
            }
        }
    }

    public void buscarPersona(String dni) {
        for (Persona persona : listaPersonas) {
            if (persona.getDni().equals(dni)) {
                persona.mostrarDatos();
            }
        }
    }

    public void realizarVotacion() {
        numeroVotos = 0;
        for (Persona item : listaPersonas) {
            if (item instanceof Responsable) {
                numeroVotos +=
                        ((Responsable) item).emitirVoto((int) (Math.random() * 11));
            }
        }
        System.out.println("La votacion ha sido "+numeroVotos);
    }
}
