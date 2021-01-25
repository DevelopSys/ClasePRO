package ejercicios.ejercicioAgenda;

import java.util.ArrayList;

public class Agenda {

    // variables
    private ArrayList<Persona> listaPersonas;

    // constructor
    public Agenda() {
        listaPersonas = new ArrayList<>();
    }

    public Agenda(ArrayList<Persona> arrayList) {
        listaPersonas = arrayList;
    }

    // métodos

    /*public void agregarPersona(Persona persona){

        boolean existe = false;

        for (Persona personaItem : listaPersonas ) {
            if (personaItem.getDni().toLowerCase().equals(persona.getDni().toLowerCase())){
                existe = true;
                System.out.println("No se puede agregar, ya hay una persona");
                break;
            }
        }

        if (!existe){
            this.listaPersonas.add(persona);
        } /*else{
            System.out.println("No se puede agregar, ya hay una persona");
        }

    }*/

    public boolean agregarPersona(Persona persona){

        boolean existe = false;

        for (Persona personaItem : listaPersonas ) {
            if (personaItem.getDni().toLowerCase().equals(persona.getDni().toLowerCase())){
                existe = true;
                //System.out.println("No se puede agregar, ya hay una persona");
                break;
            }
        }

        if (!existe){
            this.listaPersonas.add(persona);
        } /*else{
            System.out.println("No se puede agregar, ya hay una persona");
        }*/
        return existe;

    }

    public void borrarPersona(String dni){

        if (listaPersonas.size()>0) {
            for (int i = 0; i < listaPersonas.size(); i++) {
                Persona pIterada = listaPersonas.get(i);
                if (pIterada.getDni().toLowerCase().equals(dni.toLowerCase())) {
                    listaPersonas.remove(i);
                    break;

                }
            }
        } else {
            System.out.println("No hay personas, no se puede borrar");
        }
    }

    public void listarPersonas(){

        if (listaPersonas.size()>0) {

            for (Persona persona : this.listaPersonas) {
                System.out.println("Listando datos de persona......");
                persona.mostrarDatos();
            }
        }else {
            System.out.println("no se puede listar, está vacía");
        }
    }

    public void buscarPersona(String dni){

        boolean encontrado = false;
        if (listaPersonas.size()>0){
            for (Persona persona : listaPersonas) {
                if (persona.getDni().toLowerCase().equals(dni.toLowerCase())){
                    System.out.println("Persona encontrada");
                    persona.mostrarDatos();
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado){
                System.out.println("La persona no está en la agenda");
            }
        } else {
            System.out.println("No hay personas a buscar");
        }
    }

    public void editarPersona(String dni){

        if (listaPersonas.size()>0){

            for (int i = 0; i < listaPersonas.size(); i++) {

                if(listaPersonas.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
                    // 345 NombreNuevo 345
                    Persona pEncontrada = listaPersonas.get(i);
                    pEncontrada.setDni("345");
                    pEncontrada.setNombre("NombreNuevo");
                    pEncontrada.setTelefono(345);
                }

            }

        } else {
            System.out.println("La lista está vacía");
        }

    }

    // gettes y setters

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
}
