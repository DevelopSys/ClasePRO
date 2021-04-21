package supermercadoGenerico;

public final class Silla extends Mueble{

    private int patas;

    public Silla(String material, int peso, int precio, int patas) {
        super(material, peso, precio);
        this.patas = patas;
    }

    public Silla() {}

    @Override
    public String mostrarDatos() {
        String mensaje = "Material: %s\nPeso: %d\nPrecio: %d\nPatas: %d\n";
        return String.format(mensaje,material, peso, precio, patas);
    }

    @Override
    public int calcularPrecio() {
        return 0;
    }
}
