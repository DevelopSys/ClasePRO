import model.Asignatura;
import model.Profesor;
import model.Tipo;

public class Main {

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Profesor1", "Apellido1", "123123A", 1);
        Asignatura asignatura1 = new Asignatura("Asignatura1", profesor, 1, Tipo.LIBRE);
        // tema = null
        Asignatura asignatura2 = new Asignatura("Asignatura2", profesor, 2, Tipo.TRONCAL);
        Asignatura.Tema tema1 = asignatura1.new Tema("Tema1", 1, 1, 60);
        Asignatura.Tema tema2 = asignatura1.new Tema("Tema2", 5, 3, 30);
        Asignatura.Tema tema3 = asignatura1.new Tema("Tema3", 4, 3, 10);
        Asignatura.Tema tema4 = asignatura1.new Tema("Tema3", 4, 1, 1);
        asignatura1.listarTemario();
        // Asignatura.Tema tema3 = asignatura2.new Tema("Tema1", 1, 1, 10);
        // asignatura2.mostrarDatos();
    }
}
