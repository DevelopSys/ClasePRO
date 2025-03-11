import utils.LetraException;
import utils.LongException;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Formulario formulario = new Formulario();
        // nombre= null apellido=null dni=null
        int opcion = 0;
        do {
            System.out.println("1 - introduce el nombre");
            System.out.println("2 - introduce el apellido");
            System.out.println("3 - introduce el dni");
            System.out.println("4 - salir");
            System.out.println("Indica que quieres hacer");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Por favor introduce un nombre");
                    String nombre = sc.next();
                    try {
                        formulario.setNombre(nombre);
                    } catch (LongException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Por favor introduce un apellido");
                    String apellido = sc.next();
                    try {
                        formulario.setApellido(apellido);
                    } catch (LongException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Por favor introduce un dni");
                    String dni = sc.next();
                    try {
                        formulario.setDni(dni);
                    } catch (LetraException | LongException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        formulario.mostrarDatos();
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        } while (opcion != 4);
    }
}
