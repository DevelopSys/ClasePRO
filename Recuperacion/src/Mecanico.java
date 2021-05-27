public final class Mecanico extends Trabajador{

    private int experiencia;
    private boolean conocimientoBancada;

    public Mecanico() {

    }

    public Mecanico(String nombre, String apellido, String dni, int numeroSS, int experiencia, boolean conocimientoBancada) {
        super(nombre, apellido, dni, numeroSS);
        this.experiencia = experiencia;
        this.conocimientoBancada = conocimientoBancada;
    }

    public Mecanico(String nombre, String apellido, String dni, int numeroSS, int telefono, int experiencia, boolean conocimientoBancada) {
        super(nombre, apellido, dni, numeroSS, telefono);
        this.experiencia = experiencia;
        this.conocimientoBancada = conocimientoBancada;
    }

    @Override
    public void mostarDatos() {
        super.mostarDatos();
        System.out.println("Conoces bancada: "+conocimientoBancada);
        System.out.println("Experiencia: " + experiencia);
    }

    @Override
    public void calcularRetencion() {
        double retencion = this.sueldo - (this.sueldo * 0.20);
        System.out.println("Tu retencion es " +retencion);
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public boolean isConocimientoBancada() {
        return conocimientoBancada;
    }

    public void setConocimientoBancada(boolean conocimientoBancada) {
        this.conocimientoBancada = conocimientoBancada;
    }
}
