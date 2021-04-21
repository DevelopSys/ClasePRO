package supermercadoGenerico;

public final class Mesa extends Mueble {

    private int capacidad;

    public Mesa(String material, int peso, int precio, int capacidad) {
        super(material, peso, precio);
        this.capacidad = capacidad;
    }

    public Mesa() {

    }

    @Override
    public String mostrarDatos() {
        String mensaje = "Material: %s\nPeso: %d\nPrecio: %d\nCapacidad: %d\n";
        return String.format(mensaje,material, peso, precio, capacidad);

    }

    @Override
    public int calcularPrecio() {
        return 0;
    }
}
