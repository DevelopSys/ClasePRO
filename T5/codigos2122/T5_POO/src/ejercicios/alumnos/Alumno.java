package ejercicios.alumnos;

public class Alumno {

    private Asignatura asignatura1, asignatura2, asignatura3;
    private String nombre;
    public Alumno (String nombre, Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3){
        this.nombre = nombre;
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno (String nombre, int id1, int id2, int id3){
        this.nombre = nombre;
        this.asignatura1 = new Asignatura(id1);
        this.asignatura2 = new Asignatura(id2);
        this.asignatura3 = new Asignatura(id3);
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

    public String getNombre(){
        return nombre;
    }
}
