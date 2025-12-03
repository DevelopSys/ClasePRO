import controller.AgendaController;
import model.Contacto;

import java.util.Scanner;

public class Main {

    // capa vista de la app
    public static void main(String[] args) {
        // capa logica de la app
        AgendaController controller = new AgendaController();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        // HashMap<String,Contacto>
        do {
            System.out.println("1. Agregar usuario");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Buscar usuario");
            System.out.println("4. Borrar usuario");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    String nombre, apellido, dni;
                    int telefono;
                    boolean acierto;
                    int numeroIntentos = 3;
                    do {
                        System.out.println("Indica nombre");
                        nombre = scanner.next();
                        System.out.println("Indica apellido");
                        apellido = scanner.next();
                        System.out.println("Indica dni");
                        dni = scanner.next();
                        System.out.println("Indica telefono");
                        telefono = scanner.nextInt();
                        acierto = controller.agregarUsuario(new Contacto(dni, nombre, apellido, telefono));
                        if (!acierto) {
                            System.out.println("Error en el proceso, intenta meter otro dni");
                            numeroIntentos--;
                        }
                    } while (!acierto && numeroIntentos > 0);
                    if (acierto) {
                        System.out.println("Añadido correctemente");
                    }

                }
                case 2 -> {
                    controller.mostrarUsuarios();
                }
                case 3 -> {
                    System.out.println("Indica el dni del contacto a buscar");
                    String dni = scanner.next();
                    if (!controller.buscarContacto(dni)) {
                        System.out.println("El contacto no esta en la lista");
                    }
                }
                case 4 -> {
                    System.out.println("Indica el dni que quierss borrar");
                    String dni = scanner.next();
                    Contacto contacto = controller.borrarContacto(dni);
                    if (contacto != null) {
                        System.out.printf("Contacto con nombre %s borrado correctamente%n",
                                contacto.getNombre());
                    } else {
                        System.out.println("El contacto no se ha podido encontrar");
                    }
                }

            }
        } while (opcion != 5);


        // mostrar los datos de los usuarios con dni pares
        


    }
}
