package ejercicioAgenda;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        // SACAR TODOS LAS PERSONAS QUE SON DEL TRABAJO Y AMIGOS --> PARA EL VIERNES
        Agenda agendaTrabajo = new Agenda();
        // listaPersonas[p2,p3]
        Agenda agendaAmigos = new Agenda();
        // listaPersonas[p1]
        ArrayList<Persona> listaCoincidentes = new ArrayList<>();

        agendaTrabajo.agregarPersona(new Persona("Borja","Martin","123A",123));
        agendaTrabajo.agregarPersona(new Persona("Isaac","Sampedro","123B",234));
        agendaTrabajo.agregarPersona(new Persona("Jesus","Niño","234A",234));

        /*agendaTrabajo.vaciarAgenda();
        agendaTrabajo.listarAgenda();
        //agendaTrabajo.buscarPersona("623A");
        /*agendaTrabajo.borrarPersona("123A");
        agendaTrabajo.actualizarPersona("123B"
                ,new Persona("ModificadoN", "ModificadoAP","123D",1234));
        agendaTrabajo.listarAgenda();*/

        agendaAmigos.agregarPersona(new Persona("Jesus","Niño","234A",234));
        agendaAmigos.agregarPersona(new Persona("Roberot","Baonza","3456A",123));
        agendaAmigos.agregarPersona(new Persona("Isaac","Sampedro","923B",934));


        for ( Persona amigo : agendaAmigos.getListaPersonas() ) {
            for ( Persona trabajador : agendaTrabajo.getListaPersonas() ) {
                if(amigo.getDni().equalsIgnoreCase(trabajador.getDni())){
                    listaCoincidentes.add(amigo);
                }
            }
        }

        System.out.println("Las personas que coinciden en el trabajo y los amigos son");
        for ( Persona coincidente: listaCoincidentes ) {
            coincidente.mostrarDatos();
        }




        //agendaAmigos.listarAgenda();



    }
}
