package base;

import java.util.Scanner;

public class Ejercicio7 {

    // Crea un programa que pida 10 palabras por consola y las guarde en un array de String.
    // Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
    // Ver todas las palabras: mostrarla todas las palabras del array
    // Obtener una palabra al azar: mostrará una palabra de las que existen en el array
    // Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
    // Ver media de letras: mostrará el número medio de letras entre todas las palabas
    // Ver palabra con más letras
    // Ver palabra con menos letras



    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int opcion;

        System.out.println("1. ver palabras");
        System.out.println("2. Obtener aleatoria");
        System.out.println("3. Ver numero letras");
        System.out.println("4. Ver numero palabras");
        System.out.println("4. Ver media palabras");
        System.out.println("5. Ver palabra mas grande");
        System.out.println("6. Ver palabra mas pequeña");
        System.out.println("Que tarea quieres realizar");
        opcion = lecturaTeclado.nextInt();
        switch (opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }

}
