package controller;

import model.Canterano;
import model.Jugador;
import model.Profesional;
import utils.Posicion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Equipo {


    private String nombre;
    private int presupuesto;
    private ArrayList<Jugador> listaJugadores;

    public Equipo() {
    }

    public Equipo(String nombre, int presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        listaJugadores = new ArrayList<>();
    }

    public void ficharJugador(Jugador jugador) {
        if (jugador instanceof Canterano) {
            listaJugadores.add(jugador);
        } else {
            // el jugador es profesional
            if ( ((Profesional)jugador).getPrecio()<=presupuesto){
                presupuesto -= ((Profesional) jugador).getPrecio();
                listaJugadores.add(jugador);
            } else {
                System.out.println("No puedes fichar porque te pasas del precio");
            }
        }
    }

    public void listarJugadores(){

        for (Jugador jugador :  listaJugadores){
                jugador.mostrarDatos();
        }
    }

    public void listarJugadores(Posicion posicion){

        for (Jugador jugador :  listaJugadores){
            if (jugador.getPosicion() == posicion){
                jugador.mostrarDatos();
            }
        }
    }


}
