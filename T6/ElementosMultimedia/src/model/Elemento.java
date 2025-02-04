package model;

public class Elemento {

    private String id;
    private  String titulo;
    private int tamanio;
    private String formato;
    // TODO clase persona
    private Persona autor;

    public Elemento(String id, String titulo, int tamanio, String formato, Persona autor) {
        this.id = id;
        this.titulo = titulo;
        this.tamanio = tamanio;
        this.formato = formato;
        this.autor = autor;
    }

    public Elemento() {
    }

    public void mostrarDatos(){
        System.out.println("id = " + id);
        System.out.println("titulo = " + titulo);
        System.out.println("tamanio = " + tamanio);
        System.out.println("formato = " + formato);
        System.out.println("Autor = " + autor.getNombre());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }
}
