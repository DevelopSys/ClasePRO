package miltimedia.model;

public final class Libro extends Elemento{

    private String Isbn;
    private int nPaginas;

    public Libro() {
    }

    public Libro(String titulo, Persona autor, String formato,
                 int tamanio, String isbn, int nPaginas) {
        super(titulo, autor, formato, tamanio);
        Isbn = isbn;
        this.nPaginas = nPaginas;
    }
    

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
}
