package model;

import utils.Estado;

public final class Coche extends Vehiculo{

    private int cv, cc;

    public Coche() {
    }

    public Coche(int numeroSerie, int precio, String marca, String modelo, Estado estado, int cv, int cc) {
        super(numeroSerie, precio, marca, modelo, estado);
        this.cv = cv;
        this.cc = cc;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("cv " + cv);
        System.out.println("cc " + cc);
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
