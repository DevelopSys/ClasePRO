public final class Entrenador extends Persona{

    private String vocacion;

    public Entrenador(String nombre, String apellido, String dni, int edad, double sueldo, String vocacion) {
        super(nombre, apellido, dni, edad, sueldo);
        this.vocacion = vocacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(vocacion);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo*1.25;
    }

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }
}
