package correccion_enum;

public class Libro implements Prestable {

    private int id, isbn;
    private String sección, titulo, autor;
    private int páginas;
    private String editorial;
    private boolean prestado;

    public Libro(int id, int isbn, String sección, String titulo, String autor, int páginas, String editorial, boolean prestado) {
        this.id = id;
        this.isbn = isbn;
        this.sección = sección;
        this.titulo = titulo;
        this.autor = autor;
        this.páginas = páginas;
        this.editorial = editorial;
        this.prestado = prestado;
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("libro "+ titulo+prestado);
    }

    @Override
    public boolean getPrestado() {
        return prestado;
    }

    @Override
    public int getId() {
        return id;
    }

}
