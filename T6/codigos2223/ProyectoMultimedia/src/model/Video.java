package model;

import java.util.ArrayList;

public final class Video extends Elemento{

    private String director;
    private ArrayList<Actor> actores;

    public Video() {
    }

    public Video(int id, String titulo, int tamanio, String formato, String autor, String director, ArrayList<Actor> actores) {
        super(id, titulo, tamanio, formato, autor);
        this.director = director;
        this.actores = actores;
    }

    @Override
    protected void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Director: "+director);
        System.out.println("Los actores del reparto son:");
        for ( Actor item : actores) {
            item.mostrarDatos();
        }

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Actor> actores) {
        this.actores = actores;
    }
}
