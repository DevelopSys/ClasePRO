package model;

public abstract class Libro {

    private int isbn, nPaginas;
    private String autor;

    public Libro() {
    }

    public Libro(int isbn, int nPAginas, String autor) {
        this.isbn = isbn;
        this.nPaginas = nPAginas;
        this.autor = autor;
    }

    public void mostrarDatos(){
        System.out.println("isbn = " + isbn);
        System.out.println("nPaginas = " + nPaginas);
        System.out.println("autor = " + autor);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getnPAginas() {
        return nPaginas;
    }

    public void setnPAginas(int nPAginas) {
        this.nPaginas = nPAginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
