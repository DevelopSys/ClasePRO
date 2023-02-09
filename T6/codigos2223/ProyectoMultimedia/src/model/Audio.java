package model;

public final class Audio extends Elemento{

    private int duracion;
    private String soporte;

    public Audio() {
    }

    public Audio(int id, String titulo, int tamanio, String formato, String autor, int duracion, String soporte) {
        super(id, titulo, tamanio, formato, autor);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    protected void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duracion: "+duracion);
        System.out.println("Soporte: "+soporte);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
