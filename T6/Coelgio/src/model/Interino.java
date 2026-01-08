package model;

public class Interino extends Profesor{
    private int horasExp;

    public Interino(){}

    public Interino(String nombre, String apellido, String dni, String email, int salario, int horas, int horasExp) {
        super(nombre, apellido, dni, email, salario, horas);
        this.horasExp = horasExp;
    }

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("incrementamos la experiencia en uno");
        horasExp++;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("horasExp = " + horasExp);
    }
    public void realizarOposicion(){
        System.out.println("Vamos a realizar el examen de oposicion");
    }

    public void cambuarCentro(){
        System.out.println("Cambiamos de año, por lo tanto cambiamos de centro");
    }

    public int getHorasExp() {
        return horasExp;
    }

    public void setHorasExp(int horasExp) {
        this.horasExp = horasExp;
    }
}
