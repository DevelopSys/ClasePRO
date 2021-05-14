package ejercicios.agenda;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        String nombre, apellido, opcionSalir = "no";
        Agenda agenda = new Agenda();
        int telefono;

        // arranco y solo si el fichero existe tengo que importar los datos
        agenda.importarAgenda();

        do {

            System.out.println("Bienvenido. ¿Que desea hacer?");
            System.out.println("Opcion1. Agregar Usuario");
            System.out.println("Opcion2. Listar Usuario");
            System.out.println("Opcion3. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido a la opcion agregar usuario");
                    System.out.println("Introduce nombre");
                    nombre = teclado.next();
                    System.out.println("Introduce apellido");
                    apellido = teclado.next();
                    System.out.println("Introduce telefono");
                    telefono = teclado.nextInt();
                    Usuario usuario = new Usuario(nombre,apellido,telefono);
                    agenda.agregarUsuario(usuario);
                    break;
                case 2:
                    agenda.listarUsarios();
                    break;
                default:
                    if (opcion!=3){
                        System.out.println("No se recocnoce la opción");
                    }
                    break;
            }
        } while (opcion != 3);

        // he salido

        System.out.println("Quieres exportar los datos (s/n)");
        opcionSalir = teclado.next();
        if (opcionSalir.toLowerCase().equals("s")){
            agenda.exportarAgenda();
        }

    }
}
