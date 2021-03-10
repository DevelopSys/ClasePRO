package ejercicios.ejercicioBiblioteca;

public final class CD extends Elemento {

    private int anio;

    public CD(int id, String titulo, String seccion, int anio) {
        super(id, titulo, seccion);
        this.anio = anio;
    }

    public CD() {
    }

    @Override
    public void mostarDatos() {
        super.mostarDatos();
        System.out.println("Año: "+anio);
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
