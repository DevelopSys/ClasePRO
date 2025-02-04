package model;

public class Moto extends Vehiculo{

    private String empuniadura;

    public Moto(Motor motor, String bastidor, String empuniadura) {
        super(motor, bastidor);
        this.empuniadura = empuniadura;
    }

    public void metodoMoto(){
        System.out.println("Esto es un metodo de la moto");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Empuñadura "+this.empuniadura);
    }
}
