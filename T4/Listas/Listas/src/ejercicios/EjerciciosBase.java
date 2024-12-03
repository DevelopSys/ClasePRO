package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EjerciciosBase {

    private static ArrayList<String> listaPalabras = new ArrayList<>();
    private static ArrayList<Integer> listaNumeros = new ArrayList<>();
    private static ArrayList<Integer> listaaNumerosAleatorios1 = new ArrayList<>();
    private static ArrayList<Integer> listaaNumerosAleatorios2 = new ArrayList<>();


    public static void main(String[] args) {
        ejercicio4();
    }

    public static void ejercicio3() {
        /*
        Crea dos ArrayList de números y guarda de forma aleatorio 20 números
        sin decimales en cada uno de ellos. Una vez hecho esto comprueba cuantos
        números de los dos arraylist son iguales (mismo número en la misma posición).
        Tras hacer la comprobación indica cuantos números han sido iguales
         */

        /*for (int i = 0; i <20; i++) {
            listaaNumerosAleatorios1.add((int) (Math.random()*21));
            listaaNumerosAleatorios2.add((int) (Math.random()*21));
        }*/

        rellenarArray(listaaNumerosAleatorios1);
        rellenarArray(listaaNumerosAleatorios2);
        System.out.println("El numero de repetidos es " + cuantosRepetidos());


    }

    public static void ejercicio4() {
        listaPalabras.add("Ejemplo1jytyutuytuytuyt");
        listaPalabras.add("a1");
        listaPalabras.add("asd");
        listaPalabras.add("fdwer");
        listaPalabras.add("fgtryeqw");
        listaPalabras.add("asfdghuetfde");
        int numeroLetras = 0;
        String palabraMayor = listaPalabras.get(0);
        String palabraMenor = listaPalabras.get(0);
        for (String item : listaPalabras) {
            numeroLetras += item.length();
            if (palabraMayor.length() < item.length()) {
                palabraMayor = item;
            }
            if (palabraMenor.length() > item.length()) {
                palabraMenor = item;
            }
        }

        ordenarLista(listaPalabras);

        for (String item: listaPalabras) {
            System.out.println(item);
        }

    }

    public static void ordenarLista(ArrayList<String> lista) {
        // Collections.sort(lista); // ordenados alfabeticamente
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if (o1.length() > o2.length()) {
                    return -1;
                } else if (o1.length() < o2.length()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public static int cuantosRepetidos() {
        int repetidos = 0;
        for (int i = 0; i < listaaNumerosAleatorios1.size(); i++) {
            if (listaaNumerosAleatorios1.get(i) == listaaNumerosAleatorios2.get(i)) {
                repetidos++;
            }
        }
        return repetidos;
    }

    public static void rellenarArray(ArrayList<Integer> lista) {
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 21));
        }
    }

    public static void ejercicio2() {
        for (int i = 0; i < 20; i++) {
            agregarNumero((int) (Math.random() * 101));
        }
        imprimirArrayListInt(listaNumeros);
        // calculo max y min
        int max = listaNumeros.getFirst();
        int min = listaNumeros.getFirst();

        int suma = 0;
        for (int item : listaNumeros) {
            /*if (item>max){
                max = item;
            }
            if (item<min){
                min = item;
            }*/
            suma += item;
        }
        double media = (double) suma / listaNumeros.size();
        Collections.sort(listaNumeros);
        max = listaNumeros.getLast();
        min = listaNumeros.getFirst();


    }

    public static void agregarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public static void ejercicio1() {
        for (int i = 0; i < 10; i++) {
            agregarPalabra("Palabra " + (i + 1));
        }
        imprimirArrayList(listaPalabras);
    }


    public static void imprimirArrayList(ArrayList<String> lista) {
        for (String item : lista) {
            System.out.println(item);
        }
    }

    public static void imprimirArrayListInt(ArrayList<Integer> lista) {
        for (int item : lista) {
            System.out.println(item);
        }
    }

    public static void agregarPalabra(String palabra) {
        listaPalabras.add(palabra);
    }
}
