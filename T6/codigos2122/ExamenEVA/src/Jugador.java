public final class Jugador extends Persona{

    private String posicion;

    public Jugador(String nombre, String apellido, String dni, int edad, double sueldo, String posicion) {
        super(nombre, apellido, dni, edad, sueldo);
        this.posicion = posicion;

    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo*1.5;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(posicion);
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
