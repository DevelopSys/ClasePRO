package model;

public final class Coche extends Vehiculo {

    private int cv, cc;

    public Coche() {
    }

    public Coche(String numeroSerie, String estado, String marca, String modelo, double precio, int cv, int cc) {
        super(numeroSerie, estado, marca, modelo, precio);
        this.cv = cv;
        this.cc = cc;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("cv = " + cv);
        System.out.println("cc = " + cc);
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
