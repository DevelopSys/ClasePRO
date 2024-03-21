package model;

public final class LibroTerror extends Libro{

    private int calificacion;

    public LibroTerror() {

    }

    public LibroTerror(int isbn, int nPAginas, String autor, int calificacion) {
        super(isbn, nPAginas, autor);
        this.calificacion = calificacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("calificacion = " + calificacion);
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
