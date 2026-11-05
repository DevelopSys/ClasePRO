import java.util.Scanner;

public class Main {


    public static Object[][] garaje;
    public static Scanner scanner = new Scanner(System.in);
    public static int caja = 0;

    public static void main(String[] args) {

        // crear un garaje
        // admitir coches {Matricula, Modelo, Marca, averia, coste}
        // 1. Indica cuantas plazas de coche tienes -> 6
        // 2. Admitir coches -> meter en la primera plaza libre un coche
        // 3. Mostrar
        // 4. Buscar un coche
        // el sistema pide la matricula del coche
        // una vez introducida se mostraran los datos del coche con dicha matricula
        // en caso de no existir el coche -> aviso
        // pidiendo los datos
        // si no hay plazas disponibles -> aviso
        // si el garaje no se ha inicializado -> aviso
        // si hay plazas lo guardo en la primera disponible
        // 5. Entregar coche
        // el sistema pide la mat del coche a entregar
        // en caso de que el coche no este -> aviso
        // en caso de que el coche este
        // se quita del garaje
        // la pasta de su averia se suma a la caja del garaje

        /*
            1. CAMBIAR EL AÑADIR COCHE
                NO PUEDO ADMITIR COCHES CON MATRICULA DUPLICADA
            2. CUANDO SE ADMITE UN COCHE
                ACEITE - 100 -200
                MOTOD - 300 - 500
                NEUMATICOS 200 - 300
                OTRA -> 50 - 100
            3. PEDIR INFO DE LOS COCHES CON UNA AVERIA
                ACEITE ->  

         */

        int opcion = 0;
        do {
            System.out.println("1. Iniciar garaje");
            System.out.println("2. Aceptar coche");
            System.out.println("3. Mostrar garaje");
            System.out.println("4. Buscar coche garaje");
            System.out.println("5. Entregar coche garaje");
            System.out.println("6. Mostrar caja");
            System.out.println("7. Salir");
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
                case 3 -> mostrarGaraje();
                case 4 -> {
                    if (garaje != null) {
                        System.out.println("Indica la matricula del coche a buscar");
                        String matriculaBuscar = scanner.next();
                        Object[] cocheEncontrado = buscarCoche(matriculaBuscar); // Object[]
                        if (cocheEncontrado != null) {
                            /*System.out.println("Matricula " + cocheEncontrado[0]);
                            System.out.println("Marca " + cocheEncontrado[1]);
                            System.out.println("Modelo " + cocheEncontrado[2]);
                            System.out.println("Averia " + cocheEncontrado[3]);
                            System.out.println("Pasta " + cocheEncontrado[4]);*/
                            for (Object data : cocheEncontrado) {
                                System.out.println(data);
                            }
                        } else {
                            System.out.println("El coche no se encuentra en el garaja");
                        }
                    }

                }
                case 5 -> {
                    System.out.println("Indica el coche que quieres entregar");
                    String matricula = scanner.next();
                    // esta el coche?
                    Object[] cocheEncontrado = buscarCoche(matricula);
                    if (cocheEncontrado != null) {
                        caja = caja + (int) cocheEncontrado[4];
                        vaciarCoche((String) cocheEncontrado[0]);
                    }
                }
                case 6 -> System.out.println("La caja actual es " + caja);
            }
        } while (opcion != 7);
    }

    public static void vaciarCoche(String matricula) {
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i][0] != null && garaje[i][0].toString().equalsIgnoreCase(matricula)) {
                garaje[i] = new Object[5];
            }
        }
    }

    public static void mostrarGaraje() {
        for (Object[] row : garaje) {
            for (Object data : row) {
                System.out.print(data + " ");
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


    public static Object[] buscarCoche(String matricula) {

        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i][0] != null && garaje[i][0].toString().equalsIgnoreCase(matricula)) {
                System.out.println("Coche encontrado");
                return garaje[i];
            }
        }

        return null;
    }
}
