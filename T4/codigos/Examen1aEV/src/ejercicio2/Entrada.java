package ejercicio2;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos alumnos tiene la clase");
        int numeroAlumnos = scanner.nextInt();

        Object[][] nombresNotas = new Object[numeroAlumnos][2];

        for (int i = 0; i < nombresNotas.length; i++) {
            System.out.println("Indica el nombre del alumno");
            String nombre = scanner.next();
            nombresNotas[i][0] = nombre;
        }

        System.out.println("quieres calificar (s/n)");
        String calificar = scanner.next();

        if (calificar.equalsIgnoreCase("s")){
            for (int i = 0; i < nombresNotas.length; i++) {
                nombresNotas[i][1] = (int)(Math.random()*11);
            }
        }

        System.out.println("1. Suspensos");
        System.out.println("2. Todos");
        System.out.println("Que quieres hacer");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                for ( Object[] alumno : nombresNotas ) {
                    if((int)alumno[1]<5){
                        System.out.printf("El alumno con nombre: %s y nota %d\n",alumno[0],alumno[1]);
                    }
                }
                break;
            case 2:
                for ( Object[] alumno : nombresNotas ) {
                        System.out.printf("El alumno con nombre: %s y nota %d\n",alumno[0],alumno[1]);
                }
                break;
        }


    }
}
