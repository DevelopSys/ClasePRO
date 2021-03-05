package explicacion.interfaces;

public abstract class Alimento {

    protected int calorias;
    protected int grasas;

    public Alimento(int calorias, int grasas) {
        this.calorias = calorias;
        this.grasas = grasas;
    }

    public void calidadAlimentaria(){
        System.out.println(calorias*grasas);
    }
}
