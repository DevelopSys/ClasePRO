package supermercadoGenerico;

public abstract class Producto  implements Invetariable {

    protected int precio;

    public Producto() {
    }

    public Producto(int precio) {
        this.precio = precio;
    }

    public abstract String mostrarDatos();


}
