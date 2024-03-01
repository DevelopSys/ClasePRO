package biblioteca.controller;

import biblioteca.model.Elemento;
import biblioteca.model.Persona;
import biblioteca.model.Prestable;
import biblioteca.model.Socio;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Biblioteca {

    private ArrayList<Persona> listaPersonas;
    private ArrayList<Elemento> listaElementos;

    public Biblioteca() {
        listaElementos = new ArrayList<>();
        listaPersonas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona){
        // restriccion dni
        listaPersonas.add(persona);
    }

    public void agregarElemento(Elemento elemento){
        // restriccion id -> unico
        listaElementos.add(elemento);
    }

    public void realizarPrestamo(String dni, int id){
        // buscar la persona y que sea socio;
        Socio socio = new Socio();
        // buscar el prestable por el id
        //Prestable prestable = new Prestable();
        // el prestable esta prestado?

        //socio.agregarPrestamo(prestable);
        // cambias el estado
        //((Elemento)prestable).setEstado(false);

    }


}
