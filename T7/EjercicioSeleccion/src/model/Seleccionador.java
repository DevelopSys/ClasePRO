package model;

import utils.Tactica;

public class Seleccionador extends Persona  {

    private Tactica tactica;

    public Seleccionador() {
    }

    public Seleccionador(String nombre, String dni, Tactica tactica) {
        super(nombre, dni);
        this.tactica = tactica;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tactica " + tactica.name());
    }

    public Tactica getTactica() {
        return tactica;
    }

    public void setTactica(Tactica tactica) {
        this.tactica = tactica;
    }
}
