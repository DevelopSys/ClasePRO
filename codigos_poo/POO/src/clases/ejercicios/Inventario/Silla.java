package clases.ejercicios.Inventario;

public final class Silla extends Mueble{

    private int patas;

    public Silla(String material, int peso, int precio, int patas) {
        super(material, peso, precio);
        this.patas = patas;
    }

    public int getPatas() {
        return patas;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format("%d %n",getPatas());
    }


}
