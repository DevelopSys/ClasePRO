package model;

import utils.CatalogoException;

import java.util.ArrayList;

public class Biblioteca<T extends Libro>{

    private Catalogo catalogo;
    private String director, nombre;

    public Biblioteca() {
    }

    public Biblioteca(String director, String nombre) {
        this.director = director;
        this.nombre = nombre;
    }

    public void construirCatalogo(int tamanio){
        if (catalogo!=null){
            // error
        } else {
            catalogo = new Catalogo(tamanio);
        }
    }

    public void comprarLibro(T libro) {
        try {
        catalogo.addLibro(libro);
        } catch (NullPointerException e){
            System.out.println("Catalogo nulo, no se puede realizar");
        } catch (CatalogoException e){
            System.out.println(e.getMessage());
        }
    }

    public void buscarLibro(int isbn) {
        try {
            catalogo.estaLibro(isbn).mostrarDatos();
        } catch (NullPointerException e){
            System.out.println("Catalogo o resultado nulo, no se puede realizar");
        }
    }

    public void retirarLibro(int isbn) {
        try {
            catalogo.sacarLibro(isbn);
        } catch (NullPointerException e){
            System.out.println("Catalogo nulo, no se puede realizar");
        }
    }
    public void listarLibros(){
        try {
        catalogo.mostrarLibros();

        } catch (NullPointerException e){
            System.out.println("Catalogo nulo, imposible continuar");
        }
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    class Catalogo{

        int numeroPosiciones;
        ArrayList<T> listaLibros;

        public Catalogo(int numeroPosiciones) {
            this.numeroPosiciones = numeroPosiciones;
            listaLibros = new ArrayList<T>();
        }

        public void addLibro(T libro) throws CatalogoException {
            if (estaLibro(libro.getIsbn())!=null || numeroPosiciones==listaLibros.size()){
                throw new CatalogoException("Error en el proceso");
            } else {
                listaLibros.add(libro);
            }
        }

        public void getLibro(int isbn){
            if (estaLibro(isbn)!=null){
                estaLibro(isbn).mostrarDatos();
            } else{
                System.out.println("no esta el libro");
            }
        }

        public void sacarLibro(int isbn){
            if (estaLibro(isbn)!=null){
                listaLibros.remove(estaLibro(isbn));
            } else{
                System.out.println("no esta el libro");
            }
        }

        public void mostrarLibros(){
            for (T libro: listaLibros){
                libro.mostrarDatos();
            }
        }

        private T estaLibro(int isbn){

            for (T libro:  listaLibros ){
                if (libro.getIsbn() == isbn){
                    return libro;
                }
            }
            return null;
        }

        public void getNumeroActuales(){
            System.out.println("La cantidad de libros en catalogo es de" + listaLibros.size());
            System.out.println("Tienes huecos libres: " + (numeroPosiciones-listaLibros.size()));
        }

        public int getNumeroPosiciones() {
            return numeroPosiciones;
        }

        public void setNumeroPosiciones(int numeroPosiciones) {
            this.numeroPosiciones = numeroPosiciones;
        }
    }
}
