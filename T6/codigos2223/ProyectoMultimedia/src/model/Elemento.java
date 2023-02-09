package model;

public abstract class Elemento {

    private int id;
    private String titulo;
    private int tamanio;
    private String formato, autor;

    public Elemento() {
    }

    public Elemento(int id, String titulo, int tamanio, String formato, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.tamanio = tamanio;
        this.formato = formato;
        this.autor = autor;
    }

    protected void mostrarDatos(){
        System.out.println("ID: "+id);
        System.out.println("Titulo: "+titulo);
        System.out.println("Tamaño: "+tamanio);
        System.out.println("Formato: "+formato);
        System.out.println("Autor: "+autor);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
