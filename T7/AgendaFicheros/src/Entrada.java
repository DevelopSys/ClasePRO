import controller.Agenda;
import model.Contacto;

import java.util.Scanner;

public class Entrada {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        Agenda agenda = new Agenda();
        do{

            System.out.println("1- Agregar contacto");
            System.out.println("2- Buscar contacto");
            System.out.println("3- Listar contactos");
            System.out.println("4- Importar contactos");
            System.out.println("5- Exportar contactos");
            System.out.println("6- Salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Indica nombre");
                    String nombre = scanner.next();
                    System.out.println("Indica apellido");
                    String apellido = scanner.next();
                    System.out.println("Indica dni");
                    String dni = scanner.next();
                    Contacto contacto = new Contacto(nombre,apellido,dni);
                    agenda.agregarContacto(contacto);
                }
                case 2->{
                    System.out.println("Indica dni");
                    String dni = scanner.next();
                    agenda.buscarContacto(dni);
                }
                case 3->{
                    agenda.mostrarContactos();
                }
                case 4->{
                    agenda.importarContactos();
                }
                case 5->{
                    agenda.exportarContactos();
                }
            }

        }while (opcion!=6);

    }
}
