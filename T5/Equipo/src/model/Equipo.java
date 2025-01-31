package model;

import java.util.ArrayList;

public class Equipo {

    private ArrayList<Jugador> plantilla;
    private String nombre;
    private int nivelAtaque, nivelMedio, nivelDefensa;
    private int goles;

    public Equipo(){}
    public Equipo(String nombre){
        this.nombre = nombre;
        this.nivelAtaque = (int) (Math.random()*101);
        this.nivelDefensa = (int) (Math.random()*101);
        this.nivelMedio = (int) (Math.random()*101);
        this.plantilla = new ArrayList<>();
        // this.goles =0;
    }
    public Equipo(String nombre, int ataque, int defensa, int medio){
        this.nombre = nombre;
        this.nivelAtaque = ataque;
        this.nivelMedio = medio;
        this.nivelDefensa = defensa;
        this.plantilla = new ArrayList<>();
    }
    public boolean atacar(){
        /*
        Retornará true (se ha metido gol)
        si el resultado de la operación
        de (nivelAtaque * (aleatorio entre 0-1)
        + (nivelCentro * aleatorio entre 0-1)/2)
        es superior a 90. Además sumará uno a la variable goles
         */
        double resultado = (nivelAtaque * Math.random()*1) + (nivelMedio * Math.random()*1)/2;
        System.out.println("El resultado del ataque es "+resultado);
        if (resultado>85){
            goles++;
            return true;
        }

        return false;
    }

    public void listarDelanteros(){
        for ( Jugador item : plantilla) {
            if (item.isEstrella()){
                item.mostrarDatos();
            }
        }
    }
    public void mostarDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Ataque: "+this.nivelAtaque);
        System.out.println("Medio: "+this.nivelMedio);
        System.out.println("Defensa: "+this.nivelDefensa);
        System.out.println("Goles: "+this.goles);
    }
    public void ficharJugador(Jugador jugador){
        this.plantilla.add(jugador);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelMedio() {
        return nivelMedio;
    }

    public void setNivelMedio(int nivelMedio) {
        this.nivelMedio = nivelMedio;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
