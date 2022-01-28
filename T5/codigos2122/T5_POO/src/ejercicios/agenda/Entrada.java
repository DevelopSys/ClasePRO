package ejercicios.agenda;

public class Entrada {

    public static void main(String[] args) {
        Persona persona = new Persona("Borja","Martin",234);
        Agenda agenda = new Agenda();
        agenda.anadirPersona(persona);
        agenda.anadirPersona(new Persona("Luis","Baonza",1234));
        // lista = Borja, Luis

        agenda.listar();
        if (agenda.borrarPersona(1234)){

        }else {

        }

        // si has borrado a la persona saca un mensaje de
        // borrado correctamente
        System.out.println("Despues de borrar");
        agenda.listar();
    }
}
