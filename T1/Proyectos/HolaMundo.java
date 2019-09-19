
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Borja Martín
 */
public class HolaMundo {

    // Programa que imprime por pantalla un mensaje
    // Segunda linea del comentario 
    /* Esto es un comentario que tiene varias lineas 
    Ejemplo de segunda linea
    Ejemplo de tercera linea
     */
    /**
     * Esto es un comentario dedicado a documentación de la herramienta JavaDoc
     *
     * @param arg el parametro sirve para lo que sea
     * @method main
     * @version 1.0
     */
    public static void main(String[] arg) {

        // tipo nombre = valor;
        // byte
        byte miByte = 127;
        // short
        short miShort = 32750;
        // enteros
        int miInt = 2147483647;
        //long
        long miLong = 23423423;
        // float o double
        float miFloat = 1123f;
        double miDouble = 1.5;
        // String
        String miString = "mi palabra";
        // char
        char miLetra = '5';
        // bool
        boolean miBooleanoVerdadero = true;
        boolean miBooleanoFalso = false;

        String miNombre = "Borja";

        Scanner teclado = new Scanner(System.in);
        miNombre = teclado.next();

        int edad;

        edad = 18;

        //int edad = 20;
        /*System.out.println("Hola Mundo");
        System.out.println("Mi nombre es: " + miNombre + edad);
        System.out.println("Mi apellido es: Martín");*/
        System.out.println("Hola, mi nombre es: " + miNombre + " y tengo "
                + edad + " años");
        // edad = 30;

        System.out.println("Hola, mi nombre es: " + miNombre + " y tengo "
                + edad + " años");

    }

    /*
    * comentario de lineas
     */
}

// comentario fuera de clase

