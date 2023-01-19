package ejercicioAgenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Persona> listaPersonas;

    public Agenda() {
        listaPersonas = new ArrayList<>();
    }

    // Agregar persona. No se puede agregar una persona
    // que ya exista dentro de la agenda (con igual DNI)
    // En el caso de que se agrege la persona --> true
    // En el caso de que no se agrege la persona --> false
    // [new Persona("Borja","Martin",1234A,1234)]
    // new Persona("Nueva","Apellido",1234A,2345)


    public Persona existePersona(String dni) {

        Persona personaEncontrada = null;

        for (Persona item : listaPersonas) {
            if (dni.equalsIgnoreCase((item.getDni()))) {
                personaEncontrada = item;
                break;
            }
        }

        return personaEncontrada;
    }

    public boolean agregarPersona(Persona persona) {
        // add la persona cuando no existe
        // no add la persona cuando existe
        boolean existe = existePersona(persona.getDni()) == null;
        if (existe) {
            listaPersonas.add(persona);

        } else {
            System.out.println("El dni ya existe, no se puede add");
        }
        return existe;
    }

    public boolean borrarPersona(String dni) {

        Persona persona = existePersona(dni);

        if (persona != null) {
            // borro si hay persona
            listaPersonas.remove(persona);
            return true;

        } else {
            System.out.println("No se ha borrado, porque no existe");
            return false;
        }

    }

    // vaciar agenda
    public void vaciarAgenda(){
        listaPersonas.clear();
    }

    public void actualizarPersona(String dni, Persona personaNueva){

        Persona personaEncontrada = existePersona(dni);
        if (personaEncontrada!=null){
            // actualizo
            // obtener de alguna forma la posicion de la persona que quiero actualizar
            // listaPersonas.set(0,personaEncontrada);
            //personaEncontrada = personaNueva;
            personaEncontrada.setApellido(personaNueva.getApellido());
            personaEncontrada.setNombre(personaNueva.getNombre());

        } else {
            System.out.println("No se ha encontrado la persona");
        }

    }

    public void buscarPersona(String dni){
        Persona personaEncontrada = existePersona(dni);
        if (personaEncontrada!=null){
            personaEncontrada.mostrarDatos();
        } else {
            System.out.println("Persona no encontrada");
        }
    }
    public void listarAgenda() {
        if (!listaPersonas.isEmpty()) {
            /*for (int i = 0; i < listaPersonas.size(); i++) {
                listaPersonas.get(i).mostrarDatos();
            }*/

            for (Persona item : listaPersonas) {
                item.mostrarDatos();
            }

        } else {
            System.out.println("No se puede listar porque está vacía");
        }
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
