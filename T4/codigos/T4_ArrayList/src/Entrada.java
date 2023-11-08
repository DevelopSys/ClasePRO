import arraylist.OperacionesBase;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {


        // TIPO nombre = valor
        Scanner scanner = new Scanner(System.in);
        OperacionesBase operaciones = new OperacionesBase();
        operaciones.crearListaPalabras();

        operaciones.agregarElemento("primera");
        operaciones.agregarElemento("segunda");
        operaciones.agregarElemento("tercera");
        operaciones.agregarElemento("cuarta");
        operaciones.agregarElemento("quinta");
        operaciones.agregarElemento("sexta");

        // obtener el resultado de una busqueda
            // quiero buscar la palabra septima -> llamada desde el main
        // quiero buscar la palanra XXXXX
        // la palabra esta en la posicion XXXX
            // la palabra septima no esta en la lista -> sout en el main

        //operaciones.listarElementos();
        // acceder al tamaño de lista
        //operaciones.obtenerElemento(operaciones.obtenerTamanioLista()-1);
        /*
        System.out.println("Dime que palabra quieres añadir");
        palabra = scanner.next();
        */
    }

}
