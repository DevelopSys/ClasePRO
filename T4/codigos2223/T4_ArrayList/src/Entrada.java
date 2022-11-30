import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        listasTipadas();
        ejercicioNumeros();


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
            listaNumeros.add((int) (Math.random()*21));
        }

        int numeroEvaluar = new Scanner(System.in).nextInt();
        int posicionInicial =-1;
        int numeroRepeticiones=0;

        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i)==numeroEvaluar){
                numeroRepeticiones++;
                if (numeroRepeticiones==1){
                    posicionInicial = i;
                }
            }

        }

        if (listaNumeros.contains(numeroEvaluar)){
            // el numero esta
            if (numeroRepeticiones>1){
                // el numero se repite
            } else {
                // el numero no se repite
            }
        } else {
            // el numero no esta
        }
    }

    public static void listasTipadas(){
        ArrayList<String> listaPalabras = new ArrayList();
        listaPalabras.add("Programacion");
        listaPalabras.add("Palabra 1");
        listaPalabras.add("Ejemplo");
        listaPalabras.add("Coincide");
        listaPalabras.add("Mestra");
        listaPalabras.add("Secundaria");
        // busquedas
        //encontraElemento("no existe",listaPalabras);
        if (listaPalabras.contains("Programacion")){
            System.out.println("Esta la palabra");
        }else {
            System.out.println("No esta la palabra");
        }
        // busca elementos
        // --> se pide una palabra por teclado
        // --> se comprueba si la palabra esta en la lista
    }

    public static void encontraElemento(String elemento, ArrayList<String> lista){

        boolean encontrado=false;
        String palabraEncontrada=null;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equalsIgnoreCase(elemento)){
                encontrado = true;
                palabraEncontrada = lista.get(i);
                break;
            }
        }

        // despues del break o terminar
        if (palabraEncontrada!=null){
            System.out.println("Palabra encontrada");
        }else {
            System.out.println("Palabra no encontrada");
        }
    }

    public static void inicioArrayList(){
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
        System.out.println("El elemento de la posicion 1 es "+lista.get(0));
        // cambio elemento
        lista.set(0,9876);
        System.out.println(lista.size());
        System.out.println("El elemento de la posicion 1 es "+lista.get(0));
        // sacar todos los elementos de la lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for ( Object item : lista ) {
            System.out.println(item);
        }
    }
}
