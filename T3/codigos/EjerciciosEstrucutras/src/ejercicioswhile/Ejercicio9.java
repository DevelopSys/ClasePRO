package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        // cambiar letras

        String palabra = "hola"; // hólá
        palabra = palabra.replaceAll("a", "á");
        palabra = palabra.replaceAll("e", "é");
        palabra = palabra.replaceAll("i", "í");
        palabra = palabra.replaceAll("o", "ó");
        palabra = palabra.replaceAll("u", "ú");
        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        // c o r r e o @ g m a i l . c o m
        palabra = palabra.substring(0,palabra.charAt('@'));


        System.out.println(palabra);

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1- pasar a base 2");
            System.out.println("2- pasar a base 8");
            System.out.println("3- pasar a base 16");
            System.out.println("4- calcular minimo comun");
            System.out.println("5- salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Ejercicio9.cambiarBase(2);
                    break;
                case 2:
                    Ejercicio9.cambiarBase(8);
                    break;
                case 3:
                    Ejercicio9.cambiarBase(16);

                    break;
                case 4:
                    break;
            }
        } while (opcion != 5);
    }

    public static void cambiarBase(int base) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que numero quieres pasar a base " + base);
        int numero = scanner.nextInt(); // 32
        String resultadoCambio = "";
        // numero> b-1
        while (numero > base - 1) {
            int resto = numero % base;
            // switch
            String letra = "";
            if (base == 16) {
                switch (resto) {
                    case 10:
                        letra = "A";
                        break;
                    case 11:
                        letra = "B";
                        break;
                    case 12:
                        letra = "C";
                        break;
                    case 13:
                        letra = "D";
                        break;
                    case 14:
                        letra = "E";
                        break;
                    case 15:
                        letra = "F";
                        break;

                }
                if (resto > 9) {
                    resultadoCambio = letra + resultadoCambio;
                } else {
                    resultadoCambio = resto + resultadoCambio;
                }
            }

            if (base == 2 || base == 8) {
                resultadoCambio = resto + resultadoCambio;
            }

            numero = numero / base;
        }
        resultadoCambio = numero + resultadoCambio;
        System.out.println("El resultado de cambiar de base es " + resultadoCambio);

    }


}
