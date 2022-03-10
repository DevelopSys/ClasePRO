public final class Accionista extends Persona implements Comision{

    private int porAcciones;

    public Accionista() {

    }

    public Accionista(String dni, String nombre, String apellido, int porAcciones) {
        super(dni, nombre, apellido);
        this.porAcciones = porAcciones;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("% acciones: " +porAcciones);
    }

    public int getPorAcciones() {
        return porAcciones;
    }

    public void setPorAcciones(int porAcciones) {
        this.porAcciones = porAcciones;
    }

    @Override
    public double votar() {
        double voto = (Math.random()*11);
        return voto;
    }

    @Override
    public void obtenerBeneficio(int beneficio) {
        System.out.println("El beneficio obtenido es: "+beneficio*0.30);
    }
}
