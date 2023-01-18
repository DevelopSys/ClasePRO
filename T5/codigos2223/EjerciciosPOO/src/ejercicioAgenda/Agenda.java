package ejercicioAgenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Persona> listaPersonas;

    public Agenda(){
            listaPersonas = new ArrayList<>();
    }

    // Agregar persona. No se puede agregar una persona
    // que ya exista dentro de la agenda (con igual DNI)
    // En el caso de que se agrege la persona --> true
    // En el caso de que no se agrege la persona --> false
    // [new Persona("Borja","Martin",1234A,1234)]
    // new Persona("Nueva","Apellido",1234A,2345)


    private Persona existePersona(String dni){

        Persona personaEncontrada = null;

        for (Persona item: listaPersonas) {
            if (dni.equalsIgnoreCase((item.getDni()))){
                personaEncontrada = item;
                break;
            }
        }

        return personaEncontrada;
    }

    public boolean agregarPersona(Persona persona){
        // add la persona cuando no existe
        // no add la persona cuando existe
        boolean existe =existePersona(persona.getDni())==null;
        if(existe){
            listaPersonas.add(persona);

        } else {
            System.out.println("El dni ya existe, no se puede add");
        }
        return existe;
    }

    /*public boolean agregarPersona(Persona persona){

        boolean existe = false;

        for ( Persona item : listaPersonas ) {
            if (persona.getDni().equalsIgnoreCase(item.getDni())){
                existe = true;
                break;
            }
        }

        // se cuando vale existe --> true/false

        if (existe){
            System.out.println("Existe un dni ya guardado, no se puede add");
        } else {
            listaPersonas.add(persona);
        }

        return !existe;

    }*/



}
