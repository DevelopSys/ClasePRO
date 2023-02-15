package model;

public final class Libro extends Elemento implements Prestable{

    private String ISBN, autor, editorial;
    private int numeroPaginas;


    public Libro(){}

    public Libro(int id, int seccion, String titulo, String ISBN, String autor, String editorial, int numeroPaginas) {
        super(id, seccion, titulo);
        this.ISBN = ISBN;
        this.autor = autor;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN: "+ISBN);
        System.out.println("Autor: "+autor);
        System.out.println("Paginas: "+numeroPaginas);
        System.out.println("Editorial: "+editorial);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // TODO configurar prestamos
    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }
}
