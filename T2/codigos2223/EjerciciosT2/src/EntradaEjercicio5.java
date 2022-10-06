import java.util.Scanner;

public class EntradaEjercicio5 {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Cuantos segundos quieres leer");
        int segundos = lecturaTeclado.nextInt();
        int horas = segundos / 3600;
        // los segundo restantes que no entran en la hora calculada
        segundos = segundos % 3600;
        int minutos = segundos / 60;
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        segundos = segundos % 60;
        System.out.println("Segundos: " + segundos);


        lecturaTeclado.next().charAt(0);

    }

}
