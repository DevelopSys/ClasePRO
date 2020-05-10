package clases.ejercicios.Inventario;

public final class Carne extends Alimento {

    private int proteinas;

    public Carne(String calidad, String origen, int precio, int proteinas) {
        super(calidad, origen, precio);
        this.proteinas = proteinas;
    }

    public int getProteinas() {
        return proteinas;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format("%d %n",getProteinas());
    }
}
