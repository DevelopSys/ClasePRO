public final class Entrenador extends Persona{

    private String vocacion;

    public Entrenador(String nombre, String apellido, double sueldo, String vocacion) {
        super(nombre, apellido, sueldo);
        this.vocacion = vocacion;

    }

    @Override
    public void calcularSueldo() {
        this.sueldo = (this.sueldo -(this.sueldo* Constantes.IRPF)) + this.sueldo *0.10;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(vocacion);
    }
}
