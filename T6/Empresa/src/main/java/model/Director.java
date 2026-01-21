package model;

public class Director extends Persona{

    private int percEmpresa;

    public Director(String nombre, String apellido, String dni, int percEmpresa) {
        super(nombre, apellido, dni);
        this.percEmpresa = percEmpresa;
    }

    public Director() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("% empresa = " + percEmpresa);
    }

    // TODO despedir jefe,directivo
    // TODO contratar jefe,directivo

    public int getPercEmpresa() {
        return percEmpresa;
    }

    public void setPercEmpresa(int percEmpresa) {
        this.percEmpresa = percEmpresa;
    }
}
