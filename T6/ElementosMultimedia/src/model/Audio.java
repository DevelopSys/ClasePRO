package model;

public class Audio extends Elemento{

    private double duracion;
    private String soporte;
    public Audio(){}

    public Audio(String id, String titulo, int tamanio, String formato
            , Persona autor, double duracion, String soporte) {
        super(id, titulo, tamanio, formato, autor);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("duracion = " + duracion);
        System.out.println("soporte = " + soporte);
        super.mostrarDatos();
    }

    // getter y setter de todos los elementos de la clase padre
    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
