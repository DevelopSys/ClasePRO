package model;

public class BiciPaseo extends Bici {

    public void ponerCesta(){
        System.out.println("La bici tiene pesa");
        setVelocidades(getVelocidades()-1);
        setPeso((int) (getPeso()*1.25));
    }
    @Override
    public double reparar() {
        return ((int)(Math.random() * 51)) + 50;
    }

    @Override
    public void mostarDatos() {
        System.out.println("Mostrando Paseo");
        super.mostarDatos();
    }
}
