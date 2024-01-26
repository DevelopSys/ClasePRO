package model;

public final class Suv extends Coche{

    private int traccion;


    public Suv(){}
    public Suv(String marca, String modelo, int cv, int cc, int velocidad, int traccion) {
        super(marca, modelo, cv, cc, velocidad);
        this.traccion = traccion;
    }

    @Override
    public void acelerar(int velocidad) {
        super.acelerar(velocidad);
        if (traccion==2){
            setVelocidad((int) (getVelocidad()+velocidad*0.1));
        } else if (traccion==4){
            setVelocidad((int) (getVelocidad()+velocidad*0.05));
        }
    }

    @Override
    public void decelerar(int velocidad) {
        setVelocidad((int) (getVelocidad()-velocidad*0.7));
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Traccion: "+traccion);
    }

    public int getTraccion() {
        return traccion;
    }

    public void setTraccion(int traccion) {
        this.traccion = traccion;
    }
}
