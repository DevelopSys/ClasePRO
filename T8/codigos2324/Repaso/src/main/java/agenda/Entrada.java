package agenda;

import agenda.controller.GestorAgenda;
import agenda.model.Usuario;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        GestorAgenda gestorAgenda = new GestorAgenda();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        // importar
        do {

            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Listar persona");
            System.out.println("4. Borrar persona (ArrayList)");
            System.out.println("5. Salir");
            System.out.println("Que tarea quieres hacer: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("escribiendo");
                    gestorAgenda.guardarUsuarioArrayListExamen();
                    break;
                case 2:
                    break;
                case 3:
                    gestorAgenda.leerUsuariosArrayList();
                    break;
                case 4:
                    break;
                case 5:
                    // exportar
                    break;
            }

        } while (opcion != 5);
    }

}
