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
        /*operaciones.eliminarElemento("primera");
        operaciones.eliminarElemento("segunda");
        operaciones.eliminarElemento("tercera");
        operaciones.eliminarElemento("cuarta");
        operaciones.eliminarElemento("cuarta");*/
        operaciones.modificarElemento();
        operaciones.listarElementos();

        /*if (operaciones.buscarElemento("octava")>-1){
            // esta
            System.out.printf("La palabra %s está en la lista en la posicion %d\n"
                    ,"segunda",operaciones.buscarElemento("octava"));
        }else {
            // no esta
            System.out.println("El elemento no esta en la lista");
        }*/
        ; // 1

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
