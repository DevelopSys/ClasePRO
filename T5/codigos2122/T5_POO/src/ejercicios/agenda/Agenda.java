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
            item.mostrarDatos();
        }
    }



}
