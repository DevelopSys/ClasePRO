package miltimedia.model;

public class Elemento {

    // identificador, titulo, autor, tamaño, formato.
    private int id, tamanio;
    // digital, papel
    private String titulo, formato;
    private Persona autor;

    public Elemento() {
    }

    public Elemento(String titulo, Persona autor, String formato, int tamanio) {
        this.tamanio = tamanio;
        this.titulo = titulo;
        this.formato = formato;
        this.autor = autor;
    }

    public void mostrarDatos(){
        System.out.println(titulo);
        System.out.println(autor.getNombre());
        System.out.println(formato);
        System.out.println(tamanio);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
