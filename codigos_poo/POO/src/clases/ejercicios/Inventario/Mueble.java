package clases.ejercicios.Inventario;

public class Mueble implements Inventariable {

    protected String material;
    protected double peso, precio;

    public Mueble(String material, double peso, double precio) {
        this.material = material;
        this.peso = peso;
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String mostrarDatos(){
        return String.format("%s, %d, %d",getMaterial(),getPeso(),getPrecio());

    }

    @Override
    public void calcularPrecio() {
        this.precio += this.precio * IVA_MUEBLES;
        System.out.println(getPrecio());
    }
}
