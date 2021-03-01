package ejercicios.ejerciciosMultimedia;

public final class Audio extends Multimedia {

    private String soporte;
    private double duracion;

    public Audio(int id, String titulo, String autor, String formato, int tamanio, String soporte, double duracion) {
        super(id, titulo, autor, formato, tamanio);
        this.soporte = soporte;
        this.duracion = duracion;
    }

    public Audio(){}

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duración "+duracion);
        System.out.println("Soporte "+soporte);
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
