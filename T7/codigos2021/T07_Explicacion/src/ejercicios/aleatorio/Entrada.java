package ejercicios.aleatorio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int intentos = 0;
        int numero=0;
        int aleatorio = (int) (Math.random() * 21);
        System.out.println(aleatorio);

        do {

            try {
                System.out.println("Introduce número");
                numero = teclado.nextInt();
                if (numero<0 || numero>100){
                    throw new NegativoException("Error en el elemento");
                }
                intentos++;
                System.out.println(numero);
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("Ejecutada la exception de tipo");
                teclado.next();

            } catch (NegativoException e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Por favor introduce un positivo");
            }

        } while (numero!=aleatorio);
    }
}
