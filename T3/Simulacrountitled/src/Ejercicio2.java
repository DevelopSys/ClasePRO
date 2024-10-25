import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // cuantos ss -> incrementador
        int numeroSS = 0;
        int sumaNotas =0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce nota:");
            int nota = scanner.nextInt();
            sumaNotas +=nota;
            if (nota<5){
                numeroSS++;
            }
        }

        System.out.println("El numero de SS es de "+numeroSS);
        // y nota media -> sumario / 20
        System.out.println("La media de las notas es "+(double)sumaNotas/20);
    }
}
