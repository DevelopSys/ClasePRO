package model;

public class Directivo extends Persona implements Regulador{

    private int perBeneficios;

    public Directivo() {
    }

    public Directivo(String nombre, String apellido, String dni, int perBeneficios) {
        super(nombre, apellido, dni);
        this.perBeneficios = perBeneficios;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("perBeneficios = " + perBeneficios);
    }

    public int getPerBeneficios() {
        return perBeneficios;
    }

    public void setPerBeneficios(int perBeneficios) {
        this.perBeneficios = perBeneficios;
    }

    @Override
    public boolean subirSalario(Trabajador trabajador, int salario) {
        trabajador.setSueldo(trabajador.getSueldo()+salario/2);
        return true;
    }


}
