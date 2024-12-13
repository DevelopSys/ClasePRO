package agenda_arraylist;

import agenda_arraylist.controller.Agenda;

import java.util.Scanner;

public class Entrada {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregarPersona("Borja","martin",1234,"1234A");
        // []
        /*System.out.println("Por favor introduce tu nombre");
        String nombre = scanner.next();
        System.out.println("Por favor introduce tu apellido");
        String apellido = scanner.next();
        System.out.println("Por favor introduce tu telefono");
        int telefono = scanner.nextInt();
        System.out.println("Por favor introduce tu dni");
        String dni = scanner.next();
        if (agenda.agregarPersona(nombre,apellido,telefono,dni)){
            // agregado
            System.out.println("Usuario agregado correctamente");
        } else {
            //
            System.out.println("Fallo en el proceso");
        }*/
        // si la lista esta vacia -> aviso
        switch (agenda.listarDatosPersona("1234A")){
            case 1:
                System.out.println("No se pueden hacer busquedas sobre una lista vacia");
                break;
            case 2:
                System.out.println("No esta en la lista, queres agregarlo (s/n)");
                String  contestacion = scanner.next();
                if (contestacion.equalsIgnoreCase("s")){
                    // pido datos
                    // agregar persona
                    agenda.agregarPersona("Borja","Martin",1234,"1234B");
                }else {
                    System.out.println("Continuando con el programa");
                }
                break;
        }
    }
}
