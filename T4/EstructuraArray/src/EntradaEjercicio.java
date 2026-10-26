import java.util.Map;
import java.util.Scanner;

public class EntradaEjercicio {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        // Crear un programa que me pida el numero de amigos que quiero guardar
        // 6
        // una vez introducido se pediran los nombres de todos ellos
        System.out.println("Cuantos amigos quieres guardar");
        int numeroAmigos = lector.nextInt();
        String[] amigos = new String[numeroAmigos]; // [null null null null]
        // amigos.for
        for (int i = 0; i < amigos.length; i++) {
            System.out.println("Indicame el nombre a guardar");
            String nombre = lector.next();
            // esta repetido?
            boolean repetido = false;
            // busqueda

            if (estaNombre(amigos,nombre)) {
                System.out.println("Esta repetido");
                i--;

            } else {
                System.out.println("No esta repetido");
                amigos[i] = nombre;
            }
        }
        int opcion;
        String amigoLargo = amigos[0];
        do {
            System.out.println("1. Listar amigos");
            System.out.println("2. Aleatorio");
            System.out.println("3. Mas largo");
            System.out.println("4. Salir");
            System.out.println("Opcion");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1 -> {
                    for (String amigo : amigos) {
                        System.out.println(amigo);
                    }
                }
                case 2 -> {
                    // [0.....10] -> 7 -> amigos[7]
                    int radom = (int) (Math.random() * amigos.length); // 6
                    System.out.println(amigos[radom]);
                }
                case 3 -> {
                    for (String amigo : amigos) {
                        if (amigo.length() > amigoLargo.length()) {
                            amigoLargo = amigo;
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Buscar elemento");
                    String nombreBuscar = lector.next();

                    System.out.println(estaNombre(amigos,nombreBuscar) ? "encontrado" : "no encontrado");

                }
                case 5 -> {
                    System.out.println("Saliendo......");
                }
                default -> {
                    System.out.println("No contemplada");
                }
            }

        } while (opcion != 5);


        // x,x,x,x,x,x
        // Con un menu
        // 1- Mostrar todos los amigos
        // 2- Sacar un amigo de forma aleatoria
        // 3- nombre con mas letras
        // 4- Buscar un amigo
        // 5- salir

        // Busqueda
        // El sistema pide el nombre de un amigo a buscar. En caso de que el nombre este repetido
        // El sistema indica que esta presente y cuantas veces se repite

        // Añadir
        // El sistema no podrá meter nombres duplicados
        // Si yo ya he introducido el nombre juan, al introducir lotra vez me dira
        // que ese nombre ya esta en el sistema

    }
    public static boolean estaNombre(String[] amigos, String amigo){
        for (String item: amigos) {
            if(item != null && item.equals(amigo)){
                return true;
            }
        }
        return false;
    }
}
