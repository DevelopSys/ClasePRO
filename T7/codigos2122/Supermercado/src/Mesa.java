public final class Mesa extends Mueble{

    private int capacidad;

    public Mesa() {
    }

    public Mesa(String material, int peso, double precio, int capacidad) {
        super(material, peso, precio);
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capacidad: "+capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
