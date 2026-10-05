import java.util.Scanner;

public class EntradaCalculadora {

    // Realiza un programa que permita el funcionamiento de una calculadora
    // para ello el sistema pedirá al usuario dos operandos
    // una vez introducidos los operandos el sistema mostrara un menu al usuario
    // 1. Sumar
    // 2. Restar
    // 3. Multiplicar
    // 4. Dividir
    // 5. Modular
    // una vez el usuario indique cual es la operacion que quiere realizar el sistemas
    // la realizará y mostrará un mensaje con el resultado
    // casos especiales:
    // en caso de seleccionar la divicion, el el op2 es 0 el sistema pedirá nuevamente
    // otro operando (si no lo hace dara error)

    // en caso de tener una disivicion con decimales el sistema pereguntará si:
    // quieres la division entera o la divicion decimal


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer operando");
        int operando1 = lector.nextInt();
        System.out.println("Introduce el segundo operando");
        int operando2 = lector.nextInt();
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Modular");
        System.out.println("Que quieres hacer");
        int opcion = lector.nextInt();
        boolean condicionDecimales = false;
        double resultado = 0.0;
        switch (opcion) {
            case 1 -> {
                System.out.println("Vas a sumar");
                resultado = operando1 + operando2;
            }
            case 2 -> {
                System.out.println("Vas a restar");
                resultado = operando1 - operando2;
            }
            case 3 -> {
                System.out.println("Vas a multi");
                resultado = operando1 * operando2;
            }
            case 4 -> {
                System.out.println("Vas a dividir");
                // si el 2º op es 0
                if (operando2 == 0) {
                    System.out.println("El operando 2 no puede ser 0, indica un nuevo valor");
                    operando2 = lector.nextInt();
                }
                // 4 / 3
                if (operando1 % operando2 != 0) {
                    System.out.println("Queres decimales");
                    condicionDecimales = lector.nextBoolean();
                    if (condicionDecimales) {
                        resultado = (double) operando1 / operando2;
                    } else {
                        resultado = operando1 / operando2;
                    }
                } else {
                    resultado = operando1 / operando2;
                }
            }
            case 5 -> {
                System.out.println("Vas a modular");
                resultado = operando1 % operando2;
            }
            default -> {
                System.out.println("Caso no valido");
            }
        }

        if (!condicionDecimales) {
            System.out.println("El resutaldo de la operacion es " + (int) resultado);
        } else {
            System.out.println("El resutaldo de la operacion es " + resultado);
        }

        lector.close();
    }
}
