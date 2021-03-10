package ejercicios.ejercicioBiblioteca;

public final class Libro extends Elemento implements Prestar{

    private String autor, ISBN;
    private int numeroPaginas;

    public Libro(int id, String titulo, String seccion, String autor, String ISBN, int numeroPaginas) {
        super(id, titulo, seccion);
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro() {
    }

    @Override
    public void mostarDatos() {
        super.mostarDatos();
        System.out.println("autor: "+autor);
        System.out.println("isbn: "+ISBN);
        System.out.println("n paginas: "+numeroPaginas);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    @Override
    public void prestar() {
        if (disponible) {
            this.disponible = false;
        } else {
            System.out.println("Elemento ya prestado");
        }
    }

    @Override
    public void devolver() {
        if (!disponible) {
            this.disponible = true;
        } else {
            System.out.println("El elemento está ya disponible");
        }
    }
}
