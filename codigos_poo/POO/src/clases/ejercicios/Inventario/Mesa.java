package clases.ejercicios.Inventario;

public class Mesa extends Mueble {

    private int capacidad;

    public Mesa(String material, int peso, int precio, int capacidad) {
        super(material, peso, precio);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format("%d %n",getCapacidad());
    }
}
