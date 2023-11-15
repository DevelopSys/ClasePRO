package arraylist.ejercicio1;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        Garaje garaje = new Garaje(); // lista

        do {
            System.out.println("1. Agregar");
            System.out.println("2. Listar");
            System.out.println("3. Buscar");
            System.out.println("4. Mostrar");
            System.out.println("5. Eliminar");
            System.out.println("6. Vaciar");
            System.out.println("7. Salir");
            System.out.println("Que tarea quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce marca");
                    String marca = scanner.next();
                    System.out.println("Introduce modelo");
                    String modelo = scanner.next();
                    System.out.println("Introduce coste");
                    int coste = scanner.nextInt();
                    System.out.println("Introduce matricula");
                    String matricula = scanner.next();
                    Object[] coche = new Object[]{marca, modelo, coste, matricula};
                    garaje.agregarCoche(coche);
                    break;
                case 2:
                    garaje.listarCoches();
                    break;
                case 3:
                    garaje.buscarCoche("1234A");
                    break;
            }
        } while (opcion != 7);
    }
}
