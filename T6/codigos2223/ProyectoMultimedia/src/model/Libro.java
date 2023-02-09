package model;

public final class Libro extends Elemento {

    private String ISBN;
    private int numeroPaginas;

    public Libro() {
    }

    public Libro(int id, String titulo, int tamanio, String formato, String autor, String ISBN, int numeroPaginas) {
        super(id, titulo, tamanio, formato, autor);
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    protected void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("ISBN "+ISBN);
        System.out.printf("Numero pag "+numeroPaginas);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
