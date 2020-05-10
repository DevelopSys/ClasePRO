package clases.ejercicios.Inventario;

public final class Lacteo extends Alimento {

    private int volumen;


    public Lacteo(String calidad, String origen, int precio, int volumen) {
        super(calidad, origen, precio);
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format("%d %n",getVolumen());

    }
}
