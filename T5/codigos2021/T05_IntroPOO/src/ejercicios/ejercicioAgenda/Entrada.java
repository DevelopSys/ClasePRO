package ejercicios.ejercicioAgenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        Agenda agenda = new Agenda(); // tengo la posibilidad de acceder a sus propiedades, donde una de ellas
        // es el arraylist
        //System.out.println(agenda.getListaPersonas().size());
        agenda.agregarPersona(new Persona("Borja","123A",123));
        agenda.agregarPersona(new Persona("Celia","234B",123));

        String dni;
        do{
            Scanner teclado = new Scanner(System.in);
            dni = teclado.next();
        } while (agenda.agregarPersona(new Persona("ASdasd",dni,123)));




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
