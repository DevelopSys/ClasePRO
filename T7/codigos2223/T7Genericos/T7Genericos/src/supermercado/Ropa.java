package supermercado;

public final class Ropa extends Producto{

    private String talla;

    public Ropa(int precio, String nombre, String talla) {
        super(precio, nombre);
        this.talla = talla;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Talla "+talla);
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
