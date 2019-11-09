import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        // número de notas que se deben introducir
        int contadorNotas=20;
        //  acumulador de los valores de las notas introducidas
        int valorNotas=0;
        // nota introducida
        int notaIntroducida;
        // acumulador de los valores de las notas que se introducen
        int acumuladorValoresNotas=0;
        // contador del número de suspensos
        int contadorSuspensos = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i =0;i<contadorNotas;i++){
            System.out.println("Por favor introduce una nota");
            notaIntroducida = teclado.nextInt();

            // el valor de la nota se suma al acumulador de valores
            acumuladorValoresNotas += notaIntroducida;

            // si es suspensa se suma uno al contador
            if (notaIntroducida<5){
                contadorSuspensos++;
            }
        }

        System.out.printf("La media de todas las notas introducidas es %.2f %n",(double)acumuladorValoresNotas/(double)contadorNotas);
        System.out.printf("El número de suspensos es de %d %n", contadorSuspensos);
    }
}
