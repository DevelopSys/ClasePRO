import controller.Agenda;

public class MainAgenda {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.importarDatos();
        int opcion;
        do{
            System.out.println("1. Agregar contacto");
            System.out.println("2. Borrar contacto");
            System.out.println("3. Listar contactos");
            System.out.println("4. Buscar contacto");
            System.out.println("5. Salir");
            // scanner
            opcion = 1;
            switch (opcion){
                case 5->{
                    agenda.exportarDatos();
                    System.out.println("Saliendo....");
                }
            }
        }while (opcion!=5);
    }
}
