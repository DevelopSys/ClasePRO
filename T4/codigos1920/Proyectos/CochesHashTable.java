package inicio;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class CochesHashTable {


    static Scanner teclado = new Scanner(System.in);
    static Hashtable<String, Object[]> coches;

    public static void main(String[] args) {

        int opcion = 0;
        coches = new Hashtable();
        do {
            System.out.println("1- Agregar");
            System.out.println("2- Listar");
            System.out.println("3- Buscar");
            System.out.println("4- Eliminar");
            System.out.println("5- Costes");
            System.out.println("6- Vaciar");
            System.out.println("7- Salir");
            System.out.println("Introduce opción");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    agregarCoche();
                    break;
                case 2:
                    listarCoches();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    break;
            }

        } while (opcion != 7);

    }

    private static void listarCoches() {
        Enumeration<Object[]> cochesRecuperados = coches.elements();
        while (cochesRecuperados.hasMoreElements()) {
            Object[] recuperado = cochesRecuperados.nextElement();
            for (Object item : recuperado) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static void agregarCoche() {
        System.out.println("intro modelo");
        String modelo = teclado.next();
        System.out.println("intro cv");
        int cv = teclado.nextInt();
        System.out.println("intro coste");
        double coste = teclado.nextDouble();
        System.out.println("intro matricula");
        String matricula = teclado.next();
        if (coches.containsKey(matricula)) {
            System.out.println("no puedo agregarlo");
        } else {
            Object[] unCoche = {modelo, cv, coste, matricula};
            coches.put(matricula, unCoche);
        }
    }

    public static void buscarCoche(String matricula) {
        if (coches.containsKey(matricula)) {
            Object[] encontrado = coches.get(matricula);

        }
    }

}

