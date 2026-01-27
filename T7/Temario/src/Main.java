import model.Asignatura;
import model.Profesor;
import model.Tipo;

public class Main {

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Profesor1", "Apellido1", "123123A", 1);
        Asignatura asignatura1 = new Asignatura("Asignatura1", profesor, 1, Tipo.LIBRE);
        Asignatura asignatura2 = new Asignatura("Asignatura2", profesor, 2, Tipo.TRONCAL);
        Asignatura asignatura3 = new Asignatura("Asignatura3", profesor, 3, Tipo.LIBRE);
        Asignatura asignatura4 = new Asignatura("Asignatura4", profesor, 4, Tipo.OPTATIVA);
        Asignatura.Tema tema1 = asignatura1.new Tema("Tema1", 1, 1, 60);
        Asignatura.Tema tema2 = asignatura1.new Tema("Tema2", 5, 3, 30);
        Asignatura.Tema tema3 = asignatura1.new Tema("Tema3", 4, 3, 10);
        Asignatura.Tema tema4 = asignatura1.new Tema("Tema3", 4, 1, 1);
        Asignatura.Tema tema5 = asignatura2.new Tema("Tema1", 1, 1, 60);
        Asignatura.Tema tema6 = asignatura3.new Tema("Tema2", 5, 3, 30);
        Asignatura.Tema tema7 = asignatura4.new Tema("Tema2", 5, 3, 30);
        Asignatura.Tema tema8 = asignatura2.new Tema("Tema2", 5, 3, 30);
        asignatura1.listarTemario();
        // Asignatura.Tema tema3 = asignatura2.new Tema("Tema1", 1, 1, 10);
        // asignatura2.mostrarDatos();
    }
}
