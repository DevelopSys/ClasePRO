package controller;

import model.Persona;
import model.Seleccionable;
import model.Seleccionador;
import model.Top;

import java.util.ArrayList;

public class Seleccion {

    private String nombre;
    private Seleccionador seleccionador;
    private ArrayList<Seleccionable> listaJugadores;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        listaJugadores = new ArrayList<>();
    }

    public void contratarSeleccionador(Seleccionador seleccionador) {
        this.seleccionador = seleccionador;
    }

    public void llamarJugador(Seleccionable seleccionable) {
        if (seleccionador != null) {
            //   solo puede existir una estrella
            // profesional -> lista
            // top
                // ya hay -> no hago nada
                // no hay -> meto en la lista
            if (seleccionable instanceof Top && getNumeroTops() > 0) {
                System.out.println("No puedes, ya cuentas con un jugador TOP");
            } else {
                seleccionable.seleccionar();
                listaJugadores.add(seleccionable);
            }
        } else {
            System.out.println("No cuentas con seleccionador, por lo tanto no puedes llamar a jugadores");
        }
    }

    public void listarJugadores(){
        for (Seleccionable item :  listaJugadores){
            ((Persona)item).mostrarDatos();
        }
    }

    private int getNumeroTops() {
        for (Seleccionable item : listaJugadores) {
            if (item instanceof Top) {
                return 1;
            }
        }

        return 0;
    }
}
