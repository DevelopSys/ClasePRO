package clase.ejercicio3.model;

public class Profesor {
    private String nombre;

    public Profesor() {
    }

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public void ponerNotas(Alumno alumno) {
        // llegar a sus asignaturas -> modificar la nota
        alumno.getAsignatura1().setNota(Math.random() * 10);
        alumno.getAsignatura2().setNota(Math.random() * 10);
        alumno.getAsignatura3().setNota(Math.random() * 10);
    }

    public double calcularMedia(Alumno alumno) {
        // llegar a sus asignaturas -> obtener la nota y acumularla
        double media = (alumno.getAsignatura1().getNota() +
                alumno.getAsignatura2().getNota() +
                alumno.getAsignatura3().getNota()) / 3;

        return media;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
