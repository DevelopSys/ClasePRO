package clase.ejercicio4;

import clase.ejercicio4.controller.Agenda;
import clase.ejercicio4.model.Persona;

public class Entrada {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        agenda.agregarUsuario(new Persona("Borja","1234X",1234));
        agenda.agregarUsuario(new Persona("Borja","2234X",1234));
        agenda.agregarUsuario(new Persona("Borja","3234X",1234));
        agenda.agregarUsuario(new Persona("Borja","4234X",1234));
        agenda.agregarUsuario(new Persona("Borja","5234X",1234));
        //agenda.borrarUsuario("5234X");
        //agenda.listarUsuarios();
        agenda.editarUsuario("5234X");
        agenda.buscarUsuario("5234X");
    }
}
