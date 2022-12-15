import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Entrada {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Hashtable<String, Object[]> agenda = new Hashtable<>();

        agenda.


        int opcion = 0;
        do {
            System.out.println("1. Agrega usuario");
            System.out.println("2. Busca usuario");
            System.out.println("3. Borrar usuario");
            System.out.println("4. Lista usuarios");
            System.out.println("5. Salir");
            System.out.println("Introduce opcion a realizar");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // llamo al metodo
                    agregarUsuario(agenda);
                    break;
                case 2:
                    buscarUsuario(agenda);
                    break;
                case 3:
                    // sacar el mensaje de error o acierto
                    /*if(borrarUsuario(agenda)){
                        System.out.println("usuario borrado correctamente");
                    }else {
                        System.out.println("fallo al borrar, usuario no encontrado");
                    }*/
                    borrarUsuario(agenda);
                    break;
                case 4:
                    // llamo al metodo
                    listarUsuarios(agenda);
                    break;
                case 5:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Por favor introduce la correcta");
            }

        } while (opcion != 5);

    }

    public static void buscarUsuario(Hashtable<String, Object[]> agendaParametro){
        // necesito lista
        // necesito dni
        System.out.println("Introduce el dni de la persona que quieres borrar");
        String dni = scanner.next();
        Object[]usuarioEncontrado;
        if ((usuarioEncontrado = agendaParametro.get(dni))!=null){
            // saco datos
            mostrarInformacion(usuarioEncontrado);
        } else {
            System.out.println("Persona no encontrada");
        }

    }

    public static void agregarUsuario(Hashtable<String, Object[]> agendaParametro) {
        // datos --> Object[]
        System.out.println("Introduce dni del usuario");
        String dni = scanner.next();

        if (agendaParametro.containsKey(dni)) {
            System.out.println("Fallo al agregar, el dni ya existe");
        } else {

            System.out.println("Introduce nombre del usuario");
            String nombre = scanner.next();
            System.out.println("Introduce apellidop del usuario");
            String apellido = scanner.next();
            System.out.println("Introduce telefono del usuario");
            int telefono = scanner.nextInt();
            Object[] usuario = new Object[]{nombre, apellido, telefono, dni};
            // lista donde guardar
            agendaParametro.put(usuario[3].toString(), usuario);
            System.out.println("Añadida correctamente");
        }


    }

    public static void borrarUsuario(Hashtable<String, Object[]> agendaParametro) {
        // necesito la lista
        // necesito el dni
        System.out.println("Introduce el dni de la persona que quieres borrar");
        String dni = scanner.next();
        // solo lo borro si el usaurio esta contenido
        /*if (agendaParametro.containsKey(dni)) {
            agendaParametro.remove(dni);
        } else {
            System.out.println("Fallo al borrar, usuario no encontrado");
        }*/
        Object[] usuarioBorrado;
        if ( (usuarioBorrado = agendaParametro.remove(dni) ) !=null){
            System.out.println("Persona borrada correctamente con nombre "+usuarioBorrado[0]);
        } else {
            System.out.println("Fallo al borrar, usuario no encontrado");
        }
        //return agendaParametro.remove(dni) != null;
    }

    public static void listarUsuarios(Hashtable<String, Object[]> agendaParametro) {
        // la lista que quiero mostrar siempre y cuando tenga cosas

        if (!agendaParametro.isEmpty()) {
            // 1. sacar las claves de la lista
            Enumeration<String> claves = agendaParametro.keys();
            // [k1,k2,k3,k4,k5]

            // 2. con cada clave --> saco el usuario asociado a la clave
            while (claves.hasMoreElements()) {
                String key = claves.nextElement();
                Object[] usuario = agendaParametro.get(key);
               mostrarInformacion(usuario);
            }
        } else {
            System.out.println("La agenda no tiene datos");
        }
    }

    public static void mostrarInformacion(Object[] usuarioParametro){
        // necesito un usuario
        System.out.println("Nombre: " + usuarioParametro[0]);
        System.out.println("\tApellido: " + usuarioParametro[1]);
        System.out.println("\tTelefono: " + usuarioParametro[2]);
    }

}
