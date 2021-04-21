package supermercadoGenerico;

public abstract class Mueble extends Producto {

    protected String material;
    protected int peso;

    public Mueble(String material, int peso, int precio) {
        super(precio);
        this.material = material;
        this.peso = peso;
    }

    protected Mueble(){}
}
