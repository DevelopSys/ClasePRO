public final class Silla extends Mueble{

    private int patas;

    public Silla() {
    }

    public Silla(String material, int peso, double precio, int patas) {
        super(material, peso, precio);
        this.patas = patas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Patas: "+patas);
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
