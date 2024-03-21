package model;

public final class LibroComedia extends Libro{

    private String tipo;

    public LibroComedia() {

    }

    public LibroComedia(int isbn, int nPAginas, String autor, String tipo) {
        super(isbn, nPAginas, autor);
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("tipo = " + tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
