package ejercicios.ejercicioBiblioteca;

import java.util.ArrayList;

public final class Biblioteca {

    private ArrayList<Persona> listaPersonas;
    private ArrayList<Elemento> listaElementos;

    public Biblioteca() {
        this.listaPersonas = new ArrayList<>();
        this.listaElementos = new ArrayList<>();
    }

    public void registrarPersona(Persona persona){
        listaPersonas.add(persona);
    }

    public void realizarPrestamo(Socio socio, Prestar elementoPrestable){

        for ( Persona itemPersona :  listaPersonas) {
            if (itemPersona.getDni().equals(socio.getDni())
                    && itemPersona.getClass().getSimpleName().equals("Socio")){
                elementoPrestable.prestar();
                socio.getListaElementosPrestamos().add(elementoPrestable);
            }
        }

    }

    public void mostrarElementosSocio(String dni){
        for ( Persona itemPersona : listaPersonas ) {
            if (itemPersona.getClass().getSimpleName().toLowerCase().equals("socio")
            && itemPersona.getDni().toLowerCase().equals(dni) ){
                itemPersona.mostrarDatos();
            }
        }
    }

    public void mostrarPrestados(){
        for (Elemento elemento: listaElementos ) {
            if (!elemento.isDisponible()){
                elemento.mostarDatos();
            }
        }
    }


    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ArrayList<Elemento> getListaElementos() {
        return listaElementos;
    }

    public void setListaElementos(ArrayList<Elemento> listaElementos) {
        this.listaElementos = listaElementos;
    }
}
