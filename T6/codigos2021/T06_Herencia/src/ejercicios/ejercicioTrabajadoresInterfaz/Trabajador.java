package ejercicios.ejercicioTrabajadoresInterfaz;

public abstract class Trabajador extends Persona{

    protected int id, sueldo;
    public Trabajador(){}

    public Trabajador(String dni, String nombre, String apellido, int id, int sueldo) {
        super(dni, nombre, apellido);
        this.id = id;
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ID: "+id);
        System.out.println("Sueldo: "+sueldo);
    }

    public void calcularSueldoMes(){

        double sueldoMes = this.sueldo /12;
        System.out.println("Tu sueldo mensual es: "+this.sueldo);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
