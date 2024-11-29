import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    private static ArrayList<Integer> listaNumeros = new ArrayList<>();
    private static Scanner lecturaTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Utilizando listas");
        System.out.println("El tamaño inicial de la lista es: " + listaNumeros.size());
        anadirNumero(98);
        anadirNumero(13);
        anadirNumero(23);
        anadirNumero(13);
        obtenerDatos();
    }

    public static void anadirNumero(int numero) {
        if (listaNumeros.contains(numero)){
            // estas seguro
            System.out.println("El numero esta dentro de la lista, ¿seguro que quieres meterlo?");
            String respuesta = lecturaTeclado.next();
            if (respuesta.equalsIgnoreCase("y")){
                listaNumeros.add(numero);
                System.out.println("Numero añadido correctamente");
                System.out.println("Lista actualizada con un size de " + listaNumeros.size());
            } else {
                System.out.println("Saliendo de añadir");
            }
        } else {
            listaNumeros.add(numero);
            System.out.println("Numero añadido correctamente");
            System.out.println("Lista actualizada con un size de " + listaNumeros.size());
        }

    }

    // TODO cambiar el retorno al indice donde esta el repetido
    public static int encontrarNumero(int numero){
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i)==numero){
                return i;
            }
        }
        return -1;
    }

    public static void obtenerDatos() {
        // System.out.println("El ultimo elemento del arraylist es " + listaNumeros.get(listaNumeros.size() - 1));
        System.out.println("Todos los elementos del arraylist con");
        for ( int item : listaNumeros) {
            System.out.println(item);
        }

    }
}
