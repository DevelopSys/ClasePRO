package model;

import java.util.ArrayList;

public class Video extends Elemento{
    private Persona director;
    private ArrayList<Persona> actores;

    public Video() {
    }

    public Video(String id, String titulo, int tamanio, String formato, Persona autor,
                 Persona director, ArrayList<Persona> actores) {
        super(id, titulo, tamanio, formato, autor);
        this.director = director;
        this.actores = actores;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("director = " + director.getNombre());
        for (Persona item: actores) {
            System.out.println("nombre actor = " + item.getNombre());
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
