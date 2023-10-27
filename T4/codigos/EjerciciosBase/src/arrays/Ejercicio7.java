package arrays;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[10];
        int opcion = 0;
        do {

            System.out.println("1. Rellena");
            System.out.println("2. Aleatoria");
            System.out.println("3. Letras");
            System.out.println("4. Media letras");
            System.out.println("5. Palabra grande");
            System.out.println("6. Palabra pequeña");
            System.out.println("7. Salir");
            System.out.println("Introduce opcion:");
            opcion = scanner.nextInt();
            int numeroLetras=0;
            switch (opcion) {
                case 1:
                    for (int i = 0; i < palabras.length; i++) {
                        System.out.println("Introduce palabra");
                        palabras[i] = scanner.next();
                    }
                    break;
                case 2:
                    int posicionAleatoria = (int) (Math.random() * 10);
                    System.out.println("La palabra aleatoria es " + palabras[posicionAleatoria]);
                    break;
                case 3:
                    // salte un aviso si no hay palabras introducidas
                    if (palabras[0]==null){
                        System.out.println("No hay palabras ");
                    } else {
                        for ( String item: palabras ) {
                            numeroLetras += item.length();
                        }
                        System.out.println("El numero de letras es "+numeroLetras);
                    }
                    break;
                case 4:
                    if(numeroLetras==0){
                        System.out.println("no se han metido palabras");
                    } else {
                        System.out.println("La media es: "+(double)numeroLetras/palabras.length);
                    }
                    break;
                case 5:
                    // palabra más grande
                    String palabraGrande = palabras[0];

                    for (String item: palabras) {
                        if (item.length()>palabraGrande.length()){
                            palabraGrande = item;
                        }
                    }
                    break;
                case 6:
                    String palabraPequenia = palabras[0];

                    for (String item: palabras) {
                        if (item.length()<palabraPequenia.length()){
                            palabraPequenia = item;
                        }
                    }
                    break;
            }


        } while (opcion != 7);




        /*for (String item : palabras) {
            System.out.println(item);
        }*/




    }
}
