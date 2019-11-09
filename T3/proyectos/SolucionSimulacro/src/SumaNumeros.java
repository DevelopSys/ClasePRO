import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {

        // variables que guardan cuantos numeros (pares, impares, ceros y números se han introducido)
        int contadorNumerosPares = 0, contadorNumerosImpares = 0, contadorCeros = 0, contadorNumeros = 0;
        // acumulador del valor de los pares e imapres
        int acumuladorValorPares = 0, acumuladorValorImpares = 0;
        // variable que guarda la opción seleccionada del menú
        int opcion=0;

        double numeroIntroducido = 1.0;
        Scanner teclado = new Scanner(System.in);

        // mietras el número introducido sea mayor que 0.0 se ejecuta lo que hay dentro del while
        while (numeroIntroducido >= 0.0) {
            // se pide el numero por teclado
            System.out.println("Por favor introduce número");
            numeroIntroducido = teclado.nextDouble();
            // se suma uno al contador de números
            contadorNumeros++;

            if (numeroIntroducido % 2 == 0) {
                // si el numero es par se suma su valor en el acumulador y se suma uno al contador
                acumuladorValorPares += numeroIntroducido;
                contadorNumerosPares++;

                if (numeroIntroducido == 0.0) {
                    //  si además de ser par el numero es 0 se suma uno al contador
                    contadorCeros++;
                }
            } else {
                // si el numero no ha sido par, por defecto el número será impar y se se suma su valor en el acumulador
                // y se suma uno al contador
                acumuladorValorImpares += numeroIntroducido;
                contadorNumerosImpares++;

            }
        }

        // una vez se han introducido todos los números imprimo el menú

        do {
            System.out.println("1. Mostrar valor de pares");
            System.out.println("2. Mostrar media de pares");
            System.out.println("3. Mostrar media de impares");
            System.out.println("4. Mostrar contador de numeros");
            System.out.println("5. Mostrar contador de pares, impares y ceros");
            System.out.println("6. Salir");
            System.out.println("Introduce opción");
            opcion = teclado.nextInt();

            // dependiendo de la opción seleccionada se ejecutará un caso u otro
            switch (opcion) {
                case 1:
                    System.out.printf("El valor de los pares introducidor es %d %n",acumuladorValorPares);
                    break;
                case 2:
                    System.out.printf("La media de los pares introducidor es %.2f %n",(double)acumuladorValorPares/(double) contadorNumerosPares);
                    break;
                case 3:
                    System.out.printf("La media de los impares introducidor es %.2f %n",(double)acumuladorValorImpares/(double) contadorNumerosImpares);
                    break;
                case 4:
                    System.out.printf("La cantididad de numeros introducidor es %d %n",contadorNumeros);
                    break;
                case 5:
                    System.out.printf("La cantididad de numeros pares es es %d %n",contadorNumerosPares);
                    System.out.printf("La cantididad de numeros impares es %d %n",contadorNumerosImpares);
                    System.out.printf("La cantididad de numeros ceris es %d %n",contadorCeros);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

            System.out.println("******** \t Imprimiendo menú nuevamente \t********");
        }while (opcion!=6);


    }
}
