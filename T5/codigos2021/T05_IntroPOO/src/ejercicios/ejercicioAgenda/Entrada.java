package ejercicios.ejercicioAgenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        Agenda agenda = new Agenda(); // tengo la posibilidad de acceder a sus propiedades, donde una de ellas
        // es el arraylist
        //System.out.println(agenda.getListaPersonas().size());

        agenda.listarPersonas();

        agenda.agregarPersona(new Persona("Borja","123A",123)); // false
        agenda.agregarPersona(new Persona("Celia","234B",123)); // false

        // agenda.agregarPersona(new Persona("ASdasd","234B",123)); // true
        // necesito que se introduzca una persona si o si: hasta que no la introduzcas, insiste
        String dni, nombre;
        int telefono;
        boolean existePersona;
        do{
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce nombre");
            nombre = teclado.next();
            System.out.println("Introduce telenodo");
            telefono = teclado.nextInt();
            System.out.println("Introduce dni de la persona");
            dni = teclado.next();
            // dni 123A // true
            existePersona = agenda.agregarPersona(new Persona(nombre,dni,telefono));

        } while (existePersona);




        //agenda.agregarPersona(new Persona("Celia","234B",123)); // true

        //agenda.listarPersonas();
        //System.out.println(agenda.getListaPersonas().size());
        //agenda.borrarPersona("234B");
        //System.out.println(agenda.getListaPersonas().size());
        //agenda.buscarPersona("123A");
        //agenda.editarPersona("123A");
        //System.out.println("Nuevo listado.......");
        //agenda.listarPersonas();


    }

}
