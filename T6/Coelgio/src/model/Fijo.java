package model;

public final class Fijo extends Profesor {
    // salario, horas, email, nombre, apellido, dni
    private int anioExp;

    public Fijo() {
    }

    public Fijo(String nombre, String apellido, String dni, String email, int salario, int horas) {
        super(nombre, apellido, dni, email, salario, horas);
        this.anioExp = 8;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("anioExp = " + anioExp);
    }

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("Tengo mi plaza fija");
    }

    public void pedirAumento() {
        int salaroAnadir = (int) (Math.random() * 101) + 100;
        this.setSalario(this.getSalario() + salaroAnadir);
    }

    public void cambiarDocencia(int horas) {
        if (horas > getHoras()) {
            System.out.println("No puedes quitarte tantas horas");
        } else {
            setHoras(getHoras() - horas);
            System.out.println("Jornada reducida");
        }
    }

    public int getAnioExp() {
        return anioExp;
    }

    public void setAnioExp(int anioExp) {
        this.anioExp = anioExp;
    }
}
