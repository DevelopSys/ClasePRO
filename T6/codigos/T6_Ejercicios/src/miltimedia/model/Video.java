package miltimedia.model;

import java.util.ArrayList;

public final class Video extends Elemento {

    private Persona director;
    private ArrayList<Persona> actores;

    public Video() {
    }

    public Video(String titulo, Persona autor, String formato, int tamanio,
                 Persona director, ArrayList<Persona> actores) {
        super(titulo, autor, formato, tamanio);
        this.director = director;
        this.actores = actores;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(director.getNombre());
        for (Persona persona: actores) {
            System.out.println(persona.getNombre());
        }
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }
}
