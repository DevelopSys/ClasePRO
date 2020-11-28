package examenArray;

import java.util.Scanner;

public class EjercicioTres {

    static Scanner teclado = new Scanner(System.in);
    static Object[][] taller;
    static int filas = 0;

    public static void main(String[] args) {

        taller = new Object[10][3];
        int opcion = 0;
        teclado = new Scanner(System.in);

        do {

            System.out.println("1. Registar coche");
            System.out.println("2. Listar coches");
            System.out.println("3. Buscar coche");
            System.out.println("4. Calcular arreglos");
            System.out.println("Que opción quieres realizar");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    registrarCoche();
                    break;
                case 2:
                    listarCoches();
                    break;
                case 3:
                    System.out.println("Dime que modelo quieres buscar");
                    String modelo = teclado.next();
                    buscarCoche(modelo);
                    break;
                case 4:
                    System.out.printf("El total de las reparaciones es %.2f %n", calcularArreglos());
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }

    private static double calcularArreglos() {
        double arreglos = 0.0;
        for (int i = 0; i < taller.length; i++) {
            if (taller[i][2] != null) {
                arreglos += (double) taller[i][2];
            }
        }

        return arreglos;
    }


    private static void buscarCoche(String modelo) {

        double arreglos = 0.0;

        for (Object[] coche : taller){
            if (coche[0]!=null) {
                if (coche[0].equals(modelo)) {
                    for (Object elemento : coche) {
                        System.out.print(elemento + " ");
                    }
                    System.out.println();
                }
            }
        }

    }

    private static void listarCoches() {


        for (Object[] fila : taller) {

            if (fila[0] != null) {
                for (Object celda : fila) {
                    System.out.print(celda + " ");
                }
                System.out.println();
            }
        }
    }

    private static void registrarCoche() {

        if (filas == 10) {
            System.out.println("Taller lleno");
        } else {
            String nombre;
            int cv;
            double coste;
            System.out.println("introduce modelo");
            nombre = teclado.next();
            System.out.println("introduce cv");
            cv = teclado.nextInt();
            System.out.println("introduce coste");
            coste = teclado.nextDouble();
            taller[filas][0] = nombre;
            taller[filas][1] = cv;
            taller[filas][2] = coste;
            filas++;
        }
    }

}
