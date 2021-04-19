package supermercadoGenerico;

public abstract class Mueble {

    protected String material;
    protected int peso, precio;

    public Mueble(String material, int peso, int precio) {
        this.material = material;
        this.peso = peso;
        this.precio = precio;
    }

    protected Mueble(){}

    public abstract String mostrarDatos();
}
