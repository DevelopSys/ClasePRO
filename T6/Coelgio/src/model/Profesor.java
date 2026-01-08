package model;

public abstract class Profesor extends Persona{

    private String email;
    private int salario, horas;

    public Profesor(){

    }

    public Profesor(String nombre, String apellido, String dni, String email, int salario, int horas) {
        super(nombre, apellido, dni);
        this.email = email;
        this.salario = salario;
        this.horas = horas;
    }

    @Override
    public void saludar() {
        System.out.println("Buenos dias empezamos la clase");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("email = " + email);
        System.out.println("salario = " + salario);
        System.out.println("horas = " + horas);
    }
    public void evaluar(){
        System.out.println("Vamos a calificar al alumno");
        int nota = (int) (Math.random()*11);
        System.out.println("La nota del alumno es "+nota);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
