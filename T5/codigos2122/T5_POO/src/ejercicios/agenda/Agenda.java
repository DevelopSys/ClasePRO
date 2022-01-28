package ejercicios.agenda;

import java.util.ArrayList;
import java.util.Hashtable;

public class Agenda {


    private ArrayList<Persona> listaPersonas;

    public Agenda(){
        this.listaPersonas = new ArrayList();
    }

    public void anadirPersona(Persona persona){

        listaPersonas.add(persona);
    }

    public void listar(){
        for ( Persona item : listaPersonas ) {
            System.out.println("Imprimiendo persona");
            item.mostrarDatos();
        }
    }

    public void borrarPersona(int telefono){

        for (int i = 0; i < listaPersonas.size(); i++) {
            if (telefono == listaPersonas.get(i).getTelefono()){
                listaPersonas.remove(i);
            }
        }

    }



}
