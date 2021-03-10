package ejercicios.ejercicioTrabajadoresInterfaz;

public final class Autonomo extends Trabajador{

    private int costeSS;
    public Autonomo(){}

    public Autonomo(String dni, String nombre, String apellido, int id, int sueldo, int costeSS) {
        super(dni, nombre, apellido, id, sueldo);
        this.costeSS = costeSS;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Coste SS: "+costeSS);
    }

    public int getCosteSS() {
        return costeSS;
    }

    public void setCosteSS(int costeSS) {
        this.costeSS = costeSS;
    }
}
