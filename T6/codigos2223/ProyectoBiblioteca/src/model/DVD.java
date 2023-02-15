package model;

import constantes.EnumDVD;

import java.util.ArrayList;

public class DVD extends Elemento implements Prestable{


    private int anioEdicion;
    private String director;
    private ArrayList<String> actores;
    private EnumDVD tipo;

    public DVD() {
    }

    public DVD(int id, int seccion, String titulo, int anioEdicion, String director, ArrayList<String> actores, EnumDVD tipo) {
        super(id, seccion, titulo);
        this.anioEdicion = anioEdicion;
        this.director = director;
        this.actores = actores;
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año edicion: "+anioEdicion);
        System.out.println("Director: "+director);
        System.out.println("Actores: ");
        tipo.mostrarDatos();
        for ( String item:actores) {
            System.out.println(item);
        }
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    public EnumDVD getTipo() {
        return tipo;
    }

    public void setTipo(EnumDVD tipo) {
        this.tipo = tipo;
    }

    // TODO configurar prestamos
    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }

}
