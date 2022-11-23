import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Object[][] alumnos = new Object[10][4];
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        int contadorPersonas = 0;


        do {
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Listar personas");
            System.out.println("6. Salir");
            System.out.println("Que opcion queres hacer");
            opcion = lectura.nextInt();
            switch (opcion) {
                case 1:
                    if (contadorPersonas<10) {
                        System.out.println("Introduce nombre");
                        String nombre = lectura.next();
                        System.out.println("Introduce dni");
                        String dni = lectura.next();
                        System.out.println("Introduce telefono");
                        int telefono = lectura.nextInt();
                        System.out.println("Introduce apellido");
                        String apellido = lectura.next();
                        alumnos[contadorPersonas][0] = nombre;
                        alumnos[contadorPersonas][1] = apellido;
                        alumnos[contadorPersonas][2] = dni;
                        alumnos[contadorPersonas][3] = telefono;
                        contadorPersonas++;
                    }else {
                        System.out.println("Agenda llena");
                    }
                    break;
                case 2:
                    System.out.println("Introduce el dni de la persona a buscar");
                    String dni = lectura.next();
                    for (int i = 0; i < contadorPersonas; i++) {
                        if (alumnos[i][2].equals(dni)){
                            for (int j = 0; j < alumnos[i].length; j++) {
                                System.out.println(alumnos[i][j]);
                            }
                            break;
                        }
                    }
                    break;
                case 3:

                    for ( Object[] alumno  : alumnos ) {

                        for ( Object item : alumno ) {
                            System.out.print(item+" ");
                        }
                        System.out.println();

                    }

                    break;

                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 4);
    }
}
