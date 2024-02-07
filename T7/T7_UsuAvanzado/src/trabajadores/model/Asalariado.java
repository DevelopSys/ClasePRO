package trabajadores.model;

import trabajadores.constantes.Valores;

public final class Asalariado extends Trabajador {

    private int numeroPagas;
    private boolean contratado;

    public Asalariado() {
    }

    public Asalariado(String nombre, String apellido, String dni, double sueldo, int numeroPagas) {
        super(nombre, apellido, dni, sueldo);
        this.numeroPagas = numeroPagas;
        this.contratado = contratado;
        calcularSueldo();
        contratado =true;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Contratado: "+contratado);
        System.out.println("Numero pagas: "+numeroPagas);
    }

    @Override
    public void calcularSueldo() {
        setSueldo(getSueldo() - (getSueldo() * Valores.IRPF));
    }

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
