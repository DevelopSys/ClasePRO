package model;

public final class Bici extends Vehiculo{

    private String tipo;

    public Bici() {
    }

    public Bici(String numeroSerie, String estado, String marca,
                String modelo, double precio, String tipo) {
        super(numeroSerie, estado, marca, modelo, precio);
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("tipo = " + tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
