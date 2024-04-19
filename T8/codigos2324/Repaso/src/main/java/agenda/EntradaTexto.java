package agenda;

import agenda.controller.GestorAgenda;
import agenda.controller.GestorAgendaTexto;
import agenda.model.Usuario;
import agenda.model.UsuarioTexto;

import java.util.Scanner;

public class EntradaTexto {

    public static void main(String[] args) {

        GestorAgendaTexto gestorAgenda = new GestorAgendaTexto();
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
                    //gestorAgenda.escribirUsuarios(new UsuarioTexto("Juan",6,5,8,32));
                    break;
                case 2:
                    break;
                case 3:
                    gestorAgenda.leerUsuarios();
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
