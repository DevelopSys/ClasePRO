package ejercicios.ejericcioInterfaces;

public abstract class Elemento {

    protected int identificador, tamanio;
    protected String titulo, autor,formato;

    public Elemento(int identificador, int tamanio, String titulo, String autor, String formato) {
        this.identificador = identificador;
        this.tamanio = tamanio;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
    }

    public Elemento(){}

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
