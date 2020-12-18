import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class AgendaHash {

    public static void main(String[] args) {

        String nombre, apellido, dni;
        int telefono;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        Hashtable<String,Object[]> agenda = new Hashtable();

        do{
            System.out.println("1, Agregar");
            System.out.println("2, Listar");
            System.out.println("3, Buscar");
            System.out.println("4, Borrar");
            System.out.println("5, Salir");
            System.out.println("Introduce opción");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Nombre");
                    nombre = teclado.next();
                    System.out.println("Apellido");
                    apellido = teclado.next();
                    System.out.println("Telefono");
                    telefono = teclado.nextInt();
                    System.out.println("Dni");
                    dni = teclado.next();

                    Object[] persona = {dni,nombre,apellido,telefono};
                    agenda.put( persona[0].toString(), persona );
                    //System.out.println(agenda.size());
                    persona = null;

                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Intro dni");
                    dni = teclado.next();
                    if (agenda.containsKey(dni)) {
                        Object[] encontrado = agenda.get(dni);
                        for (Object item: encontrado) {
                            System.out.println(item);
                        }
                    }else {
                        System.out.println("No existe el dni");
                    }

                    break;
                case 4:
                    break;
                }
        }while(opcion!=5);


    }
}
