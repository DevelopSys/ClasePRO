public final class Jugador extends Persona{

    // sueldo nombre apellido

    public Jugador(String nombre, String apellido, double sueldo) {
        super(nombre, apellido, sueldo);
    }

    @Override
    public void calcularSueldo() {
        // sueldo neto =  sueldo bruto - retencione (IRPF 0.20)
        this.sueldo = this.sueldo - (this.sueldo * Constantes.IRPF);
    }
}
