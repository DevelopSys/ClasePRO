public final class Libro extends Elemento implements Prestable{

    private String ISBN, autor, editorial;
    private int paginas;

    public Libro(String titulo, int id, Seccion seccion, String ISBM, String autor, String editorial, int paginas) {
        super(titulo, id, seccion);
        this.ISBN = ISBM;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public Libro() {
        }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(ISBN);
        System.out.println(autor);
        System.out.println(editorial);
        System.out.println(paginas);
    }

    @Override
    public boolean prestar() {
        setDisponible(false);
        return isDisponible();
    }

    @Override
    public boolean devolver() {
        setDisponible(true);
        return isDisponible();
    }
}
