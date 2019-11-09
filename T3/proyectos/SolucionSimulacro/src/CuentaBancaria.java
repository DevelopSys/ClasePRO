import java.util.Scanner;

public class CuentaBancaria {

    public static void main(String[] args) {

        // opción que se introducirá del menu
        int opcion;
        // saldo inicial que tiene la cuenta
        int saldo = 0;
        // pin de la cuenta
        final int PIN = 1111;
        // pin que se introdice cada vez que se opera
        int pinIntroducido = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("1. Meter dinero");
            System.out.println("2. Sacar dinero");
            System.out.println("3. Mostrar saldo");
            System.out.println("4 Salir");
            System.out.println("Introduce opción");
            opcion = teclado.nextInt();

            // dependiendo de la opción seleccionada se ejecutará un caso u otro
            switch (opcion) {
                case 1:

                    System.out.println("Introduce pin para operar");
                    pinIntroducido = teclado.nextInt();
                    if (pinIntroducido != PIN) {
                        // si el pin introducido es diferente que el pin de la cuenta
                        System.out.println("El pin es incorrecto, lo siento");
                    } else {
                        // si el pin introducido es igual que el pin de la cuenta
                        System.out.println("Cuando dinero quieres meter?");
                        int dineroMeter = teclado.nextInt();
                        saldo += dineroMeter;
                    }
                    break;
                case 2:
                    System.out.println("Introduce pin para operar");
                    pinIntroducido = teclado.nextInt();
                    if (pinIntroducido != PIN) {
                        // si el pin introducido es diferente que el pin de la cuenta
                        System.out.println("El pin es incorrecto, lo siento");
                    } else {
                        // si el pin introducido es igual que el pin de la cuenta
                        System.out.println("Cuando dinero quieres sacar?");
                        int dineroSacar = teclado.nextInt();
                        if (dineroSacar > saldo) {
                            // si el dinero que se intenta sacar es mayor que el saldo disponible no hace la operación
                            System.out.println("La operación te dedjaría en números rojos");
                        } else {
                            // si el dinero que se intenta sacar es menor que el saldo disponible se hace la operación
                            saldo -= dineroSacar;

                        }
                    }
                    break;
                case 3:
                    System.out.println("Introduce pin para operar");
                    pinIntroducido = teclado.nextInt();
                    if (pinIntroducido != PIN) {
                        // si el pin introducido es diferente que el pin de la cuenta
                        System.out.println("El pin es incorrecto, lo siento");
                    } else {
                        // si el pin introducido es igual que el pin de la cuenta se hace la operación
                        System.out.printf("El saldo disponibles es %d %n", saldo);

                    }
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Caso incorrecto");
                    break;
            }
            System.out.println("******** \t Imprimiendo menú nuevamente \t********");
        } while (opcion != 4);


    }
}
