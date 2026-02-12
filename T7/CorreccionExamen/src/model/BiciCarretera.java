package model;

public class BiciCarretera extends Bici {

    public void modoSprint(){
        System.out.println("La bici se pone en modo sprint");
        setVelocidades(getVelocidades()+1);
        setPeso((int) (getPeso()*0.75));
    }
    @Override
    public double reparar() {
        setVelocidades(getVelocidades()+1);
        setPulgadas(getPulgadas()+2);
        return ((int)(Math.random() * 51)) + 50;
    }

    @Override
    public void mostarDatos() {
        System.out.println("Mostrando Carretera");
        super.mostarDatos();
    }
}
