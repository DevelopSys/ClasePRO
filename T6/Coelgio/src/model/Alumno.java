package model;

public final class Alumno extends Persona{

    private int nMatricula;
    private int curso;

    public Alumno(){}

    public Alumno(String nombre, String apellido, String dni, int nMatricula, int curso){
        super(nombre,apellido,dni);
        this.nMatricula = nMatricula;
        this.curso =curso;
    }

    public Alumno(String nombre, String apellido, String dni, int nMatricula){
        super(nombre,apellido,dni);
        this.nMatricula = nMatricula;
        // curso = 0
    }

    public void realizarExamen(){
        System.out.println("Vamos a realizar el examen");
        int nota = (int) (Math.random()*11);
        System.out.println("En el examen he sacado un "+nota);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("nMatricula = " + nMatricula);
        System.out.println("curso = " + curso);
    }

    @Override
    public void saludar() {
        System.out.println("Soy un alumno del centro escolar");
    }

    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
}
