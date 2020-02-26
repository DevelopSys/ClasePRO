package correccion_enum;

public class CD implements Prestable{

    private int id, isbn;
    private String sección, titulo, autor, editorial;
    private TipoCD tipoCD;
    private boolean prestado;

    public CD(int id, int isbn, String sección, String titulo, String autor, TipoCD tipoCD, boolean prestado) {
        this.id = id;
        this.isbn = isbn;
        this.sección = sección;
        this.titulo = titulo;
        this.autor = autor;
        this.tipoCD = tipoCD;
        this.prestado = prestado;
    }


    @Override
    public void prestar() {
        this.prestado = false;
    }

    @Override
    public void devolver() {
        this.prestado = true;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("CD "+ titulo+prestado);    }
    @Override
    public boolean getPrestado() {
        return prestado;
    }

    @Override
    public int getId() {
        return id;
    }
}
