package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
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
                    // JUNTAR LOS TRES CAMBIOS EN UN METODO
                    System.out.println("Que numero quieres pasar a base 2");
                    int numero = scanner.nextInt(); // 32
                    String resultadoCambio = "";
                    while (numero > 1) {
                        int resto = numero % 2;
                        resultadoCambio = resto + resultadoCambio;
                        numero = numero / 2;
                    }
                    resultadoCambio = numero + resultadoCambio;
                    System.out.println("El resultado de cambiar de base es " + resultadoCambio);

                    // calcular base 2;
                    break;
                case 2:
                    System.out.println("Que numero quieres pasar a base 8");
                    numero = scanner.nextInt(); // 32
                    resultadoCambio = "";
                    while (numero > 7) {
                        int resto = numero % 8;
                        resultadoCambio = resto + resultadoCambio;
                        numero = numero / 8;
                    }
                    resultadoCambio = numero + resultadoCambio;
                    System.out.println("El resultado de cambiar de base es " + resultadoCambio);
                    // calcular base 8;
                    break;
                case 3:
                    // calcular base 16;
                    System.out.println("Que numero quieres pasar a base 8");
                    numero = scanner.nextInt(); // 32
                    resultadoCambio = "";
                    while (numero > 15) {
                        int resto = numero % 16;
                        switch (resto) {
                            case 10:
                                break;
                            case 11:
                                break;
                            case 12:
                                break;
                            case 13:
                                break;
                            case 14:
                                break;
                            case 15:
                                break;
                        }
                        resultadoCambio = resto + resultadoCambio;
                        numero = numero / 16;
                    }
                    resultadoCambio = numero + resultadoCambio;
                    System.out.println("El resultado de cambiar de base es " + resultadoCambio);
                    // calcular base 8;
                    break;
                case 4:
                    break;
            }
        } while (opcion != 5);
    }
}
