package model;

public class Autonomo extends Trabajador {

    // nombre, apellido, dni, sueldo, contratado
    private double cuotaSS;

    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, String dni, double sueldo, boolean contratado, double cuotaSS) {
        super(nombre, apellido, dni, sueldo, contratado);
        this.cuotaSS = cuotaSS;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero pagas "+cuotaSS);
    }

    public double getCuotaSS() {
        return cuotaSS;
    }

    public void setCuotaSS(double cuotaSS) {
        this.cuotaSS = cuotaSS;
    }
}
