package trabajadores.model;

import trabajadores.constantes.Valores;

public final class Jefe extends Trabajador implements Responsable{

    // TODO VOTACIONES
    private int beneficios, acciones;

    public Jefe() {
    }

    public Jefe(String nombre, String apellido, String dni, double sueldo, int beneficios, int acciones) {
        super(nombre, apellido, dni, sueldo);
        this.beneficios = beneficios;
        this.acciones = acciones;
        calcularSueldo();
    }



    @Override
    public void calcularSueldo() {
        setSueldo(this.getSueldo() + beneficios - (this.getSueldo() * Valores.IRPF));
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Beneficios: "+beneficios);
        System.out.println("Acciones: "+acciones);
    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    public int getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(int beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public int emitirVoto(int n) {
        return n/2;
    }

    @Override
    public double obtenenerResultados() {
        return acciones;
    }
}
