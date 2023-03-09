package supermercado;

public final class Alimento extends Producto{

    private int calorias;

    public Alimento(int precio, String nombre, int calorias) {
        super(precio, nombre);
        this.calorias = calorias;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Calorias "+calorias);
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
