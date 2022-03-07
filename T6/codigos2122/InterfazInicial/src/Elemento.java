public abstract class Elemento {

    protected String identificador, titulo, autor,  formato;
    protected  int tamaño;


    public Elemento() {
    }
    public Elemento(String identificador, String titulo, String autor, String formato, int tamaño) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.tamaño = tamaño;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
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

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}
