public final class Jugador extends Persona{

    // sueldo nombre apellido

    private String posicion;

    public Jugador(String nombre, String apellido, double sueldo, String posicion) {

        super(nombre, apellido, sueldo);
        this.posicion = posicion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(posicion);
    }

    public void metodoJugador(){

    }

    @Override
    public void calcularSueldo() {
        // sueldo neto =  sueldo bruto - retencione (IRPF 0.20)
        this.sueldo = this.sueldo - (this.sueldo * Constantes.IRPF);
    }
}
