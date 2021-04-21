package supermercadoGenerico;

public final class Lacteo extends Alimento{

    private int volumen;

    public Lacteo(String calidad, String origen, int precio, int volumen) {
        super(calidad, origen, precio);
        this.volumen = volumen;
    }

    public Lacteo(){
    }

    @Override
    public String mostrarDatos() {
        String mensaje = "Origen: %s\nCalidad: %s\nPrecio: %d\nVolumen: %d\n";
        return String.format(mensaje,origen, calidad, precio, volumen);
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public int calcularPrecio() {

        double precioTotal = (precio * IVA_ALIMENTO)+this.precio;
        return (int)precioTotal;
    }
}
