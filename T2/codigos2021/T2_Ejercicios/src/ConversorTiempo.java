import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ConversorTiempo {


    public static void main(String[] args) {
        // pido teclado segundos
        // horas, minutos, segundos
        Scanner teclado = new Scanner(System.in);
        int segundos, horas, minutos;
        // 1 hora --> 3600
        // 1 minuto --> 60

        //
        System.out.println("Introduce los segundos a convertir");
        segundos = teclado.nextInt();

        //3700 -- horas = 1 y sobra algo
        horas = segundos /3600;
        // lo que ha sobrado de las horas
        // segundos = el resto de dividir 3700 / 3600 --> 100
        segundos = segundos%3600;

        // 100 / 60 --> 1 y sobra algo
        minutos = segundos /60;
        // lo que ha sobrado de los minutos

        // segundos = 40
        segundos = segundos%60;

        System.out.printf("Los segundos traducidos son: %dhoras %dminutos %dsegundos %n",
                horas,minutos,segundos);









    }
}
