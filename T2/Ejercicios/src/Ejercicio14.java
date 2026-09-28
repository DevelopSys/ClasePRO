import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica tu edad");
        int edad = lector.nextInt();
        System.out.println("Indica tu nivel de estudios");
        int estudios = lector.nextInt();
        System.out.println("Indica tus ingresos");
        int ingresos = lector.nextInt();
        boolean comprobacion = edad>40 && estudios >=5 && estudios<=8 && ingresos<15000;
        System.out.println("La comprobacion es "+comprobacion);
        lector.close();
    }
}
