package controller;

import model.Coche;

import java.util.ArrayList;

public class Carrera {

    private int vueltas;
    private String nombre;
    private Coche ganador;
    private ArrayList<Coche> participantes;

    public Carrera(int vueltas, String nombre){
        this.nombre = nombre;
        this.vueltas = vueltas;
        participantes = new ArrayList<>();
    }

    public void inscribirParticipante(Coche coche){
        // si ya hay 8, si tienes mas de 300cv -> no agrego
        if (participantes.size()==8 || coche.getCv()>=300){
            System.out.println("Lo siento no puedes inscribir");
        } else {
        // agrego
            participantes.add(coche);
            System.out.println("Agregado con exito");
        }

    }

    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche getGanador() {
        return ganador;
    }

    public void setGanador(Coche ganador) {
        this.ganador = ganador;
    }

    public ArrayList<Coche> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Coche> participantes) {
        this.participantes = participantes;
    }
}
