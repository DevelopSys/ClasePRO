import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que cafe quieres tomar");
        String tipoCafe = scanner.next();
        System.out.println("Cuanta azucar quieres");
        int numeroAzucar = scanner.nextInt();
        System.out.println("Que tamaño quieres");
        String tamanio = scanner.next();
        System.out.printf("Marchando un %s, con %d cucharitas de azucar, en un tamaño de %s\n",
                tipoCafe, numeroAzucar, tamanio);
        System.out.println("Marchando un " + tipoCafe + " con " + numeroAzucar +
                " cucharitas de azucar, en un tamaño de " + tamanio);
    }
}
