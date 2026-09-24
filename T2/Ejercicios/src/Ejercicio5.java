import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica la cantidad de segundos que quires traducir");
        int segundosTraducir = lector.nextInt();
        int horas = segundosTraducir / 3600;
        int segundosRestantes = segundosTraducir % 3600;
        int minutos = segundosRestantes/60;
        segundosRestantes = segundosRestantes % 60;

        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundo: "+segundosRestantes);

    }
}
