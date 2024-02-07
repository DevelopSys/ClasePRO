package trabajadores.model;

public final class Accionista extends Persona implements Responsable {

    // TODO VOTACIONES

    private int acciones;

    public Accionista() {
    }

    public Accionista(String nombre, String apellido, String dni, int acciones) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Acciones "+acciones);
    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    @Override
    public int emitirVoto(int n) {
        return (int) (n +(Math.random()*acciones));
    }

    @Override
    public double obtenenerResultados() {
        return acciones;
    }
}
