import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce numero");
        int numeroLeido = lecturaTeclado.nextInt();

        String numeroLetras = String.valueOf(numeroLeido);
        if (numeroLetras.charAt(0)==numeroLetras.charAt(numeroLetras.length()-1)
        && numeroLetras.charAt(1) == numeroLetras.charAt(2)){
            System.out.println("Capicua");
        } else {
            System.out.println("No Capicua");
        }

        /*if (numeroLeido > 999 && numeroLeido < 10000) {
            // si o no capicua
            // 1234
            // 2222
            // 2332

            // cuando numero1 == numero4 y numero2 == numero3
            int numero1 = numeroLeido / 1000;
            int numero2 = (numeroLeido%1000)/100;
            int numero3 = (numeroLeido%100)/10;
            int numero4 = (numeroLeido%10);

            System.out.println(numero1);
            System.out.println(numero2);
            System.out.println(numero3);
            System.out.println(numero4);

            if (numero1 == numero4 && numero2 == numero3){
                System.out.println("Capicúa");
            } else {
                System.out.println("No Capicúa");
            }


        } else {
            System.out.println("El numero no tiene 4 digitos");
        }*/
    }
}
