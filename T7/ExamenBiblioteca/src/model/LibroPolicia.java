package model;

import utils.Tipo;

public final class LibroPolicia extends Libro{

    private String personajes;
    private Tipo tipo;

    public LibroPolicia() {

    }

    public LibroPolicia(int isbn, int nPAginas, String autor, String personajes, Tipo tipo) {
        super(isbn, nPAginas, autor);
        this.personajes = personajes;
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("personajes = " + personajes);
        System.out.println("tipo = " + tipo.name());
    }

    public String getPersonajes() {
        return personajes;
    }

    public void setPersonajes(String personajes) {
        this.personajes = personajes;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
