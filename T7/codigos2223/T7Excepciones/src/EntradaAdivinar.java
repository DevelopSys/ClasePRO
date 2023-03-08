import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaAdivinar {

    public static void main(String[] args) {

        Scanner scanner = null;
        int numeroAleatorio = (int) (Math.random() * 21);
        int numeroIntroducido = -1;
        int numeroIntentos = 0;
        System.out.println(numeroAleatorio);
        do {

            System.out.println("Introduce dato");
            try {
                scanner = new Scanner(System.in);
                numeroIntroducido = scanner.nextInt();

                if (numeroIntroducido<0 || numeroIntroducido>20){
                    throw new NegativeException("El numero es negativo"
                            ,numeroIntroducido);
                }

                numeroIntentos++;

            } catch (InputMismatchException e) {
                System.out.println("Por favor introduce numero");
            } catch (NegativeException e) {
                //System.out.println(e.getMessage());
                e.verNumeroFallo();
            }


        } while (numeroAleatorio != numeroIntroducido);

        numeroIntentos++;
        System.out.println("Has adivinado en " + numeroIntentos);

    }
}
