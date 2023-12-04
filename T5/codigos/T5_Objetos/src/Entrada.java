import model.Persona;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {


        Persona persona1 = new Persona("Borja1", "martin1", "correo1@gmail.com", 1234);
        Persona persona2 = new Persona("Borja2", "martin2", "correo2@gmail.com", 234);
        Persona persona3 = new Persona("Borja3", "martin3", "correo3@gmail.com", 345);
        Persona persona4 = new Persona("Borja4", "martin4", "correo4@gmail.com", 456);
        Persona persona5 = new Persona("Borja5", "martin5", "correo5@gmail.com", 567);

        ArrayList<Persona> listaPersona = new ArrayList<>();
        listaPersona.add(persona1);
        listaPersona.add(persona2);
        listaPersona.add(persona3);
        listaPersona.add(persona4);
        listaPersona.add(persona5);


        // sacar todos los datos de los usuarios

        for (Persona item : listaPersona) {
            item.mostrarDatos();
            //if (item instanceof Persona){
            //((Persona)item).mostrarDatos();
            //}

        }


        //persona1.mostrarDatos();
        //persona2.mostrarDatos();
        //persona3.mostrarDatos();


        // sacar por consola los datos de la persona3
        // sacar por consola los datos de la persona2
        // sacar por consola los datos de la persona1

        //System.out.println(persona1.getTelefono());
        // imprimir el nombre de la pesona

    }
}
