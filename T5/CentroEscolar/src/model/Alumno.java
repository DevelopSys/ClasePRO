package model;

public class Alumno {

    private Asignatura a1, a2, a3;

    public Alumno() {
    }

    public Alumno(Asignatura a1, Asignatura a2, Asignatura a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public Alumno(int id1, int id2, int id3) {
        this.a1 = new Asignatura(id1);
        this.a2 = new Asignatura(id2);
        this.a3 = new Asignatura(id3);
    }

    public void mostrarExpediente() {
        System.out.printf("En la asignatura 1: %.2f\n", a1.getCalificacion());
        System.out.printf("En la asignatura 2: %.2f\n", a2.getCalificacion());
        System.out.printf("En la asignatura 3: %.2f\n", a3.getCalificacion());
    }

    public Asignatura getA1() {
        return a1;
    }

    public void setA1(Asignatura a1) {
        this.a1 = a1;
    }

    public Asignatura getA2() {
        return a2;
    }

    public void setA2(Asignatura a2) {
        this.a2 = a2;
    }

    public Asignatura getA3() {
        return a3;
    }

    public void setA3(Asignatura a3) {
        this.a3 = a3;
    }
}
