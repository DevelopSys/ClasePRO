package trabajadores.model;

import trabajadores.constantes.Valores;

public final class Autonomo extends Trabajador {

    private boolean contratado;

    public Autonomo() {

    }

    public Autonomo(String nombre, String apellido, String dni, double sueldo, boolean contratado) {
        super(nombre, apellido, dni, sueldo);
        this.contratado = contratado;
        calcularSueldo();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Contratado: "+contratado);
    }

    @Override
    public void calcularSueldo() {
        setSueldo(getSueldo() - (12* Valores.CUOTA_SS));
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
