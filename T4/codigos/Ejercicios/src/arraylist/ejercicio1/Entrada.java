package arraylist.ejercicio1;

import javax.xml.stream.events.EndElement;
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
            String matricula;
            switch (opcion) {
                case 1:
                    System.out.println("Introduce marca");
                    String marca = scanner.next();
                    System.out.println("Introduce modelo");
                    String modelo = scanner.next();
                    System.out.println("Introduce coste");
                    int coste = scanner.nextInt();
                    System.out.println("Introduce matricula");
                    matricula = scanner.next();
                    Object[] coche = new Object[]{marca, modelo, coste, matricula};
                    garaje.agregarCoche(coche);
                    break;
                case 2:
                    garaje.listarCoches();
                    break;
                case 3:
                    System.out.println("Introduce matricula");
                    matricula = scanner.next();
                    garaje.buscarCoche(matricula);
                    break;
                case 4:
                    System.out.println("Mostrar costes");
                    garaje.mostrarCostes();
                    break;
                case 5:
                    System.out.println("Introduce matricula del coche a eliminar");
                    matricula = scanner.next();
                    garaje.eliminarCoche(matricula);
                    break;
                case 6:
                    garaje.vaciarLista();
                    break;
            }
        } while (opcion != 7);
    }
}
