package exepciones;

import java.io.IOException;

public class Entrada {

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        //operaciones.sumar(4,6);
        //operaciones.dividir(0,70);
        //operaciones.multiplicar(4,9);
        /*try {

        operaciones.lecturaFichero();
        } catch (IOException e){
            System.out.println("Fichero no encontrado");
        }*/

        operaciones.lanzarPropia(-40);

    }
}
