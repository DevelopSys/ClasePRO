package model;

public class Libre extends Elemento{

    private String isbn;
    private int nPaginas;

    public Libre(){}
    public Libre(String id, String titulo, int tamanio, String formato, Persona autor, String isbn, int nPaginas) {
        super(id, titulo, tamanio, formato, autor);
        this.isbn = isbn;
        this.nPaginas = nPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("isbn = " + isbn);
        System.out.println("nPaginas = " + nPaginas);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
}
