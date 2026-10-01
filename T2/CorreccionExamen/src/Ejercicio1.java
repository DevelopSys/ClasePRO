import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica nombre apellidos");
        String nombreApellidos = lector.nextLine();
        System.out.println("Indica edad");
        int edad = lector.nextInt();
        System.out.println("Indica curso");
        String curso = lector.nextLine();
        System.out.println("Nota examen1");
        double nota1 = lector.nextDouble();
        System.out.println("Nota examen2");
        double nota2 = lector.nextDouble();
        System.out.println("Nota examen3");
        double nota3 = lector.nextDouble();
        System.out.println("Faltas asistencia");
        int faltas = lector.nextInt();
        System.out.println("Media carrera");
        double media = lector.nextDouble();
        lector.close();
        boolean condicionAprobados = nota1 >= 5 && nota2 >= 5 && nota3 >= 5;
        boolean condicionFaltas = faltas > 5 && faltas < 10;
        boolean condicionCarrera = (nota1 + nota2 + nota3) / 3 >= media;

        System.out.println("Todos aprobados "+condicionAprobados);
        System.out.println("Has faltado mucho "+condicionFaltas);
        System.out.println("Entras en la carrera "+condicionCarrera);

    }

}
