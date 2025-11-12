package ejercicio4;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        // listaContactos = []
        // agenda.listarContactos();
        /*
        System.out.println("Indca el nombre");
        String  nombre = scanner.next();
        System.out.println("Indca el correo");
        String  correo = scanner.next();
        System.out.println("Indca el telefono");
        int telefono = scanner.nextInt();
        System.out.println("Indca el edad");
        int edad = scanner.nextInt();*7
        agenda.anadirConctacto(new Object[]{nombre,correo,telefono,edad});

         */
        /*
        agenda.anadirConctacto(new Object[]{"Borja1","borja1@gmail.com",123,123123});
        agenda.anadirConctacto(new Object[]{"Borja2","borja2@gmail.com",123,123123});
        agenda.anadirConctacto(new Object[]{"Borja2","borja2@gmail.com",123,123123});
        agenda.listarContactos();
         */
        do {
            System.out.println("1-Añadir");
            System.out.println("2-Listar");
            System.out.println("3-Buscar");
            System.out.println("4-Eliminar");
            System.out.println("5-Ordenar");
            System.out.println("6-Borrar nombre");
            System.out.println("7-Vaciar");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Indca el nombre");
                    String nombre = scanner.next();
                    System.out.println("Indca el correo");
                    String correo = scanner.next();
                    System.out.println("Indca el telefono");
                    int telefono = scanner.nextInt();
                    System.out.println("Indca el edad");
                    int edad = scanner.nextInt();
                    agenda.anadirConctacto(new Object[]{nombre, correo, telefono, edad});
                }
                case 2 -> {
                    agenda.listarContactos();
                }
                case 3 -> {
                    System.out.println("Dime que nombre quieres buscar");
                    String nombre = scanner.next();
                    Object[] contactoBuscado = agenda.buscarContactoNombre(nombre); // Object[]
                    if (contactoBuscado!=null){
                        System.out.println("Imprimiendo datos del contacto");
                        for (Object item: contactoBuscado) {
                            System.out.println("\t"+item);
                        }
                    }else {
                        System.out.println("Contacto no encontrado");
                    }
                }
                case 4 -> {
                    System.out.println("Indica que correo quieres borrar");
                    String correo = scanner.next();
                    agenda.eliminarObjeto(correo);
                }
                case 5 -> {
                    agenda.ordenarListaEdad();
                }
                case 6 -> {
                    System.out.println("Indica el nombre que quieres borrar");
                    String nombre = scanner.next();
                    agenda.eliminarNombre(nombre);
                }
                case 7 -> {
                    agenda.vaciarLista();
                }
            }
        } while (opcion != 8);


    }
}
