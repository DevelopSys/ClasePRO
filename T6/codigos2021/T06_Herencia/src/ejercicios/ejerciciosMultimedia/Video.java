package ejercicios.ejerciciosMultimedia;

import java.util.ArrayList;

public final class Video extends Multimedia {

    private String director;
    private ArrayList<Actor> actores;

    public Video(int id, String titulo, String autor, String formato,
                 int tamanio, String director) {
        super(id, titulo, autor, formato, tamanio);
        this.director = director;
        this.actores = new ArrayList<>();
    }

    public Video(){
        this.actores = new ArrayList<>();
    }

    public void addActor(Actor actor){
        this.actores.add(actor);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Director: "+director);
        // TODO lista de actores
        System.out.println("Los actores son:");
        for ( Actor itemActor: actores) {
            itemActor.mostrarDatos();
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
