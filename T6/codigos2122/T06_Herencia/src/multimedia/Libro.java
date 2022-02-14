package multimedia;

public final class Libro extends Elemento{
    // id, titulo, autor, tamaño, formato
    private int ISBN, numeroPaginas;

    public Libro(String id, String titulo, String autor,
                 String tamanio, String formato, int ISBN, int numeroPaginas) {
        super(id, titulo, autor, tamanio, formato);
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
    }

    public void metodoLibro(){}

    // mostrarDatos()

    @Override
    public void mostrarDatos() {
        // haz lo que le diga el método de la
        // superclase
        super.mostrarDatos();
        System.out.println("Páginas "+ numeroPaginas);
        System.out.println("ISBN "+ISBN);
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
