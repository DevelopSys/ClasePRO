package model;

public final class Deportivo extends Coche {

    private int par;

    public Deportivo() {
    }

    public Deportivo(String marca, String modelo, int cv, int cc, int velocidad, int par) {
        super(marca, modelo, cv, cc, velocidad);
        this.par = par;
    }



    @Override
    public void acelerar(int velocidad) {
        super.acelerar(velocidad);
        this.setVelocidad((int) (this.getVelocidad() + (velocidad * 0.3)));
    }


    @Override
    public void decelerar(int velocidad) {
        setVelocidad((int) (getVelocidad()-velocidad*0.9));
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Par: " + par);
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}
