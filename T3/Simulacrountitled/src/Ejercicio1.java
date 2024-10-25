import java.util.Scanner;

public class Ejercicio1 {

    /*
     ealizar un programa que permita números mayores o iguales
     a cero por teclado hasta que se introduzca un número
     negativo y nos visualice el siguiente menú:
    1-Suma de los números pares introducidos. -> acumulador
    2-Media de los números pares introducidos con dos decimales. -> acumulador / incrementados
    3-Media de los números impares introducidos con dos decimales. -> acumulador / incrementados
    4-Cuántos números hemos introducido. incrementador
    5-Cuantos números de los introducidos han sido ceros, cuántos han sido pares y cuantos impares. incrementador
    6.-Salir.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // introduce numero hasta que se meta un negativo
        int numero = 0;
        int acumuladorPares = 0, acumuladorImpares = 0;
        int incrementadorPares = 0, incrementadorImpares = 0, incrementadorCeros=0;

        while (numero > -1) {
            System.out.println("Introduce numero");
            numero = scanner.nextInt();
            if (numero > -1) {
                if (numero % 2 == 0) {
                    acumuladorPares += numero;
                    incrementadorPares++;
                }else {
                    acumuladorImpares += numero;
                    incrementadorImpares++;
                }
                if (numero==0){
                    incrementadorCeros++;
                }
            }
        }
        int opcion;
        do {
            System.out.println("1. Suma de pares");
            System.out.println("2. Pares media");
            System.out.println("3. Impares media");
            System.out.println("4. Numero numeros");
            System.out.println("5. Numeros detalle");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los pares es "+acumuladorPares);
                    break;
                case 2:
                    System.out.println("La media de los pares es "+(double)acumuladorPares/incrementadorPares);
                    break;
                case 3:
                    System.out.println("La media de los impares es "+(double)acumuladorImpares/incrementadorImpares);
                    break;
                case 4:
                    System.out.println("El numero de numeros introducidos es de "+(acumuladorPares+acumuladorImpares));
                    break;
                case 5:
                    System.out.println("El numero de pares es "+incrementadorPares);
                    System.out.println("El numero de impares es "+incrementadorImpares);
                    System.out.println("El numero de ceros es "+incrementadorCeros);
                    break;
                case 6:
                    System.out.println("Saliendo.....");
                    break;
                default:
                    System.out.println("No es valida, intenta de nuevo");
            }
        } while (opcion != 6);
    }

}
