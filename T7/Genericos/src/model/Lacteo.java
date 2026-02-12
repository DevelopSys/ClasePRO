package model;

public class Lacteo extends Producto implements Vendible{

    private String proteina;

    public Lacteo() {

    }

    public Lacteo(int precio, String nombre, String proteina) {
        super(precio, nombre);
        this.proteina = proteina;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("proteina = " + proteina);
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    @Override
    public double vender() {
        return getPrecio()*1.25;
    }
}
