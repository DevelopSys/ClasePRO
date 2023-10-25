import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        int[] numeros = new int[5]; // 0 0 0 0 0
        int[] numerosElementos = new int[]{4,7,1,20};

        numeros[4] = 67; // 0 0 0 0 67
        System.out.println(numeros[4]);

        for (int i = 0 ; i <=numerosElementos.length-1; i++) {
            System.out.println(numerosElementos[i]);
        }

        for (int i = numerosElementos.length-1 ; i >=0; i--) {
            System.out.println(numerosElementos[i]);
        }



        boolean[] aciertos = new boolean[5];
        boolean[] aciertosElementos = new boolean[]{true,false,true,true};

        String[] palabras = new String[7];
        String[] palabrasElementos = new String[]{"hola","adios","que","tal"};

        Object[] arrayCosas = new Object[]{true,"hola",2,'A',new Date()};


    }
}
