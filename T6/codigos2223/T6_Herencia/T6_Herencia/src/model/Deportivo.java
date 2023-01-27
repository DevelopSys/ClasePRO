package model;

public class Deportivo extends Coche{

    private int cv;
    private int par;

    public Deportivo() {
    }

    public Deportivo(String marca, String modelo, int cv, int par) {
        super(marca, modelo);
        this.cv = cv;
        this.par = par;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("CV: "+this.cv);
        System.out.println("Par: "+this.par);
    }

    public void acelerar(){
        System.out.println("Acelerando el coche con par "+this.par);
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}
