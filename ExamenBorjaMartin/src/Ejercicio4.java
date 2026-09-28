import java.util.Objects;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica nombre y apellidos");
        String nombreApellidos = lector.nextLine();
        System.out.println("Que sueldo quieres percibir");
        int sueldo = lector.nextInt();
        System.out.println("Que edad tienes");
        int edad = lector.nextInt();
        System.out.println("Que dia cumples los años");
        int diaCumple = lector.nextInt();
        System.out.println("Conduces (si/no");
        //boolean conducir = lector.hasNextBoolean();
        lector = new Scanner(System.in);
        String conducir = lector.nextLine();
        boolean valido = (edad < 50 && sueldo < 40000 && conducir.equals("si"))
                || (edad > 45 && sueldo < 20000 && diaCumple % 2 == 0);
        System.out.printf("Con los datos introducidos el candidato %s tiene como resolucion %b",
                nombreApellidos, valido);
        lector.close();
    }
}
