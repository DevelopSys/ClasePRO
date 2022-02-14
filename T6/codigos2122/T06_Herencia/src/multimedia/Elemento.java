package multimedia;

public abstract class Elemento {

    protected String id, titulo, autor, tamanio, formato;

    public Elemento(){}

    public Elemento(String id, String titulo, String autor, String tamanio, String formato) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tamanio = tamanio;
        this.formato = formato;
    }

    public void mostrarDatos(){
        System.out.println("ID "+id);
        System.out.println("Titulo "+titulo);
        System.out.println("Autor "+autor);
        System.out.println("Tamaño "+tamanio);
        System.out.println("Formato "+formato);
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
