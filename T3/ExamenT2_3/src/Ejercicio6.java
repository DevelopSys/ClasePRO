import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("En que mes estas");
        int mes = scanner.nextInt();
        String estacion= "";
        switch (mes){
            case 1:
            case 2:
            case 3:
                estacion = "Invierno";
                break;
        }

        System.out.println("Estas en "+estacion);

        /*
        case 1,2,3->{
                estacion = "Otoño";
            }
            case 4,5,6->{
                estacion = "Primavera";
            }
            case 7,8,9->{
                estacion = "Verano";
            }
            case 10,11,12->{
                estacion = "Invierno";
            }
         */

    }
}
