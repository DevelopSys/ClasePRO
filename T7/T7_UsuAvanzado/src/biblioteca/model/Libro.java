package biblioteca.model;

import biblioteca.utils.Editoriales;

public class Libro extends Elemento implements Prestable {

    private String ISBN, autor;
    private int nPaginas;
    private Editoriales editorial;

    public Libro() {
    }

    public Libro(String titulo, String seccion, int id, String ISBN,
                 String autor, int nPaginas, Editoriales editorial) {
        super(titulo, seccion, id);
        this.ISBN = ISBN;
        this.autor = autor;
        this.nPaginas = nPaginas;
        this.editorial = editorial;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Autor "+autor);
        System.out.println("Nº paginas "+nPaginas);
        System.out.println("Editorial "+editorial.getNombre());
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

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public Editoriales getEditorial() {
        return editorial;
    }

    public void setEditorial(Editoriales editorial) {
        this.editorial = editorial;
    }

    @Override
    public boolean devolver() {
        setEstado(false);
        return false;
    }

    @Override
    public boolean prestar() {
        setEstado(true);
        return true;
    }
}
