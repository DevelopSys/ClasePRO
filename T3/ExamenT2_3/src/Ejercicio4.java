import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica tu nombre y apellido");
        String nombre = scanner.nextLine();
        System.out.println("Que pasta quieres ganar");
        int sueldo = scanner.nextInt();
        System.out.println("Que edad tienes");
        int edad = scanner.nextInt();
        System.out.println("Que dia es tu cumpleaños");
        int cumpleanios = scanner.nextInt();
        System.out.println("Tienes carnet (Si/No)");
        // boolean carnet = scanner.nextBoolean(); // true false
        String carnetST = scanner.next();
        boolean carnetB = carnetST.equalsIgnoreCase("si");

        boolean comprobacion1 = edad<50 && sueldo<40000 && carnetB;
        boolean comprobacion2 = edad>45 && sueldo<20000 && cumpleanios%2==0;
        boolean comprobacionTotal = comprobacion1||comprobacion2;

        System.out.printf("Para el candidato %s, su resulucion es %b\n",nombre,comprobacionTotal);
    }
}
