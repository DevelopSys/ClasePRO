package agenda;

import java.util.Scanner;

public class EntradaAgenda {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Agenda listaAgenda = new Agenda();

        int opcion = 0;

        do {

            System.out.println("1. Agregar");
            System.out.println("2. Borrar");
            System.out.println("3. Editar");
            System.out.println("4. Buscar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            System.out.println("Introduce la opción");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    String nombre = teclado.next();
                    String dni = teclado.next();
                    int telefono = teclado.nextInt();
                    Persona persona = new Persona(nombre,dni,telefono);
                    listaAgenda.agregarPersona(persona);

                    break;
                case 2:
                    String dniBorrar = teclado.next();
                    listaAgenda.borrar(dniBorrar);
                    break;
                case 3:
                    String dniEditar = teclado.next();
                    listaAgenda.editarPersona(dniEditar);
                    break;
                case 4:
                    String dniBuscar = teclado.next();
                    listaAgenda.buscarPersona(dniBuscar);
                    break;
                case 5:
                    listaAgenda.listarPersonas();
                    break;
                case 6:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Error");
                    break;

            }

        } while (opcion != 6);
    }
}
