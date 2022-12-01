import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        //listasTipadas();
        //ejercicioNumeros();
        //ejercicioBase1();
        //ejercicioBase2();
        //ejercicioBase3();
        //ejercicioBase4();
        ejercicioBase5();


    }

    private static void ejercicioBase5() {
        ArrayList<String> listaPalabras = new ArrayList<>();
        listaPalabras.add("Palabra 1");
        listaPalabras.add("Ejemplo");
        listaPalabras.add("Otra");
        listaPalabras.add("Cosa");
        listaPalabras.add("Una");
        listaPalabras.add("Java");

        int contadorLetras = 0;
        String palabraGrande=listaPalabras.get(0).replaceAll(" ", "")
                , palabraPequenia=listaPalabras.get(0).replaceAll(" ", "");

        for (String item : listaPalabras) {
            contadorLetras += item.replaceAll(" ", "").length();
            if (item.replaceAll(" ", "").length() > palabraGrande.length()){
                palabraGrande = item;
            }

            if (item.replaceAll(" ", "").length() < palabraPequenia.length()){
                palabraPequenia = item;
            }
        }

        System.out.println("La palabra más grande es "+palabraGrande);
        System.out.println("La palabra más pequeña es "+palabraPequenia);
        System.out.println("El numero de letras es "+contadorLetras);

    }

    private static void ejercicioBase4() {
        ArrayList<Integer> numerosUno = new ArrayList<>();
        ArrayList<Integer> numerosDos = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            //int aletorio = (int) (Math.random()*21);
            //numerosDos.add(aletorio);
            //numerosUno.add(aletorio);
            numerosUno.add((int) (Math.random() * 21));
            numerosDos.add((int) (Math.random() * 21));
        }

        int contador = 0;
        for (int i = 0; i < numerosDos.size(); i++) {
            if (numerosUno.get(i) == numerosDos.get(i)) {
                contador++;
            }
        }

        System.out.println("el numero de coincidencias es: " + contador);

    }

    private static void ejercicioBase3() {
        ArrayList<String> companieros = new ArrayList<>();
        companieros.add("Alumno1");
        companieros.add("Alumno2");
        companieros.add("Alumno3");
        companieros.add("Alumno4");
        companieros.add("Alumno5");
        companieros.add("Alumno6");
        companieros.add("Alumno7");
        companieros.add("Alumno8");
        companieros.add("Alumno9");
        companieros.add("Alumno10");
        // lista -> size 10 (0-9)
        int aleatorio = (int) (Math.random() * companieros.size());
        System.out.println(companieros.get(aleatorio));


    }

    private static void ejercicioBase2() {
        // 20 valores
        ArrayList<Integer> listaNumeros = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            listaNumeros.add((int) (Math.random() * 101));
        }

        int sumatorio = 0, max = 0, min = 101;
        double media = 0.0;

        for (Integer numero : listaNumeros) {
            sumatorio += numero;
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }

        media = (double) sumatorio / listaNumeros.size();

        /*for (int i = 0; i < listaNumeros.size(); i++) {
            sumatorio += listaNumeros.get(i);
            if (listaNumeros.get(i)>max){
                max = listaNumeros.get(i);
            }
            if (listaNumeros.get(i)<min){
                min = listaNumeros.get(i);
            }
        }*/
    }

    private static void ejercicioBase1() {
        ArrayList<String> listaPalabras = new ArrayList<>();
        listaPalabras.add("Palabra 1");
        listaPalabras.add("Ejemplo");
        listaPalabras.add("Otra");
        listaPalabras.add("Cosa");
        listaPalabras.add("Una");
        listaPalabras.add("Java");

        for (String item : listaPalabras) {
            System.out.println(item);
        }

    }

    private static void ejercicioNumeros() {
        // Crear una lista de numeros (solo numeros)
        // Meter 50 aleatorios entre 0-20
        // Pedir al usuario un número
        // Indicar las veces que se repite dicho número
        // Obtener primera la posicion del numero indicado
        // En el caso de no repetirse nunca, avisar al usuario
        // En el caso de no estar, avisar al usuario
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listaNumeros.add((int) (Math.random() * 21));
        }

        int numeroEvaluar = new Scanner(System.in).nextInt();
        int posicionInicial = -1;
        int numeroRepeticiones = 0;

        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) == numeroEvaluar) {
                numeroRepeticiones++;
                if (numeroRepeticiones == 1) {
                    posicionInicial = i;
                }
            }

        }

        if (listaNumeros.contains(numeroEvaluar)) {
            // el numero esta
            if (numeroRepeticiones > 1) {
                // el numero se repite
            } else {
                // el numero no se repite
            }
        } else {
            // el numero no esta
        }
    }

    public static void listasTipadas() {
        ArrayList<String> listaPalabras = new ArrayList();
        listaPalabras.add("Programacion");
        listaPalabras.add("Palabra 1");
        listaPalabras.add("Ejemplo");
        listaPalabras.add("Coincide");
        listaPalabras.add("Mestra");
        listaPalabras.add("Secundaria");
        // busquedas
        //encontraElemento("no existe",listaPalabras);
        if (listaPalabras.contains("Programacion")) {
            System.out.println("Esta la palabra");
        } else {
            System.out.println("No esta la palabra");
        }
        // busca elementos
        // --> se pide una palabra por teclado
        // --> se comprueba si la palabra esta en la lista
    }

    public static void encontraElemento(String elemento, ArrayList<String> lista) {

        boolean encontrado = false;
        String palabraEncontrada = null;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equalsIgnoreCase(elemento)) {
                encontrado = true;
                palabraEncontrada = lista.get(i);
                break;
            }
        }

        // despues del break o terminar
        if (palabraEncontrada != null) {
            System.out.println("Palabra encontrada");
        } else {
            System.out.println("Palabra no encontrada");
        }
    }

    public static void inicioArrayList() {
        ArrayList lista = new ArrayList();
        // tamaño de la lista
        System.out.println(lista.size());
        // añadir elemento
        lista.add("Elemento 1");
        lista.add(12345);
        lista.add(true);
        lista.add('A');
        System.out.println(lista.size());
        // eliminar elementos
        lista.remove(2);
        lista.remove(1);
        System.out.println(lista.size());
        // antes del cambio
        System.out.println("El elemento de la posicion 1 es " + lista.get(0));
        // cambio elemento
        lista.set(0, 9876);
        System.out.println(lista.size());
        System.out.println("El elemento de la posicion 1 es " + lista.get(0));
        // sacar todos los elementos de la lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (Object item : lista) {
            System.out.println(item);
        }
    }
}
