package ejercicios.ejercicioTrabajadoresInterfaz;

public final class Jefe extends Trabajador implements Responsable{

    private int beneficio;

    public Jefe() {

    }

    public Jefe(String dni, String nombre, String apellido, int id, int sueldo, int beneficio) {
        super(dni, nombre, apellido, id, sueldo);
        this.beneficio = beneficio;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Beneficio: "+beneficio);
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }

    @Override
    public double emitirVoto(int numero) {
        return 0.25*numero;
    }
}
