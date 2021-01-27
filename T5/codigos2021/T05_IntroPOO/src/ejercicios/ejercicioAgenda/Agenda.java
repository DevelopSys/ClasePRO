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

        // si la persona que intento agregar existe --> existe = true
        // si la persona que intento agregar no existe --> existe = false
        return existe;

    }

    public void borrarPersona(String dni){

        if (this.esVacio() == false){

            Persona personaEncontrada = existeDNIEntero(dni);

            if (personaEncontrada!=null){
                listaPersonas.remove(personaEncontrada);
            }
            /*
            for (int i = 0; i < listaPersonas.size(); i++) {
                Persona pIterada = listaPersonas.get(i);
                if (existeDNI(dni,listaPersonas.get(i).getDni())) {
                    listaPersonas.remove(i);
                    break;

                }
            }*/
        }
    }

    public void listarPersonas(){


        if (this.esVacio() == false){
            for (Persona persona : this.listaPersonas) {
                System.out.println("Listando datos de persona......");
                persona.mostrarDatos();
            }
        }
    }

    public void buscarPersona(String dni){

        boolean encontrado = false;
        if (this.esVacio() == false){

            Persona personaEncontrada = existeDNIEntero(dni);
            if (personaEncontrada!= null){
                personaEncontrada.mostrarDatos();
            }

            /*

            for (Persona persona : listaPersonas) {
                if (existeDNI(dni,persona.getDni())){
                    System.out.println("Persona encontrada");
                    persona.mostrarDatos();
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado){
                System.out.println("La persona no está en la agenda");
            }*/
        }
    }

    public void editarPersona(String dni){

        if (this.esVacio() == false){

            Persona personaEncontada = existeDNIEntero(dni);
            // si la has encontrado personaEncontrada = ValorReal
            // si no la has encontrado personaEncontrada = null

            if (personaEncontada!= null){
                personaEncontada.setDni("345");
                personaEncontada.setNombre("NombreNuevo");
                personaEncontada.setTelefono(345);
            }

            /*for (int i = 0; i < listaPersonas.size(); i++) {

                if(existeDNI(dni,listaPersonas.get(i).getDni())){
                    // 345 NombreNuevo 345
                    Persona pEncontrada = listaPersonas.get(i);
                    pEncontrada.setDni("345");
                    pEncontrada.setNombre("NombreNuevo");
                    pEncontrada.setTelefono(345);
                }

            }*/
        }
    }

    public boolean existeDNI(String dni, String dniComprobar ){

        if (dni.toLowerCase().equals(dniComprobar.toLowerCase())){
            return true;
        }else {
            return false;
        }
    }
    public Persona existeDNIEntero(String dni){



        for (Persona persona:listaPersonas) {
            if (persona.getDni().toLowerCase().equals(dni.toLowerCase())){
                return persona;
            }
        }
        System.out.println("La persona no ha sido encontrada, operación cancelada");
        return null;


    }
    public boolean esVacio(){
        if (listaPersonas.size()>0){
            return false;
        } else {
            System.out.println("La lista está vacía");
            return true;
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
