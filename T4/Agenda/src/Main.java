import java.util.Scanner;

public class Main {


    public static Object[][] garaje;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // crear un garaje
        // admitir coches {Matricula, Modelo, Marca, averia, coste}
        // 1. Indica cuantas plazas de coche tienes -> 6
        // 2. Admitir coches -> meter en la primera plaza libre un coche
        // pidiendo los datos
        // si no hay plazas disponibles -> aviso
        // si el garaje no se ha inicializado -> aviso
        // si hay plazas lo guardo en la primera disponible
        int opcion = 0;
        do {
            System.out.println("1. Iniciar garaje");
            System.out.println("2. Aceptar coche");
            System.out.println("3. Mostrar garaje");
            System.out.println("4. Salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    // solo lo puedo iniciar si antes no se ha iniciado
                    if (garaje == null) {
                        System.out.println("Procedemos a iniciar el garaje");
                        iniciarGaraje();
                    } else {
                        System.out.println("Ya cuentas con un garaje activo");
                    }
                }
                case 2 -> {
                    if (garaje != null) {
                        admitirCoche();
                    } else {
                        System.out.println("El garaje esta cerrado");
                    }
                }
                case 3-> mostrarGaraje();
            }
        } while (opcion != 4);
    }


    public static void mostrarGaraje(){
        for (Object[] row: garaje) {
            for (Object data: row) {
                System.out.print(data +" ");
            }
            System.out.println();
        }
    }

    public static void iniciarGaraje() {
        System.out.println("Cuantos coches vas a admitir");
        int nCoches = scanner.nextInt();
        garaje = new Object[nCoches][5];
    }

    public static void admitirCoche() {

        if (!estaCompleto()) {
            // datos
            System.out.println("Indica marca");
            String marca = scanner.next();
            System.out.println("Indica modelo");
            String modelo = scanner.next();
            System.out.println("Indica averia");
            String averia = scanner.next();
            System.out.println("Indica matricula");
            String matricula = scanner.next();
            Object[] coche = new Object[]{matricula, marca, modelo, averia, (int) (Math.random() * 100) + 100};
            for (int i = 0; i < garaje.length; i++) {
                if (garaje[i][0] == null) {
                    garaje[i] = coche;
                    break;
                }
            }
        } else {
            System.out.println("No hay plazas");
        }

    }

    public static boolean estaCompleto() {

        for (Object[] data : garaje) {
            if (data[0] == null) {
                return false;
            }
        }

        return true;
    }
}
