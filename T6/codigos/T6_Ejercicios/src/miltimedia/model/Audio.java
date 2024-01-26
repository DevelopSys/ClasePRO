package miltimedia.model;

public final class Audio extends Elemento{

    private int durecion;
    private String soporte;

    public Audio() {
    }

    public Audio(String titulo, Persona autor, String formato,
                 int tamanio, int durecion, String soporte) {
        super(titulo, autor, formato, tamanio);
        this.durecion = durecion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(soporte);
        System.out.println(durecion);
    }

    public int getDurecion() {
        return durecion;
    }

    public void setDurecion(int durecion) {
        this.durecion = durecion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
