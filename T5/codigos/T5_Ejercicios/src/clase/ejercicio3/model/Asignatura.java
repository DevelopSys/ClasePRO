package clase.ejercicio3.model;

public class Asignatura {

    private int id;
    private double nota;
    private String nombre;

    public Asignatura() {
    }

    public Asignatura(int id) {
        this.id = id;
    }

    public Asignatura(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Nota: "+nota);
        System.out.println("Id: "+id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
