package model;

public class BiciMTB extends Bici {

    public void hacerCaballito(){
        System.out.println("La bici se pone hacer caballitos");
    }
    @Override
    public double reparar() {
        setVelocidades(getVelocidades() + 2);
        return (Math.random() * 101) + 100;
    }

    @Override
    public void mostarDatos() {
        System.out.println("Mostrando MTB");
        super.mostarDatos();
    }
}
