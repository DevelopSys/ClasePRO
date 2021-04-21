package supermercadoGenerico;

public final class Carne extends Alimento{

    private int proteinas;

    public Carne(String calidad, String origen, int precio, int proteinas) {
        super(calidad, origen, precio);
        this.proteinas = proteinas;
    }

    public Carne(){}

    @Override
    public String mostrarDatos() {
        String mensaje = "Origen: %s\nCalidad: %s\nPrecio: %d\nProteinas: %d\n";
        return String.format(mensaje,origen, calidad, precio, proteinas);
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public int calcularPrecio() {
        double precioTotal = ((precio * IVA_ALIMENTO) +this.precio) * 1.5;
        return (int)precioTotal;
    }
}
