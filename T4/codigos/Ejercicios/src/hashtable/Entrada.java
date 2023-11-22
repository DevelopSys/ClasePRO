package hashtable;

public class Entrada {


    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregarPersona(new Object[]{"Borja1", "Martin",1234,1234});
        agenda.agregarPersona(new Object[]{"Borja2", "Martin",1234,2234});
        agenda.agregarPersona(new Object[]{"Borja3", "Martin",1234,3234});
        agenda.borrarPersona(1234);
        agenda.buscarPersona(1234);
    }
}
