import model.Carrera;
import model.CarreraCoches;
import model.Coche;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Coche cocheA = new Coche();
        Coche cocheB = new Coche("Ford", "Focus", 70);
        Carrera monza = new Carrera(10000, cocheA, cocheB);
        // Carrera jarama = new Carrera(3000, cocheA, cocheB);
        monza.iniciarCarrera();
        */
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        CarreraCoches monza = new CarreraCoches(7000);

        do {
            System.out.println("1. Inscribir participante");
            System.out.println("2. Iniciar carrera");
            System.out.println("3. Mostrar clasificacion");
            System.out.println("4. Repartir puntos");
            System.out.println("5. Salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Indica marca");
                    String marca = scanner.next();
                    System.out.println("Indica modelo");
                    String modelo = scanner.next();
                    System.out.println("Indica matricula");
                    String matricula = scanner.next();
                    System.out.println("Indica cv");
                    int cv = scanner.nextInt();
                    monza.inscribirParticipante(new Coche(marca, modelo, matricula, cv));
                }
            }
        } while (opcion != 5);

    }
}
