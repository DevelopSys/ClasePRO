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

    public boolean borrarPersona(int telefono){

        for (int i = 0; i < listaPersonas.size(); i++) {
            if (telefono == listaPersonas.get(i).getTelefono()){
                listaPersonas.remove(i);
                return true;
            }
        }
        return false;

    }

    public void buscarPersona(int telefono){
        for ( Persona persona : listaPersonas ) {
            if (persona.getTelefono() == telefono){
                persona.mostrarDatos();
                break;
            }
        }
    }

    public void editarPersona(int telefono){
        for ( Persona persona : listaPersonas ) {
            if (persona.getTelefono() == telefono){
                persona.setNombre("Otro nombre");
                persona.setDni("123123");
                break;
            }
        }
    }
}
